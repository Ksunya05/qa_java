import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
       Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());

    }

    @Test
    public void testGetFood () throws Exception {
        Lion lion = new Lion ("Самец", feline);
        List<String> foodList = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodList);
        assertEquals(foodList, lion.getFood());
    }


}
