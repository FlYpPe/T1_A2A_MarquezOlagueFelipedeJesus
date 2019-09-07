import java.util.Scanner;

class TDACadenaEspecialConStringBuilder {
	private String cadena = "Instituto tecnologico superior de jerez";

	public void setCadena() {
		this.cadena = "Instituto tecnologico superior de jerez";
	}
	
	public TDACadenaEspecialConStringBuilder() {

	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public String invertirCadenaPorLetras() {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.reverse();
		return sb.toString();
	}

	public String invertirCadenaPorPalabra() {
		String inversa = "";

		String palabraA[] = this.getCadena().split(" ");

		for (int j = 0; j < palabraA.length; j++) {
			inversa = palabraA[j] + " " + inversa;
		}
		return inversa;
	}

	public String agregarCaracterEnPosicion(String caracter, int posicion) {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.insert(posicion, caracter);
		return sb.toString();
	}

	public String agregarCadenaEnPosicion(String caracter, int posicion) {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.insert(posicion, caracter);
		return sb.toString();
	}

}

public class pruebaStringBuilder {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		TDACadenaEspecialConStringBuilder p = new TDACadenaEspecialConStringBuilder();
		StringBuilder sB = new StringBuilder(p.getCadena());

		byte opcion;
		do {

			System.out.println("Cadena por defecto: " + p.getCadena());

			System.out.println("Seleccione una opción");
			System.out.println("1) Invertir Cadena por letras");
			System.out.println("2) Invertir Cadena por palabras");
			System.out.println("3) Agregar un caracter en una posicion de la cadena");
			System.out.println("4) Agregar un palabra en una posicion de la cadena");

			System.out.println("5) Salir");
			System.out.print("Elige una opcion: ");
			opcion = e.nextByte();

			switch (opcion) {
			case 1:

				System.out.println("invertido: " + sB.reverse());
				p.setCadena();
				break;
			case 2:

				String x = p.invertirCadenaPorPalabra();
				
				System.out.println("invertido: " + x);
				p.setCadena();
				break;
			case 3:

				System.out.println("Caracter a agregar: ");
				String c = e.next();

				System.out.println("ingrese la posicion: ");
				int s = e.nextInt();
				System.out.println("Se agrego un caracter a la cadena");
				System.out.println(p.agregarCaracterEnPosicion(c, s));
				p.setCadena();
				break;
			case 4:

				System.out.println("cadena a agregar: ");
				String b = e.next();

				System.out.println("ingrese la posicion: ");
				int t = e.nextInt();
				System.out.println("Se agrego un texto  a la cadena");
				System.out.println(p.agregarCaracterEnPosicion(b, t));
				p.setCadena();
				break;
			case 5:
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion != 5);

		e.close();
	}

}
