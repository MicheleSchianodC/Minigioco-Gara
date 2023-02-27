import java.util.Scanner;

public class Utente {

	String nome;
	int soldi=47000;
	int ranking=0;
	
	
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSoldi() {
		return soldi;
	}

	public void setSoldi(int soldi) {
		this.soldi = soldi;
	}
	
	public int getRanking() {
		return ranking;
	}

	
}
