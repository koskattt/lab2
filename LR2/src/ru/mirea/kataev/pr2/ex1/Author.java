package ru.mirea.kataev.pr2.ex1;
import java.lang.*;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //get & set

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    //toString()

    @Override
    public String toString() {
        return (name + " (" + gender + ") at " + email);
    }
}