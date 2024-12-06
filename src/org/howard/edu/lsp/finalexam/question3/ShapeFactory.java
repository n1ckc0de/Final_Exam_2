package org.howard.edu.lsp.finalexam.question3;

public class ShapeFactory {
    private static ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        return instance;
    }

    public Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}
