
public class Empleado extends Persona {
	
	int sueldo;
	int horario;

	public Empleado(String nombre, String apellido, int edad, int sueldo, int horario) {
		super(nombre, apellido, edad);
		this.sueldo = sueldo;
		this.horario = horario;
	}
	
	public String fichar(int ingreso) {
		if (ingreso < this.horario) {
			return String.format("Llegué %s minutos temprano", this.horario - ingreso);
		}
		else {
			return String.format("Llegué %s minutos tarde",  ingreso - this.horario);
		}
	}
}
