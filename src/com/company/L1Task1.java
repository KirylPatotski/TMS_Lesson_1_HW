package com.company;
//This class gets your name from the console and says you hello.
public class L1Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               System.out.println("Write down your name here");
               String a = sc.nextString();
        System.out.println("Hello "+ a +" !");
    }
}
