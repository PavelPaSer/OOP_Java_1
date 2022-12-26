

public class main {

    public static void main(String[] args) {

        HotDrink coffeAmericano = new  HotDrink("Американо", 0.2, true, 60, 100);
        HotDrink tea = new  HotDrink("Чай", 0.4, true, 80, 40);
        HotDrink coffeCapuchino = new  HotDrink("Капучино", 0.5, false, 50, 150);
        DrinksVending hotDrVenMach = new DrinksVending();
        hotDrVenMach.addHotDrinks(coffeAmericano);
        hotDrVenMach.addHotDrinks(coffeCapuchino);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
        
    }
}