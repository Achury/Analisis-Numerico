
package Funciones;

import Interfaz.*;

public class MetodosSistemaDeEcuaciones {


    public static String res = "";
    public static String mL = "";
    public static String mU = "";
    public static String mP = "";
    public static double[] elimGaussSimple(double Ab [][], int n){
        double [][] U = pivoteoSimple (Ab, n);
        double [] x = sustRegresiva (U,n);
        res = "Los resultados finales: \n";
        for (int i = 1 ; i <= n; ++i){
            res += "X" + i + ": ";
            res += x[i - 1] + "\n";
        }
        return x;
    }

    public static double [] elimGaussParcial (double [][] Ab, int n){
       for (int k = 0; k < n - 1; k++){
            Ab = pivoteoParcial (Ab, n, k);
            for(int i = k + 1; i < n; i++){
                double mult = Ab[i][k] /Ab[k][k];
                for (int j = k; j <= n; j++){
                    Ab[i][j] = Ab[i][j] - mult * Ab[k][j];
                }
            }
        }
        double [] x = sustRegresiva(Ab, n);
        res = "Los resultados finales: \n" ;
        for (int i = 1; i <= n; i++){
            res +="X" + i + ": ";
            res += x[i - 1] + "\n";
        }

            return x;
    }
    
    public static double [] elimGaussTotal (double[][] Ab, int n){
        int [] marcas = new int[n];
        for (int i = 1; i <= n; i++){
            marcas[i-1] = i;
        }
        double [][] Abm = new double [n+1][n+1];
        for (int k = 0; k < n; k++){
            Abm = pivoteoTotal (Ab, marcas, n, k);
            for (int i = 0; i < n; i++){
                marcas[i] = (int)Abm[n][i];
                for (int j = 0; j <= n; j++){
                    Ab[i][j] = Abm[i][j];
                }
            }
            for(int i = k + 1; i < n; i++){
                double mult = Ab[i][k] /Ab[k][k];
                for (int j = k; j <= n; j++){
                    Ab[i][j] = Ab[i][j] - mult * Ab[k][j];
                }
            }
        }

        double [] z = sustRegresiva(Abm, n);
        double [] x = new double[n];
        for (int i = 0; i < n; i++){
            marcas[i] = (int)Abm[n][i];
            x[marcas[i] - 1] = z[i];
        }
        res = "Resultados finales : \n";
        for (int i = 0; i < n; i++){
            int j = i + 1;
            res += "X" + j + ": ";
            res += x[i] + "\n";
         }
        return x;


    }
    
