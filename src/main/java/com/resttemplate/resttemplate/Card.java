package com.resttemplate.resttemplate;


import java.io.Serializable;

public class Card implements Serializable {

    private String dest ;
    private String firstName;
    private String lastName;
    private String ownerBank;
    private String trans;

    public Card() {
    }

    public Card(String dest, String firstName, String lastName, String ownerBank, String trans) {
        this.dest = dest;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ownerBank = ownerBank;
        this.trans = trans;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOwnerBank() {
        return ownerBank;
    }

    public void setOwnerBank(String ownerBank) {
        this.ownerBank = ownerBank;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    @Override
    public String toString() {
        return "Card{" +
                "dest='" + dest + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ownerBank='" + ownerBank + '\'' +
                ", trans='" + trans + '\'' +
                '}';
    }
}

