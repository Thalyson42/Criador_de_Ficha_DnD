package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Clerigo extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Clerigo";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
	public void clerigoDescricao() {
		System.out.println("CLÉRIGO\r\n\n"
				+ "Os braços e olhos erguem-se na direção do sol e com uma\r\n"
				+ "prece em seus lábios, um elfo começa a brilhar com luz\r\n"
				+ "própria, que irradia para curar seus surrados\r\n"
				+ "companheiros em batalha.\r\n"
				+ "Com um cântico de batalha, um anão golpeia com seu\r\n"
				+ "machado por todos os lados, abrindo caminho em meio às\r\n"
				+ "linhas de orcs posicionadas contra ele, louvando os deuses\r\n"
				+ "por cada inimigo derrubado.\r\n"
				+ "Invocando maldições contra as forças de mortos-vivos,\r\n"
				+ "um humano levanta seu símbolo sagrado enquanto a luz\r\n"
				+ "divina brilha ao seu redor, banindo as criaturas que há\r\n"
				+ "um momento atrás se amontoavam sobre seus\r\n"
				+ "companheiros.\r\n"
				+ "Clérigos são intermediadores entre o mundo mortal e o\r\n"
				+ "distante plano dos deuses. Tão variados quanto os deuses\r\n"
				+ "que servem, clérigos se esforçam para ser a própria mão\r\n"
				+ "de seus deuses. Não é apenas um sacerdote comum, mas\r\n"
				+ "alguém investido de poder divino.\r\n\n"
				+ "CURANDEIROS E COMBATENTES\r\n\n"
				+ "Magia divina, como o nome sugere, é o poder dos deuses\r\n"
				+ "fluindo deles para o mundo mortal. Clérigos são os\r\n"
				+ "condutores desse poder, manifestando-o através de efeitos\r\n"
				+ "milagrosos. Os deuses não conferem esse poder a\r\n"
				+ "qualquer um que o queira, mas apenas àqueles escolhidos\r\n"
				+ "para cumprir o chamado.\r\n"
				+ "Fazer uso do poder divino não envolve estudo ou\r\n"
				+ "treinamento. Um clérigo pode aprender ritos antigos e\r\n"
				+ "preces específicas, mas a habilidade de usar magias\r\n"
				+ "divinas depende de devoção e de uma intuição poderosa\r\n"
				+ "sobre os desejos da divindade.\r\n"
				+ "Clérigos combinam o poder mágico de curar e inspirar\r\n"
				+ "seus aliados com magias que ferem e debilitam seus\r\n"
				+ "inimigos. Eles podem causar medo e pavor, espalhar\r\n"
				+ "pragas ou venenos, e até lançar fogo divino para consumir\r\n"
				+ "seus inimigos. Para aqueles malfeitores que merecem\r\n"
				+ "uma maça na têmpora, o clérigo se utiliza de seu\r\n"
				+ "treinamento de combate para enfrentar seus inimigos\r\n"
				+ "corpo-a-corpo, auxiliado pelo poder divino.\r\n\n"
				+ "AGENTES DIVINOS\r\n\n"
				+ "Nem todo acólito ou servo em um templo ou santuário é\r\n"
				+ "necessariamente um clérigo. Alguns sacerdotes são\r\n"
				+ "chamados para uma vida simples de servidão,\r\n"
				+ "propagando a vontade de seu deus através de preces e\r\n"
				+ "sacrifício, e não através de magia ou poderio militar. Em\r\n"
				+ "algumas cidades, o sacerdócio equivale a um escritório\r\n"
				+ "político, visto como um degrau sólido para alcançar\r\n"
				+ "patamares superiores de autoridade e não envolvendo\r\n"
				+ "qualquer comunhão com a divindade. Clérigos\r\n"
				+ "verdadeiros são raros nas estruturas hierárquicas.\r\n"
				+ "Quando um clérigo inicia uma vida como aventureiro,\r\n"
				+ "geralmente é porque seu deus exigiu assim. Perseguir os\r\n"
				+ "objetivos de um deus geralmente envolve enfrentar\r\n"
				+ "perigos além dos limites da civilização, destruindo o mal\r\n"
				+ "ou buscando relíquias sagradas em tumbas antigas.\r\n"
				+ "Muitos clérigos são ainda requisitados para defender os\r\n"
				+ "adoradores de seu deus, o que pode significar combater\r\n"
				+ "ogros em fúria, negociar a paz entre nações ou selar um\r\n"
				+ "portal que permitiria que um corruptor entrasse no Plano\r\n"
				+ "Material.\r\n"
				+ "A maioria dos clérigos aventureiros mantém conexões\r\n"
				+ "com templos e ordens de sua religião. Um templo pode\r\n"
				+ "pedir a ajuda de um clérigo ou um sumo-sacerdote pode\r\n"
				+ "ter poder suficiente para exigir seus serviços.\r\n\n");
	}
	
	public void clerigoConstrucaorapida() {
		System.out.println("CONSTRUÇÃO RÁPIDA\r\n\n"
				+ "Você pode fazer um clérigo rapidamente ao seguir estas\r\n"
				+ "sugestões. Primeiro, Sabedoria deve ser sua habilidade\r\n"
				+ "mais alta, seguido de Força ou Constituição. Segundo,\r\n"
				+ "escolha o antecedente Acólito.\r\n\n");
	}
	
	public void clerigoCaracteristicasClasse() {
		System.out.println("PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por nível de clérigo\r\n"
				+ "Pontos de Vida no 1° Nível: 8 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constituição por nível de clérigo após o\r\n"
				+ "1°\r\n\n"
				+ "PROFICIÊNCIAS\r\n\n"
				+ "Armaduras: Armaduras leves, armaduras médias,\r\n"
				+ "escudos\r\n"
				+ "Armas: Todas as armas simples\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resistência: Sabedoria, Carisma\r\n"
				+ "Perícias: Escolha duas dentre História, Intuição,\r\n"
				+ "Medicina, Persuasão e Religião\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma maça ou (b) um martelo de guerra (se for\r\n"
				+ "proficiente)\r\n"
				+ "- (a) brunea, (b) armadura de couro ou (c) cota de malha\r\n"
				+ "(se for proficiente)\r\n"
				+ "- (a) um besta leve e 20 virotes ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "- (a) um pacote de sacerdote ou (b) um pacote de\r\n"
				+ "aventureiro\r\n"
				+ "- Um escudo e um símbolo sagrado\r\n\n");
	}
	
	public void setClerigo() {
		getFicha().setClasse("Clerigo");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Armaduras leves", "Armaduras médias", "Escudos");
//		getProficiencia().setFicha(ficha);
		getProficiencia().SetProfEquips(profEquips);
		getProficiencia().SetProfEquips(getEquips().getArmas_simples_CAC());
		getProficiencia().SetProfEquips(getEquips().getArmas_simples_distancia());
		List<String> profResist = Arrays.asList("Sabedoria", "Carisma");
		getProficiencia().SetResistencia(profResist);
		List<String> profPericias = Arrays.asList("História", "Intuição", "Medicina", "Persuasão", "Religião");
		getProficiencia().setPericias(profPericias, 2);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
		equips4();
		getFicha().setEquipamentos("Escudo");
		getFicha().setEquipamentos("Símbolo sagrado");
//		this.magias.setFicha(ficha);
		getMagias().truquesClerigo();
		getMagias().setMagiasClerigoLV1();
//		this.ficha = this.magias.getFicha();
		getFicha().setHabilidade_conjuracao("Sabedoria");
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
		
	}
	
	public void equips2() {
		
	}
	
	public void equips3() {
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
	
	public void equips4() {
		getEquips().setPacotes("Pacote de Sacerdote", "Pacote de Aventureiro");
	}
//Clérigo feats padrao
	public void clerigoFeatsPadrao() {
		System.out.println("CONJURAÇÃO\r\n\n"
				+ "Como um canalizador de poder divino, você pode conjurar\r\n"
				+ "magias de clérigo. Veja o capítulo 10 para as regras gerais\r\n"
				+ "de conjuração e o capítulo 11 para a lista de magias de\r\n"
				+ "clérigo.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Você conhece três truques, à sua escolha, da lista de\r\n"
				+ "magias de clérigo. Você aprende truques de clérigo\r\n"
				+ "adicionais, à sua escolha, em níveis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Clérigo.\r\n\n"
				+ "PREPARANDO E CONJURANDO MAGIAS\r\n\n"
				+ "A tabela O Clérigo mostra quantos espaços de magia você\r\n"
				+ "têm para conjurar suas magias de 1º nível e superiores.\r\n"
				+ "Para conjurar uma dessas magias, você precisa gastar um\r\n"
				+ "espaço do nível da magia ou superior. Você recupera todos\r\n"
				+ "os espaços gastos quando termina um descanso longo.\r\n"
				+ "Você prepara a lista de magias disponíveis\r\n"
				+ "selecionando-as da lista de magias de clérigo. Você\r\n"
				+ "seleciona um número de magias igual ao seu modificador\r\n"
				+ "de Sabedoria + seu nível de clérigo (mínimo de uma\r\n"
				+ "magia). Essas magias devem ser de níveis que você\r\n"
				+ "possua espaços de magia.\r\n"
				+ "Por exemplo, se você é um clérigo de 3º nível, você\r\n"
				+ "possui quatro espaços de magia de 1º nível e dois de 2º\r\n"
				+ "nível. Com Sabedoria 16, sua lista de magias preparadas\r\n"
				+ "pode incluir 6 magias, combinando as de 1º e 2º nível em\r\n"
				+ "qualquer ordem. Se você preparar a magia de 1º nível\r\n"
				+ "curar ferimentos, você pode conjurá-la com um espaço de\r\n"
				+ "magia de 1º ou de 2º nível. Ao conjurar a magia, você não\r\n"
				+ "a retira de sua lista de magias preparadas, podendo\r\n"
				+ "conjurá-la de novo se tiver espaços de magia disponíveis.\r\n\n"
				+ "Você pode modificar a sua lista de magias preparadas\r\n"
				+ "quando termina um descanso longo. Preparar uma nova\r\n"
				+ "lista de magias de clérigo requer tempo gasto em preces e\r\n"
				+ "meditação: no mínimo 1 minuto por nível de magia para\r\n"
				+ "cada magia preparada.\r\n\n"
				+ "HABILIDADE DE CONJURAÇÃO\r\n\n"
				+ "Sabedoria é a sua habilidade para você conjurar suas\r\n"
				+ "magias de clérigo. O poder de suas magias vem da\r\n"
				+ "devoção que você tem ao seu deus. Você usa sua\r\n"
				+ "Sabedoria sempre que alguma magia se referir a sua\r\n"
				+ "habilidade de conjurar magias. Além disso, você usa o seu\r\n"
				+ "modificador de Sabedoria para definir a CD dos testes de\r\n"
				+ "resistência para as magias de clérigo que você conjura e\r\n"
				+ "quando você realiza uma jogada de ataque com uma\r\n"
				+ "magia.\r\n"
				+ "CD para suas magias = 8 + bônus de proficiência +\r\n"
				+ "seu modificador de Sabedoria\r\n"
				+ "Modificador de ataque de magia = seu bônus de proficiência +\r\n"
				+ "seu modificador de Sabedoria\r\n\n"
				+ "CONJURAÇÃO DE RITUAL\r\n\n"
				+ "Você pode conjurar qualquer magia de clérigo que você\r\n"
				+ "conheça como um ritual se ela possuir o descritor ritual.\r\n\n"
				+ "FOCO DE CONJURAÇÃO\r\n\n"
				+ "Você pode usar um símbolo sagrado (encontrado no\r\n"
				+ "capítulo 5) como foco de conjuração das suas magias de\r\n"
				+ "clérigo.\r\n\n"
				+ "DOMÍNIO DIVINO\r\n\n"
				+ "Escolha um domínio relacionado à sua divindade:\r\n"
				+ "Conhecimento, Enganação, Guerra, Luz, Natureza,\r\n"
				+ "Tempestade ou Vida. Cada domínio é detalhado ao final\r\n"
				+ "da descrição da classe e, cada um, fornece exemplos dos\r\n"
				+ "deuses associados a eles. Essa escolha, realizada no 1º\r\n"
				+ "nível, concede magias de domínio e outras características.\r\n"
				+ "Ela também concede a você outras formas de utilizar seu\r\n"
				+ "Canalizar Divindade quando você ganhá-lo no 2º nível,\r\n"
				+ "bem como outros benefícios no 6º, 8º e 17º níveis.\r\n\n"
				+ "MAGIAS DE DOMÍNIO\r\n\n"
				+ "Cada domínio tem uma lista de magias – as magias de\r\n"
				+ "domínio – que você adquire nos níveis especificados pelo\r\n"
				+ "seu domínio. Quando você ganha uma magia de domínio,\r\n"
				+ "você sempre a tem preparada, e essa magia não conta no\r\n"
				+ "número de magias que você pode preparar a cada dia.\r\n"
				+ "Se você tem uma magia de domínio que não aparece\r\n"
				+ "na lista de magias de clérigo, mesmo assim ela é uma\r\n"
				+ "magia de clérigo para você.\r\n\n");
	}
	
//Clérigo feats nivel 2
	public void clerigoFeatsNivel2() {
		System.out.println("CANALIZAR DIVINDADE\r\n\n"
				+ "No 2º nível, você se torna capaz de canalizar energia\r\n"
				+ "diretamente de sua divindade, utilizando-a como\r\n"
				+ "combustível para efeitos mágicos. Você começa com dois\r\n"
				+ "efeitos: Expulsar Mortos-vivos e um efeito determinado\r\n"
				+ "pelo seu domínio. Alguns domínios conferem efeitos\r\n"
				+ "adicionais conforme você avança de nível, como consta na\r\n"
				+ "descrição de cada domínio.\r\n"
				+ "Quando você usar seu Canalizar Divindade, você\r\n"
				+ "escolhe qual efeito quer criar. Você precisa terminar um\r\n"
				+ "descanso curto ou longo para usar a característica de\r\n"
				+ "novo.\r\n"
				+ "Alguns efeitos requerem teste de resistência. Quando\r\n"
				+ "você usar um desses efeitos, a CD é igual a das suas\r\n"
				+ "magias de clérigo.\r\n"
				+ "A partir do 6º nível, você pode Canalizar Divindade\r\n"
				+ "duas vezes entre descansos e a partir do 18º nível, três\r\n"
				+ "vezes. Você recupera os usos dessa característica quando\r\n"
				+ "termina um descanso curto ou longo.\r\n\n"
				+ "CANALIZAR DIVINDADE: EXPULSAR MORTOS-VIVOS\r\n\n"
				+ "Usando uma ação, você levanta seu símbolo sagrado e\r\n"
				+ "murmura uma prece repreendendo os mortos-vivos. Cada\r\n"
				+ "morto-vivo que puder ver ou ouvir você em um raio de 9\r\n"
				+ "metros a partir de você, deve fazer um teste de resistência\r\n"
				+ "de Sabedoria. Se falhar, a criatura está expulsa por 1\r\n"
				+ "minuto ou até sofrer algum dano.\r\n"
				+ "Uma criatura expulsa deve usar seu turno para fugir\r\n"
				+ "da melhor forma possível e de forma alguma pode\r\n"
				+ "aproximar-se a mais de 9 metros de você por vontade\r\n"
				+ "própria. Ela também não pode usar reações. Como uma\r\n"
				+ "ação, a criatura pode apenas realizar uma Disparada ou\r\n"
				+ "tentar escapar de um efeito que a impeça de se mover.\r\n"
				+ "Se não há lugar para ir, a criatura pode usar a ação\r\n"
				+ "Esquivar.\r\n\n");
	}
	
//Clérigo incremento no valor de habilidade
	public void clerigoIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando você atinge o 4° nível e novamente no 8°, 12°, 16°\r\n"
				+ "e 19° nível, você pode aumentar um valor de habilidade, à\r\n"
				+ "sua escolha, em 2 ou você pode aumentar dois valores de\r\n"
				+ "habilidade, à sua escolha, em 1. Como padrão, você não\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "característica.\r\n\n");
	}

