import java.util.Scanner;

public class Galarza_Emilia_Ejercicio02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int contador = 0;
    int total = 0;
    do{
      System.out.print("Ingresa el número: ");
      int num = scan.nextInt();
      contador++;
      if(num % 2 == 0){
        total++;
      }
    }while(contador != 10);
    scan.close();
    System.out.println("Numeros ingresados: " + contador);
    System.out.println("Numeros pares ingresados: " + total);
  }
}
