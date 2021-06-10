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
		String descricao = "Cantarolando enquanto entrelaça os seus dedos\r\n"
				+ "em volta de um monumento antigo em uma ruina\r\n"
				+ "a muito esquecida, uma meio\r\n"
				+ "-elfa vestida em couros\r\n"
				+ "gastos encontra o conhecimento que brota de sua\r\n"
				+ "mente, conjurado através da magia de sua música\r\n"
				+ "–\r\n"
				+ "conhecimento do povo que construiu o monumento\r\n"
				+ "e a saga mística é descrita.\r\n"
				+ "Um austero guerreiro humano bate sua espada\r\n"
				+ "ritmicamente contra sua brunea, ditando o andamento\r\n"
				+ "do seu canto de guerra e exortando bravura e heroísmo\r\n"
				+ "em seus companheiros. A magia da sua canção os\r\n"
				+ "fortalece e encoraja.\r\n"
				+ "Gargalhando enquanto entoa sua citara, uma\r\n"
				+ "gnoma tece sua sutil magia sobre os nobres reunidos,\r\n"
				+ "garantindo que as palavras dos seus companheiros\r\n"
				+ "serão bem recebidas.\r\n"
				+ "Não importa se um escolar, escaldo ou malandro,\r\n"
				+ "o bardo tece sua magia através de palavras e\r\n"
				+ "música para inspirar aliados, desmoralizar\r\n"
				+ "oponentes, manipular mentes, criar ilusões e,\r\n"
				+ "até mesmo, curar ferimentos.\r\n";
		return descricao;
	}
	
	public String bardoCaracteristicas() {
		String caracteristicas = "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por nível de bardo\r\n"
				+ "Pontos de Vida no 1° Nível: 8 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constituição por nível de bardo após o 1°\r\n\n"
				+ "PROFICIÉNCIAS\r\n\n"
				+ "Armaduras: Armaduras leves\r\n"
				+ "Armas: Armas simples, bestas de mão, espadas longas,\r\n"
				+ "rapieiras, espadas curtas\r\n"
				+ "Ferramentas: Três instrumentos musicais, à sua escolha\r\n"
				+ "Testes de Resistência: Destreza, Carisma\r\n"
				+ "Perícias: Escolha três quaisquer\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
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
		List<String> proficiencia_equips = Arrays.asList("Armaduras leves", "Armas simples", "Bestas de mão", "Espadas longas", "Rapieiras", "Espadas curtas");
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
			
			System.out.println("Escolha entre essas opções\n(1) um lute ou (2) qualquer outro instrumento musical:");
			
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
				System.out.println("Essa opção não existe!");
			break;
			}
		}
	}
