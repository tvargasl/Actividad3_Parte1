package misproyectos.actividad3cap4ejercicio23;

public class CalculoEcuacion2do {
    public static double Calculo1(double a, double b, double c){
        double x = (-b +Math.sqrt(Math.pow(b,2)- 4*a*c)) / (2*a);
        
        return x;
    }
    public static double Calculo2(double a, double b, double c){
        double y = (-b -Math.sqrt(Math.pow(b,2)- 4*a*c)) / (2*a);
        return y;
    }
}
