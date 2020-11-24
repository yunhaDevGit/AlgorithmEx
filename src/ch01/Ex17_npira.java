package ch01;

import java.util.Scanner;

public class Ex17_npira {

  static void npira(int n){

    for(int i=1;i<=n;i++){
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 - 1; k++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("n : ");
    int n = scanner.nextInt();

    npira(n);
  }
}
