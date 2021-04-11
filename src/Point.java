/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 10/30/2020
 *   Time: 1:48 PM
 *   File: Point.java
 */

public class Point<T> {
    private int x;
    private T y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}

class Generics {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(2);

    }
}