package Classes;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;


import CriadorDeFicha.Classes;

public class Druida extends Classes{
	private List<String> pericias = Arrays.asList("Arcanismo", "Adestrar Animais", "Intuição", "Medicina", "Natureza", "Percepção", "Religião", "Sobrevivência");
	private SecureRandom random = new SecureRandom();
//	private String nome = "Druida";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
	public List<String> getPericiasList() {
		return pericias;
	}
	
	public String druidaDescricao() {
		String descricao = "DRUIDA\r\n\n"
				+ "Erguendo um cajado retorcido envolto em azevinho, uma\r\n"
				+ "elfa invoca a fúria da tempestade e convoca raios\r\n"
				+ "explosivos de eletricidade para destruir os orcs\r\n"
				+ "carregando tochas que ameaçam sua floresta.\r\n"
				+ "Se esgueirando, fora da vista, no alto da copa das\r\n"
				+ "árvores na forma de um leopardo, um humano espreita\r\n"
				+ "para fora da selva, em direção da estranha construção de\r\n"
				+ "um Templo do Elemental do Ar Maligno, mantendo os\r\n"
				+ "olhos fixos nas atividades dos cultistas.\r\n"
				+ "Brandindo uma lâmina feita de puro fogo, um meioelfo investe em direção a uma massa de soldados\r\n"
				+ "esqueléticos, destruindo a magia sobrenatural que deu as\r\n"
				+ "tolas criaturas o semblante falso de vida.\r\n"
				+ "Quer seja convocando as forças elementais da\r\n"
				+ "natureza, ou emulando as criaturas do mundo animal, os\r\n"
				+ "druidas são encarnações da resistência, astúcia e fúria da\r\n"
				+ "natureza. Eles não se consideram donos da natureza. Ao\r\n"
				+ "invés disso, eles se veem como extensões da vontade\r\n"
				+ "indomável da natureza.\r\n\n";
		return descricao;
	}

