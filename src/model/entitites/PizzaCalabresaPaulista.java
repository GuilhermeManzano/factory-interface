package model.entitites;

import model.services.Pizza;

public class PizzaCalabresaPaulista extends Pizza {
	public FabricaSP fabricaSp;
	
	@Override
	public void preparar() {
		System.out.println("Preparando uma pizza calabresa paulista...");
	}
}
