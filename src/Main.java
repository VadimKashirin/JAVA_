import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Промежуточная 2 ");

//
        Scanner in = new Scanner(System.in);
        vhod();
        reg();
//        for(Tovar tv:tovarSpisok){
//            System.out.println(tv);
//        }
    }
    public static void vhod(){
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Нажмите 1 чтобы зайти ка Admin \nНажмите 2 чтобы зайти как посетитель");
            int inputVhod = in.nextInt();
            in.nextLine();
            switch (inputVhod){
                case 1:
                    System.out.println("Вы вошли как Admin : Олег Попов");
                    Tovar tovar = new Tovar();
                   // tovar.add(new Tovar(tovarSpisok));
                    System.out.println(tovar.toString());


                    break;
                case 2:
                    reg();
                    break;
                case 3:
                    return;
            }

        }
    }

    public static void reg() {

        Scanner in = new Scanner(System.in);
        ArrayList<Posetitel> regaPosetitel = new ArrayList<>();
        while (true) {
            System.out.println("Нажмите 1 чтобы зарегистрироваться \nНажмите 2 чтобы авторизоваться ");
            int inputMenu = in.nextInt();
            in.nextLine();
            switch (inputMenu) {
                case 1:
                    System.out.println("Фамилия");
                    String firstName = in.nextLine();
                    System.out.println("Имя");
                    String name = in.nextLine();
                    System.out.println("Отчество");
                    String lastName = in.nextLine();
                    System.out.println("Введите номер телефона");
                    String nomerTel = in.nextLine();
                    if (nomerTel.matches("(\\+7|7|8)+(\\d{10})")) ;
                    //System.out.println(nomerTel);
                    System.out.println("Введите email");
                    String email = in.nextLine();
                    if (email.matches("(\\d+) + [a-zA-Z] + (-|_|@|\\.)")) ;
                    //System.out.println(email);
                    System.out.println("Введите логин ");
                    String login = in.nextLine();
                    System.out.println("Введите пароль ");
                    String parol = in.nextLine();
                    if (parol.matches("\\d{4}")) ;
                    regaPosetitel.add(new Posetitel(firstName, name, lastName, nomerTel, email, login, parol));
                    System.out.println("Вы зарегистрировались");




                    break;
                case 2:

                    System.out.println("Авторизация");
                    System.out.println("Введите логин или email");
                    String loginAuth = in.nextLine();

                    System.out.println("Введите пароль");
                    String parolAuth = in.nextLine();
//                    System.out.println(parolAuth +"  " + loginAuth);
                    Posetitel poss = new Posetitel(loginAuth,parolAuth);

                    for (Posetitel item:regaPosetitel){
                        System.out.println(poss.equals(item));

                    }

                    if (!findPosititel(loginAuth,parolAuth,regaPosetitel)){
                        System.out.println("Данные некорректны");
                    }

                    break;
                case 3:
                    System.out.println("Нажми 3 чтобы вернуться в меню");
                    vhod();
                case 4:
                    return;
            }
        }
    }
     static boolean findPosititel(String login,String parol, ArrayList <Posetitel> regaPosetitel){
        for (Posetitel poss:regaPosetitel){
            if (poss.getLogin().equals(login)&&poss.getParol().equals(parol)){
                System.out.println("Вы авторизованы");
                ArrayList<Tovar> tovarSpisok = new ArrayList<>();
                tovarSpisok.add(new Tovar("latte" , 150));
                tovarSpisok.add(new Tovar("capuchino", 110));
                tovarSpisok.add(new Tovar("espresso", 80));
                tovarSpisok.add(new Tovar("raf", 200));
                System.out.println(tovarSpisok.toString());



                return true;
            }
        }
        return false;
    }


}