//Nivel 5
	public void nivel5() {
		System.out.println("DESTRUIR MORTOS-VIVOS\r\n\n"
				+ "A partir do 5º nível, quando um morto-vivo falhar no teste\r\n"
				+ "de resistência contra a sua característica Expulsar\r\n"
				+ "Mortos-vivos, ele é instantaneamente destruído se o Nível\r\n"
				+ "de Desafio dele for menor ou igual ao valor da tabela\r\n"
				+ "Destruir Mortos-vivos, de acordo com seu nível de clérigo.\r\n"
				+ "DESTRUIR MORTOS-VIVOS\r\n"
				+ "Nível de\r\n"
				+ "Clérigo\r\n"
				+ "Destrói Mortos-Vivos de ND\r\n"
				+ "5° 1/2 ou menor\r\n"
				+ "8° 1 ou menor\r\n"
				+ "11° 2 ou menor\r\n"
				+ "14° 3 ou menor\r\n"
				+ "17° 4 ou menor\r\n\n");
	}
	
//Nivel 10
	public void nivel10() {
		System.out.println("INTERVENÇÃO DIVINA\r\n"
				+ "A partir do 10º nível, você pode rogar à sua divindade\r\n"
				+ "para que auxilie você em uma árdua tarefa.\r\n"
				+ "Implorar pelo auxílio requer uma ação. Você precisa\r\n"
				+ "descrever o que busca e realizar uma rolagem de dado de\r\n"
				+ "percentagem. Se o resultado for menor ou igual ao seu\r\n"
				+ "nível de clérigo, sua divindade intervém. O Mestre\r\n"
				+ "escolhe a natureza da intervenção. O efeito de qualquer\r\n"
				+ "magia de clérigo ou magia de domínio é apropriado como\r\n"
				+ "resultado.\r\n"
				+ "Se sua divindade intervir, você fica impedido de usar\r\n"
				+ "essa característica de novo por 7 dias. Do contrário, você\r\n"
				+ "pode usá-la de novo após terminar um descanso longo.\r\n"
				+ "No 20º nível, seus pedidos de intervenção funcionam\r\n"
				+ "automaticamente, sem necessidade de rolagem de dados.\r\n");
	}
	
