package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bardo extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Bardo";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
	public String bardoDescricao() {
		String descricao = "Cantarolando enquanto entrela�a os seus dedos\r\n"
				+ "em volta de um monumento antigo em uma ruina\r\n"
				+ "a muito esquecida, uma meio\r\n"
				+ "-elfa vestida em couros\r\n"
				+ "gastos encontra o conhecimento que brota de sua\r\n"
				+ "mente, conjurado atrav�s da magia de sua m�sica\r\n"
				+ "�\r\n"
				+ "conhecimento do povo que construiu o monumento\r\n"
				+ "e a saga m�stica � descrita.\r\n"
				+ "Um austero guerreiro humano bate sua espada\r\n"
				+ "ritmicamente contra sua brunea, ditando o andamento\r\n"
				+ "do seu canto de guerra e exortando bravura e hero�smo\r\n"
				+ "em seus companheiros. A magia da sua can��o os\r\n"
				+ "fortalece e encoraja.\r\n"
				+ "Gargalhando enquanto entoa sua citara, uma\r\n"
				+ "gnoma tece sua sutil magia sobre os nobres reunidos,\r\n"
				+ "garantindo que as palavras dos seus companheiros\r\n"
				+ "ser�o bem recebidas.\r\n"
				+ "N�o importa se um escolar, escaldo ou malandro,\r\n"
				+ "o bardo tece sua magia atrav�s de palavras e\r\n"
				+ "m�sica para inspirar aliados, desmoralizar\r\n"
				+ "oponentes, manipular mentes, criar ilus�es e,\r\n"
				+ "at� mesmo, curar ferimentos.\r\n";
		return descricao;
	}
	
	public String bardoCaracteristicas() {
		String caracteristicas = "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por n�vel de bardo\r\n"
				+ "Pontos de Vida no 1� N�vel: 8 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constitui��o por n�vel de bardo ap�s o 1�\r\n\n"
				+ "PROFICI�NCIAS\r\n\n"
				+ "Armaduras: Armaduras leves\r\n"
				+ "Armas: Armas simples, bestas de m�o, espadas longas,\r\n"
				+ "rapieiras, espadas curtas\r\n"
				+ "Ferramentas: Tr�s instrumentos musicais, � sua escolha\r\n"
				+ "Testes de Resist�ncia: Destreza, Carisma\r\n"
				+ "Per�cias: Escolha tr�s quaisquer\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma rapieira, (b) uma espada longa ou (c) qualquer\r\n"
				+ "arma simples\r\n"
				+ "- (a) um pacote de diplomata ou (b) um pacote de artista\r\n"
				+ "- (a) um lute ou (b) qualquer outro instrumento musical\r\n"
				+ "- Armadura de couro e uma adaga\r\n\n";
		return caracteristicas;
	}
	
	public void setBardo() {
		getFicha().setClasse("Bardo");
		getFicha().setBonus_proficiencia(2);
//		this.proficiencia.setFicha(ficha);
		List<String> proficiencia_equips = Arrays.asList("Armaduras leves", "Armas simples", "Bestas de m�o", "Espadas longas", "Rapieiras", "Espadas curtas");
		getProficiencia().SetProfEquips(proficiencia_equips);
		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical(3));
		List<String> proficiencia_resistencia = Arrays.asList("Destreza", "Carisma");
		getProficiencia().SetResistencia(proficiencia_resistencia);
		getProficiencia().setPericias(3);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
//		this.magias.setFicha(ficha);
		getMagias().truquesBardo();
		getMagias().setMagiasBardoLV1();
