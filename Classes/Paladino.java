package Classes;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import CriadorDeFicha.Classes;

public class Paladino extends Classes{
	private List<String> pericias = Arrays.asList("Atletismo", "Intui��o", "Intimida��o", "Medicina", "Persuas�o", "Religi�o");
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
				+ "um humano larga sua espada e escudo e coloca suas m�os\r\n"
				+ "em um homem fatalmente ferido. Radia��o divina brilha\r\n"
				+ "de suas m�os, o ferimento do homem se fecha e seus olhos\r\n"
				+ "se arregalam com espanto.\r\n"
				+ "Um an�o se esgueira por detr�s de um afloramento,\r\n"
				+ "seu manto negro o torna praticamente invis�vel durante a\r\n"
				+ "noite, e observa uma banda de guerra orc celebrando sua\r\n"
				+ "recente vit�ria. Silenciosamente, ele espreita em meio a\r\n"
				+ "eles e sussurra seu juramento e dois orcs morrem antes\r\n"
				+ "mesmo de perceberem que ele estava ali.\r\n"
				+ "Com um cabelo prateado que brilha com um raio de\r\n"
				+ "luz que parece iluminar apenas ele, um elfo gargalha com\r\n"
				+ "exulta��o. Sua lan�a golpeia num piscar, como o dos seus\r\n"
				+ "olhos, perfurando de novo e de novo em um gigante\r\n"
				+ "contorcendo\r\n"
				+ "-se, at� que finalmente sua luz supera a\r\n"
				+ "escurid�o dele.\r\n"
				+ "Seja l� quais forem suas origens e suas miss�es,\r\n"
				+ "paladinos s�o unidos pelos seus juramentos de se\r\n"
				+ "imporem contra as for�as do mal. Quer seja jurado ante o\r\n"
				+ "altar de um deus com um sacerdote como testemunha,\r\n"
				+ "quer seja em um clareira sagrada diante dos esp�ritos da\r\n"
				+ "natureza e seres fe�ricos, ou em um momento de\r\n"
				+ "desespero e afli��o com os mortos como �nicas\r\n"
				+ "testemunhas, o juramento de um paladino � um la�o\r\n"
				+ "poderoso. Ele � uma fonte de poder que transforma um\r\n"
				+ "guerreiro devotado em um campe�o aben�oado.\r\n";
		
		return descricao;
	}
	
	public String paladinoCaracteristicas() {
		String caracteristicas = "CARACTER�STICAS DE CLASSE\r\n"
				+ "Como um paladino, voc� adquire as seguintes\r\n"
				+ "caracter�sticas de classe.\r\n"
				+ "PONTOS DE VIDA\r\n"
				+ "Dado de Vida: 1d10 por n�vel de paladino\r\n"
				+ "Pontos de Vida no 1� N�vel: 10 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d10 (ou 6) +\r\n"
				+ "seu modificador de Constitui��o por n�vel de paladino\r\n"
				+ "ap�s o 1�\n"
				+ "PROFICI�NCIAS\r\n"
				+ "Armaduras: Todas as armaduras, escudos\r\n"
				+ "Armas: Armas simples, armas marciais\r\n"
				+ "Ferramentas: Nenhum\r\n"
				+ "Testes de Resist�ncia: Sabedoria, Carisma\r\n"
				+ "Per�cias: Escolha duas dentre Atletismo, Intui��o,\r\n"
				+ "Intimida��o, Medicina, Persuas�o e Religi�o\r\n"
				+ "EQUIPAMENTO\r\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma arma marcial e um escudo ou (b) duas armas\r\n"
				+ "marciais\r\n"
				+ "- (a) cinco azagaias ou (b) qualquer arma simples corpoa-corpo\r\n"
				+ "- (a) um pacote de sacerdote ou (b) um pacote de\r\n"
				+ "aventureiro\r\n"
				+ "- Cota de malha e um s�mbolo sagrado\r\n";
		
		return caracteristicas;
	}
	
	public void setPaladino() {
		getFicha().setClasse("Paladino");
		getFicha().setBonus_proficiencia(2);
		List<String> listaArmaduras = Arrays.asList("Armaduras Leves", "Armaduras M�dias", "Armaduras Pesadas", "Armas Simples", "Armas Marciais");
		getProficiencia().SetProfEquips(listaArmaduras);
		getProficiencia().setProficienciaEscudos();
		List<String> profResistencia = Arrays.asList("Sabedoria", "Carisma");
		getProficiencia().SetResistencia(profResistencia);
		getFicha().setEquipamentos("Cota de malha");
		getFicha().setEquipamentos("S�mbolo sagrado");
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
//				System.out.println("Escolha uma op��o:");
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
//				System.out.println("Escolha uma op��o:");
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
				+ "A presen�a de um mal poderoso � registrada nos seus\r\n"
				+ "sentidos como um odor nocivo e o bem poderoso badala\r\n"
				+ "como m�sica celestial nos seus ouvidos. Com uma a��o,\r\n"
				+ "voc� pode expandir sua consci�ncia para detectar tais\r\n"
				+ "for�as. At� o final do seu pr�ximo turno, voc� sabe a\r\n"
				+ "localiza��o de qualquer celestial, corruptor ou morto-vivo\r\n"
				+ "a 18 metros de voc� que n�o esteja com cobertura total.\r\n"
				+ "Voc� sabe o tipo (celestial, corruptor ou morto-vivo) de\r\n"
				+ "qualquer ser cuja presen�a voc� sentiu, mas n�o sua\r\n"
				+ "identidade (o vampiro Conde Strahd von Zarovish, por\r\n"
				+ "exemplo). Dentro do mesmo raio, voc� tamb�m detecta a\r\n"
				+ "presen�a de qualquer lugar ou objeto que tenha sido\r\n"
				+ "consagrado ou conspurcado, como pela magia consagrar.\r\n"
				+ "Voc� pode usar essa caracter�stica um n�mero de\r\n"
				+ "vezes igual a 1 + seu modificador de Carisma. Quando\r\n"
				+ "voc� concluir um descanso longo, voc� recupera todos os\r\n"
				+ "usos gastos.\n");
	}
	
	public void setCuraPelasM�os() {
		getFicha().setClassefeats("--CURA PELAS M�OS--\r\n"
				+ "Seu toque aben�oado pode curar ferimentos. Voc� tem\r\n"
				+ "uma reserva de poder curativo que se enche quando voc�\r\n"
				+ "realiza um descanso longo. Com essa reserva, voc� pode\r\n"
				+ "restaurar um n�mero total de pontos de vida igual ao seu\r\n"
				+ "n�vel de paladino x 5.\r\n"
				+ "Com uma a��o, voc� pode tocar uma criatura e sugar\r\n"
				+ "poder da sua reserva para restaurar um n�mero de\r\n"
				+ "pontos de vida da criatura, at� o m�ximo de pontos\r\n"
				+ "restantes na reserva.\r\n"
				+ "Alternativamente, voc� pode gastar 5 pontos de cura\r\n"
				+ "da sua reserva de cura para curar o alvo de uma doen�a\r\n"
				+ "ou neutralizar um veneno que o esteja afetando. Voc�\r\n"
				+ "pode curar m�ltiplas doen�as e neutralizar m�ltiplos\r\n"
				+ "venenos com um �nico uso de Cura pelas M�os, gastando\r\n"
				+ "pontos de vida separadamente para cada um.\r\n"
				+ "Essa caracter�stica n�o gera nenhum efeito em\r\n"
				+ "mortos-vivos e constructos.\n");
	}
	
}
