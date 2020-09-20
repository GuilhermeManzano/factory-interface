package application;

import model.entitites.PizzaCalabresaCarioca;
import model.entitites.PizzaCalabresaPaulista;
import model.entitites.PizzaNapolitanaCarioca;
import model.entitites.PizzaNapolitanaPaulista;

public class Program {
	public static void main(String[] args) {
		PizzaCalabresaCarioca pizzaCalRJ = new PizzaCalabresaCarioca();
		PizzaCalabresaPaulista pizzaCalSP = new PizzaCalabresaPaulista();
		PizzaNapolitanaCarioca pizzaNapRJ = new PizzaNapolitanaCarioca();
		PizzaNapolitanaPaulista pizzaNapSP = new PizzaNapolitanaPaulista();

		pizzaNapSP.preparar();
		pizzaNapSP.cortar();
		pizzaNapSP.assar();
		pizzaNapSP.embalar();		
		System.out.println();
		
		pizzaNapRJ.preparar();
		pizzaNapRJ.cortar();
		pizzaNapRJ.assar();
		pizzaNapRJ.embalar();		
		System.out.println();

		pizzaCalSP.preparar();
		pizzaCalSP.cortar();
		pizzaCalSP.assar();
		pizzaCalSP.embalar();		
		System.out.println();
		
		pizzaCalRJ.preparar();
		pizzaCalRJ.cortar();
		pizzaCalRJ.assar();
		pizzaCalRJ.embalar();		
		System.out.println();
	}
}
