import java.util.ArrayList;
import java.util.Scanner;

public class Tovar implements TovarInterface {
    int id;
    String nameTovar;
    int pricaTovar;

    @Override
    public void print() {
        System.out.println("Название: " + getNameTovar() + " Цена: " + getPricaTovar());
    }

    public Tovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public Tovar(int pricaTovar) {
        this.pricaTovar = pricaTovar;
    }

    public Tovar(int id, String nameTovar, int pricaTovar) {
        this.id = id;
        this.nameTovar = nameTovar;
        this.pricaTovar = pricaTovar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public int getPricaTovar() {
        return pricaTovar;
    }

    public void setPricaTovar(int pricaTovar) {
        this.pricaTovar = pricaTovar;
    }

    public Tovar() {

    }

    public Tovar(String nameTovar, int pricaTovar) {
        this.nameTovar = nameTovar;
        this.pricaTovar = pricaTovar;
    }
//  public void tovarInfo(){
//      System.out.printf("Название Кофе: %s, цена: %d \n", getNameTovar(),getPricaTovar());
//  }

    @Override
    public String toString() {
        return "Название: " + getNameTovar() + " Цена: " + getPricaTovar();
    }

    }


