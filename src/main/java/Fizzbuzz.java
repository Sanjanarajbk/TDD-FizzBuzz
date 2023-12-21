public class Fizzbuzz {
    public String convert(int number) {

        if(isDivisibleBy(number,3) && isDivisibleBy(number,5))
            return "FizzBuzz";
        if(isDivisibleBy(number,3))
            return "Fizz";
        if (isDivisibleBy(number,5))
            return "Buzz";

        return null;
    }

    private static boolean isDivisibleBy(int number,int divisor) {
        return number % divisor == 0;
    }
}
