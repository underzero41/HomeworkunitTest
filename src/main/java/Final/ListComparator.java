package Final;

import java.util.List;

public class ListComparator {
    public double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    public String compareLists(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
