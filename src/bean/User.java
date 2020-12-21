package bean;

public class User {
    private int uid;
    private String  username;
    private String password;
    private  int usertype;

    public int getId() {
        return uid;
    }

    public void setId(int id) {
        this.uid = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public User(int id, String username, String password, int usertype) {
        this.uid = id;
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
