import java.util.InputMismatchException;
import java.util.Scanner;

public class UP {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Utente utente = new Utente();
		
		Avversario avversario = new Avversario();
		
		JDM veicolo1 = new JDM("Mazda", "RX 7", 41000,77);
		JDM veicolo2 = new JDM("Subaru", "BRZ", 40500,77);
		JDM veicolo3 = new JDM("Nissan", "Z Prototype", 40000,77);
		
		European veicolo4 = new European("BMW", "128TI", 40500, 77);
		European veicolo5 = new European("Mercedes", "A35 AMG", 41000, 77);
		European veicolo6 = new European("Volswagen", "Golf GTI 8", 40000, 77);
		
		European veicoloAvv = new European("BMW", "M5", 00000,00);
		
		ListaVeicoli.jdm.add(veicolo1);
		ListaVeicoli.jdm.add(veicolo2);
		ListaVeicoli.jdm.add(veicolo3);
		
		ListaVeicoli.euro.add(veicolo4);
		ListaVeicoli.euro.add(veicolo5);
		ListaVeicoli.euro.add(veicolo6);
		
					
		Modifiche induzioneForzata = new Modifiche("Induzione Forzata", 5000, 4);
		Modifiche sistemaDiAlimentazione = new Modifiche("Sistema di alimentazione", 5500, 5);
		Modifiche centralina = new Modifiche("Centralina", 4500, 4);
		
		ListaModifiche.listaModifiche.add(induzioneForzata);
		ListaModifiche.listaModifiche.add(centralina);
		ListaModifiche.listaModifiche.add(sistemaDiAlimentazione);
		
		
		boolean nome=true;
		System.out.println("- Benvenuto in HellCity -");
		
		
		while(nome==true) {
			sceltaNome(utente);
			System.out.println("Vuoi confermare il nome?  Si | No");
			String confermareNome= scan.nextLine();
			if(confermareNome.equals("Si")) {
				nome=false;
			}else if(validation(confermareNome)) {
				System.out.println("Devi scegliere una risposta tra Si | No  *Attento alla Maiuscole");
			}
		
		}
			
		
		System.out.println("Scegli la categoria del veicolo che vuoi acquistare");
		boolean booSceltaCat=true;
		Veicoli scano = null;
		
		int sceltaCat;
		
		while(booSceltaCat==true) {
		System.out.println(" 1.  Categoria JDM | 2.  Categoria European");

        try {                                         //
        	 sceltaCat = scan.nextInt();
		}
		
		catch(InputMismatchException exc) {
			
			scan.nextLine();
			continue;
		}
		
		if(sceltaCat==1) {
			for( JDM m : ListaVeicoli.jdm) {
				System.out.print(m);
				
				booSceltaCat=false;
			}
			    System.out.println();
				System.out.println("Inserisci il numero del veicolo che vuoi acquistare");
				try {
				  int sceltaMach=scan.nextInt();
				  if(sceltaMach==1) {
					scano=veicolo1;
					System.out.println("Hai comprato : "+scano.getMarca()+" "+scano.getModello());
				  }
				  if(sceltaMach==2) {
					scano=veicolo2;
					System.out.println("Hai comprato : "+scano.getMarca()+" "+scano.getModello());
				  }
				  if(sceltaMach==3) {
					scano=veicolo3;
					System.out.println("Hai comprato : "+scano.getMarca()+" "+scano.getModello());
				  }
				
				  utenteRankingAum(utente, scano);
				  System.out.println("Il ranking del tuo veicolo è : "+utente.getRanking());
				  diminuisciSoldiAcquisto(utente, scano);
				  System.out.println("Ecco cosa ti è rimasto: "+utente.getSoldi()+" $");
				}
				catch(NullPointerException exc) {
					System.out.println("Choices have consequences...");
					return;
					
				}
				catch(InputMismatchException exc) {
					System.out.println("Choices have consequences...");
					return;
				}
		
				
		}
		if(sceltaCat==2) {
			for(European m : ListaVeicoli.euro) {
				System.out.print(m);
				booSceltaCat=false;
			}
			System.out.println();
			System.out.println("Inserisci il numero del veicolo che vuoi acquistare");
			try {
			  int sceltaMach=scan.nextInt();
			  if(sceltaMach==1) {
				scano=veicolo4;
				System.out.println("Hai comprato : "+scano.getMarca()+" "+scano.getModello());
			  }
			  if(sceltaMach==2) {
				scano=veicolo5;
				System.out.println("Hai comprato : "+scano.getMarca()+" "+scano.getModello());
			  }
			  if(sceltaMach==3) {
				scano=veicolo6;
				System.out.println("Hai comprato : "+scano.getMarca()+" "+scano.getModello());
			  }
			  utenteRankingAum(utente, scano);
			  System.out.println("Il ranking del tuo veicolo è : "+utente.getRanking());
			  diminuisciSoldiAcquisto(utente, scano);
			  System.out.println("Ecco cosa ti è rimasto: "+utente.getSoldi()+" $");
			  }
			catch(NullPointerException exc) {
				System.out.println("Choices have consequences...");
				return;
			}
			catch(InputMismatchException exc) {
				System.out.println("Choices have consequences...");
				return;
			}
			
			
		}else if(validationCat(sceltaCat)){
			System.out.println("Devi inserire un numero tra 1 o 2");
		}
		
		
		}
		
		
		
		
		String debuga=scan.nextLine();
		
