package ch01;

import java.util.Scanner;

public class Ex10_minus {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("a : ");
    int a = scanner.nextInt();
    System.out.print("b : ");
    int b = scanner.nextInt();

    if(b<=a){
      System.out.println("a보다 큰 값을 입력하세요");
      System.out.print("b : ");
      b = scanner.nextInt();
    }

    System.out.println("b-a : " + (b-a));

  }

}
