package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Equipamentos {
//Armas//mudar
	private ArrayList<String> Armas_simples_CAC = new ArrayList<String>();
	private List<String> ArmasSimplesCAC = Arrays.asList("Adaga", "Azagaia", "Bordão", "Clava Grande", "Foice Curta", "Lança", "Maça", "Machadinha", "Martelo Leve", "Porrete");
	private ArrayList<Integer> AS_CAC_preco = new ArrayList<Integer>();
	private List<Integer> ASCACpreco = Arrays.asList(2, 5, 2, 2, 1, 1, 5, 5, 2, 1);
	private ArrayList<String> AS_CAC_dano = new ArrayList<String>();
	private List<String> ASCACdano = Arrays.asList("1d4 perfurante", "1d6 perfurante", "1d6 concussão", "1d8 concussão", "1d4 cortante", "1d6 perfurante", "1d6 concussão",
			 "1d6 cortante", "1d4 concussão", "1d4 concussão");
	private ArrayList<Double> AS_CAC_peso = new ArrayList<Double>();
	private List<Double> ASCACpeso = Arrays.asList(0.5, 1.0, 2.0, 5.0, 1.0, 1.5, 2.0, 1.0, 1.0, 1.0);
	private ArrayList<String> AS_CAC_propriedades = new ArrayList<String>();
	private List<String> ASCACpropriedades = Arrays.asList("Acuidade, leve, arremesso (distância 6/18)", "Arremesso (distância 9/36)", "Versátil (1d8)", "Pesada, duas mãos", "Leve", "Arremesso (distância 6/18), versátil (1d8)", " ",
			 "Leve, arremesso (distância 6/18)", "Leve, arremesso (distância 6/18)", "Leve");
	
	private ArrayList<String> Armas_simples_distancia = new ArrayList<String>();
	private List<String> ArmasSimplesDistancia = Arrays.asList("Arco Curto", "Besta leve", "Dardo", "Funda");
	private ArrayList<Integer> AS_D_preco = new ArrayList<Integer>();
	private List<Integer> ASDpreco = Arrays.asList(25, 25, 5, 1);
	private ArrayList<String> AS_D_dano = new ArrayList<String>();
	private List<String> ASDdano = Arrays.asList("1d6 perfurante", "1d8 perfurante", "1d4 perfurante", "1d4 concussão");
	private ArrayList<Double> AS_D_peso = new ArrayList<Double>();
	private List<Double> ASDpeso = Arrays.asList(1.0, 2.5, 0.1, 0.0);
	private ArrayList<String> AS_D_propriedades = new ArrayList<String>();
	private List<String> ASDpropriedades = Arrays.asList("Munição (distância 24/96), duas mãos", "Munição (distância 24/96), recarga, duas mãos", "Acuidade, arremesso (distância 6/18)", "Munição (distância 9/36)");
	
	private ArrayList<String> Armas_marciais_CAC = new ArrayList<String>();
	private List<String> ArmasMarciaisCAC = Arrays.asList("Alabarda", "Cimitarra", "Chicote", "Espada Curta", "Espada Grande", "Espada Longa", "Glaive", "Lança de Montaria", "Lança Longa", "Maça Estrela",
			 "Machado Grande", "Machado de Batalha", "Malho", "Mangual", "Martelo de Guerra", "Picareta de Guerra", "Rapieira", "Tridente");
	private ArrayList<Integer> AM_CAC_preco = new ArrayList<Integer>();
	private List<Integer> AMCACpreco = Arrays.asList(20, 25, 2, 10, 50, 15, 20, 10, 5, 15, 30, 10, 10, 10, 15, 5, 25, 5);
	private ArrayList<String> AM_CAC_dano = new ArrayList<String>();
	private List<String> AMCACdano = Arrays.asList("1d10 cortante", "1d6 cortante", "1d4 cortante", "1d6 perfurante", "2d6 cortante", "1d8 cortante", "1d10 cortante", "1d12 perfurante", "1d10 perfurante",
			"1d8 perfurante", "1d12 cortante", "1d8 cortante", "2d6 concussão", "1d8 concussão", "1d8 concussão", "1d8 perfurante", "1d8 perfurante", "1d6 perfurante");
	private ArrayList<Double> AM_CAC_peso = new ArrayList<Double>();
	private List<Double> AMCACpeso = Arrays.asList(3.0, 1.5, 1.5, 1.0, 3.0, 1.5, 3.0, 3.0, 4.0, 2.0, 3.5, 2.0, 5.0, 1.0, 1.0, 1.0, 1.0, 2.0);
	private ArrayList<String> AM_CAC_propriedades = new ArrayList<String>();
	private List<String> AMCACpropriedades = Arrays.asList("Pesada, alcance, duas mãos", "Acuidade, leve", "Acuidade, alcance", "Acuidade leve", "Pesada, duas mãos", "Versátil (1d10)", "Pesada, alcance, duas mão", 
			"Alcance, especial", "Pesada, alcance, duas mãos", " ", "Pesada, duas mãos", "Versátil (1d10)", "Pesada, duas mãos", " ", "Versátil (1d10)", " ", "Acuidade", "Arrenesso (6/18), versátil (1d8)");
	
	private ArrayList<String> Armas_marciais_distancia = new ArrayList<String>();
	private List<String> ArmasMarciaisD = Arrays.asList("Arco Longo", "Besta de Mão", "Besta Pesada", "Rede", "Zarabatana");
	private ArrayList<Integer> AM_D_preco = new ArrayList<Integer>();
	private List<Integer> AMDpreco = Arrays.asList(50, 75, 50, 1, 10);
	private ArrayList<String> AM_D_dano = new ArrayList<String>();
	private List<String> AMDdano = Arrays.asList("1d8 perfurante", "1d6 perfurante", "1d10 perfurante", " ", "1 perfurante");
	private ArrayList<Double> AM_D_peso = new ArrayList<Double>();
	private List<Double> AMDpeso = Arrays.asList(1.0, 1.5, 4.5, 1.5, 0.5);
	private ArrayList<String> AM_D_propriedades = new ArrayList<String>();
	private List<String> AMDpropriedades = Arrays.asList("Munição (distância 45/180), pesada, duas mãos", "Munição (distância 9/36), leve, recarga", "Munição (distância 30/120), pesada, recarga, duas mãos", 
			"Especial, arremesso (distância 1,5/4,5)", "Munição (distância 7,5/30), recarga");

	public void iniciaAllarmas() {
		this.Armas_simples_CAC.addAll(this.ArmasSimplesCAC);
		this.AS_CAC_preco.addAll(this.ASCACpreco);
		this.AS_CAC_dano.addAll(this.ASCACdano);
		this.AS_CAC_peso.addAll(this.ASCACpeso);
		this.AS_CAC_propriedades.addAll(this.ASCACpropriedades);
		
		this.Armas_simples_distancia.addAll(this.ArmasSimplesDistancia);
		this.AS_D_preco.addAll(this.ASDpreco);
		this.AS_D_dano.addAll(this.ASDdano);
		this.AS_D_peso.addAll(this.ASDpeso);
		this.AS_D_propriedades.addAll(this.ASDpropriedades);
		
		this.Armas_marciais_CAC.addAll(this.ArmasMarciaisCAC);
		this.AM_CAC_preco.addAll(this.AMCACpreco);
		this.AM_CAC_dano.addAll(this.AMCACdano);
		this.AM_CAC_peso.addAll(this.AMCACpeso);
		this.AM_CAC_propriedades.addAll(this.AMCACpropriedades);
		
		this.Armas_marciais_distancia.addAll(this.ArmasMarciaisD);
		this.AM_D_preco.addAll(this.AMDpreco);
		this.AM_D_dano.addAll(this.AMDdano);
		this.AM_D_peso.addAll(this.AMDpeso);
		this.AM_D_propriedades.addAll(this.AMDpropriedades);
	}
	
	public ArrayList<String> getArmas_simples_CAC() {
		return Armas_simples_CAC;
	}
	
	public ArrayList<Integer> getAS_CAC_preco() {
		return AS_CAC_preco;
	}
	
	public ArrayList<String> getAS_CAC_dano() {
		return AS_CAC_dano;
	}
	
	public ArrayList<Double> getAS_CAC_peso() {
		return AS_CAC_peso;
	}
	
	public ArrayList<String> getAS_CAC_propriedades() {
		return AS_CAC_propriedades;
	}
	
	public ArrayList<String> getArmas_simples_distancia() {
		return Armas_simples_distancia;
	}
	
	public ArrayList<Integer> getAS_D_preco() {
		return AS_D_preco;
	}
	
	public ArrayList<String> getAS_D_dano() {
		return AS_D_dano;
	}
	
	public ArrayList<Double> getAS_D_peso() {
		return AS_D_peso;
	}
	
	public ArrayList<String> getAS_D_propriedades() {
		return AS_D_propriedades;
	}
	
	public ArrayList<String> getArmas_marciais_CAC() {
		return Armas_marciais_CAC;
	}
	
	public ArrayList<Integer> getAM_CAC_preco() {
		return AM_CAC_preco;
	}
	
	public ArrayList<String> getAM_CAC_dano() {
		return AM_CAC_dano;
	}
	
	public ArrayList<Double> getAM_CAC_peso() {
		return AM_CAC_peso;
	}
	
	public ArrayList<String> getAM_CAC_propriedades() {
		return AM_CAC_propriedades;
	}
	
	public ArrayList<String> getArmas_marciais_distancia() {
		return Armas_marciais_distancia;
	}
	
	public ArrayList<Integer> getAM_D_preco() {
		return AM_D_preco;
	}
	
	public ArrayList<String> getAM_D_dano() {
		return AM_D_dano;
	}
	
	public ArrayList<Double> getAM_D_peso() {
		return AM_D_peso;
	}
	
	public ArrayList<String> getAM_D_propriedades() {
		return AM_D_propriedades;
	}
	
	public String setArmasSimples() {
		iniciaAllarmas();
		Scanner entrada = new Scanner(System.in);
		char decisaocase2;
		int escolha;
		
		do {
			System.out.println("Escolha uma das armas:");
			
			System.out.println("Nome     Dano     Propriedades");
			for(int i = 0; i < getArmas_simples_CAC().size(); i++) {
				System.out.println((i+1) +" - " +getArmas_simples_CAC().get(i) +" | " +getAS_CAC_dano().get(i) +" | " +getAS_CAC_propriedades().get(i));
			}
			
			for(int i = 0; i < getArmas_simples_distancia().size(); i++) {
				System.out.printf((i+getArmas_simples_CAC().size()+1) +" - " +getArmas_simples_distancia().get(i) +" | " +getAS_D_dano().get(i) +" | " +getAS_D_propriedades().get(i));
			}
			
			while(!entrada.hasNextInt()) {
				System.out.println("Por favor digite um numero!");
				entrada.next();
			}
			
			escolha = entrada.nextInt();
		}while(escolha <= 0 || escolha > (getArmas_simples_CAC().size()+getArmas_simples_distancia().size()-1));
		
		boolean decisao2Loop = false;
		while(decisao2Loop == false) {
			if(escolha <= getArmas_simples_CAC().size()) {
				System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_simples_CAC().get(escolha-1));
				
				decisaocase2 = entrada.next().charAt(0);
				if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
					return getArmas_simples_CAC().get(escolha-1);
				}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
					decisao2Loop = true;
				}
				
			}else {
				System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_simples_CAC().get(escolha-1));
				
				decisaocase2 = entrada.next().charAt(0);
				if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
					return getArmas_simples_distancia().get(escolha-getArmas_simples_CAC().size()-1);
				}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
					decisao2Loop = true;
				}
			}
		}
		return null;
	}
	
	public ArrayList<String> setArmasSimples(int count) {
		iniciaAllarmas();
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> armas = new ArrayList<String>();
		char decisaocase2;
		int escolha;
		while(count != 0) {
			boolean decisao2Loop = false;
			do {
				System.out.println("Escolha uma das armas:");
			
				System.out.println("Nome     Dano     Propriedades");
				for(int i = 0; i < getArmas_simples_CAC().size(); i++) {
					System.out.println((i+1) +" - " +getArmas_simples_CAC().get(i) +" | " +getAS_CAC_dano().get(i) +" | " +getAS_CAC_propriedades().get(i));
				}
				
				for(int i = 0; i < getArmas_simples_distancia().size(); i++) {
					System.out.printf((i+getArmas_simples_CAC().size()+1) +" - " +getArmas_simples_distancia().get(i) +" | " +getAS_D_dano().get(i) +" | " +getAS_D_propriedades().get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Por favor digite um numero!");
					entrada.next();
				}
				
				escolha = entrada.nextInt();
			}while(escolha <= 0 || escolha > (getArmas_simples_CAC().size()+getArmas_simples_distancia().size()-1));
			
			while(decisao2Loop == false) {
				if(escolha <= getArmas_simples_CAC().size()) {
					System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_simples_CAC().get(escolha-1));
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						armas.add(getArmas_simples_CAC().get(escolha-1));
						count--;
						decisao2Loop = true;
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
					
				}else {
					System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_simples_CAC().get(escolha-1));
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						armas.add(getArmas_simples_distancia().get(escolha-getArmas_simples_CAC().size()-1));
						count--;
						decisao2Loop = true;
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
				}
			}
		}
		return armas;
	}
	
	public String setArmaCACSimples() {
		iniciaAllarmas();
		Scanner entrada = new Scanner(System.in);
		boolean ArmaCACSimplesLoop = false;
		while(ArmaCACSimplesLoop == false) {
			int escolha;
			
			do {
				System.out.println("Escolha uma das armas:");
			
				System.out.println("Nome       Dano       Propriedades");
				for(int i = 0; i < getArmas_simples_CAC().size(); i++) {
					System.out.println(i +" - " +getArmas_simples_CAC().get(i) +" | " +getAS_CAC_dano().get(i) +" | " +getAS_CAC_propriedades().get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Por favor digite um numero!");
					entrada.next();
				}
				
				escolha = entrada.nextInt();
			}while(escolha < 0 || escolha > getArmas_simples_CAC().size()-1);
			
			boolean decisao2Loop = false;
			while(decisao2Loop == false) {
				char decisaocase2;
				System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_simples_CAC().get(escolha));
				
				decisaocase2 = entrada.next().charAt(0);
				if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
					return getArmas_simples_CAC().get(escolha);
				}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
					decisao2Loop = true;
				}
			}
		}
		return null;
	}
	
	public ArrayList<String> setArmaCACSimples(int count) {
		iniciaAllarmas();
		ArrayList<String> armasCACSimples = new ArrayList<String>();
		armasCACSimples.addAll(getArmas_simples_CAC());
		ArrayList<String> armasEscolhidas = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		count = 2;
		while(count != 0) {
			int escolha;
			
			do {
				System.out.println("Escolha uma das armas:");
			
				System.out.println("Nome       Dano       Propriedades");
				for(int i = 0; i < armasCACSimples.size(); i++) {
					for(int c = 0; c < getArmas_simples_CAC().size(); c++) {
						if(Objects.equals(armasCACSimples.get(i), getArmas_simples_CAC().get(c))) {
							System.out.println(i +" - " +armasCACSimples.get(i) +" | " +getAS_CAC_dano().get(c) +" | " +getAS_CAC_propriedades().get(c));
						}
					}
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Por favor digite um numero!");
					entrada.next();
				}
				
				escolha = entrada.nextInt();
			}while(escolha < 0 || escolha > armasCACSimples.size()-1);
			
			boolean decisao2Loop = false;
			while(decisao2Loop == false) {
				char decisaocase2;
				System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", armasCACSimples.get(escolha));
				
				decisaocase2 = entrada.next().charAt(0);
				if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
					armasEscolhidas.add(armasCACSimples.get(escolha));
					count--;
					decisao2Loop = true;
				}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
					decisao2Loop = true;
				}
			}
		}
		return armasEscolhidas;
	}
	
	public String setArmaCACMarcial() {
		iniciaAllarmas();
		Scanner entrada = new Scanner(System.in);
		boolean ArmaCACSimplesLoop = false;
		while(ArmaCACSimplesLoop == false) {
			int escolha;
			
			do {
				System.out.println("Escolha uma das armas:");
			
				System.out.println("Nome       Dano       Propriedades");
				for(int i = 0; i < getArmas_marciais_CAC().size(); i++) {
					System.out.println(i +" - " +getArmas_marciais_CAC().get(i) +" | " +getAM_CAC_dano().get(i) +" | " +getAM_CAC_propriedades().get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Por favor digite um numero!");
					entrada.next();
				}
				
				escolha = entrada.nextInt();
			}while(escolha < 0 || escolha > getArmas_marciais_CAC().size()-1);
			
			boolean decisao2Loop = false;
			while(decisao2Loop == false) {
				char decisaocase2;
				System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_marciais_CAC().get(escolha));
				
				decisaocase2 = entrada.next().charAt(0);
				if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
					return getArmas_marciais_CAC().get(escolha);
				}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
					decisao2Loop = true;
				}
			}
		}
		return null;
	}
	
	
	public ArrayList<String> setArmasMarciais(int count) {
		iniciaAllarmas();
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> armas = new ArrayList<String>();
		int escolha;
		while(count != 0) {
			do {
				System.out.println("Escolha uma das armas:");
			
				System.out.println("Nome     Dano     Propriedades");
				for(int i = 0; i < getArmas_marciais_CAC().size(); i++) {
					System.out.println((i+1) +" - " +getArmas_marciais_CAC().get(i) +" | " +getAM_CAC_dano().get(i) +" | " +getAM_CAC_propriedades().get(i));
				}
				
				for(int i = 0; i < getArmas_marciais_distancia().size(); i++) {
					System.out.printf((i+getArmas_marciais_CAC().size()+1) +" - " +getArmas_marciais_distancia().get(i) +" | " +getAM_D_dano().get(i) +" | " +getAM_D_propriedades().get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Por favor digite um numero!");
					entrada.next();
				}
				
				escolha = entrada.nextInt();
			}while(escolha <= 0 || escolha > (getArmas_marciais_CAC().size()+getArmas_marciais_distancia().size()-1));
			
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				char decisao;
				if(escolha <= getArmas_marciais_CAC().size()) {
					System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_marciais_CAC().get(escolha-1));
					
					decisao = entrada.next().charAt(0);
					if(decisao == 'Y' || decisao == 'y') {
						armas.add(getArmas_marciais_CAC().get(escolha-1));
						count--;
						decisaoLoop = true;
					}else if(decisao == 'N' || decisao == 'n') {
						decisaoLoop = true;
					}
					
				}else {
					System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_marciais_CAC().get(escolha-1));
					
					decisao = entrada.next().charAt(0);
					if(decisao == 'Y' || decisao == 'y') {
						armas.add(getArmas_marciais_distancia().get(escolha-getArmas_marciais_CAC().size()-1));
						count--;
						decisaoLoop = true;
					}else if(decisao == 'N' || decisao == 'n') {
						decisaoLoop = true;
					}
				}
			}
		}
		return armas;
	}
	
	public String setArmasMarciais() {
		iniciaAllarmas();
		Scanner entrada = new Scanner(System.in);
		int escolha;
		int count =1;
		String arma = null;
		while(count != 0) {
			do {
				System.out.println("Escolha uma das armas:");
			
				System.out.println("Nome     Dano     Propriedades");
				for(int i = 0; i < getArmas_marciais_CAC().size(); i++) {
					System.out.println((i+1) +" - " +getArmas_marciais_CAC().get(i) +" | " +getAM_CAC_dano().get(i) +" | " +getAM_CAC_propriedades().get(i));
				}
				
				for(int i = 0; i < getArmas_marciais_distancia().size(); i++) {
					System.out.printf((i+getArmas_marciais_CAC().size()+1) +" - " +getArmas_marciais_distancia().get(i) +" | " +getAM_D_dano().get(i) +" | " +getAM_D_propriedades().get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Por favor digite um numero!");
					entrada.next();
				}
				
				escolha = entrada.nextInt();
			}while(escolha <= 0 || escolha > (getArmas_marciais_CAC().size()+getArmas_marciais_distancia().size()-1));
			
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				char decisao;
				if(escolha <= getArmas_marciais_CAC().size()) {
					System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_marciais_CAC().get(escolha-1));
					
					decisao = entrada.next().charAt(0);
					if(decisao == 'Y' || decisao == 'y') {
						arma = getArmas_marciais_CAC().get(escolha-1);
						count--;
						decisaoLoop = true;
					}else if(decisao == 'N' || decisao == 'n') {
						decisaoLoop = true;
					}
					
				}else {
					System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getArmas_marciais_CAC().get(escolha-1));
					
					decisao = entrada.next().charAt(0);
					if(decisao == 'Y' || decisao == 'y') {
						arma = getArmas_marciais_distancia().get(escolha-getArmas_marciais_CAC().size()-1);
						count--;
						decisaoLoop = true;
					}else if(decisao == 'N' || decisao == 'n') {
						decisaoLoop = true;
					}
				}
			}
		}
		return arma;
	}
	
