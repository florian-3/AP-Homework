package Homework8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeAnalyzer {



    static List<Shape> filterByMinArea(
            Collection<? extends Shape> shapes, double minArea){
            List<Shape> List = new ArrayList<Shape>();
            for(Shape shape : shapes){
                if(shape.getArea() >= minArea){
                    List.add(shape);
                }
            }
            return List;
    }

    static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes){
        double maxArea = 0;
        Shape maxShape = null;
        for(Shape shape : shapes){
            double area = shape.getArea();
            if(area > maxArea){
                maxArea = area;
                maxShape = shape;
            }
        }
        return maxShape;
    }
    static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){
        Map<String, List<T>> result = new HashMap<>();
        for (T shape : shapes) {
            String type = shape.getClass().getSimpleName();
            result.computeIfAbsent(type, k -> new ArrayList<>()).add(shape);
        }
        return result;
    }
}
