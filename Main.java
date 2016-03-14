//Project_4_ClosedPolyline.

import java.awt.*;

public class Main extends PointsXY {

//Task 4.2*. Closed polyline.
    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis(); //Time program start

        //Create an array of instances of the class PointsXY.
        PointsXY[] pointsXY = new PointsXY[COUNT_OF_POINTS];
// не работает
        //Defining points of the plane.
        pointsXY[0] = new PointsXY(6, 9);   //A
        pointsXY[1] = new PointsXY(9, 6);   //B
        pointsXY[2] = new PointsXY(14, 6);   //C
        pointsXY[3] = new PointsXY(17, 8);   //D
        pointsXY[4] = new PointsXY(18, 10);  //E
        pointsXY[5] = new PointsXY(18, 13);  //F
        pointsXY[6] = new PointsXY(17, 15); //G
        pointsXY[7] = new PointsXY(13, 17); //H
        pointsXY[8] = new PointsXY(10, 17);  //I
        pointsXY[9] = new PointsXY(7, 15);  //J
        pointsXY[10] = new PointsXY(6, 13);  //K

        // Methods.
        bubbleSort(pointsXY, 'f');  //Sort by angels - this is main module in program!!! We can sort by x - 'x', y - 'y', angel - 'f', radius - 'r'.
        showArray(pointsXY, "all"); // Show all data. Used key 'all'.
        showArray(pointsXY);        // Override. Show only points (x, y) of our polyline.
        //fileWrite(path, pointsXY);  // Write data in file.

        Draw draw = new Draw();

        //Draw.x = 150;

        draw.repaint();

        System.out.println();
        System.out.println("The program was carried out " + (System.currentTimeMillis() - startTime) + " milliseconds."); //Time program finish
    }

}