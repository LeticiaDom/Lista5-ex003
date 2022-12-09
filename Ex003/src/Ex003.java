import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        double a = sc.nextDouble();
        System.out.println("Informe o segundo numero: ");
        double b = sc.nextDouble();
        System.out.println("Informe o terceiro numero: ");
        double c = sc.nextDouble();
        sc.close();

        double somaAbc = contador(a, b, c);
        System.out.println("A soma dos tres numeros é: " + somaAbc);
        
    } public static double contador(double a, double b, double c) {
        double soma = a + b + c; 
        return soma; 
    }
}
