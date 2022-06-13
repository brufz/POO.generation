package br.com.generation.listaheranca;

public class Preguica extends Animal {
	
	public void subirArvore(float metros) throws InterruptedException {
		for (int i = 0; i <= metros; i += 5) {
			System.out.println("Subindo... " + i + "metros");
			Thread.sleep(500);
		}
	}
}
