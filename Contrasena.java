import java.util.Scanner;

public class Contrasena{
  public static void main(String args[]){
  
  String User = "";
  String Password = "";
  Scanner entrada = new Scanner(System.in);
 
  System.out.print("Username name: ");
  User = entrada.nextLine();
  
  if(User.equals("Brayan")){
   System.out.print("Password: ");
   Password = entrada.nextLine();

   if(Password.equals("LosPollitos235")){
    System.out.println("Login");
   }else{System.out.println("Wrong password :/ :v");}

  }else{System.out.println("Wrong username :/ :v");}
  
 }
}
