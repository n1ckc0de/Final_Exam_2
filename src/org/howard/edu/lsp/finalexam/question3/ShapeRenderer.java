package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
    private ShapeFactory shapeFactory = ShapeFactory.getInstance();

    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        shape.draw();
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: IllegalArgumentException
    }
}
