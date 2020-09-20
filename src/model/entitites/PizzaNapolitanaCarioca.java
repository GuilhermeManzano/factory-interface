package model.entitites;

import model.services.Pizza;

public class PizzaNapolitanaCarioca extends Pizza {
	public FabricaRJ fabricaRj;
	
	@Override
	public void preparar() {
		System.out.println("Preparando uma pizza napolitana carioca...");
	}
}
