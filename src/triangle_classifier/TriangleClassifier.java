package triangle_classifier;

public class TriangleClassifier {
    public static String TriangleClassify(int a, int b, int c) {
        boolean invalidSide = isInvalidSide(a, b, c);
        if (invalidSide) {
            return "Not a triangle";
        } else if (a==b && b == c) {
            return "Equilateral triangle";
        } else if (a == b || b == c || a == c) {
            return "Isosceles triangle";
        }else {
            return "Normal triangle";
        }
    }

    private static boolean isInvalidSide(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        double sum = a + b + c;
        if (a <= 0 || b <= 0 || c <= 0) {
            return true;
        } else {
            return max >= sum / 2;
        }
    }
}
