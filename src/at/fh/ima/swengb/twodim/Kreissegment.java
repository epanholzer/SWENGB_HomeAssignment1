package at.fh.ima.swengb.twodim;


public class Kreissegment extends TwoDimShape {

    private double radius;
    private double alpha;

    public Kreissegment(int x, int y,double radius, double alpha) {
        this.x=x;
        this.y=y;
        this.radius = radius;
        this.alpha = alpha;
    }

    @Override
    public double calcArea() {
        return ((radius*radius*Math.PI)/360)*alpha;
    }

    @Override
    public double calcPerimeter() {
        return (radius*Math.PI)+radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kreissegment that = (Kreissegment) o;

        if (Double.compare(that.radius, radius) != 0) return false;
        return Double.compare(that.alpha, alpha) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(alpha);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kreissegment{");
        sb.append("radius=").append(radius);
        sb.append(", alpha=").append(alpha);
        sb.append('}');
        return sb.toString();
    }
}

