import RefactoringCleanCode.BubbleSort;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RefactoringBubbleSortTest {
    
    public RefactoringBubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
        
    @Before
    public void setUp() throws Exception {

    }
    
    @After
    public void tearDown() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
        
    @Test
    public void testBubbleSortRefactoring(){
        int[] arrayExpected = {11, 12, 22, 25, 34, 64, 90};
        int[] arrayToOrder = {64, 34, 25, 12, 22, 11, 90};
                
        assertArrayEquals(arrayExpected, BubbleSort.sortArrayWithBubbleSort(arrayToOrder));         
    }

    @Test
    public void testBubbleSortRefactoring02(){
        int[] arrayExpected = {11, 12, 22, 25, 90, 90, 90};
        int[] arrayToOrder = {90, 90, 25, 12, 22, 11, 90};
                
        assertArrayEquals(arrayExpected, BubbleSort.sortArrayWithBubbleSort(arrayToOrder));         
    }        
}
