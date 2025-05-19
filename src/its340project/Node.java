package its340project;
import java.util.*;

public class Node {
    public int nodeID;
    public String question;
    public Node yesBranch;
    public Node noBranch;
    public List<String> interviewList;
    public List<String> questionsList;
    
    public Node(int newNodeID, String question)
    {
        this.nodeID = newNodeID;
        this.question = question;
        this.yesBranch = null;
        this.noBranch = null;
        this.interviewList = null;
        this.questionsList = null;
    }
    
    public Node()
    {
        this.interviewList = new ArrayList<>();
        this.questionsList = new ArrayList<>();
    }
    
    public void displayNode()
    {
        System.out.println("NodeID = " + nodeID + ", " + question);
    }
    
    public void addAnswer(String answer)
    {
        interviewList.add(answer);
    }
    
    public void addQuestion(String question)
    {
        questionsList.add(question);
    }
    
    public void displayQuestions()
    {
        for(String item: questionsList)
        {
            System.out.println(item);
        }
    }
    
    
    public List<String> getAnswerList()
    {
        return this.interviewList;
    }
    
    public List<String> getQuestionList()
    {
        return this.questionsList;
    }
}
