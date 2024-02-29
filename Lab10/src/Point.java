public class Point {
    private int x = 10;
    private int y = 10;
    private static int count = 0;

    // no-argument constructor
    public Point() {
        setX(0);
        setY(0);
        count++;
    }

    // constructor
    public Point(int xValue, int yValue) {
        setX(xValue);
        setY(yValue);
        count++;
    }

    // finalizer
    protected void finalize() {
        count--;
    }

    // set x in coordinate pair
    public void setX(int xValue) {
        x = xValue; // no need for validation
    }

    // return x from coordinate pair
    public int getX() {
        return x;
    }

    // set y in coordinate pair
    public void setY(int yValue) {
        y = yValue; // no need for validation
    }

    // return y from coordinate pair
    public int getY() {
        return y;
    }

    public static int getCount() {
        return count;
    }

    // return String representation of Point object
    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    }
}
