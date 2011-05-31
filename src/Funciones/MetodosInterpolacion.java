
package Funciones;


public class MetodosInterpolacion {

    public static String res = "";
    public static double [][] matrizres;
    public static void lagrange(double [] X, double [] Y, int n){
        String fun = "";
        for (int k = 0; k < n; k++){
            double den = 1;

            if (Y[k] < 0){
                fun = fun + " - " + -Y[k];
            }else{
                if(k != 0){
                    fun = fun + " +";
                }
                fun = fun + " " + Y[k];
            }

            if(Y[k] == 0){
                continue;
            }

            for(int i = 0; i < n; i++){
                if(i != k){
                    fun = fun + " * (x ";
                    if(X[i] >= 0){
                        fun = fun + " - " + X[i] + ")";
                    }else{
                        fun = fun + " + " + -X[i] + ")";
                    }
                    den = den * (X[k] - X[i]);
                }
            }
            fun = fun + " / " + den;
        }
        res = fun;


                    
            

        /*
        //Imprime Li
        for(int i = 0; i < n; i++){
            valor += L[i] * fx[i];
            System.out.println("L" + i + " = " + L[i]);
        }
        System.out.println("El valor interpolado es: " +  valor);
         *
         */
    
    }

    public static void neville (double [] X, double [] Y, double x, int n){
        double [][] P = new double [n][n+1];
        for (int i = 0; i < n; i++){
            P[i][0] = X[i];
            P[i][1] = Y[i];
        }

        for (int j = 2; j <= n; j++){
            for (int i = j - 1; i < n; i++){
                P[i][j] = ( P[i][j - 1] * (x - X[i - j + 1]) - P[i - 1] [j - 1] * (x - X[i]) ) / ( X[i] - X[i - j + 1] );
            }
        }
        
        //System.out.println("Tabla:");
        matrizres = new double[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= n; j++){
                matrizres[i][j] = P[i][j];
                //System.out.print("  ");
            }
            //System.out.println();
        }
        
