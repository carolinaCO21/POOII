package _parking_1;

import java.util.Objects;

public class Coche {
	Marca marca;
	Color color;
	
	public Coche(Marca marca, Color color) {
		super();
		this.marca = marca;
		this.color = color;
	}
	
	public Coche() {
		marca = Marca.marcaAleatoria();
		color = Color.colorAleatorio();
	}
	
	

	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return String.format("Coche: %s %s", marca, color);
				//"Coche [marca=" + marca + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}
	
	
	
	
	
}
