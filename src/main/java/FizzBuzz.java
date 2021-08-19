public class FizzBuzz {
    int number;
    public FizzBuzz(int n) {
        this.number=n;
    }

    public String fizzbuzz() {

            if(number%3==0)
                return  "Fizz";
            if(number%5==0)
                return "Buzz";
            else
                return null;
    }
}