//		this.ficha = this.magias.getFicha();
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
	
	public int CDMagia(int proficiencia, int ModCarisma) {
		return 8+proficiencia+ModCarisma;
	}
	
	public int ModificadorAtaqueMagia(int proficiencia, int ModCarisma) {
		return proficiencia+ModCarisma;
	}
	
	public void equips1() {
		Scanner entrada = new Scanner(System.in);
		boolean equip1Loop = false;
		while(equip1Loop == false) {
			int equip1Menu;
			System.out.println("Escolha entre (1) um rapieira ou (2) uma espada longa ou (3) qualquer arma simples.");
			
			equip1Menu = entrada.nextInt();
			switch(equip1Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("Tem certeza que deseja escolher Rapieira? (Y/N)");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						for(int i = 0; i < getEquips().getArmas_marciais_CAC().size(); i++) {
							if(Objects.equals(new String("Rapieira"), getEquips().getArmas_marciais_CAC().get(i))) {
								getFicha().setEquipamentos(getEquips().getArmas_marciais_CAC().get(i));
							}
						}
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
					System.out.println("Tem certeza que deseja escolher Espada longa? (Y/N)");
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						for(int i = 0; i < getEquips().getArmas_marciais_CAC().size(); i++) {
							if(Objects.equals(new String("Espada Longa"), getEquips().getArmas_marciais_CAC().get(i))) {
								getFicha().setEquipamentos(getEquips().getArmas_marciais_CAC().get(i));
							}
						}
						decisao2Loop = true;
						equip1Loop = true;
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
					
				}
				
			break;
			
			case 3:
				getFicha().setEquipamentos(getEquips().setArmasSimples());
			break;
			}
		}
	}
	
	public void equips2() {
		getEquips().setPacotes("Pacote de Diplomata", "Pacote de Artista");
	}
	
	public void equips3() {
		Scanner entrada = new Scanner(System.in);
		boolean equips3Loop = true;
		int equips3Menu;
		while(equips3Loop == false) {
			
			System.out.println("Escolha entre essas op��es\n(1) um lute ou (2) qualquer outro instrumento musical:");
			
			while(!entrada.hasNextInt()) {
				System.out.println("Digite um numero!");
				entrada.next();
			}
			
			equips3Menu = entrada.nextInt();
			switch(equips3Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.printf("Tem certeza que deseja escolher um lute? (Y/N)\n");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						getFicha().setEquipamentos("Lute");
						decisaoLoop = true;
						equips3Loop = true;
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
				}
				
			break;
			
			case 2:
				getFicha().setEquipamentos(getEquips().setInstrumentoMusical(1));
			break;
			
			default:
				System.out.println("Essa op��o n�o existe!");
			break;
			}
		}
	}
