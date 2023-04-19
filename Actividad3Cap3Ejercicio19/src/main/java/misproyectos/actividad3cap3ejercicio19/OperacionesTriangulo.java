package misproyectos.actividad3cap3ejercicio19;

public class OperacionesTriangulo {
    public static double calcularPerimetro(double lado){
        double perimetro = lado*3;
        return perimetro;
    }
    
    public static double calcularAltura(double lado){
        double altura =(Math.sqrt(3) * lado) / 2;
        return altura;
    }
    
    public static double calcularArea(double lado){
        double area =(Math.sqrt(3) * Math.pow(lado,2)) / 4;
        return area;
    }
    
}
