package ch01;

public class Ex03_maxInArray {

  // 가변길이 파라미터
  static int max(int... args){
    int max = -1;

    for(int i=0;i<args.length;i++){
      if(max<args[i])
        max = args[i];
    }
    return max;
  }

  public static void main(String[] args){

    System.out.println(max(4, 2, 7, 3, 6, 10, 7, 4, 8, 3));
  }

}
