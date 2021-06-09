package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Idiomas {
	private List<String> idiomas = Arrays.asList("Anão", "Comum", "Élfico", "Gigante", "Gnômico", "Goblin", "Halfling", "Orc",
			 "Abissal", "Celestial", "Dialeto Subterrâneo", "Dracônico", "Infernal", "Primordial", "Silvestre", "Subcomum");
	
	private List<String> faladoPor = Arrays.asList("Anôes", "Humanos", "Elfos", "Ogros, Gigantes", "Gnomos", "Goblinoides",
			 "Halflings", "Orcs", "Demônios", "Celestiais", "Devoradores de mente, Observadores", "Dragões, Draconatos",
			 "Diabos", "Elementais", "Criaturas feéricas", "Comerciantes do Subterrâneo");
	
	private List<String> alfabetos = Arrays.asList("Anão", "Comum", "Élfico", "Anão", "Anão", "Anão", "Comum", "Anão", "Infernal",
			"Celestial", " - ", "Dracônico", "Infernal", "Anão", "Élfico", "Élfico");
	
	public List<String> setIdioma(List<String> idiomas, String antecedente) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> idioma = new ArrayList<String>();
		idioma.addAll(verificarIdiomas(idiomas));
		ArrayList<String> falado_por = new ArrayList<String>();
		falado_por.addAll(this.faladoPor);
		ArrayList<String> alfabeto = new ArrayList<String>();
		alfabeto.addAll(this.alfabetos);
		
		List<String> idiomas_escolhidos = new ArrayList<String>();
		
		int count;
		int opcaoIdioma;
		if(Objects.equals(antecedente, new String("Acólito")) || Objects.equals(antecedente, new String("Sábio"))) {
			count = 2;
		}else {
			count = 1;
		}
		
		while(count != 0) {
			do{
				System.out.println("Escolha " +count +" idiomas:");
				System.out.println("     Idiomas         |Falado por              |Alfabeto");
				for(int i = 0; i < idioma.size(); i++) {
					System.out.println(i +" - " +idioma.get(i) +"        " +falado_por.get(i) +"        " +alfabeto.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				opcaoIdioma = entrada.nextInt();
			}while(opcaoIdioma < 0 || opcaoIdioma > idioma.size());
		
			System.out.println("Tem certeza que quer o idioma " +idioma.get(opcaoIdioma) +"? (Y/N)");
			char decisao = entrada.next().charAt(0);
			
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				if(decisao == 'Y' || decisao == 'y') {
					decisaoLoop = true;
					count--;
					idiomas_escolhidos.add(idioma.get(opcaoIdioma));
					idioma.remove(opcaoIdioma);
					falado_por.remove(opcaoIdioma);
					alfabeto.remove(opcaoIdioma);
					
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}
		}
		return idiomas_escolhidos;
	}
	
	public List<String> setIdioma(String idioma) {
		ArrayList<String> idiomas = new ArrayList<String>();
		idioma.addAll(idiomas);
		ArrayList<String> falado_por = new ArrayList<String>();
		falado_por.addAll(faladoPor);
		ArrayList<String> alfabeto = new ArrayList<String>();
		alfabeto.addAll(alfabetos);
		
		List<String> idiomas_escolhidos = new ArrayList<String>();
		
		Scanner entrada = new Scanner(System.in);
		int opcaoIdioma;
		
		while(count != 0) {
			do{
				System.out.println("Escolha " +count +" idiomas:");
				System.out.println("     Idiomas         |Falado por              |Alfabeto");
				for(int i = 0; i < idioma.size(); i++) {
					System.out.println(i +" - " +idioma.get(i) +"        " +falado_por.get(i) +"        " +alfabeto.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				opcaoIdioma = entrada.nextInt();
			}while(opcaoIdioma < 0 || opcaoIdioma > idioma.size());
		
			System.out.println("Tem certeza que quer o idioma " +idioma.get(opcaoIdioma) +"? (Y/N)");
			char decisao = entrada.next().charAt(0);
			
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				if(decisao == 'Y' || decisao == 'y') {
					decisaoLoop = true;
					count--;
					idiomas_escolhidos.add(idioma.get(opcaoIdioma));
					idioma.remove(opcaoIdioma);
					falado_por.remove(opcaoIdioma);
					alfabeto.remove(opcaoIdioma);
					
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}
		}
		return idiomas_escolhidos;
	}
	
	public ArrayList<String> verificarIdiomas(List<String> idiomas) {
		ArrayList<String> listaIdiomas = new ArrayList<String>();
		for(int i = 0; i < this.idiomas.size(); i++) {
			boolean tem = false;
			for(int c = 0; c < idiomas.size(); c++) {
				if(Objects.equals(idiomas.get(c), this.idiomas.get(i))) tem = true;
			}
			if(tem == false) listaIdiomas.add(this.idiomas.get(i));
		}
		
		return listaIdiomas;
	}
	
	public List<String> getIdiomas() {
		return idiomas;
	}
	
	public List<String> getFaladoPor(){
		return faladoPor;
	}
	
	public List<String> getAlfabeto(){
		return alfabetos;
	}
	
	
}
