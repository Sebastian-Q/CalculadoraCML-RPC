package Server;

public class methods {

    //Caso 1 SUMA
    public double sumar(double numero1, double numero2){
        double totalS = numero1 + numero2;
        return totalS;
    }

    //Caso 2 RESTA
    public double resta(double numer1, double numer2){
        double totalR = numer1 - numer2;
        return totalR;
    }

    //Caso 3 MULTIPLICACION
    public double multiplicacion (double numero1, double numero2){
        double totalM = numero1 * numero2;
        return totalM;
    }

    //Caso 4 DIVISION
    public double division(double numero1, double numero2){
        double totalD = numero1 / numero2;
        return totalD;
    }

    //Caso 5 EXPONENTE
    public double exponente(double numero1, double numero2){
        double totalE = 1;
        for (int i=0; i<numero2; i++){
            totalE = totalE * numero1;
        }
        return totalE;
    }

    //Caso 6 RAIZ
    public double raiz(double numero1){
        double totalR = Math.sqrt(numero1);
        return totalR;
    }
}
