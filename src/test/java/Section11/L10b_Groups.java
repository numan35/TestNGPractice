package Section11;

import org.testng.annotations.Test;

public class L10b_Groups {
    @Test(groups = {"smoke", "regression"})
    public void method3(){
        System.out.println("Hello world from method 3");

    }

    @Test(groups = {"regression"})
    public void method4(){
        System.out.println("Hello world from method 4");

    }

    @Test(groups = {"regression"})
    public void method5(){
        System.out.println("Hello world from method 5");

    }
}
