package at.fh.ima.swengb.threedim;


import at.fh.ima.swengb.GeometricShapes;

public abstract class ThreeDimShape extends GeometricShapes {
    public abstract double calcVolume();

    public abstract double calcSurfaceArea();
}