    public static double [][][] factCrout(double [][] A , int n){
        double [][] L = new double [n][n];
        double [][] U = new double [n][n];
        for (int i = 0; i < n; i++){
            L[i][i] = 1;
            U[i][i] = 1;
        }
        for (int k = 0; k < n; k++){
            double suma1 = 0;
            for (int p = 0; p <= k - 1; p++){
                suma1 = suma1 + L[k][p] * U[p][k];
            }
            L[k][k] = A[k][k] - suma1;
            for (int i = k + 1; i < n; i++){
                double suma2 = 0.0;
                double suma3 = 0.0;
                for (int p = 0; p <= k - 1; p++){
                    suma2 = suma2 + L[i][p] * U[p][k];
                    suma3 = suma3 + L[k][p] * U[p][i];
                }
                L[i][k] = A[i][k] - suma2;
                U[k][i] = (A[k][i] - suma3) / L[k][k];
            }
        }
        double [][][] LU = new double [2][n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                LU[0][i][j] = L[i][j];
                LU[1][i][j] = U[i][j];
            }
        }
        mL = "La Matriz L: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mL += L[i][j] + "   ";
            }
            mL += "\n";
        }
        mU = "La Matriz U: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mU += U[i][j] + "   ";
            }
            mU += "\n";
        }
        return LU;
    }

    public static double[][][] factDoolittle(double [][] A, int n){
        double [][] L = new double [n][n];
        double [][] U = new double [n][n];
        for (int i = 0; i < n; i++){
            L[i][i] = 1;
            U[i][i] = 1;
        }
        for (int k = 0; k < n; k++){
            double suma1 = 0;
            for (int p = 0; p <= k - 1; p++){
                suma1 = suma1 + L[k][p] * U[p][k];
            }
            U[k][k] = A[k][k] - suma1;
            for (int i = k + 1; i < n; i++){
                double suma2 = 0.0;
                double suma3 = 0.0;
                for (int p = 0; p <= k - 1; p++){
                    suma2 = suma2 + L[i][p] * U[p][k];
                    suma3 = suma3 + L[k][p] * U[p][i];
                }
                L[i][k] = (A[i][k] - suma2) / U[k][k];
                U[k][i] = A[k][i] - suma3;
            }
        }
        double [][][] LU = new double [2][n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                LU[0][i][j] = L[i][j];
                LU[1][i][j] = U[i][j];
            }
        }
        mL = "La Matriz L: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mL += L[i][j] + "   ";
            }
            mL += "\n";
        }
        mU = "La Matriz U: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mU += U[i][j] + "   ";
            }
            mU += "\n";
        }
        return LU;
    }

    public static double[][][] factCholesky(double[][] A, int n){
        double [][] L = new double [n][n];
        double [][] U = new double [n][n];
        for (int i = 0; i < n; i++){
            L[i][i] = 1;
            U[i][i] = 1;
        }
        for (int k = 0; k < n; k++){
            double suma1 = 0;
            for (int p = 0; p <= k - 1; p++){
                suma1 = suma1 + L[k][p] * U[p][k];
            }
            L[k][k] = Math.sqrt(A[k][k] - suma1);
            U[k][k] = L[k][k];
            for (int i = k + 1; i < n; i++){
                double suma2 = 0.0;
                double suma3 = 0.0;
                for (int p = 0; p <= k - 1; p++){
                    suma2 = suma2 + L[i][p] * U[p][k];
                    suma3 = suma3 + L[k][p] * U[p][i];
                }
                L[i][k] = (A[i][k] - suma2) / U[k][k];
                U[k][i] = (A[k][i] - suma3) / L[k][k];
            }
        }
        double [][][] LU = new double [2][n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                LU[0][i][j] = L[i][j];
                LU[1][i][j] = U[i][j];
            }
        }
        mL = "La Matriz L:\n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mL += L[i][j] + "   ";
            }
            mL += "\n";
        }
        mU = "La Matriz U: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mU += U[i][j] + "   ";
            }
            mU += "\n";
        }
        return LU;
    }

    public static double [][][] factLUSimple(double [][] A, int n){
        double [][] L = new double [n][n];
        for(int i = 0; i < n; i++){
            L[i][i] = 1;
        }
        for (int k = 0; k < n - 1; k++){
            for (int i = k + 1; i < n; i++){
                L[i][k] = A[i][k] / A[k][k];
                for (int j = k; j < n; j++){
                    A[i][j] = A[i][j] - L[i][k] * A[k][j];
                }
            }
        }
         double [][][] LU = new double [2][n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                LU[0][i][j] = L[i][j];
                LU[1][i][j] = A[i][j];
            }
        }
        mL = "La Matriz L: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mL += L[i][j] + "   ";
            }
            mL += "\n";
        }
        mU = "La Matriz U: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mU += A[i][j] + "    ";
            }
            mU += "\n";
        }
        return LU;
    }

    public static double [][][] factLUPivoteo(double[][]A, int n){
        double [][] P = new double[n][n];
        double [][] L = new double[n][n];
        for (int i = 0; i < n; i++){
            P[i][i] = 1;
            L[i][i] = 1;
        }
        double [][][] ALP = new double [3][n][n];
        for (int k = 0; k < n - 1; k++){
             ALP = pivoteo(A, P, L, k, n);
             for (int i = 0; i < n; i++){
                 for (int j = 0; j < n; j++){
                     A[i][j] = ALP[0][i][j];
                     L[i][j] = ALP[1][i][j];
                     P[i][j] = ALP[2][i][j];
                 }
             }
        }
        double [][][] LUP = new double [3][n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                LUP[0][i][j] = L[i][j];
                LUP[1][i][j] = A[i][j];
                LUP[2][i][j] = P[i][j];
            }
        }

        mL = "La Matriz L: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mL += L[i][j] + "   ";
            }
            mL += "\n";
        }
        mU = "La Matriz U: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mU += A[i][j] + "   ";
            }
            mU += "\n";
        }
        mP = "La Matriz P: \n";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mP += P[i][j] + "   ";
            }
            mP += "\n";
        }

        return LUP;
    }

    public static double[] elimGaussTribanda(double []a, double[]b, double[]c, double[]d, int n){
        for (int k = 0; k < n-1; ++k ){
            double mult = a[k] / b[k];
            b[k + 1] = b[k + 1] - mult * c[k];
            d[k + 1] = d[k + 1] - mult * d[k];
        }

        double x[] = sustRegresivaTribanda(b, c, d, n);
        res = "Los resultados finales: \n";
        for (int i = 1 ; i <= n; ++i){
            res += "X" + i + ": ";
            res += x[i - 1] + "\n";
        }
        return x;
    }

    public static double [] jacobi (double [][] A, double [] b, double [] X0, int n, int iter, double tol, double w){

        double [] X = new double [n];
        int cont = 0;
        double error = tol + 1;
        double errorAbs = 0;

        double [] E = new double [iter];
        double [][] R = new double [iter][n];
        E[0] = 0;
        for (int i = 0; i < n; i++){
            R[1][i] = X0[i];
        }

        while (cont < iter && error > tol ){
            error = 0;
            for (int i = 0; i < n; i++){
                double suma = 0;
                for (int p = 0; p < n; p++){
                    if (i != p){
                        suma += (-A[i][p] * X0[p]);
                    }
                }
                X[i] = (suma + b[i]) / A[i][i];

                //Relajacion
                X[i] = w * X[i] + (1 - w) * X0[i];
                errorAbs = Math.abs(X[i] - X0[i]);
                error += (errorAbs * errorAbs);
            }
            error = Math.sqrt(error);
            System.out.println(error);
            cont ++;

            for(int i = 0; i < n; i++){
                X0[i] = X[i];
            }
        }

        if(error <= tol){
            res = "La solución aproximada al sistema es: \n";
            for(int i = 0; i < X.length; i++){
               res += "X" + (i + 1) + " = " + X[i] + "\n";
            }
            res += "Con un error de " + error + "\n";
        }else{
            res += "Número maximo de interaciones excedido \n";
        }

        return X;
    }
    public static double [] gaussSeidel (double [][] A, double [] b, double X0 [], int n, int iter, double tol, double w){

        double [] X = new double [n];
        double cont = 0;
        double error = tol + 1;
        double errorAbs = 0;

        while (cont <= iter && error > tol){
            error = 0;
            for (int i = 0; i < n; i++){
                double suma = 0;
                for (int p = 0; p < n; p++){
                    if (p != i){
                        suma += (-A[i][p] * X0[p]);
                    }
                }
                X[i] = (suma + b[i]) / A[i][i];
                //Relajación
                X[i] = (1 - w) * X0[i] + w * X[i];
                errorAbs = Math.abs(X[i] - X0[i]);
                error += (errorAbs * errorAbs);
                X0[i] = X[i];
            }
            error = Math.sqrt(error);
            cont++;
        }

        if(error <= tol){
            res = "La solución aproximada al sistema es: \n";
            for(int i = 0; i < n; i++){
                res += "X" + (i + 1) + " = " + X[i] + "\n";
            }
            res += "Con un error de " + error + "\n";
        }else{
            res = "Número maximo de interaciones excedido \n";
        }

        return X;
    }

    public static double [][] formaMatrizAumentada(double[][] A, double[] b){
        int n = A.length;
        double [][] Ab = new double [n][n+1];
        System.out.println("La matriz aumentada es:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n + 1; j++){
                if (j < n){
                    Ab[i][j] = A[i][j];
                }else{
                    Ab[i][j] = b[i];
                }
                System.out.print(Ab[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        return Ab;
    }

    private static  double[] sustRegresiva(double Ab[][], int n){
        double[] x = new double[n];
        for (int i = n - 1; i >= 0 ; i--){
            double acum = 0.0;
            for (int j = i + 1; j <= n - 1; j++){
                acum = acum + Ab[i][j] * x[j];
            }
            x[i] = (Ab[i][n] - acum) / Ab[i][i];
        }
        return x;
    }

    private static double[] sustProgresiva (double Ab[][], int n){
        double[] x = new double[n];
        for(int i = 0; i <= n - 1; i++){
            double acum = 0.0;
            for (int j = 0; j <= i - 1; j++){
                acum = acum + Ab[i][j] * x[j];
            }
            x[i] = (Ab[i][n] - acum) / Ab[i][i];
        }
        return x;
    }

    private static double[] sustRegresivaTribanda(double[] b, double[]c, double[]d, int n){
        double[] x = new double[n];
        x[n - 1] = d[n - 1] / b[n - 1];
        for(int i = n - 2; i >= 0; i--){
            x[i] = (d[i] - c[i] * x[i + 1]) / b[i];
        }
        return x;
    }

    private static double[][] intercambiarFilas(double [][] Ab, int m, int k){
        int n = Ab.length;
        double [] temp = new double [n+1];
        for (int i = 0; i <= n; i++){
            temp[i] = Ab[m][i];
            Ab [m][i] = Ab[k][i];
            Ab [k][i] = temp[i];
        }
        return Ab;
    }

    private static double [][] intercambiarFilasMatCuadrada (double [][]A, int m, int k, int n){
        double [] temp = new double [n+1];
        for (int i = 0; i < n; i++){
            temp[i] = A[m][i];
            A [m][i] = A[k][i];
            A [k][i] = temp[i];
        }
        return A;
    }

    private static double[][] intercambiarColumnas(double [][] Ab, int[] marcas, int m, int k){
        int n = Ab.length;
        double [] temp = new double [n];
        for (int i = 0; i < n; i++){
            temp[i] = Ab[i][m];
            Ab [i][m] = Ab[i][k];
            Ab [i][k] = temp[i];
        }
        int tempM = marcas[m];
        marcas[m] = marcas[k];
        marcas[k] = tempM;

        double [][] AbMarcas = new double [n+1][n+1];
        for (int i = 0; i<n; i++){
            AbMarcas[n][i] = marcas[i];
            for (int j = 0; j <= n; j++){
                AbMarcas[i][j] = Ab[i][j];
            }
        }        
        return AbMarcas;
    }
   
    private static double [][] pivoteoSimple (double [][] Ab, int n){
        for (int k = 0; k < n - 1; k++){
            for (int i = k + 1; i < n; i++){
                double mult = Ab[i][k] / Ab[k][k];
                for (int j = k; j <= n; j++){
                    Ab[i][j] = Ab[i][j] - mult * Ab[k][j];
                }
            }
        }
        return Ab;
    }

    private static double [][] pivoteoParcial(double [][] Ab, int n, int k){
        double mayor = Math.abs(Ab[k][k]);
        int filaMayor = k;
        for (int s = k + 1; s < n; s++){
            if(Math.abs(Ab[s][k]) > mayor){
                mayor = Math.abs(Ab[s][k]);
                filaMayor = s;
            }
        }
        if(mayor == 0.0){
           System.out.println("El sistema no tiene solución única");
        }else if (filaMayor != k){
            Ab = intercambiarFilas (Ab, filaMayor, k);
        }
        return Ab;
    }

    private static double [][] pivoteoTotal(double [][] Ab,int [] marcas, int n, int k){
        double mayor = 0.0;
        int filaMayor = k;
        int columnaMayor = k;
        for (int r = k; r < n; r++){
            for (int s = k; s < n; s++){
                if(Math.abs(Ab[r][s]) > mayor){
                    mayor = Math.abs(Ab[r][s]);
                    filaMayor = r;
                    columnaMayor = s;
                }
            }
        }
        if (mayor == 0){
            System.out.println("El sistema no tiene solución única");
        }else if (filaMayor != k){
            Ab = intercambiarFilas(Ab, filaMayor, k);
        }
        double [][] Abm = new double [n+1][n+1];
            Abm = intercambiarColumnas(Ab, marcas, columnaMayor, k);
        
        return Abm;
    }

    private static double [][][] pivoteo(double [][] A, double [][] P, double [][] L, int k, int n){
        double mayor = Math.abs(A[k][k]);
        int filaMayor = k;
        for (int s = k + 1; s < n; s++){
            if(Math.abs(A[s][k]) > mayor){
                mayor = Math.abs(A[s][k]);
                filaMayor = s;
            }
        }
        if(mayor == 0.0){
           System.out.println("El sistema no tiene solución única");
        }else if (filaMayor != k){
            A = intercambiarFilasMatCuadrada (A, filaMayor, k, n);
            P = intercambiarFilasMatCuadrada (P, filaMayor, k, n);
        }
        for(int i = k + 1; i < n; i++){
            L[i][k] = A[i][k] / A[k][k];
            for (int j = k; j < n; j++){
                A[i][j] = A[i][j] - L[i][k] * A[k][j];
            }
        }

        if (filaMayor != k && k > 0){
            double temp = L[filaMayor][k - 1];
            L[filaMayor][k - 1] = L[k][k - 1];
            L[k][k - 1] = temp;

        }
        double [][][] ALP = new double [3][n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                ALP[0][i][j] = A[i][j];
                ALP[1][i][j] = L[i][j];
                ALP[2][i][j] = P[i][j];
            }
        }
        return ALP;

    }


    

    public static void main(String []args){
        
        //Dependiendo del metodo que se vaya a utilizar se deben poner aqui los parametros necesario para su funcionamiento

        double A [][] = {{8, 3, 5}, {-2, 7, 3}, {4, -5, 18}};
        double b [] = {21,7,42};
        double X0 [] = {0, 0, 0};
        int n = 3;
        int iter = 50;
        double tol = 0.04;
        double w = 1;

        //jacobi(A, b, X0, n, iter, tol, w);
        
   }


}
