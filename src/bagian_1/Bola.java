package bagian_1;

public class Bola {
 private double jariJari;

 // Konstruktor
 public Bola(double jariJari) {
  this.jariJari = jariJari;
 }

 // Hitung luas permukaan
 public double getLuasPermukaan() {
  return 4 * Math.PI * jariJari * jariJari;
 }

 // Hitung volume
 public double getVolume() {
  return (4 / 3) * Math.PI * jariJari * jariJari * jariJari;
 }
}
