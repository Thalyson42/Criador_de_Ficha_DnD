package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AtribuirHabilidades extends Classes{
	private ArrayList<Integer> dadosAtributos = new ArrayList<Integer>();
	private SecureRandom random = new SecureRandom();
	private Scanner entrada = new Scanner(System.in);
//	private FichaDoPersonagem ficha;
	
	public void setSorte() {
		Integer[] D4d6 = new Integer[4];
		
		for(int i = 0; i < 6; i++) {
			int soma = 0;

			for(int c = 0; c < 4; c++) {
				D4d6[c] = random.nextInt((6 - 1) + 1) + 1;	
			}
	
			Arrays.sort(D4d6, Collections.reverseOrder());
			for(int c = 0; c < 3; c++) {
				soma += D4d6[c];
			}
			this.dadosAtributos.add(soma);
		}
		Collections.sort(dadosAtributos, Collections.reverseOrder());
	}

	public ArrayList<Integer> getDadosAtributos() {
		return dadosAtributos;
	}
	
	public void setPadrao() {
		this.dadosAtributos.add(15);
		this.dadosAtributos.add(14);
		this.dadosAtributos.add(13);
		this.dadosAtributos.add(12);
		this.dadosAtributos.add(10);
		this.dadosAtributos.add(8);
		}
	
	public void setAtributo() {
		int pos = 0;
		boolean atributoLoop = false;
		boolean forcacheck = false;
		boolean destrezacheck = false;
		boolean constituicaocheck = false;
		boolean inteligenciacheck = false;
		boolean sabedoriacheck = false;
		boolean carismacheck = false;
		ArrayList<String> AtrNomelist = new ArrayList<String>();
		AtrNomelist.add("Força");
		AtrNomelist.add("Destreza");
		AtrNomelist.add("Constituição");
		AtrNomelist.add("Inteligencia");
		AtrNomelist.add("Sabedoria");
		AtrNomelist.add("Carisma");
		
		while(atributoLoop == false) {
			
			 do{
				System.out.printf("Qual dos valores você deseja atribuir a %s?\n", AtrNomelist.get(0));
				for(int i = 0; i < dadosAtributos.size(); i++) {
					System.out.printf("%d - ", i);
					System.out.println(dadosAtributos.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Por favor digite um numero!");
					entrada.next();
				}
				
				pos = entrada.nextInt();	
			}while(pos < 0 || pos > dadosAtributos.size()-1);
			
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				char decisao;
			
				System.out.printf("Tem certeza que quer atribuir %d a %s? (Y/N)\n", dadosAtributos.get(pos), AtrNomelist.get(0));
				decisao = entrada.next().charAt(0);
				
				if(decisao == 'Y' || decisao == 'y') {
					decisaoLoop = true;
					AtrNomelist.remove(0);
					//atributos.setForca(dadosAtributos.get(pos));
					//atributos.setForca_mod(dadosAtributos.get(pos));
					//dadosAtributos.remove(pos);
					
					if(forcacheck == false) {
						int soma = getFicha().getForca();
						soma += dadosAtributos.get(pos);
						getFicha().setForca(soma);
						getFicha().setForca_mod();
						dadosAtributos.remove(pos);
						forcacheck = true;
						
					}else if(destrezacheck == false) {
						int soma = getFicha().getDestreza();
						soma += dadosAtributos.get(pos);
						getFicha().setDestreza(soma);
						getFicha().setDestreza_mod();
						dadosAtributos.remove(pos);
						destrezacheck = true;
						
					}else if(constituicaocheck == false) {
						int soma = getFicha().getConstituicao();
						soma += dadosAtributos.get(pos);
						getFicha().setConstituicao(soma);
						getFicha().setConstituicao_mod();
						dadosAtributos.remove(pos);
						constituicaocheck = true;
						
					}else if(inteligenciacheck == false) {
						int soma = getFicha().getInteligencia();
						soma += dadosAtributos.get(pos);
						getFicha().setInteligencia(soma);
						getFicha().setInteligencia_mod();
						dadosAtributos.remove(pos);
						inteligenciacheck = true;
						
					}else if(sabedoriacheck == false) {
						int soma = getFicha().getSabedoria();
						soma += dadosAtributos.get(pos);
						getFicha().setSabedoria(soma);
						getFicha().setSabedoria_mod();
						dadosAtributos.remove(pos);
						sabedoriacheck = true;
						
					}else if(carismacheck == false) {
						int soma = getFicha().getCarisma();
						soma += dadosAtributos.get(pos);
						getFicha().setCarisma(soma);
						getFicha().setCarisma_mod();
						dadosAtributos.remove(pos);
						carismacheck = true;
						atributoLoop = true;
					}
					
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}		
				
			}
		}
		getFicha().setPontos_vida();
		getFicha().setClasseDeArmadura();
		
	}

//	public void setFicha(FichaDoPersonagem atributos) {
//		this.ficha = atributos;
//	}

//	public FichaDoPersonagem getFicha() {
//		return ficha;
//	}
	
	
}
