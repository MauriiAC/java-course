
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Mauricio", "Cuello", 32);
		System.out.println(persona1.saluda());
		
		Empleado empleado1 = new Empleado("Cristiano", "Ronaldo", 39, 1300, 420);
		System.out.println(empleado1.saluda());
		System.out.println(empleado1.fichar(430));
	}
}
