package AnimalTests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {
    Feline feline = new Feline();
    int expectedKittens;
    int actualKittens;

    public FelineParametrizedTest(int expectedKittens, int actualKittens) {
        this.expectedKittens = expectedKittens;
        this.actualKittens = actualKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getKittens() {
        return new Object[][] {
                {-1, -1},
                {0, 0},
                {5, 5}
        };
    }

    @Test
    public void testGetKittens() {
        assertEquals(expectedKittens, actualKittens);
    }

}
