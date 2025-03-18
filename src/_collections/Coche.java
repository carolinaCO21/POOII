package _collections;

import java.util.Objects;
import java.util.Random;

public class Coche {

	private Marca marca;
	private Color color;
	
	//Cuando no se indique ningún parámetro, empleará una marca y color aleatorios de entre los posibles.
	public Coche() {
		marca = Marca.marcaAleatoria();
		color = Color.colorAleatorio();
	}
	
	

	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}



	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) // si es el mismo objeto
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass()) 
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca; 
	}
	
	  
	@Override
	public String toString() {
		return String.format("Coche: %s %s (%d)", marca, color, hashCode());
	}


	
	
	
}
