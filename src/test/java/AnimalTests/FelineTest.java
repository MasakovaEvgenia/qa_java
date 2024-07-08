package AnimalTests;

import java.util.List;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void testGetKittensWithoutParams() {
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, feline.getKittens());
    }


    @Test
    public void testGetFamily() {
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

}
