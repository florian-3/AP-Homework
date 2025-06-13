package Homework8;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {
public double getTotalArea(){
    double totalArea = 0;
    for(Shape shape : this){
        totalArea += shape.getArea();
    }
    return totalArea;
}
public void displayAllShapes(){
    for(Shape shape : this){
        System.out.println(shape.toString());
    }
    }
   public  <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea){
    for(Shape shape : other){
        if(shape.getArea() > minArea){
            this.add((U)shape);
        }
    }
   }
}
