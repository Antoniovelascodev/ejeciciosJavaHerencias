package ejc1;

import java.util.Arrays;

public class Empresa {

	private Empleado listaEmpleado[] = new Empleado[0];

	private String nombre;
	private String CIF;
	private double beneficios;

	
	//constructores
	public Empresa(String nombre, String cIF, double beneficios) {
		super();
		this.nombre = nombre;
		CIF = cIF;
		this.beneficios = beneficios;
	}
	
	
	//metodos
	public void contratarEmpleado(Empleado a) {
		listaEmpleado = Arrays.copyOf(listaEmpleado, listaEmpleado.length + 1);
		listaEmpleado[listaEmpleado.length - 1] = a;
		a.setNumEmpleado(listaEmpleado.length);
	}

	public void despedirEmpleado(int numEmpleado) {
		int indice = -1;
		boolean hay = false;
		for (int i = 0; i < listaEmpleado.length; i++) {
			if (listaEmpleado[i].getNumEmpleado() == numEmpleado) {
				hay = true;
				indice = i;
			}
		}

		if (hay == false) {
			System.out.println("No hay ningun empleado con ese numero. ");
		} else {
			Empleado aux[] = new Empleado[0];
			if (indice == 0) {
				System.arraycopy(listaEmpleado, 1, aux, 0, listaEmpleado.length - 1);
				this.listaEmpleado = aux;
				System.out.println("Se ha borrado el empleado correctamente");
			} else {
				System.arraycopy(listaEmpleado, 0, aux, 0, indice);
				System.arraycopy(listaEmpleado, indice+1, aux, indice,listaEmpleado.length-indice);
				System.out.println("Se ha borrado el empleado correctamente");
			}
		}
	}
	
	public void ordenarEmpleados() {
		
		Empleado aux[] = new Empleado[listaEmpleado.length]; 
		
		//1ºbucle pa ver cual es el ma grande
		for(int i = 0; i<listaEmpleado.length; i++) {
			
			//2ºbucle pa meter 
			for(int j = 0; j<listaEmpleado.length; j++) {
				if(listaEmpleado[i].getSalario()> listaEmpleado[j].getSalario()) {
					
				}
			}
			
			
		}
		

	}
	
	public void repartirBeneficios() {
		
	}
	
	

	
	
	
}
