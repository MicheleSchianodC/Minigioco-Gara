import java.util.ArrayList;

public class Modifiche {

	private String nomeModifica;
	private int costo;
	private int potenziamento;
	
	
	
	public Modifiche() {
		
	}
	public Modifiche(String nomeModifica,int costo,int potenziamento) {
		this.nomeModifica=nomeModifica;
		this.costo=costo;
		this.potenziamento=potenziamento;
	}
	
	public String getNomeModifica() {
		return nomeModifica;
	}

	public void setNomeModifica(String nomeModifica) {
		this.nomeModifica = nomeModifica;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getPotenziamento() {
		return potenziamento;
	}

	public void setPotenziamento(int potenziamento) {
		this.potenziamento = potenziamento;
	}
	
	@Override
	
	public String toString() {
		return nomeModifica+" "+costo+" $ "+"potenziamento : +"+potenziamento+"  |  ";
	}
}
