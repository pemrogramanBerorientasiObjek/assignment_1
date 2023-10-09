package bagian_2;

import java.util.*;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  Map<String, Kelas> classList = new HashMap<>();

  while (true) {
   System.out.println("Menu:");
   System.out.println("1. Input Nilai PBO");
   System.out.println("2. Lihat Statistik");
   System.out.println("3. Keluar");
   System.out.print("Pilih menu (1/2/3): ");
   int choice = scanner.nextInt();

   if (choice == 1) {
    System.out.print("Masukkan nama kelas: ");
    String className = scanner.next();
    Kelas classroom = classList.get(className);

    if (classroom == null) {
     classroom = new Kelas(className);
     classList.put(className, classroom);
    }

    System.out.print("Masukkan nilai PBO: ");
    double PBOGrade = scanner.nextDouble();
    classroom.addGrade(PBOGrade);
    System.out.println("Nilai PBO berhasil ditambahkan ke kelas " + classroom.getClassName());
   } else if (choice == 2) {
    if (classList.isEmpty()) {
     System.out.println("Belum ada data nilai PBO yang dimasukkan.");
    } else {
     System.out.println("Statistik Nilai PBO:");
     for (Kelas classroom : classList.values()) {
      System.out.println("Kelas: " + classroom.getClassName());
      System.out.println("Nilai yang sudah disimpan: " + classroom.getGrades());
      System.out.println("Rata-rata: " + classroom.calculateAverage());
      System.out.println("Nilai tertinggi: " + classroom.getHighestGrade());
      System.out.println("Nilai terendah: " + classroom.getLowestGrade());
     }

     double overallAverage = 0;
     double highestOverallGrade = Double.MIN_VALUE;
     double lowestOverallGrade = Double.MAX_VALUE;

     for (Kelas classroom : classList.values()) {
      overallAverage += classroom.calculateAverage();

      if (classroom.getHighestGrade() > highestOverallGrade) {
       highestOverallGrade = classroom.getHighestGrade();
      }

      if (classroom.getLowestGrade() < lowestOverallGrade) {
       lowestOverallGrade = classroom.getLowestGrade();
      }
     }

     overallAverage /= classList.size();

     System.out.println("Rata-rata Keseluruhan: " + overallAverage);
     System.out.println("Nilai tertinggi Keseluruhan: " + highestOverallGrade);
     System.out.println("Nilai terendah Keseluruhan: " + lowestOverallGrade);
    }
   } else if (choice == 3) {
    System.out.println("Terima kasih telah menggunakan program ini.");
    break;
   } else {
    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
   }
  }

  scanner.close();
 }
}