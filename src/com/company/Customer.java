package com.company;

import java.util.Date;

public class Customer {
    Date date = new Date();
    String name, purchases;
    int all;
    Customer (String name){
        this.name = name;
    }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPurchases() { return purchases; }

    public void setPurchases(String purchases) { this.purchases = purchases; }

    public int getAll() { return all; }

    public void setAll(int all) { this.all = all; }



}
