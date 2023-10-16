/*
Questão 2) (0,5 ponto) Em um certo contexto, podem existir várias coisas que podem ser
desenhadas na tela. Cada coisa pode ser desenhada de uma maneira, mas o sistema deve
ser flexível o suficiente para que essas classes sejam desacopladas e coesas o máximo
possível. Crie a interface Drawable, que contém um método abstrato “void draw();”, que
precisa ser implementado pelas classes que implementam a interface. Crie, no mínimo, três
classes bastante diferentes que implementam essa interface. São exemplos de coisas
desenháveis figuras geométricas, cartas escritas, etc. Elas podem ser desenhadas pelo
console.
*/

// interface
package questoes;

public interface Drawable {
	void draw();
}

// Classe 1:

public class Quadrado implements Drawable{
	
	public Quadrado() {
	}
	
	@Override
	public void draw() {
		System.out.println("O O O O O\n"
				+ "O       O\n"
				+ "O       O\n"
				+ "O       O\n"
				+ "O O O O O");
	}
	
	 public static void main(String[] args) {
	        
		 Quadrado quadrado = new Quadrado();
		 
		 quadrado.draw();
	 }
}

// Classe 2:

public class Arvore implements Drawable {
	
	public Arvore() {
		
	}
	
	@Override
	public void draw() {
		System.out.printf("%3s\n%4s\n%s\n%3s", "O", "OOO", "OOOOO","|");
	}
	
	
	 public static void main(String[] args) {
	        
		 Arvore arvore = new Arvore();
		 
		 arvore.draw();
	 }
}

// classe 3: 

public class Triangulo implements Drawable{

	public Triangulo() {
		
	}
	
	@Override
	public void draw() {
		System.out.printf("%s\n%9s\n%9s\n%9s\n%s", "O O O O O", "O       O", "O       O","O       O","O O O O O");
	}
	
	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo();
		
		triangulo.draw();
	}
}
