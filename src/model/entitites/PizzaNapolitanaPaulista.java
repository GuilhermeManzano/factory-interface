package model.entitites;

import model.services.Pizza;

public class PizzaNapolitanaPaulista extends Pizza {
	public FabricaSP fabricaSp;
	
	@Override
	public void preparar() {
		System.out.println("Preparando uma pizza napolitana paulista...");
	}
}
