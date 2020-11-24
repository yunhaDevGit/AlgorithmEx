package ch01;

import java.util.Scanner;

public class Ex15_triangle {

  static void triangle(int n){

    for(int i=1;i<=n;i++){
      for(int j=0;j<i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("몇 단 삼각형입니까?");
    System.out.print("n : ");
    int n = scanner.nextInt();

    triangle(n);
  }
}
