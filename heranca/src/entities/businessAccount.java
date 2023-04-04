package entities;

public class businessAccount extends Account {

	private Double loanLimit;

	public businessAccount() {
		super();
	}

	public businessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void emprestimo(Double montante) {
		if (montante <= loanLimit) {
			balance += montante - 10.0;
		}
	}

	@Override
	public void saque(double montante) {
		super.saque(montante);
		balance -= 2;
	}
}
