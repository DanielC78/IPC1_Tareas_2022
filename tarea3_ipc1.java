import java.util.*;

public class tarea3_ipc1 {


    //Aplicando Quicksort

    public tarea3_ipc1(){

    }

    public static int [] numeros = {7, 5, 8, 11, 2, 3, 5, 7}; 


    public int[] quicksort(int[] arreglo){
        return quicksort(arreglo, 0, numeros.length-1);
    }

    public int[] quicksort(int [] arreglo, int izq, int der){

        if(izq >= der)
        return arreglo;
        int i = izq, d = der;
        if(izq != der){
            int pivote;
            int aux;
            pivote = izq;
            while(izq!= der)
            { imprimirArreglo(arreglo);
                while(arreglo[der] >= arreglo[pivote] && izq < der)
                der--;
            while(arreglo[izq] < arreglo[pivote] && izq < der)
                izq++;
            
                if(der != izq){
                    aux = arreglo[der];
                    arreglo[der] = arreglo[izq];
                    numeros[izq] = aux;
                }


                if(izq == der){
                    quicksort(arreglo, i, izq-1);
                    quicksort(arreglo,izq+1,d);
                }
            } 
        }else{
                return arreglo;
            }
            return arreglo;
    }

    public void imprimirArreglo(int arreglo[]){
        String imp = "";
        for (int i = 0; i < arreglo.length; i++) {
                if(i!= arreglo.length)
                imp += arreglo[i]+",";
                else
                imp+= arreglo[i]+"";
        }
        System.out.println(imp);
    }
    public static void main(String[] args) {
        
        tarea3_ipc1 ob =  new tarea3_ipc1();
        ob.quicksort(numeros);

        int i = 0;
        while(i < numeros.length){
            System.out.println(numeros[i]);
            i++;
        }
    }
}