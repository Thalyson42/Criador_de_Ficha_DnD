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
		String descricao ="Com um pseudodragão enrolado em seu ombro, um jovem\r\n"
				+ "elfo vestindo robes dourados sorri calorosamente, tecendo\r\n"
				+ "um charme mágico através de suas doces palavras e\r\n"
				+ "dobrando a sentinela do palácio como deseja.\r\n"
				+ "A medida que chamas ganham vida em suas mãos, um\r\n"
				+ "mirrado humanos sussurra o nome secreto do seu patrono\r\n"
				+ "demoníaco, infundindo sua magia com poder abissal.\r\n"
				+ "Olhando, ora para um tomo surrado, ora para o\r\n"
				+ "alinhamento incomum das estrelas acima, um tiefling de\r\n"
				+ "olhos selvagens profere o ritual místico que abrirá uma\r\n"
				+ "passagem para um mundo distante.\r\n"
				+ "Os bruxos são desbravadores do conhecimento que\r\n"
				+ "existe escondido no tecido do multiverso. Através de\r\n"
				+ "pactos feitos com seres misteriosos detentores de poder\r\n"
				+ "sobrenatural, os bruxos desbloqueiam efeitos mágicos tão\r\n"
				+ "sutis quanto espetaculares. Extraindo o conhecimento\r\n"
				+ "antigo de seres como nobres fadas, demônios, diabos,\r\n"
				+ "bruxas e entidades alienígenas do Reino Distante, os\r\n"
				+ "bruxos remontam segredos arcanos para aprimorar seus\r\n"
				+ "próprios poderes.\r\n\n";
		return descricao;
	}
	
	public String bruxoCaracteristicas() {
		String caracteristicas = "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por nível de bruxo\r\n"
				+ "Pontos de Vida no 1° Nível: 8 + seu modificador de Constituição.\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constituição por nível de bruxo após o 1°\r\n\n"
				+ "PROFICIÊNCIAS\r\n\n"
				+ "Armaduras: Armaduras leves\r\n"
				+ "Armas: Armas simples\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resistência: Sabedoria, Carisma\r\n"
				+ "Perícias: Escolha duas dentre Arcanismo, Enganação,\r\n"
				+ "História, Intimidação, Investigação, Natureza e\r\n"
				+ "Religião.\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
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
		List<String> pericias = Arrays.asList("Arcanismo", "Enganação", "História", "Intimidação", "Investigação", "Natureza", "Religião");
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
			System.out.println("Escolha uma das opções:\n1 - Bolsa de componentes\n2 - Foco arcano\n");
			
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
							+ "bolsa de couro à prova d'água que pode ser fixada em um\r\n"
							+ "cinto. Ela possui compartimentos para armazenar todos\r\n"
							+ "os componentes materiais e outros itens especiais que\r\n"
							+ "você precisa para lançar suas magias, exceto os\r\n"
							+ "componentes que possuem um custo específico (conforme\r\n"
							+ "indicado na descrição da magia).\n");
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
							+ "Um foco arcano é um item especial –\r\n"
							+ "um orbe, um cristal, um bastão, um cajado especialmente\r\n"
							+ "construído, uma varinha de madeira, ou algum item\r\n"
							+ "semelhante – projetado para canalizar o poder de magias\r\n"
							+ "arcanas. Um feiticeiro, bruxo ou mago podem usá-lo como\r\n"
							+ "um foco de conjuração, conforme descrito no capítulo 10.\n");
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
				System.out.println("Essa opção não existe!");
			break;
			}		
		}
	}

	public void equips3() {
		getEquips().setPacotes("Pacote de Estudioso", "Pacote de Explorador");
	}
	
	
