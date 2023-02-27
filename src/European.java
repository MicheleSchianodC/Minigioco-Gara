
public class European extends Veicoli{

    public European() {
		
	}
	public European(String marca,String modello,int costo,int ranking) {
		super(marca,modello,costo,ranking);
		
	}


	@Override
	
	public void Accensione() {
		
		System.out.println("Motore inizia a girare");
	}

	@Override
	
	public void Spegnimento() {
		System.out.println("Giri del motore arrivano a zero");
	}
	
	@Override
	
	public String toString() {
		return marca+" "+modello+"  "+costo+" $  | ";
	}
}
