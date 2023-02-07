package it.epicode.W2S5.Esercizio1_G2_S5.decorator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.epicode.W2S5.Esercizio1_G2_S5.beans.Pizza;
import it.epicode.W2S5.Esercizio1_G2_S5.beans.Topping;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
@NoArgsConstructor
public class AnanasDecorator extends Topping{

	public AnanasDecorator(Pizza pizza) {
		
		this.pizza = pizza;
		this.nomeTopping = "ananas";
		this.calorie = 50;
		this.prezzo = 0.25;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + "ananas ";
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
