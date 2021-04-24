import org.junit.Test;

public class MainClassTest extends MainClass{
    MainClass main = new MainClass();

    @Test
    public void testGetLocalNumber(){
        int number = main.getLocalNumber();
        if (number == 14){
            System.out.println("Method return true number");
        }else {
            System.out.println("This method return false number");
        }
    }
}