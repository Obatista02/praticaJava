package entitiesExc2;

public class retangulo {

	public double altura;
	public double largura;

	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		return (largura + altura) * 2;
	}

	public double diagonal() {
		return 0;
	}

	public String toString() {
		return "Area: " + area() + " Perimetro: " + perimetro() + " Diagonal: " + diagonal();
	}
}
