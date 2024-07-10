import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class ExceptionLionTest {
    private final String sex;
    private final boolean expectedResult;

    public ExceptionLionTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"Человек", false}
        };
    }

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void testExceptionLion() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.doesHaveMane();
        assertFalse(expectedResult);
    }
}
