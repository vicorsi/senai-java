import java.util.Scanner;
public class matematica extends operacoes {

    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao(){
        System.out.println("Calcular área de um retângulo");
        System.out.println("Informe a base: ");
        double base = in.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = in.nextDouble();
        double area = base*altura;
        System.out.println("Resultado de Área: "+area);
        return area;
    }
}
class matematica2 extends operacoes{
    Scanner in = new Scanner(System.in);
    @Override
    public double multiplicacao() {
        System.out.println("Calcular a área do circulo");
        System.out.println("Qual o valor do raio: ");
        double raio = in.nextDouble();
        double resultado = (raio*raio)*3.14;
        System.out.println("Resultado:");
        return resultado;
    }
}
class matematica3 extends operacoes{
    Scanner in = new Scanner(System.in);

    @Override
    public double multiplicacao(){
        System.out.println("Calcular o comprimento do triangulo");
        System.out.println("Qual é o comprimento da base: ");
        double base = in.nextDouble();
        System.out.println("Qual é o comprimento da altura: ");
        double altura = in.nextDouble();
        double resultado = base*altura/2;
        System.out.println("Resultado:");
        return resultado;
    }

    public static void main(String[] args) {
        matematica m = new matematica();
        m.multiplicacao();
        matematica2 m2 = new matematica2();
        m2.multiplicacao();
        matematica3 m3 = new matematica3();
        m3.multiplicacao();
    }
}