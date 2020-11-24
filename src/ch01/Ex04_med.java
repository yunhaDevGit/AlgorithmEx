package ch01;

public class Ex04_med {

  static int med(int a, int b, int c){

    if(a >= b) {
      if (b >= c)
        return b;
      else if (a <= c)
        return a;
      else
        return c;
    }
    else if(a > c)
      return c;
    else if(b < c)
      return b;
    else return c;
  }

  public static void main(String[] args) {

    System.out.println(med(4,9,7));

  }

}
