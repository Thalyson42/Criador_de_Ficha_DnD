package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bruxo extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Bruxo";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
//	public void setFicha(FichaDoPersonagem ficha) {
//		this.ficha = ficha;
//	}
	
//	public FichaDoPersonagem getFicha() {
//		return this.ficha;
//	}
	
	public String bruxoDescricao() {
		String descricao ="Com um pseudodrag�o enrolado em seu ombro, um jovem\r\n"
				+ "elfo vestindo robes dourados sorri calorosamente, tecendo\r\n"
				+ "um charme m�gico atrav�s de suas doces palavras e\r\n"
				+ "dobrando a sentinela do pal�cio como deseja.\r\n"
				+ "A medida que chamas ganham vida em suas m�os, um\r\n"
				+ "mirrado humanos sussurra o nome secreto do seu patrono\r\n"
				+ "demon�aco, infundindo sua magia com poder abissal.\r\n"
				+ "Olhando, ora para um tomo surrado, ora para o\r\n"
				+ "alinhamento incomum das estrelas acima, um tiefling de\r\n"
				+ "olhos selvagens profere o ritual m�stico que abrir� uma\r\n"
				+ "passagem para um mundo distante.\r\n"
				+ "Os bruxos s�o desbravadores do conhecimento que\r\n"
				+ "existe escondido no tecido do multiverso. Atrav�s de\r\n"
				+ "pactos feitos com seres misteriosos detentores de poder\r\n"
				+ "sobrenatural, os bruxos desbloqueiam efeitos m�gicos t�o\r\n"
				+ "sutis quanto espetaculares. Extraindo o conhecimento\r\n"
				+ "antigo de seres como nobres fadas, dem�nios, diabos,\r\n"
				+ "bruxas e entidades alien�genas do Reino Distante, os\r\n"
				+ "bruxos remontam segredos arcanos para aprimorar seus\r\n"
				+ "pr�prios poderes.\r\n\n";
		return descricao;
	}
	
	public String bruxoCaracteristicas() {
		String caracteristicas = "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por n�vel de bruxo\r\n"
				+ "Pontos de Vida no 1� N�vel: 8 + seu modificador de Constitui��o.\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constitui��o por n�vel de bruxo ap�s o 1�\r\n\n"
				+ "PROFICI�NCIAS\r\n\n"
				+ "Armaduras: Armaduras leves\r\n"
				+ "Armas: Armas simples\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resist�ncia: Sabedoria, Carisma\r\n"
				+ "Per�cias: Escolha duas dentre Arcanismo, Engana��o,\r\n"
				+ "Hist�ria, Intimida��o, Investiga��o, Natureza e\r\n"
				+ "Religi�o.\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma besta leve e 20 virotes ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "- (a) uma bolsa de componentes ou (b) um foco arcano\r\n"
				+ "- (a) um pacote de estudioso ou (b) um pacote de\r\n"
				+ "explorador\r\n"
				+ "- Armadura de couro, qualquer arma simples e duas adagas.\r\n\n";
		return caracteristicas;
	}
	
	public void setBruxo() {
		getFicha().setClasse("Bruxo");
		getFicha().setBonus_proficiencia(2);
//		this.proficiencia.setFicha(ficha);
		List<String> proficiencia_equips = Arrays.asList("Armaduras leves", "Armas simples");
		getProficiencia().SetProfEquips(proficiencia_equips);
		List<String> proficiencia_resistencia = Arrays.asList("Sabedoria", "Carisma");
		getProficiencia().SetResistencia(proficiencia_resistencia);
		List<String> pericias = Arrays.asList("Arcanismo", "Engana��o", "Hist�ria", "Intimida��o", "Investiga��o", "Natureza", "Religi�o");
		getProficiencia().setPericias(pericias ,2);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
//		this.magias.setFicha(ficha);
		getMagias().truquesBruxo();
		getMagias().setMagiasBruxoLV1();
//		this.ficha = this.magias.getFicha();
		getEquips().setArmasSimples();
		getFicha().setEquipamentos("Armadura de couro");
		getFicha().setEquipamentos("Adagas (2)");
		getFicha().setHabilidade_conjuracao("Carisma");
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
	
	public void equips1() {
		Scanner entrada = new Scanner(System.in);
		boolean equip1Loop = false;
		while(equip1Loop == false) {
			int equip1Menu;
			System.out.println("Escolha entre (1) uma besta leve e 20 virotes ou (2) qualquer arma simples.");
			
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
				getFicha().setEquipamentos(getEquips().setArmasSimples());
			break;
			}
		}
	}
	
	public void equips2() {
		Scanner entrada = new Scanner(System.in);
		boolean equips2Loop = false;
		while(equips2Loop == false) {
			int equip2Menu;
			System.out.println("Escolha uma das op��es:\n1 - Bolsa de componentes\n2 - Foco arcano\n");
			
			while(!entrada.hasNextInt()) {
				System.out.println("Por favor digite um numero!");
				entrada.next();
			}
			
			equip2Menu = entrada.nextInt();
			switch(equip2Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("--Bolsa de Componentes--\n"
							+ "Trata-se de uma pequena\r\n"
							+ "bolsa de couro � prova d'�gua que pode ser fixada em um\r\n"
							+ "cinto. Ela possui compartimentos para armazenar todos\r\n"
							+ "os componentes materiais e outros itens especiais que\r\n"
							+ "voc� precisa para lan�ar suas magias, exceto os\r\n"
							+ "componentes que possuem um custo espec�fico (conforme\r\n"
							+ "indicado na descri��o da magia).\n");
					System.out.printf("Tem certeza que deseja escolher Bolsa de componentes? (Y/N)\n");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						getFicha().setEquipamentos("Bolsa de componentes");
						decisaoLoop = true;
						equips2Loop = true;
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
				}
			break;
			
			case 2:
				char decisaocase2;
				boolean decisao2Loop = false;
					
				while(decisao2Loop == false) {	
					System.out.println("--Foco arcano--\n"
							+ "Um foco arcano � um item especial �\r\n"
							+ "um orbe, um cristal, um bast�o, um cajado especialmente\r\n"
							+ "constru�do, uma varinha de madeira, ou algum item\r\n"
							+ "semelhante � projetado para canalizar o poder de magias\r\n"
							+ "arcanas. Um feiticeiro, bruxo ou mago podem us�-lo como\r\n"
							+ "um foco de conjura��o, conforme descrito no cap�tulo 10.\n");
					System.out.printf("Tem certeza que deseja escolher Foco arcano? (Y/N)\n");
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						getFicha().setEquipamentos("Foco Arcano");
						decisao2Loop = true;
						equips2Loop = true;
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
				}
				
			break;	
			
			default:
				System.out.println("Essa op��o n�o existe!");
			break;
			}		
		}
	}

	public void equips3() {
		getEquips().setPacotes("Pacote de Estudioso", "Pacote de Explorador");
	}
	
	
