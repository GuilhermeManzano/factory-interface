package model.services;

public abstract class Pizza {
	public void preparar() {
		System.out.println("Preparando a pizza...");
	}
	
	public void assar() {
		System.out.println("Assando a pizza...");
	}
	
	public void cortar() {
		System.out.println("Cordanto a pizza...");
	}
	
	public void embalar() {
		System.out.println("Embalando a pizza...");
	}
}
