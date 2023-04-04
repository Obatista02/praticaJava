package entities;

public class SavingsAccount extends Account {

	private Double taxaJuros;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double taxaJuros) {
		super(number, holder, balance);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void uptadeBalance() {
		balance += balance * taxaJuros;
	}
	@Override
	public void saque(double montante) {
		balance -= montante;
	}

}
