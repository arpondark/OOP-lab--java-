import java.util.Scanner;

class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double findSlope() {
        if (x2 == x1) {
            throw new ArithmeticException("Slope is undefined (vertical line).");
        }
        return (y2 - y1) / (x2 - x1);
    }

    public String toString() {
        return "Line has points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
    }

    public static boolean isIntersecting(Line line1, Line line2) {
        try {
            double slope1 = line1.findSlope();
            double slope2 = line2.findSlope();

            if (slope1 == slope2) {
                return false;
            }
        } catch (ArithmeticException e) {

            return true;
        }

        // If slopes are different, lines intersect return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Line[] lines = new Line[4];

        System.out.println("Enter coordinates for 4 lines:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter coordinates for Line " + (i + 1) + " (x1, y1, x2, y2):");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            lines[i] = new Line(x1, y1, x2, y2);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Line " + (i + 1) + ": " + lines[i].toString());
        }

        System.out.println("Checking intersections:");
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                if (Line.isIntersecting(lines[i], lines[j])) {
                    System.out.println("Line " + (i + 1) + " and Line " + (j + 1) + " intersect.");
                } else {
                    System.out.println("Line " + (i + 1) + " and Line " + (j + 1) + " do not intersect.");
                }
            }
        }

        scanner.close();
    }
}
