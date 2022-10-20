package ejercicio;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class BBDD {

	private static Configuration config;
	private static SessionFactory factoria;
	private static Session sesion;
	
	public static void iniciar_sesion()	{
		config = new Configuration();
		config.configure("./hibernate.cfg.xml");
		factoria = config.buildSessionFactory();
		sesion = factoria.openSession();
	}
	
	public static void cerrar_sesion()	{
		System.out.println("\nPrograma finalizado.");
		factoria.close();
		sesion.close();
	}
	
	public static void mostrar_citas()	{
		System.out.println("LISTA CITAS");
		Query queryCitas = sesion.createQuery("FROM Citas");
		ArrayList<Citas> listaCitas = (ArrayList<Citas>) queryCitas.list();
		for (Citas citas : listaCitas) {
			System.out.println("\t" + citas);
		}
	}
	
	public static void mostrar_medicos()	{
		System.out.println("LISTA MEDICOS");
		Query queryMedicos = sesion.createQuery("FROM Medicos");
		ArrayList<Medicos> listaMedicos = (ArrayList<Medicos>) queryMedicos.list();
		for (Medicos medicos : listaMedicos) {
			System.out.println("\t" + medicos);
		}
	}
	
	public static void mostrar_pacientes()	{
		System.out.println("LISTA PACIENTES");
		Query queryPacientes = sesion.createQuery("FROM Pacientes");
		ArrayList<Pacientes> listaPacientes = (ArrayList<Pacientes>) queryPacientes.list();
		for (Pacientes pacientes : listaPacientes) {
			System.out.println("\t" + pacientes);
		}
	}
}
