package com.belajar;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        double a,b,hasil;
        char operator;

        Scanner inputUser = new Scanner(System.in);


        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama = ");
        a = inputUser.nextDouble();
        System.out.print("Pilih operator + | - | x | / = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Masukkan angka Kedua = ");
        b = inputUser.nextDouble();

        System.out.println("Input user : " + a + " " + operator + " " + b);

        //Kalkulator dengan Switch
        switch (operator){
            case '+' :
                hasil = a+b;
                System.out.print("Hasilnya = " + hasil);
                break;
            case '-' :
                hasil = a-b;
                System.out.print("Hasilnya = " + hasil);
                break;
            case '*': case 'x':
                hasil = a*b;
                System.out.print("Hasilnya = " + hasil);
                break;
            case '/' :
                hasil = a/b;
                if (b==0) {
                    System.out.println("Hasil tidak terhingga / invicble");
                }else{
                    System.out.print("Hasilnya = " + hasil);
                }
                break;
            default:
                System.out.print("Operator salah, Hasil tidak ditemukan");
        }

        //Kalkulator dengan if else
        /*if (operator == '+') {
            hasil = a+b;
            System.out.print("Hasilnya = " + hasil);
        }else if (operator == '-') {
            hasil = a-b;
            System.out.print("Hasilnya = " + hasil);
        }else if (operator == 'x' || operator == '*') {
            hasil = a*b;
            System.out.print("Hasilnya = " + hasil);
        }else if (operator == '/') {
            hasil = a/b;
            System.out.print("Hasilnya = " + hasil);
        }else {
            System.out.println("Operator Salah, Hasil tidak ditemukan");
        }*/
    }
}