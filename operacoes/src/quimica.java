import java.util.Scanner;
public class quimica extends operacoes {

    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao() {
        System.out.println("Converter Quilograma para grama");
        System.out.println("Digite a quantidade de kg");
        double kg = in.nextDouble();
        double grama = kg*1000;
        return grama;
    }
}
class quimica2 extends operacoes{

    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao(){
        System.out.println("Converter Quilograma para Stone");
        System.out.println("Digite a quantidade de kg");
        double kg = in.nextDouble();
        double stone = kg/6.35;
        return stone;
    }
}
class quimica3 extends operacoes{

    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao(){
        System.out.println("Converter Quilograma para Onça");
        System.out.println("Digite a quantidade de kg");
        double kg = in.nextDouble();
        double onca = kg*35.274;
        return onca;
    }
}