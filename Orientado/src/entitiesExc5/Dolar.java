package entitiesExc5;

public class Dolar {

	public double dolar;
	public double preco;

	public double conversao() {
		
		double soma = dolar * preco;
		
		double valorFinal = (soma * 6)/100;
		
		return soma + valorFinal;
	}
}