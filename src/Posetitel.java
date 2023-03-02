import java.util.Objects;

public class Posetitel {
    private String firstName = "Kashirin";
    private String name = "Vadim";
    private String lastName = "Vadimovich";
    private   String nomerTel = "+79001230338";
    private String email = "taganvadimkaz@mail.ru";
    private String login = "zxc";
    private String parol = "zxc";
    boolean admin = true;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

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

    public void setNomerTel(String nomerTel) {
        this.nomerTel = nomerTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    public Posetitel(){

    }

    public Posetitel(String firstName, String name, String lastName, String nomerTel, String email, String login, String parol) {
        this.firstName = firstName;
        this.name = name;
        this.lastName = lastName;
        this.nomerTel = nomerTel;
        this.email = email;
        this.login = login;
        this.parol = parol;
    }
    public Posetitel(String login,String parol){
        this.login = login;
        this.parol = parol;


    }
    public Posetitel(String login,String parol,boolean admin){
        this.login = login;
        this.parol = parol;
        this.admin = admin;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Posetitel posetitel = (Posetitel) o;

        if (!Objects.equals(login, posetitel.login)) return false;
        return Objects.equals(parol, posetitel.parol);
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (parol != null ? parol.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Posetitel{" +
                "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nomerTel='" + nomerTel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
