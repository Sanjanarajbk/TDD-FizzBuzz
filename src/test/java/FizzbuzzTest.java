import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void shouldReturnFizzIfNumberIsDivisibleBy3() {

        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.print(6);
        assertEquals("Fizz",result);

    }

    @Test
    void ShouldReturnBuzzIfNumberIsDivisibleBy5() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.print(10);
        assertEquals("Buzz",result);
    }

    @Test
    void ShouldReturnFizzBuzzIfNumberIsDivisibleByBoth3And5() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.print(15);
        assertEquals("FizzBuzz",result);
    }
}
