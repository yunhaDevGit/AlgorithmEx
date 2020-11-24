package ch02;

public class Ex03_sumOf {

  static int sumOf(int[] array){
    int sum = 0;
    for(int i=0;i<array.length;i++){
      sum+=array[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    int[] array = {4,2,75,24,6,1};

    System.out.println(sumOf(array));
  }
}