//Bruxo feats padr�o
	public void bruxoFeatsPadrao() {
		System.out.println("PATRONO TRANSCENDENTAL\r\n\n"
				+ "No 1� n�vel, voc� conclui uma barganha com um ser\r\n"
				+ "transcendental, � sua escolha: a Arquifada, o Corruptor\r\n"
				+ "ou o Grande Antigo, cada um deles � detalhado no final\r\n"
				+ "da descri��o da classe. Sua escolha lhe confere tra�os no\r\n"
				+ "1� n�vel e novamente no6�, 10� e 14� n�vel.\r\n\n"
				+ "MAGIA DE PACTO\r\n\n"
				+ "Sua pesquisa arcana e a magia outorgada a voc� por seu\r\n"
				+ "patrono, lhe concedem uma gama de magias. Veja o\r\n"
				+ "cap�tulo 10 para as regras gerais de conjura��o e o\r\n"
				+ "cap�tulo 11 para a lista de magias de bruxo.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Voc� conhece dois truques, � sua escolha, da lista de\r\n"
				+ "magias de bruxo. Voc� aprende truques de bruxo\r\n"
				+ "adicionais, � sua escolha, em n�veis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Bruxo.\r\n\n"
				+ "ESPA�OS DE MAGIA\r\n\n"
				+ "A tabela O Bruxo mostra quantos espa�os de magia voc�\r\n"
				+ "possui. A tabela tamb�m mostra qual o n�vel desses\r\n"
				+ "espa�os; todos os seus espa�os de magia s�o do mesmo\r\n"
				+ "n�vel. Para conjurar uma magia de bruxo de 1� n�vel ou\r\n"
				+ "superior, voc� deve gastar uma espa�o de magia. Voc�\r\n"
				+ "recobra todos os espa�os de magia gastos quando voc�\r\n"
				+ "completa um descanso curto ou longo.\r\n"
				+ "Por exemplo, quando voc� atingir o 5� n�vel, voc� ter�\r\n"
				+ "dois espa�os de magia de 3� n�vel. Para conjurar a magia\r\n"
				+ "de 1� n�vel raio de bruxa, voc� deve gastar um desses\r\n"
				+ "espa�os e voc� a conjura como uma magia de 3� n�vel.\r\n\n"
				+ "MAGIAS CONHECIDAS DE 1� NIVEL E SUPERIORES\r\n\n"
				+ "No 1� n�vel, voc� conhece duas magias de 1� n�vel, � sua\r\n"
				+ "escolha da lista de magias de bruxo.\r\n"
				+ "A coluna Magias Conhecidas na tabela O Bruxo\r\n"
				+ "mostra quando voc� aprende mais magias de bruxo, � sua\r\n"
				+ "escolha, de 1� n�vel ou superior. Cada uma dessas magias\r\n"
				+ "deve ser de um n�vel a que voc� tenha acesso, como\r\n"
				+ "mostrado na tabela na coluna de N�vel de Magia para o\r\n"
				+ "seu n�vel. Quando voc� alcan�a o 6� n�vel, por exemplo,\r\n"
				+ "voc� aprende uma nova magia de bruxo, que pode ser de\r\n"
				+ "1�, 2� ou 3� n�vel.\r\n"
				+ "Al�m disso, quando voc� adquire um n�vel nessa\r\n"
				+ "classe, voc� pode escolher uma magia de bruxo que voc�\r\n"
				+ "conhe�a e substitu�-la por outra magia da lista de magias\r\n"
				+ "de bruxo, que tamb�m deve ser de um n�vel ao qual voc�\r\n"
				+ "tenha espa�os de magia.\r\n\n"
				+ "HABILIDADE DE CONJURA��O\r\n\n"
				+ "Sua habilidade de conjura��o � Carisma para suas\r\n"
				+ "magias de bruxo, portanto, voc� usa seu Carisma sempre\r\n"
				+ "que alguma magia se referir � sua habilidade de conjurar\r\n"
				+ "magias. Al�m disso, voc� usa o seu modificador de\r\n"
				+ "Carisma para definir a CD dos testes de resist�ncia para\r\n"
				+ "as magias de bruxo que voc� conjura e quando voc�\r\n"
				+ "realiza uma jogada de ataque com uma magia.\r\n"
				+ "CD para suas magias = 8 + b�nus de profici�ncia +\r\n"
				+ "seu modificador de Carisma\r\n"
				+ "Modificador de ataque de magia = seu b�nus de profici�ncia +\r\n"
				+ "seu modificador de Carisma\r\n\n"
				+ "FOCO DE CONJURA��O\r\n\n"
				+ "Voc� pode usar um foco arcano (encontrado no cap�tulo 5)\r\n"
				+ "como foco de conjura��o das suas magias de bruxo.\r\n\n");
	}
	
