package its340project;
import java.sql.*;
import java.util.*;

public class DBUtils {
    
    public static String getConnString()
    {
        String connString = "jdbc:mysql://54.163.48.244:3306/340project?autoreconnect=true&useSSL=false";
        return connString;
    }
    
    public static Patient getPatientDemo(int id, String connString)
    {
        String getPatientDemo = "{CALL getPatientDemo(" + id + ")";
        
        try 
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL getPatientDemo(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
            
            while(rs.next())
            {
                Patient p = new Patient(rs.getInt("PatientID"),rs.getString("PtLastName"),rs.getString("PtPreviousLastName"),rs.getString("PtFirstName"),
                rs.getString("HomeAddress1"),rs.getString("HomeCity"),rs.getString("HomeStateProvinceRegion"),rs.getString("HomeZip"),rs.getString("Country"),
                rs.getString("Citizenship"),rs.getString("PtHomePhone"),rs.getString("EmergencyPhoneNumber"),rs.getString("EmailAddress"),rs.getString("PtSSN"),
                rs.getDate("DOB"),rs.getString("Gender"),rs.getString("EthnicAssociation"),rs.getString("MaritalStatus"),rs.getString("CurrentPrimaryHCP"),
                rs.getString("Comments"),rs.getString("NextOfKin"),rs.getString("NextOfKinRelationshipToPatient"));
                
                return p;
            }
        }
        catch (Exception e)
        {
            System.out.println("Database Error: " + e);
        }
        
        return null;
    }
    
    public static void savePatientDemo(Patient patient, String connString)
    {
        try
        {
            String savePatientDemo = "{CALL savePatientDemo(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement stmt = dbInfo.prepareCall(savePatientDemo);

            stmt.setInt(1, patient.getPatientID());
            stmt.setString(2, patient.getPtLastName());
            stmt.setString(3, patient.getPtPreviousLastName());
            stmt.setString(4, patient.getPtFirstName());
            stmt.setString(5, patient.getHomeAddress1());
            stmt.setString(6, patient.getHomeCity());
            stmt.setString(7, patient.getHomeStateProvinceRegion());
            stmt.setString(8, patient.getHomeZip());
            stmt.setString(9, patient.getCountry());
            stmt.setString(10, patient.getCitizenship());
            stmt.setString(11, patient.getPtMobilePhone());
            stmt.setString(12, patient.getEmergencyPhoneNumber());
            stmt.setString(13, patient.getEmailAddress());
            stmt.setString(14, patient.getPtSSN());
            stmt.setDate(15, new java.sql.Date(patient.getDOB().getTime()));
            stmt.setString(16, patient.getGender());
            stmt.setString(17, patient.getEthnicAssociation());
            stmt.setString(18, patient.getMaritalStatus());
            stmt.setString(19, patient.getCurrentPrimaryHCP());
            stmt.setString(20, patient.getComments());
            stmt.setString(21, patient.getNextOfKin());
            stmt.setString(22, patient.getNextOfKinRelationshipToPatient());

            stmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("Database Error: " + e);
        }

    }
    
    public static void deletePatientDemo(int id, String connString)
    {
        try
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL deletePatientDemo(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println("DB Error While Deleting: " + e);
        }
    }
    
    public static List getFamNames(int id, String connString)
    {
        List<String> names = new ArrayList<>();
        
        try
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL getFamNames(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
            
            while(rs.next())
            {
                names.add(rs.getString("Name"));
            }
            return names;
        }
        catch(Exception e)
        {
            System.out.println("DB Error While Getting Names: " + e);
        }
        
        return null;
    }
    
    public static Patient getFamilyHist(int id, String name, String connString)
    {
        try 
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL getFamilyHist(?, ?)}");
            storedProc.setInt(1, id);
            storedProc.setString(2, name);
            ResultSet rs = storedProc.executeQuery();
            
