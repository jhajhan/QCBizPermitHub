/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import app.DataBaseConnection;
import model.Account;
import model.BusinessInput;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jhanna
 */


public class AccountController extends DataBaseConnection {
    
    public Account loginAccount (Account ac) {   
            String query = "SELECT * FROM account WHERE Username = ? AND Password = ? AND Status = 0"; // AND Status = 1
            
            try {
                connect();
                prep = con.prepareStatement(query);
                prep.setString(1, ac.getUsername());
                prep.setString(2, ac.getPassword());
                result = prep.executeQuery();
                
                if (result.next()) {
                    ac.setEmail(result.getString("Email"));
                    ac.setUsername(result.getString("Username"));
                    ac.setPassword(result.getString("Password"));
                    ac.setAccountID(result.getInt("AccountID"));
                    ac.setName(result.getString("Name"));
                    ac.setRegNum(result.getLong("RegNum"));
                    ac.setStatus(result.getInt("Status"));
                    return ac;
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
            
            return null;
        } 

    public Account copyAccountInfo (Account ac) {
        String query = "SELECT * FROM account WHERE AccountID = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setInt(1, ac.getAccountID());
            result = prep.executeQuery();

            if (result.next()) {
                ac.setEmail(result.getString("Email"));
                ac.setUsername(result.getString("Username"));
                ac.setPassword(result.getString("Password"));
                ac.setAccountID(result.getInt("AccountID"));
                ac.setName(result.getString("Name"));
                ac.setRegNum(result.getLong("RegNum"));
                ac.setStatus(result.getInt("Status"));

                return ac;
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
        return null;
    } 

    public boolean readAccount(Account ac) {
        String query = "SELECT * FROM account WHERE Username = ?";
    
        try {
            connect(); 
    
            prep = con.prepareStatement(query);
            prep.setString(1, ac.getUsername());
            ResultSet resultSet = prep.executeQuery();
            
            // Check if any rows were returned
            boolean accountExists = resultSet.next();
    
            resultSet.close();
            prep.close();
            con.close();
    
            return accountExists;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return false;
    }

    public ArrayList<Integer> countPerStatus() {  // Moderate 
        ArrayList<Integer> counts = new ArrayList<>(); // To store counts for each status
        Map<Integer, Integer> countMap = new HashMap<>(); // To associate counts with respective status

        String query = "SELECT Status, COUNT(*) AS Count FROM account GROUP BY Status";

        try {
            connect();
            state = con.createStatement();
            result = state.executeQuery(query);

            // Initialize the count map with all statuses set to 0
            // Assuming 'statuses' is a list of all possible status values
            List<Integer> statuses = Arrays.asList(0, 1); 
            for (Integer status : statuses) {
                countMap.put(status, 0);
            }

            // Populate the count map with actual counts
            while (result.next()) {
                int status = result.getInt("Status");
                int count = result.getInt("Count");
                countMap.put(status, count);
            }

            // Convert map values to ArrayList
            for (Integer status : statuses) {
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
    



    public boolean createAccount(Account account){  // Method to insert all acount info to database

        String query = "INSERT INTO account(Username, Password, Email, Name) VALUES (?, ?, ?, ?)";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, account.getUsername());
            prep.setString(2, account.getPassword());
            prep.setString(3, account.getEmail());
            prep.setString(4, account.getName());
    
            return prep.executeUpdate() != 0;

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
    
    public void updateRegNum (BusinessInput bi, Account ac) {
        String query = "UPDATE account SET RegNum = ? WHERE AccountID = ?";
    
        
        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setLong(1, bi.getRegistrationNum());
            prep.setInt(2, ac.getAccountID());
            
            if (prep.executeUpdate() > 0) {
                System.out.println("Account Updated!");
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
    }

    public boolean softDelete(Account ac) { // when user deletes account

        String query = "UPDATE account SET Status = 1 WHERE AccountID = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setInt(1, ac.getAccountID());

            return prep.executeUpdate() != 0;
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

    public boolean updateAccount (Account ac, String username) {
        String query = "UPDATE account SET Username = ? WHERE AccountID = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, username);
            prep.setInt(2, ac.getAccountID());

            return prep.executeUpdate() != 0;
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

    public boolean updatePassword (Account ac, String password) {
        String query = "UPDATE account SET Password = ? WHERE AccountID = ?";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(1, password);
            prep.setInt(2, ac.getAccountID());

            return prep.executeUpdate() != 0;
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
}
