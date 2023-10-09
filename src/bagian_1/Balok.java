package bagian_1;

public class Balok {
 private int panjang;
 private int lebar;
 private int tinggi;

 // Konstruktor
 public Balok(int panjang, int lebar, int tinggi) {
  this.panjang = panjang;
  this.lebar = lebar;
  this.tinggi = tinggi;
 }

 // Hitung luas permukaan
 public double getLuasPermukaan() {
  return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
 }

 // Hitung volume
 public double getVolume() {
  return panjang * lebar * tinggi;
 }
}
