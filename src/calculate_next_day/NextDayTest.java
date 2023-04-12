package calculate_next_day;

import calculate_next_day.CalculateNextDay;
import org.junit.Test;
import java.util.ArrayList;
import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;

public class NextDayTest {
    @Test
    public void case1() {
        String inputDate = "1/1/2018";
        Iterable<String> expected = asList("2", "1", "2018");
        Iterable<String> providedArray = new ArrayList<>(asList(CalculateNextDay.getNextDay(inputDate).split("/")));
        assertIterableEquals(expected, providedArray);
    }
    @Test
    public void case2() {
        String inputDate = "31/1/2018";
        Iterable<String> expected = asList("1", "2", "2018");
        Iterable<String> providedArray = new ArrayList<>(asList(CalculateNextDay.getNextDay(inputDate).split("/")));
        assertIterableEquals(expected, providedArray);
    }
    @Test
    public void case3() {
        String inputDate = "30/4/2018";
        Iterable<String> expected = asList("1", "5", "2018");
        Iterable<String> providedArray = new ArrayList<>(asList(CalculateNextDay.getNextDay(inputDate).split("/")));
        assertIterableEquals(expected, providedArray);
    }
    @Test
    public void case4() {
        String inputDate = "28/2/2018";
        Iterable<String> expected = asList("1", "3", "2018");
        Iterable<String> providedArray = new ArrayList<>(asList(CalculateNextDay.getNextDay(inputDate).split("/")));
        assertIterableEquals(expected, providedArray);
    }
    @Test
    public void case5() {
        String inputDate = "29/2/2020";
        Iterable<String> expected = asList("1", "3", "2020");
        Iterable<String> providedArray = new ArrayList<>(asList(CalculateNextDay.getNextDay(inputDate).split("/")));
        assertIterableEquals(expected, providedArray);
    }
    @Test
    public void case6() {
        String inputDate = "31/12/2018";
        Iterable<String> expected = asList("1", "1", "2019");
        Iterable<String> providedArray = new ArrayList<>(asList(CalculateNextDay.getNextDay(inputDate).split("/")));
        assertIterableEquals(expected, providedArray);
    }
}