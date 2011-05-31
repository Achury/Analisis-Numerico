/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Funciones;


import com.singularsys.jep.JepException;
import com.singularsys.jep.Jep;
import javax.swing.JOptionPane;

/**
 *
 * @author santiago
 */
public class JavaParser {

         
	double result;
	String inFunction;
        public boolean flag;

	/**
	 * Parser para funciones de una variable
	 */
	public JavaParser() {
            this.flag = getFlag();
        }

	public double FunctionEvaluator(String function, double point) throws JepException
	{

                //JavaParser fp = new JavaParser();
		result = FunctionParserRun(function,point);
                //System.out.println("Resultado de la funcion0: " + result);
                getFlag();
		return result;
	}

	//@SuppressWarnings("deprecation")
	public double FunctionParserRun(String function,double initialValue) throws JepException
	{

                Jep jep = new Jep();
		jep.addStandardConstants();
		jep.setAllowUndeclared(true);
		jep.setImplicitMul(true);
		jep.setAllowAssignment(true);

                flag = true;

		 try {


		    jep.addVariable("x", initialValue);
		    jep.parse(function);
		    Object resultOfEvaluate = jep.evaluate();

		    String resultString = String.valueOf(resultOfEvaluate);

		    result = Double.valueOf(resultString);


		 } catch (JepException e) {
                    flag = false;
                    //System.out.println("flag Option1 = "+flag);
		    JOptionPane.showMessageDialog( null, "Ingreso una funcion no valida,\n por favor ver en ayudas tipos de funciones validas a usar","ERROR INGRESAR FUNCION", JOptionPane.INFORMATION_MESSAGE );
                 }

		//System.out.println("Resultado de la funcion1: " + result);
                getFlag();
		return result;

	}

	/**
	 * Parser para funciones con dos variable
	 */
	public double FunctionEvaluatorForTwo(String function, double pointA,double pointB) throws JepException
	{

                JavaParser fp = new JavaParser();
                result = fp.FunctionParserForTwoRun(function,pointA,pointB);
                //System.out.println("Resultado de la función2: " + result);
		return result;
	}

	public double FunctionParserForTwoRun(String function,double initialValueA,double initialValueB) throws JepException
	{

		Jep jep = new Jep();
		jep.addStandardConstants();
		jep.setAllowUndeclared(true);
		jep.setImplicitMul(true);
		jep.setAllowAssignment(true);


		 try {

                    flag = true;

		    jep.parse(function);
		    jep.addVariable("x", initialValueA);
		    jep.addVariable("y", initialValueB);
		    Object resultOfEvaluate = jep.evaluate();

		    String resultString = String.valueOf(resultOfEvaluate);

		    result = Double.valueOf(resultString);

		 } catch (JepException e) {
                    JOptionPane.showMessageDialog( null, "Ingreso una funcion no valida,\n por favor ver en ayudas tipos de funciones validas a usar","ERROR INGRESAR FUNCION", JOptionPane.INFORMATION_MESSAGE );

		 }

		 //System.out.println("Resultado de la funcion3: " + result);
                 getFlag();
		return result;

	}

        public boolean getFlag(){
            //System.out.println("bandera 2 = "+flag+"\n");
            return flag;
        }

}