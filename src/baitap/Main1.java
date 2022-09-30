package baitap;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2: ax2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        if (a==0){
            System.out.println("He so a phai khac 0");
            return;
        }
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("delta = "+ quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Phuong trinh co nghiem kep la: "+quadraticEquation.motNghiem());
        } else if (quadraticEquation.getDiscriminant()<0) {
            System.out.println("Phuong trinh vo nghiem");
        }else {
            System.out.println("Phuong trinh co 2 nghiem la: ");
            System.out.println("Nghiem 1 la: "+quadraticEquation.getRoot1());
            System.out.println("Nghiem 2 la: "+quadraticEquation.getRoot2());
        }
    }
}
