package ch01;

import java.util.Scanner;

public class Ex07_for {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("1부터 n까지의 합");
    System.out.println("n : ");
    int n = scanner.nextInt();

    int sum = 0;
    String str = "";

    for (int i=1;i<=n;i++){
      sum += i;
      if(i<n)
        str += i + " + ";
      else
        str += i + " = ";
    }

    System.out.println(str +  sum);

  }

}
