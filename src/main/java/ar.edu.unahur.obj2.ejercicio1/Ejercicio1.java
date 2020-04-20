package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;



public class Ejercicio1 {

    public static void main(String[] args) {


    }

    public static void ingresarNumeros() {
        Scanner numeros = new Scanner(System.in);
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un numero: \n");
            vector[i] = numeros.nextInt();
        }
        for (int j = 9; j >= 0; j--) {
            System.out.print(vector[j] + " \n");
        }
    }

    public static void mayoresQue(){
        Scanner numeros=new Scanner(System.in);
        int [] vector=new int [20];
        System.out.println("Introduzca un nunmero: \n" );
        int numero=numeros.nextInt();
        for(int i=0;i<20;i++){
            System.out.println("Ingrese un numero: \n" );
            vector[i]=numeros.nextInt();
        }
        for (int j=0;j<vector.length;j++){
            if (vector[j]>numero){
                System.out.println(vector[j]+ "\t" );
            }
        }
    }


}
