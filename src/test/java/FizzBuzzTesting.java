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
    public void toReturnNullIfANumberIsNotDivisibleByThreeAndFive()
    {
        FizzBuzz obj=new FizzBuzz(7);
        String expectedOutput=null;
        String actualOutput=obj.fizzbuzz();
        assertEquals(null,actualOutput);
    }
    @Test
    public void toReturnFizzIfANumberContainsThree()
    {
        FizzBuzz obj=new FizzBuzz(33);
        String expectedOutput="Fizz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }
    public void toReturnFizzIfANumberContainsAtLeastOneThree()
    {
        FizzBuzz obj=new FizzBuzz(23);
        String expectedOutput="Fizz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void toReturnBuzzIfANumberContainsFive()
    {
        FizzBuzz obj=new FizzBuzz(55);
        String expectedOutput="Buzz";
        String actualOutput=obj.fizzbuzz();
        assertEquals(expectedOutput,actualOutput);
    }

}