//Dominios divinos
	public void dominiosdivinos() {
		System.out.println("DOMÍNIOS DIVINOS\r\n\n"
				+ "Em um panteão, cada divindade tem influência sobre\r\n"
				+ "certos aspectos da vida mortal e da civilização, chamados\r\n"
				+ "de domínios divinos. Juntando-se os domínios sobre os\r\n"
				+ "quais uma divindade tem influência, têm-se um conjunto\r\n"
				+ "denominado portfólio da divindade. Por exemplo, o\r\n"
				+ "portfólio do deus grego Apolo inclui os domínios do\r\n"
				+ "Conhecimento, da Luz e da Vida. Como um clérigo, você\r\n"
				+ "escolhe um aspecto de sua divindade para enfatizar,\r\n"
				+ "ganhando os poderes relativos àquele domínio.\r\n"
				+ "Essa escolha pode ainda corresponder a um grupo\r\n"
				+ "dedicado àquele deus. Apolo, por exemplo, pode ser\r\n"
				+ "venerado em uma região como Phoebus (“radiante”)\r\n"
				+ "Apolo, enfatizando sua associação sobre o domínio da Luz,\r\n"
				+ "e em outro local como Apolo Acesius (“curandeiro”),\r\n"
				+ "enfatizando seu domínio sobre a Vida. Da mesma forma, o\r\n"
				+ "domínio que você escolher poderia simplesmente\r\n"
				+ "representar uma preferência pessoal, o aspecto da\r\n"
				+ "divindade que mais agrada você.\r\n"
				+ "A descrição de cada domínio inclui exemplos de\r\n"
				+ "divindades que têm influência sobre eles. Estão incluídos\r\n"
				+ "deuses dos mundos dos Reinos Esquecidos, Greyhawk,\r\n"
				+ "Dragonlance e de Eberron, além dos antigos panteões\r\n"
				+ "Celta, Egípcio, Grego e Nórdico.\r\n\n");
	}

