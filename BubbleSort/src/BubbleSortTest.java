import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    public void SortTest1(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,5,6,8,3,8));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,3,4,5,6,8,8));
        ArrayList<Integer> actual = bubbleSort.Sort(input);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void SortTest2(){
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        ArrayList<Double> input = new ArrayList<>(Arrays.asList(-9.3,0.2,4d,0.1,5d,9d));
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(-9.3,0.1,0.2,4d,5d,9d));
        ArrayList<Double> actual = bubbleSort.Sort(input);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void SortTest3(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = bubbleSort.Sort(input);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void SortTest4(){
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        ArrayList<Double> input = new ArrayList<>(Arrays.asList(null,5.0001));
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(5.0001));
        ArrayList<Double> actual = bubbleSort.Sort(input);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void SortTest5() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        assertThrows(RuntimeException.class,
                ()-> bubbleSort.Sort(null));
    }
}