//Bruxo feats padrão
	public void bruxoFeatsPadrao() {
		System.out.println("PATRONO TRANSCENDENTAL\r\n\n"
				+ "No 1° nível, você conclui uma barganha com um ser\r\n"
				+ "transcendental, à sua escolha: a Arquifada, o Corruptor\r\n"
				+ "ou o Grande Antigo, cada um deles é detalhado no final\r\n"
				+ "da descrição da classe. Sua escolha lhe confere traços no\r\n"
				+ "1° nível e novamente no6°, 10° e 14° nível.\r\n\n"
				+ "MAGIA DE PACTO\r\n\n"
				+ "Sua pesquisa arcana e a magia outorgada a você por seu\r\n"
				+ "patrono, lhe concedem uma gama de magias. Veja o\r\n"
				+ "capítulo 10 para as regras gerais de conjuração e o\r\n"
				+ "capítulo 11 para a lista de magias de bruxo.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Você conhece dois truques, à sua escolha, da lista de\r\n"
				+ "magias de bruxo. Você aprende truques de bruxo\r\n"
				+ "adicionais, à sua escolha, em níveis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Bruxo.\r\n\n"
				+ "ESPAÇOS DE MAGIA\r\n\n"
				+ "A tabela O Bruxo mostra quantos espaços de magia você\r\n"
				+ "possui. A tabela também mostra qual o nível desses\r\n"
				+ "espaços; todos os seus espaços de magia são do mesmo\r\n"
				+ "nível. Para conjurar uma magia de bruxo de 1° nível ou\r\n"
				+ "superior, você deve gastar uma espaço de magia. Você\r\n"
				+ "recobra todos os espaços de magia gastos quando você\r\n"
				+ "completa um descanso curto ou longo.\r\n"
				+ "Por exemplo, quando você atingir o 5° nível, você terá\r\n"
				+ "dois espaços de magia de 3° nível. Para conjurar a magia\r\n"
				+ "de 1° nível raio de bruxa, você deve gastar um desses\r\n"
				+ "espaços e você a conjura como uma magia de 3° nível.\r\n\n"
				+ "MAGIAS CONHECIDAS DE 1º NIVEL E SUPERIORES\r\n\n"
				+ "No 1° nível, você conhece duas magias de 1° nível, à sua\r\n"
				+ "escolha da lista de magias de bruxo.\r\n"
				+ "A coluna Magias Conhecidas na tabela O Bruxo\r\n"
				+ "mostra quando você aprende mais magias de bruxo, à sua\r\n"
				+ "escolha, de 1° nível ou superior. Cada uma dessas magias\r\n"
				+ "deve ser de um nível a que você tenha acesso, como\r\n"
				+ "mostrado na tabela na coluna de Nível de Magia para o\r\n"
				+ "seu nível. Quando você alcança o 6° nível, por exemplo,\r\n"
				+ "você aprende uma nova magia de bruxo, que pode ser de\r\n"
				+ "1°, 2° ou 3° nível.\r\n"
				+ "Além disso, quando você adquire um nível nessa\r\n"
				+ "classe, você pode escolher uma magia de bruxo que você\r\n"
				+ "conheça e substituí-la por outra magia da lista de magias\r\n"
				+ "de bruxo, que também deve ser de um nível ao qual você\r\n"
				+ "tenha espaços de magia.\r\n\n"
				+ "HABILIDADE DE CONJURAÇÃO\r\n\n"
				+ "Sua habilidade de conjuração é Carisma para suas\r\n"
				+ "magias de bruxo, portanto, você usa seu Carisma sempre\r\n"
				+ "que alguma magia se referir à sua habilidade de conjurar\r\n"
				+ "magias. Além disso, você usa o seu modificador de\r\n"
				+ "Carisma para definir a CD dos testes de resistência para\r\n"
				+ "as magias de bruxo que você conjura e quando você\r\n"
				+ "realiza uma jogada de ataque com uma magia.\r\n"
				+ "CD para suas magias = 8 + bônus de proficiência +\r\n"
				+ "seu modificador de Carisma\r\n"
				+ "Modificador de ataque de magia = seu bônus de proficiência +\r\n"
				+ "seu modificador de Carisma\r\n\n"
				+ "FOCO DE CONJURAÇÃO\r\n\n"
				+ "Você pode usar um foco arcano (encontrado no capítulo 5)\r\n"
				+ "como foco de conjuração das suas magias de bruxo.\r\n\n");
	}
	
