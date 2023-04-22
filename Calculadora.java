import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();
        
        Calculadora calculadora = new Calculadora();
        System.out.println("La suma es: " + calculadora.sumar(numero1, numero2));
        System.out.println("La resta es: " + calculadora.restar(numero1, numero2));
        System.out.println("La multiplicación es: " + calculadora.multiplicar(numero1, numero2));
        System.out.println("La división es: " + calculadora.dividir(numero1, numero2));
    }
    
    public double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }
    
    public double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }
    
    public double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }
    
    public double dividir(double unNumero, double otroNumero) {
        if (otroNumero == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return unNumero / otroNumero;
    }
}
