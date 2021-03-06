package com.example;

import org.junit.*;

import static org.junit.Assert.*;

public class bankAccountTest {
    private BankAccount account;
    private  static int count = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test case. Count = " + count++);
    }
    @Before
    public void setup(){
        this.account =  new BankAccount("Tim","Buchalka",1000.00,BankAccount.CHECKING);
        System.out.println("Running a test");
    }

    @Test
    public void deposit() {

        double balance = account.deposit(200, true);
        assertEquals(1200, balance,0);

    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        account.withdraw(600.00, false);

    }

    @Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance,0);
    }

    @Test
    public void getBalance_deposit() {

        account.deposit(200, true);
        assertEquals(1200,account.getBalance(),0);
    }


    @Test
    public void getBalance_withdraw() {

        account.withdraw(200, true);
        assertEquals(800,account.getBalance(),0);
    }

    @Test
    public void isChecking_true(){

        assertTrue("The account is NOT a checking account", account.isChecking());

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test case. Count = " + count++);
    }
    @After

    public void tearDown(){
        System.out.println("Count = " + count++);
    }


}