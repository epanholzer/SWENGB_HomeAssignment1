package at.fh.ima.swengb.threedim;

public class Pyramide extends ThreeDimShape {

    private double sideA;
    private double sideB;
    private double sideH;
    private double sideHa;
    private double sideHb;

    public Pyramide(int x, int y,double sideA, double sideB, double sideH, double sideHa, double sideHb) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
        this.sideHa = sideHa;
        this.sideHb = sideHb;
    }

    @Override
    public double calcVolume() {
        return ((1/3)*sideA)*sideB*sideH;
    }

    @Override
    public double calcSurfaceArea() {
        return (sideA*sideB)+(sideA*sideHa)+(sideB*sideHb);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pyramide pyramide = (Pyramide) o;

        if (Double.compare(pyramide.sideA, sideA) != 0) return false;
        if (Double.compare(pyramide.sideB, sideB) != 0) return false;
        if (Double.compare(pyramide.sideH, sideH) != 0) return false;
        if (Double.compare(pyramide.sideHa, sideHa) != 0) return false;
        return Double.compare(pyramide.sideHb, sideHb) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideHa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideHb);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramide{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideH=").append(sideH);
        sb.append(", sideHa=").append(sideHa);
        sb.append(", sideHb=").append(sideHb);
        sb.append('}');
        return sb.toString();
    }
}
