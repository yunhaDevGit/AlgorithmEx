package ch01;

import java.util.Scanner;

public class Ex16_spira {

  static void spira(int n){

    int lastStarCount = (n-1)*2+1;
    int blanckCount = 1;

    for(int i=1;i<=n;i++){
      int starCount = 1;
      for(int j=1;j<=lastStarCount;j++){
        if(j<=(lastStarCount-blanckCount)/2)
          System.out.print(" ");
        else {
          if (starCount <= (i-1)*2+1) {
            System.out.print("*");
            starCount++;
          }
          else {
            System.out.print(" ");
          }
        }
      }
      blanckCount+=2;
      System.out.println();
    }

  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("n : ");
    int n = scanner.nextInt();
    spira(n);
  }
}
