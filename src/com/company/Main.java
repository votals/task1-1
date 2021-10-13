package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        class Point {
            double x;
            double y;
        }

        Point a = new Point();
        a.x = 0.0;
        a.y = 0.0;

        Point b = new Point();
        b.x = 2.0;
        b.y = 0.0;

        Point c = new Point();
        c.x = 0.0;
        c.y = 2.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координату х вершины №1");
        int number = scan.nextInt();
        System.out.println("Введите координату y вершины №1");
        int number = scan.nextInt();
        System.out.println("Введите координату x вершины №2");
        int number = scan.nextInt();
        System.out.println("Введите координату y вершины №2");
        int number = scan.nextInt();
        System.out.println("Введите координату х вершины №3");
        int number = scan.nextInt();
        System.out.println("Введите координату y вершины №3");
        int number = scan.nextInt();

        double p = (a + b + c) / 2.0;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь: " + square);


    }
}