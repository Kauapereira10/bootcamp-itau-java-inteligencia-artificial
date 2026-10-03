package exercicios;

import java.util.Objects;

public abstract class User {
    private String name;
    private String email;
    private String password;
    private final boolean isAdmin;
    private boolean login;

    public User(String name, String email, String password, boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.login = false;
    }

    public boolean takelogin(String email, String password) {
        if (Objects.equals(email, this.email) && Objects.equals(password, this.password)) {
            return this.login = true;
        } else {
            return this.login;
        }
    }

    public void takingLogout() {
        this.login = false;
    }

    public void changeData(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
    }

    public boolean changePassword(String currentPassword, String newPassword) {
        if (currentPassword.equals(this.password)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
    public boolean isLogin() {
        return login;
    }
}
