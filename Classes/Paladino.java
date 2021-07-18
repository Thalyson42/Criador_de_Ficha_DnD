package Classes;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import CriadorDeFicha.Classes;

public class Paladino extends Classes{
	private List<String> pericias = Arrays.asList("Atletismo", "Intuição", "Intimidação", "Medicina", "Persuasão", "Religião");
	private SecureRandom random = new SecureRandom();
//	private String nome = "Paladino";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;

	public List<String> getPericiasList() {
		return pericias;
	}
	
	public String paladinoDescricao() {
		String descricao = "PALADINO\r\n"
				+ "Vestido em uma armadura de placas que reluz a luz do\r\n"
				+ "sol, a despeito da poeira e sujeira de uma longa viagem,\r\n"
				+ "um humano larga sua espada e escudo e coloca suas mãos\r\n"
				+ "em um homem fatalmente ferido. Radiação divina brilha\r\n"
				+ "de suas mãos, o ferimento do homem se fecha e seus olhos\r\n"
				+ "se arregalam com espanto.\r\n"
				+ "Um anão se esgueira por detrás de um afloramento,\r\n"
				+ "seu manto negro o torna praticamente invisível durante a\r\n"
				+ "noite, e observa uma banda de guerra orc celebrando sua\r\n"
				+ "recente vitória. Silenciosamente, ele espreita em meio a\r\n"
				+ "eles e sussurra seu juramento e dois orcs morrem antes\r\n"
				+ "mesmo de perceberem que ele estava ali.\r\n"
				+ "Com um cabelo prateado que brilha com um raio de\r\n"
				+ "luz que parece iluminar apenas ele, um elfo gargalha com\r\n"
				+ "exultação. Sua lança golpeia num piscar, como o dos seus\r\n"
				+ "olhos, perfurando de novo e de novo em um gigante\r\n"
				+ "contorcendo\r\n"
				+ "-se, até que finalmente sua luz supera a\r\n"
				+ "escuridão dele.\r\n"
				+ "Seja lá quais forem suas origens e suas missões,\r\n"
				+ "paladinos são unidos pelos seus juramentos de se\r\n"
				+ "imporem contra as forças do mal. Quer seja jurado ante o\r\n"
				+ "altar de um deus com um sacerdote como testemunha,\r\n"
				+ "quer seja em um clareira sagrada diante dos espíritos da\r\n"
				+ "natureza e seres feéricos, ou em um momento de\r\n"
				+ "desespero e aflição com os mortos como únicas\r\n"
				+ "testemunhas, o juramento de um paladino é um laço\r\n"
				+ "poderoso. Ele é uma fonte de poder que transforma um\r\n"
				+ "guerreiro devotado em um campeão abençoado.\r\n";
		
		return descricao;
	}
	
	public String paladinoCaracteristicas() {
		String caracteristicas = "CARACTERÍSTICAS DE CLASSE\r\n"
				+ "Como um paladino, você adquire as seguintes\r\n"
				+ "características de classe.\r\n"
				+ "PONTOS DE VIDA\r\n"
				+ "Dado de Vida: 1d10 por nível de paladino\r\n"
				+ "Pontos de Vida no 1° Nível: 10 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d10 (ou 6) +\r\n"
				+ "seu modificador de Constituição por nível de paladino\r\n"
				+ "após o 1°\n"
				+ "PROFICIÊNCIAS\r\n"
				+ "Armaduras: Todas as armaduras, escudos\r\n"
				+ "Armas: Armas simples, armas marciais\r\n"
				+ "Ferramentas: Nenhum\r\n"
				+ "Testes de Resistência: Sabedoria, Carisma\r\n"
				+ "Perícias: Escolha duas dentre Atletismo, Intuição,\r\n"
				+ "Intimidação, Medicina, Persuasão e Religião\r\n"
				+ "EQUIPAMENTO\r\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma arma marcial e um escudo ou (b) duas armas\r\n"
				+ "marciais\r\n"
				+ "- (a) cinco azagaias ou (b) qualquer arma simples corpoa-corpo\r\n"
				+ "- (a) um pacote de sacerdote ou (b) um pacote de\r\n"
				+ "aventureiro\r\n"
				+ "- Cota de malha e um símbolo sagrado\r\n";
		
		return caracteristicas;
	}
	
