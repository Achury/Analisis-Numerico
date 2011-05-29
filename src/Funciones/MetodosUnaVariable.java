package Funciones;
import Interfaz.*;

public class  MetodosUnaVariable {

 public static String str1;
 public static double arr[] = null;
 public static double arry[] = null;
 public static double arrxs[] = null;
 public static double arrxm[] = null;
 public static double arrerror[] = null;
 public static double arrden[] = null;
 public static int cont;



   public static void  busquedasIncrementales(String fun, double xant, double inc, int iter)throws Exception{

       JavaParser parser = new JavaParser();
       str1 = "";
       String str2 = "";
       String str3 = "";
       double yant;
       double yact;
       double xact = 0;
       cont = 1 ;
       yant = parser.FunctionEvaluator(fun, xant);

       if (yant == 0){
            str1 = xant + "  El valor introducido es una raiz";
       }else{
        xact = xant + inc;
        yact = parser.FunctionEvaluator(fun, xact);
        cont = 1;

        arr = new double[iter];
        arry = new double[iter];
        arr[0] = xant;
        arry[0] = yant;
        arr[1] = xact;
        arry[1] = yact;
        
        while ((yact * yant) > 0 && cont < iter){
            xant = xact;
            yant = yact;
            xact = xant + inc;
            yact = parser.FunctionEvaluator(fun, xact);
            arr[cont + 1] = xact;
            arry[cont + 1] = yact;
            cont ++;
        }

        arr[cont + 3] = xact;
        arry[cont + 3] = yact;

        if (yact == 0)
            str1 = xact + "es una raiz";
        else{
            if ((yact * yant) < 0)

                if (xact < xant){
                    str1 = xact + " y " + xant + "  Forman un intervalo";
                }else{
                    str1 = xant + " y " + xact + "  Forman un intervalo";
                }
            else{
                
                
                str1 = "No se encontro ninguna raiz";
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
        arr = new double[iter];
        arry = new double[iter];
        arrxs = new double[iter];
        arrxm = new double[iter];
        arrerror = new double[iter];
        arr[0] = xi;
        arrxs[0] = xs;
        String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

        yi = parser.FunctionEvaluator(fun, xi);
        ys = parser.FunctionEvaluator(fun, xs);
        cont = 1;

        if (yi == 0){
            str1 = xi + "Es una raiz";
        }else{
            if (ys == 0){
                str1 = xs + "Es una raiz";
              }else{
                if (yi * ys >  0){
                    str1 = "Ese intervalo no contiene raiz";
                }else{
                    xm = (xi + xs)/2;
                    ym = parser.FunctionEvaluator(fun, xm);
                    arrxm[0] = xm;
                    arry[0] = ym;
                    arrerror[0] = -0;
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
                            arrerror[cont] = eabs;
                            arr[cont] = xi;
                            arrxs[cont] = xs;
                            arrxm[cont] = xm;
                            arry[cont] = ym;
                            cont ++;
                    }
                    arrerror[cont] = eabs;

                    if (ym == 0){
                        str1 = xm + " Es una raiz";
                    }else{
                        if (eabs <= tol){
                            str1 = xm + " Es una raiz con error " + eabs;
                        }else{
                            str1 = "No se encontro ninguna raiz";
                        }

                    }
                 }
            }
        }
    }

   public static void reglaFalsa(String fun, double xi, double xs, double tol, int iter, boolean error ) throws Exception{

        JavaParser parser = new JavaParser();

        double yi = parser.FunctionEvaluator(fun, xi);
        double ys = parser.FunctionEvaluator(fun, xs);
        arr = new double[iter];
        arry = new double[iter];
        arrxs = new double[iter];
        arrxm = new double[iter];
        arrerror = new double[iter];
        arr[0] = xi;
        arrxs[0] = xs;
        cont = 1;
        String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

        if (yi == 0){
            str1 = xi + " Es una raiz";
        }else{
           if (ys == 0){

                str1 = xs + " Es una raiz";
           }else{
                if(yi * ys > 0){

                    str1 = "Ese intervalo es inadecuado";
                }else{

                    double xm = xs - (ys *(xi -xs)/(yi - ys));
                    double ym = parser.FunctionEvaluator(fun, xm);
                    arrxm[0] = xm;
                    arry[0] = ym;
                    arrerror[0] = 0;
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
                        ym = parser.FunctionEvaluator(fun, xm);
                        eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, xm, aux));
                        arrerror[cont] = eabs;
                        arr[cont] = xi;
                        arrxs[cont] = xs;
                        arrxm[cont] = aux;
                        arry[cont] = ym;
                        cont ++;
                    }

                    arrxm[cont + 1] = xm;

                    if (ym == 0){
                        str1  = xm + " Es una raiz";
                    }else{
                        if (eabs < tol){

                            str1  = xm + " Es una raiz con un error " + eabs ;
                        }else{
                            str1 = "No se encontro ninguna raiz con" + iter + " iteraciones";
                        }

                    }
                }

           }

        }
   }

   public static void puntoFijo(String fun, String fun2, double xa, double tol, int iter, boolean error)throws Exception{


    JavaParser parser = new JavaParser();
    arr = new double[iter];
    arry = new double[iter];
    arrerror = new double[iter];
    double y = parser.FunctionEvaluator(fun, xa);
    double eabs = tol + 1;
    double xn = 0;
    arr[0] = xa;
    arry[0] = y;
    arrerror[0] = 0;
    cont = 0;
    String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

    while (y != 0 && eabs > tol && cont < iter ){
        xn = parser.FunctionEvaluator(fun2, xa);
        y = parser.FunctionEvaluator(fun, xn);
        eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, xn, xa));
        arrerror[cont + 1] = eabs;
        arry[cont + 1] = y;
        xa = xn;
        arr[cont + 1] = xa;
        cont ++;
    }
    arr[cont + 2] = xn;

    if (y == 0){
        str1 = xa + " Es una raiz";
    }else{
        if (eabs < tol){
            str1 = xa + " Es una raiz con error " + eabs;
        }else{
            str1 = "No se encontro ninguna raiz con " + iter + " iteraciones";
        }
    }
}

   public static void newton(String fun, String derivada, double x, double tol, int iter, boolean error)throws Exception{

        JavaParser parser = new JavaParser();
        double y = parser.FunctionEvaluator(fun, x);
        double yp = parser.FunctionEvaluator(derivada, x);
        double eabs = tol + 1;
        double x1 = 0;
        arr = new double[iter];
        arry = new double[iter];
        arrerror = new double[iter];
        arr[0] = x;
        arry[0] = y;
        arrerror[0] = 0;
        cont = 0;

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
            arr[cont + 1] = x;
            arry[cont + 1] = y;
            arrerror[cont + 1] = eabs;
            cont ++;
        }
        arr[cont + 1] = x1;

        if (y == 0){
            str1 = x + " Es una raiz con "+ cont + " iteraciones";
        }else{
            if (eabs < tol){
                str1 = x1 + " Es una raiz con error " + eabs + " en "+ cont + " iteraciones";
            }else{
                if(yp == 0){
                   str1 = x1 + " Es una posilbe raiz multiple";
                }
                str1 = "NO se encontro ninguna raiz con " +  iter + " iteraciones";
            }

        }
    }

   public static void secante(String fun,double x0, double x1, double tol, int iter, boolean error)throws Exception{


    JavaParser parser = new JavaParser();
    double x2 = 0;
    double eabs = tol + 1;
    double y0 = parser.FunctionEvaluator(fun, x0);
    double y1 = parser.FunctionEvaluator(fun,x1);
    double den = y1 - y0;
    arr = new double[iter];
    arry = new double[iter];
    arrerror = new double[iter];
    arr[0] = x0;
    arry[0] = y0;
    arrerror[0] = 0;
     cont = 0;
    String ecuacion;

        if (error){
            ecuacion = "(x - y)/x";
        }else{
            ecuacion = "x - y";
        }

    if(y0 == 0){
        str1 = x0 + " Es una raiz";
    }else
        while (y1 != 0 && eabs > tol && den != 0 && cont < iter ){
        x2 = x1-y1*(x1 - x0)/den;
        eabs = Math.abs(parser.FunctionEvaluatorForTwo(ecuacion, x2, x1));
        x0 = x1;
        y0 = y1;
        x1 = x2;
        y1 = parser.FunctionEvaluator(fun, x1);
        den = y1 - y0;
        arr[cont + 1] = x0;
        arry[cont + 1] = y0;
        arrerror[cont + 1] = eabs;
        cont++;
    }

    arrerror[cont + 2] = eabs;

    if (y1 == 0){
        str1 = x0 + " Es una raiz";
    }else{
        if (eabs <= tol){
            str1 = x0 + " Es una raiz con error " + eabs;
        }else{
            if(den == 0){
                str1 = "El denominador se hizo 0";
            }else{
                str1 = "No se encontró ninguna raiz con " + iter + " iteraciones";
            }
        }
    }
   }

   public static void raicesMultiples(String fun, String derivada, String sderivada, double x0, double tol, int iter, boolean error)throws Exception{

    JavaParser parser = new JavaParser();
    double x1 = 0;
    double y = parser.FunctionEvaluator(fun, x0);
    double yp = parser.FunctionEvaluator(derivada, x0);
    double ypp = parser.FunctionEvaluator(sderivada, x0);
    arr = new double[iter];
    arry = new double[iter];
    arrerror = new double[iter];
    arrden = new double[iter];
    arr[0] = x0;
    arry[0] = y;
    arr[0] = 0;
    cont = 0;
    double eabs = tol + 1;
    double den = Math.pow(yp,2) - (y * ypp);
    arrden[0] = den;
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
        arr[cont + 1] = x0;
        arry[cont + 1] = y;
        arrerror[cont + 1] = eabs;
        arrden[cont + 1] = den;
        cont++;
    }
    arr[cont + 2] = x1;

   if (y == 0){
    str1 = x0 + " Es una raiz";
   }else{
        if (eabs <= tol){
            str1 = x0 + " Es una raiz con error " + eabs;
        }else{
            if(den == 0){
                str1 = "El denominador se hiza 0";
            }else{
                str1 = "No se encontro ninguna raiz con " + iter + " iteraciones";
            }
        }
   }


}

   public static void print(double row[]){
        for(int i = 0; i < row.length; i++){
            System.out.println(row[i]);
        }
    }


    public static void main(String[] args)throws Exception {


    }

}