//Bruxo feats nivel 2
	public void bruxoFeatsNivel2() {
		System.out.println("PACTO DA CORRENTE\r\n\n"
				+ "Você aprende a magia convocar familiar e pode conjurá-la\r\n"
				+ "como um ritual. Essa magia não conta no número de\r\n"
				+ "magias que você conhece.\r\n"
				+ "Quando você conjura essa magia, você pode escolher\r\n"
				+ "uma das formas convencionais para o seu familiar ou uma\r\n"
				+ "das seguintes formas especiais: diabrete, pseudodragão,\r\n"
				+ "quasit ou sprite.\r\n"
				+ "Além disso, quando você realiza a ação de Ataque, você\r\n"
				+ "pode renunciar s um dos seus ataques para permitir que\r\n"
				+ "seu familiar realize um ataque, com a reação dele.\r\n\n"
				+ "PACTO DA LÂMINA\r\n\n"
				+ "Você pode usar sua ação para criar uma arma de pacto\r\n"
				+ "em sua mão vazia. Você escolhe a forma que essa arma\r\n"
				+ "corpo-a-corpo tem a cada vez que você a cria (veja as\r\n"
				+ "opções de arma no capítulo 5). Você é proficiente com ela \r\n"
				+ "enquanto a empunhar. Essa arma conta como sendo\r\n"
				+ "mágica com os propósitos de ultrapassar resistência e\r\n"
				+ "imunidade a ataques e danos não-mágicos.\r\n"
				+ "Sua arma de pacto desaparece se ela estiver a mais de\r\n"
				+ "1,5 metro de você por 1 minuto ou mais. Ela também\r\n"
				+ "desaparece se você usar essa característica novamente, se\r\n"
				+ "você dissipar a arma (não requer ação) ou se você morrer.\r\n"
				+ "Você pode transformar uma arma mágica em sua\r\n"
				+ "arma de pacto ao realizar um ritual especial enquanto\r\n"
				+ "empunha a arma. Você precisa de 1 hora para concluir o\r\n"
				+ "ritual, que pode ser realizado durante um descanso curto.\r\n"
				+ "Você pode dissipar a arma, guardando-a em um espaço\r\n"
				+ "extradimensional, e ela reaparece toda vez que você criar\r\n"
				+ "sua arma de pacto. A arma deixa de ser sua arma de\r\n"
				+ "pacto se você morrer, se você realizar um ritual de 1 hora\r\n"
				+ "com outra arma diferente ou se você realizar um ritual de\r\n"
				+ "1 hora para romper seu elo com ela. A arma aparece aos\r\n"
				+ "seus pés se ela estiver no espaço extradimensional\r\n"
				+ "quando o elo for quebrado.\r\n\n"
				+ "PACTO DO TOMO\r\n\n"
				+ "Seu patrono lhe deu um grimório chamado Livro das\r\n"
				+ "Sombras. Quando você adquire essa característica,\r\n"
				+ "escolha três truques da lista de magias de qualquer\r\n"
				+ "classe. Enquanto o livro estiver com você, você poderá\r\n"
				+ "conjurar esses truques à vontade. Eles não contam no\r\n"
				+ "número de truques que você conhece. Esses truques são\r\n"
				+ "considerados magias de bruxo para você e não precisam\r\n"
				+ "ser da mesma lista de magia.\r\n"
				+ "Se você perder seu Livro das Sombras, você pode\r\n"
				+ "realizar uma cerimônia de 1 hora para receber um\r\n"
				+ "substituto do seu patrono. Essa cerimônia pode ser\r\n"
				+ "realizada durante um descanso curto ou longo e destrói o\r\n"
				+ "livro anterior. O livro se torna cinzas quando você morre\r\n\n");
	}
	
//Bruxo incremento no valor de habilidade
	public void bruxoIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando você atinge o 4° nível e novamente no 8°, 12°, 16°\r\n"
				+ "e 19° nível, você pode aumentar um valor de habilidade, à\r\n"
				+ "sua escolha, em 2 ou você pode aumentar dois valores de\r\n"
				+ "habilidade, à sua escolha, em 1. Como padrão, você não\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "característica.\r\n\n");
	}
	
//Bruxo feats nivel 11
	public void bruxoFeatsNivel11() {
		System.out.println("ARCANA MÍSTICA\r\n\n"
				+ "No 11° nível, seu patrono confere a você um segredo\r\n"
				+ "mágico conhecido como arcana. Escolha uma magia de 6°\r\n"
				+ "nível da lista de magias de bruxo como sua arcana.\r\n"
				+ "Você pode conjurar essa magia arcana uma vez sem\r\n"
				+ "gastar um espaço de magia. Você deve terminar um\r\n"
				+ "descanso longo antes de poder fazer isso novamente.\r\n"
				+ "Em nível altos, você adquire mais magias de bruxo de\r\n"
				+ "sua escolha que podem ser conjuradas dessa forma: uma\r\n"
				+ "magia de 7° nível no 13° nível, uma magia de 8° nível no\r\n"
				+ "15° nível e uma magia de 9° nível no 17° nível. Você\r\n"
				+ "recupera todos os usos de sua Arcana Mística quando você\r\n"
				+ "termina um descanso longo.\r\n\n");
	}
	