//dominio do conhecimento
	public void dominiodoCon() {
		System.out.println("DOMÍNIO DO CONHECIMENTO\r\n\n"
				+ "Os deuses do conhecimento – como Oghma, Boccob,\r\n"
				+ "Gilean, Aureon e Thoth – valorizam o estudo e\r\n"
				+ "compreensão acima de tudo. Alguns ensinam que o\r\n"
				+ "conhecimento deve ser coletado e partilhado em\r\n"
				+ "bibliotecas e universidades ou promovem o conhecimento\r\n"
				+ "prático do artesanato e da invenção. Algumas divindades\r\n"
				+ "escondem conhecimentos e os mantem em segredo para si\r\n"
				+ "mesmos. E outros prometem a seus seguidores que eles\r\n"
				+ "ganharão poderes tremendos se desvendarem os segredos\r\n"
				+ "do multiverso. Os seguidores desses deuses estudam\r\n"
				+ "conhecimento exotérico, coletam tomos antigos, escavam\r\n"
				+ "locais secretos da terra e aprendem tudo que podem.\r\n"
				+ "Alguns deuses do conhecimento que promovem a prática\r\n"
				+ "de ofícios e criação incluem deuses da forja como Gond,\r\n"
				+ "Reorx, Onatar, Moradin, Hefesto e Goibhniu.\r\n\n"
				+ "MAGIAS DO DOMÍNIO DO CONHECIMENTO\r\n\n"
				+ "Nível de Clérigo Magias\r\n"
				+ "1° comando, identificação\r\n"
				+ "3° augúrio, sugestão\r\n"
				+ "5° dificultar detecção, falar com os mortos\r\n"
				+ "7° olho arcano, confusão\r\n"
				+ "9° conhecimento lendário, vidência\r\n\n"
				+ "BÊNÇÃOS DO CONHECIMENTO\r\n\n"
				+ "No 1° nível, você aprende dois idiomas, à sua escolha.\r\n"
				+ "Você também se torna proficiente em duas perícias, à sua\r\n"
				+ "escolha, dentre as seguintes: Arcanismo, História,\r\n"
				+ "Natureza ou Religião.\r\n"
				+ "Seu bônus de proficiência é dobrado em qualquer teste\r\n"
				+ "de habilidade que você fizer usando qualquer dessas\r\n"
				+ "perícias.\r\n\n");
	}
	
//Dominio do conhecimento nivel 2
	public void dominiodoConN2() {
		System.out.println("CANALIZAR DIVINDADE: CONHECIMENTO DAS ERAS\r\n\n"
				+ "A partir do 2° nível, você pode usar seu Canalizar\r\n"
				+ "Divindade para beber da fonte divina do conhecimento.\r\n"
				+ "Com uma ação, você escolhe uma perícia ou ferramenta.\r\n"
				+ "Por 10 minutos, você terá proficiência com a perícia ou\r\n"
				+ "ferramenta escolhida.\r\n\n");
	}
	
//dominio do conhecimento nivel 6
	public void dominiodoConN6() {
		System.out.println("CANALIZAR DIVINDADE: LER PENSAMENTOS\r\n\n"
				+ "No 6° nível, você pode usar seu Canalizar Divindade para\r\n"
				+ "ler a mente de uma criatura. Você pode, então, usar seu\r\n"
				+ "acesso a mente da criatura para comandá-la.\r\n"
				+ "Com uma ação, escolha uma criatura que você possa\r\n"
				+ "ver que esteja a até 18 metros de você. Essa criatura deve\r\n"
				+ "realizar um teste de resistência de Sabedoria, se for bem\r\n"
				+ "sucedida nesse teste, você não poderá usar essa\r\n"
				+ "característica contra ela novamente até terminar um\r\n"
				+ "descanso longo.\r\n"
				+ "Se a criatura falhar no teste, você pode ler seus\r\n"
				+ "pensamentos superficiais (aqueles mais atuais, que\r\n"
				+ "refletem suas emoções e no que você está pensando\r\n"
				+ "constantemente) quando estiver a até 18 metros de você.\r\n"
				+ "Esse efeito dura por 1 minuto.\r\n"
				+ "Durante esse tempo, você pode usar sua ação para\r\n"
				+ "terminar esse efeito e conjurar a magia sugestão na\r\n"
				+ "criatura sem gastar um espaço de magia. O alvo falha\r\n"
				+ "automaticamente no teste de resistência contra essa\r\n"
				+ "magia.\r\n\n");
	}
	
//dominio do conhecimento nivel 8
	public void dominiodoConN8() {
		System.out.println("CONJURAÇÃO PODEROSA\r\n\n"
				+ "A partir do 8° nível, você adiciona seu modificador de\r\n"
				+ "Sabedoria no dano causado por qualquer truque de\r\n"
				+ "clérigo.\r\n\n");
	}
	
//dominio do conhecimento nivel 17
	public void dominiodoConN17() {
		System.out.println("VISÕES DO PASSADO\r\n\n"
				+ "A partir do 17° nível, você pode convocar visões do\r\n"
				+ "passado relacionadas a um objeto que você esteja\r\n"
				+ "segurando ou sobre o ambiente ao seu redor. Você gasta\r\n"
				+ "pelo menos 1 minuto meditando e rezando, então, recebe\r\n"
				+ "oníricos vislumbres turvos dos eventos recentes. Você\r\n"
				+ "pode meditar dessa maneira por um número de minutos\r\n"
				+ "igual ao seu valor de Sabedoria e deve manter a\r\n"
				+ "concentração durante esse tempo, como se você estivesse\r\n"
				+ "conjurando uma magia.\r\n"
				+ "Quando você usa essa característica, você não pode\r\n"
				+ "usá-la novamente até terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n"
				+ "Leitura de Objeto. Ao segurar um objeto enquanto\r\n"
				+ "medita, você pode ter visões do dono anterior do objeto.\r\n"
				+ "Depois de meditar por 1 minuto, você descobre como o\r\n"
				+ "antigo dono adquiriu e perdeu o objeto, assim como o\r\n"
				+ "evento recente mais significativo envolvendo o objeto e\r\n"
				+ "seu dono. Se o objeto foi portado por outra criatura num\r\n"
				+ "passado recente (dentro de um número de dias igual ao\r\n"
				+ "seu valor de Sabedoria), você pode gastar 1 minuto\r\n"
				+ "adicional, por cada dono, para descobrir as mesmas\r\n"
				+ "informações sobre essa criatura.\r\n\n"
				+ "Leitura Local. À medida que você medita, você tem\r\n"
				+ "visões dos eventos recentes nas suas vizinhanças\r\n"
				+ "próximas (uma sala, rua, túnel, clareira, ou similar, de\r\n"
				+ "até 15 metros cúbicos), voltando um número de dias igual\r\n"
				+ "ao seu valor de Sabedoria. Para cada minuto que você\r\n"
				+ "meditar, você descobre sobre um evento significativo, a\r\n"
				+ "partir dos mais recentes. Eventos significativos,\r\n"
				+ "normalmente envolvem emoções fortes, como batalhas e\r\n"
				+ "traições, casamentos e assassinatos, nascimentos e\r\n"
				+ "funerais. No entanto, também podem incluir eventos mais\r\n"
				+ "mundanos, que podem ser, no entanto, relevantes na sua\r\n"
				+ "situação atual.\r\n\n");
	}
	
