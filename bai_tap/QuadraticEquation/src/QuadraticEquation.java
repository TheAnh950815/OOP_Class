import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = Math.pow(this.b,2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        double x1;
        return x1 = (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }
    public double getRoot2() {
        double x2;
        return x2 = (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }
}

