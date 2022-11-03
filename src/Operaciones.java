import java.util.Scanner;
/**
 *
 * @author Deisy
 */
public class Operaciones {      


    







    //espacios agregados ok

    //atributos
    int numero1;
    int numero2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;
    
    public void leerNumeros(){
        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("escribe el primer numero");
        numero1=sc.nextInt();
        
        System.out.println("escribe el segundo numero");
        numero2=sc.nextInt();
        
    }
    
    public void sumar(){
        sumar=numero1+numero2;
    }
    
    public void restar(){
          restar=numero1-numero2;
    }
    
    
     public void multiplicar(){
          multiplicar=numero1*numero2;
    }
     
     public void dividir(){
          dividir=numero1/numero2;
    
    }
     
     
     public void imprimirResultados(){
         System.out.println("El resultado de la suma es "+sumar);
         System.out.println("El resultado de la resta es "+restar);
         System.out.println("El resultado de la multiplicacion es "+multiplicar);
         System.out.println("El resultado de la division es "+dividir);
     }
     
     //creamos un objeto de la clase operaciones
     
     public static void main (String [] args){
         Operaciones op=new Operaciones();
         //este objeto anterior ya tiene todos los atributos y metodos asignador
         
         //invocando metodos
         op.leerNumeros();
         //explicacion=aqui le decimos que cree el objeto op operaciones y mandara llamar al metodo leernumeros
         op.sumar();
         op.restar();
         op.multiplicar();
         op.dividir();
         op.imprimirResultados();
         
         
     }
}


