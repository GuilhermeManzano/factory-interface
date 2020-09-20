package model.entitites;

import model.services.Pizza;

public class PizzaCalabresaCarioca extends Pizza {
	@Override
	public void preparar() {
		System.out.println("Preparando a pizza de cababresa carioca...");
	}
}
