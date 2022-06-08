import java.util.Scanner;

public class Galarza_Emilia_Ejercicio01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Ingresa el número hasta el que deseas sumar: ");
    int number = scan.nextInt();
    int suma = 0;
    scan.close();
    for(int i = 1; i <= number; i++){
      suma+= i;
    }
    System.out.println("La suma de los números es: " + suma );
  }
}
