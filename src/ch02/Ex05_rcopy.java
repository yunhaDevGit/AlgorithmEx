package ch02;

import java.util.Scanner;

public class Ex05_rcopy {

  static void rcopy(int[] a,int[] b){
    int length = a.length <= b.length ? a.length : b.length;
    for(int i=0;i<length;i++){
      a[i] = b[length-i-1];
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("a의 요솟수는 ：");
    int numa = scanner.nextInt();
    int[] a = new int[numa];
    for (int i = 0; i < numa; i++) {
      System.out.print("a[" + i + "] : ");
      a[i] = scanner.nextInt();
    }

    System.out.print("b의 요솟수는 ：");
    int numb = scanner.nextInt();
    int[] b = new int[numb];
    for (int i = 0; i < numb; i++) {
      System.out.print("b[" + i + "] : ");
      b[i] = scanner.nextInt();
    }

    rcopy(a,b);

    int length = a.length <= b.length ? a.length : b.length;
    System.out.print("a : ");
    for(int i=0;i<length;i++){
      System.out.print(a[i] + " ");
    }
  }
}
