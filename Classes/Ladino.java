package Classes;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import CriadorDeFicha.Classes;

public class Ladino extends Classes{
	private List<String> pericias = Arrays.asList("Acrobacia", "Atletismo", "Atuação", "Enganação", "Furtividade", "Intimidação", "Intuição", "Investigação", "Percepção", "Persuasão", "Prestidigitação");
	private SecureRandom random = new SecureRandom();
//	private String nome = "Ladino";
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
	
	public List<String> getPericiasList() {
		return pericias;
	}
	
	public String ladinoDescricao() {
		String descricao = "LADINO\r\n"
				+ "Sinalizando para seus companheiros esperarem, uma\r\n"
				+ "halfling esgueira-se à frente pelo corredor da masmorra.\r\n"
				+ "Ela encosta seus ouvidos na porta, puxa suas ferramentas\r\n"
				+ "e abre a fechadura em um piscar de olhos. Ela então\r\n"
				+ "desaparece nas sombras, ao mesmo tempo em que seu\r\n"
				+ "companheiro guerreiro se move para abrir a porta com\r\n"
				+ "um chute.\r\n"
				+ "Uma humana espreita nas sombras de um beco,\r\n"
				+ "enquanto seu cúmplice se prepara para a parte dele na\r\n"
				+ "emboscada. Quando seu alvo – um notório traficante de\r\n"
				+ "escravos – passa pelo beco, seu cúmplice grita, o\r\n"
				+ "traficante de escravos vem investigar e a lâmina da\r\n"
				+ "assassina corta sua garganta antes mesmo dele ser capaz\r\n"
				+ "de emitir qualquer som.\r\n"
				+ "Disfarçando uma risadinha, uma gnoma agita seus\r\n"
				+ "dedos e magicamente surrupia o molho de chaves do cinto\r\n"
				+ "do guarda. No momento seguinte, as chaves estão em\r\n"
				+ "suas mãos, a porta da cela está aberta e ela e seus\r\n"
				+ "companheiros estão livres para escapar.\r\n"
				+ "Ladinos contam com sua perícia, furtividade e as\r\n"
				+ "vulnerabilidades de seus inimigos para obter vantagem\r\n"
				+ "em qualquer situação. Eles possuem uma habilidade\r\n"
				+ "especial para encontrar a solução para praticamente\r\n"
				+ "qualquer problema, demonstrando desenvoltura e\r\n"
				+ "versatilidade, a chave de qualquer grupo aventureiro de\r\n"
				+ "sucesso.";
		
		return descricao;
	}
	
	public String ladinoCaracteristicas() {
		String caracteristicas = "CARACTERÍSTICAS DE CLASSE\r\n"
				+ "Como um ladino, você adquire as seguintes\r\n"
				+ "características de classe.\r\n"
				+ "PONTOS DE VIDA\r\n"
				+ "Dado de Vida: 1d8 por nível de ladino\r\n"
				+ "Pontos de Vida no 1° Nível: 8 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constituição por nível de ladino após o\r\n"
				+ "1°\r\n"
				+ "PROFICIÊNCIAS\r\n"
				+ "Armaduras: Armaduras leves\r\n"
				+ "Armas: Armas simples, bestas de mão, espadas longas,\r\n"
				+ "rapieiras, espadas curtas\r\n"
				+ "Ferramentas: Ferramentas de ladrão\r\n"
				+ "Testes de Resistência: Destreza, Inteligência\r\n"
				+ "Perícias: Escolha quatro dentre Acrobacia, Atletismo,\r\n"
				+ "Atuação, Enganação, Furtividade, Intimidação,\r\n"
				+ "Intuição, Investigação, Percepção, Persuasão e\r\n"
				+ "Prestidigitação"
				+ "EQUIPAMENTO\r\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma rapieira ou (b) uma espada longa\r\n"
				+ "- (a) um arco curto e uma aljava com 20 flechas ou (b)\r\n"
				+ "uma espada curta\r\n"
				+ "- (a) um pacote de assaltante ou (b) um pacote de\r\n"
				+ "aventureiro ou (c) um pacote de explorador\r\n"
				+ "- Armadura de couro, duas adagas e ferramentas de\r\n"
				+ "ladrão\r\n";
		
		return caracteristicas;
	}
	
