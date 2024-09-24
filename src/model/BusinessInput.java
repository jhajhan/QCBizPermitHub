package model;

import java.util.ArrayList;



public class BusinessInput {
    private long registrationNum;
    private String businessType;
    private long tin;
    private String businessName;
    private String tradeName;
    private String mainOfficeAddress;
    private String telephoneNum;
    private long mobileNum;
    private String email;
    private String nameOPO;
    private String suffixOPO;
    private char sex;
    private double businessArea;
    private double totalFloorArea;
    private String timeOperation;
    private int totalEmployee;
    private int employeesFemale;
    private int employeesMale;
    private int employeesQC;
    private int vehVanTruck;
    private int vehMotor;
    private String businessLocAddress;
    private boolean isOwned;
    private int propertyIdentityNum;
    private double capital;
    private String position;
    private ArrayList<PermitNo> permitNo;
    private ArrayList<BusinessLine> businessLine;
    private ArrayList<Service> service;

    public ArrayList<PermitNo> getPermitNo() {
        return permitNo;
    }

    public void setPermitNo(ArrayList<PermitNo> permitNo) {
        this.permitNo = permitNo;
    }
    
    
    public ArrayList<Service> getService() {
        return service;
    }

    public void setService(ArrayList<Service> service) {
        this.service = service;
    }
    

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    private String status;

    public ArrayList<BusinessLine> getBusinessLine() {
        return businessLine;
    }

    public void setBusinessLine(ArrayList<BusinessLine> businessLine) {
        this.businessLine = businessLine;
    }
    public long getRegistrationNum() {
        return registrationNum;
    }
    public void setRegistrationNum(long registrationNum) {
        this.registrationNum = registrationNum;
    }
    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public long getTin() {
        return tin;
    }
    public void setTin(long tin) {
        this.tin = tin;
    }
    public String getBusinessName() {
        return businessName;
    }
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    public String getTradeName() {
        return tradeName;
    }
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }
    public String getMainOfficeAddress() {
        return mainOfficeAddress;
    }
    public void setMainOfficeAddress(String mainOfficeAddress) {
        this.mainOfficeAddress = mainOfficeAddress;
    }
    public String getTelephoneNum() {
        return telephoneNum;
    }
    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }
    public long getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNameOPO() {
        return nameOPO;
    }
    public void setNameOPO(String nameOPO) {
        this.nameOPO = nameOPO;
    }
    public String getSuffixOPO() {
        return suffixOPO;
    }
    public void setSuffixOPO(String suffixOPO) {
        this.suffixOPO = suffixOPO;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public double getBusinessArea() {
        return businessArea;
    }
    public void setBusinessArea(double businessArea) {
        this.businessArea = businessArea;
    }
    public double getTotalFloorArea() {
        return totalFloorArea;
    }
    public void setTotalFloorArea(double totalFloorArea) {
        this.totalFloorArea = totalFloorArea;
    }
    public String getTimeOperation() {
        return timeOperation;
    }
    public void setTimeOperation(String timeOperatin) {
        this.timeOperation = timeOperatin;
    }
    public int getTotalEmployee() {
        return totalEmployee;
    }
    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }
    public int getEmployeesFemale() {
        return employeesFemale;
    }
    public void setEmployeesFemale(int employeesFemale) {
        this.employeesFemale = employeesFemale;
    }
    public int getEmployeesMale() {
        return employeesMale;
    }
    public void setEmployeesMale(int employessMake) {
        this.employeesMale = employessMake;
    }
    public int getEmployeesQC() {
        return employeesQC;
    }
    public void setEmployeesQC(int employeesQC) {
        this.employeesQC = employeesQC;
    }
    public int getVehVanTruck() {
        return vehVanTruck;
    }
    public void setVehVanTruck(int vehVanTruck) {
        this.vehVanTruck = vehVanTruck;
    }
    public int getVehMotor() {
        return vehMotor;
    }
    public void setVehMotor(int vehMotor) {
        this.vehMotor = vehMotor;
    }
    public String getBusinessLocAddress() {
        return businessLocAddress;
    }
    public void setBusinessLocAddress(String businessLocAddress) {
        this.businessLocAddress = businessLocAddress;
    }
    public boolean isOwned() {
        return isOwned;
    }
    public void setOwned(boolean isOwned) {
        this.isOwned = isOwned;
    }
    public int getPropertyIdentityNum() {
        return propertyIdentityNum;
    }
    public void setPropertyIdentityNum(int propertyIdentityNum) {
        this.propertyIdentityNum = propertyIdentityNum;
    }
    public double getCapital() {
        return capital;
    }
    public void setCapital(double capital) {
        this.capital = capital;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    
}


