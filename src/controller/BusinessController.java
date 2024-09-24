package controller;

import app.DataBaseConnection;
import model.Account;
import model.BusinessInput;
import model.BusinessLine;
import model.Service;

import java.sql.PreparedStatement;
import java.util.ArrayList;


public class BusinessController extends DataBaseConnection {

    public void insertBusinessInfo(BusinessInput bi) { // Insert record to table business_info

        String query = "INSERT INTO business_info (RegistrationNum, BusinessType, TIN, BusinessName, TradeName, MainOfficeAddress, TeleNo, MobileNo, Email, NameOwnerPresidentOIC, Sex, BusinessArea, TotalFloorArea, TimeOperation, TotalEmployeeEstab, NoEmployeesEstabMale, NoEmployeesEstabFemale, TotalEmployeesQC, NoDeliveryVehiclesVanTruck, NoDeliveryVehiclesMotorcycle, BusinessLocAddress, IsOwned, PropertyIdentityNo, TotalCapitalInvestment, Position) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setLong(1, bi.getRegistrationNum());
            prep.setString(2, bi.getBusinessType());
            prep.setLong(3, bi.getTin());
            prep.setString(4, bi.getBusinessName());
            prep.setString(5, bi.getTradeName());
            prep.setString(6, bi.getMainOfficeAddress());
            prep.setString(7, bi.getTelephoneNum());
            prep.setLong(8, bi.getMobileNum());
            prep.setString(9, bi.getEmail());
            prep.setString(10, bi.getNameOPO());
            prep.setString(11, String.valueOf(bi.getSex()));
            prep.setDouble(12, bi.getBusinessArea());
            prep.setDouble(13, bi.getTotalFloorArea());
            prep.setString(14, bi.getTimeOperation());
            prep.setInt(15, bi.getTotalEmployee());
            prep.setInt(16, bi.getEmployeesMale());
            prep.setInt(17, bi.getEmployeesFemale()); 
            prep.setInt(18, bi.getEmployeesQC());
            prep.setInt(19, bi.getVehVanTruck());
            prep.setInt(20, bi.getVehMotor());
            prep.setString(21, bi.getBusinessLocAddress());
            prep.setBoolean(22, bi.isOwned());
            prep.setInt(23, bi.getPropertyIdentityNum());
            prep.setDouble(24, bi.getCapital()); 
            prep.setString(25, bi.getPosition());

            System.out.println(bi.getNameOPO());
            System.out.println(bi.getBusinessArea());

            if (prep.executeUpdate() != 0) {
                System.out.println("Business info added successfully");
            } else {
                System.out.println("Error adding business info.");
            }
        } catch (Exception e) {
            e.getMessage(); // Improved exception handling
        } finally {
            try {
                con.close();
                prep.close();
                result.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void insertService(Service s) {  // Insert service if not existing yet in table service

        String query = "INSERT INTO service(ServiceName) VALUES(?)";
        
        try {
            connect(); // Connect to the database
            try (PreparedStatement prep = con.prepareStatement(query)) {
                prep.setString(1, s.getServiceName());

                if (prep.executeUpdate() != 0) {
                    System.out.println("Service added!");
                } else {
                    System.out.println("There was an error adding the service.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }


    public int readService (Service s) { //get service id
        String query = "SELECT ServiceID FROM service WHERE ServiceName = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, s.getServiceName());
            result = prep.executeQuery();

            if (result.next()) {
                return result.getInt(1);
            } else {
                System.out.println("Error retrieving service id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return 0;
    }

    public boolean checkService (Service s) { // checks if service name already exists
        String query = "SELECT * FROM service WHERE ServiceName = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, s.getServiceName());
            result = prep.executeQuery();

            if (result.next()) {
                System.out.println("Found service");
                return true;
            } 

        } catch (Exception e) {
            e.printStackTrace();
        } 

        return false;
    }

    public void insertBusinessLine (BusinessLine b) {  // inserts business line that is not present in the table yet
        String query = "INSERT INTO business_line(BusinessLineName) VALUES(?)";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, b.getBusinessLineName());
            int result = prep.executeUpdate();

            if (result != 0) {
                System.out.println("Business line added");
            } else {
                System.out.println("Error adding business line");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public int readBusinessLine (BusinessLine b) { //get existing businesslineID
        String query = "SELECT BusinessLineID FROM business_line WHERE BusinessLineName = ?";

        try {
            connect();
            prep  = con.prepareStatement(query);
            prep.setString(1, b.getBusinessLineName()); 
            result = prep.executeQuery();

            if (result.next()) {
                System.out.println("Found BusinessLine!!!");
                b.setBusinessLineID(result.getInt(1));
                return result.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return 0;
    }

    public boolean checkBusinessLine (BusinessLine b) { //method to check if a businessline already exist on the tabel
        String query = "SELECT * FROM business_line WHERE BusinessLineName = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, b.getBusinessLineName());
            result = prep.executeQuery();

            if (result.next()) {
                System.out.println("Business Line Found!");
                return true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return false;
    }
    
    public void insertBusinessMain(BusinessInput bi) {
        int cnt = 0;
        try {
            connect(); 
            
            // Loop through each business line in the BusinessInput object
            while (cnt < bi.getBusinessLine().size()) {
                
                
                int businessLineID = 0;
                if (checkBusinessLine(bi.getBusinessLine().get(cnt))) {
                    businessLineID = readBusinessLine(bi.getBusinessLine().get(cnt));
                } else {
                    insertBusinessLine(bi.getBusinessLine().get(cnt));  // Insert the business line if it doesn't exist in the database
                    businessLineID = readBusinessLine(bi.getBusinessLine().get(cnt)); // Read the BusinessLineID after insertion or if it already exists
                }
                     
                int serviceID = 0;
                if (checkService(bi.getService().get(cnt))) {
                    serviceID = readService(bi.getService().get(cnt));
                } else {
                    insertService(bi.getService().get(cnt)); // Insert the service associated with the current business line
                    serviceID = readService(bi.getService().get(cnt)); // Read the ServiceID after insertion or if it already exists
                }
                
                int permit = bi.getPermitNo().get(cnt).getPermitNo();
               
                // Prepare the query to insert into business_permit table
                String query = "INSERT INTO business_permit(RegistrationNumber, BusinessLineID, ServiceID, PermitNo) VALUES (?, ?, ?, ?)";
                try (PreparedStatement prep = con.prepareStatement(query)) {
                    prep.setLong(1, bi.getRegistrationNum());
                    prep.setInt(2, businessLineID);
                    prep.setInt(3, serviceID);
                    prep.setInt(4, permit);

                    // Execute the update query
                    int rowsAffected = prep.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Business permit added successfully for RegistrationNum: " + bi.getRegistrationNum());
                    } else {
                        System.out.println("Error adding business permit for RegistrationNum: " + bi.getRegistrationNum());
                    }

                } 
                cnt++; // Increment counter to move to the next business line and service
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for debugging purposes
        } finally {
            try {
                con.close();
                prep.close();
                result.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
        
        public boolean softDelete (Account ac) {  // Set status to cancelled
            String query = "UPDATE business_info SET Status = 'Cancelled' WHERE RegistrationNum = ?";
            
            try {
                connect();
                prep = con.prepareStatement(query);
                prep.setLong(1, ac.getRegNum());
                
                if (prep.executeUpdate()!=0) {
                    return true;
                }
                
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
            
            return false;
    }
    
    public String readStatus(Long regNum) {
        String query = "SELECT Status FROM business_info WHERE RegistrationNum = ?";
        System.out.println(regNum);
        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setLong(1, regNum);
            
            result = prep.executeQuery();
            if (result.next()) {
                return result.getString("Status");
            } else {
                System.out.println("No status found for RegistrationNum: " + regNum);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); 
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

    public ArrayList<String[]> countServicesPerBL (Account ac) { // Difficult 
  
        String query = "SELECT BusinessLineName, COUNT(ServiceID) AS ServiceCount FROM account as a, business_permit as b, business_line as bl WHERE a.RegNum = b.RegistrationNumber AND b.BusinessLineID = bl.BusinessLineID AND AccountID = ? GROUP BY BusinessLineName";
        ArrayList<String[]> rows = new ArrayList<>();

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setInt(1, ac.getAccountID());
            result = prep.executeQuery();

            while(result.next()) {
                String[] row = new String[2];
                row[0] = result.getString("BusinessLineName");
                row[1] = String.valueOf(result.getInt("ServiceCount"));
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

    public void updateBusinessStatus(Account ac) {
        String query = "UPDATE business_info SET Status = 'Cancelled' WHERE RegistrationNum = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setLong(1, ac.getRegNum());

            prep.executeUpdate();
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
    }
}
