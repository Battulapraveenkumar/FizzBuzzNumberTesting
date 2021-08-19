public class FizzBuzz {
    int number;
    public FizzBuzz(int n) {
        this.number=n;
    }

    public String fizzbuzz() {
        String NumberString=Integer.toString(number);
        if(number%3==0)
            return  "Fizz";
        if(number%5==0)
            return "Buzz";
        if(NumberString.contains("3"))
            return "Fizz";
        if(NumberString.contains("5"))
            return "Buzz";
        if( NumberString.contains("3") && NumberString.contains("5"))
            return "FizzBuzz";
        else
            return null;
    }

}
