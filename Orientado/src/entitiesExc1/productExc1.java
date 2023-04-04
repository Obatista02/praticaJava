package entitiesExc1;

public class productExc1 {

	public String name;
	public double price;
	public int quantity;

	public double totalValueStock() {
		double totalValueStock = price * quantity;
		return totalValueStock;
	}

	public void AddProduct(int quantity) {
		this.quantity += quantity;

	}

	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("5.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueStock());
	}
}
