package ch01;

import java.util.Scanner;

public class Ex11_digit {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("n : ");
    int n = scanner.nextInt();

    int i = 10;
    int digit = 1;

    while(true){
      if((n/i)>0) {
        i *= 10;
        digit+=1;
      }
      else
        break;
    }

    System.out.println(digit + "자리입니다");

  }
}
