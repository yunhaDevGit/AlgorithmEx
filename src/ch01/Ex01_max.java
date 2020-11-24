package ch01;

public class Ex01_max {

  static int max4(int a, int b, int c, int d){

    int max = -1;

    int[] array = {a,b,c,d};

    for(int i=0;i<array.length;i++){
      if(max<array[i])
        max = array[i];
    }


    return max;
  }
  public static void main(String[] args){
    System.out.println(max4(4,8,6,3));
  }
}