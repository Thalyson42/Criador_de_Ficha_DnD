package Classes;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import CriadorDeFicha.Classes;

public class Ladino extends Classes{
	private List<String> pericias = Arrays.asList("Acrobacia", "Atletismo", "Atua��o", "Engana��o", "Furtividade", "Intimida��o", "Intui��o", "Investiga��o", "Percep��o", "Persuas�o", "Prestidigita��o");
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
				+ "halfling esgueira-se � frente pelo corredor da masmorra.\r\n"
				+ "Ela encosta seus ouvidos na porta, puxa suas ferramentas\r\n"
				+ "e abre a fechadura em um piscar de olhos. Ela ent�o\r\n"
				+ "desaparece nas sombras, ao mesmo tempo em que seu\r\n"
				+ "companheiro guerreiro se move para abrir a porta com\r\n"
				+ "um chute.\r\n"
				+ "Uma humana espreita nas sombras de um beco,\r\n"
				+ "enquanto seu c�mplice se prepara para a parte dele na\r\n"
				+ "emboscada. Quando seu alvo � um not�rio traficante de\r\n"
				+ "escravos � passa pelo beco, seu c�mplice grita, o\r\n"
				+ "traficante de escravos vem investigar e a l�mina da\r\n"
				+ "assassina corta sua garganta antes mesmo dele ser capaz\r\n"
				+ "de emitir qualquer som.\r\n"
				+ "Disfar�ando uma risadinha, uma gnoma agita seus\r\n"
				+ "dedos e magicamente surrupia o molho de chaves do cinto\r\n"
				+ "do guarda. No momento seguinte, as chaves est�o em\r\n"
				+ "suas m�os, a porta da cela est� aberta e ela e seus\r\n"
				+ "companheiros est�o livres para escapar.\r\n"
				+ "Ladinos contam com sua per�cia, furtividade e as\r\n"
				+ "vulnerabilidades de seus inimigos para obter vantagem\r\n"
				+ "em qualquer situa��o. Eles possuem uma habilidade\r\n"
				+ "especial para encontrar a solu��o para praticamente\r\n"
				+ "qualquer problema, demonstrando desenvoltura e\r\n"
				+ "versatilidade, a chave de qualquer grupo aventureiro de\r\n"
				+ "sucesso.";
		
