
import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Digite o primeiro valor: ");
      Double numero_um = teclado.nextDouble();
      System.out.println("Digite o segundo valor:");
      Double numero_dois = teclado.nextDouble();
      System.out.println("Escolha o operador (+,-,/,x):");
      String operador = teclado.next();
      teclado.close();
      Double resultado = null;

      switch(operador){
         case "+":
            resultado = numero_um + numero_dois;
            break;

            case "-":
            resultado = numero_um - numero_dois;
            break;

            case "/":
            resultado = numero_um / numero_dois;
            break;

            case "x":
            resultado = numero_um * numero_dois;
            break;      
         default:
            System.out.println("Algo de errado");        
            break;

      }
      System.out.println(numero_um + " " + operador + " " + numero_dois + " = "+resultado);
    }
 }