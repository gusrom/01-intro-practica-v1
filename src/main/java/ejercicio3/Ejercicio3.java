package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        temperaturasDeUnDia();
    }

    public static void temperaturasDeUnDia(){
        double minimo=100;
        double promedio=0;
        double maximo=0;
        double total=0;
        List<Double> temperaturas = new ArrayList<>();
        Scanner entradas= new Scanner(System.in);
        //cargar valores a la lista
        for(int j=0;j<24;j++){
            System.out.println("Ingrese un numero: ");
            double temp;
            temp=entradas.nextDouble();
            temperaturas.add(temp);
            total+=temp;
        }
        //minimo,maximo y total
        for (int i=0;i<temperaturas.size();i++){
            double actual=temperaturas.get(i);
            if (actual>maximo){
                maximo=temperaturas.get(i);
            }
            if (actual<minimo){
                minimo=temperaturas.get(i);
            }
        }
        //imprimir
        for (int i=0;i<temperaturas.size();i++){
            double actual=temperaturas.get(i);
            System.out.print(i+" " );
            printAsteriscos((int)actual);
            if (minimo==actual){
                System.out.print(temperaturas.get(i)+ "--> MIN \n");
            }
            else if (maximo==actual){
                System.out.print(temperaturas.get(i)+ "--> MAX \n");
            }
            else {
                System.out.print(temperaturas.get(i) + "\n");
            }
        }
        System.out.println(total/temperaturas.size());
    }

    public static void printAsteriscos (int cant) {
        for(int i = 0; i<= cant-1; i++) {
            System.out.print("*");
        }
    }

}
