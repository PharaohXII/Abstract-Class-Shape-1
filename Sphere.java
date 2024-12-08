public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Sphere: Surface Area= %.2f, Volume = %.2f", surfaceArea(), volume());
    }
}
