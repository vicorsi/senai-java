import java.util.Scanner;
import java.util.Random;
public class findthetreasure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random t = new Random();
        int[][] matriz = new int[5][5];
        int linha = (int) Math.round(Math.random()*4);
        int coluna = (int) Math.round(Math.random()*4);
        int tesouro = matriz[linha][coluna] = (int) Math.round(Math.random()*5);
        int vida = 5;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" ? ");

            }
            System.out.println();
        }
        while (true){
            System.out.println("Linha: ");
            int respLinha = in.nextInt();
            System.out.println("Coluna: ");
            int respColuna = in.nextInt();

            if(respLinha == linha){
                System.out.println("VOCÊ ACERTOU A LINHA");
            }
            if(respLinha != linha){
                vida -= 1;
                System.out.println("VOCÊ PERDEU UMA VIDA" +
                        " VOCÊ TEM "+vida+" VIDAS");
            }
            if(respColuna == coluna){
                System.out.println("VOCÊ ACERTOU A COLUNA");
            }
            if(respColuna != coluna){
                vida -= 1;
                System.out.println("VOCÊ PERDEU UMA VIDA" +
                        " VOCÊ TEM "+vida+" VIDAS");
            }
            if(vida <= 0){
                System.out.println("VOCÊ PERDEU TODAS AS VIDAS ");
                break;
            }
            if(coluna == respColuna && linha == respLinha){
                System.out.println("VOCÊ ENCONTROU O TESOURO PERDIDO");
                break;
            }


        }



    }
}