//Bruxo feats nivel 20
	public void bruxoFeatsNivel20() {
		System.out.println("MESTRE MÍSTICO\r\n\n"
				+ "No 20° nível, você pode recarregar sua reserva interior de\r\n"
				+ "poder místico quando suplicar ao seu patrono para\r\n"
				+ "recuperar espaços de magia gastos. Você pode gastar 1\r\n"
				+ "minuto suplicando pela ajuda do seu patrono para\r\n"
				+ "recuperar todos os espaços de magia gastos da sua\r\n"
				+ "característica Magia de Pacto. Uma vez que você\r\n"
				+ "recuperou espaços de magia com essa característica, você\r\n"
				+ "deve terminar um descanso longo antes de fazê-lo\r\n"
				+ "novamente.\r\n\n");
	}
	
//Bruxo patronos transcendentais
	public void bruxoPatronos() {
		System.out.println("Os seres que servem os bruxos como seus patronos são\r\n"
				+ "poderoso habitantes de outros planos de existência – não\r\n"
				+ "são deuses, mas tem poderes praticamente divinos. Vários\r\n"
				+ "patronos concedem aos seus bruxos acesso a diferentes\r\n"
				+ "poderes e invocações, e esperam favores significativos em\r\n"
				+ "troca.\r\n"
				+ "Alguns patronos reúnem bruxos, distribuindo\r\n"
				+ "conhecimento místico praticamente de graça ou gabam-se\r\n"
				+ "de sua habilidade de controlar os mortais a sua vontade.\r\n"
				+ "Outros patronos concedem seus poderes apenas a\r\n"
				+ "contragosto e farão um pacto apenas com um bruxo.\r\n"
				+ "Bruxos que servem o mesmo patrono devem ver um ao\r\n"
				+ "outro como aliados, irmãos ou rivais.\r\n\n");
	}
	
//Bruxo a arquifada
	public void bruxoAarquifada() {
		System.out.println("A ARQUIFADA\r\n\n"
				+ "Seu patrono é um senhor ou senhora das fadas, uma\r\n"
				+ "criatura lendária que detém segredos que foram\r\n"
				+ "esquecidos antes das raças mortais nascerem. As\r\n"
				+ "motivações desses seres são, muitas vezes, inescrutáveis\r\n"
				+ "e, as vezes, excêntricas e podem envolver esforços para\r\n"
				+ "adquirir grandes poderes mágicos ou resolução de\r\n"
				+ "desavenças antigas. Incluem-se dentre esses seres o\r\n"
				+ "Príncipe do Frio; a Rainha do Ar e Trevas, regente da\r\n"
				+ "Corte do Crepúsculo; Titania da Corte do Verão; seu\r\n"
				+ "cônjuge, Oberon, o Senhor Verdejante; Hyrsam, o\r\n"
				+ "Príncipe dos Tolos; e bruxas antigas.\r\n\n"
				+ "LISTA DE MAGIA EXPANDIDA\r\n\n"
				+ "A Arquifada permite que você escolha magias de uma\r\n"
				+ "lista expandida quando você for aprender magias de\r\n"
				+ "bruxo. As seguintes magias são adicionadas a sua lista de\r\n"
				+ "magias de bruxo.\r\n\n"
				+ "MAGIAS EXPANDIDAS DA ARQUIFADA\r\n\n"
				+ "Nível de Magia Magias\r\n"
				+ "1° fogo das fadas, sono\r\n"
				+ "2° acalmar emoções, força fantasmagórica\r\n"
				+ "3° piscar, ampliar plantas\r\n"
				+ "4° dominar besta, invisibilidade maior\r\n"
				+ "5° dominar pessoa, similaridade\r\n\n"
				+ "PRESENÇA FEÉRICA\r\n\n"
				+ "A partir do 1° nível, seu patrono concede a você a\r\n"
				+ "habilidade de projetar a sedução e temeridade da\r\n"
				+ "presença da fada. Com uma ação, você pode fazer com que\r\n"
				+ "cada criatura num cubo de 3 metros centrado em você,\r\n"
				+ "faça um teste de resistência de Sabedoria com uma CD\r\n"
				+ "igual a de sua magia de bruxo. As criaturas que falharem\r\n"
				+ "no teste ficaram enfeitiçadas ou amedrontadas por você (à\r\n"
				+ "sua escolha) até o início do seu próximo turno.\r\n"
				+ "Quando você usar essa característica, você não poderá\r\n"
				+ "utilizá-la novamente antes de realizar um descanso curto\r\n"
				+ "ou longo.\r\n\n");
	}
	
