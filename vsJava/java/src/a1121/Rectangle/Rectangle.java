package a1121.Rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }


    public double getPerimeter(double x, double y) {
        return (x * 2) + (y * 2);
    }


    public double getArea(double x, double y) {
        return x * y;
    }


    public void setDimensions(double width2) {
        this.width = width2;
        this.height = width2;
    }


    public double getArea(double width2) {
        return width2 * 2;
    }


    public double getPerimeter(double width2) {
        return width2 * 4;
    }


}
