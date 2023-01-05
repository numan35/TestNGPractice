package Section11;

import org.testng.annotations.Test;

public class L10a_Groups {
    @Test(groups = {"smoke", "regression"})
    public void method1(){
        System.out.println("Hello world from method 1");

    }

    @Test(groups = {"smoke"})
    public void method2(){
        System.out.println("Hello world from method 2");

    }

}
