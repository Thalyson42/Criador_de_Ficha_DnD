package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Feiticeiro extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Feiticeiro";
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
	
	public void descricao() {
		System.out.println("FEITICEIRO\r\n\n"
				+ "Com olhos brilhando dourado, uma\r\n"
				+ "humana estica suas mãos e libera o fogo\r\n"
				+ "dracônico que queima em suas veias. A\r\n"
				+ "medida que um inferno consome seus\r\n"
				+ "oponentes, asas de couro surgem nas suas\r\n"
				+ "costas e ela ergue\r\n"
				+ "-se no ar.\r\n"
				+ "Os longos cabelos balançam com a conjuração\r\n"
				+ "do vento, um meio elfo abre seus braços totalmente\r\n"
				+ "e joga a cabeça para trás. Erguendo\r\n"
				+ "-o\r\n"
				+ "momentaneamente do chão, uma onda de magia\r\n"
				+ "surge sobre ele, por meio dele e, fora dele, uma\r\n"
				+ "poderosa explosão de relâmpago.\r\n"
				+ "Esgueirando\r\n"
				+ "-se atrás de uma estalagmite, uma\r\n"
				+ "halfling aponta seu dedo em um troglodita em investida.\r\n"
				+ "Uma explosão de chamas é liberada através do seu dedo e\r\n"
				+ "atinge a criatura. Ela toma cobertura atrás da formação\r\n"
				+ "rochosa com um sorriso, sem saber que sua magia\r\n"
				+ "selvagem deixou sua pele com um brilho azulado.\r\n"
				+ "Os feiticeiros carregam um patrimônio mágico\r\n"
				+ "conferido a eles por uma linhagem exótica, alguma\r\n"
				+ "influência de outro mundo ou exposição a forças cósmicas\r\n"
				+ "desconhecidas. Não é possível estudar feitiçaria como se\r\n"
				+ "aprende um idioma, assim como não se aprende a viver\r\n"
				+ "uma vida lendária. Ninguém escolhe a feitiçaria: os\r\n"
				+ "poderes escolhem o feiticeiro. MAGIA BRUTA\r\n"
				+ "A magia é parte de todo feiticeiro, inundando corpo,\r\n"
				+ "mente e espirito com um poder latente que espera para\r\n"
				+ "ser dominado. Alguns feiticeiro carregam magia que\r\n"
				+ "emerge de uma antiga linhagem infundida com a magia\r\n"
				+ "dos dragões. Outros carregam uma magia bruta,\r\n"
				+ "incontrolável dentro de si, uma tormenta caótica que se\r\n"
				+ "manifesta de formas inexplicáveis.\r\n"
				+ "A aparência dos poderes de feitiçaria são vastamente\r\n"
				+ "imprevisíveis. Algumas linhagens dracônicas produzem\r\n"
				+ "apenas um feiticeiro por geração, porém, em outras linhas\r\n"
				+ "de descendência, todos os indivíduos serão feiticeiros. A\r\n"
				+ "maior parte do tempo, os talentos de feitiçaria aparecem\r\n"
				+ "aparentemente ao acaso. Alguns feiticeiros não\r\n"
				+ "conseguem determinar a origem do seu poder, enquanto\r\n"
				+ "outros o relacionam com estranhos eventos de suas vidas.\r\n"
				+ "O toque de um corruptor, a b\r\n"
				+ "ênção de uma dríade no\r\n"
				+ "nascimento de um bebê ou experimentar a água de uma\r\n"
				+ "fonte misteriosa podem conceder o dom da feitiçaria.\r\n"
				+ "Também é possível adquirir esse dom de uma divindade\r\n"
				+ "da magia, da exposição as forças elementais dos Planos\r\n"
				+ "Interiores ou do caos alucinante do Limbo ou ao\r\n"
				+ "vislumbrar o funcionamento interno da realidade.\r\n"
				+ "Os feiticeiros não veem serventia em grimórios ou\r\n"
				+ "antigos tomos de conhecimento místico buscados pelos\r\n"
				+ "magos, nem buscam um patrono para conceder\r\n"
				+ "-lhes suas\r\n"
				+ "magias, como um bruxo faz. Ao aprender a explorar e\r\n"
				+ "canalizar sua própria magia inata, eles descobrem novas\r\n"
				+ "e incríveis formas de liberar esse poder. PODERES INEXPLICÁVEIS\r\n"
				+ "Os feiticeiros são raros no mundo e é incomum encontrar\r\n"
				+ "um feiticeiro que não esteja envolvido na vida de\r\n"
				+ "aventuras de alguma forma. Pessoas com poder mágico\r\n"
				+ "fluindo em suas veias descobrem cedo que o poder não\r\n"
				+ "gosta de ficar quieto. A magia de um feiticeiro gosta de\r\n"
				+ "ser exercida e tem uma tendência de fluir de maneiras\r\n"
				+ "imprevisíveis se não for chamada.\r\n"
				+ "Muitas vezes, os feiticeiros\r\n"
				+ " tem motivações obscuras ou\r\n"
				+ " quixotescas que os leva a aventuras.\r\n"
				+ " Alguns buscam uma maior compreensão da\r\n"
				+ "força mágica que os infunde ou a resposta do mistério de\r\n"
				+ "sua origem. Outros, esperam encontrar uma forma de se\r\n"
				+ "livrar dele ou de liberar seu potencial máximo.\r\n"
				+ "Independente dos seus objetivos, os feiticeiros são tão\r\n"
				+ "uteis para um grupo de aventureiros quanto os magos,\r\n"
				+ "compensando a falta de variedade de conhecimento\r\n"
				+ "mágico com uma enorme flexibilidade no uso das magias\r\n"
				+ "que eles conhecem.\r\n\n");
	}
	
	public void construcaoRapida() {
		System.out.println("CONSTRUÇÃO RÁPIDA\r\n\n"
				+ "Você pode construir um feiticeiro rapidamente seguindo\r\n"
				+ "essas sugestões. Primeiro, coloque seu valor de habilidade\r\n"
				+ "mais alto em Carisma, seguido de Constituição. Segundo,\r\n"
				+ "escolha o antecedente eremita. Terceiro, escolha os\r\n"
				+ "truques luz, prestidigitação, raio de gelo e toque chocante,\r\n"
				+ "além das seguintes magias de 1° nível: escudo arcano e\r\n"
				+ "misseis mágicos.\r\n\n");
	}
	
	public void caracteristicasClasse() {
		System.out.println("CARACTERÍSTICAS DE CLASSE\r\n\n"
				+ "Como um feiticeiro, você adquire as seguintes\r\n"
				+ "características de classe.\r\n\n"
				+ "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d6 por nível de feiticeiro\r\n"
				+ "Pontos de Vida no 1° Nível: 6 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d6 (ou 4) + seu\r\n"
				+ "modificador de Constituição por nível de feiticeiro após\r\n"
				+ "o 1°\r\n\n"
				+ "PROFICIÊNCIAS\r\n\n"
				+ "Armaduras: Nenhuma\r\n"
				+ "Armas: Adagas, dardos, fundas, bordões e bestas leves\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resistência: Constituição, Carisma\r\n"
				+ "Perícias: Escolha duas dentre Arcanismo, Enganação,\r\n"
				+ "Intuição, Intimidação, Persuasão e Religião\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma besta leve e 20 virotes ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "- (a) uma bolsa de componentes ou (b) um foco arcano\r\n"
				+ "- (a) um pacote de explorador ou (b) um pacote de\r\n"
				+ "aventureiro\r\n\n");
	}
	
	public void setFeiticeiro() {
		getFicha().setClasse("Feiticeiro");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Adagas", "Dardos", "Fundos", "Bordões", "Bestas Leves");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Constituição", "Carisma");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Arcanismo", "Enganação", "Intuição", "Intimidação", "Persuasão", "Religião");
		getProficiencia().setPericias(profPericias, 2);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
