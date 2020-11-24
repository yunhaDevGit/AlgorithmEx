package ch02;

public class Ex02_swap {

  static void swap(int[] array, int a, int b){
    int tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    int[] array = {5,10,73,2,-5,42};

    for(int i=0;i<array.length;i++){
      System.out.print(array[i] + " ");
    }


    for(int j=0;j<array.length/2;j++){
      System.out.println("\narray["+j+"]와 array["+(array.length-j-1)+"]를 교환합니다");
      swap(array, j, array.length-j-1);
      for (int k = 0; k < array.length; k++) {
        System.out.print(array[k] + " ");
      }
    }
  }

}
