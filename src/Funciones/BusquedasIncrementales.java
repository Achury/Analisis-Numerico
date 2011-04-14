package Funciones;
import Interfaz.*;

public class  BusquedasIncrementales {


   public static void busqueda(String fun, double xant, double inc, int iter)throws Exception{

       JavaParser parser = new JavaParser();


       double arr[];
       double yant;
       double yact;
       double xact;
       int cont;
       yant = parser.FunctionEvaluator(fun, xant);
       if (yant == 0){

            System.out.println( xant + "  El valor introducido es una raiz");
       }else{
        xact = xant + inc;
        yact = parser.FunctionEvaluator(fun, xact);
        cont = 1;
        arr = new double[iter];
        while ((yact*yant) > 0 && cont < iter){
            xant = xact;
            yant = yact;
            xact = xant + inc;
            yact = parser.FunctionEvaluator(fun, xact);
            arr[cont] = yant;
            cont ++;
            System.out.println(xact);

        }
        if (yact == 0) System.out.println(xact + " es una raiz");
        else{
            if ((yact*yant) < 0) System.out.println(xact + " y " + xant + "  Forman un intervalo");
            else{
                    cont = 0;
                    while (cont < arr.length){
                        System.out.println(arr[cont]);
                        cont++;
                    }
                    System.out.println("No se encontro ninguna raiz");
            }
         }

       }
    }
    public static void main(String[] args)throws Exception {


    }

}