//Bardo feats padrao
	public void bardoFeatsPadrao() {
		System.out.println("CONJURA��O\r\n\n"
				+ "Voc� aprendeu a desembara�ar e remodelar o decido da\r\n"
				+ "realidade em harmonia com os seus desejos e m�sica.\r\n"
				+ "Suas magias s�o parte do seu vasto repert�rio, magia que\r\n"
				+ "voc� pode entoar em diferentes situa��es. Veja o cap�tulo\r\n"
				+ "10 para as regras gerais de conjura��o e o cap�tulo 11\r\n"
				+ "para a lista de magias de bardo.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Voc� conhece dois truques, � sua escolha da lista de\r\n"
				+ "magias de bardo. Voc� aprende truques de bardo\r\n"
				+ "adicionais, � sua escolha em n�veis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Bardo.\r\n\n\n"
				+ "ESPA�OS DE MAGIA\r\n\n"
				+ "A tabela O Bardo mostra quantos espa�os de magia de 1�\r\n"
				+ "n�vel e superiores voc� possui dispon�veis para\r\n"
				+ "conjura��o. Para conjurar uma dessas magias, voc� deve\r\n"
				+ "gastar uma espa�o de magia do n�vel da magia ou\r\n"
				+ "superior. Voc� recobra todos os espa�os de magia gastos\r\n"
				+ "quando voc� completa um descanso longo.\r\n"
				+ "Por exemplo, se voc� quiser conjurar a magia de 1�\r\n"
				+ "n�vel curar ferimentos e voc� tiver um espa�o de magia de\r\n"
				+ "1� n�vel e um de 2� n�vel dispon�veis, voc� poder� conjurar\r\n"
				+ "curar ferimentos usando qualquer dos dois espa�os.\r\n\n"
				+ "MAGIAS CONHECIDAS DE 1� N�VEL E SUPERIORES\r\n\n"
				+ "Voc� conhece quatro magias de 1� n�vel, � sua escolha, da\r\n"
				+ "lista de magias de bardo.\r\n"
				+ "A coluna Magias Conhecidas na tabela O Bardo\r\n"
				+ "mostra quando voc� aprende mais magias de bardo, � sua\r\n"
				+ "escolha. Cada uma dessas magias deve ser de um n�vel a\r\n"
				+ "que voc� tenha acesso, como mostrado na tabela. Por\r\n"
				+ "exemplo, quando voc� alcan�a o 3� n�vel da classe, voc�\r\n"
				+ "pode aprender uma nova magia de 1� ou 2� n�vel.\r\n"
				+ "Al�m disso, quando voc� adquire um n�vel nessa\r\n"
				+ "classe, voc� pode escolher uma magia de bardo que voc�\r\n"
				+ "conhe�a e substitu�-la por outra magia da lista de magias\r\n"
				+ "de bardo, que tamb�m deve ser de um n�vel ao qual voc�\r\n"
				+ "tenha espa�os de magia.\r\n\n"
				+ "HABILIDADE DE CONJURA��O\r\n\n"
				+ "Sua habilidade de conjura��o � Carisma para suas\r\n"
				+ "magias de bardo, portanto, voc� usa seu Carisma sempre\r\n"
				+ "que alguma magia se referir � sua habilidade de conjurar\r\n"
				+ "magias. Al�m disso, voc� usa o seu modificador de\r\n"
				+ "Carisma para definir a CD dos testes de resist�ncia para\r\n\n"
				+ "as magias de bardo que voc� conjura e quando voc�\r\n"
				+ "realiza uma jogada de ataque com uma magia.\r\n"
				+ "CD para suas magias = 8 + b�nus de profici�ncia +\r\n"
				+ "seu modificador de Carisma\r\n"
				+ "Modificador de ataque de magia = seu b�nus de profici�ncia +\r\n"
				+ "seu modificador de Carisma\r\n\n"
				+ "CONJURA��O DE RITUAL\r\n\n"
				+ "Voc� pode conjurar qualquer magia de bardo que voc�\r\n"
				+ "conhe�a como um ritual se ela possuir o descritor ritual.\r\n\n"
				+ "FOCO DE CONJURA��O\r\n\n"
				+ "Voc� pode usar um instrumento musical (encontrado no\r\n"
				+ "cap�tulo 5) como foco de conjura��o das suas magias de\r\n"
				+ "bardo.\r\n\n"
				+ "INSPIRA��O DE BARDO\r\n\n"
				+ "Voc� pode inspirar os outros atrav�s de palavras\r\n"
				+ "animadoras ou m�sica. Para tanto, voc� usa uma a��o\r\n"
				+ "b�nus no seu turno para escolher uma outra criatura, que\r\n"
				+ "n�o seja voc� mesmo, a at� 18 metros de voc� que possa\r\n"
				+ "ouvi-lo. Essa criatura ganha um dado de Inspira��o de\r\n"
				+ "Bardo, um d6.\r\n"
				+ "Uma vez, nos pr�ximos 10 minutos, a criatura poder�\r\n"
				+ "rolar o dado e adicionar o valor rolado a um teste de\r\n"
				+ "habilidade, jogada de ataque ou teste de resist�ncia que\r\n"
				+ "ela fizer. A criatura pode esperar at� rolar o d20 antes de\r\n"
				+ "decidir usar o dado de Inspira��o de Bardo, mas deve\r\n"
				+ "decidir antes do Mestre dizer se a rolagem foi bem ou mal\r\n"
				+ "sucedida. Quando o dado de Inspira��o de Bardo for\r\n"
				+ "rolado, ele � gasto. Uma criatura pode ter apenas um\r\n"
				+ "dado de Inspira��o de Bardo por vez.\r\n\n"
				+ "Voc� pode usar essa caracter�stica um n�mero de\r\n"
				+ "vezes igual ao seu modificador de Carisma (no m�nimo\r\n"
				+ "uma vez). Voc� recupera todos os usos quando termina\r\n"
				+ "um descanso longo.\r\n"
				+ "Seu dado de Inspira��o de Bardo muda quando voc�\r\n"
				+ "atinge certos n�veis na classe. O dado se torna um d8 no\r\n"
				+ "5� n�vel, um d10 no 10� n�vel e um d12 no 15� n�vel.\r\n\n");
	}

//Bardo feats nivel 2
	public void bardoFeatsNivel2() {
		System.out.println("VERSATILIDADE\r\n\n"
				+ "A partir do 2� n�vel, voc� pode adicionar metade do seu\r\n"
				+ "b�nus de profici�ncia, arredondado para baixo, em\r\n"
				+ "qualquer teste de habilidade que voc� fizer que ainda n�o\r\n"
				+ "possua seu b�nus de profici�ncia.\r\n\n"
				+ "CAN��O DE DESCANSO\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar m�sica ou ora��o\r\n"
				+ "calmantes para ajudar a revitalizar seus aliados feridos\r\n"
				+ "durante um descanso curto. Se voc� ou qualquer criatura\r\n"
				+ "amig�vel que puder ouvir sua atua��o recuperar pontos\r\n"
				+ "de vida no fim do descanso curto ao gastar um ou mais\r\n"
				+ "Dados de Vida, cada uma dessas criaturas recupera 1d6\r\n"
				+ "pontos de vida adicionais.\r\n"
				+ "Os pontos de vida adicionais aumentam quando voc�\r\n"
				+ "alcan�a determinados n�veis na classe: para 1d8 no 9�\r\n"
				+ "n�vel, para 1d10 no 13� n�vel e para 1d12 no 17� n�vel.\r\n\n");
	}
	