	public String CaracteristicasClasse() {
		String caracteristicas = "CARACTERÍSTICAS DE CLASSE\r\n\n"
				+ "Como um druida, você adquire as seguintes\r\n"
				+ "características de classe.\r\n\n"
				+ "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por nível de druida\r\n"
				+ "Pontos de Vida no 1° Nível: 8 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constituição por nível de druida após o\r\n"
				+ "1°\r\n\n"
				+ "PROFICIÊNCIAS\r\n\n"
				+ "Armaduras: Armaduras leves, armaduras médias,\r\n"
				+ "escudos (druidas não irão vestir armaduras ou usar\r\n"
				+ "escudos feitos de metal)\r\n"
				+ "Armas: Clavas, adagas, dardos, azagaias, maças,\r\n"
				+ "bordões, cimitarras, foices, fundas e lanças.\r\n"
				+ "Ferramentas: Kit de herbalismo\r\n\n"
				+ "Testes de Resistência: Inteligência, Sabedoria\r\n"
				+ "Perícias: Escolha duas dentre Arcanismo, Adestrar\r\n"
				+ "Animais, Intuição, Medicina, Natureza, Percepção,\r\n"
				+ "Religião e Sobrevivência\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) um escudo de madeira ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "(a) uma cimitarra ou (b) qualquer arma corpo-a-corpo\r\n"
				+ "simples\r\n"
				+ "(a) um pacote de estudioso ou (b) um pacote de\r\n"
				+ "explorador\r\n"
				+ "- Armadura de couro, um pacote de aventureiro e um\r\n"
				+ "foco druídico\r\n\n";
		return caracteristicas;
	}
	
	
	public void setDruida() {
		getFicha().setClasse("Druida");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Armaduras leves", "Armaduras médias", "Escudos", "Clavas", "Adagas", "Dardos", "Azagaias", "Maças", "Bordões", "Cimitarras", "Foices", "Fundas", "Lanças");
		getProficiencia().SetProfEquips(profEquips);
		getFicha().setProfi_ferramentas_peri("Kit de herbalismo");
		List<String> profResistencia = Arrays.asList("Inteligência", "Sabedoria");
		getProficiencia().SetResistencia(profResistencia);
		getFicha().setIdiomas("Druídico");
//		this.magias.setFicha(ficha);
//		getMagias().truquesDruida();
//		getMagias().setMagiasDruidaLV1();
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
	
//	public void equips1() {
//		Scanner entrada = new Scanner(System.in);
//		boolean equip1Loop = false;
//		while(equip1Loop == false) {
//			int equip1Menu;
//			System.out.println("Escolha entre (1) um escudo de madeira ou (2) qualquer arma simples.");
//			
//			equip1Menu = entrada.nextInt();
//			switch(equip1Menu) {
//			case 1:
//				char decisaocase1;
//				boolean decisaoLoop = false;
//				while(decisaoLoop == false) {
//					System.out.println("Tem certeza que deseja escolher um escudo de madeira? (Y/N)");
//					
//					decisaocase1 = entrada.next().charAt(0);
//					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
//						getFicha().setEquipamentos("Escudo de madeira");
//						decisaoLoop = true;
//						equip1Loop = true;
//					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
//						decisaoLoop = true;
//					}
//					
//				}
//				
//			break;
//			
//			case 2:
//				getFicha().setEquipamentos(getEquips().setArmasSimples());
//			break;
//			}
//		}
//	}
//	
//	public void equips2() {
//		Scanner entrada = new Scanner(System.in);
//		boolean equip2Loop = false;
//		while(equip2Loop == false) {
//			int equip2Menu;
//			System.out.println("Escolha entre (1) uma Cimitarra ou (2) qualquer arma simples corpo-a-corpo.");
//			
//			equip2Menu = entrada.nextInt();
//			switch(equip2Menu) {
//			case 1:
//				char decisaocase1;
//				boolean decisaoLoop = false;
//				while(decisaoLoop == false) {
//					System.out.println("Tem certeza que deseja escolher Cimitarra? (Y/N)");
//					
//					decisaocase1 = entrada.next().charAt(0);
//					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
//						for(int i = 0; i < getEquips().getArmas_simples_CAC().size(); i++) {
//							if(Objects.equals(new String("Cimitarra"), getEquips().getArmas_simples_CAC().get(i))) {
//								getFicha().setEquipamentos(getEquips().getArmas_simples_CAC().get(i));
//							}
//						}
//						decisaoLoop = true;
//						equip2Loop = true;
//					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
//						decisaoLoop = true;
//					}
//					
//				}
//				
//			break;
//			
//			case 2:
//				getFicha().setEquipamentos(getEquips().setArmaCACSimples());
//			break;
//			}
//		}
//	}
//	
//	public void equips3() {
//		getEquips().setPacotes("Pacote de Estudioso", "Pacote de Explorador");
//	}
	
//Druida feats padrao
	public void FeatsPadrao() {
		System.out.println("DRUÍDICO\r\n\n"
				+ "Você conhece o Druídico, o idioma secreto dos druidas.\r\n"
				+ "Você pode falar esse idioma e usá-lo para deixar\r\n"
				+ "mensagens escondidas. Você e outros que conheçam esse\r\n"
				+ "idioma automaticamente veem tais mensagens. Outros\r\n"
				+ "perceberão a presença da mensagem se passarem num\r\n"
				+ "teste de Sabedoria (Percepção) CD 15, mas não\r\n"
				+ "conseguirão decifrá-lo sem magia.\r\n\n"
				+ "CONJURAÇÃO\r\n\n"
				+ "Baseado na essência divina da própria natureza, você\r\n"
				+ "pode conjurar magias para moldar sua essência a sua\r\n"
				+ "vontade. Veja o capítulo 10 para as regras gerais de\r\n"
				+ "conjuração e o capítulo 11 para a lista de magias de\r\n"
				+ "druida.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Você conhece dois truques, à sua escolha, da lista de\r\n"
				+ "magias de druida. Você aprende truques de druida\r\n"
				+ "adicionais, à sua escolha, em níveis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Druida.\r\n\n"
				+ "PREPARANDO E CONJURANDO MAGIAS\r\n\n"
				+ "A tabela O Druida mostra quantos espaços de magia você\r\n"
				+ "têm para conjurar suas magias de 1º nível e superiores.\r\n"
				+ "Para conjurar uma dessas magias, você precisa gastar um\r\n"
				+ "espaço do nível da magia ou superior. Você recupera todos\r\n"
				+ "os espaços gastos quando termina um descanso longo.\r\n"
				+ "Você prepara a lista de magias disponíveis\r\n"
				+ "selecionando-as da lista de magias de Druida. Você\r\n"
				+ "seleciona um número de magias igual ao seu modificador\r\n"
				+ "de Sabedoria + seu nível de druida (mínimo de uma\r\n"
				+ "magia). Essas magias devem ser de níveis que você\r\n"
				+ "possua espaços de magia.\r\n"
				+ "Por exemplo, se você é um druida de 3º nível, você\r\n"
				+ "possui quatro espaços de magia de 1º nível e dois de 2º\r\n"
				+ "nível. Com Sabedoria 16, sua lista de magias preparadas\r\n"
				+ "pode incluir 6 magias, combinando as de 1º e 2º nível em\r\n"
				+ "qualquer ordem. Se você preparar a magia de 1º nível\r\n"
				+ "curar ferimentos, você pode conjurá-la com um espaço de\r\n"
				+ "magia de 1º ou de 2º nível. Ao conjurar a magia, você não\r\n"
				+ "a retira de sua lista de magias preparadas, podendo\r\n"
				+ "conjurá-la de novo se tiver espaços de magia disponíveis.\r\n"
				+ "Você pode modificar a sua lista de magias preparadas\r\n"
				+ "quando termina um descanso longo. Preparar uma nova\r\n"
				+ "lista de magias de druida requer tempo gasto em preces e\r\n"
				+ "meditação: no mínimo 1 minuto por nível de magia para\r\n"
				+ "cada magia preparada.\r\n\n"
				+ "HABILIDADE DE CONJURAÇÃO\r\n\n"
				+ "Sabedoria é a sua habilidade para você conjurar suas\r\n"
				+ "magias de druida, já que sua magia vem da sua devoção e\r\n"
				+ "sintonia com a natureza. Você usa sua Sabedoria sempre\r\n"
				+ "que alguma magia se referir a sua habilidade de conjurar\r\n"
				+ "magias. Além disso, você usa o seu modificador de\r\n"
				+ "Sabedoria para definir a CD dos testes de resistência para\r\n"
				+ "as magias de druida que você conjura e quando você\r\n"
				+ "realiza uma jogada de ataque com uma magia.\r\n"
				+ "CD para suas magias = 8 + bônus de proficiência +\r\n"
				+ "seu modificador de Sabedoria\r\n"
				+ "Modificador de ataque de magia = seu bônus de proficiência +\r\n"
				+ "seu modificador de Sabedoria\r\n\n"
				+ "CONJURAÇÃO DE RITUAL\r\n\n"
				+ "Você pode conjurar qualquer magia de druida que você\r\n"
				+ "conheça como um ritual se ela possuir o descritor ritual.\r\n\n"
				+ "FOCO DE CONJURAÇÃO\r\n\n"
				+ "Você pode usar um foco druídico (encontrado no capítulo\r\n"
				+ "5) como foco de conjuração das suas magias de druida.\r\n\n");
	}
	
	public void FeatsNivel2() {
		System.out.println("FORMA SELVAGEM\r\n"
				+ "A partir do 2° nível, você pode usar sua ação para assumir\r\n"
				+ "magicamente a forma de uma besta que você já tenha\r\n"
				+ "visto antes. Você pode usar essa característica duas vezes.\r\n"
				+ "Você recupera os usos quando termina um descanso curto\r\n"
				+ "ou longo.\r\n"
				+ "Seu nível de druida determina as bestas em que você\r\n"
				+ "pode se transformar, como mostrado na tabela Formas de\r\n"
				+ "Besta. No 2° nível, por exemplo, você pode se transformar\r\n"
				+ "em qualquer besta que possui nível de desafio 1/4 ou\r\n"
				+ "inferior que não possua deslocamento de voo ou natação.\r\n\n"
				+ "FORMAS DE BESTA\r\n\n"
				+ "Nível ND Máx. Limitações Exemplo\r\n"
				+ "2° 1/4 Sem deslocamento de voo\r\n"
				+ "ou natação\r\n"
				+ "Lobo\r\n"
				+ "4° 1/2 Sem deslocamento de voo Crocodilo\r\n"
				+ "8° 1 – Águia gigante\r\n"
				+ "Você pode continuar na forma de besta por um número\r\n"
				+ "de horas igual à metade do seu nível de druida\r\n"
				+ "(arredondado para baixo). Então, você volta a sua forma\r\n"
				+ "original, a não ser que você gaste outro uso dessa\r\n"
				+ "característica. Você pode reverter a sua forma normal\r\n"
				+ "prematuramente usando uma ação bônus no seu turno.\r\n"
				+ "Você reverte automaticamente se cair inconsciente, cair a\r\n"
				+ "0 pontos de vida ou morrer.\r\n"
				+ "Enquanto estiver transformado, as seguintes regras se\r\n"
				+ "aplicam:\r\n\n"
				+ "- Suas estatísticas de jogo são substituídas pelas\r\n"
				+ "estatísticas da besta, mas você mantem sua tendência,\r\n"
				+ "personalidade e valores de Inteligência, Sabedoria e\r\n"
				+ "Carisma. Você também mantem suas proficiências em\r\n"
				+ "todas as suas perícias e testes de resistência, além de\r\n"
				+ "receber as proficiências da criatura. Se a criatura\r\n"
				+ "possuir a mesma proficiência que você e o bônus no\r\n"
				+ "bloco de estatística dela for maior que o seu, você\r\n"
				+ "usará o bônus da criatura no lugar do seu. Se a\r\n"
				+ "criatura possuir qualquer ação lendária ou de covil,\r\n"
				+ "você não pode usá-las.\r\n"
				+ "- Quando você se transforma, você assume os pontos de\r\n"
				+ "vida e Dados de Vida da criatura. Quando você reverte\r\n"
				+ "a sua forma normal, você retorna ao número de pontos\r\n"
				+ "de vida que tinha antes de se transformar. Porém, se\r\n"
				+ "você reverter como resultado de ter caído a 0 pontos de\r\n"
				+ "vida, todo o dano excedente será transferido para a\r\n"
				+ "sua forma normal. Por exemplo, se você sofrer 10\r\n"
				+ "pontos de dano em forma animal e tiver apenas 1\r\n"
				+ "ponto de vida restante, você reverte e sofre 9 de dano.\r\n"
				+ "Contanto que o dano excedente não reduza você a 0\r\n"
				+ "pontos de vida, você não cairá inconsciente.\r\n"
				+ "- Você não pode conjurar magias e sua capacidade de\r\n"
				+ "fala ou de realizar qualquer ação que requeira mãos\r\n"
				+ "são limitadas pelas capacidades da forma da besta que\r\n"
				+ "você assumiu. Transformar-se não interrompe sua\r\n"
				+ "concentração em uma magia que você já tenha\r\n"
				+ "conjurado, no entanto, nem previne você de realizar\r\n"
				+ "ações que são parte da conjuração, como convocar\r\n"
				+ "relâmpagos que você já tenha conjurado.\r\n"
				+ "- Você mantem os benefícios de todas as características\r\n"
				+ "de classe, raça ou outras fontes, e pode usá-las caso a\r\n"
				+ "nova forma seja fisicamente capaz de fazê-lo. No\r\n"
				+ "entanto, você não pode usar qualquer dos seus\r\n"
				+ "sentidos especiais, como visão no escuro, a não ser que\r\n"
				+ "a sua nova forma também tenha esse sentido.\r\n"
				+ "- Você pode escolher se o seu equipamento cai no chão\r\n"
				+ "no seu espaço, é assimilado a sua nova forma ou é\r\n"
				+ "usado por ela. Equipamentos vestidos e carregados\r\n"
				+ "funcionam normalmente, mas o Mestre decide qual\r\n"
				+ "equipamento é viável para a nova forma vestir ou\r\n"
				+ "usar, baseado na forma e tamanho da criatura. O seu\r\n"
				+ "equipamento não muda de forma ou tamanho\r\n"
				+ "para se adaptar à nova forma e,\r\n"
				+ "qualquer equipamento que a nova\r\n"
				+ "forma não possa vestir deve, ou cair no\r\n"
				+ "chão ou ser assimilado por ela.\r\n"
				+ "Equipamentos assimilados não terão\r\n"
				+ "efeito até você deixar a forma.\r\n\n"
				+ "CÍRCULO DRUÍDICO\r\n\n"
				+ "No 2° nível, você escolhe se identificar com um\r\n"
				+ "círculo de druidas: o Círculo da Terra ou o Círculo da\r\n"
				+ "Lua, ambos detalhados no final da descrição da classe.\r\n"
				+ "Sua escolha lhe concede características no 2° nível e\r\n"
				+ "novamente no 6°, 10° e 14° nível.\r\n\n");
	}
	
//incremento no valor de habilidade
	public void incrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando você atinge o 4° nível e novamente no 8°, 12°, 16°\r\n"
				+ "e 19° nível, você pode aumentar um valor de habilidade, à\r\n"
				+ "sua escolha, em 2 ou você pode aumentar dois valores de\r\n"
				+ "habilidade, à sua escolha, em 1. Como padrão, você não\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "característica.\r\n\n");
	}
	
