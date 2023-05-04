public class cilindro {
    double calcularVolume(double raio, double altura) {
        double pi = 3.14;
        return pi*(raio*raio)*altura;
    }
    double calcularAreaSuperficial(double raio, double altura) {
        double pi = 3.14;
        return 2*pi*raio*altura+(pi*pi)*(raio*raio);
    }
}