//Bardo feats nivel 3
	public void bardoFeatsNivel3() {
		System.out.println("COL�GIO DE BARDO\r\n\n"
				+ "No 3� n�vel, voc� investiga as t�cnicas avan�adas de um\r\n"
				+ "col�gio de bardo, � sua escolha: o Col�gio do\r\n"
				+ "Conhecimento ou o Col�gio da Bravura, ambos detalhados\r\n"
				+ "no final da descri��o da classe. Sua escolha lhe concede\r\n"
				+ "caracter�sticas no 3� n�vel e novamente no 6� e 14� n�vel.\r\n\n"
				+ "APTID�O\r\n\n"
				+ "No 3� n�vel, escolha duas das per�cias em que voc� �\r\n"
				+ "proficiente. Seu b�nus de profici�ncia � dobrado em\r\n"
				+ "qualquer teste de habilidade que voc� fizer que utilize\r\n"
				+ "qualquer das per�cias escolhidas.\r\n"
				+ "No 10� n�vel, voc� escolhe mais duas per�cias em que �\r\n"
				+ "proficiente para ganhar esse benef�cio.\n\n\n");
	}
	
//Bardo incremento no valor de habilidade
	public void bardoIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16�\r\n"
				+ "e 19� n�vel, voc� pode aumentar um valor de habilidade, �\r\n"
				+ "sua escolha, em 2 ou voc� pode aumentar dois valores de\r\n"
				+ "habilidade, � sua escolha, em 1. Como padr�o, voc� n�o\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "caracter�stica.\r\n\n");
	}
	
//Bardo feats nivel 5
	public void bardoFeatsNivel5() {
		System.out.println("FONTE DE INSPIRA��O\r\n\n"
				+ "Come�ando no momento em que voc� atinge o 5� n�vel,\r\n"
				+ "voc� recupera todas as utiliza��es gastas da sua\r\n"
				+ "Inspira��o de Bardo quando voc� termina um descanso\r\n"
				+ "curto ou longo.\r\n\n");
	}
	
//Bardo feats nivel 6
	public void bardoFeatsNivel6() {
		System.out.println("CAN��O DE PROTE��O\r\n\n"
				+ "No 6� n�vel, voc� adquire a habilidade de usar notas\r\n"
				+ "musicais ou palavras de poder para interromper efeito de\r\n"
				+ "influ�ncia mental. Com uma a��o, voc� pode come�ar uma\r\n"
				+ "atua��o que dura at� o fim do seu pr�ximo turno. Durante\r\n"
				+ "esse tempo, voc� e qualquer criatura amig�vel a at� 9\r\n"
				+ "metros de voc� ter� vantagem em testes de resist�ncia\r\n"
				+ "para n�o ser amedrontado ou enfeiti�ado. Uma criatura\r\n"
				+ "deve ser capaz de ouvir voc� para receber esse benef�cio.\r\n"
				+ "A atua��o termina prematuramente se voc� for\r\n"
				+ "incapacitado ou silenciado ou se voc� termin�-la\r\n"
				+ "voluntariamente (n�o requer a��o).\r\n\n");
	}
	
//Bardo feats nivel 10
	public void bardoFeatsNivel10() {
		System.out.println("SEGREDOS M�GICOS\r\n\n"
				+ "No 10� n�vel, voc� usurpou conhecimento m�gico de um\r\n"
				+ "vasto espectro de disciplinas. Escolha duas magias de\r\n"
				+ "qualquer classe, incluindo essa. A magia que voc�\r\n"
				+ "escolher deve ser de um n�vel que voc� possa conjurar,\r\n"
				+ "como mostrado na tabela O Bardo, ou um truque.\r\n"
				+ "As magias escolhidas contam como magias de bardo\r\n"
				+ "para voc� e j� est�o inclu�das no n�mero da coluna\r\n"
				+ "Magias Conhecidas da tabela O Bardo.\r\n"
				+ "Voc� aprende duas magias adicionais de qualquer\r\n"
				+ "classe no 14� n�vel e novamente no 18� n�vel.\r\n\n");
	}
	
