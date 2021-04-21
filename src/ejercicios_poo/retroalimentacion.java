/*
 metodo con manejo de parametros y retorno de valores
sumatoria de valores desde 5 hasta 10
ejemplo; 5,6,7,8,9,10 5+6=11+7=18...
 */
package ejercicios_poo;
/**
 * @author karen
 */
public class retroalimentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado = sumar(5,10);
        
        System.out.println(resultado);
        
        
    }
    
    public static int sumar(int inicio, int fin){
        
        if(fin>inicio){
            return fin + sumar(inicio,fin-1);
        }else{
            return fin;
        }
    }
}