//Bruxo patrono a arquifada nivel 6
	public void bruxoAarquifadaN6() {
		System.out.println("NÉVOA DE FUGA\r\n\n"
				+ "A partir do 6° nível, você pode desaparecer em uma\r\n"
				+ "lufada de névoa em resposta a alguma ofensa. Quando\r\n"
				+ "você sofrer dano, você pode usar sua reação para ficar\r\n"
				+ "invisível e se teletransportar a até 18 metros para um\r\n"
				+ "espaço desocupado que você possa ver. Você permanece\r\n"
				+ "invisível até o início do seu próximo turno ou até realizar\r\n"
				+ "um ataque ou conjurar uma magia.\r\n"
				+ "Após usar essa características, você não poderá\r\n"
				+ "utilizá-la novamente até terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono a arquifada nivel 10
	public void bruxoAarquifadaN10() {
		System.out.println("DEFESA SEDUTORA\r\n\n"
				+ "A partir do 10° nível, seu patrono ensina você como voltar\r\n"
				+ "as magias de efeito mental dos seus inimigos contra eles.\r\n"
				+ "Você não pode ser enfeitiçado e, quando outra criatura\r\n"
				+ "tenta enfeitiçá-lo, você pode usar sua reação para tentar\r\n"
				+ "reverter o encanto de volta aquela criatura. A criatura\r\n"
				+ "deve ser bem sucedida num teste de resistência de\r\n"
				+ "Sabedoria contra a CD da sua magia de bruxo ou ficara\r\n"
				+ "enfeitiçado por 1 minuto ou até a criatura sofrer dano.\r\n\n");
	}
	
//Bruxo patrono a arquifada nivel 14
	public void bruxoAarquifadaN14() {
		System.out.println("DELÍRIO SOMBRIO\r\n\n"
				+ "Começando no 14° nível, você pode imergir uma criatura\r\n"
				+ "num reino ilusório. Com um ação, escolha uma criatura\r\n"
				+ "que você possa ver a até 18 metros de você. Ela deve ser\r\n"
				+ "bem sucedida num teste de resistência de Sabedoria\r\n"
				+ "contra a CD da sua magia de bruxo. Se ela falhar, ela\r\n"
				+ "ficará enfeitiçada ou amedrontada por você (à sua\r\n"
				+ "escolha) por 1 minuto ou até você quebrar sua\r\n"
				+ "concentração (como se você estivesse se concentrando em\r\n"
				+ "uma magia). Esse efeito termina prematuramente se a\r\n"
				+ "criatura sofrer dano.\r\n"
				+ "Até que essa ilusão termine, a criatura acredita que\r\n"
				+ "está perdida num reino enevoado, a aparência desse reino\r\n"
				+ "fica a seu critério. A criatura só pode ver e ouvir a si\r\n"
				+ "mesma, a você e a sua ilusão.\r\n"
				+ "Você deve terminar um descanso curto ou longo antes\r\n"
				+ "de poder usar essa característica novamente.\r\n\n");
	}
	
//Bruxo patrono o corruptor
	public void bruxoOcorruptor() {
		System.out.println("O CORRUPTOR\r\n\n"
				+ "Você realizou um pacto com um corruptor dos planos de\r\n"
				+ "existência inferiores, um ser cujos objetivos são o mal,\r\n"
				+ "mesmo se você se opor a esses objetivos. Tais seres\r\n"
				+ "desejam corromper ou destruir todas as coisas, em última\r\n"
				+ "análise, até mesmo você. Corruptores poderosos o\r\n"
				+ "bastante para forjar pactos incluem lordes demônios como\r\n"
				+ "Demogorgon, Orcus, Fraz’Urb-luu e Bafomé; arquidiabos\r\n"
				+ "como Asmodeus, Dispater, Mefistófeles e Belial; senhores\r\n"
				+ "das profundezas e balors que sejam excepcionalmente\r\n"
				+ "poderosos; e ultraloths e outros senhores dos yugoloths.\r\n\n"
				+ "LISTA DE MAGIA EXPANDIDA\r\n"
				+ "O Corruptor permite que você escolha magias de uma\r\n"
				+ "lista expandida quando você for aprender magias de\r\n"
				+ "bruxo. As seguintes magias são adicionadas a sua lista de\r\n"
				+ "magias de bruxo.\r\n\n"
				+ "MAGIAS EXPANDIDAS DO CORRUPTOR\r\n\n"
				+ "Nível de Magia Magias\r\n"
				+ "1° mãos flamejantes, comando\r\n"
				+ "2° cegueira/surdez, raio ardente\r\n"
				+ "3° bola de fogo, névoa fétida\r\n"
				+ "4° escudo de fogo, muralha de fogo\r\n"
				+ "5° coluna de chamas, consagrar\r\n\n"
				+ "BÊNÇÃO DO OBSCURO\r\n\n"
				+ "A partir do 1° nível, quando você reduzir uma criatura\r\n"
				+ "hostil a 0 pontos de vida, você ganha uma quantidade de\r\n"
				+ "pontos de vida temporários igual ao seu modificador de\r\n"
				+ "Carisma + seu nível de bruxo (mínimo 1).\r\n\n");
	}
	
//Bruxo patrono o corruptor nivel 6
	public void bruxoOcorruptorN6() {
		System.out.println("SORTE DO PRÓPRIO OBSCURO\r\n\n"
				+ "A partir do 6° nível, você pode pedir ao seu patrono para\r\n"
				+ "alterar o destino em seu favor. Quando você realizar um\r\n"
				+ "teste de habilidade ou um teste de resistência, você pode\r\n"
				+ "usar essa característica para adicionar 1d10 a sua jogada.\r\n"
				+ "Você pode fazer isso após ver sua jogada inicial, mas\r\n"
				+ "antes que qualquer efeito da jogada ocorra.\r\n"
				+ "Após usar essa características, você não poderá\r\n"
				+ "utilizá-la novamente até terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono o corruptor nivel 10
	public void bruxoOcorruptorN10() {
		System.out.println("RESISTÊNCIA DEMONÍACA\r\n\n"
				+ "A partir do 10° nível, você pode escolher um tipo de dano\r\n"
				+ "quando você terminar um descanso curto ou longo. Você\r\n"
				+ "adquire resistência contra esse tipo de dano até você\r\n"
				+ "escolher um tipo de dano diferente com essa\r\n"
				+ "característica. Dano causado por armas mágicas ou armas\r\n"
				+ "de prata ignoram essa resistência.\r\n\n");
	}
	
//Bruxo patrono o corruptor nivel 14
	public void bruxoOcorruptorN14() {
		System.out.println("LANÇAR NO INFERNO\r\n\n"
				+ "A partir do 14° nível, quando você atingir uma criatura\r\n"
				+ "com um ataque, você pode usar essa característica para,\r\n"
				+ "instantaneamente, transportar o alvo para os planos\r\n"
				+ "inferiores. A criatura desaparece e é jogada para um\r\n"
				+ "lugar similar a um pesadelo.\r\n"
				+ "No final do seu turno, o alvo retorna ao lugar que ela\r\n"
				+ "ocupava anteriormente, ou para o espaço desocupado\r\n"
				+ "mais próximo. Se o alvo não for um corruptor, ele sofre\r\n"
				+ "10d10 de dano psíquico à medida que toma conta da\r\n"
				+ "experiência traumática.\r\n"
				+ "Após usar essa características, você não poderá\r\n"
				+ "utilizá-la novamente até terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono o grande antigo
	public void bruxoOgrandeantigo() {
		System.out.println("O GRANDE ANTIGO\r\n\n"
				+ "Seu patrono é uma entidade misteriosa cuja natureza é\r\n"
				+ "profundamente alheia ao tecido da realidade. Ela deve ter\r\n"
				+ "vindo do Reino Distante, o espaço além da realidade, ou\r\n"
				+ "ela pode ser um dos deuses anciãos conhecido apenas nas\r\n"
				+ "lendas. Seus motivos são incompreensíveis para os\r\n"
				+ "mortais e seu conhecimento é tão imenso e antigo que, até\r\n"
				+ "mesmo, as mais grandiosas bibliotecas desbotam em\r\n"
				+ "comparação com os vastos segredos que ele detém. O\r\n"
				+ "Grande Antigo pode desconhecer a sua existência ou ser\r\n"
				+ "totalmente indiferente a você, mas os segredos que você\r\n"
				+ "desvendou permitem que você obtenha suas magias dele.\r\n"
				+ "Entidades desse tipo incluem Ghaunadar, conhecido\r\n"
				+ "como Aquele que Espreita; Tharizdun, o Deus\r\n"
				+ "Acorrentado; Dendar, a Serpente da Noite; Zargon, o\r\n"
				+ "Retornado; Grande Cthulhu; entre outros seres\r\n"
				+ "insondáveis.\r\n\n"
				+ "LISTA DE MAGIA EXPANDIDA\r\n\n"
				+ "O Grande Antigo permite que você escolha magias de\r\n"
				+ "uma lista expandida quando você for aprender magias de\r\n"
				+ "bruxo. As seguintes magias são adicionadas a sua lista de\r\n"
				+ "magias de bruxo.\r\n\n"
				+ "MAGIAS EXPANDIDAS DO GRANDE ANTIGO\r\n\n"
				+ "Nível de Magia Magias\r\n"
				+ "1° sussurros dissonantes, riso histérico de Tasha\r\n"
				+ "2° detectar pensamentos, força fantasmagórica\r\n"
				+ "3° clarividência, enviar mensagem\r\n"
				+ "4° dominar besta, tentáculos negros de Evard\r\n"
				+ "5° dominar pessoa, telecinésia\r\n\n"
				+ "DESPERTAR A MENTE\r\n\n"
				+ "A partir do 1° nível, seu conhecimento alienígena concede\r\n"
				+ "a você a habilidade de tocar a mente de outras criaturas.\r\n"
				+ "Você pode se comunicar telepaticamente com qualquer\r\n"
				+ "criatura que você possa ver a até 9 metros de você. Você\r\n"
				+ "não precisa partilhar um idioma com a criatura para\r\n"
				+ "compreender suas expressões telepáticas, mas a criatura\r\n"
				+ "deve ser capaz de compreender pelo menos um idioma.\r\n\n");
	}
	
//Bruxo patrono o grande antigo nivel 6
	public void bruxoOgrandeantigoN6() {
		System.out.println("PROTEÇÃO ENTRÓPICA\r\n\n"
				+ "A partir do 6° nível, você aprende a se proteger\r\n"
				+ "magicamente contra ataques e a transformar os ataques\r\n"
				+ "mal sucedidos de seus inimigos em boa sorte pra você.\r\n"
				+ "Quando uma criatura realizar uma jogada de ataque\r\n"
				+ "contra você, você pode usar sua reação para impor\r\n"
				+ "desvantagem nesse jogada. Se o ataque errar você, sua\r\n"
				+ "próxima jogada de ataque contra essa criatura recebe\r\n"
				+ "vantagem se você o fizer antes do final do seu próximo\r\n"
				+ "turno.\r\n"
				+ "Após usar essa características, você não poderá\r\n"
				+ "utilizá-la novamente até terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n");
	}
	
//Bruxo patrono o grande antigo nivel 10
	public void bruxoOgrandeantigoN10() {
		System.out.println("ESCUDO DE PENSAMENTOS\r\n\n"
				+ "A partir do 10° nível, seus pensamentos não podem ser\r\n"
				+ "lidos através de telepatia ou outros meios, a não ser que\r\n"
				+ "você permita. Você também adquire resistência a dano\r\n"
				+ "psíquico e, toda vez que uma criatura causar dano\r\n"
				+ "psíquico a você, essa criatura sofre a mesma quantidade\r\n"
				+ "de dano que você sofreu.\r\n\n");
	}
	
//Bruxo patrono o grande antigo nivel 14
	public void bruxoOgrandeantigoN14() {
		System.out.println("CRIAR LACAIO\r\n\n"
				+ "No 14° nível, você adquire a habilidade de infectar a\r\n"
				+ "mente de um humanoide com a magia alienígena do seu\r\n"
				+ "patrono. Você pode usar sua ação para tocar um\r\n"
				+ "humanoide incapacitado. Essa criatura então, ficará\r\n"
				+ "enfeitiçada por você até que a magia remover maldição\r\n"
				+ "seja conjurada sobre ela, a condição enfeitiçado seja\r\n"
				+ "removida dela ou você use essa característica novamente.\r\n"
				+ "Você pode se comunicar telepaticamente com a\r\n"
				+ "criatura enfeitiçada contanto que ambos estejam no\r\n"
				+ "mesmo plano de existência.\r\n\n");
	}

}
