/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author 503
 */
public class Ejercicio {
    
    public static void main(String[] args) {
        
        /*Ejercicio 1*/
        double a= 3+(8*5)-(6/3);
        System.out.println("Resultado " + a);
        
        /*Ejercicio 2*/
        double b= (2.5*2*3)-(4/2)+8;
        System.out.println("Resultado " + b);
        
        /*Ejercicio 3*/
        double c= 2*(6-2.5)/3;
        System.out.println("Resultado " + c);
        
        /*Ejercicio 4*/
        boolean d= 25>18;
        System.out.println("Resultado " + d);

        /*Ejercicio 5*/
         double e= 3+(2.5*4)/3;
         
         double f= (4*5.2)-3.8;
         boolean r = e != f;
         System.out.println("Resultado operacion 1: " +e);
         System.out.println("Resultado operacion 2: " +f);
         System.out.println("Si los valores no son iguales da verdadero de lo contrario da falso:  " +r);
         
         /*Ejercicio 6*/
           double g= (8.5/3.2)+(6.5-(2.3*5)/6);
        System.out.println("el primero" + g);
        double h= 15.8;
        System.out.println("el primero" + h);
        boolean i= g >= h;
        System.out.println("Resultado operación 1: " + i);
        double j= 21.4;
        System.out.println("Resultado " + j);
        double k= (81/4)+2; 
        System.out.println("Segundo "+k);
        boolean l= j<k;
        boolean m= i && l;
        
        System.out.println("Resultado operación 2: " + l);
        System.out.println("Resultado opereracion 3: " + m);
        
        System.out.println("---------------------------------------------------------");
               

    }
    
    
}