//Bruxo feats nivel 2
	public void bruxoFeatsNivel2() {
		System.out.println("PACTO DA CORRENTE\r\n\n"
				+ "Voc� aprende a magia convocar familiar e pode conjur�-la\r\n"
				+ "como um ritual. Essa magia n�o conta no n�mero de\r\n"
				+ "magias que voc� conhece.\r\n"
				+ "Quando voc� conjura essa magia, voc� pode escolher\r\n"
				+ "uma das formas convencionais para o seu familiar ou uma\r\n"
				+ "das seguintes formas especiais: diabrete, pseudodrag�o,\r\n"
				+ "quasit ou sprite.\r\n"
				+ "Al�m disso, quando voc� realiza a a��o de Ataque, voc�\r\n"
				+ "pode renunciar s um dos seus ataques para permitir que\r\n"
				+ "seu familiar realize um ataque, com a rea��o dele.\r\n\n"
				+ "PACTO DA L�MINA\r\n\n"
				+ "Voc� pode usar sua a��o para criar uma arma de pacto\r\n"
				+ "em sua m�o vazia. Voc� escolhe a forma que essa arma\r\n"
				+ "corpo-a-corpo tem a cada vez que voc� a cria (veja as\r\n"
				+ "op��es de arma no cap�tulo 5). Voc� � proficiente com ela \r\n"
				+ "enquanto a empunhar. Essa arma conta como sendo\r\n"
				+ "m�gica com os prop�sitos de ultrapassar resist�ncia e\r\n"
				+ "imunidade a ataques e danos n�o-m�gicos.\r\n"
				+ "Sua arma de pacto desaparece se ela estiver a mais de\r\n"
				+ "1,5 metro de voc� por 1 minuto ou mais. Ela tamb�m\r\n"
				+ "desaparece se voc� usar essa caracter�stica novamente, se\r\n"
				+ "voc� dissipar a arma (n�o requer a��o) ou se voc� morrer.\r\n"
				+ "Voc� pode transformar uma arma m�gica em sua\r\n"
				+ "arma de pacto ao realizar um ritual especial enquanto\r\n"
				+ "empunha a arma. Voc� precisa de 1 hora para concluir o\r\n"
				+ "ritual, que pode ser realizado durante um descanso curto.\r\n"
				+ "Voc� pode dissipar a arma, guardando-a em um espa�o\r\n"
				+ "extradimensional, e ela reaparece toda vez que voc� criar\r\n"
				+ "sua arma de pacto. A arma deixa de ser sua arma de\r\n"
				+ "pacto se voc� morrer, se voc� realizar um ritual de 1 hora\r\n"
				+ "com outra arma diferente ou se voc� realizar um ritual de\r\n"
				+ "1 hora para romper seu elo com ela. A arma aparece aos\r\n"
				+ "seus p�s se ela estiver no espa�o extradimensional\r\n"
				+ "quando o elo for quebrado.\r\n\n"
				+ "PACTO DO TOMO\r\n\n"
				+ "Seu patrono lhe deu um grim�rio chamado Livro das\r\n"
				+ "Sombras. Quando voc� adquire essa caracter�stica,\r\n"
				+ "escolha tr�s truques da lista de magias de qualquer\r\n"
				+ "classe. Enquanto o livro estiver com voc�, voc� poder�\r\n"
				+ "conjurar esses truques � vontade. Eles n�o contam no\r\n"
				+ "n�mero de truques que voc� conhece. Esses truques s�o\r\n"
				+ "considerados magias de bruxo para voc� e n�o precisam\r\n"
				+ "ser da mesma lista de magia.\r\n"
				+ "Se voc� perder seu Livro das Sombras, voc� pode\r\n"
				+ "realizar uma cerim�nia de 1 hora para receber um\r\n"
				+ "substituto do seu patrono. Essa cerim�nia pode ser\r\n"
				+ "realizada durante um descanso curto ou longo e destr�i o\r\n"
				+ "livro anterior. O livro se torna cinzas quando voc� morre\r\n\n");
	}
	
