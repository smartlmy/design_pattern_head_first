package decorator;

public abstract class Beverage {
    String description = "Unknown Beverage?";

    String getDescription() {
        return description;
    }

    public abstract double cost();
}
