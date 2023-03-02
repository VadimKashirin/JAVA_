public class Coffee{

    String coffeeName;

    public Coffee(String coffeeName) {
        this.coffeeName = coffeeName;

    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }



    public void printCoffee(){
        System.out.println(coffeeName);
    }


}
