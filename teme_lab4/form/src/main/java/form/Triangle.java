package form;

public class Triangle extends Form {

    float height;
    float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public void printTriangleDimensions() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Triangle))
            return false;
        if (!super.equals(obj))
            return false;

        Triangle triangle = (Triangle) obj;

        return Float.compare(triangle.base, base) == 0 && Float.compare(triangle.height, height) == 0;
    }

    @Override
    public double getArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {
        return "Triunghi: " + super.toString() + " " +
                this.getArea();
    }

}