	public void setPaladino() {
		getFicha().setClasse("Paladino");
		getFicha().setBonus_proficiencia(2);
		List<String> listaArmaduras = Arrays.asList("Armaduras Leves", "Armaduras Médias", "Armaduras Pesadas", "Armas Simples", "Armas Marciais");
		getProficiencia().SetProfEquips(listaArmaduras);
		getProficiencia().setProficienciaEscudos();
		List<String> profResistencia = Arrays.asList("Sabedoria", "Carisma");
		getProficiencia().SetResistencia(profResistencia);
		getFicha().setEquipamentos("Cota de malha");
		getFicha().setEquipamentos("Símbolo sagrado");
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
	
	public int CDMagia(int proficiencia, int ModCarisma) {
		return 8+proficiencia+ModCarisma;
	}
	
	public int ModificadorAtaqueMagia(int proficiencia, int ModCarisma) {
		return proficiencia+ModCarisma;
	}
	
//	public void equips1() {
//		Scanner entrada = new Scanner(System.in);
//		List<String> equip1 = Arrays.asList("Uma arma marcial e um escudo", "Duas armas marciais");
//		boolean menuLoop = false;
//		int menu = 0;
//		while(menuLoop == false) {
//			do {
//				System.out.println("Escolha uma opção:");
//				
//				for(int i = 0; i < equip1.size(); i++) {
//					System.out.println((i+1)+ " - " +equip1.get(i));
//				}
//				
//				while(!entrada.hasNextInt()) {
//					System.out.println("Digite um numero!");
//					entrada.next();
//				}
//				
//				menu = entrada.nextInt();
//			}while(menu <= 0 || menu > 2);
//			menuLoop = confirmarDecisao(equip1.get(menu));
//		}
//		
//		switch(menu) {
//		case 1:
//			getFicha().setEquipamentos(getEquips().setArmasMarciais());
//			getFicha().setEquipamentos("Escudo");
//		break;
//		
//		case 2:
//			getFicha().setEquipamentos(getEquips().setArmasMarciais(2));
//		break;
//		}
//	}
//	
//	public void equips2() {
//		Scanner entrada = new Scanner(System.in);
//		List<String> equip1 = Arrays.asList("5 azagaias", "Qualquer arma simples corpo-a-corpo");
//		boolean menuLoop = false;
//		int menu = 0;
//		while(menuLoop == false) {
//			do {
//				System.out.println("Escolha uma opção:");
//				
//				for(int i = 0; i < equip1.size(); i++) {
//					System.out.println((i+1)+ " - " +equip1.get(i));
//				}
//				
//				while(!entrada.hasNextInt()) {
//					System.out.println("Digite um numero!");
//					entrada.next();
//				}
//				
//				menu = entrada.nextInt();
//			}while(menu <= 0 || menu > 2);
//			menuLoop = confirmarDecisao(equip1.get(menu));
//		}
//		
//		switch(menu) {
//		case 1:
//			getFicha().setEquipamentos("Azagais (5)");
//		break;
//		
//		case 2:
//			getFicha().setEquipamentos(getEquips().setArmaCACSimples());
//		break;
//		}
//	}
//	
//	public void equips3() {
//		getFicha().setEquipamentos(getEquips().setPacotes("Pacote de Sacerdote", "Pacote de Aventureiro"));
//	}
//	
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
	
	public void setSentidoDivino() {
		getFicha().setClassefeats("--SENTIDO DIVINO--\r\n"
				+ "A presença de um mal poderoso é registrada nos seus\r\n"
				+ "sentidos como um odor nocivo e o bem poderoso badala\r\n"
				+ "como música celestial nos seus ouvidos. Com uma ação,\r\n"
				+ "você pode expandir sua consciência para detectar tais\r\n"
				+ "forças. Até o final do seu próximo turno, você sabe a\r\n"
				+ "localização de qualquer celestial, corruptor ou morto-vivo\r\n"
				+ "a 18 metros de você que não esteja com cobertura total.\r\n"
				+ "Você sabe o tipo (celestial, corruptor ou morto-vivo) de\r\n"
				+ "qualquer ser cuja presença você sentiu, mas não sua\r\n"
				+ "identidade (o vampiro Conde Strahd von Zarovish, por\r\n"
				+ "exemplo). Dentro do mesmo raio, você também detecta a\r\n"
				+ "presença de qualquer lugar ou objeto que tenha sido\r\n"
				+ "consagrado ou conspurcado, como pela magia consagrar.\r\n"
				+ "Você pode usar essa característica um número de\r\n"
				+ "vezes igual a 1 + seu modificador de Carisma. Quando\r\n"
				+ "você concluir um descanso longo, você recupera todos os\r\n"
				+ "usos gastos.\n");
	}
	
	public void setCuraPelasMãos() {
		getFicha().setClassefeats("--CURA PELAS MÃOS--\r\n"
				+ "Seu toque abençoado pode curar ferimentos. Você tem\r\n"
				+ "uma reserva de poder curativo que se enche quando você\r\n"
				+ "realiza um descanso longo. Com essa reserva, você pode\r\n"
				+ "restaurar um número total de pontos de vida igual ao seu\r\n"
				+ "nível de paladino x 5.\r\n"
				+ "Com uma ação, você pode tocar uma criatura e sugar\r\n"
				+ "poder da sua reserva para restaurar um número de\r\n"
				+ "pontos de vida da criatura, até o máximo de pontos\r\n"
				+ "restantes na reserva.\r\n"
				+ "Alternativamente, você pode gastar 5 pontos de cura\r\n"
				+ "da sua reserva de cura para curar o alvo de uma doença\r\n"
				+ "ou neutralizar um veneno que o esteja afetando. Você\r\n"
				+ "pode curar múltiplas doenças e neutralizar múltiplos\r\n"
				+ "venenos com um único uso de Cura pelas Mãos, gastando\r\n"
				+ "pontos de vida separadamente para cada um.\r\n"
				+ "Essa característica não gera nenhum efeito em\r\n"
				+ "mortos-vivos e constructos.\n");
	}
	
}
