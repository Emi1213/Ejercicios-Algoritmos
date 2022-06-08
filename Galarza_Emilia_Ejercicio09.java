import java.util.Scanner;

public class Galarza_Emilia_Ejercicio09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = 0;
    System.out.println("Ingrese un número");
    int p = scan.nextInt();
    scan.close();
    while (p <=7) {
      x++;
      p++;
    }
    System.out.println("El nuevo valor de x es: " + x);
  }
}