	public void featsnivel18() {
		System.out.println("CORPO ATEMPORAL\r\n\n"
				+ "Começando no 18° nível, a magia primordial que você\r\n"
				+ "controla faz com que você envelheça mais lentamente.\r\n"
				+ "Para cada 10 anos que passarem, seu corpo envelhece\r\n"
				+ "apenas 1.\r\n\n"
				+ "MAGIAS DA BESTA\r\n\n"
				+ "A partir do 18° nível, você pode conjurar muitas das suas\r\n"
				+ "magias em qualquer forma que assumir usando a Forma\r\n"
				+ "Selvagem. Você pode realizar os componentes somáticos e\r\n"
				+ "verbais de uma magia de druida na forma de besta, mas\r\n"
				+ "você não é capaz de prover os componentes materiais.\r\n\n");
	}
	
	public void featsnivel20() {
		System.out.println("ARQUIDRUIDA\r\n\n"
				+ "No 20° nível, você pode usar sua Forma Selvagem um\r\n"
				+ "número ilimitado de vezes.\r\n"
				+ "Além disso, você pode ignorar os componentes verbais\r\n"
				+ "e somáticos das suas magias de druida, assim como\r\n"
				+ "qualquer componente material que não tenha custo e não\r\n"
				+ "seja consumido pela magia. Você recebe esse benefício\r\n"
				+ "tanto na sua forma normal, quanto na forma de besta da\r\n"
				+ "sua Forma Selvagem.\r\n\n");
	}
	
//Circulo druidico
	public void circulosDruidicos() {
		System.out.println("CÍRCULOS DRUÍDICOS\r\n\n"
				+ "Apesar de suas organizações serem invisíveis para a\r\n"
				+ "maioria dos forasteiros, os druidas fazem parte de uma\r\n"
				+ "sociedade que se espalham pela terra, ignorando\r\n"
				+ "barreiras políticas. Todos os druidas são nominalmente\r\n"
				+ "membros de uma sociedade druídica, apesar de alguns\r\n"
				+ "indivíduos serem tão isolados que eles nunca chegaram a\r\n"
				+ "ver membros de alta patente da sociedade ou\r\n"
				+ "participaram de encontros druídicos. Os druidas\r\n"
				+ "consideram-se irmãos e irmãs. Como criaturas na\r\n"
				+ "natureza, no entanto, os druidas, as vezes, competem, ou\r\n"
				+ "mesmo caçam uns aos outros.\r\n"
				+ "Em uma escala local, os druidas são organizados em\r\n"
				+ "círculos que partilham de certas perspectivas de\r\n"
				+ "natureza, equilíbrio e modos de um druida.\r\n\n");
	}
	
