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
   public static void reglaFalsa(String fun, double xi, double xs, double tol, int iter, boolean error ) throws Exception{


        JavaParser parser = new JavaParser();
        //double f = Math.sin(xi);
        double yi = parser.FunctionEvaluator(fun, xi);
        //f = Math.sin(xs);
        double ys = parser.FunctionEvaluator(fun, xs);
        String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

        if (yi == 0){
            System.out.println(xi + " Es una raiz");
        }else{
           if (ys == 0){

                System.out.println(xs + " Es una raiz");
           }else{
                if(yi * ys > 0){

                    System.out.println("Ese intervalo es inadecuado");
                }else{

                    double xm = xs - (ys *(xi -xs)/(yi - ys));
                    //f = Math.sin(xm);
                    double ym = parser.FunctionEvaluator(fun, xm);
                    int cont = 1;
                    double eabs = tol + 1;
                    double aux;


                    while (ym != 0 && eabs > tol && cont < iter){

                        if (yi * ym < 0){
                            xs = xm;
                            ys = ym;
                        }else{
                            xi = xm;
                            yi = ym;
                        }

                        aux = xm;
                        xm = xs - (ys *(xi -xs)/(yi - ys));
                        //f = Math.sin(xm);
                        ym = parser.FunctionEvaluator(fun, xm);
                        //eabs = Math.abs(xm - aux);
                        eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, xm, aux));
                        
                        cont ++;
                    }

                    if (ym == 0){
                        System.out.println(xm + " Es una raiz");
                    }else{
                        if (eabs < tol){

                            System.out.println(xm + " Es una raiz con un error " + eabs );
                        }else{
                            System.out.println("No se encontro ninguna raiz con" + iter + " iteraciones");
                        }

                    }
                }

           }

        }
   }
   public static void puntoFijo(String fun, String fun2, double xa, double tol, int iter, boolean error)throws Exception{

    JavaParser parser = new JavaParser();
    //double f = Math.sin(xa);
    double y = parser.FunctionEvaluator(fun, xa);
    double eabs = tol + 1;
    double xn;
    int cont = 0;
    String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

    while (y != 0 && eabs > tol && cont < iter ){

        //double gx = Math.sin(xa) + xa;
        xn = parser.FunctionEvaluator(fun2, xa);
        //f = Math.sin(xn);
        y = parser.FunctionEvaluator(fun, xn);
        //eabs = Math.abs(xn - xa);
        eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, xn, xa));
        xa = xn;
        cont ++;
    }
    if (y == 0){
        System.out.println(xa + " Es una raiz");
    }else{
        if (eabs < tol){
            System.out.println(xa + " Es una raiz con error " + eabs);
        }else{
            System.out.println("No se encontro ninguna raiz con " + iter + " iteraciones");
        }
    }
}
   public static void newton(String fun, String derivada, double x, double tol, int iter, boolean error)throws Exception{

        JavaParser parser = new JavaParser();
        double y = parser.FunctionEvaluator(fun, x);
        double yp = parser.FunctionEvaluator(derivada, x);
        double eabs = tol + 1;
        double x1 = 0;
        int cont = 0;

        String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

        while (y != 0 && eabs > tol && yp != 0 && cont < iter){

            x1 = x - (y / yp);
            y = parser.FunctionEvaluator(fun, x1);
            yp = parser.FunctionEvaluator(derivada, x1);
            eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, x1, x));
            x = x1;
            cont ++;
        }

        if (y == 0){
            System.out.println(x + " Es una raiz con "+ cont + " iteraciones");
        }else{
            if (eabs < tol){
                System.out.println(x1 + " Es una raiz con error " + eabs + " en "+ cont + " iteraciones");
            }else{
                if(yp == 0){
                   System.out.println(x1 + " Es una posilbe raiz multiple");
                }
                System.out.println("NO se encontro ninguna raiz con " +  iter + " iteraciones" );
            }

        }
    }
   public static void secante(String fun,double x0, double x1, double tol, int iter, boolean error)throws Exception{


    JavaParser parser = new JavaParser();
    double x2 = 0;
    int cont = 0;
    double eabs = tol + 1;
    double y0 = parser.FunctionEvaluator(fun, x0);
    double y1 = parser.FunctionEvaluator(fun,x1);
    double den = y1 - y0;
    String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

    if(y0 == 0){
        System.out.println(x0 + " Es una raiz");
    }else
        while (y1 != 0 && eabs > tol && den != 0 && cont < iter ){
        x2 = x1-y1*(x1 - x0)/den;
        eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, x2, x1));
        x0 = x1;
        y0 = y1;
        x1 = x2;
        y1 = parser.FunctionEvaluator(fun, x1);
        den = y1 - y0;
        cont++;
    }
    if (y1 == 0){
    System.out.println(x0 + " Es una raiz");
    }else{
        if (eabs <= tol){
            System.out.println(x0 + " Es una raiz con error " + eabs);
        }else{
            if(den == 0){
                System.out.println("El denominador se hizo 0");
            }else{
                System.out.println("No se encontró ninguna raiz con " + iter + " iteraciones");
            }
        }
   }

 }

   public static void raicesMultiples(String fun, String derivada, String sderivada, double x0, double tol, int iter, boolean error)throws Exception{

    JavaParser parser = new JavaParser();
    double x1;
    double y = parser.FunctionEvaluator(fun, x0);
    double yp = parser.FunctionEvaluator(derivada, x0);
    double ypp = parser.FunctionEvaluator(sderivada, x0);
    int cont = 0;
    double eabs = tol + 1;
    double den = Math.pow(yp,2) - (y * ypp);
    String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }
    while (y != 0 && eabs > tol && den != 0 && cont < iter ){

        x1 = x0 - (y * yp)/den;
        y = parser.FunctionEvaluator(fun, x1);
        eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, x1, x0));
        x0 = x1;
        yp = parser.FunctionEvaluator(derivada, x0);
        ypp = parser.FunctionEvaluator(sderivada, x0);
        den = Math.pow(yp,2) - (y * ypp);
        cont++;
    }

   if (y == 0){
    System.out.println(x0 + " Es una raiz");
   }else{
        if (eabs <= tol){
            System.out.println(x0 + " Es una raiz con error" + eabs);
        }else{
            if(den == 0){
                System.out.println("El denominador se hiza 0");
            }else{
                System.out.println("No se encontro ninguna raiz con " + iter + " iteraciones");
            }
        }
   }

}


    public static void main(String[] args)throws Exception {


    }

}
