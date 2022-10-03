import java.util.Scanner;

class list01_atv09{
    public static void main (String[]args) {
        System.out.println("Conversor de Fahrenheit para Celsius.\n");
        Double tempF;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        tempF = sc.nextDouble();
        var tempC = (5*(tempF-32)/9);
        System.out.println(" ");
        System.out.printf ("Temperatua em Celsius = °C %.1f %n",tempC);
        sc.close();
    }
}