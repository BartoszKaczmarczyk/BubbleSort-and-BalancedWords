import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,4,5,6,8,3,8));
        System.out.println("==========Before sort==========");
        for (int i :
                input) {
            System.out.println(i);
        }
        ArrayList<Integer> output = bubbleSort.Sort(input);
        System.out.println("==========After sort==========");
        for (int i :
                output) {
            System.out.println(i);
        }
    }
}