//Fim armas

//Ferramentas
	private List<String> ferramentas = Arrays.asList("Ferramentas de carpinteiro", "Ferramentas de cartógrafo", "Ferramentas de costureiro", "Ferramentas de coureiro", "Ferramentas de entalhador", "Ferramentas de ferreiro", "Ferramentas de funileiro", "Ferramentas de joalheiro", "Ferramentas de oleiro", "Ferramentas de pedreiro", "Ferramentas de pintor", "Ferramentas de sapateiro", "Ferramentas de vidreiro", "Suprimentos de alquimista", "Suprimentos de cervejeiro", "Suprimentos de caligrafia", "Utensílios de conzinheiro", "Ferramentas de navegação", "Ferramentas de ladrão", "Alaúde", "Flauta", "Flauta de pã", "Gaita de foles", "Lira", "Oboé", "Tambor", "Trombeta", "Violino", "Xilofone", "Kit de disfarce", "Kit de falsificação", "Kit de herbalismo", "Baralho de cartas", "Conjunto de dados", "Jogo dos três dragões", "Xadrez do dragão", "Kit de venenos");
	private List<String> music = Arrays.asList("Alaúde", "Flauta", "Flauta de pã", "Gaita de foles", "Lira", "Oboé", "Tambor", "Trombeta", "Violino", "Xilofone");
	private List<String> artesao = Arrays.asList("Ferramentas de carpinteiro", "Ferramentas de cartógrafo", "Ferramentas de costureiro", "Ferramentas de coureiro", "Ferramentas de entalhador", "Ferramentas de ferreiro", "Ferramentas de funileiro", "Ferramentas de joalheiro", "Ferramentas de oleiro", "Ferramentas de pedreiro", "Ferramentas de pintor", "Ferramentas de sapateiro", "Ferramentas de vidreiro", "Suprimentos de alquimista", "Suprimentos de cervejeiro", "Untesílios de conzinheiro");
	private List<Integer> custoFerramentas = Arrays.asList(8, 15, 1, 5, 1, 20, 50, 25, 10, 10, 10, 5, 30, 50, 20, 10, 1, 25, 25, 35, 2, 12, 30, 30, 2, 6, 3, 30, 25, 25, 15, 5, 5, 1, 5, 1, 50);
	private List<Double> pesoFerramentas = Arrays.asList(3.0, 3.0, 2.5, 2.5, 2.5, 4.0, 5.0, 1.0, 1.5, 4.0, 2.5, 2.5, 2.5, 4.0, 4.5, 2.5, 4.0, 1.0, 0.5, 1.0, 0.5, 1.0, 3.0, 1.0, 0.5, 1.5, 1.0, 3.0, 5.0, 1.5, 2.5, 1.5, 0.0, 0.0, 0.0, 0.25, 1.0);
	
	public List<String> getFerramentas() {
		return this.ferramentas;
	}
	
	public List<Integer> getCusto() {
		return this.custoFerramentas;
	}
	
	public List<Double> getPeso() {
		return this.pesoFerramentas;
	}
	
	public List<String> getMusic() {
		return this.music;
	}
	
	public void getInstrumentoMusical() {
		for(int i = 0; i < this.ferramentas.size(); i++) {
			for(int c = 0; c < this.music.size(); c++) {
				if(this.music.get(c).equals(this.ferramentas.get(i)) == true) System.out.println("Ferramenta - " +this.ferramentas.get(i) +"Custo - " +this.custoFerramentas.get(i) +"Peso - " +this.pesoFerramentas.get(i));
			}
		}
	}