//Bruxo incremento no valor de habilidade
	public void bruxoIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16�\r\n"
				+ "e 19� n�vel, voc� pode aumentar um valor de habilidade, �\r\n"
				+ "sua escolha, em 2 ou voc� pode aumentar dois valores de\r\n"
				+ "habilidade, � sua escolha, em 1. Como padr�o, voc� n�o\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "caracter�stica.\r\n\n");
	}
	
//Bruxo feats nivel 11
	public void bruxoFeatsNivel11() {
		System.out.println("ARCANA M�STICA\r\n\n"
				+ "No 11� n�vel, seu patrono confere a voc� um segredo\r\n"
				+ "m�gico conhecido como arcana. Escolha uma magia de 6�\r\n"
				+ "n�vel da lista de magias de bruxo como sua arcana.\r\n"
				+ "Voc� pode conjurar essa magia arcana uma vez sem\r\n"
				+ "gastar um espa�o de magia. Voc� deve terminar um\r\n"
				+ "descanso longo antes de poder fazer isso novamente.\r\n"
				+ "Em n�vel altos, voc� adquire mais magias de bruxo de\r\n"
				+ "sua escolha que podem ser conjuradas dessa forma: uma\r\n"
				+ "magia de 7� n�vel no 13� n�vel, uma magia de 8� n�vel no\r\n"
				+ "15� n�vel e uma magia de 9� n�vel no 17� n�vel. Voc�\r\n"
				+ "recupera todos os usos de sua Arcana M�stica quando voc�\r\n"
				+ "termina um descanso longo.\r\n\n");
	}
	
//Bruxo feats nivel 20
	public void bruxoFeatsNivel20() {
		System.out.println("MESTRE M�STICO\r\n\n"
				+ "No 20� n�vel, voc� pode recarregar sua reserva interior de\r\n"
				+ "poder m�stico quando suplicar ao seu patrono para\r\n"
				+ "recuperar espa�os de magia gastos. Voc� pode gastar 1\r\n"
				+ "minuto suplicando pela ajuda do seu patrono para\r\n"
				+ "recuperar todos os espa�os de magia gastos da sua\r\n"
				+ "caracter�stica Magia de Pacto. Uma vez que voc�\r\n"
				+ "recuperou espa�os de magia com essa caracter�stica, voc�\r\n"
				+ "deve terminar um descanso longo antes de faz�-lo\r\n"
				+ "novamente.\r\n\n");
	}
	
