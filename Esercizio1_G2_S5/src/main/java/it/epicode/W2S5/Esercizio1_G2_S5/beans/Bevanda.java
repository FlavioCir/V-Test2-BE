package it.epicode.W2S5.Esercizio1_G2_S5.beans;

import org.springframework.context.annotation.Scope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Scope("prototype")
public class Bevanda extends Prodotto {

	public Bevanda(double prezzo, String nome, int calorie) {
		super(prezzo, nome, calorie);
	}

	@Override
	public String toString() {
		return nome + " | PREZZO: " + prezzo + " | CALORIE: " + calorie;
	}
	
}
