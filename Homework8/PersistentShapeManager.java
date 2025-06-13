package Homework8;

import java.io.*;
import java.util.*;

public class PersistentShapeManager {

    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (Shape shape : shapes) {
                writer.write(shape.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving shapes: " + e.getMessage());
        }
    }

    public static List<Shape> loadShapesFromFile(String filename) {
        List<Shape> shapes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    Shape shape = ShapeFactory.fromString(line);
                    shapes.add(shape);
                } catch (IllegalArgumentException e) {
                    System.err.println("Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading shapes: " + e.getMessage());
        }

        return shapes;
    }

    public static void clearFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            // einfach überschreiben → Datei ist danach leer
        } catch (FileNotFoundException e) {
            System.err.println("Error clearing file: " + e.getMessage());
        }
    }
}
