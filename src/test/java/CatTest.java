import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        cat.getSound();
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> foodList = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(foodList);
        assertEquals(foodList, cat.getFood());
    }
}

