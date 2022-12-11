package org.example;

import java.util.Objects;

public class User implements Cloneable {

    public String userName;
    public int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public boolean equals(User user) {
        return this.hashCode() == user.hashCode();
    }

    @Override
    public String toString() {
        return "Пользователь: " + this.userName + ". Возраст: " + this.age+ " лет";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userName + this.age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

