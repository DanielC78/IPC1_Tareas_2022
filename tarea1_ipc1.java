import java.util.*;

public class tarea1_ipc1 {


    public static void main(String[] args) {

        
        
        int numero;
        String pregunta = " ";
        boolean validacion1 = true;
        Scanner entrada = new Scanner(System.in);
        Scanner pr = new Scanner(System.in);


        int nFilas = 7;
        int nCol = 6;
        int division = entrada.nextInt();
        double porcentajeD= (nFilas*nCol)*(division/100);

        System.out.print(porcentajeD);

        
        while (validacion1) {
            boolean validacion2 = true;
            System.out.println("Ingrese un número entero: \n");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.print("El número: " + numero + " es par\n");
            } else {
                System.out.print("El número: " + numero + " es impar\n");
            }

            while (validacion2) {
                System.out.println("¿Deseas comprobar otro número? Escribe SI o NO\n");
                pregunta = pr.nextLine();

                if (pregunta.toUpperCase().equalsIgnoreCase("si")) {
                    validacion1 = true;
                    validacion2 = false;
                } else if (pregunta.toUpperCase().equalsIgnoreCase("no")) {
                    validacion1 = false;
                    validacion2 = false;
                    System.out.println("¡Hasta pronto!");

                } else {
                    System.out.println("Debes escribir SI o No");
                    validacion2 = true;
                    validacion1 = true;
                }
            }

        }
    }
}