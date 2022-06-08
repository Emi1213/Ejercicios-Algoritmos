import java.util.Scanner;

public class Galarza_Emilia_Ejercicio03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Los números a ingresar son: 2,5,9,3,-1,4
    boolean exit = false;
    int suma = 0;
    do {
      System.out.println("Ingrese un número: ");
      int number = scan.nextInt();
      if (number > 0){
        suma += number;
      } else{
        exit = true;
      }
    } while (!exit);
    System.out.println("La suma total es: " + suma);
    scan.close();
  }
}
