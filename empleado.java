package ejc1;

public class Empleado {

	private String titulos[];
	private String nombre;
	private String apellidos;
	private double salario;
	private int anioAntiguedad;
	private int numEmpleado;
	private String evaluaciones[] = new String[3];

	public Empleado(String[] titulos, String nombre, String apellidos, int anioAntiguedad, double salario) {
		super();
		this.titulos = titulos;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioAntiguedad = anioAntiguedad;
		this.salario = salario;
	}

	public String[] getTitulos() {
		return titulos;
	}

	public void setTitulos(String[] titulos) {
		this.titulos = titulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String[] getEvaluaciones() {
		return evaluaciones;
	}

	public void setEvaluaciones(String[] evaluaciones) {
		this.evaluaciones = evaluaciones;
	}

	public int getAnioAntiguedad() {
		return anioAntiguedad;
	}

	public void setAnioAntiguedad(int anioAntiguedad) {
		this.anioAntiguedad = anioAntiguedad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void aumentarAnioAntiguedad() {
		this.anioAntiguedad = anioAntiguedad + 1;
	}

	public void aumentarSueldo(double aumento) {
		this.salario = salario + aumento;
	}

	public boolean evaluacionesNegativas(Empleado e) {
		boolean negativas = false;
		for (int i = 0; i < e.getEvaluaciones().length; i++) {
			if (e.getEvaluaciones()[i].equalsIgnoreCase("apto")) {
				negativas = true;
			}
		}
		if (negativas == true) {
			return false;
		} else {
			return true;
		}
	}

	public void rellenarEvaluacion(Empleado e, String apto) {
		String aux[] = new String[0];
		System.arraycopy(evaluaciones, 1, aux, 0, evaluaciones.length);
		aux[aux.length - 1] = apto;
		this.evaluaciones = aux;
	}

}