//Bardo feats padrao
	public void bardoFeatsPadrao() {
		System.out.println("CONJURAÇÃO\r\n\n"
				+ "Você aprendeu a desembaraçar e remodelar o decido da\r\n"
				+ "realidade em harmonia com os seus desejos e música.\r\n"
				+ "Suas magias são parte do seu vasto repertório, magia que\r\n"
				+ "você pode entoar em diferentes situações. Veja o capítulo\r\n"
				+ "10 para as regras gerais de conjuração e o capítulo 11\r\n"
				+ "para a lista de magias de bardo.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Você conhece dois truques, à sua escolha da lista de\r\n"
				+ "magias de bardo. Você aprende truques de bardo\r\n"
				+ "adicionais, à sua escolha em níveis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Bardo.\r\n\n\n"
				+ "ESPAÇOS DE MAGIA\r\n\n"
				+ "A tabela O Bardo mostra quantos espaços de magia de 1°\r\n"
				+ "nível e superiores você possui disponíveis para\r\n"
				+ "conjuração. Para conjurar uma dessas magias, você deve\r\n"
				+ "gastar uma espaço de magia do nível da magia ou\r\n"
				+ "superior. Você recobra todos os espaços de magia gastos\r\n"
				+ "quando você completa um descanso longo.\r\n"
				+ "Por exemplo, se você quiser conjurar a magia de 1°\r\n"
				+ "nível curar ferimentos e você tiver um espaço de magia de\r\n"
				+ "1° nível e um de 2° nível disponíveis, você poderá conjurar\r\n"
				+ "curar ferimentos usando qualquer dos dois espaços.\r\n\n"
				+ "MAGIAS CONHECIDAS DE 1° NÍVEL E SUPERIORES\r\n\n"
				+ "Você conhece quatro magias de 1° nível, à sua escolha, da\r\n"
				+ "lista de magias de bardo.\r\n"
				+ "A coluna Magias Conhecidas na tabela O Bardo\r\n"
				+ "mostra quando você aprende mais magias de bardo, à sua\r\n"
				+ "escolha. Cada uma dessas magias deve ser de um nível a\r\n"
				+ "que você tenha acesso, como mostrado na tabela. Por\r\n"
				+ "exemplo, quando você alcança o 3° nível da classe, você\r\n"
				+ "pode aprender uma nova magia de 1° ou 2° nível.\r\n"
				+ "Além disso, quando você adquire um nível nessa\r\n"
				+ "classe, você pode escolher uma magia de bardo que você\r\n"
				+ "conheça e substituí-la por outra magia da lista de magias\r\n"
				+ "de bardo, que também deve ser de um nível ao qual você\r\n"
				+ "tenha espaços de magia.\r\n\n"
				+ "HABILIDADE DE CONJURAÇÃO\r\n\n"
				+ "Sua habilidade de conjuração é Carisma para suas\r\n"
				+ "magias de bardo, portanto, você usa seu Carisma sempre\r\n"
				+ "que alguma magia se referir à sua habilidade de conjurar\r\n"
				+ "magias. Além disso, você usa o seu modificador de\r\n"
				+ "Carisma para definir a CD dos testes de resistência para\r\n\n"
				+ "as magias de bardo que você conjura e quando você\r\n"
				+ "realiza uma jogada de ataque com uma magia.\r\n"
				+ "CD para suas magias = 8 + bônus de proficiência +\r\n"
				+ "seu modificador de Carisma\r\n"
				+ "Modificador de ataque de magia = seu bônus de proficiência +\r\n"
				+ "seu modificador de Carisma\r\n\n"
				+ "CONJURAÇÃO DE RITUAL\r\n\n"
				+ "Você pode conjurar qualquer magia de bardo que você\r\n"
				+ "conheça como um ritual se ela possuir o descritor ritual.\r\n\n"
				+ "FOCO DE CONJURAÇÃO\r\n\n"
				+ "Você pode usar um instrumento musical (encontrado no\r\n"
				+ "capítulo 5) como foco de conjuração das suas magias de\r\n"
				+ "bardo.\r\n\n"
				+ "INSPIRAÇÃO DE BARDO\r\n\n"
				+ "Você pode inspirar os outros através de palavras\r\n"
				+ "animadoras ou música. Para tanto, você usa uma ação\r\n"
				+ "bônus no seu turno para escolher uma outra criatura, que\r\n"
				+ "não seja você mesmo, a até 18 metros de você que possa\r\n"
				+ "ouvi-lo. Essa criatura ganha um dado de Inspiração de\r\n"
				+ "Bardo, um d6.\r\n"
				+ "Uma vez, nos próximos 10 minutos, a criatura poderá\r\n"
				+ "rolar o dado e adicionar o valor rolado a um teste de\r\n"
				+ "habilidade, jogada de ataque ou teste de resistência que\r\n"
				+ "ela fizer. A criatura pode esperar até rolar o d20 antes de\r\n"
				+ "decidir usar o dado de Inspiração de Bardo, mas deve\r\n"
				+ "decidir antes do Mestre dizer se a rolagem foi bem ou mal\r\n"
				+ "sucedida. Quando o dado de Inspiração de Bardo for\r\n"
				+ "rolado, ele é gasto. Uma criatura pode ter apenas um\r\n"
				+ "dado de Inspiração de Bardo por vez.\r\n\n"
				+ "Você pode usar essa característica um número de\r\n"
				+ "vezes igual ao seu modificador de Carisma (no mínimo\r\n"
				+ "uma vez). Você recupera todos os usos quando termina\r\n"
				+ "um descanso longo.\r\n"
				+ "Seu dado de Inspiração de Bardo muda quando você\r\n"
				+ "atinge certos níveis na classe. O dado se torna um d8 no\r\n"
				+ "5° nível, um d10 no 10° nível e um d12 no 15° nível.\r\n\n");
	}

