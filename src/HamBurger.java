public class HamBurger extends Item{

    protected int toppings;
    private Item extra1;
    private Item extra2;
    private Item  extra3;

    public HamBurger(String type, String size, int toppings, Item extra1, Item extra2, Item  extra3) {
        super(type, size);
        this.toppings = toppings;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 =  extra3;
    }

    public int addToppings() {
        if(toppings < 3){
            int extraToppings = toppings + 1;
            return  extraToppings;
        }
        return  toppings;

    }


}
