package AnimalTests;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class LionTest {
    @Mock
    Feline feline;

    Lion lionMale;
    Lion lionFemale;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        lionMale = new Lion(feline, "Самец");
        lionFemale = new Lion(feline, "Самка");
    }

    @Test
    public void testIncorrectSex() throws Exception {
        try{
            new Lion(feline, "неопределен");
        } catch (Exception e){
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void testDoesHaveMane() {
        assertTrue(lionMale.doesHaveMane());
        assertFalse(lionFemale.doesHaveMane());
    }

    @Test
    public void testGetKittens() {
        when(feline.getKittens()).thenReturn(3);
        assertEquals(3, lionFemale.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(feline.getFood(anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionMale.getFood());
    }
}
