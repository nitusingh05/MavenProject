package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;

public class DataClass1 {
    @DataProvider(name = "mylogindata")
    public Object[][] getloginData() {
        Object[][] data = {{112244, "Harsh"}, {128345, "Piyush"}, {247543, "Smita"}, {1190925, "Sakshi"}};
        return data;
    }
    @Test(dataProvider = "mylogindata", dataProviderClass = DataClass1.class)
    public void loginForm(int reg , String email){
        System.out.println(reg + "->" + "-> + email");
    }
}
