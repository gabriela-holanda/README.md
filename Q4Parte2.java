import java.util.Scanner;
public class Q4Parte2 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        double ganho, horas, total, iprenda, inss, sindicato, totalliquido;
        System.out.println("Quanto você ganha por hora? ");
        ganho = input.nextDouble();
        System.out.println("Quantas horas você trabalhou esse mês? ");
        horas = input.nextDouble();
        total = ganho*horas;
        System.out.println("Salário bruto: "+total);
        inss = total*0.11;
        iprenda = total*0.08;
        sindicato = total*0.05;
        totalliquido = total - (inss+iprenda+sindicato);
        System.out.println("Pago ao INSS: R$ "+inss);
        System.out.println("Pago ao sindicato: R$"+sindicato);
        System.out.println("Pago de imposto: R$"+iprenda);
        System.out.println("Salário final: R$"+totalliquido);
        input.close();
        }
    }
}
