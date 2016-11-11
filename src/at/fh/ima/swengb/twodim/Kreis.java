package at.fh.ima.swengb.twodim;


public class Kreis extends TwoDimShape {

    private double radius;

    public Kreis(int x, int y,double radius) {
        this.x=x;
        this.y=y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calcPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kreis kreis = (Kreis) o;

        return Double.compare(kreis.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kreis{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
