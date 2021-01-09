package decorator;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage houseblend = new HouseBlend();
        System.out.println(houseblend.getDescription() + " $" + houseblend.cost());

        Beverage houseblendWithMocha = new Mocha(houseblend);
        System.out.println(houseblendWithMocha.getDescription() + " $" + houseblendWithMocha.cost());
    }
}