	public void circuloTerra() {
		System.out.println("CÍRCULO DA TERRA\r\n\n"
				+ "O Círculo da Terra é constituído por místicos e sábios que\r\n"
				+ "salvaguardam conhecimento e ritos antigos através de\r\n"
				+ "uma vasta tradição oral. Esses druidas se encontram em\r\n"
				+ "círculos sagrados de árvores ou monólitos para sussurrar\r\n"
				+ "segredos primordiais em Druídico. Os membros mais\r\n"
				+ "sábios do círculo presidem como os sacerdotes-dirigentes\r\n"
				+ "de comunidades que creem na Crença Antiga, e servem\r\n"
				+ "como conselheiros para os governantes desses povos.\r\n"
				+ "Como membro desse círculo, sua magia é influenciada\r\n"
				+ "pela terra onde você é iniciado nos ritos misteriosos do\r\n"
				+ "círculo.\r\n\n"
				+ "TRUQUE ADICIONAL\r\n\n"
				+ "Quando você escolhe esse círculo no 2° nível, você aprende\r\n"
				+ "um truque de druida adicional, à sua escolha.\r\n\n"
				+ "RECUPERAÇÃO NATURAL\r\n\n"
				+ "A partir do 2° nível, você pode recuperar parte da sua\r\n"
				+ "energia mágica parando para fazer uma meditação e\r\n"
				+ "comunhão com a natureza. Durante um descanso curto,\r\n"
				+ "você escolhe espaços de magia gastos para recuperar. O\r\n"
				+ "espaço de magia pode ter um nível combinado igual ou\r\n"
				+ "menor que metade do seu nível de druida (arredondado\r\n"
				+ "para baixo) e, nenhum dos espaços pode ser de uma\r\n"
				+ "magia de 6° nível ou superior. Você não pode usar essa\r\n"
				+ "característica novamente até terminar um descanso\r\n"
				+ "longo.\r\n"
				+ "Por exemplo, quando você for um druida de 4° nível,\r\n"
				+ "você pode recuperar até dois níveis em espaços de magia.\r\n"
				+ "Você pode recuperar, tanto uma magia de 2° nível, quanto\r\n"
				+ "duas magias de 1° nível.");
	}
	
