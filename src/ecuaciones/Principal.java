package ecuaciones;

public class Principal {

	public static void main(String[] args) {
		Raices ecuacion = new Raices(1, 4, 4);
		ecuacion.calcular();
		Raices ecuacion2 = new Raices(8, 4, 4);
		ecuacion2.calcular();
		Raices ecuacion3 = new Raices(2, 8, 2);
		ecuacion3.calcular();
	}

}
