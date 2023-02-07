package it.epicode.W2S5.Esercizio1_G2_S5.decorator;

import it.epicode.W2S5.Esercizio1_G2_S5.beans.Pizza;
import it.epicode.W2S5.Esercizio1_G2_S5.beans.Topping;
import lombok.ToString;

@ToString
public class MozzarellaDecorator extends Topping{

	public MozzarellaDecorator(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "mozzarella";
		this.calorie = 20;
		this.prezzo = 0.10;
	}
	
	@Override
	public String getNome() {
		return pizza.getNome() + "mozzarella ";
	}
	
	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + prezzo;
	}
	
	@Override
	public int getCalorie() {
		return pizza.getCalorie() + calorie;
	}

}
