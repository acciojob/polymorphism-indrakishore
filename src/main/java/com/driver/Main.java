package com.driver;

import java.util.Scanner;

public class Main {

    static class Product{
        int x;
        int y;
        int z;
        double a;
        double b;

        Product(){
            this.x = x;
            this.y = y;
            this.z = z;
            this.a = a;
            this.b = b;
        }

//        Product(int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//
//        Product(int x, int y, int z){
//            this.x = x;
//            this.y = y;
//            this.z = z;
//        }
//
//        Product(double a, double y){
//            this.a = a;
//            this.b = b;
//        }

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        double a = scn.nextDouble();
        double b = scn.nextDouble();

        Product p = new Product();
        System.out.println(p.product(x,y));
        System.out.println(p.product(x,y,z));
        System.out.println(p.product(a,b));
    }

}