package Arrays;

import java.util.Scanner;

public class ArraysNearestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Verilen dizi
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        // Kullanıcıdan bir sayı al
        System.out.println("Girilen sayı: ");
        int number = input.nextInt();

        // En yakın küçük ve büyük sayılar için değişkenler
        Integer enKucukYakinSayi = null;
        Integer enBuyukYakinSayi = null;

        // Diziyi gezerek uygun sayıları bul
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < number) { // Sayıdan küçük elemanları kontrol et
                if (enKucukYakinSayi == null || dizi[i] > enKucukYakinSayi) {
                    enKucukYakinSayi = dizi[i];
                }
            } else if (dizi[i] > number) { // Sayıdan büyük elemanları kontrol et
                if (enBuyukYakinSayi == null || dizi[i] < enBuyukYakinSayi) {
                    enBuyukYakinSayi = dizi[i];
                }
            }
        }

        // En yakın küçük sayıyı yazdır
        if (enKucukYakinSayi != null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukYakinSayi);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı");
        }

        // En yakın büyük sayıyı yazdır
        if (enBuyukYakinSayi != null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukYakinSayi);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı");
        }

        // Scanner'ı kapat
        input.close();
    }
}
