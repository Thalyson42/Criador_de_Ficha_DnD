package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Guerreiro extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Guerreiro";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
//	public void setFicha(FichaDoPersonagem ficha) {
//		this.ficha = ficha;
//	}
//	
//	public FichaDoPersonagem getFicha() {
//		return this.ficha;
//	}
	
	public void setGuerreiro() {
		getFicha().setClasse("Guerreiro");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Acolchoada", "Couro", "Couro Batido", "Gibão de Peles", "Camisão de Malha", "Brunea", "Peitoral", "Meia-Armadura", "Cota de Anéis", "Cota de Malha", "Cota de Talas", "Placas", "Escudos");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Força", "Constituição");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Acrobocia", "Adrestrar Animais", "Atletismo", "História", "Intuição", "Intimidação", "Percepção", "Sobrevivência");
		getProficiencia().setPericias(profPericias, 2);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
		equips4();
		setEstiloDeLuta();
	}
	
	public int pontosVidaLV1(int modConstituicao) {
		return 10+modConstituicao;
	}
	
	public int pontosVidaNiveisSeguintesRoll(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		for(int c = 0; c < niveis; c++) {
			soma += modConstituicao+(random.nextInt((10 - 1) + 1) + 1);	
		}
		return soma;
	}
	
	public int pontosVidaNiveisSeguintes(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		
		for(int i = 0; i < niveis; i++) {
			soma += modConstituicao+6;
		}
		
		return soma;
	}
	
	public int setCDMagias(int proficiencia, int ModCarisma) {
		return 8+proficiencia+ModCarisma;
	}
	
	public int setModificadorAtaqueMagia(int proficiencia, int ModCarisma) {
		return proficiencia+ModCarisma;
	}
	
	public void equips1() {
		Scanner entrada = new Scanner(System.in);
		boolean equip1Loop = false;
		while(equip1Loop == false) {
			int equip1Menu;
			System.out.println("Escolha entre (1) uma Cota de malha ou (2) Gibão de peles, arco longo e 20 flechas.");
			
			equip1Menu = entrada.nextInt();
			switch(equip1Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("Tem certeza que deseja escolher uma Cota de malha? (Y/N)");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						getFicha().setEquipamentos("Cota de malha");
						decisaoLoop = true;
						equip1Loop = true;
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
					
				}
				
			break;
			
			case 2:
				char decisaocase2;
				boolean decisao2Loop = false;
				while(decisao2Loop == false) {
					System.out.println("Tem certeza que deseja escolher um Gibão de peles, um arco longo e 20 flechas? (Y/N)");
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						for(int i = 0; i < getEquips().getArmas_marciais_distancia().size(); i++) {
							if(Objects.equals(new String("Arco Longo"), getEquips().getArmas_marciais_distancia().get(i))) {
								getFicha().setEquipamentos(getEquips().getArmas_marciais_distancia().get(i));
							}
						}
						getFicha().setEquipamentos("Arco Longo");
						getFicha().setEquipamentos("20 Flechas");
						getFicha().setEquipamentos("Gibão de peles");
						decisao2Loop = true;
						equip1Loop = true;
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
				}
		   break;
			}
		}
	}
	
	public void equips2() {
		Scanner entrada = new Scanner(System.in);
		boolean equip2Loop = false;
		while(equip2Loop == false) {
			int equip2Menu;
			
			System.out.println("Escolha uma das opções:\n(1) Uma arma marcial e um escudo ou (2) Duas armas marciais.");
			
			while(!entrada.hasNextInt()) {
				System.out.println("Digite um numero!");
				entrada.next();
			}
			
			equip2Menu = entrada.nextInt();
			switch(equip2Menu) {
			case 1:
				char decisao;
				System.out.println("Tem certeza que deseja uma arma marcial e um escudo? (Y/N)");
				
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					decisao = entrada.next().charAt(0);
					if(decisao == 'Y' || decisao == 'y') {
						equip2Loop = true;
						decisaoLoop = true;
						getFicha().setEquipamentos(getEquips().setArmasMarciais(1));
						getFicha().setEquipamentos("Escudo");
					}else if(decisao == 'N' || decisao == 'n') {
						decisaoLoop = true;
					}
					
				}
			break;
			
			case 2:
				char decisao2;
				System.out.println("Tem certeza que deseja duas arma marciais? (Y/N)");
				
				boolean decisao2Loop = false;
				while(decisao2Loop == false) {
					decisao2 = entrada.next().charAt(0);
					if(decisao2 == 'Y' || decisao2 == 'y') {
						equip2Loop = true;
						decisao2Loop = true;
						getFicha().setEquipamentos(getEquips().setArmasMarciais(2));
					}else if(decisao2 == 'N' || decisao2 == 'n') {
						decisao2Loop = true;
					}
					
				}
			break;
			
			default:
				System.out.println("Digite uma opção valida!");
			break;
			}
			
		}
	}
	
	public void equips3() {
		Scanner entrada = new Scanner(System.in);
		boolean equip1Loop = false;
		while(equip1Loop == false) {
			int equip1Menu;
			System.out.println("Escolha entre (1) uma Besta leve e 20 virotes ou (2) dois machados de arremessos.");
			
			equip1Menu = entrada.nextInt();
			switch(equip1Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("Tem certeza que deseja escolher uma besta leve e 20 virotes? (Y/N)");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						for(int i = 0; i < getEquips().getArmas_simples_distancia().size(); i++) {
							if(Objects.equals(new String("Besta leve"), getEquips().getArmas_simples_distancia().get(i))) {
								getFicha().setEquipamentos(getEquips().getArmas_simples_distancia().get(i));
							}
						}
						getFicha().setEquipamentos("Virotes (20)");
						decisaoLoop = true;
						equip1Loop = true;
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
					
				}
				
			break;
			
			case 2:
				char decisaocase2;
				boolean decisao2Loop = false;
				while(decisao2Loop == false) {
					System.out.println("Tem certeza que deseja escolher dois machados de arremesso? (Y/N)");
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						getFicha().setEquipamentos("Machado de arremesso (2)");
						decisao2Loop = true;
						equip1Loop = true;
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
				}
		   break;
			}
		}
	}
	
	public void equips4() {
		getFicha().setEquipamentos(getEquips().setPacotes("Pacote de Aventureiro", "Pacote de Explorador"));
	}
	
