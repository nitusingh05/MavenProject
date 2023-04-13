package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
  /*  @DataProvider(name = "mylogindata")
    public Object[][] getloginData(){
        Object[][] data = {{112244, "Harsh"},{128345,"Piyush"},{247543,"Smita"},{1190925,"Sakshi"}};
        return data;
    }*/
    @Test(dataProvider = "mylogindata",dataProviderClass = DataClass1.class)
    public void loginForm(int reg , String name){
        System.out.println(reg + "->" + name);
    }
}
