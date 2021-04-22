/*
 uso de operadores
 */
package ejercicios_poo;

/**
 *
 * @author karen
 */
public class operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=20, b=10, c=0, d=20, e=40, f=30;
        boolean condition=true;
        
        //operador de pre-incremento
        //a=a+1 entonces c=a
        c=++a;
        System.out.println("valor de c(++a)= "+c);
         //operador de post incremento(b toma valor  
         //c=b entonces b=b+1
         c=++b;
         System.out.println("valor de c(++b)= "+c);
         //operador preincremento
         //d=d-1 entonces c=d
         c=-d;
         System.out.println("valor de c(-d): "+c);
         //operador de postcremento
         //c=e entonces e=e-1(e toma el valor de 39)
         c=-e;
         System.out.println("valor de c(-e): "+c);
         //operador logico not
         System.out.println("valor de !condition= "+!condition);
         
    }
    
}
