public class cone {
    double calcularVolume(double areaBase, double altura){
        return areaBase*altura/3;
    }
    double calcularAreaSuperficial(double raio, double geratriz){
        double pi = 3.14;
        return pi*raio*(raio+geratriz);
    }
}
