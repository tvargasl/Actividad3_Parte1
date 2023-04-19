package misproyectos.actividad3cap4ejercicio10;

public class Calculo {
    public static double matricula(double patrimonio, int estrato){
        double pago = 50000;
        if(patrimonio > 2000000 && estrato > 3){
            pago = pago + (patrimonio *0.03);
        }
        return pago;
    }
    
}
