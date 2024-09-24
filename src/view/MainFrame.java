package view;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Account;
import model.BusinessInput;

public class MainFrame extends javax.swing.JFrame {

    private final CardLayout cardLayout;
    private final JPanel cardPanel;
    private final LoginRegister loginRegister;
    private final Login login;
    private final Register register;
    private static QCBPH_AdminWithTable admin;
    private final QCBPH_AdminDelete adminDelete;
    private static QCBPH_AdminDeleteAcc adminDelAcc;
    private static QCBPH_AdminDeleteApp adminDelApp;
    private static QCBPH_AdminUpdate adminUpdate;
    private static QCBPH_HomeWelcome homeWelcome;
    private static QCBPH_HomeStatus homeStatus;
    private static QCBPH_Requirements requirements;
    private static QCBPH_DataPrivAct dataPrivAct;
    private static QCBPH_ContactUs contactUs;
    private static QCBPH_Account account;
    private static QCBPH_AccountChangePW accountChangePW;
    private static QCBPH_AccountChangeUN accountChangeUN;
    private static QCBPH_StatusNP statusNP;
    private static QCBPH_StatusP statusP;
    private static QCBPH_StatusTBP statusTBP;
    private static Step1 step1;
    private static Step2 step2;
    private static Step3 step3;
    private static QCBPH_StatusAccount statusAccount;
    private static QCBPH_StatusAccNoDeleteAcc statusAccNoDeleteAcc;
    private static QCBPH_StatusContactUs statusContactUs;
    private static QCBPH_StatusDataPrivAct statusDataPriv;
    private static QCBPH_StatusAccChangePW statusAccChangePW;
    private static QCBPH_StatusAccChangeUN statusAccChangeUN;

    public MainFrame() {

        setSize(950, 640);
        setTitle("QC BizPermit Hub");
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_LOGO (100 x 100 px).png"));
        // Set the icon image for the frame
        setIconImage(imgIcon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        loginRegister = new LoginRegister(this);
        login = new Login(this);
        register = new Register(this);
        admin = new QCBPH_AdminWithTable(this);
        adminDelete = new QCBPH_AdminDelete(this);
        
        cardPanel.add(loginRegister, "loginRegister");
        cardPanel.add(login, "login");
        cardPanel.add(register, "register");
        cardPanel.add(adminDelete, "adminDelete");

        add(cardPanel);
        cardLayout.show(cardPanel, "loginRegister");
    }

    public void showCard(String cardName) {
        cardLayout.show(cardPanel, cardName);
    }

    public void setReq(Account ac) {
        requirements = new QCBPH_Requirements(ac, this);
        cardPanel.add(requirements, "requirements");
        add(cardPanel);
    }

    public void setContact(Account ac) {
        contactUs = new QCBPH_ContactUs(ac, this);
        cardPanel.add(contactUs, "contactUs");
        add(cardPanel);
    }

    public void setDataPriv(Account ac) {
        dataPrivAct = new QCBPH_DataPrivAct(ac, this);
        cardPanel.add(dataPrivAct, "dataPrivAct");
        add(cardPanel);
    }

    public void setHomeWelcome(Account ac) {
        homeWelcome = new QCBPH_HomeWelcome(ac, this);
        cardPanel.add(homeWelcome, "homeWelcome");
        add(cardPanel);
    }

    public void setHomeStatus (String status, Account ac) {
        homeStatus = new QCBPH_HomeStatus(status, ac, this);
        cardPanel.add(homeStatus, "homeStatus");
        add(cardPanel);
    }

    public void setAccount(Account ac) {
        account = new QCBPH_Account(ac, this);
        cardPanel.add(account, "account");
        add(cardPanel);
    }

    public void setChangePw(Account ac) {
        accountChangePW = new QCBPH_AccountChangePW(ac, this);
        cardPanel.add(accountChangePW, "accountChangePW");
        add(cardPanel);
    }

    public void setChangeUn(Account ac) {
        accountChangeUN = new QCBPH_AccountChangeUN(ac, this);
        cardPanel.add(accountChangeUN, "accountChangeUN");
        add(cardPanel);
    }

    public void setStatusNP(Account ac) {
        statusNP = new QCBPH_StatusNP(ac, this);
        cardPanel.add(statusNP, "statusNP");
        add(cardPanel);
    }

    public void setStatusP(Account ac) {
        statusP = new QCBPH_StatusP(ac, this);
        cardPanel.add(statusP, "statusP");
        add(cardPanel);
    }

    public void setStatusTBP(Account ac) {
        statusTBP = new QCBPH_StatusTBP(ac, this);
        cardPanel.add(statusTBP, "statusTBP");
        add(cardPanel);
    }

    public void setStep1 (Account ac) {
        step1 = new Step1(ac, this);
        cardPanel.add(step1, "step1");
        add(cardPanel);
    }

    public void setStep2(Account ac, BusinessInput bi) {
        step2 = new Step2(ac, bi, this);
        cardPanel.add(step2, "step2");
        add(cardPanel);
    }

    public void setStep3(Account ac, BusinessInput bi) {
        step3 = new Step3(ac, bi, this);
        cardPanel.add(step3, "step3");
        add(cardPanel);
    }

    public void setStatusContact(Account ac) {
        statusContactUs = new QCBPH_StatusContactUs(ac, this);
        cardPanel.add(statusContactUs, "statusContactUs");
        add(cardPanel);
    }

    public void setStatusDataPriv(Account ac) {
        statusDataPriv = new QCBPH_StatusDataPrivAct(ac, this);
        cardPanel.add(statusDataPriv, "statusDataPriv");
        add(cardPanel);
    }

    public void setStatusAccount(Account ac) {
        statusAccount = new QCBPH_StatusAccount(ac, this);
        cardPanel.add(statusAccount, "statusAccount");
        add(cardPanel);
    }

    public void setStatusAccNoDelete (Account ac) {
        statusAccNoDeleteAcc = new QCBPH_StatusAccNoDeleteAcc(ac, this);
        cardPanel.add(statusAccNoDeleteAcc, "statusAccNoDelete");
        add(cardPanel);
    }

    public void setStatusAccChangePW(Account ac) {
        statusAccChangePW = new QCBPH_StatusAccChangePW(ac, this);
        cardPanel.add(statusAccChangePW, "statusAccChangePW");
        add(cardPanel);
    }

    public void setStatusAccChangeUN(Account ac) {
        statusAccChangeUN = new QCBPH_StatusAccChangeUN(ac, this);
        cardPanel.add(statusAccChangeUN, "statusAccChangeUN");
        add(cardPanel);
    }

    public void setAdmin() {

        admin = new QCBPH_AdminWithTable(this);
        cardPanel.add(admin, "admin");
        add(cardPanel);
    }

    public void setAdminDelAcc() {

        adminDelAcc = new QCBPH_AdminDeleteAcc(this);
        cardPanel.add(adminDelAcc, "adminDelAcc");
        add(cardPanel);
    }

    public void setAdminDelApp() {
        adminDelApp = new QCBPH_AdminDeleteApp(this);
        cardPanel.add(adminDelApp, "adminDelApp");
        add(cardPanel);
    }

    public void setAdminUpdate() {
        adminUpdate = new QCBPH_AdminUpdate(this);
        cardPanel.add(adminUpdate, "adminUpdate");
        add(cardPanel);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
