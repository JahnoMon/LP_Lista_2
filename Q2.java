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
package exemplos;

public class E1 {

	// Classe 1:

	public static class Quadrado implements Drawable{
		
		public Quadrado() {
		}
		
		@Override
		public void draw() {
			System.out.println(
					  "O O O O O\n"
					+ "O       O\n"
					+ "O       O\n"
					+ "O       O\n"
					+ "O O O O O\n");
		}
	}

	// Classe 2:

	public static class Arvore implements Drawable {
		
		public Arvore() {}
		
		@Override
		public void draw() {
			System.out.printf("%3s\n%4s\n%s\n%3s\n", "O", "OOO", "OOOOO","|");
		}
	}

	// classe 3: 

	public class Triangulo implements Drawable{

		public Triangulo() {}
		
		@Override
		public void draw() {
			System.out.printf("%s\n%9s\n%9s\n%9s\n%s\n", "    O    ", "   O O   ", "  O   O  "," O     O ","O O O O O");
		}
	}
	
	public static class Desenho implements Drawable {
		
		private Drawable desenho;
		
		public Desenho(Drawable desenho) {
			this.desenho = desenho;
		}
		
		@Override
		public void draw() {
			desenho.draw();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.draw();
		
		// sem o E1() -> No enclosing instance of type E1 is accessible. Must qualify the allocation with an enclosing instance of type E1 (e.g. x.new A() where x is an instance of E1)
		Triangulo triangulo = new E1(). new Triangulo();
		triangulo.draw();

		Arvore arvore = new Arvore();
		arvore.draw();		
	}
}
