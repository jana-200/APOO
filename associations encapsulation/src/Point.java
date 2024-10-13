public class Point {

    private double x,y;
    public Point(double nX,double nY){
        x= nX;
        y= nY;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