		boolean vie=true;
		while(vie==true) { 
		System.out.println("Ok , ora puoi scegliere se gareggiare direttamente contro "+avversario.getNome()+" oppure modificare il tuo veicolo");
		System.out.println("scegli :  Gareggia  |  Modifica");
		String bivio = scan.nextLine();
		 if(bivio.equals("Gareggia")) {
			gareggia(utente, avversario);
			vie=false;
		 }
		 if(bivio.equals("Modifica")) {
			vie=false;
			  
			  int nModifiche=0;
			  try {
			  while(nModifiche<1) {
				  System.out.println("Scegli quali modifiche apportare. Ricorda puoi effettuare al massimo 1 modifica");
				  for( Modifiche m : ListaModifiche.listaModifiche) {
					  System.out.print(m);
				  }
				  	System.out.println();
					  System.out.println("Inserisci il numero della modifica che vuoi installare");
					  
					  int modifica=scan.nextInt();
					  if(modifica==1) {
						  aumentaRanking(utente, induzioneForzata);
						  System.out.println("Ranking attuale del tuo veicolo dopo la modifica: "+utente.getRanking());
						  diminuisciSoldiMod(utente, induzioneForzata);
						  System.out.println("Ecco quello che ti è rimasto "+utente.getSoldi()+" $");
						  nModifiche++;
					  }
					  if(modifica==2) {
						  aumentaRanking(utente, centralina);
						  System.out.println("Ranking attuale del tuo veicolo dopo la modifica: "+utente.getRanking());
						  diminuisciSoldiMod(utente, centralina);
						  System.out.println("Ecco quello che ti è rimasto "+utente.getSoldi()+" $");
						  nModifiche++;
					  }
					  if(modifica==3) {
						  aumentaRanking(utente, sistemaDiAlimentazione);
						  System.out.println("Ranking attuale del tuo veicolo dopo la modifica: "+utente.getRanking());
						  diminuisciSoldiMod(utente, sistemaDiAlimentazione);
						  System.out.println("Ecco quello che ti è rimasto "+utente.getSoldi()+" $");
						  nModifiche++; 
					  }
				  
			      }
			  }
			  catch(InputMismatchException exc){
				 System.out.println("Choices have consequences...");
				 return;
			  }
			  boolean verifica=true;
			  while(verifica==true) {
			  System.out.println("-- Ok , ora sei pronto a gareggiare, premi 'x' per gareggiare --");
			  String gara= scan.next();
			  if(gara.equals("x")) {
				  gareggia(utente, avversario);
				  verifica=false;
			  }else {
				  System.out.println("Inserisci 'x' per gareggiare");
			  }
		 }
		}
		 if(validationVie(bivio)) {
			System.out.println("Devi scrivere o Garreggia o Modifica!");
		 }
		
		}
}
	
        private static void sceltaNome(Utente u) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Scegli il tuo nome da strada");
		String nome= scan.nextLine();
		System.out.println("Nome selezionato: "+nome);
		u.nome=nome;
		
	}
		
	  private static void aumentaRanking(Utente u,Modifiche i) {
			
			u.ranking=u.getRanking()+i.getPotenziamento();
		
			
	  }
	  

	  private static void diminuisciSoldiMod(Utente u,Modifiche i) {
		  u.soldi=u.getSoldi()-i.getCosto();
	  }

	  
	  private static void gareggia(Utente u,Avversario a) {
		  if(u.getRanking()<a.getRanking()) {
			  System.out.println(a.getNome()+" ti ha stracciato, dovevi modificare le prestazioni del tuo veicolo per avere qualche chance");
		    
		  }else {
			  System.out.println("Lo hai stracciato!! "+u.getNome()+" hai guadagnato il mio rispetto, ti contatterò nel caso di nuove gare!");
		  }
		  
	  }
	  
	  private static void utenteRankingAum(Utente u,Veicoli a) {
		 u.ranking=u.getRanking()+a.getRanking();
	  }
	  

	  private static void diminuisciSoldiAcquisto(Utente u,Veicoli a) {
		  u.soldi=u.getSoldi()-a.getCosto();
	  }
	  
	  
	  private static boolean validation(String conferma) {
			
			boolean sbagliato=true;
			if(("Si".equals(conferma)) || ("No".equals(conferma))) {
					sbagliato=false;
				}
			
			return sbagliato;	
			}
		
	  private static boolean validationCat(int c) {
		  boolean sbagliato = true;
		  if((c==(1)) || (c==(2))) {
			  sbagliato=false;
		  }
		  return sbagliato;
	  }
	  
	  private static boolean validationVie(String conferma) {
			
			boolean sbagliato=true;
			if(("Gareggia".equals(conferma)) || ("Modifica".equals(conferma))) {
					sbagliato=false;
				}
			
			return sbagliato;	
			}
		
}
