
public abstract class Veicoli {

	String marca;
	String modello;
	int costo;
	int ranking;
	
	
	public Veicoli() {
		
	}
	public Veicoli (String marca,String modello,int costo,int ranking) {
		this.marca=marca;
		this.modello=modello;
		this.costo=costo;
		this.ranking=ranking;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public abstract void Accensione();
	
	public abstract void Spegnimento();

}
