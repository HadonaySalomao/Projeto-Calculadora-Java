
import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double numero_um;
        Double numero_dois;
        String operador;
        Double resultado;

        System.out.println("Digite o primerio valor:");
        numero_um = teclado.nextDouble();

        System.out.println("Digite o segundo valor:");
        numero_dois = teclado.nextDouble();

        System.out.println("Qual o operador");
        operador = teclado.next();

        switch(operador){
            case "+":
               resultado = numero_um + numero_dois;
               break;
            case "-":
               resultado = numero_um - numero_dois;
               break;            
            case "x":
               resultado = numero_um * numero_dois;
               break;

            case "/":
               resultado = numero_um / numero_dois;
               break;
        }
    }
 }