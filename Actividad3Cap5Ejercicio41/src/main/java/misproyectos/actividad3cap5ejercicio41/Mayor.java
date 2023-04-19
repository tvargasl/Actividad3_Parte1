package misproyectos.actividad3cap5ejercicio41;

public class Mayor {
    public static double encontrar(String numeros){
        double mayor;
        String[] lista = numeros.split(",");
        mayor = Double.valueOf(lista[0]);
        
        for(int i=0; i < lista.length; i++){
            if (Double.valueOf(lista[i]) > mayor){
                mayor = Double.valueOf(lista[i]);
            }
        }
        
        
    return mayor;    
    }
}
