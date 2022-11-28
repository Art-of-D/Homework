package Module8v1;

public class Shape implements Namable{
    @Override
    public String name(String answer){
        ShapeFormatter shape = new ShapeFormatter();
        return shape.getShape(answer);
    }
}

/*enum ShapeEnter {
    square,
    circle,
    quad,
    rhombus,
    pyramid;
}*/

class ShapeFormatter {
    public String getShape(String answer) throws IllegalArgumentException{
        switch (answer) {
            case "square":
                return new Square().name(answer);
            case "circle":
                return new Circle().name(answer);
            case "quad":
                return new Quad().name(answer);
            case "rhombus":
                return new Rhombus().name(answer);
            case "pyramid":
                return new Pyramid().name(answer);
        } throw new IllegalArgumentException("We don't know such shape as " + answer);
    }
}