//Bardo feats nivel 2
	public void bardoFeatsNivel2() {
		System.out.println("VERSATILIDADE\r\n\n"
				+ "A partir do 2° nível, você pode adicionar metade do seu\r\n"
				+ "bônus de proficiência, arredondado para baixo, em\r\n"
				+ "qualquer teste de habilidade que você fizer que ainda não\r\n"
				+ "possua seu bônus de proficiência.\r\n\n"
				+ "CANÇÃO DE DESCANSO\r\n\n"
				+ "A partir do 2° nível, você pode usar música ou oração\r\n"
				+ "calmantes para ajudar a revitalizar seus aliados feridos\r\n"
				+ "durante um descanso curto. Se você ou qualquer criatura\r\n"
				+ "amigável que puder ouvir sua atuação recuperar pontos\r\n"
				+ "de vida no fim do descanso curto ao gastar um ou mais\r\n"
				+ "Dados de Vida, cada uma dessas criaturas recupera 1d6\r\n"
				+ "pontos de vida adicionais.\r\n"
				+ "Os pontos de vida adicionais aumentam quando você\r\n"
				+ "alcança determinados níveis na classe: para 1d8 no 9°\r\n"
				+ "nível, para 1d10 no 13° nível e para 1d12 no 17° nível.\r\n\n");
	}
	
//Bardo feats nivel 3
	public void bardoFeatsNivel3() {
		System.out.println("COLÉGIO DE BARDO\r\n\n"
				+ "No 3° nível, você investiga as técnicas avançadas de um\r\n"
				+ "colégio de bardo, à sua escolha: o Colégio do\r\n"
				+ "Conhecimento ou o Colégio da Bravura, ambos detalhados\r\n"
				+ "no final da descrição da classe. Sua escolha lhe concede\r\n"
				+ "características no 3° nível e novamente no 6° e 14° nível.\r\n\n"
				+ "APTIDÃO\r\n\n"
				+ "No 3° nível, escolha duas das perícias em que você é\r\n"
				+ "proficiente. Seu bônus de proficiência é dobrado em\r\n"
				+ "qualquer teste de habilidade que você fizer que utilize\r\n"
				+ "qualquer das perícias escolhidas.\r\n"
				+ "No 10° nível, você escolhe mais duas perícias em que é\r\n"
				+ "proficiente para ganhar esse benefício.\n\n\n");
	}
	
//Bardo incremento no valor de habilidade
	public void bardoIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando você atinge o 4° nível e novamente no 8°, 12°, 16°\r\n"
				+ "e 19° nível, você pode aumentar um valor de habilidade, à\r\n"
				+ "sua escolha, em 2 ou você pode aumentar dois valores de\r\n"
				+ "habilidade, à sua escolha, em 1. Como padrão, você não\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "característica.\r\n\n");
	}
	
//Bardo feats nivel 5
	public void bardoFeatsNivel5() {
		System.out.println("FONTE DE INSPIRAÇÃO\r\n\n"
				+ "Começando no momento em que você atinge o 5° nível,\r\n"
				+ "você recupera todas as utilizações gastas da sua\r\n"
				+ "Inspiração de Bardo quando você termina um descanso\r\n"
				+ "curto ou longo.\r\n\n");
	}
	
//Bardo feats nivel 6
	public void bardoFeatsNivel6() {
		System.out.println("CANÇÃO DE PROTEÇÃO\r\n\n"
				+ "No 6° nível, você adquire a habilidade de usar notas\r\n"
				+ "musicais ou palavras de poder para interromper efeito de\r\n"
				+ "influência mental. Com uma ação, você pode começar uma\r\n"
				+ "atuação que dura até o fim do seu próximo turno. Durante\r\n"
				+ "esse tempo, você e qualquer criatura amigável a até 9\r\n"
				+ "metros de você terá vantagem em testes de resistência\r\n"
				+ "para não ser amedrontado ou enfeitiçado. Uma criatura\r\n"
				+ "deve ser capaz de ouvir você para receber esse benefício.\r\n"
				+ "A atuação termina prematuramente se você for\r\n"
				+ "incapacitado ou silenciado ou se você terminá-la\r\n"
				+ "voluntariamente (não requer ação).\r\n\n");
	}
	
