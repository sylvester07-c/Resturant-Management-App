//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink("cocacola", "medium");
        HamBurger hamBurger = new HamBurger("double roll", 50, 2);
        SideItem sideItem = new SideItem("donut", "large");
        MealOrder mealOrder = new MealOrder(hamBurger,drink,sideItem);
        System.out.println(drink.getSize());
        System.out.println(drink.getPrice());
        mealOrder.changeDrinkSize();
        System.out.println(drink.getSize());



    }
}