//		this.magias.setFicha(ficha);
		getMagias().truquesFeiticeiro();
		getMagias().setMagiasFeiticeiroLV1();
//		this.ficha = this.magias.getFicha();
		getFicha().setHabilidade_conjuracao("Carisma");
		
	}
	
	public int pontosVidaLV1(int modConstituicao) {
		return 6+modConstituicao;
	}
	
	public int pontosVidaNiveisSeguintesRoll(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		for(int c = 0; c < niveis; c++) {
			soma += modConstituicao+(random.nextInt((4 - 1) + 1) + 1);	
		}
		return soma;
	}
	
	public int pontosVidaNiveisSeguintes(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		
		for(int i = 0; i < niveis; i++) {
			soma += modConstituicao+4;
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
		getEquips().setPacotes("Pacote de Explorador", "Pacote de Aventureiro");
	}
	
	public void FeatsPadrao() {
		System.out.println("CONJURAÇÃO\r\n\n"
				+ "Um evento do seu passado ou na vida de um parente ou\r\n"
				+ "ancestral, deixou uma marca indelével em você,\r\n"
				+ "infundindo você com magia arcana. A fonte desse poder,\r\n"
				+ "independente da sua origem, flui em suas magias. Veja o\r\n"
				+ "capítulo 10 para as regras gerais de conjuração e o\r\n"
				+ "capítulo 11 para a lista de magias de feiticeiro.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Você conhece quatro truques, à sua escolha, da lista de\r\n"
				+ "magias de feiticeiro. Você aprende truques de feiticeiro\r\n"
				+ "adicionais, à sua escolha, em níveis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Feiticeiro.\r\n\n"
				+ "ESPAÇOS DE MAGIA\r\n\n"
				+ "A tabela O Feiticeiro mostra quantos espaços de magia de\r\n"
				+ "1° nível e superiores você possui disponíveis para\r\n"
				+ "conjuração. Para conjurar uma dessas magias, você deve\r\n"
				+ "gastar uma espaço de magia do nível da magia ou\r\n"
				+ "superior. Você recobra todos os espaços de magia gastos\r\n"
				+ "quando você completa um descanso longo.\r\n"
				+ "Por exemplo, se você quiser conjurar a magia de 1°\r\n"
				+ "nível mãos flamejantes e você tiver um espaço de magia\r\n"
				+ "de 1° nível e um de 2° nível disponíveis, você poderá\r\n"
				+ "conjurar mãos flamejantes usando qualquer dos dois\r\n"
				+ "espaços.\r\n\n"
				+ "MAGIAS CONHECIDAS DE 1° NÍVEL E SUPERIORES\r\n\n"
				+ "Você conhece duas magias de 1° nível, à sua escolha, da\r\n"
				+ "lista de magias de feiticeiro.\r\n"
				+ "A coluna Magias Conhecidas na tabela O Feiticeiro\r\n"
				+ "mostra quando você aprende mais magias de feiticeiro, à\r\n"
				+ "sua escolha. Cada uma dessas magias deve ser de um\r\n"
				+ "nível a que você tenha acesso, como mostrado na tabela.\r\n"
				+ "Por exemplo, quando você alcança o 3° nível da classe,\r\n"
				+ "você pode aprender uma nova magia de 1° ou 2° nível.\r\n"
				+ "Além disso, quando você adquire um nível nessa\r\n"
				+ "classe, você pode escolher uma magia de feiticeiro que\r\n"
				+ "você conheça e substituí-la por outra magia da lista de\r\n"
				+ "magias de feiticeiro, que também deve ser de um nível ao\r\n"
				+ "qual você tenha espaços de magia.\r\n\n"
				+ "HABILIDADE DE CONJURAÇÃO\r\n\n"
				+ "Carisma é a sua habilidade de conjuração para suas\r\n"
				+ "magias de feiticeiro, já que o poder da sua magia depende\r\n"
				+ "da sua capacidade de projetar sua vontade no mundo. Use\r\n"
				+ "seu Carisma sempre que alguma magia se referir à sua\r\n"
				+ "habilidade de conjurar magias. Além disso, você usa o seu\r\n"
				+ "modificador de Carisma para definir a CD dos testes de\r\n"
				+ "resistência para as magias de feiticeiro que você conjura e\r\n"
				+ "quando você realiza uma jogada de ataque com uma\r\n"
				+ "magia.\r\n"
				+ "CD para suas magias = 8 + bônus de proficiência +\r\n"
				+ "seu modificador de Carisma\r\n"
				+ "Modificador de ataque de magia = seu bônus de proficiência +\r\n"
				+ "seu modificador de Carisma\r\n\n"
				+ "FOCO DE CONJURAÇÃO\r\n\n"
				+ "Você pode usar um foco arcano (encontrado no capítulo 5)\r\n"
				+ "como foco de conjuração das suas magias de feiticeiro.\r\n\n"
				+ "ORIGEM DE FEITIÇARIA\r\n\n"
				+ "Escolha uma origem de feitiçaria, que descreve a fonte do\r\n"
				+ "seu poder mágico inato: Linhagem Dracônica ou Magia\r\n"
				+ "Selvagem, ambos detalhados no final da descrição da\r\n"
				+ "classe.\r\n"
				+ "Sua escolha lhe confere características quando você a\r\n"
				+ "escolhe, no 1° nível e novamente no 6°, 14° e 18° nível.\r\n\n");
	}
	
	public void featsNivel2() {
		System.out.println("FONTE DE MAGIA\r\n\n"
				+ "No 2° nível, você alcança uma profunda fonte de magia\r\n"
				+ "dentro de você. Essa fonte é representada pelos pontos de\r\n"
				+ "feitiçaria, que permitem que você crie uma variedade de\r\n"
				+ "efeitos mágicos.\r\n\n"
				+ "PONTOS DE FEITIÇARIA\r\n\n"
				+ "Você tem 2 pontos de feitiçaria e ganha mais a medida\r\n"
				+ "que alcança níveis elevados, como mostrado na coluna\r\n"
				+ "Pontos de Feitiçaria da tabela O Feiticeiro. Você nunca\r\n"
				+ "poderá ter mais pontos de feitiçaria que os mostrados na\r\n"
				+ "tabela para o seu nível. Você recupera todos os pontos de\r\n"
				+ "feitiçaria gastos quando termina um descanso longo.\r\n\n"
				+ "CONJURAÇÃO FLEXÍVEL\r\n\n"
				+ "Você pode usar seus pontos de feitiçaria para ganhar\r\n"
				+ "novos espaços de magia ou sacrificar espaços de magia\r\n"
				+ "para ganhar pontos de magia adicionais. Você aprende\r\n"
				+ "novas formas de usar seus pontos de feitiçaria quando\r\n"
				+ "alcança níveis elevados. Os espaços de magia criados\r\n"
				+ "desaparecem ao final de um descanso longo.\r\n"
				+ "Criando Espaços de Magia. Você pode transformar\r\n"
				+ "pontos de fetiçaria disponíveis em um espaço de magia,\r\n"
				+ "com uma ação bônus, no seu turno. A tabela Criando\r\n"
				+ "Espaços de Magia mostra o custo para criar um espaço de\r\n"
				+ "magia de determinado nível. Você não pode criar espaços\r\n"
				+ "de magia acima do 5° nível.\r\n\n"
				+ "CRIANDO ESPAÇOS DE MAGIA\r\n\n"
				+ "Nível de Espaço de Magia Custo de Pontos de Feitiçaria\r\n"
				+ "1° 2\r\n"
				+ "2° 3\r\n"
				+ "3° 5\r\n"
				+ "4° 6\r\n"
				+ "5° 7\r\n"
				+ "Convertendo um Espaço de Magia em Pontos de\r\n"
				+ "Feitiçaria. Com uma ação bônus, no seu turno, você pode\r\n"
				+ "gastar um espaço de magia disponível e ganhar uma\r\n"
				+ "quantidade de pontos de feitiçaria igual ao nível do\r\n"
				+ "espaço.\r\n\n");
	}
	
	public void featsNivel3() {
		System.out.println("METAMÁGICA\r\n\n"
				+ "No 3° nível, você adquire a habilidade de distorcer suas\r\n"
				+ "magias para se adequarem às suas necessidades. Você\r\n"
				+ "ganha duas das seguintes opções de Metamágica, à sua\r\n"
				+ "escolha. Você adquire outra no 10° e 17° nível.\r\n"
				+ "Você pode usar apenas uma opção de Metamágica em\r\n"
				+ "uma magia quando a conjura, a não ser que esteja\r\n"
				+ "descrito o contrário.\r\n\n"
				+ "MAGIA ACELERADA\r\n\n"
				+ "Quando você conjurar uma magia que tenha um tempo de\r\n"
				+ "conjuração de 1 ação, você pode gastar 2 pontos de\r\n"
				+ "feitiçaria para mudar o tempo de conjuração para 1 ação\r\n"
				+ "bônus para essa magia.\r\n\n"
				+ "MAGIA AUMENTADA\r\n\n"
				+ "Quando você conjura uma magia que obriga uma criatura\r\n"
				+ "a realizar um teste de resistência contra o seu efeito, você\r\n"
				+ "pode gastar 3 pontos de feitiçaria para dar desvantagem a\r\n"
				+ "um alvo da magia no primeiro teste de resistência feito\r\n"
				+ "contra ela.\r\n\n"
				+ "MAGIA CUIDADOSA\r\n\n"
				+ "Quando você conjurar uma magia que obriga outras\r\n"
				+ "criaturas a realizarem um teste de resistência, você pode\r\n"
				+ "proteger algumas dessas criaturas da força total da\r\n"
				+ "magia. Para tanto, você gasta 1 ponto de feitiçaria e\r\n"
				+ "escolhe um número dessas criaturas até o seu modificador\r\n"
				+ "de Carisma (mínimo de uma criatura). Uma criatura\r\n"
				+ "escolhida passa automaticamente no teste de resistência\r\n"
				+ "contra a magia.\r\n\n"
				+ "MAGIA DISTANTE\r\n\n"
				+ "Quando você conjurar uma magia que tenha distância de\r\n"
				+ "1,5 metro ou maior, você pode gastar 1 ponto de feitiçaria\r\n"
				+ "para dobrar o alcance da magia.\r\n"
				+ "Quando você conjura uma magia com alcance de\r\n"
				+ "toque, você pode gastar 1 ponto de feitiçaria para mudar o\r\n"
				+ "alcance da magia para 9 metros.\r\n\n"
				+ "MAGIA DUPLICADA\r\n\n"
				+ "Quando você conjurar uma magia que seja incapaz de ter\r\n"
				+ "mais de uma criatura como alvo no nível atual dela e não\r\n"
				+ "possua alcance pessoal, você pode gastar um número de\r\n"
				+ "pontos de feitiçaria igual ao nível da magia para ter uma\r\n"
				+ "segunda criatura, no alcance da magia, como alvo (1\r\n"
				+ "ponto de feitiçaria se a magia for um truque).\r\n\n"
				+ "MAGIA ESTENDIDA\r\n\n"
				+ "Quando você conjurar uma magia que tenha duração de 1\r\n"
				+ "minuto ou maior, você pode gastar 1 ponto de feitiçaria\r\n"
				+ "para dobrar sua duração, até uma duração máxima de 24\r\n"
				+ "horas.\r\n\n"
				+ "MAGIA POTENCIALIZADA\r\n\n"
				+ "Quando você rola o dano de uma magia, você pode gastar\r\n"
				+ "1 ponto de feitiçaria para jogar novamente um número de\r\n"
				+ "dados de dano, até seu modificador de Carisma (mínimo\r\n"
				+ "de um). Você deve usar a nova rolagem.\r\n"
				+ "Você pode usar Magia Potencializada mesmo que você\r\n"
				+ "já tenha usado uma opção diferente de Metamágica\r\n"
				+ "durante a conjuração da magia.\r\n\n"
				+ "MAGIA SUTIL\r\n\n"
				+ "Quando você conjurar uma magia, você pode gastar 1\r\n"
				+ "ponto de feitiçaria para fazê-lo sem qualquer componente\r\n"
				+ "somático ou verbal.\r\n\n");
	}
	
	public void incrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando você atinge o 4° nível e novamente no 8°, 12°, 16°\r\n"
				+ "e 19° nível, você pode aumentar um valor de habilidade, à\r\n"
				+ "sua escolha, em 2 ou você pode aumentar dois valores de\r\n"
				+ "habilidade, à sua escolha, em 1. Como padrão, você não\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "característica.\r\n\n");
	}
	
	public void featsNivel20() {
		System.out.println("RESTAURAÇÃO MÍSTICA\r\n\n"
				+ "No 20° nível, você recupera 4 pontos de feitiçaria gastos\r\n"
				+ "sempre que você terminar um descanso curto.\r\n\n");
	}
	