        double Val = P[n-1][n];
        System.out.println("   ");
        res = "Valor Interpolado: " + Val;
        


    }

    public static void newton(double X[], double Y[], int n){
        double [][] B = new double [n][n+1];
        double [] b = new double [n];
        for (int i = 0; i < n; i++){
            B[i][0] = X[i];
            B[i][1] = Y[i];
        }

        for (int j = 2; j <= n; j++){
            for (int i = j - 1; i < n; i++){
                B[i][j] = (B[i - 1] [j - 1] - B[i][j - 1]) / (B[i - j + 1][0] - B[i][0]);
            }
        }

        for (int i = 0; i < n; i++){
            b[i] = B[i][i+1];
            
        }

        System.out.println("Tabla:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= n; j++){
                System.out.print(B[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

        String polinomio = imprimirPolinomioNewton(b, X, n);
        res = polinomio;

        

    }

    public static void splinesLineal(double X[], double Y[], int n){
        double m[] = new double [n-1];
        double b[] = new double [n-1];

        for (int i = 0; i < n - 1; i++){
            m[i] = (Y[i] - Y[i + 1]) / (X[i] - X[i + 1]);
            b[i] = Y[i] - m[i] * X[i];
        }

            imprimirRectas(m, b, X, n);
    }

    private static void imprimirRectas (double [] m, double [] b, double X[], int n){
        for (int i = 0; i < n - 1; i++){
            res = "Para el intervalo " + X[i] + ", " + X[i+1] + " la función es: y = " + m[i] + " * x ";
            if(b[i] >= 0){
                res += "+ " + b[i] + "\n";
            }else
                res += "- " + -b[i] + "\n";
        }
    }

    public static void splinesCuadratico(double X[], double Y[], int n){
	n--;
        double [][] matriz = new double [3*n+1][3*n+2];
        double []a = new double [n];
        double []b = new double [n];
        double []c = new double [n];
        int cont = 0;

        //Se llenan los valores de f
        for (int i = 1; i <= (2 * (n-1) + 1); i = i + 2){
            matriz [i][cont * 3 + 1] = Math.pow(X[cont], 2);
            matriz [i][cont * 3 + 2] = X[cont];
            matriz [i][cont * 3 + 3] = 1;
            matriz [i + 1] [cont * 3 + 1] = Math.pow(X[cont + 1], 2);
            matriz [i + 1] [cont * 3 + 2] = X[cont + 1];
            matriz [i + 1] [cont * 3 + 3] = 1;
            matriz [i] [3 * n + 1] = Y[cont];
            matriz [i + 1] [3 * n + 1] = Y[cont + 1];
            cont = cont + 1;   
        }
        cont = 0;
        
	//Se llenan los valor de f'
        for (int i = 2 * n + 1; i <= (3 * n - 1); i++){
            matriz [i] [cont * 3 + 1] = 2 * X[cont + 1];
            matriz [i] [cont * 3 + 2] = 1;
            matriz [i] [cont * 3 + 4] = - 2* X[cont + 1];
            matriz [i] [cont * 3 + 5] = -1;
            cont = cont + 1;
        }

        //Se llena f''
        matriz [3 * n][1] = 2;

        //Imprime la matriz
        double [][] matrizAb = new double [3*n][3*n+1];
        matrizres = new double [3*n+1][3*n+2];
        for (int i = 1; i <= 3*n; i++){
            for (int j = 1; j <= 3*n + 1; j++){
                matrizres[i][j] = matriz[i][j];
                System.out.print("  ");
                matrizAb[i-1][j-1] = matriz[i][j];
            }
            System.out.println();
        }

        double []R = elimGaussTotal(matrizAb, 3*n);
		
        cont = 0;

        for (int i = 0; i < n; i++){
            a[i] = R[3 * cont + 0];
            b[i] = R[3 * cont + 1];
            c[i] = R[3 * cont + 2];
            cont = cont + 1;
            
        }
        for(int j = 0; j < 3*n; j++){
                res = R[j] + "\n";
            }

        for (int i = 0; i < n ; i++){
            res += "Para el intervalo " + X[i] + ", " + X[i+1] + " la función es: y = " + a[i] + " * x^2 " ;
            if(b[i] >= 0){
                res += "+ " + b[i] + " * x ";
            }else
                res += "- " + -b[i] + " * x ";
            if(c[i] >= 0){
               res += "+ " + c[i];
            }else
                res += "- " + -c[i];
            }
        }
    
    public static void splinesCubico(double X[], double Y[], int n){
        n--;
        double [][] matriz = new double [4*n+1][4*n+2];
        double []a = new double [n];
        double []b = new double [n];
        double []c = new double [n];
        double []d = new double [n];
        int cont = 0;

        //Se llenan los valores de f
        for (int i = 1; i <= 2 * (n - 1) + 1; i = i + 2){
            matriz [i] [cont * 4 + 1] = Math.pow(X[cont], 3);
            matriz [i] [cont * 4 + 2] = Math.pow(X[cont], 2);
            matriz [i] [cont * 4 + 3] = X[cont];
            matriz [i] [cont * 4 + 4] = 1;

            matriz [i + 1] [cont * 4 + 1 ] = Math.pow(X[cont + 1], 3);
            matriz [i + 1] [cont * 4 + 2 ] = Math.pow(X[cont + 1], 2);
            matriz [i + 1] [cont * 4 + 3 ] = X[cont + 1];
            matriz [i + 1] [cont * 4 + 4 ] = 1;

            matriz [i] [4 * n + 1] = Y[cont];
            matriz [i + 1] [4 * n + 1] = Y[cont + 1];

            cont = cont + 1;
        }

        cont = 0;

        //Se llenan los valores de f'
        for (int i = 2 * n + 1; i <= (3 * n - 1); i++){
            matriz [i] [cont * 4 + 1] = 3 * Math.pow (X[cont + 1], 2);
            matriz [i] [cont * 4 + 2] = 2 * X[cont + 1];
            matriz [i] [cont * 4 + 3] = 1 * 1;

            matriz [i] [cont * 4 + 5] = - 3 * Math.pow(X[cont + 1], 2);
            matriz [i] [cont * 4 + 6] = - 2 * X[cont + 1];
            matriz [i] [cont * 4 + 7] = - 1 * 1;

        cont = cont + 1;
        }

        //Se llenan los valores de f''
        cont = 0;
        for (int i = 3 * n; i <= 4 * n - 2; i++){
            matriz [i] [cont * 4 + 1] = 6 * X[cont + 1];
            matriz [i] [cont * 4 + 2] = 2 * 1;

            matriz [i] [cont * 4 + 5] = - 6 * X[cont + 1];
            matriz [i] [cont * 4 + 6] = - 2 * 1;

            cont = cont + 1;
        }

        matriz [4 * n - 1] [1] = 6 * X[0];
        matriz [4 * n - 1] [2] = 2;
        matriz [4 * n] [4 * n - 3] = 6 * X[n];
        matriz [4 * n] [4 * n - 2] = 2;

        //Imprime la matriz
        double [][] matrizAb = new double [4*n][4*n+1];
        for (int i = 1; i <= 4*n; i++){
            for (int j = 1; j <= 4*n + 1; j++){
                System.out.print(matriz[i][j]);
                System.out.print("  ");
                matrizAb[i-1][j-1] = matriz[i][j];
            }
            System.out.println();
        }

        double []R = elimGaussTotal(matrizAb, 4*n);

        cont = 0;

        for (int i = 0; i < n; i++){
            a[i] = R[4 * cont + 0];
            b[i] = R[4 * cont + 1];
            c[i] = R[4 * cont + 2];
            d[i] = R[4 * cont + 3];
            cont = cont + 1;
        }


        for (int i = 0; i < n ; i++){
            System.out.print("Para el intervalo " + X[i] + ", " + X[i+1] + " la función es: y = " + a[i] + " * x^3 " );
            if(b[i] >= 0){
                System.out.print("+ " + b[i] + " * x^2 ");
            }else
                System.out.print("- " + -b[i] + " * x^2 ");
            if(c[i] >= 0){
                System.out.print("+ " + c[i] + " * x ");
            }else
                System.out.print("- " + -c[i] + " * x ");
            if(d[i] >= 0){
                System.out.println("+ " + d[i]);
            }else
                System.out.println("- " + -d[i]);
            }
        
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
        
        return x;


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

    private static String imprimirPolinomioNewton(double [] b, double [] X, int n){
        String fun = "";
        for (int k = 0; k < n; k++){
            if(b[k] < 0){
                fun = fun + " - " + -b[k];
            }else{
                if(k != 0){
                    fun = fun + " + ";
                }
                fun = fun + " " + b[k];
            }

            if(b[k] == 0){
                continue;
            }

            for (int i = 0; i < k; i++){
                fun = fun + " * (x ";

                if(X[i] >= 0){
                    fun = fun + " - " + X[i] + ")";
                }else
                    fun = fun + " + " + -X[i] + ")";
            }
        }
        return fun;
    }

   

    public static void main(String []args){

        //Dependiendo del metodo que se vaya a utilizar se deben poner aqui los parametros necesario para su funcionamiento

        /*
        //Newton
        double X[] = {2.0,2.2,2.4,2.6};
        double Y[]  = {2.09861229,2.56315081,3.02377543,3.48093385};
        int n = 4;
        
        lagrange(X,Y,n);
        System.out.println("");
         *
         */

        /*
        //Neville
        double X[] = {2.2,2.4,2.6,2.8};
        double Y[] = {-0.838601743, -0.798911674, -0.732001956, -0.642765639};
        double x = 1.0;
        int n = 4;
        neville(X, Y, x, n);
        System.out.println("");
         *
         */
        


        /*
        //Slines Lineal
        double X[] = {1, 3, 4, 5};
        double Y[] = {3, 1, 3.5, 2};
        int n = 4;
        splinesLineal(X, Y,n);
         *
         */


        /*
        //Splines Cuadratico
        int X[] = {2,3,5,6};
        double Y[] = {4,1,7,2};
        int n = 4;
        splinesCuadratico(X, Y, n);
         *
         */

        //Splines Cubico
        double X[] = {2,3,5,6};
        double Y[] = {4,1,7,2};
        int n = 4;
        splinesCubico(X, Y, n);


          
    }
    







}
