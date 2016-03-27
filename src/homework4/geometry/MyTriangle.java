package homework4.geometry;

import java.util.Arrays;

/**
 * Created by Dim on 24.02.2016.
 */
public class MyTriangle {

    private int a;
    private int b;
    private int c;

    public MyTriangle() {

    }

    public MyTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter() {
        return a + b + c;
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean equals(MyTriangle triangle) {
        int[] firstTriangle = new int[]{a, b, c};
        int[] secondTriangle = new int[]{triangle.a, triangle.b, triangle.c};
        Arrays.sort(firstTriangle);
        Arrays.sort(secondTriangle);
        return Arrays.equals(firstTriangle, secondTriangle);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
