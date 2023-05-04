public class hexagono {
    double calcularArea(double lado){
        double raiz = Math.sqrt(3);
        return (3*lado*raiz)/2;
    }
    double calcularPerimetro(double lado){
        return lado*6;
    }
}
