public class CalculoMédia {
    public static void main(String[] args) {
        double fist = 5;
        double secont = 8;
        double tres = 9.5;
        double media = (fist + secont + tres)/3;

        System.out.println("Sua média é:" + media);

        if (media >= 7){
        System.out.println("Situação: APROVADO");
        } else if (media >= 5)
        System.out.println("Situação: REPROVADO");
    }
}
