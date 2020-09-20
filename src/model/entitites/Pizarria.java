package model.entitites;

import model.services.IFabrica;
import model.services.Pizza;

public class Pizarria implements IFabrica {
	public void Pizzaria(IFabrica fabrica) {
		System.out.println("Bem vindo a fábrica" + fabrica);
	}
	
	public Pizza pedirPizza(String tipo) {
		return null;
	}

	@Override
	public Pizza getPizza(String tipo) {
		return null;
	}
}
