package model.entitites;

import model.services.IFabrica;
import model.services.Pizza;

public abstract class FabricaRJ extends PizzaNapolitanaCarioca implements IFabrica {
	@Override
	public Pizza getPizza(String tipo) {
		return null;
	}
}