//dominio da enganação
	public void dominioEn() {
		System.out.println("DOMÍNIO DA ENGANAÇÃO\r\n\n"
				+ "Deuses da enganação – como Tymora, Beshaba,\r\n"
				+ "Olidammara, o Viajante, Garl Glittergold e Loki – são\r\n"
				+ "causadores de travessuras e instigadores que se mantem\r\n"
				+ "como um desafio constante para a aceitação das ordens\r\n"
				+ "tanto de mortais quanto dos deuses. Eles são patronos dos\r\n"
				+ "ladrões, trapaceiros, apostadores, rebeldes e libertadores.\r\n"
				+ "Seus clérigos são uma força intrometida no mundo,\r\n"
				+ "ferindo orgulhos, zombando de tiranos, roubando dos\r\n"
				+ "ricos, libertando cativos e desrespeitando tradições\r\n"
				+ "vazias. Eles preferem subterfúgio, trapaças, enganação e\r\n"
				+ "rouba no lugar do confronto direto.\r\n"
				+ "MAGIAS DO DOMÍNIO DA ENGANAÇÃO\r\n\n"
				+ "Nível de Clérigo Magias\r\n\n"
				+ "1° enfeitiçar pessoa, disfarçar-se\r\n"
				+ "3° reflexos, passos sem pegadas\r\n"
				+ "5° piscar, dissipar magia\r\n"
				+ "7° porta dimensional, metamorfose\r\n"
				+ "9° dominar pessoa, modificar memória\r\n"
				+ "BÊNÇÃO DO TRAPACEIRO\r\n\n"
				+ "A partir do momento em que você escolhe esse domínio,\r\n"
				+ "no 1° nível, você pode usar sua ação para tocar uma\r\n"
				+ "criatura voluntária além de você mesmo para conceder\r\n"
				+ "vantagem em testes de Destreza (Furtividade). Essa\r\n"
				+ "bênção dura por 1 hora ou até você usar essa\r\n"
				+ "característica novamente.\r\n\n");
	}
	
//dominio da enganação nivel 2
	public void dominioEnN2() {
		System.out.println("CANALIZAR DIVINDADE: INVOCAR DUPLICIDADE\r\n\n"
				+ "A partir do 2° nível, você pode usar seu Canalizar\r\n"
				+ "Divindade para criar uma duplicada ilusória de si mesmo.\r\n"
				+ "Com uma ação, você cria uma ilusão perfeita de si\r\n"
				+ "mesmo que dura por 1 minuto ou até você perder sua\r\n"
				+ "concentração (como se você estivesse se concentrando em\r\n"
				+ "uma magia). A ilusão aparece em um espaço desocupado\r\n"
				+ "que você possa ver a até 9 metros de você. Com uma ação\r\n"
				+ "bônus, no seu turno, você pode mover a ilusão até 9\r\n"
				+ "metros para um espaço que você possa ver, mas ela deve\r\n"
				+ "permanecer a até 36 metros de você.\r\n"
				+ "Pela duração, você pode conjurar magias como se você\r\n"
				+ "estivesse no espaço ocupado pela ilusão, mas você deve\r\n"
				+ "usar seus próprios sentidos. Além disso, quando ambos\r\n"
				+ "você e sua ilusão estiverem a 1,5 metro de uma criatura\r\n"
				+ "que possa ver a ilusão, você tem vantagem nas jogadas de\r\n"
				+ "ataque contra essa criatura, devido a distração causada\r\n"
				+ "no alvo pela ilusão.\r\n\n");
	}
	
//dominio da enganação nivel 6
	public void dominioEnN6() {
		System.out.println("CANALIZAR DIVINDADE: MANTO DE SOMBRAS\r\n\n"
				+ "No 6° nível, você pode usar seu Canalizar Divindade para\r\n"
				+ "desaparecer.\r\n"
				+ "Com uma ação, você se torna invisível até o final do\r\n"
				+ "seu próximo turno. Você se torna visível se atacar ou\r\n"
				+ "conjurar uma magia.\r\n\n");
	}
	
//dominio da enganação nivel 8
	public void dominioEnN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8º nível, você ganha a habilidade de imbuir seus\r\n"
				+ "ataques com arma com veneno – uma dádiva da sua\r\n"
				+ "divindade. Uma vez em cada um de seus turnos, quando\r\n"
				+ "você acertar uma criatura com um ataque com arma, você\r\n"
				+ "pode fazer o ataque causar 1d8 de dano de veneno extra\r\n"
				+ "ao alvo. Quando alcançar o 14º nível, o dano extra\r\n"
				+ "aumenta para 2d8.\r\n\n");
	}
	
//dominio da enganação nivel 17
	public void dominioEnN17() {
		System.out.println("DUPLICIDADE APRIMORADA\r\n\n"
				+ "A partir do 17° nível, você pode criar até quatro\r\n"
				+ "duplicatas de você, ao invés de uma, quando usar Invocar\r\n"
				+ "Duplicidade. Com uma ação bônus, no seu turno, você\r\n"
				+ "pode mover quantas duplicadas quiser até 9 metros, até\r\n"
				+ "no máximo de 36 metros de distância.\r\n\n");
	}
	
//dominio da guerra
	public void dominioGuerra() {
		System.out.println("DOMÍNIO DA GUERRA\r\n\n"
				+ "A guerra tem muitas manifestações. Ela pode tornar\r\n"
				+ "pessoas comuns em heróis. Ela pode ser desesperadora e\r\n"
				+ "horripilante, com atos de crueldade e covardia\r\n"
				+ "obscurecendo momentos de bravura e coragem. Em ambos\r\n"
				+ "os casos, os deuses da guerra zelam pelos guerreiros e os\r\n"
				+ "recompensa pelos seus grandes feitos. Os clérigos de tais\r\n"
				+ "deuses se sobressaem em batalha, inspirando os outros a\r\n"
				+ "lutar o bom combate ou oferecendo atos de violência como\r\n"
				+ "suas orações. Entre os deuses da guerra estão inclusos\r\n"
				+ "campeões da honra e bravura (como Torm, Heironeous e\r\n"
				+ "Kir-Jolith) assim como deuses da destruição e pilhagem\r\n"
				+ "(como Erythnul, a Fúria, Gruumsh e Ares) e deuses da\r\n"
				+ "conquista e dominação (como Bane, Hextor e Maglubiyet).\r\n"
				+ "Outros deuses da guerra (como Tempus, Nike e Nuada)\r\n"
				+ "tomam uma postura mais neutra, promovendo a guerra\r\n"
				+ "em todas as suas manifestações e apoiando os guerreiros\r\n"
				+ "em qualquer circunstância.\r\n\n"
				+ "MAGIAS DO DOMÍNIO DA GUERRA\r\n\n"
				+ "Nível de Clérigo Magias\r\n"
				+ "1° auxílio divino, escudo da fé\r\n"
				+ "3° arma mágica, arma espiritual\r\n"
				+ "5° manto do cruzado, espíritos guardiões\r\n"
				+ "7° movimentação livre, pele de pedra\r\n"
				+ "9° coluna de chamas, imobilizar monstro\r\n\n"
				+ "PROFICIÊNCIA ADICIONAL\r\n\n"
				+ "No 1° nível, você adquire proficiência em armas marciais\r\n"
				+ "e em armaduras pesadas.\r\n\n"
				+ "SACERDOTE DA GUERRA\r\n\n"
				+ "A partir do 1° nível, seu deus envia rajadas de inspiração\r\n"
				+ "a você quando você está engajado em combate. Quando\r\n"
				+ "você usa a ação de Ataque, você pode realizar um ataque\r\n"
				+ "com arma, com uma ação bônus.\r\n"
				+ "Você pode usar essa característica um número de\r\n"
				+ "vezes igual ao seu modificador de Sabedoria (mínimo uma\r\n"
				+ "vez). Você recupera todos os usos gastos após terminar\r\n"
				+ "um descanso longo.\r\n\n");
	}
	
	public void dominioGuerraN2() {
		System.out.println("CANALIZAR DIVINDADE: ATAQUE DIRIGIDO\r\n\n"
				+ "A partir do 2° nível, você pode usar seu Canalizar\r\n"
				+ "Divindade para golpear com precisão sobrenatural.\r\n"
				+ "Quando você realiza uma jogada de ataque, você pode\r\n"
				+ "usar seu Canalizar Divindade para recebe +10 de bônus\r\n"
				+ "na jogada. Você realiza essa escolha depois de ver a\r\n"
				+ "rolagem, mas antes do Mestre dizer se o ataque atingiu\r\n"
				+ "ou errou.\r\n\n");
	}
	
	public void dominioGuerraN6() {
		System.out.println("CANALIZAR DIVINDADE: BÊNÇÃO DO DEUS DA GUERRA\r\n\n"
				+ "No 6° nível, quando uma criatura a até 9 metros de você\r\n"
				+ "realizar uma jogada de ataque, você pode usar sua reação\r\n"
				+ "para conceder a criatura +10 de bônus nessa jogada,\r\n"
				+ "usando seu Canalizar Divindade. Você realiza essa\r\n"
				+ "escolha depois de ver a rolagem, mas antes do Mestre\r\n"
				+ "dizer se o ataque atingiu ou errou.\r\n\n");
	}
	
	public void dominioGuerraN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8º nível, você ganha a habilidade de imbuir seus\r\n"
				+ "ataques com energia divina. Uma vez em cada um de seus\r\n"
				+ "turnos, quando você acertar uma criatura com um ataque\r\n"
				+ "com arma, você pode fazer o ataque causar 1d8 de dano\r\n"
				+ "extra de mesmo tipo do dano da arma ao alvo. Quando\r\n"
				+ "alcançar o 14º nível, o dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioGuerraN17() {
		System.out.println("AVATAR DA BATALHA\r\n\n"
				+ "A partir do 17° nível, você ganha resistência a dano de\r\n"
				+ "concussão, cortante e perfurante de ataques não-mágicos\r\n\n");
	}
	