//Bardo feats nivel 20
	public void bardoFeatsNivel20() {
		System.out.println("INSPIRA��O SUPERIOR\r\n\n"
				+ "No 20� n�vel, quando voc� rolar iniciativa e n�o tiver\r\n"
				+ "nenhum uso restante de Inspira��o de Bardo, voc�\r\n"
				+ "recupera um uso.\r\n\n");
	}
	
//Bardo col�gio do conhecimento
	public void bardoColegioCon() {
		System.out.println("COL�GIO DO CONHECIMENTO\r\n\n"
				+ "Bardos do Col�gio do Conhecimento conhecem algo sobre\r\n"
				+ "a maioria das coisas, coletando peda�os de conhecimento\r\n"
				+ "de fontes t�o diversas quanto tomos eruditos ou contos de\r\n"
				+ "camponeses. Quer seja cantando baladas populares em\r\n"
				+ "taverna, quer seja elaborando composi��es para cortes\r\n"
				+ "reais, esses bardos usam seus dons para manter a\r\n"
				+ "audi�ncia enfeiti�ada. Quando os aplausos acabam, os\r\n"
				+ "membros da audi�ncia v�o estar se questionando se tudo\r\n"
				+ "que eles creem � verdade, desde sua cren�a no sacerd�cio\r\n"
				+ "do templo local at� sua lealdade ao rei.\r\n"
				+ "A fidelidade desses bardos reside na busca pela beleza\r\n"
				+ "e verdade, n�o na lealdade a um monarca ou em seguir os\r\n"
				+ "dogmas de uma divindade. Um nobre que mantem um\r\n"
				+ "bardo desses como seu arauto ou conselheiro, sabe que o\r\n"
				+ "bardo prefere ser honesto que pol�tico.\r\n"
				+ "Os membros do col�gio se re�nem em bibliotecas e, as\r\n"
				+ "vezes, em faculdades de verdade, completas com salas de\r\n"
				+ "aula e dormit�rios, para partilhar seu conhecimento uns\r\n"
				+ "com os outros. Eles tamb�m se encontram em festivais ou\r\n"
				+ "em assuntos de estado, onde eles podem expor corrup��o,\r\n"
				+ "desvendar mentiras e zombar da superestima de figuras de autoridade.\r\n\n");
	}

//Bardo col�gio do conhecimento nivel 3
	public void bardoColegioConN3() {
		System.out.println("PROFICI�NCIA ADICIONAL\r\n\n"
				+ "Quando voc� se junta ao Col�gio do Conhecimento no 3�\r\n"
				+ "n�vel, voc� ganha profici�ncia em tr�s per�cias, � sua\r\n"
				+ "escolha.\r\n"
				+ "PALAVRAS DE INTERRUP��O\r\n"
				+ "Tamb�m no 3� n�vel, voc� aprende como usar sua\r\n"
				+ "perspic�cia para distrair, confundir e, de outras formas,\r\n"
				+ "atrapalhar a confian�a e compet�ncia de outros. Quando\r\n"
				+ "uma criatura que voc� pode ver a at� 18 metros de voc�\r\n"
				+ "realizar uma jogada de ataque, um teste de habilidade ou\r\n"
				+ "uma jogada de dano, voc� pode usar sua rea��o para\r\n"
				+ "gastar um uso de Inspira��o de Bardo, rolando o dado de\r\n"
				+ "Inspira��o de Bardo e subtraindo o n�mero rolado da\r\n"
				+ "rolagem da criatura. Voc� escolhe usar essa caracter�stica\r\n"
				+ "depois da criatura fazer a rolagem, mas antes do Mestre\r\n"
				+ "determinar se a jogada de ataque ou teste de habilidade\r\n"
				+ "foi bem ou mal sucedido, ou antes da criatura causar\r\n"
				+ "dano. A criatura ser� imune se n�o puder ouvir ou se n�o\r\n"
				+ "puder ser enfeiti�ada.\r\n");
	}
	
	
