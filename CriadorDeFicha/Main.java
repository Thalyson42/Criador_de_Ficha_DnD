package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Scanner;

import Janelas.Tela;

import java.io.IOException;

import br.com.uninassau.jdbc.modelo.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		FichaDoPersonagem ficha = null;
		Racas racas = new Racas();
		Barbaro barbaro = new Barbaro();
		AtribuirHabilidades atributos = new AtribuirHabilidades();
		Antecedentes antecedentes = new Antecedentes();
		Equipamentos equips = new Equipamentos();
		Idiomas idiomas = new Idiomas();
		MostrarFicha mostrar_ficha = new MostrarFicha();
		Classes classes = new Classes();
		Proficiencia proficiencia = new Proficiencia();
		Magias magias = new Magias();
		
		Tela telaLogin = new Tela(usuario);
		telaLogin.setVisible(true);
		
//Inicio
		System.out.println("--Criador de ficha D&D 5ª Edição--");
		System.out.printf("Digite seu nome de usuario: ");
		usuario.setLogin(entrada.next());
		System.out.println(usuario.getLogin() + " Bem vindo ao criador de fichas D&D 5ª Edição\nEscolha uma das opções:");
		
		boolean fechar = false;
		while(fechar == false) {
			int menu =0;
			
			System.out.println("1 - Criar ficha do personagem.");
			System.out.println("2 - Visualizar ficha.");
			System.out.println("3 - Sair.");
			menu = entrada.nextInt();
			switch(menu) {
			case 1:
				ficha = new FichaDoPersonagem();
				classes.salvarFicha(ficha);
				classes.setProficiencia(proficiencia);
				classes.setEquips(equips);
				classes.setMagias(magias);
//Escolhendo raça
				
				boolean LoopMraca = true;
				while(LoopMraca) {
					int menu_raca =0;
					System.out.println("Escolha sua raça:");
					System.out.println("1 - Anão\n"
							+ "2 - Elfo\n"
							+ "3 - Halfling\n"
							+ "4 - Humano\n"
							+ "5 - Draconato\n"
							+ "6 - Gnomo\n"
							+ "7 - Meio-Elfo\n"
							+ "8 - Meio-Orc\n"
							+ "9 - Tiefling\n");
				
					menu_raca = entrada.nextInt();
					switch(menu_raca) {
					case 1:
						boolean MenuAnao = true;
						while(MenuAnao) {
							int anaoOpcao =0;
							System.out.println("1 - Ver informações completa da raça.\n"
									+ "2 - Adicionar raça a ficha.\n"
									+ "3 - Voltar.\n");
							anaoOpcao = entrada.nextInt();
							switch(anaoOpcao) {
							case 1:
								racas.anaoDescricao();
								racas.anaoTracos_raciais();
								racas.anaoSRcolina();
								racas.anaoSRmontanha();
								System.in.read();
							break;
							
							case 2:
								racas.setRacaAnao();
								boolean subracaLoop = true;
								while(subracaLoop) {
									int subracaMenu = 0;
									
									System.out.println("--Sub-raça--");
									System.out.println("Escolha uma sub-raça\n"
											+ "1 - Anão da Colina\n"
											+ "2 - Anão da Montanha\n");
									subracaMenu = entrada.nextInt();
									switch(subracaMenu) {
									case 1:
										racas.anaoSRcolina();
										boolean SRcolinaLoop = true;
										while(SRcolinaLoop) {
											char decisao;
											System.out.println("Adicionar sub-raca a ficha? (Y/N)");
											decisao = entrada.next().charAt(0);
											
											if(decisao == 'Y' || decisao == 'y') {
												SRcolinaLoop = false;
												subracaLoop = false;
												racas.setanaoSRcolina();

											}else if(decisao == 'N' || decisao == 'n') {
												SRcolinaLoop = false;
											}
											
										}
									break;
									
									case 2:
										racas.anaoSRmontanha();
										boolean SRmontanhaLoop = true;
										while(SRmontanhaLoop) {
											char decisao;
											System.out.println("Adicionar sub-raca a ficha? (Y/N)");
											decisao = entrada.next().charAt(0);
											
											if(decisao == 'Y' || decisao == 'y') {
												SRmontanhaLoop = false;
												subracaLoop = false;
												racas.setanaoSRmontanha();
												
											}else if(decisao == 'N' || decisao == 'n') {
												SRmontanhaLoop = false;
											}
											
										}
									break;
									
									default:
										System.out.println("Opção invalida!\n");
									break;
									}
								}

								MenuAnao = false;
								LoopMraca = false;
							break;
							
							case 3:
								MenuAnao = false;
							break; 
							}
						}
					break;
					
					case 2:
					break;
					}
				}
//Fim escolhendo raça
				
//Escolhendo classe
				
				boolean LoopMclasse = true;
				while(LoopMclasse) {
					int  menu_classe = 0;
					System.out.println("Escolha sua classe:");
					System.out.println("1 - Bárbaro\n"
							+ "2 - Bardo\n"
							+ "3 - Bruxo\n"
							+ "4 - Clérigo\n"
							+ "5 - Druida\n"
							+ "6 - Feiticeiro\n"
							+ "7 - Guerreiro\n"
							+ "8 - Ladino\n"
							+ "9 - Mago\n"
							+ "10 - Monge\n"
							+ "11 - Paladino\n"
							+ "12 - Patrulheiro\n\n");
					
					menu_classe = entrada.nextInt();
					switch(menu_classe) {
					
					case 1:
						boolean MenuBarbaro = true;
						while(MenuBarbaro) {
							int barbaroOpcao = 0;
							System.out.println("--BÁRBARO--\n");
							System.out.println("1 - Descrição.\n"
									+ "2 - Tabela.\n"
									+ "3 - Caracteristicas.\n"
									+ "4 - Feats.\n"
									+ "5 - Adicionar classe a ficha.\n"
									+ "6 - Voltar.\n");
							barbaroOpcao = entrada.nextInt();
							switch(barbaroOpcao) {
							case 1:
								barbaro.barbaroDescricao();
								System.in.read();
							break;
							
							case 2:
								barbaro.barbaroTabela();
								System.in.read();
							break;
							
							case 3:
								barbaro.barbaroCaracteristicasClasse();
								System.in.read();
							break;
							
							case 4:
								barbaro.barFuria();
								barbaro.barDefesaSemArmadura();
								barbaro.barFeatsNivel2();
								barbaro.barFeatsNivel3();
								barbaro.barFeatsNivel5();
								barbaro.barFeatsNivel7();
								barbaro.barFeatsNivel9();
								barbaro.barFeatsNivel11();
								barbaro.barFeatsNivel15();
								barbaro.barFeatsNivel18();
								barbaro.barFeatsNivel20();
								System.in.read();
							break;
							
							case 5:
								barbaro.setEquips(equips);
								barbaro.setBarbaro();
								MenuBarbaro = false;
								LoopMclasse = false;
							break;
							
							case 6:
								MenuBarbaro = false;
							break;
							}
						}
					break;
					}
				}
//Fim escolhendo classe
				
				
//Distribuição de habilidades
				
				boolean LoopMAtributo = true;
				while(LoopMAtributo == true) {
					int menuAtr = 0;
					System.out.println("--Distribuição de Habilidades--");
					System.out.println("Na distribuição de habilidades você pode tentar a sorte\n"
							+ "ou colocar os valores padrões do livro, qual sua escolha? PS: Você só pode tentar a sorte uma unica vez.\n"
							+ "1 - Sorte\n"
							+ "2 - Padrão\n");
					menuAtr = entrada.nextInt();
					switch(menuAtr) {
					
					case 1:
						atributos.setSorte();
						ArrayList<Integer> atr = new ArrayList<Integer>();
						atr = atributos.getDadosAtributos();
						
												
							for(int i = 0; i < atr.size(); i++) {
								System.out.printf("Atributos: ");
								System.out.println(atr.get(i));
							}
							System.out.println("Use os valores acima para destribuir entre Força, Destreza, Constituição\n"
									+ "Inteligência, Sabedoria e Carisma.\n\n");
								
						atributos.setAtributo();
						LoopMAtributo = false;
					break;
					
					case 2:
						atributos.setPadrao();
						atributos.setAtributo();
						LoopMAtributo = false;
					break;
					}
				}

//Fim Distribuição de habilidades
				
//Escolher Antecedente
				boolean antecedenteLoop = true;
				while(antecedenteLoop) {
					int antecedenteM;
					System.out.println("--Antecedente--");
					System.out.println("Escolha um dos seguintes antecedentes:\n"
							+ "1 - Acólito");
					
					antecedenteM = entrada.nextInt();
					switch(antecedenteM) {
					case 1:
						boolean case1Loop = true;
						while(case1Loop) {
							int case1M;
							System.out.println("--Acólito--");
							System.out.println("1 - Descrição.\n"
									+ "2 - Adicionar a ficha.\n"
									+ "3 - Voltar.");
							
							case1M = entrada.nextInt();
							switch(case1M) {
							case 1:
								antecedentes.getacolitoDescricao();
								System.in.read();
							break;
							
							case 2:
								antecedentes.setIdiomas(idiomas);
								antecedentes.setAcolito();
								ficha = classes.getFicha();
								case1Loop = false;
								antecedenteLoop = false;
							break;
							
							case 3:
							case1Loop = false;
							break;
							
							default:
							break;
							}
						}
					break;
					}
				}
//Fim Escolher antecedente			
//Magias
//Magias fim
//Talentos
//Talentos fim
				
//Bio
				int bio1Confirmed = 0;
				int bio2Confirmed = 0;
				int bio3Confirmed = 0;
				int bio4Confirmed = 0;
				int bio5Confirmed = 0;
				int bio6Confirmed = 0;
				int bioMenu = 1;
				boolean bioMenuLoop = true;
				while(bioMenuLoop) {
					System.out.println("--Biografia--\n");
					switch(bioMenu) {
					case 1:
						System.out.println("Digite o nome do seu personagem.");
						String nomePersonagem = entrada.next();
						ficha.setNome_personagem(nomePersonagem);
						if(bio1Confirmed == 1) {
							bioMenu = 8;
						}else {
							bio1Confirmed = 1;
							bioMenu = 2;
							
						}
					break;
					case 2:
						System.out.println("Digite a idade do seu personagem.");
						String idade;
						idade = entrada.next();
						ficha.setIdade(idade);
						if(bio2Confirmed == 1) {
							bioMenu = 8;
						}else {
							bio2Confirmed = 1;
							bioMenu = 3;
							
						}
					break;
					case 3:
						System.out.println("Digite a altura do seu personagem.");
						String altura;
						altura = entrada.next();
						ficha.setAltura(altura);
						if(bio3Confirmed == 1) {
							bioMenu = 8;
						}else {
							bio3Confirmed = 1;
							bioMenu = 4;
							
						}
					break;
					case 4:
						System.out.println("Digite o peso do seu personagem.");
						String peso;
						peso = entrada.next();
						ficha.setPeso(peso);
						if(bio4Confirmed == 1) {
							bioMenu = 8;
						}else {
							bio4Confirmed = 1;
							bioMenu = 5;
							
						}
					break;
					case 5:
						System.out.println("Digite a cor dos olhos do seu personagem.");
						String olhos;
						olhos = entrada.next();
						ficha.setOlhos(olhos);
						if(bio5Confirmed == 1) {
							bioMenu = 8;
						}else {
							bio5Confirmed = 1;
							bioMenu = 6;
							
						}
					break;
					case 6:
						System.out.println("Digite a cor do cabelo do seu personagem.");
						String cabelo;
						cabelo = entrada.next();
						ficha.setCabelo(cabelo);
						if(bio6Confirmed == 1) {
							bioMenu = 8;
						}else {
							bio6Confirmed = 1;
							bioMenu = 7;
							
						}
					break;
					case 7:
						System.out.println("Digite a cor da pele do seu personagem.");
						String pele;
						pele = entrada.next();
						ficha.setPele(pele);
						bioMenu = 8;
					break;
					case 8:
						do{
							System.out.println("--Biografia--");
							System.out.println("Nome do personagem: " +ficha.getNome_personagem());
							System.out.println("Idade: " +ficha.getIdade());
							System.out.println("Altura: " +ficha.getAltura());
							System.out.println("Peso: " +ficha.getPeso());
							System.out.println("Olhos: " +ficha.getOlhos());
							System.out.println("Cabelo: " +ficha.getCabelo());
							System.out.println("Pele: " +ficha.getPele());
							System.out.println("\nSelecione uma das opções caso deseje alterar sua biografia ou finalize a criação do seu personagem.");
							System.out.println("\n1 - Nome\n2 - Idade\n3 - Altura\n4 - Peso\n5 - Olhos\n6 - Cabelo\n7 - Pele\n0 - Finalizar.");
							
							while(!entrada.hasNextInt()) {
								System.out.println("Digite uma opção disponibilizada");
								entrada.next();
							}
							
							bioMenu = entrada.nextInt();
						}while(bioMenu < 0 || bioMenu > 7);
					break;
					case 0:
						System.out.println("Ficha criada com sucesso!");
						System.out.println("Pressione alguma tecla para continuar...");
						System.in.read();
						bioMenuLoop = false;
					break;
					}
					
				}
//Bio fim
			break;
//case 1 fim
			case 2:
				try {
					mostrar_ficha.setFicha(ficha);
					mostrar_ficha.mostrarFicha();
					System.in.read();
				}catch(NullPointerException e) {
					System.err.println("------------------------------");
					System.err.println("Você não tem uma ficha criada!");
					System.err.println("------------------------------");
				}
			break;
			
			case 3:
				System.out.println("Obrigado por utilizar o criador de ficha D&D 5ª");
				System.out.println("Precione alguma tecla para finalizar...");
				System.in.read();
				fechar = true;
			break;
			}
		}
	}
	
}
