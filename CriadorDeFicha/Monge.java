package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Monge extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Monge";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
	public void setMonge() {
		getFicha().setClasse("Monge");
		getFicha().setBonus_proficiencia(2);
//		this.proficiencia.setFicha(ficha);
		List<String> profEquips = Arrays.asList("Armas simples", "Espadas curtas");
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Força", "Destreza");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Acrobacia", "Atletismo", "Furtividade", "História", "Intuição", "Religião");
		getProficiencia().setPericias(profPericias, 2);
//		this.ficha = this.proficiencia.getFicha();
		setProfFerramentas();
		equips1();
		equips2();
		getFicha().setEquipamentos("Dardos (10)");
		setDefesaSemArmadura();
		setArtesMarciais();
	}
	
	public int pontosVidaLV1(int modConstituicao) {
		return 8+modConstituicao;
	}
	
	public int pontosVidaNiveisSeguintesRoll(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		for(int c = 0; c < niveis; c++) {
			soma += modConstituicao+(random.nextInt((8 - 1) + 1) + 1);	
		}
		return soma;
	}
	
	public int pontosVidaNiveisSeguintes(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		
		for(int i = 0; i < niveis; i++) {
			soma += modConstituicao+5;
		}
		
		return soma;
	}
	
	public int CDMagia(int proficiencia, int ModCarisma) {
		return 8+proficiencia+ModCarisma;
	}
	
	public int ModificadorAtaqueMagia(int proficiencia, int ModCarisma) {
		return proficiencia+ModCarisma;
	}
	
	public void setProfFerramentas() {
		Scanner entrada = new Scanner(System.in);
		List<String> ferramentasProf = Arrays.asList("Ferramenta de Artesão", "Instrumento Musical");
		boolean menuLoop = false;
		int menu = 0;
		while(menuLoop == false) {
			do {
				System.out.println("Escolha uma opção:");
				
				for(int i = 0; i < ferramentasProf.size(); i++) {
					System.out.println((i+1)+ " - " +ferramentasProf.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				menu = entrada.nextInt();
			}while(menu <= 0 || menu > 2);
			menuLoop = confirmarDecisao(ferramentasProf.get(menu));
		}
		
		switch(menu) {
		case 1:
			getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
		break;
		
		case 2:
			getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
		break;
		
		default:
		break;
		}		
	}
	
	public void equips1() {
		Scanner entrada = new Scanner(System.in);
		boolean equip1Loop = false;
		List<String> equips1 = Arrays.asList("Uma Espada Curta", "ou qualquer Arma Simples");
		int equip1Menu = 0;
		while(equip1Loop == false) {
			do {
				System.out.println("Escolha uma dessas opções:");
				for(int i =0; i <equips1.size(); i++) {
					System.out.println((i+1) +" - " +equips1.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				equip1Menu = entrada.nextInt();	
			}while(equip1Menu <= 0 || equip1Menu > equips1.size());
			equip1Loop = confirmarDecisao(equips1.get(equip1Menu));
		}
		switch(equip1Menu) {
		case 1:
			getFicha().setEquipamentos("Espada Curta");
		break;
			
		case 2:
			getFicha().setEquipamentos(getEquips().setArmasSimples());
		break;
		}
	}
	
	
	public void equips2() {
		getFicha().setEquipamentos(getEquips().setPacotes("Pacote de Explorador", "Pacote de Aventureiro"));
	}
	
	public boolean confirmarDecisao(String opcao) {
		Scanner entrada = new Scanner(System.in);
		
		char decisao;
		do {
			System.out.println("\nTem certeza que deseja " +opcao +"? (Y/N)");
			
			decisao = entrada.next().charAt(0);
		}while((Objects.equals(decisao, 'Y') || Objects.equals(decisao, 'y')  || Objects.equals(decisao, 'N') || Objects.equals(decisao, 'n')) == false);
		
		if(decisao == 'Y' || decisao == 'y') {
			return true;
		}
		return false;
	}
	
	public void setDefesaSemArmadura() {
		getFicha().setClassefeats("--DEFESA SEM ARMADURA--\r\n"
				+ "A partir do 1° nível, quando você não estiver vestindo\r\n"
				+ "nenhuma armadura nem empunhando um escudo, sua\r\n"
				+ "Classe de Armadura será 10 + seu modificador de\r\n"
				+ "Destreza + seu modificador de Sabedoria.\n");
	}
	
	public int setDSA(int modDestreza, int modSabedoria) {
		return 10+modDestreza+modSabedoria;
	}
	
	public void setArtesMarciais() {
		getFicha().setClassefeats("--ARTES MARCIAIS--\r\n"
				+ "No 1° nível, sua prática nas artes marciais concede a você\r\n"
				+ "maestria nos estilos de combate que utilizam golpes\r\n"
				+ "desarmados e armas de monge, que são as espadas curtas\r\n"
				+ "e quaisquer armas simples corpo-a-corpo que não tenham\r\n"
				+ "a propriedade duas mãos ou pesada.\r\n"
				+ "Você ganha os seguintes benefícios enquanto estiver\r\n"
				+ "desarmado ou empunhando uma arma de monge e não\r\n"
				+ "estiver vestindo nenhuma armadura ou empunhando um\r\n"
				+ "escudo:\r\n"
				+ "- Você pode usar Destreza ao invés de Força para as\r\n"
				+ "jogadas de ataque e dano dos seus golpes desarmados\r\n"
				+ "e de suas armas de monge.\r\n"
				+ "- Você pode rolar um d4 no lugar do dano normal dos\r\n"
				+ "seus golpes desarmados e armas de monge. Esse dado\r\n"
				+ "muda à medida que você adquire níveis de monge,\r\n"
				+ "como mostrado na coluna Artes Marciais na tabela O\r\n"
				+ "Monge.\r\n"
				+ "- Quando você usa a ação de Ataque com um golpe\r\n"
				+ "desarmado ou uma arma de monge no seu turno, você\r\n"
				+ "pode realizar um golpe desarmado com uma ação\r\n"
				+ "bônus. Por exemplo, se você realizar a ação de Ataque\r\n"
				+ "com um bordão, você também poderá realizar um\r\n"
				+ "golpe desarmado com uma ação bônus, assumindo que\r\n"
				+ "você ainda não realizou uma ação bônus nesse turno.\r\n"
				+ "Determinados monastérios usam formas\r\n"
				+ "especializadas de armas de monge. Por exemplo, você\r\n"
				+ "pode usar uma clava feita por dois pedaços de madeira\r\n"
				+ "conectados por uma pequena corrente (chamado de\r\n"
				+ "nunchaku) ou uma foice com uma estranha lâmina fina\r\n"
				+ "(chamada de kama). Qualquer que seja o nome que você\r\n"
				+ "use para uma arma de monge, você pode usar as\r\n"
				+ "estatísticas de jogo mostradas para as armas no capítulo 5. \r\n");
	}
}
