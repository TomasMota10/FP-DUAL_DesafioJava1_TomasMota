package FPDualEveris_TomasMota;

import Variables_TomasMota.Developer;

public class FPDual {

	public static void main(String[] args) {
		variablesChallenge();
	}
	
	public static void variablesChallenge() {
		
		//Creador del objetos(Developer)
		Developer developer1=new Developer("Agustín Guerrero");
		Developer developer2=new Developer("Francisco Javier");
		Developer developer3=new Developer("Juan Jesus");
		Developer developer4=new Developer("Juanma Jimenez");
		
		//Muestra de los valores totales de los empleados en la empresa
		System.out.println("---DEVELOPERS BY TOMAS MOTA---");
		System.out.println("\n"+"---Se mostrara el numero total de empleados---");
		System.out.println("Numero total de trabajadores: "+developer1.getIdEmpleado());
		System.out.println("Numero total de trabajadores: "+developer1.getIdEmpleado());
		
		//Muestra de numero de empleados de los 4 programadores.
		System.out.println("\n"+"---Se mostrara el numero de empleado de los cuatros programadores---");
		System.out.println("La ID del Empleado "+developer1.getNombreEmpleado()+ " es: "+developer1.getIdEmpleado());
		System.out.println("La ID del Empleado "+developer2.getNombreEmpleado()+ " es: "+developer2.getIdEmpleado());
		System.out.println("La ID del Empleado "+developer3.getNombreEmpleado()+ " es: "+developer3.getIdEmpleado());
		System.out.println("La ID del Empleado "+developer4.getNombreEmpleado()+ " es: "+developer4.getIdEmpleado());
		
		//Descuento de 2 dias vacacionales al programador 2.
		System.out.println("\n"+"---Descuento de 2 dias vacacionales al programador 2---");
		System.out.println("Los días de vacaciones de "+developer2.getNombreEmpleado()+ " era de "+developer2.getVacaciones()+ ", pero ahora sera de "+ developer2.quitardiasVacaciones(2));
		
		//Consulta de días que puede disfrutar cada programador.
		System.out.println("\n"+"---Se consultara el numero de dias vacacionales disfrutables por cada programador ---");
		System.out.println("Los dias actuales de vacaciones del empleado "+developer1.getNombreEmpleado()+" es de "+developer1.getVacaciones());
		System.out.println("Los dias actuales de vacaciones del empleado "+developer2.getNombreEmpleado()+" es de "+developer2.getVacaciones());
		System.out.println("Los dias actuales de vacaciones del empleado "+developer3.getNombreEmpleado()+" es de "+developer3.getVacaciones());
		System.out.println("Los dias actuales de vacaciones del empleado "+developer4.getNombreEmpleado()+" es de "+developer4.getVacaciones());
			
	}
	
}