//usage?
	public void getInstrumentoMusical(String music) {
		for(int i = 0; i < this.ferramentas.size(); i++) {
			if(music.equals(this.ferramentas.get(i)) == true) System.out.println("Ferramenta - " +this.ferramentas.get(i) +"Custo - " +this.custoFerramentas.get(i) +"Peso - " +this.pesoFerramentas.get(i));
		}
	}

	public ArrayList<String> setInstrumentoMusical(int count) {
		ArrayList<String> musics = new ArrayList<String>();
		musics.addAll(this.music);
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> escolhidos = new ArrayList<String>();
		while(count != 0) {
			int opcao;
			do {
				for(int i = 0; i< musics.size(); i++) {
					System.out.println(i +" - " +musics.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Essa opção não existe!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > musics.size());
			
			boolean decisaoLoop = false;
			char decisao;
			while(decisaoLoop == false) {
				System.out.println("Tem certeza que deseja " +musics.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				
				if('Y' == decisao || 'y' == decisao) {
					escolhidos.add(musics.get(opcao));
					musics.remove(opcao);
					count--;
					decisaoLoop = true;
				}else if('N' == decisao || 'n' == decisao) decisaoLoop = true;	
			}
		}
		
		return escolhidos;
	}
	
	public String setInstrumentoMusical() {
		Scanner entrada = new Scanner(System.in);
		boolean menuLoop = false;
		while(menuLoop == false) {
			int opcao;
			do {
				for(int i = 0; i< this.music.size(); i++) {
					System.out.println(i +" - " +this.music.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Essa opção não existe!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > this.music.size());
			
			boolean decisaoLoop = false;
			char decisao;
			while(decisaoLoop == false) {
				System.out.println("Tem certeza que deseja " +this.music.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				
				if('Y' == decisao || 'y' == decisao) {
					return this.music.get(opcao);
				}else if('N' == decisao || 'n' == decisao) decisaoLoop = true;	
			}
		}
		
		return null;
	}
	
	public ArrayList<String> setFerramentaArtesao(int count) {
		ArrayList<String> ferramentaArtesao = new ArrayList<String>();
		ferramentaArtesao.addAll(this.artesao);
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> escolhidos = new ArrayList<String>();
		while(count != 0) {
			int opcao;
			do {
				for(int i = 0; i< ferramentaArtesao.size(); i++) {
					System.out.println(i +" - " +ferramentaArtesao.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Essa opção não existe!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > ferramentaArtesao.size());
			
			boolean decisaoLoop = false;
			char decisao;
			while(decisaoLoop == false) {
				System.out.println("Tem certeza que deseja " +ferramentaArtesao.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				
				if('Y' == decisao || 'y' == decisao) {
					escolhidos.add(ferramentaArtesao.get(opcao));
					ferramentaArtesao.remove(opcao);
					count--;
					decisaoLoop = true;
				}else if('N' == decisao || 'n' == decisao) decisaoLoop = true;	
			}
		}
		
		return escolhidos;
	}
	
	public String setFerramentaArtesao() {
		Scanner entrada = new Scanner(System.in);
		boolean menuLoop = false;
		while(menuLoop == false) {
			int opcao;
			do {
				for(int i = 0; i< this.artesao.size(); i++) {
					System.out.println(i +" - " +this.artesao.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Essa opção não existe!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > this.artesao.size());
			
			boolean decisaoLoop = false;
			char decisao;
			while(decisaoLoop == false) {
				System.out.println("Tem certeza que deseja " +this.artesao.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				
				if('Y' == decisao || 'y' == decisao) {
					return this.artesao.get(opcao);
				}else if('N' == decisao || 'n' == decisao) decisaoLoop = true;	
			}
		}
		
		return null;
	}
	
//Ferramentas Fim

//Pacotes de equipamentos
	private List<String> pacotes = Arrays.asList("Pacote de Artista", "Pacote de Assaltante", "Pacote de Aventureiro", "Pacote de Diplomata", "Pacote de Estudioso", "Pacote de Explorador", "Pacote de Sacerdote");
	private List<String> pacoteArtista = Arrays.asList("Mochila", "Saco de Dormir", "Fantasia (2)", "Vela (5)", "Dias de Rações(5)", "Cantil", "Kit de Disfarce");
	private List<String> pacoteAssaltante = Arrays.asList("Mochila", "Saco com esferas de metal (1000)", "3 metros de linha", "Sino", "Velas (5)", "Pé de cabra", "Martelo", "Pítons (10)", "Laterna Coberta", "Frasco de Óleo (2)", "Dias de Rações (5)", "Caixa de Fogo", "Cantil", "Corda de Cânhamo 15 metros");
	private List<String> pacoteAventureiro = Arrays.asList("Mochila", "Pé de Cabra", "Martelo", "Pítons (10)", "Tochas (10)", "Caixa de Fogo", "Dias de Rações (10)", "Cantil", "Corda de Cânhamo 15 metros");
	private List<String> pacoteDiplomata = Arrays.asList("Baú", "Caixa para Mapas/Pegaminhos (2)", "Conjuto de Roupas Finas", "Vidro de Tinta", "Caneta Tinteiro", "Lâmpada", "Frasco de Óleo (2)", "Folha de Papel (5)", "Vidro de Perfume", "Parafina", "Sabão");
	private List<String> pacoteEstudioso = Arrays.asList("Mochila", "Livro de Estudo", "Vidro de Tinta", "Caneta Tinteiro", "Folha de Pergaminho (10)", "Saquinho de Areia", "Pequena Faca");
	private List<String> pacoteExplorador = Arrays.asList("Mochila", "Saco de Dormir", "Kit de Refeição", "Caixa de Fogo", "Tocha (10)", "Dias de Rações (10)", "Cantil", "Corda de Cânhamo 15 metros");
	private List<String> pacoteSacerdote = Arrays.asList("Mochila", "Coberto", "Vela (10)", "Caixa de Fogo", "Caixa de Esmolas", "Bloco de Incenso (2)", "Incensário", "Vestes", "Dias de Rações (2)", "Cantil");

	public ArrayList<String> setPacotes(String pac1, String pac2) {
		Scanner entrada = new Scanner(System.in);
		boolean pacoteLoop = false;
		while(pacoteLoop == false) {
			int pacoteMenu;
			System.out.println("Escolha um pacote de equipamentos:\n1 - " +pac1  +"\n2 - " +pac2);
			
			while(!entrada.hasNextInt()) {
				System.out.println("Por favor digite um numero!");
				entrada.next();
			}
			
			pacoteMenu = entrada.nextInt();
			switch(pacoteMenu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					getPacotes(pac1);
					System.out.println("Tem certeza que deseja escolher " +pac1 +"? (Y/N)");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						return confirmarPacotes(pac1);
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
				}
			break;
			
			case 2:
				char decisaocase2;
				boolean decisao2Loop = false;
					
				while(decisao2Loop == false) {	
					getPacotes(pac2);
					System.out.println("Tem certeza que deseja escolher " +pac2 +"? (Y/N)");
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						return confirmarPacotes(pac2);
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
				}
				
			break;	
			
			default:
				System.out.println("Essa opção não existe!");
			break;
			}		
		}
		
		return null;
	}
	
	public ArrayList<String> setPacotes(String pac1, String pac2, String pac3) {
		Scanner entrada = new Scanner(System.in);
		boolean pacoteLoop = false;
		while(pacoteLoop == false) {
			int pacoteMenu;
			System.out.println("Escolha um pacote de equipamentos:\n1 - " +pac1  +"\n2 - " +pac2 +"\n3 - " +pac3);
			
			while(!entrada.hasNextInt()) {
				System.out.println("Por favor digite um numero!");
				entrada.next();
			}
			
			pacoteMenu = entrada.nextInt();
			switch(pacoteMenu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					getPacotes(pac1);
					System.out.println("Tem certeza que deseja escolher " +pac1 +"? (Y/N)");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						return confirmarPacotes(pac1);
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
				}
			break;
			
			case 2:
				char decisaocase2;
				boolean decisao2Loop = false;
					
				while(decisao2Loop == false) {	
					getPacotes(pac2);
					System.out.println("Tem certeza que deseja escolher " +pac2 +"? (Y/N)");
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						return confirmarPacotes(pac2);
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
				}
				
			break;	
			
			case 3:
				char decisaocase3;
				boolean decisao3Loop = false;
					
				while(decisao3Loop == false) {	
					getPacotes(pac2);
					System.out.println("Tem certeza que deseja escolher " +pac3 +"? (Y/N)");
					
					decisaocase3 = entrada.next().charAt(0);
					if(decisaocase3 == 'Y' || decisaocase3 == 'y') {
						return confirmarPacotes(pac2);
					}else if(decisaocase3 == 'N' || decisaocase3 == 'n') {
						decisao3Loop = true;
					}
				}
				
			break;	
			
			default:
				System.out.println("Essa opção não existe!");
			break;
			}		
		}
		
		return null;
	}
	
	public ArrayList<String> confirmarPacotes(String pac){
		ArrayList<String> pacote = new ArrayList<String>();
		switch(pac) {
		case "Pacote de Artista":
			pacote.addAll(this.pacoteArtista);
		break;
		
		case "Pacote de Assaltante":
			pacote.addAll(this.pacoteAssaltante);
		break;
		
		case "Pacote de Aventureiro":
			pacote.addAll(this.pacoteAventureiro);
		break;
		
		case "Pacote de Diplomata":
			pacote.addAll(this.pacoteDiplomata);
		break;
		
		case "Pacote de Estudioso":
			pacote.addAll(this.pacoteEstudioso);
		break;
		
		case "Pacote de Explorador":
			pacote.addAll(this.pacoteExplorador);
		break;
		
		case "Pacote de Sacerdote":
			pacote.addAll(this.pacoteSacerdote);
		break;
		
		default:
//			pacote.add(null);
		break;
		}
		
		return pacote;
	}
	
	public void getPacotes(String pac){
		switch(pac) {
		case "Pacote de Artista":
			printPacote(this.pacoteArtista);
		break;
		
		case "Pacote de Assaltante":
			printPacote(this.pacoteAssaltante);
		break;
		
		case "Pacote de Aventureiro":
			printPacote(this.pacoteAventureiro);
		break;
		
		case "Pacote de Diplomata":
			printPacote(this.pacoteDiplomata);
		break;
		
		case "Pacote de Estudioso":
			printPacote(this.pacoteEstudioso);
		break;
		
		case "Pacote de Explorador":
			printPacote(this.pacoteExplorador);
		break;
		
		case "Pacote de Sacerdote":
			printPacote(this.pacoteSacerdote);
		break;
		
		default:
//			pacote.add(null);
		break;
		}
	}
	
	public void printPacote(List<String> pacote) {
		for(int i = 0; i < pacote.size(); i++) {
			System.out.printf(pacote.get(i) +", ");
		}
	}
//Pacotes de Equipamento Fim

//Equipamentos
	private List<String> equipamentos = Arrays.asList("Ábaço", "Ácido (vidro)", "Água benta (frasco)", "Algemas", "Algibeira", "Aljava", "Ampulheta", "Antídito (vidro)", "Apito de advertência", "Aríete portátil", "Armadilha de caça", "Arpéu", "Balança de mercador", "Balde", "Barril", "Baú", "Bolsa de componentes", "Caixa de Fogo", "Caneca", "Caneta tinteiro", "Cantil", "Cesto", "Cobertor de inverno", "Corda de cânhamo (15 metros)", "Corda de seda (15 metros)", "Corrente (3 metros)", "Equipamento de pescaria", "Escada (3 metros)", "Esferas (Sacola com 1000)", "Espelho de aço", "Estrepes (bolsa com 20)", "Fechadura", "Bastão", "Cajado", "Cristal", "Orbe", "Varinha", "Cajado de madeira", "Ramo de visco", "Totem", "Varinha de teixo", "Fogo alquímico (frasco)", "Frasco", "Garrafa de vidro", "Giz (1 peça)", "Grimório", "Jarra", "Kit de escalada", "Kit de primeiros-socorros", "Lâmpada", "Lanterna coberta", "Lanterna furta-fogo", "Lente de aumento", "Livro", "Luneta", "Manto", "Marreta", "Martelo", "Mochila", "Balas de Funda (20)", "Flechas (20)", "Virotes (20)", "Zarabatana (50)", "Óleo (frasco)", "Pá", "Panela de ferro", "Papel (uma folha)", "Parafina", "Pé de cabra", "Pedra de amolar", "Perfume (frasco)", "Pergaminho (uma folha)", "Picareta de minerador", "Píton", "Poção de cura", "Porta mapas ou pergaminhos", "Porta virotes", "Pregos de ferro (10)", "Rações de viagem (1 dia)", "Robes", "Roldana e polia", "Roupas comuns", "Roupas de viajante", "Roupas de entretenimento", "Roupas finas", "Sabão", "Saco", "Saco de dormir", "Amuleto", "Emblema", "Relicário", "Sinete", "Sino", "Tenda para duas pessoas", "Tocha", "Tinta (frasco de 30ml)", "Vara (3 metros)", "Vela", "Veneno básico (frasco)");
	private List<Double> custoEquipamentos = Arrays.asList(2.0, 25.0, 25.0, 2.0, 5.0, 1.0, 25.0, 50.0, 25.0, 4.0, 5.0, 2.0, 5.0, 5.0, 2.0, 5.0, 25.0, 5.0, 2.0, 2.0, 2.0, 4.0, 5.0, 1.0, 10.0, 5.0, 1.0, 1.0, 1.0, 5.0, 1.0, 10.0, 10.0, 5.0, 10.0, 20.0, 10.0, 5.0, 1.0, 1.0, 10.0, 50.0, 2.0, 1.0, 1.0, 50.0, 4.0, 25.0, 5.0, 5.0, 10.0, 100.0, 25.0, 1000.00, 1.0, 2.0, 1.0, 2.0, 4.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 5.0, 2.0, 1.0, 5.0, 1.0, 2.0, 5.0, 50.0, 1.0, 1.0, 1.0, 5.0, 1.0, 1.0, 5.0, 2.0, 5.0, 15.0, 2.0, 1.0, 1.0, 5.0, 5.0, 5.0, 5.0, 1.0, 2.0, 1.0, 10.0, 5.0, 1.0, 100.0);
	private List<Double> pesoEquipamentos = Arrays.asList(1.0, 0.5, 0.5, 2.0, 0.5, 0.5, 0.5, 0.0, 0.5, 17.5, 12.5, 2.0, 1.5, 1.0, 35.0, 12.5, 1.0, 0.5, 0.5, 0.0, 2.5, 1.0, 1.5, 5.0, 2.0, 12.5, 1.0, 0.25, 0.1, 0.5, 1.0, 2.0, 0.5, 1.5, 0.5, 2.0, 0.0, 0.0, 0.5, 0.5, 1.0, 1.0, 0.0, 1.5, 2.0, 6.0, 1.5, 0.5, 1.0, 1.0, 0.0, 2.5, 0.5, 2.0, 5.0, 1.5, 2.5, 0.75, 0.5, 0.75, 0.5, 0.5, 2.5, 5.0, 0.0, 0.0, 2.5, 0.0, 0.0, 0.0, 5.0, 0.0, 0.25, 0.5, 0.5, 2.5, 1.0, 2.0, 2.5, 1.5, 2.0, 2.0, 3.0, 0.0, 0.25, 3.5, 0.0, 0.5, 0.0, 1.0, 0.0, 0.0, 10.0, 0.5, 0.0, 3.5, 0.0, 0.0);
	
	public void getEquipamentos(String equipamento) {
		for(int i = 0; i < this.equipamentos.size(); i++) {
			if(Objects.equals(equipamento, this.equipamentos.get(i))) {
				System.out.println("Equipamento - " +this.equipamentos.get(i) +"Custo - " +this.custoEquipamentos.get(i) +"Peso - " +pesoEquipamentos.get(i));
			}
		}
	}
//usage?	
	public void getEquipamentos(ArrayList<String> equipamento) {
		for(int i = 0; i < equipamento.size(); i++) {
			for(int c = 0; c < this.equipamentos.size(); c++) {
				if(Objects.equals(equipamento.get(i), this.equipamentos.get(c))) {
					System.out.println("Equipamento - " +this.equipamentos.get(c) +"Custo - " +this.custoEquipamentos.get(c) +"Peso - " +pesoEquipamentos.get(c));
				}
			}
		}
	}
//Equipamentos Fim
	
//Armaduras
	private List<String> ArmadurasLeves = Arrays.asList("Acolchoada", "Couro", "Couro Batido");
	private List<Integer> ArmadurasLevesPreco = Arrays.asList(5, 10, 45);
	private List<Integer> ArmadurasLevesCA = Arrays.asList(11, 11, 12);
	private List<String> ArmadurasLevesForca = Arrays.asList("-", "-", "-");
	private List<String> ArmadurasLevesFurtividade = Arrays.asList("Desvantagem", "-", "-");
	private List<Double> ArmadurasLevesPeso = Arrays.asList(4.0, 5.0, 6.5);
	
	private List<String> ArmadurasMedias = Arrays.asList("Gibão de Peles", "Camisão de Malha", "Brunea", "Peitoral", "Meia-Armadura");
	private List<Integer> ArmadurasMediasPreco = Arrays.asList(10, 50, 50, 400, 750);
	private List<Integer> ArmadurasMediasCA = Arrays.asList(12, 13, 14, 14, 15);
	private List<String> ArmadurasMediasForca = Arrays.asList("-", "-", "-", "-", "-");
	private List<String> ArmadurasMediasFurtividade = Arrays.asList("-", "-", "Desvantagem", "-", "Desvantagem");
	private List<Double> ArmadurasMediasPeso = Arrays.asList(6.0, 10.0, 22.5, 10.0, 20.0);
	
	private List<String> ArmadurasPesadas = Arrays.asList("Cota de Anéis", "Cota de Malha", "Cota de Talas", "Placas");
	private List<Integer> ArmadurasPesadasPreco = Arrays.asList(30, 75, 200, 1500);
	private List<Integer> ArmadurasPesadasCA = Arrays.asList(14, 16, 17, 18);
	private List<String> ArmadurasPesadasForca = Arrays.asList("-", "13", "15", "15");
	private List<String> ArmadurasPesadasFurtividade = Arrays.asList("Desvantagem", "Desvantagem", "Desvantagem", "Desvantagem");
	private List<Double> ArmadurasPesadasPeso = Arrays.asList(20.0, 27.5, 30.0, 32.5);
	
	private List<String> Escudos = Arrays.asList("Escudo");
	private List<Integer> EscudosPreco = Arrays.asList(10);
	private List<Integer> EscudosCA = Arrays.asList(2);
	private List<String> EscudosForca = Arrays.asList("-");
	private List<String> EscudosFurtividade = Arrays.asList("-");
	private List<Double> EscudosPeso = Arrays.asList(3.0);
	
	public List<String> getArmadura(String armaduras) {
		switch(armaduras) {
		case "Armaduras Leves":
			return this.ArmadurasLeves;
		
		case "Armaduras Medias":
			return this.ArmadurasMedias;
		
		case "Armaduras Pesadas":
			return this.ArmadurasPesadas;
		
		default:
		break;
		}
		
		return null;
	}
	
	public String getEscudo() {
		return this.Escudos.get(0);
	}
	
	public String setEquipsCharlatao() {
		Scanner entrada = new Scanner(System.in);
		List<String> lists = Arrays.asList("(10) Garrafas tampadas preenchidas com líquidos coloridos", "Conjunto de dados viciados", "Baralho de cartas marcadas", "Anel de sinete de um duque imaginário");
		boolean menuLoop = false;
		int opcao = 0;
		while(menuLoop == false) {
			do {
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > lists.size());
			
			boolean decisaoLoop = false;
			char decisao;
			while(decisaoLoop == false) {
				System.out.println("Tem certeza que deseja " +lists.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				if(decisao == 'Y' || decisao == 'y') {
					decisaoLoop = true;
					menuLoop = true;
					return lists.get(opcao);
				}else if(decisao == 'N' || decisao == 'n'){
					decisaoLoop = true;
				}
			}
		}
		
		return null;
	}
}
