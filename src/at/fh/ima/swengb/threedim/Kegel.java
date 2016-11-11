package at.fh.ima.swengb.threedim;


public class Kegel extends ThreeDimShape {

    private double radius;
    private double sideS;
    private double sideH;

    public Kegel(int x, int y,double radius, double sideS, double sideH) {
        this.x=x;
        this.y=y;
        this.radius= radius;
        this.sideS = sideS;
        this.sideH = sideH;
    }

    @Override
    public double calcVolume() {
        return ((1/3)*Math.PI)*radius*radius*sideH;
    }

    @Override
    public double calcSurfaceArea() {
        return Math.PI*radius*(radius+sideS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kegel kegel = (Kegel) o;

        if (Double.compare(kegel.radius, radius) != 0) return false;
        if (Double.compare(kegel.sideS, sideS) != 0) return false;
        return Double.compare(kegel.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideS);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kegel{");
        sb.append("radius=").append(radius);
        sb.append(", sideS=").append(sideS);
        sb.append(", sideH=").append(sideH);
        sb.append('}');
        return sb.toString();
    }
}
