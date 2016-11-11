package at.fh.ima.swengb;

import at.fh.ima.swengb.threedim.Kegel;
import at.fh.ima.swengb.threedim.Pyramide;
import at.fh.ima.swengb.threedim.ThreeDimShape;
import at.fh.ima.swengb.threedim.Zylinder;
import at.fh.ima.swengb.twodim.Kreis;
import at.fh.ima.swengb.twodim.Kreissegment;
import at.fh.ima.swengb.twodim.Trapez;
import at.fh.ima.swengb.twodim.TwoDimShape;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.doit();
    }

    private void doit() {
        List<GeometricShapes> shapeList = new ArrayList<>();

        fillList(shapeList);

        List<TwoDimShape> twodimList = new ArrayList<>();
        for (GeometricShapes shape : shapeList) {
            if (shape instanceof TwoDimShape) {
                twodimList.add((TwoDimShape)shape);
            }
        }

        List<ThreeDimShape> threedimList = new ArrayList<>();
        for (GeometricShapes shape : shapeList) {
            if (shape instanceof ThreeDimShape) {
                threedimList.add((ThreeDimShape)shape);
            }
        }

        double sum2dimarea = 0.0;
        double sum2dimperimeter = 0.0;
        double sum3dimvolume = 0.0;
        double sum3dimsurface = 0.0;
        System.out.println("-------- TwoDim CalcArea --------");
        for (TwoDimShape shape : twodimList) {
            sum2dimarea += shape.calcArea();
        }
        System.out.println(sum2dimarea);

        System.out.println("-------- TwoDim CalcPerimter --------");
        for (TwoDimShape shape : twodimList) {
            sum2dimperimeter += shape.calcPerimeter();
        }
        System.out.println(sum2dimperimeter);

        System.out.println("-------- ThreeDim CalcVolume --------");
        for (ThreeDimShape shape : threedimList) {
            sum3dimvolume += shape.calcVolume();
        }
        System.out.println(sum3dimvolume);

        System.out.println("-------- ThreeDim CalcSurface--------");
        for (ThreeDimShape shape : threedimList) {
            sum3dimsurface += shape.calcSurfaceArea();
        }
        System.out.println(sum3dimsurface);

    }

    private void fillList(List<GeometricShapes> shapesList) {

        shapesList.add(new Kreis(1,1,3.0));
        shapesList.add(new Kreissegment(1,1,3.0,30.0));
        shapesList.add(new Trapez(1,1,2.0,3.0,4.0,2.0,3.0));
        shapesList.add(new Kegel(1,1,5.0,5.831,3.0));
        shapesList.add(new Pyramide(1,1,3.0,2.0,3.873,4.0,4.153));
        shapesList.add(new Zylinder(1,1,3.0,4.0));
    }


}