//Bruxo patronos transcendentais
	public void bruxoPatronos() {
		System.out.println("Os seres que servem os bruxos como seus patronos s�o\r\n"
				+ "poderoso habitantes de outros planos de exist�ncia � n�o\r\n"
				+ "s�o deuses, mas tem poderes praticamente divinos. V�rios\r\n"
				+ "patronos concedem aos seus bruxos acesso a diferentes\r\n"
				+ "poderes e invoca��es, e esperam favores significativos em\r\n"
				+ "troca.\r\n"
				+ "Alguns patronos re�nem bruxos, distribuindo\r\n"
				+ "conhecimento m�stico praticamente de gra�a ou gabam-se\r\n"
				+ "de sua habilidade de controlar os mortais a sua vontade.\r\n"
				+ "Outros patronos concedem seus poderes apenas a\r\n"
				+ "contragosto e far�o um pacto apenas com um bruxo.\r\n"
				+ "Bruxos que servem o mesmo patrono devem ver um ao\r\n"
				+ "outro como aliados, irm�os ou rivais.\r\n\n");
	}
	
//Bruxo a arquifada
	public void bruxoAarquifada() {
		System.out.println("A ARQUIFADA\r\n\n"
				+ "Seu patrono � um senhor ou senhora das fadas, uma\r\n"
				+ "criatura lend�ria que det�m segredos que foram\r\n"
				+ "esquecidos antes das ra�as mortais nascerem. As\r\n"
				+ "motiva��es desses seres s�o, muitas vezes, inescrut�veis\r\n"
				+ "e, as vezes, exc�ntricas e podem envolver esfor�os para\r\n"
				+ "adquirir grandes poderes m�gicos ou resolu��o de\r\n"
				+ "desaven�as antigas. Incluem-se dentre esses seres o\r\n"
				+ "Pr�ncipe do Frio; a Rainha do Ar e Trevas, regente da\r\n"
				+ "Corte do Crep�sculo; Titania da Corte do Ver�o; seu\r\n"
				+ "c�njuge, Oberon, o Senhor Verdejante; Hyrsam, o\r\n"
				+ "Pr�ncipe dos Tolos; e bruxas antigas.\r\n\n"
				+ "LISTA DE MAGIA EXPANDIDA\r\n\n"
				+ "A Arquifada permite que voc� escolha magias de uma\r\n"
				+ "lista expandida quando voc� for aprender magias de\r\n"
				+ "bruxo. As seguintes magias s�o adicionadas a sua lista de\r\n"
				+ "magias de bruxo.\r\n\n"
				+ "MAGIAS EXPANDIDAS DA ARQUIFADA\r\n\n"
				+ "N�vel de Magia Magias\r\n"
				+ "1� fogo das fadas, sono\r\n"
				+ "2� acalmar emo��es, for�a fantasmag�rica\r\n"
				+ "3� piscar, ampliar plantas\r\n"
				+ "4� dominar besta, invisibilidade maior\r\n"
				+ "5� dominar pessoa, similaridade\r\n\n"
				+ "PRESEN�A FE�RICA\r\n\n"
				+ "A partir do 1� n�vel, seu patrono concede a voc� a\r\n"
				+ "habilidade de projetar a sedu��o e temeridade da\r\n"
				+ "presen�a da fada. Com uma a��o, voc� pode fazer com que\r\n"
				+ "cada criatura num cubo de 3 metros centrado em voc�,\r\n"
				+ "fa�a um teste de resist�ncia de Sabedoria com uma CD\r\n"
				+ "igual a de sua magia de bruxo. As criaturas que falharem\r\n"
				+ "no teste ficaram enfeiti�adas ou amedrontadas por voc� (�\r\n"
				+ "sua escolha) at� o in�cio do seu pr�ximo turno.\r\n"
				+ "Quando voc� usar essa caracter�stica, voc� n�o poder�\r\n"
				+ "utiliz�-la novamente antes de realizar um descanso curto\r\n"
				+ "ou longo.\r\n\n");
	}
	
