import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void shouldReturnFizzIfNumberIsDivisibleBy3() {
       //arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //act
        String result = fizzbuzz.convert(6);
        //assert
        assertEquals("Fizz",result);

    }

    @Test
    void ShouldReturnBuzzIfNumberIsDivisibleBy5() {

        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String result = fizzbuzz.convert(10);

        assertEquals("Buzz",result);
    }

    @Test
    void ShouldReturnFizzBuzzIfNumberIsDivisibleByBoth3And5() {

        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String result = fizzbuzz.convert(15);

        assertEquals("FizzBuzz",result);
    }
}
