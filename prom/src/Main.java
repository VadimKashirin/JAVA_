import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Промежуточная переделываю попытка 3");
        Scanner in = new Scanner(System.in);
        ArrayList<Clients> clients = new ArrayList<>();


        while (true) {
            System.out.println("Нажмите 1 чтобы зарегистрироваться \nНажмите 2 чтобы авторизоваться ");
            int inputMenu = in.nextInt();
            in.nextLine();
            switch (inputMenu) {
                case 1:
                    Clients clients1 = new Clients();
                    System.out.println("Фамилия");
                    clients1.setFirstName(in.nextLine());
                    System.out.println("Имя");
                    clients1.setName(in.nextLine());
                    System.out.println("Отчество");
                    clients1.setLastName(in.nextLine());
                    System.out.println("Введите номер телефона");
                    clients1.setNomerTel(in.nextLine());
                    System.out.println("Введите email");
                    clients1.setEmail(in.nextLine());
                    //System.out.println(email);
                    System.out.println("Введите логин ");
                    clients1.setLogin(in.nextLine());
                    System.out.println("Введите пароль ");
                    clients1.setParol(in.nextLine());
                    System.out.println("Вы зарегистрировались");
                    break;
                case 2:
                    System.out.println("Авторизация");
                    System.out.println("Введите login:");
                    String loginAuth = in.nextLine();
                    System.out.println("Введите password:");
                    String parolAuth = in.nextLine();
                    Clients clients2 = new Clients();
                    for (Clients cl:clients1){
                        System.out.println(clients2.equals(cl));
                    }
//                    boolean nonuniq;
//                    do{
//                        nonuniq=false;
//                        System.out.println("Введите login:");
//                        while (!clients1.setLogin(in.nextLine()))
//                            for(Clients cl:clients){
//                                if(cl.equals(clients1)){
//                                    nonuniq=true;
//                                }
//                            }
//                    }while(nonuniq);
                    break;
                    case 3:
                    return;

            }
        }
    }
}