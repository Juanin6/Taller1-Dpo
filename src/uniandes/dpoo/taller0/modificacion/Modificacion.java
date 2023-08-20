package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
public class Modificacion {

	public static void main(String[]args) throws FileNotFoundException, IOException {
		System.out.println("Hola mundo!");
		String path = "./data/atletas.csv";
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo(path);
		System.out.println(calc.paisConMasMedallistas());
	}

	
	
}