//origens de feitiçaria
	public void origensFeiticaria() {
		System.out.println("ORIGENS DE FEITIÇARIA\r\n\n"
				+ "Diferentes feiticeiros possuem diferentes origens para sua\r\n"
				+ "magia inata. Apesar de muitas variações existirem, a\r\n"
				+ "maioria dessas origens caem em duas categorias: uma\r\n"
				+ "linhagem dracônica e magia selvagem.\r\n\n");
	}
	
//linhagem draconica
	public void linhagemDraco() {
		System.out.println("LINHAGEM DRACÔNICA\r\n\n"
				+ "Sua magia inata vem de magia dracônica que foi\r\n"
				+ "misturada ao seu sangue ou ao sangue dos seus\r\n"
				+ "ancestrais. Geralmente, os feiticeiros com essa origem\r\n"
				+ "traçam sua descendência de poderosos feiticeiros da\r\n"
				+ "antiguidade que fizeram uma barganha com um dragão\r\n"
				+ "ou que tenham um dragão como parente. Algumas dessas\r\n"
				+ "linhagens estão bem definidas no mundo, mas a maioria é\r\n"
				+ "obscura. Qualquer feiticeiro pode ser o primeiro de uma\r\n"
				+ "nova linhagem, como resultado de um pacto ou de outra\r\n"
				+ "circunstância excepcional.\r\n\n"
				+ "ANCESTRAL DRACÔNICO\r\n\n"
				+ "No 1° nível, você escolhe um tipo de dragão como seu\r\n"
				+ "ancestral. O tipo de dano associado a cada dragão será\r\n"
				+ "usado por características que você ganhará\r\n"
				+ "posteriormente.\r\n\n"
				+ "ANCESTRAL DRACÔNICO\r\n\n"
				+ "Dragão Tipo de Dano\r\n"
				+ "Azul Elétrico\r\n"
				+ "Branco Frio\r\n"
				+ "Bronze Elétrico\r\n"
				+ "Cobre Acido\r\n"
				+ "Latão Fogo\r\n"
				+ "Negro Acido\r\n"
				+ "Ouro Fogo\r\n"
				+ "Prata Frio\r\n"
				+ "Verde Veneno\r\n"
				+ "Vermelho Fogo\r\n"
				+ "Você pode falar, ler e escrever em Dracônico. Além\r\n"
				+ "disso, sempre que você fizer um teste de Carisma quando\r\n"
				+ "estiver interagindo com dragões, seu bônus de\r\n"
				+ "proficiência será dobrado se ele se aplicar a esse teste.\r\n\n"
				+ "RESILIÊNCIA DRACÔNICA\r\n\n"
				+ "A medida que a magia flui pelo seu corpo, ela faz com que\r\n"
				+ "os traços físicos do seu ancestral dracônico surjam. No 1°\r\n"
				+ "nível, seu máximo de pontos de vida aumenta em 1 e\r\n"
				+ "aumenta em mais 1 sempre que você ganhar um nível na\r\n"
				+ "classe.\r\n"
				+ "Além disso, partes da sua pele são cobertas com\r\n"
				+ "minúsculas escamas lustrosas de dragão. Quando você\r\n"
				+ "não estiver utilizando armadura, sua CA será igual a 13 +\r\n"
				+ "seu modificador de Destreza.\r\n\n");
	}
	
	public void linhagemDracoN6() {
		System.out.println("AFINIDADE ELEMENTAL\r\n\n"
				+ "A partir do 6° nível, quando você conjurar uma magia que\r\n"
				+ "cause dano do tipo associado ao seu ancestral dracônico,\r\n"
				+ "adicione seu modificador de Carisma ao dano. Ao mesmo\r\n"
				+ "tempo, você pode gastar 1 ponto de feitiçaria para ganhar\r\n"
				+ "resistência a esse tipo de dano por 1 hora. O bônus de\r\n"
				+ "dano se aplica a uma única rolagem de dano da magia,\r\n"
				+ "não à diversas rolagens.\r\n\n");
	}
	
	public void linhagemDracoN14() {
		System.out.println("ASAS DE DRAGÃO\r\n\n"
				+ "No 14° nível, você adquire a habilidade de brotar um par\r\n"
				+ "de asas de dragão das suas costas, ganhando\r\n"
				+ "deslocamento de voo igual ao seu deslocamento atual.\r\n"
				+ "Você pode criar essas asas com uma ação bônus, no seu\r\n"
				+ "turno. Elas duram até que você as dissipe, com uma ação\r\n"
				+ "bônus no seu turno.\r\n"
				+ "Você não pode manifestar suas asas quando estiver\r\n"
				+ "vestindo uma armadura, a não ser que a armadura seja\r\n"
				+ "feita para acomodá-las, e roupas que não forem feitas\r\n"
				+ "para se acomodar às suas asas devem ser destruídas\r\n"
				+ "quando você manifestá-las.\r\n\n");
	}
	
	public void linhagemDracoN18() {
		System.out.println("PRESENÇA DRACÔNICA\r\n\n"
				+ "A partir do 18° nível, você pode canalizar a assustadora\r\n"
				+ "presença do seu ancestral dracônico, fazendo com que\r\n"
				+ "aqueles que o rodeiam fiquem impressionados ou\r\n"
				+ "amedrontados. Com uma ação, você pode gastar 5 pontos\r\n"
				+ "de feitiçaria para recorrer a esse poder e exalar uma aura\r\n"
				+ "de admiração ou medo (à sua escolha) a uma distância de\r\n"
				+ "18 metros. Por 1 minuto ou até você perder sua\r\n"
				+ "concentração (como se você tivesse conjurado uma magia\r\n"
				+ "de concentração), cada criatura hostil que começar seu\r\n"
				+ "turno nessa aura, deve ser bem sucedido num teste de\r\n"
				+ "resistência de Sabedoria ou ficará enfeitiçada (se você\r\n"
				+ "escolheu admiração) ou amedrontada (se você escolheu\r\n"
				+ "medo) até a aura terminar. Uma criatura que seja bem\r\n"
				+ "sucedida no teste de resistência ficará imune a sua aura\r\n"
				+ "por 24 horas.\r\n\n");
	}
	
