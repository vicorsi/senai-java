import java.util.Scanner;

public class fisica extends operacoes {
    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao(){
        System.out.println("Converter mAh para Coulomb");
        System.out.println("Entre com o mAh");
        int mah = in.nextInt();
        double coulomb = 3600*mah*(Math.pow(10, -3));
        System.out.println(coulomb+" C");
        return coulomb;
    }

    public static void main(String[] args) {
        fisica v = new fisica();
        v.multiplicacao();
        fisica v2 = new fisica();
        v2.multiplicacao();
        fisica v3 = new fisica();
        v3.multiplicacao();
    }


class multiplicacao2 extends operacoes{

    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao() {
        System.out.println("Converter celsius para fahrenheit");
        System.out.println("Digite o celsius:");
        double cel = in.nextDouble();
        double fah = (cel*1.8) + 32;
        System.out.println("Resultado em fahrenheit");
        return fah;
    }
}
class multiplicacao3 extends operacoes {
    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao() {
        System.out.println("Converter fahrenheit para celsius");
        System.out.println("Digite o fahrenheit:");
        double fah = in.nextDouble();
        double cel = (fah-32)/1.8;
        System.out.println("Resultado:");
        return cel;
    }
}
}