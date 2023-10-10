import Final.ListComparator;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ListComparatorTest {
    private ListComparator listComparator;
    private List<Integer> list1;
    private List<Integer> list2;

    @Before
    public void setUp() {
        listComparator = new ListComparator();
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
    }

    @Test
    public void testCalculateAverage() {
        double average1 = listComparator.calculateAverage(list1);
        double average2 = listComparator.calculateAverage(list2);
        assertEquals(2.0, average1, 0.0);
        assertEquals(5.0, average2, 0.0);
    }

    @Test
    public void testCompareLists() {
        String result = listComparator.compareLists(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareListsEqualAverage() {
        list2.add(3);
        String result = listComparator.compareLists(list1, list2);
        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareEmptyLists() {
        List<Integer> emptyList1 = new ArrayList<>();
        List<Integer> emptyList2 = new ArrayList<>();
        String result = listComparator.compareLists(emptyList1, emptyList2);
        assertEquals("Средние значения равны", result);
    }
}
