package model;

public class User {
    String username;

    public User() {
        this.username = getUsername();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