	public void circuloTerraN3() {
		System.out.println("MAGIAS DE CÍRCULO\r\n\n"
				+ "Sua conexão mística com a terra infunde você com a\r\n"
				+ "habilidade de conjurar certas magias. No 3°, 5°, 7° e 9°\r\n"
				+ "nível, você ganha acesso a magias de círculo ligadas ao\r\n"
				+ "terreno em que você se tornou druida. Escolha o terreno –\r\n"
				+ "ártico, costa, deserto, floresta, montanha, pântano,\r\n"
				+ "planície ou subterrâneo – e consulte a lista de magias\r\n"
				+ "associada.\r\n"
				+ "Uma vez que você tenha acesso a uma magia de\r\n"
				+ "círculo, você sempre poderá prepará-la e ela não conta no\r\n"
				+ "número de magias que você pode preparar a cada dia. Se\r\n"
				+ "você tiver acesso a uma magia que não aparece na lista de\r\n"
				+ "magias de druida, a magia, no entanto, será uma magia\r\n"
				+ "de druida para você.\r\n\n"
				+ "ÁRTICO\r\n\n"
				+ "Nível de Druida Magias de Círculo\r\n"
				+ "3° imobilizar pessoa, crescer espinho\r\n"
				+ "5° nevasca, lentidão\r\n"
				+ "7° movimentação livre, tempestade de gelo\r\n"
				+ "9° comunhão com a natureza, cone de frio\r\n\n"
				+ "COSTA\r\n\n"
				+ "Nível de Druida Magias\r\n"
				+ "3° passo nebuloso, reflexos\r\n"
				+ "5° andar na água, respirar água\r\n"
				+ "7° movimentação livre, controlar água\r\n"
				+ "9° vidência, conjurar elemental\r\n\n"
				+ "DESERTO\r\n\n"
				+ "Nível de Druida Magias\r\n"
				+ "3° nublar, silêncio\r\n"
				+ "5° criar alimentos, proteção contra energia\r\n"
				+ "7° praga, terreno alucinógeno\r\n"
				+ "9° muralha de pedra, praga de insetos\r\n\n"
				+ "FLORESTA\r\n\n"
				+ "Nível de Druida Magias\r\n"
				+ "3° patas de aranha, pele de árvore\r\n"
				+ "5° convocar relâmpagos, crescer plantas\r\n"
				+ "7° adivinhação, movimentação livre\r\n"
				+ "9° comunhão com a natureza, passo de árvore\r\n\n"
				+ "MONTANHA\r\n\n"
				+ "Nível de Druida Magias\r\n"
				+ "3° crescer espinho, patas de aranha\r\n"
				+ "5° mesclar-se às rochas, relâmpago\r\n"
				+ "7° moldar rochas, pele de pedra\r\n"
				+ "9° criar passagem, muralha de pedra\r\n\n"
				+ "PÂNTANO\r\n\n"
				+ "Nível de Druida Magias\r\n"
				+ "3° escuridão, flecha ácida\r\n"
				+ "5° andar na água, névoa fétida\r\n"
				+ "7° localizar criatura, movimentação livre\r\n"
				+ "9° vidência, praga de insetos\r\n\n"
				+ "PLANÍCIE\r\n\n"
				+ "Nível de Druida Magias\r\n"
				+ "3° invisibilidade, passos sem pegadas\r\n"
				+ "5° luz do dia, velocidade\r\n"
				+ "7° adivinhação, movimentação livre\r\n"
				+ "9° praga de insetos, sonho\r\n\n"
				+ "SUBTERRÂNEO\r\n\n"
				+ "Nível de Druida Magias\r\n"
				+ "3° patas de aranha, teia\r\n"
				+ "5° forma gasosa, névoa fétida\r\n"
				+ "7° invisibilidade maior, moldar rochas\r\n"
				+ "9° praga de insetos, névoa mortal\r\n\n");
	}
	
