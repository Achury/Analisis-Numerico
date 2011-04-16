package Funciones;
import Interfaz.*;

public class  MetodosUnaVariable {


   public static void busquedasIncrementales(String fun, double xant, double inc, int iter)throws Exception{

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
   public static void Biseccion(String fun, double xi, double xs, double tol, int iter, boolean error)throws Exception{

        JavaParser parser = new JavaParser();

        double yi;
        double ys;
        double xm;
        double ym;
        String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

        yi = parser.FunctionEvaluator(fun, xi);

        ys = parser.FunctionEvaluator(fun, xs);
        if (yi == 0){

            System.out.println(xi + "Es una raiz");
        }else{
              if (ys == 0){

                System.out.println(xs + "Es una raiz");
              }else{
                if (yi * ys >  0){
                    System.out.print("Ese intervalo es inadecuado");
                }else{

                    xm = (xi + xs)/2;
                    ym = parser.FunctionEvaluator(fun, xm);
                    int cont = 1;
                    double eabs = tol + 1;
                    double aux;
                    while (eabs > tol && ym != 0 && cont < iter){

                            if ((yi * ym) < 0){
                                xs = xm;
                                ys = ym;
                            }else{

                                xi =xm;
                                yi = ym;
                            }
                            aux = xm;
                            xm = (xi + xs)/2;
                            ym = parser.FunctionEvaluator(fun, xm);
                            eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, xm, aux));
                            System.out.println(eabs);
                            cont ++;
                    }
                    if (ym == 0){

                        System.out.println(xm + " Es una raiz");
                    }else{
                        if (eabs <= tol){
                            System.out.println(xm + " Es una raiz con error " + eabs);
                        }else{
                            System.out.println("No se encontro ninguna raiz");
                        }

                    }
                 }
            }
        }
    }
    public static void main(String[] args)throws Exception {


    }

}
