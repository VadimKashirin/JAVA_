import java.util.Objects;

public class Clients {
    private String firstName = "Kashirin";
    private String name = "Vadim";
    private String lastName = "Vadimovich";
    private   String nomerTel = "+79001230338";
    private String email = "taganvadimkaz@mail.ru";
    private String login = "zxc";
    private String parol = "zxc";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNomerTel() {
        return nomerTel;
    }

    public boolean setNomerTel(String nomerTel) {
        if (nomerTel.matches("(\\+7|7|8)+(\\d{10})")){
            this.nomerTel = nomerTel;
            return true;
        }else{
            System.out.println("Введите корректные данные");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.matches("[a-z0-9_.]+@[a-z]+\\\\.[a-z]{2,3}")) {
            this.email = email;
            return  true;
        }else{
            System.out.println("Введите корректные данные");
            return false;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }
    public Clients(){

    }

    public Clients(String firstName, String name, String lastName, String nomerTel, String email, String login, String parol) {
        this.firstName = firstName;
        this.name = name;
        this.lastName = lastName;
        this.nomerTel = nomerTel;
        this.email = email;
        this.login = login;
        this.parol = parol;
    }
    public Clients(String login,String parol){
        this.login = login;
        this.parol = parol;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clients clients = (Clients) o;

        if (!Objects.equals(login, clients.login)) return false;
        return Objects.equals(parol, clients.parol);
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (parol != null ? parol.hashCode() : 0);
        return result;
    }


}
