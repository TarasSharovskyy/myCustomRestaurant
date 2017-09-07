package com.test;


public class User {
    private int id;
    private String login;
    private String pass;
    private int amountOfMoney;
    private enum Role{
        CUSTOMER, ADMIN;
    }

    public User(int id, String login, String pass, int amountOfMoney) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.amountOfMoney = amountOfMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
