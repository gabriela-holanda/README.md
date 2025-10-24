import java.util.Scanner;
public class Q3Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ganho, horas, total;
        System.out.println("Quanto você ganha por hora? ");
        ganho = input.nextDouble();
        System.out.println("Quantas horas você trabalhou esse mês? ");
        horas = input.nextDouble();
        total = ganho*horas;
        System.out.println("Salário final: "+total);
        input.close();
    }
}