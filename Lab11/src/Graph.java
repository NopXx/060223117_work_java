import java.awt.*;

public class Graph {
    private final int xPixelStart = 10, xPixelEnd = 410,
            xOrigin = 215;
    private final int yPixelStart = 10, yPixelEnd = 410,
            yOrigin = 215;
    private final float xStart = -5.0f, xEnd = 5.0f;
    private final float yStart = -5.0f, yEnd = 5.0f;
    private final float scale = (xPixelEnd - xPixelStart) /
            (xEnd - xStart);
    private float a, b, c, d;

    public float theFunction(float x, float a, float b, float c,
            float d) {
        return (a * x * x * x + b * x * x + c * x + d);
    }

    public float scaleX(int xPixel) {
        float value = (xPixel - xOrigin) / scale;
        return (value);
    }

    public float scaleY(float y) {
        int pixelCoord;
        pixelCoord = Math.round(-y * scale) + yOrigin;
        return (pixelCoord);
    }

    public void setParameters(int aValue, int bValue, int cValue,
            int dValue) {
        a = scale(aValue);
        b = scale(bValue);
        c = scale(cValue);
        d = scale(dValue);
    }

    private float scale(int coefficient) {
        return ((coefficient - 50) / 10.0f);
    }

    public void draw(Graphics g) {
        float x, y, nextX, nextY;
        int xPixel, yPixel, nextXPixel, nextYPixel;
        g.drawString("a = " + a + " b = " + b + " c = " + c +
                " d = " + d, 30, 60);
        for (xPixel = xPixelStart; xPixel < xPixelEnd; xPixel++) {
            x = scaleX(xPixel);
            y = theFunction(x, a, b, c, d);
            yPixel = (int) scaleY(y);
            nextXPixel = xPixel + 1;
            nextX = scaleX(nextXPixel);
            nextY = theFunction(nextX, a, b, c, d);
            nextYPixel = (int) scaleY(nextY);
            g.drawLine(xPixel, yPixel, nextXPixel, nextYPixel);
        }
    }
}