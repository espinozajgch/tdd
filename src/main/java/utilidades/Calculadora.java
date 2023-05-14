package utilidades;

public class Calculadora {

    public double sumar (double numero1, double numero2){
        return numero1 + numero2;
    }

    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double dividir(double numero1, double numero2) {

        if(numero2 > 0)
            return numero1 / numero2;
        else
            throw new RuntimeException("No se puede dividir por un numero igual a 0");
    }
}
