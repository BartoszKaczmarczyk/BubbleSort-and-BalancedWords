import java.util.ArrayList;

public class BubbleSort<T extends Comparable<T>> {

    public ArrayList<T> Sort(ArrayList<T> input) {

        if (input == null) {
            throw new RuntimeException("input is null!");
        }
        ArrayList<T> output = RemoveNull(input);
        T temp;
        if (output.size() != 0) {
            for (int i = 0; i < output.size(); i++) {
//
                for (int j = 0; j < (output.size() - 1 - i); j++) {
//
                    temp = input.get(j);

                    if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                        output.set(j, output.get(j + 1));
                        output.set((j + 1), temp);
                    }
                }
            }
        }
        return output;
    }

    private ArrayList<T> RemoveNull(ArrayList<T> input) {
        ArrayList<T> output = new ArrayList<>();
        for (T item :
                input) {
            if (item != null) {
                output.add(item);
            }
        }
        return output;
    }

}
