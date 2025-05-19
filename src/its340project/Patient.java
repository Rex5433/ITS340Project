package its340project;
import java.util.Date;

public class Patient {
    //This could have been so simple with how C# does objects but noooo Java is insistent on having variable declaration, get, and set methods all
    //be seperate which makes this file 3x longer than it needs to be
    private int PatientID;
    private String PtLastName;
    private String PtPreviousLastName;
    private String PtFirstName;
    private String HomeAddress1;
    private String HomeCity;
    private String HomeStateProvinceRegion;
    private String HomeZip;
    private String Country;
    private String Citizenship;
    private String PtMobilePhone;
    private String EmergencyPhoneNumber;
    private String EmailAddress;
    private String PtSSN;
    private Date DOB;
    private String Gender;
    private String EthnicAssociation;
    private String MaritalStatus;
    private String CurrentPrimaryHCP;
    private String Comments;
    private String NextOfKin;
    private String NextOfKinRelationshipToPatient;
    //Family History
    private int FamilyID;
    private String Name;
    private String Relation;
    private boolean Alive;
    private boolean LivesWithPatient;
    private String MajorDisorder;
    private String SpecificTypeDisorder;
    private boolean DisorderHRF;
    //General Medical History
    private int GeneralMedicalHistoryID;
    private String Tobacco;
    private String TobaccoQuantity;
    private String Tobaccoduraton;
    private String Alcohol;
    private String AlcoholQuantity;
    private String Alcoholduration;
    private String Drug;
    private String DrugType;
    private String Drugduration;
    private String BloodType;
    private String Rh;
    //Allergy History
    private int AllergyID;
    private String Allergen;
    private String AllergyStartDate;
    private String AllergyEndDate;
    private String AllergyDescription;


    
    public Patient()
    {
        
    }
    
    public Patient(int PatientID)
    {
        this.PatientID = PatientID;
    }
   //Patient Demographics Constructor
    public Patient(int PatientID, String PtLastName, String PtPreviousLastName, String PtFirstName, String HomeAddress1, 
            String HomeCity, String HomeStateProvinceRegion, String HomeZip, String Country, String Citizenship, String PtMobilePhone, 
            String EmergencyPhoneNumber, String EmailAddress, String PtSSN, Date DOB, String Gender, String EthnicAssociation, 
            String MaritalStatus, String CurrentPrimaryHCP, String Comments, String NextOfKin, String NextOfKinRelationshipToPatient) 
    {
        this.PatientID = PatientID;
        this.PtLastName = PtLastName;
        this.PtPreviousLastName = PtPreviousLastName;
        this.PtFirstName = PtFirstName;
        this.HomeAddress1 = HomeAddress1;
        this.HomeCity = HomeCity;
        this.HomeStateProvinceRegion = HomeStateProvinceRegion;
        this.HomeZip = HomeZip;
        this.Country = Country;
        this.Citizenship = Citizenship;
        this.PtMobilePhone = PtMobilePhone;
        this.EmergencyPhoneNumber = EmergencyPhoneNumber;
        this.EmailAddress = EmailAddress;
        this.PtSSN = PtSSN;
        this.DOB = DOB;
        this.Gender = Gender;
        this.EthnicAssociation = EthnicAssociation;
        this.MaritalStatus = MaritalStatus;
        this.CurrentPrimaryHCP = CurrentPrimaryHCP;
        this.Comments = Comments;
        this.NextOfKin = NextOfKin;
        this.NextOfKinRelationshipToPatient = NextOfKinRelationshipToPatient;
}
    //Family History Constructor
    public Patient(int PatientID, int FamilyID, String Name, String Relation, boolean Alive, boolean LivesWithPatient, 
            String MajorDisorder, String SpecificTypeDisorder, boolean DisorderHRF) 
    {
        this.PatientID = PatientID;
        this.FamilyID = FamilyID;
        this.Name = Name;
        this.Relation = Relation;
        this.Alive = Alive;
        this.LivesWithPatient = LivesWithPatient;
        this.MajorDisorder = MajorDisorder;
        this.SpecificTypeDisorder = SpecificTypeDisorder;
        this.DisorderHRF = DisorderHRF;
    }
    
    public Patient(int PatientID, int GeneralMedicalHistoryID, String Tobacco, String TobaccoQuantity, String Tobaccoduraton, String Alcohol, String AlcoholQuantity,
    String Alcoholduration, String Drug, String DrugType, String Drugduration, String BloodType, String Rh) 
    {
        this.PatientID = PatientID;
        this.GeneralMedicalHistoryID = GeneralMedicalHistoryID;
        this.Tobacco = Tobacco;
        this.TobaccoQuantity = TobaccoQuantity;
        this.Tobaccoduraton = Tobaccoduraton;
        this.Alcohol = Alcohol;
        this.AlcoholQuantity = AlcoholQuantity;
        this.Alcoholduration = Alcoholduration;
        this.Drug = Drug;
        this.DrugType = DrugType;
        this.Drugduration = Drugduration;
        this.BloodType = BloodType;
        this.Rh = Rh;
    }

