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
        assertEquals(1, feline.getKittens());
    }


    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

}
