public class Item {
    private String name;
    private String type;
    private double price;
    private  String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public  Item(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return  price;
    }

    public void printItem() {
        System.out.printf("The type of the item bought is %s%n", type, "The name of the item is %s%n", name, "The price of the item is %s%n", price, "The size of the item is %s%n", size);
    }
}
