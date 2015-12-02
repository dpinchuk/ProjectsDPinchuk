import java.io.FileWriter;
import java.io.IOException;

public class Methods implements ConstAndMethodsImplements{

    // Method bubble sort points in the plane of the x and y coordinates.
    public static void bubbleSort(PointsXY[] pointsXY, char ch){
        if (ch == 'x' | ch == 'y' | ch == 'f' | ch == 'r') {
            if (ch == 'x') {
                for (byte i = (byte)(pointsXY.length - 1); i > 0; i--) {
                    for (byte j = 0; j < i; j++) {
                        if (pointsXY[j].x > pointsXY[j + 1].x) {
                            bodySort(pointsXY, i, j);
                        }
                    }
                }
            }
            if (ch == 'y') {
                for (byte i = (byte)(pointsXY.length - 1); i > 0; i--) {
                    for (byte j = 0; j < i; j++) {
                        if (pointsXY[j].y > pointsXY[j + 1].y) {
                            bodySort(pointsXY, i, j);
                        }
                    }
                }
            }
            if (ch == 'f') {
                for (int i = (byte)(pointsXY.length - 1); i > 0; i--) {
                    for (byte j = 0; j < i; j++) {
                        if (pointsXY[j].angel > pointsXY[j + 1].angel) {
                            bodySort(pointsXY, (byte)i, j);
                        }
                    }
                }
            }
            if (ch == 'r') {
                for (int i = (byte)(pointsXY.length - 1); i > 0; i--) {
                    for (byte j = 0; j < i; j++) {
                        if (pointsXY[j].radius > pointsXY[j + 1].radius) {
                            bodySort(pointsXY, (byte)i, j);
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Error. Input 'x' or 'y'.");
        }
    }

    // Body of method of sort.
    private static void bodySort(PointsXY[] pointsXY, byte i, byte j) {
        float elementX = pointsXY[j].x;
        float elementY = pointsXY[j].y;
        short elementAngel = pointsXY[j].angel;
        short elementRadius = pointsXY[j].radius;

        pointsXY[j].x = pointsXY[j + 1].x;
        pointsXY[j].y = pointsXY[j + 1].y;
        pointsXY[j].angel = pointsXY[j + 1].angel;
        pointsXY[j].radius = pointsXY[j + 1].radius;

        pointsXY[j + 1].x = elementX;
        pointsXY[j + 1].y = elementY;
        pointsXY[j + 1].angel = elementAngel;
        pointsXY[j + 1].radius = elementRadius;
    }

    // The method of calculating cos(fi).
    public static float cosFi(int x, int y) {
        float cos;
        cos = x / radiusXY(x, y);
        return cos;
    }

    // The method of calculating sin(fi).
    public static float sinFi(float x, float y) {
        float sin;
        sin = y / radiusXY(x, y);
        return sin;
    }

    // The method of calculating radius r.
    public static short radiusXY(float x, float y) {
        float radius;
        radius = (float)(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        return (short)radius;
    }

    // Select angles, depending on the values of x and w and quadrant.
    public static short angleFi(float x, float y) {
        int angle = 0;
        double argument = (double)y / (double)x;
        int angelQuadrant = (int)(Math.atan(Math.abs(argument)) * 180 / Math.PI);
        if (x > 0 && y > 0) {
            angle =  0 + angelQuadrant;
        }
        if (x < 0 && y >= 0) {
            angle = 180 - angelQuadrant;
        }
        if (x < 0 && y < 0) {
            angle = 180 + angelQuadrant;
        }
        if (x > 0 && y < 0) {
            angle = 360 - angelQuadrant;
        }
        if (x == 0 && y > 0) {
            angle = 90;
        }
        if (x == 0 && y < 0) {
            angle = 270;
        }
        return (short)angle;
    }

    // Method shows our array.
    public static void showArray(PointsXY[] pointsXY) {
        System.out.println("An ordered list of coordinates of points on the plane for the serial connection to the broken line:");
        for (byte i = 0; i < pointsXY.length; i++) {
            System.out.println("(" + pointsXY[i].x + ", " + pointsXY[i].y + ")");
        }
        System.out.println("(" + pointsXY[0].x + ", " + pointsXY[0].y + ")");
    }

    // Overload method with String "all". The method shows all calculations of our array.
    public static void showArray(PointsXY[] pointsXY, String string) {
        if (string == "all") {
            for (byte i = 0; i < pointsXY.length; i++) {
                System.out.println("(x = " + pointsXY[i].x + ", y = " + pointsXY[i].y + ", fi = " + pointsXY[i].angel + ", r = " + pointsXY[i].radius + ")");
            }
        }
    }

    // The method writes data in file.
//    public static void fileWrite(String path, PointsXY[] pointsXY) {
//        try(FileWriter fileWriter = new FileWriter(path, false)) {
//            fileWriter.write("An ordered list of coordinates of points on the plane for the serial connection to the broken line:");
//            fileWriter.append('\n');
//            for (byte i = 0; i < pointsXY.length; i++) {
//                fileWriter.write("(" + String.valueOf(pointsXY[i].x) + ", " + String.valueOf(pointsXY[i].y));
//                fileWriter.append('\n');
//            }
//        }
//        catch (IOException ioException) {
//            System.out.println(ioException.getMessage());
//        }
//    }

}