//Bruxo patrono a arquifada nivel 6
	public void bruxoAarquifadaN6() {
		System.out.println("N�VOA DE FUGA\r\n\n"
				+ "A partir do 6� n�vel, voc� pode desaparecer em uma\r\n"
				+ "lufada de n�voa em resposta a alguma ofensa. Quando\r\n"
				+ "voc� sofrer dano, voc� pode usar sua rea��o para ficar\r\n"
				+ "invis�vel e se teletransportar a at� 18 metros para um\r\n"
				+ "espa�o desocupado que voc� possa ver. Voc� permanece\r\n"
				+ "invis�vel at� o in�cio do seu pr�ximo turno ou at� realizar\r\n"
				+ "um ataque ou conjurar uma magia.\r\n"
				+ "Ap�s usar essa caracter�sticas, voc� n�o poder�\r\n"
				+ "utiliz�-la novamente at� terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono a arquifada nivel 10
	public void bruxoAarquifadaN10() {
		System.out.println("DEFESA SEDUTORA\r\n\n"
				+ "A partir do 10� n�vel, seu patrono ensina voc� como voltar\r\n"
				+ "as magias de efeito mental dos seus inimigos contra eles.\r\n"
				+ "Voc� n�o pode ser enfeiti�ado e, quando outra criatura\r\n"
				+ "tenta enfeiti��-lo, voc� pode usar sua rea��o para tentar\r\n"
				+ "reverter o encanto de volta aquela criatura. A criatura\r\n"
				+ "deve ser bem sucedida num teste de resist�ncia de\r\n"
				+ "Sabedoria contra a CD da sua magia de bruxo ou ficara\r\n"
				+ "enfeiti�ado por 1 minuto ou at� a criatura sofrer dano.\r\n\n");
	}
	
//Bruxo patrono a arquifada nivel 14
	public void bruxoAarquifadaN14() {
		System.out.println("DEL�RIO SOMBRIO\r\n\n"
				+ "Come�ando no 14� n�vel, voc� pode imergir uma criatura\r\n"
				+ "num reino ilus�rio. Com um a��o, escolha uma criatura\r\n"
				+ "que voc� possa ver a at� 18 metros de voc�. Ela deve ser\r\n"
				+ "bem sucedida num teste de resist�ncia de Sabedoria\r\n"
				+ "contra a CD da sua magia de bruxo. Se ela falhar, ela\r\n"
				+ "ficar� enfeiti�ada ou amedrontada por voc� (� sua\r\n"
				+ "escolha) por 1 minuto ou at� voc� quebrar sua\r\n"
				+ "concentra��o (como se voc� estivesse se concentrando em\r\n"
				+ "uma magia). Esse efeito termina prematuramente se a\r\n"
				+ "criatura sofrer dano.\r\n"
				+ "At� que essa ilus�o termine, a criatura acredita que\r\n"
				+ "est� perdida num reino enevoado, a apar�ncia desse reino\r\n"
				+ "fica a seu crit�rio. A criatura s� pode ver e ouvir a si\r\n"
				+ "mesma, a voc� e a sua ilus�o.\r\n"
				+ "Voc� deve terminar um descanso curto ou longo antes\r\n"
				+ "de poder usar essa caracter�stica novamente.\r\n\n");
	}
	
//Bruxo patrono o corruptor
	public void bruxoOcorruptor() {
		System.out.println("O CORRUPTOR\r\n\n"
				+ "Voc� realizou um pacto com um corruptor dos planos de\r\n"
				+ "exist�ncia inferiores, um ser cujos objetivos s�o o mal,\r\n"
				+ "mesmo se voc� se opor a esses objetivos. Tais seres\r\n"
				+ "desejam corromper ou destruir todas as coisas, em �ltima\r\n"
				+ "an�lise, at� mesmo voc�. Corruptores poderosos o\r\n"
				+ "bastante para forjar pactos incluem lordes dem�nios como\r\n"
				+ "Demogorgon, Orcus, Fraz�Urb-luu e Bafom�; arquidiabos\r\n"
				+ "como Asmodeus, Dispater, Mefist�feles e Belial; senhores\r\n"
				+ "das profundezas e balors que sejam excepcionalmente\r\n"
				+ "poderosos; e ultraloths e outros senhores dos yugoloths.\r\n\n"
				+ "LISTA DE MAGIA EXPANDIDA\r\n"
				+ "O Corruptor permite que voc� escolha magias de uma\r\n"
				+ "lista expandida quando voc� for aprender magias de\r\n"
				+ "bruxo. As seguintes magias s�o adicionadas a sua lista de\r\n"
				+ "magias de bruxo.\r\n\n"
				+ "MAGIAS EXPANDIDAS DO CORRUPTOR\r\n\n"
				+ "N�vel de Magia Magias\r\n"
				+ "1� m�os flamejantes, comando\r\n"
				+ "2� cegueira/surdez, raio ardente\r\n"
				+ "3� bola de fogo, n�voa f�tida\r\n"
				+ "4� escudo de fogo, muralha de fogo\r\n"
				+ "5� coluna de chamas, consagrar\r\n\n"
				+ "B�N��O DO OBSCURO\r\n\n"
				+ "A partir do 1� n�vel, quando voc� reduzir uma criatura\r\n"
				+ "hostil a 0 pontos de vida, voc� ganha uma quantidade de\r\n"
				+ "pontos de vida tempor�rios igual ao seu modificador de\r\n"
				+ "Carisma + seu n�vel de bruxo (m�nimo 1).\r\n\n");
	}
	
//Bruxo patrono o corruptor nivel 6
	public void bruxoOcorruptorN6() {
		System.out.println("SORTE DO PR�PRIO OBSCURO\r\n\n"
				+ "A partir do 6� n�vel, voc� pode pedir ao seu patrono para\r\n"
				+ "alterar o destino em seu favor. Quando voc� realizar um\r\n"
				+ "teste de habilidade ou um teste de resist�ncia, voc� pode\r\n"
				+ "usar essa caracter�stica para adicionar 1d10 a sua jogada.\r\n"
				+ "Voc� pode fazer isso ap�s ver sua jogada inicial, mas\r\n"
				+ "antes que qualquer efeito da jogada ocorra.\r\n"
				+ "Ap�s usar essa caracter�sticas, voc� n�o poder�\r\n"
				+ "utiliz�-la novamente at� terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono o corruptor nivel 10
	public void bruxoOcorruptorN10() {
		System.out.println("RESIST�NCIA DEMON�ACA\r\n\n"
				+ "A partir do 10� n�vel, voc� pode escolher um tipo de dano\r\n"
				+ "quando voc� terminar um descanso curto ou longo. Voc�\r\n"
				+ "adquire resist�ncia contra esse tipo de dano at� voc�\r\n"
				+ "escolher um tipo de dano diferente com essa\r\n"
				+ "caracter�stica. Dano causado por armas m�gicas ou armas\r\n"
				+ "de prata ignoram essa resist�ncia.\r\n\n");
	}
	
//Bruxo patrono o corruptor nivel 14
	public void bruxoOcorruptorN14() {
		System.out.println("LAN�AR NO INFERNO\r\n\n"
				+ "A partir do 14� n�vel, quando voc� atingir uma criatura\r\n"
				+ "com um ataque, voc� pode usar essa caracter�stica para,\r\n"
				+ "instantaneamente, transportar o alvo para os planos\r\n"
				+ "inferiores. A criatura desaparece e � jogada para um\r\n"
				+ "lugar similar a um pesadelo.\r\n"
				+ "No final do seu turno, o alvo retorna ao lugar que ela\r\n"
				+ "ocupava anteriormente, ou para o espa�o desocupado\r\n"
				+ "mais pr�ximo. Se o alvo n�o for um corruptor, ele sofre\r\n"
				+ "10d10 de dano ps�quico � medida que toma conta da\r\n"
				+ "experi�ncia traum�tica.\r\n"
				+ "Ap�s usar essa caracter�sticas, voc� n�o poder�\r\n"
				+ "utiliz�-la novamente at� terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono o grande antigo
	public void bruxoOgrandeantigo() {
		System.out.println("O GRANDE ANTIGO\r\n\n"
				+ "Seu patrono � uma entidade misteriosa cuja natureza �\r\n"
				+ "profundamente alheia ao tecido da realidade. Ela deve ter\r\n"
				+ "vindo do Reino Distante, o espa�o al�m da realidade, ou\r\n"
				+ "ela pode ser um dos deuses anci�os conhecido apenas nas\r\n"
				+ "lendas. Seus motivos s�o incompreens�veis para os\r\n"
				+ "mortais e seu conhecimento � t�o imenso e antigo que, at�\r\n"
				+ "mesmo, as mais grandiosas bibliotecas desbotam em\r\n"
				+ "compara��o com os vastos segredos que ele det�m. O\r\n"
				+ "Grande Antigo pode desconhecer a sua exist�ncia ou ser\r\n"
				+ "totalmente indiferente a voc�, mas os segredos que voc�\r\n"
				+ "desvendou permitem que voc� obtenha suas magias dele.\r\n"
				+ "Entidades desse tipo incluem Ghaunadar, conhecido\r\n"
				+ "como Aquele que Espreita; Tharizdun, o Deus\r\n"
				+ "Acorrentado; Dendar, a Serpente da Noite; Zargon, o\r\n"
				+ "Retornado; Grande Cthulhu; entre outros seres\r\n"
				+ "insond�veis.\r\n\n"
				+ "LISTA DE MAGIA EXPANDIDA\r\n\n"
				+ "O Grande Antigo permite que voc� escolha magias de\r\n"
				+ "uma lista expandida quando voc� for aprender magias de\r\n"
				+ "bruxo. As seguintes magias s�o adicionadas a sua lista de\r\n"
				+ "magias de bruxo.\r\n\n"
				+ "MAGIAS EXPANDIDAS DO GRANDE ANTIGO\r\n\n"
				+ "N�vel de Magia Magias\r\n"
				+ "1� sussurros dissonantes, riso hist�rico de Tasha\r\n"
				+ "2� detectar pensamentos, for�a fantasmag�rica\r\n"
				+ "3� clarivid�ncia, enviar mensagem\r\n"
				+ "4� dominar besta, tent�culos negros de Evard\r\n"
				+ "5� dominar pessoa, telecin�sia\r\n\n"
				+ "DESPERTAR A MENTE\r\n\n"
				+ "A partir do 1� n�vel, seu conhecimento alien�gena concede\r\n"
				+ "a voc� a habilidade de tocar a mente de outras criaturas.\r\n"
				+ "Voc� pode se comunicar telepaticamente com qualquer\r\n"
				+ "criatura que voc� possa ver a at� 9 metros de voc�. Voc�\r\n"
				+ "n�o precisa partilhar um idioma com a criatura para\r\n"
				+ "compreender suas express�es telep�ticas, mas a criatura\r\n"
				+ "deve ser capaz de compreender pelo menos um idioma.\r\n\n");
	}
	
//Bruxo patrono o grande antigo nivel 6
	public void bruxoOgrandeantigoN6() {
		System.out.println("PROTE��O ENTR�PICA\r\n\n"
				+ "A partir do 6� n�vel, voc� aprende a se proteger\r\n"
				+ "magicamente contra ataques e a transformar os ataques\r\n"
				+ "mal sucedidos de seus inimigos em boa sorte pra voc�.\r\n"
				+ "Quando uma criatura realizar uma jogada de ataque\r\n"
				+ "contra voc�, voc� pode usar sua rea��o para impor\r\n"
				+ "desvantagem nesse jogada. Se o ataque errar voc�, sua\r\n"
				+ "pr�xima jogada de ataque contra essa criatura recebe\r\n"
				+ "vantagem se voc� o fizer antes do final do seu pr�ximo\r\n"
				+ "turno.\r\n"
				+ "Ap�s usar essa caracter�sticas, voc� n�o poder�\r\n"
				+ "utiliz�-la novamente at� terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono o grande antigo nivel 10
	public void bruxoOgrandeantigoN10() {
		System.out.println("ESCUDO DE PENSAMENTOS\r\n\n"
				+ "A partir do 10� n�vel, seus pensamentos n�o podem ser\r\n"
				+ "lidos atrav�s de telepatia ou outros meios, a n�o ser que\r\n"
				+ "voc� permita. Voc� tamb�m adquire resist�ncia a dano\r\n"
				+ "ps�quico e, toda vez que uma criatura causar dano\r\n"
				+ "ps�quico a voc�, essa criatura sofre a mesma quantidade\r\n"
				+ "de dano que voc� sofreu.\r\n\n");
	}
	
//Bruxo patrono o grande antigo nivel 14
	public void bruxoOgrandeantigoN14() {
		System.out.println("CRIAR LACAIO\r\n\n"
				+ "No 14� n�vel, voc� adquire a habilidade de infectar a\r\n"
				+ "mente de um humanoide com a magia alien�gena do seu\r\n"
				+ "patrono. Voc� pode usar sua a��o para tocar um\r\n"
				+ "humanoide incapacitado. Essa criatura ent�o, ficar�\r\n"
				+ "enfeiti�ada por voc� at� que a magia remover maldi��o\r\n"
				+ "seja conjurada sobre ela, a condi��o enfeiti�ado seja\r\n"
				+ "removida dela ou voc� use essa caracter�stica novamente.\r\n"
				+ "Voc� pode se comunicar telepaticamente com a\r\n"
				+ "criatura enfeiti�ada contanto que ambos estejam no\r\n"
				+ "mesmo plano de exist�ncia.\r\n\n");
	}

}
