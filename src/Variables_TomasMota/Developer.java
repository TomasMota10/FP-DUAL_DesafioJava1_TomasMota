package Variables_TomasMota;

public class Developer {

	//Se declara las variables necesarias
	private int idEmpleado;
	private int vacaciones=21;
	private String nombreEmpleado;
	private static final String Empresa="Everis Spain S.L.U";
	private static byte max_Empleados=127;
	private static int numeroEmpleados=0;
	
	
	//Creacion del constructor Developer
	public Developer(String nombreEmpleado) {
		Developer.numeroEmpleados++;
		this.idEmpleado=numeroEmpleados+1;
		this.nombreEmpleado=nombreEmpleado;
		
	}
	
    //Metodos Getters and Setters de cada variable 
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public static byte getMax_Empleados() {
		return max_Empleados;
	}

	public static void setMax_Empleados(byte max_Empleados) {
		Developer.max_Empleados = max_Empleados;
	}

	public static int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public static void setNumeroEmpleados(int numeroEmpleados) {
		Developer.numeroEmpleados = numeroEmpleados;
	}

	public static String getEmpresa() {
		return Empresa;
	}
	
	// Método para restar dias de vacaciones al objeto.
		public int quitardiasVacaciones(int dias) {
			int resultado;
			
			if(this.getVacaciones()>=dias&&dias>0) {
				resultado=this.getVacaciones()-dias;
				this.setVacaciones(resultado);
			}else {
				resultado=this.getVacaciones();
				System.out.println("Imposible, no se le puede restar más dias de vacaciones ya que ha sobrepasado el limite");
			}

			return resultado;	
			

	}

}
