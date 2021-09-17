import java.util.Scanner;

public class Din_Matrices{
  public static void main(String args[]){
  
  int f, c;
  Scanner input = new Scanner(System.in);
  
  //Rows and columns for the matriz
  System.out.print("Filas: ");
  f = input.nextInt();
  System.out.print("Columnas: ");
  c = input.nextInt();
  int number_proof = 0;


  float matriz [][] = new float [f][c];

  //Giving the values to the matriz
  System.out.println("Coordenadas de la matriz:");
  for(int i=0; i<f; i++){
   for(int j=0; j<c; j++){
    System.out.print("["+i+"]"+"["+j+"]=");
    matriz[i][j] = input.nextFloat();
   }
  }
  
  //Printing out the matriz
  System.out.println(" ");
  System.out.println("==============MATRIZ==============");
  for(int i=0; i<f; i++){
   System.out.print("[  ");
   for(int j=0; j<c; j++){
    System.out.print(matriz[i][j] + "  ");
   }
   System.out.print("]");
   System.out.println("");
  }
  

 }
}
