import org.junit.Assert;
import org.junit.Test;

public class MainClassTest{
    MainClass main = new MainClass();
    //Тест 1
    @Test
    public void testGetLocalNumber(){
        int number = main.getLocalNumber();
        int actual = 14;
        Assert.assertTrue("Method getLocalNumber return number != 14", number == actual);
    }
    //Тест 2
    @Test
    public void testGetClassNumber(){
        int number = main.getClassNumber();
        int actual = 45;
            Assert.assertTrue("The Method getClassNumber return number < 45", number > actual );
    }
    //Тест 3
    @Test
    public void testGetClassString(){
        String line = main.getClassString();
        String firstSubstring = "hello";
        String secondSubstring = "Hello";

        Assert.assertTrue("The Method class_string don't return substring 'hello' or 'Hello'", line.contains(firstSubstring)||line.contains(secondSubstring));
    }
}