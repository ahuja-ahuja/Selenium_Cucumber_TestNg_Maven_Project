package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks_normal {

    @Before("@NetBanking")
    public void netBankingSetup(){
        System.out.println("setup entries in netbanking db");
    }


    //this Before method will run before each scenario which is having tag smokeTest
    @Before("@SmokeTest")
    public void morgageSetup(){
        System.out.println("setup smokeTest");
    }
}
