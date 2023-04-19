package misproyectos.actividad3cap4ejercicio7;

public class Comparación {
    public static String comparacion(double A, double B){
        if(A > B){
            return("El numero A = "+A+" es mayor que el numero B = "+B);
        }else if (A < B){
            return("El numero B = "+B+" es mayor que el numero A = "+A);
        }else{
            return("Los numeros son iguales");
        }
    }
}
