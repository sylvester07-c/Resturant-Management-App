public class Drink {

    private String type;
    protected String size;
    private double price;

    public Drink (String type, String size) {
        this.type = type;
        if(size == "large") {
         this.price = 20.50;
        }else if(size == "medium"){
            this.price = 15.50;
        }else if(size == "small") {
            this.price = 10.50;
        }else {
            System.out.println("Size not in range enter, large, medium or small");
        }
    }

    public  String getSize(){
        return  size;
    }

    public double getPrice() {
        return  price;
    }

}
