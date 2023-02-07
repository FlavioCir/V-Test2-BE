package it.epicode.W2S5.Esercizio1_G2_S5.beans;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Component
@ToString
public class Ordine {

	Tavolo tavolo;
	int nOrdine;
	StatoOrdine statoOrdine;
	int coperti;
	LocalDate oraOrdine;
	double importoTotale = 0;
	List<Prodotto> lista;
	
	public Ordine(Tavolo tavolo, int nOrdine, StatoOrdine statoOrdine, int coperti, LocalDate oraOrdine, List<Prodotto> lista) {
		this.tavolo = tavolo;
		this.nOrdine = nOrdine;
		this.statoOrdine = statoOrdine;
		this.coperti = coperti;
		this.oraOrdine = oraOrdine;
		this.lista = lista;
	}
	
}
