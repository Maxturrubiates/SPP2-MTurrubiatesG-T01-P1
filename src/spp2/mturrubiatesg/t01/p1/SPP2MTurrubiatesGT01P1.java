/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.t01.p1;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Calculadora de promedio");
        String mat, res;
        double cal1, cal2, cal3, cal4, cal5, pro;
        System.out.println("Introduce tu matrícula:");
        mat= teclado.next();
        System.out.println("Introduce tu calificacion 1:");
        cal1= teclado.nextDouble();
        System.out.println("Introduce tu calificacion 2");
        cal2= teclado.nextDouble();
        System.out.println("Introduce tu calificacion 3");
        cal3= teclado.nextDouble();
        System.out.println("Introduce tu calificacion 4");
        cal4= teclado.nextDouble();
        System.out.println("Introduce tu calificacion 5");
        cal5= teclado.nextDouble();
        
        pro= ((cal1+cal2+cal3+cal4+cal5)/5);
        System.out.println("Promedio= "+pro);
        if (pro>=7){System.out.println("Aprovado");}
        else {System.out.println("Reprobado");}
        // TODO code application logic here
    }
    
}