//Estilos	
		public void setEstiloDeLuta() {
		List<String> estilo = Arrays.asList("Arquearia", "Combate com Armas Grandes", "Combate com Duas Armas", "Defesa", "Duelismo", "Proteção");
		Scanner entrada = new Scanner(System.in);
		boolean menuLoop = false;
		int menu = 0;
		while(menuLoop == false) {
			do {
				System.out.println("Escolha um dos estilos:");
				for(int i = 0; i < estilo.size(); i++) {
					System.out.println(i +" - " +estilo.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				menu = entrada.nextInt();
			}while(menu < 0 || menu > estilo.size()-1);
			menuLoop = confirmarEstilo(estilo.get(menu));
		}
			switch(menu) {
			case 1:
				setArquearia();
			break;
			
			case 2:
				setCombateComArmasGrandes();
			break;
			
			case 3:
				setCombateComDuasArmas();
			break;
			
			case 4:
				setDefesa();
			break;
			
			case 5:
				setDuelismo();
			break;
			
			case 6:
				setProtecao();
			break;
			
			default:
			break;
			}
	}
	
	public boolean confirmarEstilo(String estilo) {
		Scanner entrada = new Scanner(System.in);
		
		char decisao;
		do {
			getEstilo(estilo);
			System.out.println("\nTem certeza que deseja " +estilo +"? (Y/N)");
			
			decisao = entrada.next().charAt(0);
		}while((Objects.equals(decisao, 'Y') || Objects.equals(decisao, 'y')  || Objects.equals(decisao, 'N') || Objects.equals(decisao, 'n')) == false);
		
		if(decisao == 'Y' || decisao == 'y') {
			return true;
		}
		return false;
	}
	
	public void getEstilo(String estilo) {
		switch(estilo) {
		case "Arquearia":
			System.out.println("--ARQUEARIA--\r\n"
					+ "Você ganha +2 de bônus nas jogadas de ataque realizadas\r\n"
					+ "com uma arma de ataque à distância.\n");;
		break;
		
		case "Combate com Armas Grander":
			System.out.println("--COMBATE COM ARMAS GRANDES--\r\n"
					+ "Quando você rolar um 1 ou um 2 num dado de dano de\r\n"
					+ "um ataque com arma corpo-a-corpo que você esteja\r\n"
					+ "empunhando com duas mãos, você pode rolar o dado\r\n"
					+ "novamente e usar a nova rolagem, mesmo que resulte em\r\n"
					+ "1 ou 2. A arma deve ter a propriedade duas mãos ou\r\n"
					+ "versátil para ganhar esse benefício.\n");
		break;
		
		case "Combate com Duas Armas":
			System.out.println("--COMBATE COM DUAS ARMAS--\r\n"
					+ "Quando você estiver engajado em uma luta com duas\r\n"
					+ "armas, você pode adicionar o seu modificador de\r\n"
					+ "habilidade de dano na jogada de dano de seu segundo\r\n"
					+ "ataque.\r\n");
		break;
		
		case "Defesa":
			System.out.println("--DEFESA--\r\n"
					+ "Enquanto estiver usando armadura, você ganha +1 de\r\n"
					+ "bônus em sua CA.\r\n");
		break;
		
		case "Duelismo":
			System.out.println("--DUELISMO--\r\n"
					+ "Quando você empunhar uma arma de ataque corpo-acorpo em uma mão e nenhuma outra arma, você ganha +2\r\n"
					+ "de bônus nas jogadas de dano com essa arma.\n");
		break;
		
		case "Proteção":
			System.out.println("--PROTEÇÃO--\r\n"
					+ "Quando uma criatura que você possa ver atacar um alvo\r\n"
					+ "que esteja a até 1,5 metro de você, você pode usar sua\r\n"
					+ "reação para impor desvantagem na jogada de ataque da\r\n"
					+ "criatura. Você deve estar empunhando um escudo.\n");
		break;
		}
	}
	
	public void setArquearia() {
		getFicha().setClassefeats("--ARQUEARIA--\r\n"
				+ "Você ganha +2 de bônus nas jogadas de ataque realizadas\r\n"
				+ "com uma arma de ataque à distância.\n");
	}
	
	public void setCombateComArmasGrandes() {
		getFicha().setClassefeats("--COMBATE COM ARMAS GRANDES--\r\n"
				+ "Quando você rolar um 1 ou um 2 num dado de dano de\r\n"
				+ "um ataque com arma corpo-a-corpo que você esteja\r\n"
				+ "empunhando com duas mãos, você pode rolar o dado\r\n"
				+ "novamente e usar a nova rolagem, mesmo que resulte em\r\n"
				+ "1 ou 2. A arma deve ter a propriedade duas mãos ou\r\n"
				+ "versátil para ganhar esse benefício.\n");
	}
	
	public void setCombateComDuasArmas() {
		getFicha().setClassefeats("--COMBATE COM DUAS ARMAS--\r\n"
				+ "Quando você estiver engajado em uma luta com duas\r\n"
				+ "armas, você pode adicionar o seu modificador de\r\n"
				+ "habilidade de dano na jogada de dano de seu segundo\r\n"
				+ "ataque.\r\n");
	}
	
	public void setDefesa() {
		getFicha().setClassefeats("--DEFESA--\r\n"
				+ "Enquanto estiver usando armadura, você ganha +1 de\r\n"
				+ "bônus em sua CA.\r\n");
	}
	
	public void setDuelismo() {
		getFicha().setClassefeats("--DUELISMO--\r\n"
				+ "Quando você empunhar uma arma de ataque corpo-acorpo em uma mão e nenhuma outra arma, você ganha +2\r\n"
				+ "de bônus nas jogadas de dano com essa arma.\n");
	}
	
	public void setProtecao() {
		getFicha().setClassefeats("--PROTEÇÃO--\r\n"
				+ "Quando uma criatura que você possa ver atacar um alvo\r\n"
				+ "que esteja a até 1,5 metro de você, você pode usar sua\r\n"
				+ "reação para impor desvantagem na jogada de ataque da\r\n"
				+ "criatura. Você deve estar empunhando um escudo.\n");
	}
	
	public void setRetormarFolego() {
		getFicha().setClassefeats("--Retomar o Fôlego--\r\n"
				+ "Você possui uma reserva de estamina e pode usá-la para\r\n"
				+ "proteger a si mesmo contra danos. No seu turno, você\r\n"
				+ "pode usar uma ação bônus para recuperar pontos de vida\r\n"
				+ "igual a 1d10 + seu nível de guerreiro.\r\n"
				+ "Uma vez que você use essa característica, você precisa\r\n"
				+ "terminar um descanso curto ou longo para usá-la de novo.\n");
	}
}