            while(rs.next())
            {
                Patient p = new Patient(rs.getInt("PatientID"), rs.getInt("FamilyID"), rs.getString("Name"), rs.getString("Relation"), rs.getBoolean("Alive"), 
                rs.getBoolean("LivesWithPatient"), rs.getString("MajorDisorder"), rs.getString("SpecificTypeDisorder"), rs.getBoolean("DisorderHRF"));
                
                return p;
            }
        }
        catch(Exception e)
        {
            System.out.println("DB Error While Getting Family Record: " + e);
        }
        return null;
    }
    
    public static void saveFamHist(Patient patient, String connString)
    {
        try
        {
            String saveFamHist = "{CALL saveFamHist(? ,? ,? ,? ,? ,? ,? ,? ,?)}";
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement stmt = dbInfo.prepareCall(saveFamHist);
            
            stmt.setInt(1, patient.getFamilyID());
            stmt.setInt(2, patient.getPatientID());
            stmt.setString(3, patient.getName());
            stmt.setString(4, patient.getRelation());
            stmt.setBoolean(5, patient.getAlive());
            stmt.setBoolean(6, patient.getLivesWithPatient());
            stmt.setString(7, patient.getMajorDisorder());
            stmt.setString(8, patient.getSpecificTypeDisorder());
            stmt.setBoolean(9, patient.getDisorderHRF());
            
            stmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("DB Error While Saving Family Record: " + e);
        }
    }
    
    public static void deleteFamHist(int id, String connString)
    {
        try
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL deleteFamHist(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println("DB Error While Deleting: " + e);
        }
    }
    
    public static Patient getGenMed(int id, String connString)
    {
        String getGenMed = "{CALL getGenMed(" + id + ")";
        
        try
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL getGenMed(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
            
            while(rs.next())
            {
                Patient p = new Patient(rs.getInt("PatientID"), rs.getInt("GeneralMedicalHistoryID"), rs.getString("Tobacco"), rs.getString("TobaccoQuantity"), rs.getString("Tobaccoduraton"), rs.getString("Alcohol"), rs.getString("AlcoholQuantity"), rs.getString("Alcoholduration"), rs.getString("Drug"), rs.getString("DrugType"), rs.getString("Drugduration"), rs.getString("BloodType"), rs.getString("Rh"));
                
                return p;
            }
        }
        catch(Exception e)
        {
            System.out.println("Database Error: " + e);
        }
        
        return null;
    }
    
    public static void saveGenMed(Patient patient, String connString)
    {
        try
        {
            String saveGenMed = "{CALL saveGenMed(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement stmt = dbInfo.prepareCall(saveGenMed);
            
            stmt.setInt(1, patient.getPatientID());
            stmt.setInt(2, patient.getGeneralMedicalHistoryID());
            stmt.setString(3, patient.getTobacco());
            stmt.setString(4, patient.getTobaccoQuantity());
            stmt.setString(5, patient.getTobaccoduraton());
            stmt.setString(6, patient.getAlcohol());
            stmt.setString(7, patient.getAlcoholQuantity());
            stmt.setString(8, patient.getAlcoholduration());
            stmt.setString(9, patient.getDrug());
            stmt.setString(10, patient.getDrugType());
            stmt.setString(11, patient.getDrugduration());
            stmt.setString(12, patient.getBloodType());
            stmt.setString(13, patient.getRh());
            
            stmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("Database Error: " + e);
        }
    }
    
    
    public static void deleteGenMed(int id, String connString)
    {
        try
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL deleteGenMed(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
        }
        catch (Exception e)
        {
            System.out.println("DB Error While Deleting: " + e);
        }
    }
    
    public static void saveAllergy(Patient patient, String connString)
    {
        try {
            String saveAllergy = "{CALL saveAllergy(?, ?, ?, ?, ?, ?)}";
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement stmt = dbInfo.prepareCall(saveAllergy);

            stmt.setInt(1, patient.getAllergyID());
            stmt.setInt(2, patient.getPatientID());
            stmt.setString(3, patient.getAllergen());
            stmt.setString(4, patient.getAllergyStartDate());
            stmt.setString(5, patient.getAllergyEndDate());
            stmt.setString(6, patient.getAllergyDescription());

            stmt.executeUpdate();
            
            System.out.println("Successfully saved? Probably should check");
        } 
        catch(Exception e) 
        {
            System.out.println("Database Error: " + e);
        }

    }
    
    public static Patient getAllergy(int id, String name, String connString)
    {
        String getAllergy = "{CALL getAllergyHistory(" + id + ")";
        try
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL getAllergyHistory(?, ?)}");
            storedProc.setInt(1, id);
            storedProc.setString(2, name);
            ResultSet rs = storedProc.executeQuery();
            
            
            while(rs.next())
            {
                Patient p = new Patient(rs.getInt("PatientID"), rs.getInt("AllergyID"), rs.getString("Allergen"), rs.getString("AllergyStartDate"), 
                                     rs.getString("AllergyEndDate"), rs.getString("AllergyDescription"));
                return p;
            }
        }
        catch (Exception e)
        {
            System.out.println("DB Error While Getting Allergy Record: " + e);
        }
        return null;
    }
    
    
    public static List getAllergyNames(int id, String connString)
    {
        List<String> names = new ArrayList<>();
    
        try 
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL getAllergen(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
        
            while (rs.next()) 
            {
                names.add(rs.getString("Allergen"));
            }
            return names;
        } 
        catch(Exception e) 
        {
            System.out.println("DB Error While Getting Allergy Names: " + e);
        }
    
        return null;
    }
    
    public static void deleteAllergy(int id, String connString)
    {
        try
        {
            Connection dbInfo = DriverManager.getConnection(connString, "programUser", "6wc7#bjx^%LWDkym8vG");
            CallableStatement storedProc = dbInfo.prepareCall("{CALL deleteAllergy(?)}");
            storedProc.setInt(1, id);
            ResultSet rs = storedProc.executeQuery();
        }
        catch (Exception e)
        {
            System.out.println("DB Error While Deleting: " + e);
        }
    }
}
