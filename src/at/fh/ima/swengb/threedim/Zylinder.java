package at.fh.ima.swengb.threedim;

public class Zylinder extends ThreeDimShape{

    private double radius;
    private double sideH;

    public Zylinder(int x, int y,double radius, double sideH) {
        this.x=x;
        this.y=y;
        this.radius = radius;
        this.sideH = sideH;
    }

    @Override
    public double calcVolume() {
        return Math.PI*radius*radius*sideH;
    }

    @Override
    public double calcSurfaceArea() {
        return (2*Math.PI*radius*radius)+(2*Math.PI*radius*sideH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zylinder zylinder = (Zylinder) o;

        if (Double.compare(zylinder.radius, radius) != 0) return false;
        return Double.compare(zylinder.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zylinder{");
        sb.append("radius=").append(radius);
        sb.append(", sideH=").append(sideH);
        sb.append('}');
        return sb.toString();
    }
}
