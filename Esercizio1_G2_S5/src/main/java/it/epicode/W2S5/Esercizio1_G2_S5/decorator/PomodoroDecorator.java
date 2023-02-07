package it.epicode.W2S5.Esercizio1_G2_S5.decorator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.epicode.W2S5.Esercizio1_G2_S5.beans.Pizza;
import it.epicode.W2S5.Esercizio1_G2_S5.beans.Topping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
public class PomodoroDecorator extends Topping{
	
	public PomodoroDecorator(Pizza pizza) {

		this.pizza = pizza;
		this.nomeTopping = "pomodoro";
		this.calorie = 15;
		this.prezzo = 0.10;

	}

	@Override
	public String getNome() {
		return pizza.getNome() + "pomodoro ";
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