	public void circuloTerraN6() {
		System.out.println("CAMINHO DA FLORESTA\r\n\n"
				+ "A partir do 6° nível, mover-se através de terreno difícil\r\n"
				+ "não-mágico não te custará nenhum movimento extra.\r\n"
				+ "Você também pode passar através de plantas não-mágicas\r\n"
				+ "sem ser atrasado por elas e sem sofrer dano delas se elas\r\n"
				+ "tiverem espinhos, espinhas ou perigos similares.\r\n"
				+ "Além disso, você tem vantagem em testes de\r\n"
				+ "resistência contra plantas criadas magicamente ou\r\n"
				+ "manipuladas para impedir movimentação, como as\r\n"
				+ "criadas pela magia constrição.\r\n\n");
	}
	
	public void circuloTerraN10() {
		System.out.println("PROTEÇÃO NATURAL\r\n"
				+ "Quando você atingir o 10° nível, você não pode ser\r\n"
				+ "enfeitiçado ou amedrontado por elementais ou fadas e\r\n"
				+ "você se torna imune a venenos e doenças.\r\n");
	}
	
	public void circuloTerraN14() {
		System.out.println("SANTUÁRIO NATURAL\r\n\n"
				+ "A partir do 14° nível, as criaturas do mundo natural\r\n"
				+ "sentem sua ligação com a natureza e hesitarão em atacar\r\n"
				+ "você. Quando uma besta ou plantar atacar você, essa\r\n"
				+ "criatura deverá fazer um teste de resistência de\r\n"
				+ "Sabedoria contra uma CD igual a das suas magias de\r\n"
				+ "druida. Em uma falha, a criatura deve escolher um alvo\r\n"
				+ "diferente ou o ataque erra automaticamente. Em um\r\n"
				+ "sucesso, a criatura se torna imune a esse efeito por 24\r\n"
				+ "horas.\r\n"
				+ "A criatura está ciente deste efeito antes de resolver\r\n"
				+ "atacar você.\r\n\n");
	}
	
//Circulo da lua
	public void circuloLua() {
		System.out.println("CÍRCULO DA LUA\r\n\n"
				+ "Os druidas do Círculo da Lua são ferrenhos guardiões na\r\n"
				+ "natureza. Sua ordem se reuni nas noites de lua cheia\r\n"
				+ "para partilhar notícias e trocar informações. Eles\r\n"
				+ "assombram as partes mais profundas das florestas, onde\r\n"
				+ "eles podia ir por semanas a fio antes de cruzar o caminho\r\n"
				+ "de outro humanoide e, muito menos outro druida.\r\n"
				+ "Tão mutável quanto a lua, um druida desse círculo\r\n"
				+ "poderia espreitar como um grande felino, voar sobre a\r\n"
				+ "copa das árvores como uma águia no dia seguinte e\r\n"
				+ "mergulhar pela vegetação rasteira como um urso para\r\n"
				+ "expulsar um monstro invasor. A selvageria está no\r\n"
				+ "sangue do druida.\r\n\n"
				+ "FORMA SELVAGEM DE COMBATE\r\n\n"
				+ "Quando você escolhe esse círculo, no 2° nível, você recebe\r\n"
				+ "a habilidade de usar sua Forma Selvagem no seu turno\r\n"
				+ "com uma ação bônus, ao invés de com uma ação.\r\n"
				+ "Além disso, enquanto você estiver transformando pela\r\n"
				+ "sua Forma Selvagem, você pode usar uma ação bônus\r\n"
				+ "para gastar uma espaço de magia e ganhar 1d8 pontos de\r\n"
				+ "vida por nível do espaço de magia gasto.\r\n\n"
				+ "FORMAS DE CÍRCULO\r\n\n"
				+ "Os ritos do seu círculo garantem a você a habilidade de se\r\n"
				+ "transformar em formas animais mais poderosas. A partir\r\n"
				+ "do 2° nível, você pode usar sua Forma Selvagem para se\r\n"
				+ "transformar em uma besta com nível de desafio até 1\r\n"
				+ "(você ignora a coluna ND Max da tabela Formas de Besta,\r\n"
				+ "mas ainda deve acatar as limitações descritas lá).\r\n"
				+ "A partir do 6° nível, você pode se transformar em uma\r\n"
				+ "besta com nível de desafio tão alto quanto seu nível de\r\n"
				+ "druida dividido por 3, arredondado para baixo.\r\n\n");
	}
	
	public void circuloLuaN6() {
		System.out.println("ATAQUE PRIMORDIAL\r\n\n"
				+ "A partir do 6° nível, seus ataques na forma de besta\r\n"
				+ "contam como mágicos com os propósitos de ultrapassar\r\n"
				+ "resistência e imunidade a ataques e danos não-mágicos.\r\n\n");
	}
	
	public void circuloLuaN10() {
		System.out.println("FORMA SELVAGEM DE ELEMENTAL\r\n\n"
				+ "No 10° nível, você pode gastar dois usos da sua Forma\r\n"
				+ "Selvagem, ao mesmo tempo, para se transformar em um\r\n"
				+ "elemental da água, elemental do ar, elemental do fogo ou\r\n"
				+ "elemental da terra.\r\n\n");
	}
	
	public void circuloLunaN14() {
		System.out.println("MIL FORMAS\r\n\n"
				+ "No 14° nível, você aprende a usar magia para alterar sua\r\n"
				+ "forma física de formas mais sutis. Você pode conjurar a\r\n"
				+ "magia alterar-se à vontade.\r\n\n");
	}
}