//dominio da luz
	public void dominioLuz() {
		System.out.println("DOMÍNIO DA LUZ\r\n\n"
				+ "Deuses da luz – como Helm, Lathander, Pholtus,\r\n"
				+ "Branchala, a Chama Prateada, Belenus, Apolo e ReHorakhty – promovem os ideias do renascimento e\r\n"
				+ "renovação, verdade, vigilância e beleza, muitas vezes\r\n"
				+ "usando o símbolo do sol. Alguns desses deuses são\r\n"
				+ "retratados como o próprio sol ou como um cocheiro que\r\n"
				+ "carrega o sol através do céu. Outros são sentinelas\r\n"
				+ "incansáveis cujos olhos penetram cada sombra e veem\r\n"
				+ "através de cada enganação. Alguns são divindades da\r\n"
				+ "beleza e arte que ensinam que a arte é o veículo para o\r\n"
				+ "aprimoramento da alma. Clérigos de um deus da luz são\r\n"
				+ "almas esclarecidas infundidas com radiação e o poder\r\n"
				+ "divino da visão do discernimento, conhecidos por afastar\r\n"
				+ "as mentiras e incineras a escuridão.\r\n\n"
				+ "MAGIAS DO DOMÍNIO DA LUZ\r\n\n"
				+ "Nível de Clérigo Magias\r\n"
				+ "1° mãos flamejantes, fogo das fadas\r\n"
				+ "3° esfera flamejante, raio ardente\r\n"
				+ "5° luz do dia, bola de fogo\r\n"
				+ "7° guardião da fé, muralha de fogo\r\n"
				+ "9° coluna de chamas, vidência\r\n\n"
				+ "TRUQUE ADICIONAL\r\n\n"
				+ "Quando você escolhe esse domínio no 1° nível, você ganha\r\n"
				+ "o truque luz se você ainda não o conhecia.\r\n\n"
				+ "LABAREDA PROTETORA\r\n\n"
				+ "Também a partir do 1° nível, você pode interpor luz\r\n"
				+ "divina entre você e uma criatura atacante. Quando você\r\n"
				+ "for atacado por uma criatura a até 9 metros de você que\r\n"
				+ "você pode ver, você pode usar sua reação para impor\r\n"
				+ "desvantagem na jogada de ataque, causando labaredas de\r\n"
				+ "luz na frente do atacante antes dele atingir ou errar. Um\r\n"
				+ "atacante que não puder ser cegado é imune a essa\r\n"
				+ "característica.\r\n"
				+ "Você pode usar essa característica um número de\r\n"
				+ "vezes igual ao seu modificador de Sabedoria (mínimo uma\r\n"
				+ "vez). Você recupera todos os usos gastos após terminar\r\n"
				+ "um descanso longo.\r\n\n");
	}
	
	public void dominioLuzN2() {
		System.out.println("CANALIZAR DIVINDADE: RADIAÇÃO DO AMANHECER\r\n\n"
				+ "A partir do 2° nível, você pode usar seu Canalizar\r\n"
				+ "Divindade para criar uma explosão de luz solar, banindo\r\n"
				+ "a escuridão e causando dano radiante aos inimigos.\r\n"
				+ "Com uma ação, você ergue seu símbolo sagrado e\r\n"
				+ "qualquer escuridão mágica num raio de 9 metros de você\r\n"
				+ "é dissipada. Além disso, cada criatura hostil a até 9\r\n"
				+ "metros deve realizar um teste de resistência de\r\n"
				+ "Constituição. Uma criatura sofre dano radiante igual a\r\n"
				+ "2d10 + seu nível de clérigo se falhar no teste e metade\r\n"
				+ "desse dano caso seja bem sucedida. Uma criatura que\r\n"
				+ "tenha cobertura total contra você não é afetada.\r\n\n");
	}
	
	public void dominioLuzN6() {
		System.out.println("LABAREDA APRIMORADA\r\n\n"
				+ "No 6° nível, você também pode utilizar sua característica\r\n"
				+ "Labareda Protetora quando uma criatura que você possa\r\n"
				+ "ver a até 9 metros atacar outra criatura diferente de você.\r\n\n");
	}
	
	public void dominioLuzN8() {
		System.out.println("CONJURAÇÃO PODEROSA\r\n\n"
				+ "A partir do 8° nível, você adiciona seu modificador de\r\n"
				+ "Sabedoria no dano causado por qualquer truque de\r\n"
				+ "clérigo.\r\n\n");
	}
	
	public void dominioLuzN17() {
		System.out.println("COROA DE LUZ\r\n\n"
				+ "A partir do 17° nível, você pode usar sua ação para ativar\r\n"
				+ "uma aura de luz solar que dura por 1 minuto ou até você\r\n"
				+ "dissipá-la usando outra ação. Você emite luz plena num\r\n"
				+ "raio de 18 metros e penumbra a até 9 metros além disso.\r\n"
				+ "Os seus inimigos na área de luz plena tem desvantagem\r\n"
				+ "nos testes de resistência contra suas magias que causam\r\n"
				+ "dano de fogo ou dano radiante.\r\n\n");
	}
	