//Bardo col�gio do conhecimento nivel 6
	public void bardoColegioConN6() {
		System.out.println("SEGREDOS M�GICOS ADICIONAIS\r\n\n"
				+ "No 6� n�vel, voc� aprende duas magias, � sua escolha, de\r\n"
				+ "qualquer classe. As magias que voc� escolher devem ser\r\n"
				+ "de um n�vel que voc� possa conjurar, como mostrado na\r\n"
				+ "tabela O Bardo, ou um truque. As magias escolhidas\r\n"
				+ "contam como magias de bardo pra voc�, mas n�o contam\r\n"
				+ "no n�mero de magias de bardo que voc� conhece.\r\n\n");
	}
	
//Bardo col�gio do conhecimento nivel 14
	public void bardoColegioConN14() {
		System.out.println("PER�CIA INIGUAL�VEL\r\n\n"
				+ "A partir do 14� n�vel, quando voc� fizer um teste de\r\n"
				+ "habilidade, voc� pode gastar um uso de Inspira��o de\r\n"
				+ "Bardo. Role o dado de Inspira��o de Bardo e adicione o\r\n"
				+ "n�mero rolado ao seu teste de habilidade. Voc� pode\r\n"
				+ "escolher fazer isso depois de rolar o dado do teste de\r\n"
				+ "habilidade, mas antes do Mestre dizer se foi bem ou mal\r\n"
				+ "sucedido.\r\n\n");
	}
	
//Bardo col�gio da bravura
	public void bardoColegioBra() {
		System.out.println("Os bardos do Col�gio da Bravura s�o escaldos destemidos\r\n"
				+ "de quem os contos mantem viva a mem�ria dos grandes\r\n"
				+ "her�is do passado, dessa forma inspirando uma nova\r\n"
				+ "gera��o de her�is. Esses bardos se re�nem em sal�es de\r\n"
				+ "hidromel ou ao redor de fogueiras para cantar os feitos\r\n"
				+ "dos grandiosos, tanto do passado quanto do presente. Eles\r\n"
				+ "viajam pelos lugares para testemunhar grandes eventos\r\n"
				+ "em primeira m�o e para garantir que a mem�ria desses\r\n"
				+ "eventos n�o se perca nesse mundo. Com suas can��es,\r\n"
				+ "eles inspiram outros a alcan�ar o mesmo patamar de\r\n"
				+ "realiza��es dos antigos her�is.\r\n\n");
	}
	
//Bardo col�gio da bravura nivel 3
	public void bardoColegioBraN3() {
		System.out.println("PROFICI�NCIA ADICIONAL\r\n\n"
				+ "Quando voc� se junta ao Col�gio da Bravura no 3� n�vel,\r\n"
				+ "voc� adquire profici�ncia com armadura m�dias, escudos\r\n"
				+ "e armas marciais.\r\n\n"
				+ "INSPIRA��O EM COMBATE\r\n\n"
				+ "Tamb�m no 3� n�vel, voc� aprende a inspirar os outros em\r\n"
				+ "batalha. Uma criatura que possuir um dado de Inspira��o\r\n"
				+ "de Bardo seu, pode rolar esse dado e adicionar o n�mero\r\n"
				+ "rolado a uma jogada de dano que ele tenha acabado de\r\n"
				+ "fazer. Alternativamente, quando uma jogada de ataque\r\n"
				+ "for realizada contra essa criatura, ela pode usar sua\r\n"
				+ "rea��o para rolar o dado de Inspira��o de Bardo e\r\n"
				+ "adicionar o n�mero rolado a sua CA contra esse ataque,\r\n"
				+ "depois da rolagem ser feita, mas antes de saber se errou\r\n"
				+ "ou acertou.\r\n\n");
	}
	
//Bardo col�gio da bravura nivel 6
	public void bardoColegioBraN6() {
		System.out.println("ATAQUE EXTRA\r\n\n"
				+ "A partir do 6� n�vel, voc� pode atacar duas vezes, ao inv�s\r\n"
				+ "de uma, sempre que voc� realizar a a��o de Ataque no seu\r\n"
				+ "turno.\r\n\n");
	}
	
//Bardo col�gio da bravura nivel 14
	public void bardoColegioBraN14() {
		System.out.println("MAGIA DE BATALHA\r\n\n"
				+ "No 14� n�vel, voc� dominou a arte de tecer a conjura��o e\r\n"
				+ "usar armas em um ato harmonioso. Quando voc� usar sua\r\n"
				+ "a��o para conjurar uma magia de bardo, voc� pode\r\n"
				+ "realizar um ataque com arma com uma a��o b�nus.\r\n\n");
	}
	
}
