import org.junit.Assert;
import org.junit.Test;

public class MainClassTest{
    MainClass main = new MainClass();
    //Тест 1
    @Test
    public void testGetLocalNumber(){
        int number = main.getLocalNumber();
        if (number == 14){
            System.out.println("Method return true number");
        }else {
            System.out.println("This method return false number");
        }
    }
    //Тест 2
    @Test
    public void testGetClassNumber(){
        int number = main.getClassNumber();
        int actual = 45;
            Assert.assertTrue("The Method getClassNumber return number > 45", number > actual );
    }
}