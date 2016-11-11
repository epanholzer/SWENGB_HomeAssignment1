package at.fh.ima.swengb.twodim;

public class Trapez extends TwoDimShape{

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideH;

    public Trapez(int x, int y,double sideA, double sideB, double sideC, double sideD, double sideH) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideH = sideH;
    }


    @Override
    public double calcArea() {
        return (sideA+sideC)/2*sideH;
    }

    @Override
    public double calcPerimeter() {
        return sideA*sideB*sideC*sideD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trapez trapez = (Trapez) o;

        if (Double.compare(trapez.sideA, sideA) != 0) return false;
        if (Double.compare(trapez.sideB, sideB) != 0) return false;
        if (Double.compare(trapez.sideC, sideC) != 0) return false;
        if (Double.compare(trapez.sideD, sideD) != 0) return false;
        return Double.compare(trapez.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trapez{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideC=").append(sideC);
        sb.append(", sideD=").append(sideD);
        sb.append(", sideH=").append(sideH);
        sb.append('}');
        return sb.toString();
    }
}
