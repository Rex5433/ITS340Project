package its340project;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.nio.file.*;
import java.io.*;
import java.time.*;

public class DecisionTree {
    private Node root;
    private Node interviewNode = new Node();
    Scanner sc = new Scanner(System.in);
    
    public DecisionTree()
    {
        root = null;
    }
    
    public void createRoot(int nodeID, String question)
    {
        root = new Node(nodeID, question);
    }
    
    public Node getRoot()
    {
        return root;
    }
    
    public void insertYesNode(int existingNodeID, int newNodeID, String question)
    {
        Node newNode = new Node(newNodeID, question);
        Stack bTreeStack = new Stack();
        
        bTreeStack.push(root);
        
        while(!bTreeStack.isEmpty())
        {
            Node next = (Node)bTreeStack.pop();
            if(existingNodeID == next.nodeID)
            {
                if(next.yesBranch == null)
                {
                    next.yesBranch = newNode;
                    return;
                }
            }
            if(next.yesBranch != null)
            {
                bTreeStack.push(next.yesBranch);
            }
            if(next.noBranch != null)
            {
                bTreeStack.push(next.noBranch);
            }
        }
    }
    
    public void insertNoNode(int existingNodeID, int newNodeID, String question)
    {
        Node newNode = new Node(newNodeID, question);
        
        Stack bTreeStack = new Stack();
        
        bTreeStack.push(root);
        while(!bTreeStack.isEmpty())
        {
            Node next = (Node)bTreeStack.pop();
            if(existingNodeID == next.nodeID)
            {
                if(next.noBranch == null)
                {
                    next.noBranch = newNode;
                    return;
                }
            }
            if(next.noBranch != null)
            {
                bTreeStack.push(next.noBranch);
            }
            if(next.yesBranch != null)
            {
                bTreeStack.push(next.yesBranch);
            }
        }
    }
    
    public void queryTree(Node currentNode)
    {
        if(currentNode.yesBranch == null)
        {
            if(currentNode.noBranch ==null)
            {
                JOptionPane.showInputDialog(currentNode.question);
                return;
            }
        }
        askQuestion(currentNode);
    }
    public void askQuestion(Node currentNode)
    {
        String userEntry;
        if(currentNode.question.contains("Input:"))
        {
            interviewNode.addQuestion(currentNode.question);
            userEntry = JOptionPane.showInputDialog(currentNode.question);
            interviewNode.addAnswer(userEntry);
            queryTree(currentNode.yesBranch);
        }
        else
        {
            interviewNode.addQuestion(currentNode.question);
            String answer = JOptionPane.showInputDialog("Enter Yes or No " + currentNode.question);
            answer = answer.toLowerCase();

            if(answer.equals("yes"))
            {
                if(currentNode.yesBranch != null)
                {
                    queryTree(currentNode.yesBranch);
                }
            }
            else if (answer.equals("no"))
            {
                if(currentNode.noBranch != null)
                {
                    queryTree(currentNode.noBranch);
                }
            }
            else
            {
                System.out.println("Input error: " + "Must answer \"Yes\" or \"No\"");
                askQuestion(currentNode);
            }
        }
    }
    
    public List<String> getAnswers()
    {
        return interviewNode.getAnswerList();
    }
    
    public List<String> getQuestions()
    {
        return interviewNode.getQuestionList();
    }
    
    public String displayQuestions()
    {
        List<String> questions = new ArrayList<>();
        questions = interviewNode.getQuestionList();
        String strQuestions = "";
        for(String question: questions)
        {
            strQuestions += question + "\n";
        }
        return strQuestions;
    }
    
    public String displayAnswers()
    {
        List<String> answers = new ArrayList<>();
        answers = interviewNode.getAnswerList();
        String strAnswers = "";
        for(String answer: answers)
        {
            strAnswers += answer + "\n";
        }
        return strAnswers;
    }
    
    public void logInterview(Patient p, DecisionTree interview)
    {
        LocalDate date = LocalDate.now();
        List<String> answers = new ArrayList<>();
        List<String> questions = new ArrayList<>();
        
        String interviewName;
        
        Path file = Paths.get("./PatientID_" + p.getPatientID() + "_" + date +".txt");
        questions = interview.getQuestions();
        answers = interview.getAnswers();
        
        Patient name = new Patient();
        name = DBUtils.getPatientDemo(p.getPatientID(), DBUtils.getConnString());
        
        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
            String record = "PatientID: " + p.getPatientID() +
                            "\nPatient Name: " + name.getPtFirstName() + " " + name.getPtLastName() +
                            "\nQuestions: " + interview.displayQuestions() +
                            "\nAnswers: " + interview.displayAnswers();
            
            writer.write(record);
            writer.close();
            output.close();
        }
        catch(Exception e)
        {
            System.out.println("Error when writing log file: " + e);
        }
    }
}
