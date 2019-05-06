package entidades_exercicio_estoque;

public class Product {

	public String name;
	public double price;
	public int quantity;

	// Construtor padrão em Java.
	public Product() {

	}

	// Construtor com argumentos nos atributos (dados ou campos) da classe.
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Construtor com apenas dois argumentos atributos, assumindo que a quantidade
	// terá o valor padrão que é zero.
	// Nesse caso entendemos como Sobrecarga.
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
