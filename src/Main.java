import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList = filter(intList);
        intList = findNumbers(intList);
        intList.sort(Comparator.naturalOrder());
        System.out.println(intList);
    }

    private static List<Integer> findNumbers(List<Integer> intList) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i)%2 == 0) {
                numberList.add(intList.get(i));
            }
        }
        return numberList;
    }

    private static List<Integer> filter(List<Integer> intList) {
        List<Integer> numberList = new ArrayList<>(13);
        for (int i = 0; i < intList.size(); i++) {
            if (!(intList.get(i) <= 0)) {
                numberList.add(intList.get(i));
            }
        }
        return numberList;
    }
}