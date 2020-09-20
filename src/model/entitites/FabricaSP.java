package model.entitites;

import model.services.IFabrica;
import model.services.Pizza;

public abstract class FabricaSP implements IFabrica {
	@Override
	public Pizza getPizza(String tipo) {
		return null;
	}
}
