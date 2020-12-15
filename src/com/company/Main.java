package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Game> all_g = new ArrayList<>();
    static ArrayList<Chair> all_c = new ArrayList<>();
    static Game g_1 = new Game("Метро исход", "Шутер", "pc, Xbox one", 3000, 2019, false);
    static Game g_2 = new Game("День победы 4", "Стратегия", "pc", 700, 2016, true);
    static Game g_3 = new Game ("Фар край 5", "Шутер", "pc, ps4", 2000, 2018, true);
    static Game g_4 = new Game ("Forza Horizon 4", "Гонки", "pc, ps4", 1500, 2018, true);
    static Game g_5 = new Game ("Beholder", "Стратегия", "pc", 300, 2016, false);
    static Game g_6 = new Game ("Assasin's creed Unity", "Боевик, открытый мир, историческое", "pc, ps4", 1300, 2014, true);
    static Game g_7 = new Game ("Kingdom come: Deliverence", "Боевик, открытый мир, историческое", "pc", 1500, 2018, false);
    static Game g_8 = new Game("MARVEL’S SPIDER-MAN", "Боевик, Открытый мир", "ps4", 1700, 2018, false);
    static Game g_9 = new Game("God of war", "Боевик", "ps4", 1900, 2018, false);
    static Game g_10 = new Game("GTA 5", "Боевик, Открытый мир", "pc, ps4, xbox", 2500, 2013, true);

    static Chair c_1 = new Chair("Aerocool", 60, 8000, false);
    static Chair c_2 = new Chair("Tiger", 60, 10000, true);
    static Chair c_3 = new Chair("Driver", 50, 6500, false);
    static Chair c_4 = new Chair("Viking", 70, 8000, false);
    static Chair c_5 = new Chair("Neo", 55, 7500, true);


    static Customer a = new Customer("");


    public static void main(String[] args){
        all_g.add(g_1);
        all_g.add(g_2);
        all_g.add(g_3);
        all_g.add(g_4);
        all_g.add(g_5);
        all_g.add(g_6);
        all_g.add(g_7);
        all_g.add(g_8);
        all_g.add(g_9);
        all_g.add(g_10);

        all_c.add(c_1);
        all_c.add(c_2);
        all_c.add(c_3);
        all_c.add(c_4);
        all_c.add(c_5);


        String name, y = "";
        int x;
        System.out.println("Здравствуйте, как вас зовут?");

        name = in.nextLine();
        a.setName(name);
        System.out.println("Если вы хотите купить игру, нажмите 1");
        System.out.println("Если вы хотите купить кресло, нажмите 2");
        x = in.nextInt();
        if (x == 1) {


            System.out.println("Если вы хотите купить определенную игру, то введите 1");
            System.out.println("Если вы хотите подобрать себе игру, то введите 2");
            x = in.nextInt();
            if (x == 1) {
                System.out.println("Введите название игры");
                y = in.nextLine();
                y = in.nextLine();
                find_game(y);
                System.out.println("Дата заказа: " + a.getDate());
                System.out.println("Ваш заказ: " + a.getPurchases());
                System.out.println("Цена: " + a.getAll() + "Р");
                System.out.println("До свидания, " + name + "! Будем рады увидеть вас снова!");
            } else if (x == 2) {
                System.out.println("Введите 0, чтобы посмотреть подобранные игры");
                System.out.println("Введите 1, чтобы найти онлайн игры");
                System.out.println("Введите 2, чтобы ввести максимальную стоимость игры");
                System.out.println("Введите 3, чтобы ввести тип игры");
                boolean x_1 = false;
                int x_2 = 0;
                String x_3 = "";
                x = in.nextInt();
                while (x != 0) {
                    if (x == 1) {
                        for (Game i : all_g) {

                            if (i.isOnline()) {
                                i.info();
                            }
                        }
                        System.out.println("Нажмите 1 чтобы вввести название заинтересовавшей Вас игры");
                        System.out.println("Нажмите 2 чтобы найти новое");
                        x = in.nextInt();
                        if (x == 1) {
                            System.out.println("Введите название: ");
                            y = in.nextLine();
                            y = in.nextLine();
                            find_game(y);
                        } else if (x == 2) {
                            System.out.println("Введите 0, чтобы посмотреть подобранные игры");
                            System.out.println("Введите 1, чтобы найти онлайн игры");
                            System.out.println("Введите 2, чтобы ввести максимальную стоимость игры");
                            System.out.println("Введите 3, чтобы ввести тип игры");
                        }
                    } else if (x == 2) {
                        System.out.println("Максималбная стоимость игры: ");
                        x = in.nextInt();
                        for (Game i : all_g) {
                            if (i.getPrice() <= x) {
                                i.info();
                            }
                        }
                        System.out.println("Нажмите 1 чтобы вввести название заинтересовавшей Вас игры");
                        System.out.println("Нажмите 2 чтобы найти новое");
                        x = in.nextInt();
                        if (x == 1) {
                            System.out.println("Введите название: ");
                            y = in.nextLine();
                            y = in.nextLine();
                            find_game(y);
                            break;
                        } else if (x == 2) {
                            System.out.println("Введите 0, чтобы посмотреть подобранные игры");
                            System.out.println("Введите 1, чтобы найти онлайн игры");
                            System.out.println("Введите 2, чтобы ввести максимальную стоимость игры");
                            System.out.println("Введите 3, чтобы ввести тип игры");
                        }

                    } else if (x == 3) {
                        System.out.println("Введите тип игры: ");
                        y = in.nextLine();
                        y = in.nextLine();
                        ;
                        for (Game i : all_g) {
                            if (i.getType().contains(y)) {
                                i.info();
                            }
                        }
                        System.out.println("Нажмите 1 чтобы вввести название заинтересовавшей Вас игры");
                        System.out.println("Нажмите 2 чтобы найти новое");
                        x = in.nextInt();
                        if (x == 1) {
                            System.out.println("Введите название: ");
                            y = in.nextLine();
                            y = in.nextLine();
                            find_game(y);
                            break;
                        } else if (x == 2) {
                            System.out.println("Введите 0, чтобы посмотреть подобранные игры");
                            System.out.println("Введите 1, чтобы найти онлайн игры");
                            System.out.println("Введите 2, чтобы ввести максимальную стоимость игры");
                            System.out.println("Введите 3, чтобы ввести тип игры");
                        }
                    }
                    x = in.nextInt();
                }
                System.out.println("Дата заказа: " + a.getDate());
                System.out.println("Ваш заказ: " + a.getPurchases());
                System.out.println("Цена: " + a.getAll() + "Р");
                System.out.println("До свидания, " + name + "! Будем рады увидеть вас снова!");


            }
        }
        else if(x == 2){ // Если выбрал кресло
            System.out.println("Нажмите 1, если хотите купить определенное кресло");
            System.out.println("Нажмите 2, если хотите посмотреть кресло из нашего каталога");
            x = in.nextInt();
            if(x == 1){
                System.out.println("Введите название кресла");
                y = in.nextLine();
                y = in.nextLine();
                find_chair(y);
            }
            else if(x == 2){
                for(Chair i: all_c){
                    i.info();
                }
                System.out.println("Нажмите 1, чтобы найти заинтересовавшее вас кресло");
                System.out.println("Нажмите 2, чтобы завершить покупку");
                x = in.nextInt();
                if (x == 1){
                    System.out.println("Введите название кресла");
                    y = in.nextLine();
                    y = in.nextLine();
                    find_chair(y);

                }
            }
            System.out.println("Дата заказа: " + a.getDate());
            System.out.println("Ваш заказ: " + a.getPurchases());
            System.out.println("Цена: " + a.getAll() + "Р");
            System.out.println("До свидания, " + name + "! Будем рады увидеть вас снова!");
        }



    }
    public static void find_chair(String y){
        boolean c = true;
        for(Chair i: all_c) {
            //System.out.println(i.getName());
            if (i.getName().equals(y)) {
                c = false;
                i.info();
                System.out.println("Введите 1, чтобы добавить кресло в заказ");
                System.out.println("Нажмите 2, чтобы завершить поиск");
                int x = in.nextInt();
                if (x == 1) {
                    if (a.getPurchases() == null) {
                        a.setPurchases(i.getName());
                        a.setAll(i.getPrice());
                    } else {
                        a.setPurchases(a.getPurchases() + ", " + i.getName());
                        a.setAll(a.getAll() + i.getPrice());
                    }
                    System.out.println("Ваш текуший заказ: ");
                    System.out.println(a.getPurchases());
                    System.out.println("Всего: " + a.getAll() + "Р");
                    System.out.println("Нажмите 1, чтобы продолжить поиск");
                    System.out.println("Нажмите 2, чтобы завершить поиск");

                    x = in.nextInt();
                    if (x == 1) {
                        System.out.println("Введите название кресла");
                        y = in.nextLine();
                        y = in.nextLine();
                        find_chair(y);
                        return;
                    } else if (x == 2) return;

                } else if (x == 2) {
                    return;
                }
            }
        }
        if(c){
            System.out.println("Вы ввели название неправильно");
            System.out.println("Нажмите 1, если хотите попытаться ещё раз");
            System.out.println("Нажмите 2, чтобы выйти из поиска");
            int x = in.nextInt();
            if (x == 1){
                System.out.println("Введите название кресла");
                y = in.nextLine();
                y = in.nextLine();
                find_chair(y);
                return;
            }

            }

    }
    public static void find_game(String y){
        boolean c = true;
        for(Game i: all_g) {
            if (i.getName().equals(y)) {
                c = false;
                i.info();
                System.out.println("Введите 1, чтобы добавить игру в заказ");
                System.out.println("Нажмите 2, чтобы завершить поиск");
                System.out.println("Нажмите 3, чтобы продолжить поиск");

                int x = in.nextInt();
                if (x == 1) {
                    if (a.getPurchases() == null){
                        a.setPurchases(i.getName());
                        a.setAll(i.getPrice());
                    }
                    else {
                        a.setPurchases(a.getPurchases() + ", " + i.getName());
                        a.setAll(a.getAll() + i.getPrice());
                    }
                    System.out.println("Ваш текуший заказ: ");
                    System.out.println(a.getPurchases());
                    System.out.println("Всего: " + a.getAll() + "Р");
                    System.out.println("Нажмите 1, чтобы продолжить поиск");
                    System.out.println("Нажмите 2, чтобы завершить поиск");

                    x = in.nextInt();
                    if (x == 1){
                        System.out.println("Введите название игры");
                        y = in.nextLine();
                        y = in.nextLine();
                        find_game(y);
                        return;
                    }
                    else if(x == 2) return;

                } else if(x == 2) {
                    System.out.println("Введите название игры");
                    y = in.nextLine();
                    y = in.nextLine();
                   find_game(y);
                   return;
                }
                else if(x == 3){
                    System.out.println("Введите название игры");
                    y = in.nextLine();
                    y = in.nextLine();
                    find_game(y);
                    return;
                }
            }
        }
        if(c){
            System.out.println("Вы ввели название неправильно");
            System.out.println("Нажмите 1, если хотите попытаться ещё раз");
            System.out.println("Нажмите 2, чтобы выйти из поиска");
            int x = in.nextInt();
            if (x == 1){
                System.out.println("Введите название игры");
                y = in.nextLine();
                y = in.nextLine();
                find_game(y);
                return;
            }

        }
    }
}
