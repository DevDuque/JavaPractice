import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        double a, b, resultado;
        char N;

        System.out.println("Entre o numero A");
        a = entrada.nextDouble();
        System.out.println("Entre o numero B");
        b = entrada.nextDouble();

        System.out.println("Entre o operador");
        N = entrada.next().charAt(0);

        switch(N) {
                case '+': {
                    resultado = calc.Soma(a, b);
                    System.out.println("O resultado eh " + resultado);
                    break;
                }
                case '-': {
                    resultado = calc.Subtrair(a, b);
                    System.out.println("O resultado eh " + resultado);
                    break;
                }
                case '*': {
                    resultado = calc.Multiplicar(a, b);
                    System.out.println("O resultado eh " + resultado);
                    break;
                }
                case '/': {
                    resultado = calc.Dividir(a, b);
                    System.out.println("O resultado eh " + resultado);
                    break;
                }
                case '%': {
                    resultado = calc.Porcetagem(a, b);
                    System.out.println("O resultado eh " + resultado);
                    break;
            }
            }
        }
    }