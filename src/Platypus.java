public class Platypus {
	private String nombre;
	private int aletas;
	private int años;

	void sayHi() {
		System.out.println("el ornitorrinco " + nombre + " Es más inteligente que la media Keith, estoy " + años
				+ " de antigüedad, y yo tengo " + aletas + " aletas");
	}

	public Platypus(String nombre, int años, int aletas) {
		this.nombre = nombre;
		this.años = años;
		this.aletas = aletas;
	}

	public static void main(String[] args) {
		// 1. Make an instance of your new pet platypus
		Platypus littlePanchico = new Platypus("Panchico", 1000, 4);

		// 2. Call the sayHi method
		littlePanchico.sayHi();

		// 3. Create a constructor in the platypus class so that you can give
		// your platypus a name.
	}
}
