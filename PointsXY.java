//Creating a class to initialize the points of the plane
public class PointsXY extends Methods {
    float x;
    float y;
    short angel;
    short radius;

    public PointsXY() {
    }

    public PointsXY(float x, float y) {
        this.x = x;
        this.y = y;
        this.angel = angleFi(x, y);
        this.radius = radiusXY(x, y);
    }

}