public class Rectangle extends Point {
    private int width = 10;
    private int height = 10;
    private static int count = 0;

    public Rectangle() {

    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return width * height;
    }

    public static int getCount() {
        return count;
    }

    protected void finalize() {
        count--;
    }

    public String toString() {
        return "Conner Left = " + super.toString() + "; Width = " +
                getWidth() + "; Height = " + getHeight();
    }
}
