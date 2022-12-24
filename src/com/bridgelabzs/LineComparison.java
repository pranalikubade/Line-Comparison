package com.bridgelabzs;

public class LineComparison {
    static int x1=5;
    static int y1=6;
    static int x2=8;
    static int y2=10;
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        int length = (int) (Math.sqrt(Math.pow((x2-x1), 2)) + Math.sqrt(Math.pow((y2-y1), 2)) );
        System.out.println("Length of Line : " + length);

    }
}
