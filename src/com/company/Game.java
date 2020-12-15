package com.company;

public class Game {
    String name = "", type, device;
    int price, year;
    boolean online;
    Game (String name, String type,String device, int price, int year, boolean online){
        this.name = name;
        this.type = type;
        this.device = device;
        this.price = price;
        this.year = year;
        this.online = online;
    }
    public int getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public boolean isOnline() {
        return online;
    }

    public String getDevice() {
        return device;
    }
    public void info(){
        System.out.println("Название: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Под какое устройство: " + device);
        System.out.println("Цена: " + price + "Р");
        System.out.println("Год: " + year);
        if(online) System.out.println("Имеется возможность игры с друзьями");
        else System.out.println("Возможности игры с друзьями нет");
        System.out.println();
    }
}
