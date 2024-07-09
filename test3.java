import java.util.*;
import java.util.LinkedList;
import java.lang.Math;



class test3{

  public static void main(String[] args) {
    int row;
    int col;


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    row = sc.nextInt();
    System.out.println("Enter the number of columns: ");
    col = sc.nextInt();


    int [][] arr = new int[row][col];

    System.out.println("Enter the elements of the array: ");
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("The elements of the array are: ");
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }

}
/*
  Git :-
git is an open source version control system tool that helps to track changes in code
it is used in collaboration
 */
