package fizz_buzz;
import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTranslateTest {
    @Test
    public void case1(){
        int input = 3;
        String expected = "Fizz";
        assertEquals(expected,FizzBuzzTranslate.FBTranslate(input));
    }
    @Test
    public void case2(){
        int input = 5;
        String expected = "Buzz";
        assertEquals(expected,FizzBuzzTranslate.FBTranslate(input));
    }
    @Test
    public void case3(){
        int input = 31;
        String expected = "thirty one";
        assertEquals(expected,FizzBuzzTranslate.FBTranslate(input));
    }
    @Test
    public void case4(){
        int input = 15;
        String expected = "FizzBuzz";
        assertEquals(expected,FizzBuzzTranslate.FBTranslate(input));
    }
    @Test
    public void case5(){
        int input = 317;
        String expected = "three hundred and seventeen";
        assertEquals(expected,FizzBuzzTranslate.FBTranslate(input));
    }
}
