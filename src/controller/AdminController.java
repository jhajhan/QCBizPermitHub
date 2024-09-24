package controller;

/**
 *
 * @author Jhanna
 */

import app.DataBaseConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminController extends DataBaseConnection {
    
    public boolean updateStatus (Long regNum, String status) {      // Update status
        String query = "UPDATE business_info SET Status = ? WHERE RegistrationNum = ?";
        
        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, status);
            prep.setLong(2, regNum);
            
            return prep.executeUpdate() != 0;
            
        } catch (Exception e) {
            e.getMessage();
        }
        
        return false;
    }
    
    public boolean deleteRecord (Long regNum) { //Delete record
        String query = "DELETE FROM business_info WHERE RegistrationNum = ?";
        
        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setLong(1, regNum);
            
            return prep.executeUpdate() != 0;
        } catch (Exception e) {
            e.getMessage();
        }
        
        return false;
    }

    public boolean deleteAccount (int accID) {
        String query = "DELETE FROM account WHERE AccountID = ?";
        
        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setInt(1, accID);
            
            return prep.executeUpdate() != 0;
        } catch (Exception e) {
            e.getMessage();
        }
        
        return false;
    }
    
    public ArrayList<String[]> readRecord () {   // difficult - JOIN tables account, business_info, business_permit
       
        ArrayList<String[]> rows = new ArrayList<>();  
        String query = "SELECT AccountID, Name, a.RegNum, b.Status, COUNT(PermitNo) \n" + //
                        "FROM account AS a, business_info AS b , business_permit as bp\n" + //
                        "WHERE a.RegNum = b.RegistrationNum AND b.RegistrationNum = bp.RegistrationNumber AND b.status != 'Cancelled'\n" + //
                        "GROUP BY AccountID, Name, a.RegNum, b.Status";
       
        try  {
            connect();
            prep = con.prepareStatement(query);
            result = prep.executeQuery();
            
            
            while (result.next()) {
                String[] row = new String[5];
                row[0] = String.valueOf(result.getInt("AccountID"));
                row[1] = result.getString("Name");
                row[2] = String.valueOf(result.getLong("RegNum"));
                row[3] = result.getString("Status");
                row[4] = String.valueOf(result.getInt("COUNT(PermitNo)"));
                rows.add(row);
            }
          
            return rows;
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                con.close();
                prep.close();
                result.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        
        return null;
    }

    public ArrayList<String[]> readRecordD () {   // difficult join
        ArrayList<String[]> rows = new ArrayList<>();
        String query = "SELECT AccountID, Name, a.RegNum, b.Status, COUNT(PermitNo) \n" + 
                        "FROM account AS a, business_info AS b , business_permit as bp\n" + 
                        "WHERE a.RegNum = b.RegistrationNum AND b.RegistrationNum = bp.RegistrationNumber AND b.Status = 'Cancelled' \n" +
                        "GROUP BY AccountID, Name, a.RegNum, b.Status";
        try {
            connect();
            prep = con.prepareStatement(query);
            result = prep.executeQuery();
            
            
            while (result.next()) {
                String[] row = new String[5];
                row[0] = String.valueOf(result.getInt("AccountID"));
                System.out.println(row[0]);
                row[1] = result.getString("Name");
                row[2] = String.valueOf(result.getLong("RegNum"));
                row[3] = result.getString("Status");
                row[4] = String.valueOf(result.getInt("COUNT(PermitNo)"));

                rows.add(row);
            }
          
            return rows;

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                con.close();
                prep.close();
                result.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        
        return null;
    }

    public ArrayList<String[]> readRecordAcc () {   
        ArrayList<String[]> rows = new ArrayList<>();
        String query = "SELECT AccountID, Status FROM account WHERE Status = 1 ORDER BY Name";
        try {
            connect();
            prep = con.prepareStatement(query);
            result = prep.executeQuery();
            
            
            while (result.next()) {
                String[] row = new String[4];
                row[0] = String.valueOf(result.getInt("AccountID"));
                row[1] = result.getString("Status");
                rows.add(row);
            }
          
            return rows;

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                con.close();
                prep.close();
                result.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        
        return null;
    }

    public ArrayList<Integer> countPerStatus() {  // moderate - Column Function - COUNT()

        ArrayList<Integer> counts = new ArrayList<>(); // To store counts for each status
        Map<String, Integer> countMap = new HashMap<>(); // To associate counts with respective status

        String query = "SELECT Status, COUNT(*) AS Count FROM business_info GROUP BY Status";

        try {
            connect();
            state = con.createStatement();
            result = state.executeQuery(query);

            // Initialize the count map with all statuses set to 0
            // Assuming 'statuses' is a list of all possible status values
            List<String> statuses = Arrays.asList("To Be Processed", "Now Processing", "Processed", "Cancelled"); 
            for (String status : statuses) {
                countMap.put(status, 0);
            }

            // Populate the count map with actual counts
            while (result.next()) {
                String status = result.getString("Status");
                int count = result.getInt("Count");
                countMap.put(status, count);
            }

            // Convert map values to ArrayList
            for (String status : statuses) {
                counts.add(countMap.get(status));
            }

            return counts;
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            try {
                con.close();
                state.close();
                result.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }

        return null;
    }

    public ArrayList<Integer> countBusiness() {
        String query = "SELECT BusinessType, COUNT(*) FROM business_info WHERE Status != 'Cancelled' GROUP BY BusinessType";
        ArrayList<Integer> counts = new ArrayList<>(); // To store counts for each status
        Map<String, Integer> countMap = new HashMap<>(); // To associate counts with respective status

        try {
            connect();
            state = con.createStatement();
            result = state.executeQuery(query);

            // Initialize the count map with all statuses set to 0
            // Assuming 'statuses' is a list of all possible status values
            List<String> statuses = Arrays.asList("Sole Proprietorship", "Partnership", "Cooperatives", "Corporation"); 
            for (String status : statuses) {
                countMap.put(status, 0);
            }

            // Populate the count map with actual counts
            while (result.next()) {
                String status = result.getString("BusinessType");
                int count = result.getInt("COUNT(*)");
                countMap.put(status, count);
            }

            // Convert map values to ArrayList
            for (String status : statuses) {
                counts.add(countMap.get(status));
            }

            return counts;

        } catch (Exception e) {
            e.printStackTrace(); 
        } 
        return null;
    }

    public ArrayList<Double> averageCapital () {
        String query = "SELECT BusinessType, AVG(TotalCapitalInvestment) FROM business_info WHERE Status != 'Cancelled' GROUP BY BusinessType";
        ArrayList<Double> counts = new ArrayList<>(); // To store counts for each status
        Map<String, Double> countMap = new HashMap<>(); // To associate counts with respective status

        try {
            connect();
            state = con.createStatement();
            result = state.executeQuery(query);

            // Initialize the count map with all statuses set to 0
            // Assuming 'statuses' is a list of all possible status values
            List<String> statuses = Arrays.asList("Sole Proprietorship", "Partnership", "Cooperatives", "Corporation"); 
            for (String status : statuses) {
                countMap.put(status, 0.0);
            }

            // Populate the count map with actual counts
            while (result.next()) {
                String status = result.getString("BusinessType");
                String formattedNumber = String.format("%.2f", result.getDouble("AVG(TotalCapitalInvestment)"));
                double count = Double.parseDouble(formattedNumber);
                countMap.put(status, count);
            }

            // Convert map values to ArrayList
            for (String status : statuses) {
                counts.add(countMap.get(status));
            }

            return counts;
            
        } catch (Exception e) {
            e.printStackTrace(); 
        } 
        return null;
    }

    public ArrayList<Double> maxCapital () {
        String query = "SELECT BusinessType, MAX(TotalCapitalInvestment) FROM business_info WHERE Status != 'Cancelled' GROUP BY BusinessType";
        ArrayList<Double> counts = new ArrayList<>(); // To store counts for each status
        Map<String, Double> countMap = new HashMap<>(); // To associate counts with respective status
        try {
            connect();
            state = con.createStatement();
            result = state.executeQuery(query);

            // Initialize the count map with all statuses set to 0
            // Assuming 'statuses' is a list of all possible status values
            List<String> statuses = Arrays.asList("Sole Proprietorship", "Partnership", "Cooperatives", "Corporation"); 
            for (String status : statuses) {
                countMap.put(status, 0.0);
            }

            // Populate the count map with actual counts
            while (result.next()) {
                String status = result.getString("BusinessType");
                String formattedNumber = String.format("%.2f", result.getDouble("MAX(TotalCapitalInvestment)"));
                double count = Double.parseDouble(formattedNumber);
                countMap.put(status, count);
            }

            // Convert map values to ArrayList
            for (String status : statuses) {
                counts.add(countMap.get(status));
            }

            return counts;
            
        } catch (Exception e) {
            e.printStackTrace(); 
        } 
        return null;
    }

 
}



