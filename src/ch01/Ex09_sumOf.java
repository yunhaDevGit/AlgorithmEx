package ch01;

import java.util.Scanner;

public class Ex09_sumOf {

  static int sumOf(int a, int b){

    int max = 0;
    int min = 0;
    int sum = 0;

    if(a>b) {
      max = a;
      min = b;
    }else{
      max = b;
      min = a;
    }

    for(int i=min;i<=max;i++){
      sum+=i;
    }

    return sum;
  }
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("1부터 n까지의 합");

    System.out.print("a : ");
    int a = scanner.nextInt();

    System.out.print("b : ");
    int b = scanner.nextInt();

    System.out.println(sumOf(a,b));

  }
}
