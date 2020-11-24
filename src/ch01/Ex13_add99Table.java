package ch01;

public class Ex13_add99Table {

  static void addTable(){

    System.out.print("  |");
    for(int l=1;l<10;l++){
      System.out.printf("%3d", l);
    }

    System.out.println("\n--+---------------------------");

    for(int i=1;i<10;i++){
      System.out.printf("%2d", i);
      System.out.print("|");
      for(int j=1;j<10;j++){
        System.out.printf("%3d",i+j);
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    addTable();
  }
}