//dominio da natureza
	public void dominioNatureza() {
		System.out.println("DOMÍNIO DA NATUREZA\r\n\n"
				+ "Os deuses da natureza são tão variados como a própria\r\n"
				+ "natureza do mundo, desde deuses inescrutáveis de\r\n"
				+ "profundas florestas (como Silvanus, Obad-Hai, Chislev,\r\n"
				+ "Balinor e Pã) até divindades amigáveis associadas a\r\n"
				+ "alguma fonte ou bosque em particular (como Eldath).\r\n"
				+ "Druidas reverenciam a natureza como um todo e podem\r\n"
				+ "vir a servir essas divindades, praticando ritos misteriosos\r\n"
				+ "e recitando orações a muito esquecidas em sua própria\r\n"
				+ "língua secreta. Porém, muitos desses deuses também\r\n"
				+ "possuem clérigos, campeões que tem um papel mais ativo\r\n"
				+ "em promover os interesses particulares de um deus da\r\n"
				+ "natureza. Esses clérigos devem caçar monstruosidades\r\n"
				+ "malignas que usurpam dos bosques, abençoar a colheita\r\n"
				+ "dos fieis ou murchar a cultura dos que irritarem seus\r\n"
				+ "deuses.\r\n\n"
				+ "MAGIAS DO DOMÍNIO DA NATUREZA\r\n\n"
				+ "Nível de Clérigo Magias\r\n"
				+ "1° amizade animal, falar com animais\r\n"
				+ "3° pele de árvore, crescer espinhos\r\n"
				+ "5° ampliar plantas, muralha de vento\r\n"
				+ "7° dominar besta, vinha esmagadora\r\n"
				+ "9° praga de insetos, caminhar em árvores\r\n\n"
				+ "ACÓLITO DA NATUREZA\r\n\n"
				+ "No 1° nível, você aprende um truque de druida, à sua\r\n"
				+ "escolha. Você também ganha proficiência em uma das\r\n"
				+ "seguintes perícias, à sua escolha: Adestrar Animais,\r\n"
				+ "Natureza ou Sobrevivência.\r\n\n"
				+ "PROFICIÊNCIA ADICIONAL\r\n\n"
				+ "Também a partir do 1° nível, você adquire proficiência\r\n"
				+ "com armaduras pesadas.\r\n\n");
	}
	
	public void dominioNaturezaN2() {
		System.out.println("CANALIZAR DIVINDADE: ENFEITIÇAR ANIMAIS E PLANTAS\r\n\n"
				+ "A partir do 2° nível, você pode usar seu Canalizar\r\n"
				+ "Divindade para enfeitiçar animais e plantas.\r\n"
				+ "Com uma ação, você ergue seu símbolo sagrado e\r\n"
				+ "invoca o nome do seu deus. Cada besta ou criatura-planta\r\n"
				+ "que puder ver você num raio de 9 metros, deve realizar\r\n"
				+ "um teste de resistência de Sabedoria. Se a criatura falhar,\r\n"
				+ "ela estará enfeitiçada por você durante 1 minuto ou até\r\n"
				+ "sofrer dano. Enquanto estiver enfeitiçada por você, ela\r\n"
				+ "será amistosa a você a as criaturas que você designar.\r\n\n");
	}
	
	public void dominioNaturezaN6() {
		System.out.println("AMORTECER ELEMENTOS\r\n\n"
				+ "No 6° nível, quando você ou uma criatura a até 9 metros\r\n"
				+ "de você sofrer dano de ácido, frio, fogo, elétrico ou trovão,\r\n"
				+ "você pode usar sua reação para conceder resistência a\r\n"
				+ "criatura contra aquele tipo de dano.\r\n\n");
	}
	
	public void dominioNaturezaN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8º nível, você ganha a habilidade de imbuir seus\r\n"
				+ "ataques com energia divina. Uma vez em cada um de seus\r\n"
				+ "turnos, quando você acertar uma criatura com um ataque\r\n"
				+ "com arma, você pode fazer o atque causar 1d8 de dano de\r\n"
				+ "frio, fogo ou elétrico (à sua escolha) extra ao alvo. Quando\r\n"
				+ "alcançar o 14º nível, o dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioNaturezaN17() {
		System.out.println("SENHOR DA NATUREZA\r\n\n"
				+ "A partir do 17° nível, você ganha a habilidade de\r\n"
				+ "comandar animais e criaturas-planta. Enquanto a\r\n"
				+ "criatura estiver enfeitiçada pela sua característica\r\n"
				+ "Enfeitiçar Animais e Plantas, você pode usar uma ação\r\n"
				+ "bônus no seu turno para dizer verbalmente o que cada\r\n"
				+ "uma dessas criaturas devem fazer no próximo turno\r\n"
				+ "delas.\r\n\n");
	}
	
