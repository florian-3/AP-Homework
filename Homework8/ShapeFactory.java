package Homework8;

public class ShapeFactory {
    public static Shape fromString(String input) {
        input = input.trim();

        try {
            if (input.startsWith("Circle:")) {
                String[] parts = input.split("radius=");
                double radius = Double.parseDouble(parts[1]);
                return new Circle(radius);

            } else if (input.startsWith("Rectangle:")) {
                String[] parts = input.split(",");
                double width = Double.parseDouble(parts[0].split("width=")[1].trim());
                double length = Double.parseDouble(parts[1].split("length=")[1].trim());
                return new Rectangle(width, length);
            } else {
                throw new IllegalArgumentException("Unrecognized shape format: " + input);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to parse input: " + input, e);
        }
    }
}

