package entidades_orientacao_objetos;

public class Retangulo {

	public double Width;
	public double Height;
	public String nome;

	public double area() {
		return Width * Height;
	}

	public double perimetro() {
		return (Width + Height) * 2;
	}

	public double diagonal() {
		return Math.sqrt(Width * Width + Height * Height);
	}

}