//dominio da tempestade
	public void dominioTempestade() {
		System.out.println("DOMÍNIO DA TEMPESTADE\r\n\n"
				+ "Deuses cujo portfólio contenha o domínio da Tempestade\r\n"
				+ "– como Talos, Umberlee, Kord, Zeboim, o Devorador, Zeus\r\n"
				+ "e Thor – governam tormentas, mares e céus. Estão\r\n"
				+ "inclusos deuses dos relâmpagos e trovões, deuses dos\r\n"
				+ "terremotos, alguns deuses do fogo e certos deuses da\r\n"
				+ "violência, força física e coragem. Em alguns panteões, um\r\n"
				+ "deus com esse domínio comanda os outros deuses e é\r\n"
				+ "conhecido pela justiça rápida levada através de\r\n"
				+ "relâmpagos. Nos panteões de povos marítimos e\r\n"
				+ "navegantes, deuses com esse domínio são divindades do\r\n"
				+ "oceano e patrono dos marinheiros. Deuses da tempestade\r\n"
				+ "enviam seus clérigos para inspirar pavor no povo comum,\r\n"
				+ "tanto para mantê-los no caminho da justiça e coragem\r\n"
				+ "quanto para oferecer sacrifícios de propiciação para\r\n"
				+ "afastar a ira divina.\r\n\n"
				+ "MAGIAS DO DOMÍNIO DA TEMPESTADE\r\n\n"
				+ "Nível de Clérigo Magias\r\n"
				+ "1° névoa obscurecente, onda trovejante\r\n"
				+ "3° lufada de vento, despedaçar\r\n"
				+ "5° convocar relâmpagos, nevasca\r\n"
				+ "7° controlar a água, tempestade de gelo\r\n"
				+ "9° onda destrutiva, praga de insetos\r\n\n"
				+ "PROFICIÊNCIA ADICIONAL\r\n\n"
				+ "A partir do 1° nível, você adquire proficiência em armas\r\n"
				+ "marciais e armaduras pesadas.\r\n\n"
				+ "IRA DA TORMENTA\r\n\n"
				+ "Também a partir do 1° nível, você pode repreender\r\n"
				+ "ataques violentamente. Quando uma criatura a 1,5 metro\r\n"
				+ "de você que você possa ver, atingir você com um ataque,\r\n"
				+ "você pode usar sua reação para forçar a criatura a\r\n"
				+ "realizar um teste de resistência de Destreza. A criatura\r\n"
				+ "sofre 2d8 de dano elétrico ou de trovão (à sua escolha)\r\n"
				+ "caso falhe no teste, e metade desse dano caso seja bem\r\n"
				+ "sucedido.\r\n"
				+ "Você pode usar essa característica um número de\r\n"
				+ "vezes igual ao seu modificador de Sabedoria (mínimo uma\r\n"
				+ "vez). Você recupera todos os usos gastos após terminar\r\n"
				+ "um descanso longo.\r\n\n");
	}
	
	public void dominioTempestadeN2() {
		System.out.println("CANALIZAR DIVINDADE: IRA DESTRUIDORA\r\n\n"
				+ "A partir do 2° nível, você pode usar seu Canalizar\r\n"
				+ "Divindade para empunhar o poder da tormenta com\r\n"
				+ "ferocidade desmedida.\r\n"
				+ "Quando você rolar dano elétrico ou trovejante, você\r\n"
				+ "pode usar seu Canalizar Divindade para causar o máximo\r\n"
				+ "de dano, ao invés de rolá-lo.\r\n\n");
	}
	
	public void dominioTempestadeN6() {
		System.out.println("GOLPE DE RELÂMPAGO\r\n\n"
				+ "No 6° nível, quando você causa dano elétrico a uma\r\n"
				+ "criatura Grande ou menor, você também pode empurrá-la\r\n"
				+ "para até 3 metros de distância de você.\r\n\n");
	}
	
	public void dominioTempestadeN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8º nível, você ganha a habilidade de imbuir seus\r\n"
				+ "ataques com energia divina. Uma vez em cada um de seus\r\n"
				+ "turnos, quando você acertar uma criatura com um ataque\r\n"
				+ "com arma, você pode fazer o ataque causar 1d8 de dano\r\n"
				+ "trovejante extra ao alvo. Quando alcançar o 14º nível, o\r\n"
				+ "dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioTempestadeN17() {
		System.out.println("FILHO DA TORMENTA\r\n"
				+ "A partir do 17° nível, você adquire deslocamento de voo\r\n"
				+ "igual a seu deslocamento de caminhada contanto que você\r\n"
				+ "não esteja no subterrâneo ou em local fechado.\r\n\n");
	}
	
//dominio da vida
	public void dominioVida() {
		System.out.println("DOMÍNIO DA VIDA\r\n\n"
				+ "O domínio da vida foca na vívida energia positiva – uma\r\n"
				+ "das forças fundamentais do universo – que sustenta toda\r\n"
				+ "a vida. Os deuses da vida promovem a vitalidade e a"
				+ "saúde, curando os doentes e feridos, cuidando dos\r\n"
				+ "necessitados, além de afastar as forças da morte e hordas\r\n"
				+ "de mortos-vivos. Quase toda divindade não maligna pode\r\n"
				+ "alegar influência sobre esse domínio. Em particular\r\n"
				+ "divindades da agricultura (como Chauntea, Arawai e\r\n"
				+ "Demeter), do sol (como Lathander, Pelor e Re-Horakhty),\r\n"
				+ "da cura ou resistência (como Ilmater, Mishakal, Apolo e\r\n"
				+ "Diancecht), e do lar e comunidade (como Hestia, Hathor e\r\n"
				+ "Boldrei).\r\n\n"
				+ "MAGIAS DO DOMÍNIO DA VIDA\r\n\n"
				+ "Nível de Clérigo Magias\r\n"
				+ "1° bênção, curar ferimentos\r\n"
				+ "3° restauração menor, arma espiritual\r\n"
				+ "5° sinal de esperança, revivificar\r\n"
				+ "7° proteção contra a morte, guardião da fé\r\n"
				+ "9° curar ferimentos em massa, reviver os mortos\r\n\n"
				+ "PROFICIÊNCIA ADICIONAL\r\n\n"
				+ "Quando você escolhe este domínio no 1º nível, você ganha\r\n"
				+ "proficiência com armaduras pesadas.\r\n\n"
				+ "DISCÍPULO DA VIDA\r\n\n"
				+ "Também no 1º nível, suas magias de cura são mais\r\n"
				+ "efetivas. Sempre que você conjurar uma magia de cura\r\n"
				+ "para recuperar pontos de vida, o alvo daquela magia\r\n"
				+ "recupera pontos de vida adicionais iguais a 2 + nível da\r\n"
				+ "magia.\r\n\n");
	}
	
	public void dominioVidaN2() {
		System.out.println("CANALIZAR DIVINDADE: PRESERVAR A VIDA\r\n\n"
				+ "A partir do 2º nível, você pode usar seu Canalizar\r\n"
				+ "Divindade para curar os feridos.\r\n"
				+ "Como uma ação, você usa seu símbolo sagrado para\r\n"
				+ "invocar energia que pode recuperar um total de 5 vezes\r\n"
				+ "seu nível de clérigo em pontos de vida. Você escolhe\r\n"
				+ "quaisquer criaturas a até 9 metros de você e divide esses\r\n"
				+ "pontos entre elas. Essa característica só pode curar as\r\n"
				+ "criaturas a até metade de seu máximo de pontos de vida.\r\n"
				+ "Você não pode usar essa característica em um morto-vivo\r\n"
				+ "ou constructo.\r\n\n");
	}
	
	public void dominioVidaN6() {
		System.out.println("CURANDEIRO ABENÇOADO\r\n\n"
				+ "A partir do 6º nível, as magias que você conjurar para\r\n"
				+ "curar os outros também curam você. Quando conjurar\r\n"
				+ "uma magia de cura em outra criatura, você também\r\n"
				+ "recupera pontos de vida, em um total de 2 + nível da\r\n"
				+ "magia.\r\n\n");
	}
	
	public void dominioVidaN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8º nível, você ganha a habilidade de imbuir seus\r\n"
				+ "ataques com poder divino. Uma vez em cada um de seus\r\n"
				+ "turnos, quando você acertar uma criatura com um ataque\r\n"
				+ "com arma, você pode fazer o ataque causar 1d8 de dano\r\n"
				+ "radiante extra ao alvo. Quando alcançar o 14º nível, o\r\n"
				+ "dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioVidaN17() {
		System.out.println("CURA SUPREMA\r\n\n"
				+ "A partir do 17º nível, quando você jogaria normalmente\r\n"
				+ "um ou mais dados para recuperar pontos de vida com\r\n"
				+ "uma magia, você usa o maior resultado possível nos\r\n"
				+ "dados. Por exemplo, ao invés de recuperar 2d6 pontos de\r\n"
				+ "vida, você recupera 12.\r\n\n");
	}
}
