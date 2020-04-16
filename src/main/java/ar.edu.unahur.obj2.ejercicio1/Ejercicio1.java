package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        int[] l1= ingresarNumeros();
    }

    public static int[] ingresarNumeros(){
        Scanner entrada = new Scanner(System.in);
        int longitud =entrada.nextInt();
        int [] vector = new int [longitud];
        for(int i=0; i<vector.length;i++){
            Scanner numeros= new Scanner(System.in);
            vector[i]=entrada.nextInt();
        }
        return vector;
    }
    public int[] ordenar(int [] lista) {
        int j=0;
        int [] vectorInvertido=new int[lista.length];
        for(int i=lista.length-1;i==0;i--){
            vectorInvertido[j]=lista[i];
        }
        return vectorInvertido;
    }
}
