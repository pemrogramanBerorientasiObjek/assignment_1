package bagian_1;

import java.util.Scanner;

public class BangunRuang {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Menu pilihan bangun ruang
    System.out.println("Memilih bangun ruang yang ingin dihitung: ");
    System.out.println("1. Balok");
    System.out.println("2. Bola");
    System.out.print("Masukkan pilihan Anda (1/2): ");
    int pilihan = input.nextInt();

    // Menghitung luas permukaan dan volume
    switch (pilihan) {
      case 1:
        // Menghitung luas permukaan dan volume balok
        System.out.println("Masukkan panjang balok: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar balok: ");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi balok: ");
        int tinggi = input.nextInt();

        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Luas permukaan balok: " + balok.getLuasPermukaan());
        System.out.println("Volume balok: " + balok.getVolume());
        break;

      case 2:
        // Menghitung luas permukaan dan volume bola
        System.out.println("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        Bola bola = new Bola(jariJari);
        System.out.println("Luas permukaan bola: " + bola.getLuasPermukaan());
        System.out.println("Volume bola: " + bola.getVolume());
        break;

      default:
        System.out.println("Pilihan Anda tidak valid!");
        break;
    }
  }
}