//Bardo feats nivel 10
	public void bardoFeatsNivel10() {
		System.out.println("SEGREDOS MÁGICOS\r\n\n"
				+ "No 10° nível, você usurpou conhecimento mágico de um\r\n"
				+ "vasto espectro de disciplinas. Escolha duas magias de\r\n"
				+ "qualquer classe, incluindo essa. A magia que você\r\n"
				+ "escolher deve ser de um nível que você possa conjurar,\r\n"
				+ "como mostrado na tabela O Bardo, ou um truque.\r\n"
				+ "As magias escolhidas contam como magias de bardo\r\n"
				+ "para você e já estão incluídas no número da coluna\r\n"
				+ "Magias Conhecidas da tabela O Bardo.\r\n"
				+ "Você aprende duas magias adicionais de qualquer\r\n"
				+ "classe no 14° nível e novamente no 18° nível.\r\n\n");
	}
	
//Bardo feats nivel 20
	public void bardoFeatsNivel20() {
		System.out.println("INSPIRAÇÃO SUPERIOR\r\n\n"
				+ "No 20° nível, quando você rolar iniciativa e não tiver\r\n"
				+ "nenhum uso restante de Inspiração de Bardo, você\r\n"
				+ "recupera um uso.\r\n\n");
	}
	
//Bardo colégio do conhecimento
	public void bardoColegioCon() {
		System.out.println("COLÉGIO DO CONHECIMENTO\r\n\n"
				+ "Bardos do Colégio do Conhecimento conhecem algo sobre\r\n"
				+ "a maioria das coisas, coletando pedaços de conhecimento\r\n"
				+ "de fontes tão diversas quanto tomos eruditos ou contos de\r\n"
				+ "camponeses. Quer seja cantando baladas populares em\r\n"
				+ "taverna, quer seja elaborando composições para cortes\r\n"
				+ "reais, esses bardos usam seus dons para manter a\r\n"
				+ "audiência enfeitiçada. Quando os aplausos acabam, os\r\n"
				+ "membros da audiência vão estar se questionando se tudo\r\n"
				+ "que eles creem é verdade, desde sua crença no sacerdócio\r\n"
				+ "do templo local até sua lealdade ao rei.\r\n"
				+ "A fidelidade desses bardos reside na busca pela beleza\r\n"
				+ "e verdade, não na lealdade a um monarca ou em seguir os\r\n"
				+ "dogmas de uma divindade. Um nobre que mantem um\r\n"
				+ "bardo desses como seu arauto ou conselheiro, sabe que o\r\n"
				+ "bardo prefere ser honesto que político.\r\n"
				+ "Os membros do colégio se reúnem em bibliotecas e, as\r\n"
				+ "vezes, em faculdades de verdade, completas com salas de\r\n"
				+ "aula e dormitórios, para partilhar seu conhecimento uns\r\n"
				+ "com os outros. Eles também se encontram em festivais ou\r\n"
				+ "em assuntos de estado, onde eles podem expor corrupção,\r\n"
				+ "desvendar mentiras e zombar da superestima de figuras de autoridade.\r\n\n");
	}

//Bardo colégio do conhecimento nivel 3
	public void bardoColegioConN3() {
		System.out.println("PROFICIÊNCIA ADICIONAL\r\n\n"
				+ "Quando você se junta ao Colégio do Conhecimento no 3°\r\n"
				+ "nível, você ganha proficiência em três perícias, à sua\r\n"
				+ "escolha.\r\n"
				+ "PALAVRAS DE INTERRUPÇÃO\r\n"
				+ "Também no 3° nível, você aprende como usar sua\r\n"
				+ "perspicácia para distrair, confundir e, de outras formas,\r\n"
				+ "atrapalhar a confiança e competência de outros. Quando\r\n"
				+ "uma criatura que você pode ver a até 18 metros de você\r\n"
				+ "realizar uma jogada de ataque, um teste de habilidade ou\r\n"
				+ "uma jogada de dano, você pode usar sua reação para\r\n"
				+ "gastar um uso de Inspiração de Bardo, rolando o dado de\r\n"
				+ "Inspiração de Bardo e subtraindo o número rolado da\r\n"
				+ "rolagem da criatura. Você escolhe usar essa característica\r\n"
				+ "depois da criatura fazer a rolagem, mas antes do Mestre\r\n"
				+ "determinar se a jogada de ataque ou teste de habilidade\r\n"
				+ "foi bem ou mal sucedido, ou antes da criatura causar\r\n"
				+ "dano. A criatura será imune se não puder ouvir ou se não\r\n"
				+ "puder ser enfeitiçada.\r\n");
	}
	
	
