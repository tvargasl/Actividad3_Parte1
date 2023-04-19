package misproyectos.actividad3cap3ejercicio18;

public class Salarios {
    public static double calcularBruto(double horas, double valorhora){
        double bruto = horas * valorhora;
        return bruto;
    }
    public static double calcularNeto(double bruto, double retencion){
        retencion = retencion/100;
        double neto = bruto - (bruto * retencion);
        return neto;
    }
    
}
