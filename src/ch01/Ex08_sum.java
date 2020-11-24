package ch01;

import java.util.Scanner;

public class Ex08_sum {

  static int sum(int n){
    return n*(n+1)/2;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("1부터 n까지의 합");
    System.out.print("n : ");
    int n = scanner.nextInt();

    System.out.println(sum(n));
  }

}
