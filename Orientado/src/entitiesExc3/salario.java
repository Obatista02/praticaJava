package entitiesExc3;

public class salario {
	public String name;
	public double glossSalary;
	public double tax;

	public double NetSalary() {
		return glossSalary - tax;
	}

	public void incrementSalary(double porcentagem) {
		glossSalary += glossSalary * porcentagem / 100;
	}

	public String toString() {
		return name + ", " + NetSalary();
	}
}