//Magia selvagem
	public void magiaSelvagem() {
		System.out.println("MAGIA SELVAGEM\r\n\n"
				+ "Sua magia inata vem das forças selvagens do caos que\r\n"
				+ "constituem a base da ordem da criação. Você deve ter\r\n"
				+ "sido exposto a algum tipo de magia bruta, talvez de um\r\n"
				+ "portal planar que levava ao Limbo, a Planos Elementais\r\n"
				+ "ou ao misterioso Reino Distante. Talvez você tenha sido\r\n"
				+ "abençoado por uma poderosa criatura feérica ou marcado\r\n"
				+ "por um corruptor. Ou sua magia pode ser uma\r\n"
				+ "casualidade do seu nascimento, sem qualquer razão\r\n"
				+ "aparente. No entanto, ela existe, essa magia caótica\r\n"
				+ "fervilha dentro de você, esperando por qualquer brecha.\r\n\n"
				+ "SURTO DE MAGIA SELVAGEM\r\n\n"
				+ "A partir do momento que você escolhe essa origem, no 1°\r\n"
				+ "nível, sua conjuração pode liberar surtos de magia\r\n"
				+ "selvagem. Imediatamente após você conjurar uma magia\r\n"
				+ "de feiticeiro de 1° nível ou superior, o Mestre pode\r\n"
				+ "solicitar que você role um d20. Se você rolar um 1, role na\r\n"
				+ "tabela Surto de Magia Selvagem para criar um efeito\r\n"
				+ "mágico aleatório. Um surto só pode ocorrer uma vez por\r\n"
				+ "turno. Se o efeito de um surto for uma magia, ela é muito\r\n"
				+ "selvagem para ser afetada por Metamagia. Se ela\r\n"
				+ "normalmente exige concentração, nesse caso não será\r\n"
				+ "necessário; a magia permanece por sua duração total.\r\n\n"
				+ "MARÉS DE CAOS\r\n\n"
				+ "A partir do 1° nível, você pode manipular as forças do\r\n"
				+ "acaso e do caos para ganhar vantagem em uma jogada de\r\n"
				+ "ataque, teste de habilidade ou teste de resistência.\r\n"
				+ "Quando o fizer, você deve finalizar um descanso longo\r\n"
				+ "antes de poder usar essa característica novamente.\r\n"
				+ "A qualquer momento, antes de recuperar o uso dessa\r\n"
				+ "característica, o Mestre pode rolar na tabela Surto de\r\n"
				+ "Magia Selvagem, imediatamente após você conjurar uma\r\n"
				+ "magia de feiticeiro de 1° nível ou superior. Após isso, você\r\n"
				+ "recupera o uso dessa característica.\r\n\n");
	}
	
	public void magiaSelvagemN6() {
		System.out.println("DOBRAR A SORTE\r\n\n"
				+ "A partir do 6° nível, você adquire a habilidade de mudar o\r\n"
				+ "destino usando sua magia selvagem. Quando outra\r\n"
				+ "criatura que você possa ver realizar uma jogada de\r\n"
				+ "ataque, um teste de habilidade ou um teste de resistência,\r\n"
				+ "você pode usar sua reação para gastar 2 pontos de\r\n"
				+ "feitiçaria para rolar 1d4 e aplicar o número rolado como\r\n"
				+ "um bônus ou uma penalidade (à sua escolha) na jogada da\r\n"
				+ "criatura. Você pode fazer isso depois da criatura fazer a\r\n"
				+ "jogada, mas antes do efeito ocorrer.\r\n\n");
	}
	
	public void magiaSelvagemN14() {
		System.out.println("CAOS CONTROLADO\r\n\n"
				+ "No 14° nível, você ganha um controle modico sobre seus\r\n"
				+ "surtos de magia selvagem. Sempre que você rolar a tabela\r\n"
				+ "Surto de Magia Selvagem, você pode rolar duas vezes e\r\n"
				+ "usar qualquer resultado.\r\n\n");
	}
	
	public void magiaSelvagemN18() {
		System.out.println("BOMBARDEIO DE MAGIA\r\n\n"
				+ "A partir do 18° nível, a energia nociva das suas magias se\r\n"
				+ "intensifica. Quando você rolar o dano de uma magia e\r\n"
				+ "rolar o maior dano possível em qualquer dado, escolha um\r\n"
				+ "desses dados, role ele novamente e adicione o valor rolado\r\n"
				+ "ao dano. Você pode usar essa característica apenas uma\r\n"
				+ "vez por rodada.\r\n\n");
	}
}