		return descricao;
	}
	
	public String ladinoCaracteristicas() {
		String caracteristicas = "CARACTER�STICAS DE CLASSE\r\n"
				+ "Como um ladino, voc� adquire as seguintes\r\n"
				+ "caracter�sticas de classe.\r\n"
				+ "PONTOS DE VIDA\r\n"
				+ "Dado de Vida: 1d8 por n�vel de ladino\r\n"
				+ "Pontos de Vida no 1� N�vel: 8 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constitui��o por n�vel de ladino ap�s o\r\n"
				+ "1�\r\n"
				+ "PROFICI�NCIAS\r\n"
				+ "Armaduras: Armaduras leves\r\n"
				+ "Armas: Armas simples, bestas de m�o, espadas longas,\r\n"
				+ "rapieiras, espadas curtas\r\n"
				+ "Ferramentas: Ferramentas de ladr�o\r\n"
				+ "Testes de Resist�ncia: Destreza, Intelig�ncia\r\n"
				+ "Per�cias: Escolha quatro dentre Acrobacia, Atletismo,\r\n"
				+ "Atua��o, Engana��o, Furtividade, Intimida��o,\r\n"
				+ "Intui��o, Investiga��o, Percep��o, Persuas�o e\r\n"
				+ "Prestidigita��o"
				+ "EQUIPAMENTO\r\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma rapieira ou (b) uma espada longa\r\n"
				+ "- (a) um arco curto e uma aljava com 20 flechas ou (b)\r\n"
				+ "uma espada curta\r\n"
				+ "- (a) um pacote de assaltante ou (b) um pacote de\r\n"
				+ "aventureiro ou (c) um pacote de explorador\r\n"
				+ "- Armadura de couro, duas adagas e ferramentas de\r\n"
				+ "ladr�o\r\n";
		
		return caracteristicas;
	}
	
	public void setLadino() {
		getFicha().setClasse("Ladino");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Acolchoada", "Couro", "Couro Batido");
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Destreza", "Intelig�ncia");
		getProficiencia().SetResistencia(profResistencia);
		getFicha().setEquipamentos("Armadura de couro");
		getFicha().setEquipamentos("Adagas (2)");
		getFicha().setProfi_ferramentas_peri("Ferramentas de Ladr�o");
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
//				System.out.println("Escolha uma das op��es:");
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
//				System.out.println("Escolha uma das op��es:");
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
		getFicha().setClassefeats("--Especializa��o--n"
				+ "No 1� n�vel, voc� escolhe duas de suas per�cias que seja\r\n"
				+ "proficiente, ou uma per�cia que seja proficiente e\r\n"
				+ "ferramentas de ladr�o. Seu b�nus de profici�ncia �\r\n"
				+ "dobrado em qualquer teste de habilidade que fizer com\r\n"
				+ "elas.\r\n"
				+ "No 6� n�vel, voc� pode escolher outras duas de suas\r\n"
				+ "profici�ncias (em per�cias ou ferramentas de ladr�o) para\r\n"
				+ "ganhar esse benef�cio.\r\n");
	}
	
	public void setAtaqueFurtivo() {
		getFicha().setClassefeats("--Ataque Furtivo--\n"
				+ "A partir do 1� n�vel, voc� sabe como atacar sutilmente e\r\n"
				+ "explorar a distra��o de seus inimigos. Uma vez por turno,\r\n"
				+ "voc� pode adicionar 1d6 nas jogadas de dano contra\r\n"
				+ "qualquer criatura que acertar, desde que tenha vantagem\r\n"
				+ "nas jogadas de ataque. O ataque deve ser com uma arma\r\n"
				+ "de acuidade ou � dist�ncia.\r\n"
				+ "Voc� n�o precisa ter vantagem nas jogadas de ataque\r\n"
				+ "se outro inimigo do seu alvo estiver a 1,5 metro de\r\n"
				+ "dist�ncia dele, desde que este inimigo n�o esteja\r\n"
				+ "incapacitado e voc� n�o tenha desvantagem nas jogadas\r\n"
				+ "de ataque.\r\n"
				+ "A quantidade de dano extra aumenta conforme voc�\r\n"
				+ "ganha n�veis nessa classe, como mostrado na coluna\r\n"
				+ "Ataque Furtivo da tabela O Ladino.\r\n");
	}
	
	public void setGiriaDeLadrao() {
		getFicha().setClassefeats("--G�ria de Ladr�o--\n"
				+ "Durante seu treinamento voc� aprendeu as g�rias de\r\n"
				+ "ladr�o, um misto de dialeto, jarg�o e c�digos secretos que\r\n"
				+ "permitem voc� passar mensagens secretas durante uma\r\n"
				+ "conversa aparentemente normal. Somente outra criatura\r\n"
				+ "que conhe�a essas g�rias de ladr�o entende as mensagens.\r\n"
				+ "Leva-se quatro vezes mais tempo para transmitir essa\r\n"
				+ "mensagem do que falar a mesma ideia claramente.\r\n"
				+ "Al�m disso, voc� entende um conjunto de sinais\r\n"
				+ "secretos e s�mbolos usados para transmitir mensagens\r\n"
				+ "curtas e simples, como saber se uma �rea � perigosa ou se\r\n"
				+ "� territ�rio de uma guilda de ladr�es, se o saque est�\r\n"
				+ "pr�ximo, se as pessoas na �rea s�o alvos f�ceis ou at�\r\n"
				+ "mesmo indicar lugares seguros para ladinos se\r\n"
				+ "esconderem.\r\n");
	}
}
