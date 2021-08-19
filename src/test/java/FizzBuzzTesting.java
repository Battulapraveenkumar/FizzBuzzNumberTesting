import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTesting {
    @Test
    public void toReturnFizzIfANumberIsDivisibleByThree()
    {
        FizzBuzz obj=new FizzBuzz(6);
        String expectedOutput="Fizz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void toReturnBuzzIfANumberIsDivisibleByFive()
    {
        FizzBuzz obj=new FizzBuzz(10);
        String expectedOutput="Buzz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void toReturnNullIfANumberIsNegative()
    {
        FizzBuzz obj=new FizzBuzz(7);
        String expectedOutput=null;
        String actualOutput=obj.fizzbuzz();
        assertEquals(null,actualOutput);
    }
}
