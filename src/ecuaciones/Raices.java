package ecuaciones;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private void obtenerRaices() {
		double x1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
		double x2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
		System.out.println("Solucion x1: " + x1);
		System.out.println("Solucion x2: " + x2);

	}
	
	private void obtenerRaiz() {
		double x = (-b) / (2 * a);
		System.out.println(" Unica solución " + x);
	}

	public double getDiscriminante() {
		return Math.pow(b, 2)-(4*a*c);
	}
	
	private boolean tieneRaices() {
		return getDiscriminante() > 0;
	}
	
	private boolean tieneRaiz() {
		return getDiscriminante() == 0;
	}
	public void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		}else {
			System.out.println("No tiene soluciones");
		}
	}
}
