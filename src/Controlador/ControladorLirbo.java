package Controlador;

import java.util.List;
import java.util.Scanner;

import Entidad.LibroDto;
import Serivcios.ImplementacionConexionBD;
import Serivcios.ImplementacionConsultaBD;
import Serivcios.InterfazConexionBD;
import Serivcios.InterfazConsultaBD;
import Serivcios.InterfazMenu;
import Serivcios.ImplementacionMenu;

public class ControladorLirbo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Creación de las instancias del Menu	
	
	InterfazConsultaBD ImpConsulta = new ImplementacionConsultaBD();	
	InterfazMenu ImpMenu =new ImplementacionMenu();
	//Implementacion del Menu
	ImpMenu.Menu();
	
	}
	
}