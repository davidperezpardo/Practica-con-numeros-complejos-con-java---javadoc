package ejemplos.entornos;

/**
 * Operaciones con numeros complejos.
 * 
 * @author David Perez Pardo
 * @version 29/05/2019
 *
 */

public class NumComplejo {
	private double pReal;
	private double pImaginaria;

	/**
	 * Constructor vacio.
	 */
	public NumComplejo(){

	}

	/**
	 * Constructor.
	 * @param pReal  Parte real.
	 * @param pImaginaria Parte imaginaria.
	 */
	public NumComplejo(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}

	/**
	 * Getter.
	 * @return Parte real.
	 */
	public double getpReal() {
		return pReal;
	}

	/**
	 * Setter.
	 * @param pReal Parte real.
	 */
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	/**
	 * Getter.
	 * @return Parte imaginaria.
	 */
	public double getpImaginaria() {
		return pImaginaria;
	}

	/**
	 * Setter.
	 * @param pImaginaria Parte imaginaria.
	 */
	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

	/**
	 * Suma de dos numeros complejos.
	 * @param c1 Numero complejo.
	 * @param c2 Numero complejo.
	 * @return El resultado de la suma.
	 */
	public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

		return result;
	}

	/**
	 * Resta de dos numeros complejos.
	 * @param c1 Numero complejo.
	 * @param c2 Numero complejo.
	 * @return El resultado de la resta.
	 */
	public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

		return result;
	}

	/**
	 * Multiplicacion de dos numeros complejos.
	 * @param c1 Numero complejo.
	 * @param c2 Numero complejo.
	 * @return El producto de ambos.
	 */
	public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));

		return result;
	}

	/**
	 * Division de dos numeros complejos.
	 * @param c1 Numero complejo.
	 * @param c2 Numero complejo.
	 * @return El resultado de la division de ambos.
	 */
	public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);

		return result;
	}

	/**
	 * Calcula el modulo a un numero complejo.
	 * @param numComplejo  Numero complejo.
	 * @return Modulo del numero complejo.
	 */
	public static double modulo (NumComplejo numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}

	/**
	 * Metodo toString.
	 */
	@Override
	public String toString(){
		
		String mostrar="";
		if (pReal!=0){
			mostrar+=pReal;
		}
		if (pImaginaria>=0){
			mostrar=mostrar+"+"+pImaginaria+"i";
		}else {
			mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
		}
		return mostrar;
	}
}
