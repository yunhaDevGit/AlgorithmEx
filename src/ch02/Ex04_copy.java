package ch02;

public class Ex04_copy {

  static void copy(int[] a, int[] b){
    int num = a.length <= b.length ? a.length : b.length;
    for(int i=0;i<num;i++)
      a[i] = b[i];
  }
  public static void main(String[] args) {

    int a[] = {2,6,3,72,23};
    int b[] = {5,7,34,3,2};

    copy(a,b);

    for(int i=0;i<a.length;i++){
      System.out.print(a[i] + " ");
    }
  }
}