import java.util.InputMismatchException;
import java.util.Scanner;

public class treinandoExcessoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite um número:");
            int numero1 = sc.nextInt();
            System.out.println("Digite outro número:");
            int numero2 = sc.nextInt();
            int resultado = numero1 / numero2;
            System.out.println("O resultado da divisão é: "+ resultado);
        }
        catch(InputMismatchException | ArithmeticException e) {
            System.out.println("Não é possível efetuar a divisão com dados inválidos!");
            }
        }

    }