//Bardo colégio do conhecimento nivel 6
	public void bardoColegioConN6() {
		System.out.println("SEGREDOS MÁGICOS ADICIONAIS\r\n\n"
				+ "No 6° nível, você aprende duas magias, à sua escolha, de\r\n"
				+ "qualquer classe. As magias que você escolher devem ser\r\n"
				+ "de um nível que você possa conjurar, como mostrado na\r\n"
				+ "tabela O Bardo, ou um truque. As magias escolhidas\r\n"
				+ "contam como magias de bardo pra você, mas não contam\r\n"
				+ "no número de magias de bardo que você conhece.\r\n\n");
	}
	
//Bardo colégio do conhecimento nivel 14
	public void bardoColegioConN14() {
		System.out.println("PERÍCIA INIGUALÁVEL\r\n\n"
				+ "A partir do 14° nível, quando você fizer um teste de\r\n"
				+ "habilidade, você pode gastar um uso de Inspiração de\r\n"
				+ "Bardo. Role o dado de Inspiração de Bardo e adicione o\r\n"
				+ "número rolado ao seu teste de habilidade. Você pode\r\n"
				+ "escolher fazer isso depois de rolar o dado do teste de\r\n"
				+ "habilidade, mas antes do Mestre dizer se foi bem ou mal\r\n"
				+ "sucedido.\r\n\n");
	}
	
//Bardo colégio da bravura
	public void bardoColegioBra() {
		System.out.println("Os bardos do Colégio da Bravura são escaldos destemidos\r\n"
				+ "de quem os contos mantem viva a memória dos grandes\r\n"
				+ "heróis do passado, dessa forma inspirando uma nova\r\n"
				+ "geração de heróis. Esses bardos se reúnem em salões de\r\n"
				+ "hidromel ou ao redor de fogueiras para cantar os feitos\r\n"
				+ "dos grandiosos, tanto do passado quanto do presente. Eles\r\n"
				+ "viajam pelos lugares para testemunhar grandes eventos\r\n"
				+ "em primeira mão e para garantir que a memória desses\r\n"
				+ "eventos não se perca nesse mundo. Com suas canções,\r\n"
				+ "eles inspiram outros a alcançar o mesmo patamar de\r\n"
				+ "realizações dos antigos heróis.\r\n\n");
	}
	
//Bardo colégio da bravura nivel 3
	public void bardoColegioBraN3() {
		System.out.println("PROFICIÊNCIA ADICIONAL\r\n\n"
				+ "Quando você se junta ao Colégio da Bravura no 3° nível,\r\n"
				+ "você adquire proficiência com armadura médias, escudos\r\n"
				+ "e armas marciais.\r\n\n"
				+ "INSPIRAÇÃO EM COMBATE\r\n\n"
				+ "Também no 3° nível, você aprende a inspirar os outros em\r\n"
				+ "batalha. Uma criatura que possuir um dado de Inspiração\r\n"
				+ "de Bardo seu, pode rolar esse dado e adicionar o número\r\n"
				+ "rolado a uma jogada de dano que ele tenha acabado de\r\n"
				+ "fazer. Alternativamente, quando uma jogada de ataque\r\n"
				+ "for realizada contra essa criatura, ela pode usar sua\r\n"
				+ "reação para rolar o dado de Inspiração de Bardo e\r\n"
				+ "adicionar o número rolado a sua CA contra esse ataque,\r\n"
				+ "depois da rolagem ser feita, mas antes de saber se errou\r\n"
				+ "ou acertou.\r\n\n");
	}
	
//Bardo colégio da bravura nivel 6
	public void bardoColegioBraN6() {
		System.out.println("ATAQUE EXTRA\r\n\n"
				+ "A partir do 6° nível, você pode atacar duas vezes, ao invés\r\n"
				+ "de uma, sempre que você realizar a ação de Ataque no seu\r\n"
				+ "turno.\r\n\n");
	}
	
//Bardo colégio da bravura nivel 14
	public void bardoColegioBraN14() {
		System.out.println("MAGIA DE BATALHA\r\n\n"
				+ "No 14° nível, você dominou a arte de tecer a conjuração e\r\n"
				+ "usar armas em um ato harmonioso. Quando você usar sua\r\n"
				+ "ação para conjurar uma magia de bardo, você pode\r\n"
				+ "realizar um ataque com arma com uma ação bônus.\r\n\n");
	}
	
}
