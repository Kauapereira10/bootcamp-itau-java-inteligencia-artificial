package listArrays;

import java.util.Objects;

import static java.util.Objects.hash;

public class User implements Comparable<User>{

    private int code;
    private String name;

    public User() {
    }

    public User(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj instanceof User user) {
            return this.code == user.code && Objects.equals(this.name, user.name);
        }

        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return hash(this.code, this.name);
    }

    @Override
    public int compareTo(User o) {
        int compareResult = 0;
        if (this.getCode() < o.getCode()) compareResult--;
        if (this.getCode() > o.getCode()) compareResult--;
        return compareResult;
    }
}