    public Patient(int PatientID, int AllergyID, String Allergen, String AllergyStartDate, String AllergyEndDate, String AllergyDescription) 
    {
        this.PatientID = PatientID;
        this.AllergyID = AllergyID;
        this.Allergen = Allergen;
        this.AllergyStartDate = AllergyStartDate;
        this.AllergyEndDate = AllergyEndDate;
        this.AllergyDescription = AllergyDescription;
    }

    
    public int getPatientID() 
    {
        return this.PatientID;
    }

    public String getPtLastName() 
    {
        return this.PtLastName;
    }

    public String getPtPreviousLastName() 
    {
        return this.PtPreviousLastName;
    }

    public String getPtFirstName() 
    {
        return this.PtFirstName;
    }

    public String getHomeAddress1() 
    {
        return this.HomeAddress1;
    }

    public String getHomeCity() 
    {
        return this.HomeCity;
    }

    public String getHomeStateProvinceRegion() 
    {
        return this.HomeStateProvinceRegion;
    }

    public String getHomeZip() 
    {
        return this.HomeZip;
    }

    public String getCountry() 
    {
        return this.Country;
    }

    public String getCitizenship() 
    {
        return this.Citizenship;
    }

    public String getPtMobilePhone() 
    {
        return this.PtMobilePhone;
    }

    public String getEmergencyPhoneNumber() 
    {
        return this.EmergencyPhoneNumber;
    }

    public String getEmailAddress() 
    {
        return this.EmailAddress;
    }

    public String getPtSSN() 
    {
        return this.PtSSN;
    }

    public Date getDOB() 
    {
        return this.DOB;
    }

    public String getGender() 
    {
        return this.Gender;
    }

    public String getEthnicAssociation() 
    {
        return this.EthnicAssociation;
    }

    public String getMaritalStatus() 
    {
        return this.MaritalStatus;
    }

    public String getCurrentPrimaryHCP() 
    {
        return this.CurrentPrimaryHCP;
    }

    public String getComments() 
    {
        return this.Comments;
    }

    public String getNextOfKin() 
    {
        return this.NextOfKin;
    }

    public String getNextOfKinRelationshipToPatient() 
    {
        return this.NextOfKinRelationshipToPatient;
    }
    
    //Family History Get Methods
    public int getFamilyID() {
        return this.FamilyID;
    }

    public String getName() {
        return this.Name;
    }

    public String getRelation() {
        return this.Relation;
    }

    public boolean getAlive() {
        return this.Alive;
    }

    public boolean getLivesWithPatient() {
        return this.LivesWithPatient;
    }

    public String getMajorDisorder() {
        return this.MajorDisorder;
    }

    public String getSpecificTypeDisorder() {
        return this.SpecificTypeDisorder;
    }

    public boolean getDisorderHRF() {
        return this.DisorderHRF;
    }

    
    //General Medical History Get Methods
    public int getGeneralMedicalHistoryID() {
    return GeneralMedicalHistoryID;
    }

    public String getTobacco() {
        return Tobacco;
    }

    public String getTobaccoQuantity() {
        return TobaccoQuantity;
    }

    public String getTobaccoduraton() {
        return Tobaccoduraton;
    }

    public String getAlcohol() {
        return Alcohol;
    }

    public String getAlcoholQuantity() {
        return AlcoholQuantity;
    }

    public String getAlcoholduration() {
        return Alcoholduration;
    }

    public String getDrug() {
        return Drug;
    }

    public String getDrugType() {
        return DrugType;
    }

    public String getDrugduration() {
        return Drugduration;
    }

    public String getBloodType() {
        return BloodType;
    }

    public String getRh() {
        return Rh;
    }

    
    //Allergy History Get Methods
    public int getAllergyID() 
    {
    return AllergyID;
    }

    public String getAllergen() 
    {
        return Allergen;
    }

    public String getAllergyStartDate() 
    {
        return AllergyStartDate;
    }

    public String getAllergyEndDate() 
    {
        return AllergyEndDate;
    }

    public String getAllergyDescription() 
    {
        return AllergyDescription;
    }

    
    
    // Set Methods
    public void setPatientID(int PatientID)
    {
        this.PatientID = PatientID;
    }

}
