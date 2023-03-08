package classe;

public class areaCirc {
    double raio;
    final static double PI = 3.1415;

    areaCirc(double raio){
        this.raio = raio;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }
}