	public void setLadino() {
		getFicha().setClasse("Ladino");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Acolchoada", "Couro", "Couro Batido");
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Destreza", "Inteligência");
		getProficiencia().SetResistencia(profResistencia);
		getFicha().setEquipamentos("Armadura de couro");
		getFicha().setEquipamentos("Adagas (2)");
		getFicha().setProfi_ferramentas_peri("Ferramentas de Ladrão");
//		equips1();
//		equips2();
//		equips3();
		setEspecializacao();
		setAtaqueFurtivo();
		setGiriaDeLadrao();
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
	
	public int setCDMagias(int proficiencia, int ModCarisma) {
		return 8+proficiencia+ModCarisma;
	}
	
	public int setModificadorAtaqueMagia(int proficiencia, int ModCarisma) {
		return proficiencia+ModCarisma;
	}
	
//	public void equips1() {
//		Scanner entrada = new Scanner(System.in);
//		List<String> equips1 = Arrays.asList("Rapieira", "Espada Longa");
//		boolean menuLoop = false;
//		int menu = 0;
//		while(menuLoop == false) {
//			do {
//				System.out.println("Escolha uma das opções:");
//				
//				for(int i = 0; i < equips1.size(); i++) {
//					System.out.println("("+ i+1 +") Uma " +equips1.get(i));
//				}
//				
//				while(!entrada.hasNextInt()) {
//					System.out.println("Digite um numero!");
//					entrada.next();
//				}
//				
//				menu = entrada.nextInt();
//			}while(menu <= 0 || menu > 2);
//			menuLoop = confirmarDecisao(equips1.get(menu));
//		}
//		switch(menu) {
//		case 1:
//			getFicha().setEquipamentos("Rapieira");
//		break;
//			
//		case 2:
//			getFicha().setEquipamentos("Espada Longa");
//		break;
//			
//		default:
//		break;
//		}
//	}
//	
//	public void equips2() {
//		Scanner entrada = new Scanner(System.in);
//		List<String> equips1 = Arrays.asList("Arco curto e uma aljava com 20 flechas", "uma Espada Curta");
//		boolean menuLoop = false;
//		int menu = 0;
//		while(menuLoop == false) {
//			do {
//				System.out.println("Escolha uma das opções:");
//				
//				for(int i = 0; i < equips1.size(); i++) {
//					System.out.println("("+ i+1 +")" +equips1.get(i));
//				}
//				
//				while(!entrada.hasNextInt()) {
//					System.out.println("Digite um numero!");
//					entrada.next();
//				}
//				
//				menu = entrada.nextInt();
//			}while(menu <= 0 || menu > 2);
//			menuLoop = confirmarDecisao(equips1.get(menu));
//		}
//		switch(menu) {
//		case 1:
//			getFicha().setEquipamentos("Arco curto");
//			getFicha().setEquipamentos("Aljava (20) Flechas");
//		break;
//			
//		case 2:
//			getFicha().setEquipamentos("Espada Curta");
//		break;
//			
//		default:
//		break;
//		}
//	}
//	
//	public void equips3() {
//		getFicha().setEquipamentos(getEquips().setPacotes("Pacote de Assaltante", "Pacote de Aventureiro", "Pacote de Explorador"));
//	}
	
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

	public void setEspecializacao() {
		getFicha().setClassefeats("--Especialização--n"
				+ "No 1º nível, você escolhe duas de suas perícias que seja\r\n"
				+ "proficiente, ou uma perícia que seja proficiente e\r\n"
				+ "ferramentas de ladrão. Seu bônus de proficiência é\r\n"
				+ "dobrado em qualquer teste de habilidade que fizer com\r\n"
				+ "elas.\r\n"
				+ "No 6º nível, você pode escolher outras duas de suas\r\n"
				+ "proficiências (em perícias ou ferramentas de ladrão) para\r\n"
				+ "ganhar esse benefício.\r\n");
	}
	
	public void setAtaqueFurtivo() {
		getFicha().setClassefeats("--Ataque Furtivo--\n"
				+ "A partir do 1º nível, você sabe como atacar sutilmente e\r\n"
				+ "explorar a distração de seus inimigos. Uma vez por turno,\r\n"
				+ "você pode adicionar 1d6 nas jogadas de dano contra\r\n"
				+ "qualquer criatura que acertar, desde que tenha vantagem\r\n"
				+ "nas jogadas de ataque. O ataque deve ser com uma arma\r\n"
				+ "de acuidade ou à distância.\r\n"
				+ "Você não precisa ter vantagem nas jogadas de ataque\r\n"
				+ "se outro inimigo do seu alvo estiver a 1,5 metro de\r\n"
				+ "distância dele, desde que este inimigo não esteja\r\n"
				+ "incapacitado e você não tenha desvantagem nas jogadas\r\n"
				+ "de ataque.\r\n"
				+ "A quantidade de dano extra aumenta conforme você\r\n"
				+ "ganha níveis nessa classe, como mostrado na coluna\r\n"
				+ "Ataque Furtivo da tabela O Ladino.\r\n");
	}
	
	public void setGiriaDeLadrao() {
		getFicha().setClassefeats("--Gíria de Ladrão--\n"
				+ "Durante seu treinamento você aprendeu as gírias de\r\n"
				+ "ladrão, um misto de dialeto, jargão e códigos secretos que\r\n"
				+ "permitem você passar mensagens secretas durante uma\r\n"
				+ "conversa aparentemente normal. Somente outra criatura\r\n"
				+ "que conheça essas gírias de ladrão entende as mensagens.\r\n"
				+ "Leva-se quatro vezes mais tempo para transmitir essa\r\n"
				+ "mensagem do que falar a mesma ideia claramente.\r\n"
				+ "Além disso, você entende um conjunto de sinais\r\n"
				+ "secretos e símbolos usados para transmitir mensagens\r\n"
				+ "curtas e simples, como saber se uma área é perigosa ou se\r\n"
				+ "é território de uma guilda de ladrões, se o saque está\r\n"
				+ "próximo, se as pessoas na área são alvos fáceis ou até\r\n"
				+ "mesmo indicar lugares seguros para ladinos se\r\n"
				+ "esconderem.\r\n");
	}
}
