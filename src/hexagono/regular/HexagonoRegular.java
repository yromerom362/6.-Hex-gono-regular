 /* EJERCICIO 6 Hexagono Regular
 * YEISSON ROMERO
 * UNIVERSIDAD EAN
 * CONSTRUCCION DE SOFTWARE GUIA 2
 */
package hexagono.regular;

/**
 *Ejerciccio 6
 * @author YROMERO
 */
import java.util.Scanner;

public class HexagonoRegular {

    //Proceso Inicial 
    
    static double Area(double Lado){
     
        double S=0;
        double L=Lado;
        double ap= L/(1.15);
        S=3*L*ap;
                    
        return S;
        
    }
       
    public static void main(String[] args) {
        
        
       double L;
       
       //Proceso Final
       
       
            
       Scanner Teclado= new Scanner (System.in);
        
       //Entrada Inicial
        
       System.out.println("Ingrese la dimension del lado del hexágono: ");
       L = Teclado.nextFloat();
       
       double A= Area(L);
       
       System.out.println("Area del Hexágono: " +A);
      
       //Salida Final 
    }    
}