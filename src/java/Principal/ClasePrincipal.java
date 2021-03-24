
package Principal;

import java.util.Scanner;


public class ClasePrincipal {
    public static void main(String[] args) {
        final int serie = 100;
        Scanner entrada = new Scanner(System.in);
        String respuesta; //Almacenamos nuestra metodo para numeros primos en esta variable
        int nVeces; //Numero de entrada del usuario para numeros primos
        
        System.out.print("Digita un numero entero: ");
        nVeces = entrada.nextInt();
        
        int numeroPrimo = 2; //Revisando las respuestas
        
        for (int i=1;i <= nVeces;){
            respuesta = determinarNumeroPrimo(numeroPrimo); // numero primo empieza por 2
            int posicion= respuesta.indexOf(" ");
            
            if  ((respuesta.substring(posicion + 1).equalsIgnoreCase("es primo"))==  true){
                System.out.println(respuesta);
                i++;  //pasamos al siguente valor
            }
            numeroPrimo ++;
        }
    }
    
    //Metodo para determinar valores primos
    public static String determinarNumeroPrimo(int numero){
        String respuesta = "";
        int contador= 0;
        
        for (int i=1;1<=numero;i++){
            if (numero % 1 == 0){
                contador ++; //esto es igual a    contador = contador + 1
            }
        }
        
        if (contador == 2){
            respuesta = numero + " es primo ";
        }else{
            respuesta = numero + " no es primo";
        }
        
        return respuesta;
    }
}
