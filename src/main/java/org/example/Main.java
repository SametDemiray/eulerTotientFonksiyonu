package org.example;
/*
Totient (kısaca φ, n) sayılar teorisinde, bir tam sayının o sayıdan daha küçük ve o sayı ile aralarında asal olan sayma sayı sayısını
belirten fonksiyondur. Genellikle Euler Totient ya da Euler'in Totienti olarak adlandırılan Totient, İsviçreli matematikçi
Leonhard Euler tarafından yaratılmıştır.Şifreleme(kripto) uygulamalarında sıklıkla kullanılır.
Totient fonksiyonu, Yunan harflerinden φ ile simgelendiği için Fi fonksiyonu olarak da anılabilir.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tamsayı girin: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Lütfen pozitif bir tamsayı girin!");
        } else {
            int totient = eulerTotient(number);
            System.out.println("Totient(" + number + ") = " + totient);
        }
        scanner.close();
    }

    // İki sayının en büyük ortak bölenini bulan metot
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Euler totient fonksiyonunu hesaplayan metot
    static int eulerTotient(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            if (gcd(i, n) == 1) {
                result++;
            }
        }
        return result;
    }
}