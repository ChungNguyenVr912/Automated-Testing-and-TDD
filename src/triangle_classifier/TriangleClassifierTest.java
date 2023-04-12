package triangle_classifier;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleClassifierTest {
    @Test
    public void case1() {
        int a = 2, b = 2, c = 2;
        String expected = "Equilateral triangle";
        assertEquals(expected, TriangleClassifier.TriangleClassify(a, b, c));
    }
    @Test
    public void case2() {
        int a = 2, b = 2, c = 3;
        String expected = "Isosceles triangle";
        assertEquals(expected, TriangleClassifier.TriangleClassify(a, b, c));
    }
    @Test
    public void case3() {
        int a = 3, b = 4, c = 5;
        String expected = "Normal triangle";
        assertEquals(expected, TriangleClassifier.TriangleClassify(a, b, c));
    }
    @Test
    public void case4() {
        int a = 8, b = 2, c = 3;
        String expected = "Not a triangle";
        assertEquals(expected, TriangleClassifier.TriangleClassify(a, b, c));
    }
    @Test
    public void case5() {
        int a = -1, b = 2, c = 1;
        String expected = "Not a triangle";
        assertEquals(expected, TriangleClassifier.TriangleClassify(a, b, c));
    }
    @Test
    public void case6() {
        int a = 0, b = 1, c = 1;
        String expected = "Not a triangle";
        assertEquals(expected, TriangleClassifier.TriangleClassify(a, b, c));
    }
}
