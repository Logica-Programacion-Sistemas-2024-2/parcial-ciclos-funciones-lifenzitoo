/*
 * This source file was generated by the Gradle 'init' task
 */
package parcial;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        
        try {   
            int vehiculos = 0;
            int combustibleNecesarios = 0;
            int kmRecorrido = 0;
            float km;
            int metros = 0;
            

                Scanner sc = new Scanner(System.in);

                System.out.println(" ingrese cuantos vehiculos participaron : ");
                vehiculos = sc.nextInt();
                sc.nextLine();

               
            if(vehiculos > 0){

    
                for(int i = 1 ; i <= vehiculos; i++ ){
                    

                    System.out.println("ingrese cuantos metros recorrio el vehiculo : (ingresa 0 para salir)" );
                    metros = sc.nextInt();

                    km = metros / 1000;

                    float gasolina = calcularConsumoGasolina(km);

                    kmRecorrido = (int)gasolina;

                    System.out.println("ingresa la cantidad de los vehiculos " + i + ":" + metros + "metros" + "\n" + "vehiculo" + i +" : " + km + "km" + kmRecorrido + "litros de gasolina");
                }

                
                
                System.out.println(" total de gasolina consumida por los " + vehiculos + "vehiculos :"  + "litros totales" );


    

            }
            else{
                System.out.println("no ingresaste la cantidad de vehiculos");
            }

          
                


            


        } catch (Exception e) {
            System.out.println(" error " + e.getMessage());
        }
        
    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio

    public static float calcularConsumoGasolina(float km){
        try {
            return ((km * 55) / 750);

        } catch (Exception e) {
            return -1;
        }
    }



    
   

    //------------------------------------------------------------------

}
