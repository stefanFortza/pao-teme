package form;

public class Circle extends Form {

    float radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public void printCircleDimensions() {
        System.out.println("Radius: " + radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Circle))
            return false;

        Circle circle = (Circle) obj;

        return Float.compare(circle.radius, radius) == 0 && super.equals(obj);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cerc: " + super.toString() + " " +
                this.getArea();
    }

}
