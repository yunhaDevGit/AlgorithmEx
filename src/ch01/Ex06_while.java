package ch01;

import java.util.Scanner;

public class Ex06_while {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("1부터 n까지의 합");
    System.out.print("n : ");
    int n = scanner.nextInt();

    int sum = 0;
    int i = 1;

    while(i<=n){
      sum+=i;
      i++;
    }
    System.out.println("1부터 " + n + "까지의 합 : " + sum );

  }

}
