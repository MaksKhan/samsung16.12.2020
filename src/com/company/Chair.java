package com.company;

public class Chair {
    String name;
    int height, price;
    boolean ortoped;

    public Chair(String name, int height, int price, boolean ortoped) {
        this.name = name;
        this.height = height;
        this.price = price;
        this.ortoped = ortoped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height = height; }

    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price; }

    public boolean isOrtoped() { return ortoped; }

    public void setOrtoped(boolean ortoped) { this.ortoped = ortoped; }
    public void info(){
        System.out.println("Название " + name);
        System.out.println("Цена: " + price);
        System.out.println("Высота " + height);
        if (ortoped) {
            System.out.println("Кресло является ортопедическим");
        } else System.out.println("Кресло не является ортопедическим");
        System.out.println();
    }
}
