package HW_3.task3;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void doAdmin() {
        this.isAdmin = true;
        this.isAuthenticate = true;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return this.isAuthenticate;
    }
}
