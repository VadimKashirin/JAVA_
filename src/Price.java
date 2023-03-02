public class Price extends Coffee {
    String price ;
    int id ;

    public Price(String coffeeName,String price,int id) {
        super(coffeeName);
        setPrice(price);
        setId(id);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void printCoffee() {
        System.out.println(getId() + " " + getCoffeeName()+" "+getPrice());
    }
}
