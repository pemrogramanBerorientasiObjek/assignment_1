package bagian_2;

import java.util.ArrayList;

public class Kelas {
 private String className;
 private ArrayList<Double> PBOGrades = new ArrayList<>();

 public Kelas(String className) {
  this.className = className;
 }

 public void addGrade(double grade) {
  PBOGrades.add(grade);
 }

 public ArrayList<Double> getGrades() {
  return PBOGrades;
 }

 public String getClassName() {
  return className;
 }

 public double calculateAverage() {
  double total = 0;
  for (Double grade : PBOGrades) {
   total += grade;
  }
  return total / PBOGrades.size();
 }

 public double getHighestGrade() {
  double highestGrade = Double.MIN_VALUE;
  for (Double grade : PBOGrades) {
   if (grade > highestGrade) {
    highestGrade = grade;
   }
  }
  return highestGrade;
 }

 public double getLowestGrade() {
  double lowestGrade = Double.MAX_VALUE;
  for (Double grade : PBOGrades) {
   if (grade < lowestGrade) {
    lowestGrade = grade;
   }
  }
  return lowestGrade;
 }
}
