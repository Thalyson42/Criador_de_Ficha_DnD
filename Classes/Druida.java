package Classes;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;


import CriadorDeFicha.Classes;

public class Druida extends Classes{
	private List<String> pericias = Arrays.asList("Arcanismo", "Adestrar Animais", "Intui��o", "Medicina", "Natureza", "Percep��o", "Religi�o", "Sobreviv�ncia");
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
				+ "elfa invoca a f�ria da tempestade e convoca raios\r\n"
				+ "explosivos de eletricidade para destruir os orcs\r\n"
				+ "carregando tochas que amea�am sua floresta.\r\n"
				+ "Se esgueirando, fora da vista, no alto da copa das\r\n"
				+ "�rvores na forma de um leopardo, um humano espreita\r\n"
				+ "para fora da selva, em dire��o da estranha constru��o de\r\n"
				+ "um Templo do Elemental do Ar Maligno, mantendo os\r\n"
				+ "olhos fixos nas atividades dos cultistas.\r\n"
				+ "Brandindo uma l�mina feita de puro fogo, um meioelfo investe em dire��o a uma massa de soldados\r\n"
				+ "esquel�ticos, destruindo a magia sobrenatural que deu as\r\n"
				+ "tolas criaturas o semblante falso de vida.\r\n"
				+ "Quer seja convocando as for�as elementais da\r\n"
				+ "natureza, ou emulando as criaturas do mundo animal, os\r\n"
				+ "druidas s�o encarna��es da resist�ncia, ast�cia e f�ria da\r\n"
				+ "natureza. Eles n�o se consideram donos da natureza. Ao\r\n"
				+ "inv�s disso, eles se veem como extens�es da vontade\r\n"
				+ "indom�vel da natureza.\r\n\n";
		return descricao;
	}

	public String CaracteristicasClasse() {
		String caracteristicas = "CARACTER�STICAS DE CLASSE\r\n\n"
				+ "Como um druida, voc� adquire as seguintes\r\n"
				+ "caracter�sticas de classe.\r\n\n"
				+ "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por n�vel de druida\r\n"
				+ "Pontos de Vida no 1� N�vel: 8 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constitui��o por n�vel de druida ap�s o\r\n"
				+ "1�\r\n\n"
				+ "PROFICI�NCIAS\r\n\n"
				+ "Armaduras: Armaduras leves, armaduras m�dias,\r\n"
				+ "escudos (druidas n�o ir�o vestir armaduras ou usar\r\n"
				+ "escudos feitos de metal)\r\n"
				+ "Armas: Clavas, adagas, dardos, azagaias, ma�as,\r\n"
				+ "bord�es, cimitarras, foices, fundas e lan�as.\r\n"
				+ "Ferramentas: Kit de herbalismo\r\n\n"
				+ "Testes de Resist�ncia: Intelig�ncia, Sabedoria\r\n"
				+ "Per�cias: Escolha duas dentre Arcanismo, Adestrar\r\n"
				+ "Animais, Intui��o, Medicina, Natureza, Percep��o,\r\n"
				+ "Religi�o e Sobreviv�ncia\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) um escudo de madeira ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "(a) uma cimitarra ou (b) qualquer arma corpo-a-corpo\r\n"
				+ "simples\r\n"
				+ "(a) um pacote de estudioso ou (b) um pacote de\r\n"
				+ "explorador\r\n"
				+ "- Armadura de couro, um pacote de aventureiro e um\r\n"
				+ "foco dru�dico\r\n\n";
		return caracteristicas;
	}
	
	
	public void setDruida() {
		getFicha().setClasse("Druida");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Armaduras leves", "Armaduras m�dias", "Escudos", "Clavas", "Adagas", "Dardos", "Azagaias", "Ma�as", "Bord�es", "Cimitarras", "Foices", "Fundas", "Lan�as");
		getProficiencia().SetProfEquips(profEquips);
		getFicha().setProfi_ferramentas_peri("Kit de herbalismo");
		List<String> profResistencia = Arrays.asList("Intelig�ncia", "Sabedoria");
		getProficiencia().SetResistencia(profResistencia);
		getFicha().setIdiomas("Dru�dico");
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
		System.out.println("DRU�DICO\r\n\n"
				+ "Voc� conhece o Dru�dico, o idioma secreto dos druidas.\r\n"
				+ "Voc� pode falar esse idioma e us�-lo para deixar\r\n"
				+ "mensagens escondidas. Voc� e outros que conhe�am esse\r\n"
				+ "idioma automaticamente veem tais mensagens. Outros\r\n"
				+ "perceber�o a presen�a da mensagem se passarem num\r\n"
				+ "teste de Sabedoria (Percep��o) CD 15, mas n�o\r\n"
				+ "conseguir�o decifr�-lo sem magia.\r\n\n"
				+ "CONJURA��O\r\n\n"
				+ "Baseado na ess�ncia divina da pr�pria natureza, voc�\r\n"
				+ "pode conjurar magias para moldar sua ess�ncia a sua\r\n"
				+ "vontade. Veja o cap�tulo 10 para as regras gerais de\r\n"
				+ "conjura��o e o cap�tulo 11 para a lista de magias de\r\n"
				+ "druida.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Voc� conhece dois truques, � sua escolha, da lista de\r\n"
				+ "magias de druida. Voc� aprende truques de druida\r\n"
				+ "adicionais, � sua escolha, em n�veis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Druida.\r\n\n"
				+ "PREPARANDO E CONJURANDO MAGIAS\r\n\n"
				+ "A tabela O Druida mostra quantos espa�os de magia voc�\r\n"
				+ "t�m para conjurar suas magias de 1� n�vel e superiores.\r\n"
				+ "Para conjurar uma dessas magias, voc� precisa gastar um\r\n"
				+ "espa�o do n�vel da magia ou superior. Voc� recupera todos\r\n"
				+ "os espa�os gastos quando termina um descanso longo.\r\n"
				+ "Voc� prepara a lista de magias dispon�veis\r\n"
				+ "selecionando-as da lista de magias de Druida. Voc�\r\n"
				+ "seleciona um n�mero de magias igual ao seu modificador\r\n"
				+ "de Sabedoria + seu n�vel de druida (m�nimo de uma\r\n"
				+ "magia). Essas magias devem ser de n�veis que voc�\r\n"
				+ "possua espa�os de magia.\r\n"
				+ "Por exemplo, se voc� � um druida de 3� n�vel, voc�\r\n"
				+ "possui quatro espa�os de magia de 1� n�vel e dois de 2�\r\n"
				+ "n�vel. Com Sabedoria 16, sua lista de magias preparadas\r\n"
				+ "pode incluir 6 magias, combinando as de 1� e 2� n�vel em\r\n"
				+ "qualquer ordem. Se voc� preparar a magia de 1� n�vel\r\n"
				+ "curar ferimentos, voc� pode conjur�-la com um espa�o de\r\n"
				+ "magia de 1� ou de 2� n�vel. Ao conjurar a magia, voc� n�o\r\n"
				+ "a retira de sua lista de magias preparadas, podendo\r\n"
				+ "conjur�-la de novo se tiver espa�os de magia dispon�veis.\r\n"
				+ "Voc� pode modificar a sua lista de magias preparadas\r\n"
				+ "quando termina um descanso longo. Preparar uma nova\r\n"
				+ "lista de magias de druida requer tempo gasto em preces e\r\n"
				+ "medita��o: no m�nimo 1 minuto por n�vel de magia para\r\n"
				+ "cada magia preparada.\r\n\n"
				+ "HABILIDADE DE CONJURA��O\r\n\n"
				+ "Sabedoria � a sua habilidade para voc� conjurar suas\r\n"
				+ "magias de druida, j� que sua magia vem da sua devo��o e\r\n"
				+ "sintonia com a natureza. Voc� usa sua Sabedoria sempre\r\n"
				+ "que alguma magia se referir a sua habilidade de conjurar\r\n"
				+ "magias. Al�m disso, voc� usa o seu modificador de\r\n"
				+ "Sabedoria para definir a CD dos testes de resist�ncia para\r\n"
				+ "as magias de druida que voc� conjura e quando voc�\r\n"
				+ "realiza uma jogada de ataque com uma magia.\r\n"
				+ "CD para suas magias = 8 + b�nus de profici�ncia +\r\n"
				+ "seu modificador de Sabedoria\r\n"
				+ "Modificador de ataque de magia = seu b�nus de profici�ncia +\r\n"
				+ "seu modificador de Sabedoria\r\n\n"
				+ "CONJURA��O DE RITUAL\r\n\n"
				+ "Voc� pode conjurar qualquer magia de druida que voc�\r\n"
				+ "conhe�a como um ritual se ela possuir o descritor ritual.\r\n\n"
				+ "FOCO DE CONJURA��O\r\n\n"
				+ "Voc� pode usar um foco dru�dico (encontrado no cap�tulo\r\n"
				+ "5) como foco de conjura��o das suas magias de druida.\r\n\n");
	}
	
	public void FeatsNivel2() {
		System.out.println("FORMA SELVAGEM\r\n"
				+ "A partir do 2� n�vel, voc� pode usar sua a��o para assumir\r\n"
				+ "magicamente a forma de uma besta que voc� j� tenha\r\n"
				+ "visto antes. Voc� pode usar essa caracter�stica duas vezes.\r\n"
				+ "Voc� recupera os usos quando termina um descanso curto\r\n"
				+ "ou longo.\r\n"
				+ "Seu n�vel de druida determina as bestas em que voc�\r\n"
				+ "pode se transformar, como mostrado na tabela Formas de\r\n"
				+ "Besta. No 2� n�vel, por exemplo, voc� pode se transformar\r\n"
				+ "em qualquer besta que possui n�vel de desafio 1/4 ou\r\n"
				+ "inferior que n�o possua deslocamento de voo ou nata��o.\r\n\n"
				+ "FORMAS DE BESTA\r\n\n"
				+ "N�vel ND M�x. Limita��es Exemplo\r\n"
				+ "2� 1/4 Sem deslocamento de voo\r\n"
				+ "ou nata��o\r\n"
				+ "Lobo\r\n"
				+ "4� 1/2 Sem deslocamento de voo Crocodilo\r\n"
				+ "8� 1 � �guia gigante\r\n"
				+ "Voc� pode continuar na forma de besta por um n�mero\r\n"
				+ "de horas igual � metade do seu n�vel de druida\r\n"
				+ "(arredondado para baixo). Ent�o, voc� volta a sua forma\r\n"
				+ "original, a n�o ser que voc� gaste outro uso dessa\r\n"
				+ "caracter�stica. Voc� pode reverter a sua forma normal\r\n"
				+ "prematuramente usando uma a��o b�nus no seu turno.\r\n"
				+ "Voc� reverte automaticamente se cair inconsciente, cair a\r\n"
				+ "0 pontos de vida ou morrer.\r\n"
				+ "Enquanto estiver transformado, as seguintes regras se\r\n"
				+ "aplicam:\r\n\n"
				+ "- Suas estat�sticas de jogo s�o substitu�das pelas\r\n"
				+ "estat�sticas da besta, mas voc� mantem sua tend�ncia,\r\n"
				+ "personalidade e valores de Intelig�ncia, Sabedoria e\r\n"
				+ "Carisma. Voc� tamb�m mantem suas profici�ncias em\r\n"
				+ "todas as suas per�cias e testes de resist�ncia, al�m de\r\n"
				+ "receber as profici�ncias da criatura. Se a criatura\r\n"
				+ "possuir a mesma profici�ncia que voc� e o b�nus no\r\n"
				+ "bloco de estat�stica dela for maior que o seu, voc�\r\n"
				+ "usar� o b�nus da criatura no lugar do seu. Se a\r\n"
				+ "criatura possuir qualquer a��o lend�ria ou de covil,\r\n"
				+ "voc� n�o pode us�-las.\r\n"
				+ "- Quando voc� se transforma, voc� assume os pontos de\r\n"
				+ "vida e Dados de Vida da criatura. Quando voc� reverte\r\n"
				+ "a sua forma normal, voc� retorna ao n�mero de pontos\r\n"
				+ "de vida que tinha antes de se transformar. Por�m, se\r\n"
				+ "voc� reverter como resultado de ter ca�do a 0 pontos de\r\n"
				+ "vida, todo o dano excedente ser� transferido para a\r\n"
				+ "sua forma normal. Por exemplo, se voc� sofrer 10\r\n"
				+ "pontos de dano em forma animal e tiver apenas 1\r\n"
				+ "ponto de vida restante, voc� reverte e sofre 9 de dano.\r\n"
				+ "Contanto que o dano excedente n�o reduza voc� a 0\r\n"
				+ "pontos de vida, voc� n�o cair� inconsciente.\r\n"
				+ "- Voc� n�o pode conjurar magias e sua capacidade de\r\n"
				+ "fala ou de realizar qualquer a��o que requeira m�os\r\n"
				+ "s�o limitadas pelas capacidades da forma da besta que\r\n"
				+ "voc� assumiu. Transformar-se n�o interrompe sua\r\n"
				+ "concentra��o em uma magia que voc� j� tenha\r\n"
				+ "conjurado, no entanto, nem previne voc� de realizar\r\n"
				+ "a��es que s�o parte da conjura��o, como convocar\r\n"
				+ "rel�mpagos que voc� j� tenha conjurado.\r\n"
				+ "- Voc� mantem os benef�cios de todas as caracter�sticas\r\n"
				+ "de classe, ra�a ou outras fontes, e pode us�-las caso a\r\n"
				+ "nova forma seja fisicamente capaz de faz�-lo. No\r\n"
				+ "entanto, voc� n�o pode usar qualquer dos seus\r\n"
				+ "sentidos especiais, como vis�o no escuro, a n�o ser que\r\n"
				+ "a sua nova forma tamb�m tenha esse sentido.\r\n"
				+ "- Voc� pode escolher se o seu equipamento cai no ch�o\r\n"
				+ "no seu espa�o, � assimilado a sua nova forma ou �\r\n"
				+ "usado por ela. Equipamentos vestidos e carregados\r\n"
				+ "funcionam normalmente, mas o Mestre decide qual\r\n"
				+ "equipamento � vi�vel para a nova forma vestir ou\r\n"
				+ "usar, baseado na forma e tamanho da criatura. O seu\r\n"
				+ "equipamento n�o muda de forma ou tamanho\r\n"
				+ "para se adaptar � nova forma e,\r\n"
				+ "qualquer equipamento que a nova\r\n"
				+ "forma n�o possa vestir deve, ou cair no\r\n"
				+ "ch�o ou ser assimilado por ela.\r\n"
				+ "Equipamentos assimilados n�o ter�o\r\n"
				+ "efeito at� voc� deixar a forma.\r\n\n"
				+ "C�RCULO DRU�DICO\r\n\n"
				+ "No 2� n�vel, voc� escolhe se identificar com um\r\n"
				+ "c�rculo de druidas: o C�rculo da Terra ou o C�rculo da\r\n"
				+ "Lua, ambos detalhados no final da descri��o da classe.\r\n"
				+ "Sua escolha lhe concede caracter�sticas no 2� n�vel e\r\n"
				+ "novamente no 6�, 10� e 14� n�vel.\r\n\n");
	}
	
//incremento no valor de habilidade
	public void incrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16�\r\n"
				+ "e 19� n�vel, voc� pode aumentar um valor de habilidade, �\r\n"
				+ "sua escolha, em 2 ou voc� pode aumentar dois valores de\r\n"
				+ "habilidade, � sua escolha, em 1. Como padr�o, voc� n�o\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "caracter�stica.\r\n\n");
	}
	
	public void featsnivel18() {
		System.out.println("CORPO ATEMPORAL\r\n\n"
				+ "Come�ando no 18� n�vel, a magia primordial que voc�\r\n"
				+ "controla faz com que voc� envelhe�a mais lentamente.\r\n"
				+ "Para cada 10 anos que passarem, seu corpo envelhece\r\n"
				+ "apenas 1.\r\n\n"
				+ "MAGIAS DA BESTA\r\n\n"
				+ "A partir do 18� n�vel, voc� pode conjurar muitas das suas\r\n"
				+ "magias em qualquer forma que assumir usando a Forma\r\n"
				+ "Selvagem. Voc� pode realizar os componentes som�ticos e\r\n"
				+ "verbais de uma magia de druida na forma de besta, mas\r\n"
				+ "voc� n�o � capaz de prover os componentes materiais.\r\n\n");
	}
	
	public void featsnivel20() {
		System.out.println("ARQUIDRUIDA\r\n\n"
				+ "No 20� n�vel, voc� pode usar sua Forma Selvagem um\r\n"
				+ "n�mero ilimitado de vezes.\r\n"
				+ "Al�m disso, voc� pode ignorar os componentes verbais\r\n"
				+ "e som�ticos das suas magias de druida, assim como\r\n"
				+ "qualquer componente material que n�o tenha custo e n�o\r\n"
				+ "seja consumido pela magia. Voc� recebe esse benef�cio\r\n"
				+ "tanto na sua forma normal, quanto na forma de besta da\r\n"
				+ "sua Forma Selvagem.\r\n\n");
	}
	
//Circulo druidico
	public void circulosDruidicos() {
		System.out.println("C�RCULOS DRU�DICOS\r\n\n"
				+ "Apesar de suas organiza��es serem invis�veis para a\r\n"
				+ "maioria dos forasteiros, os druidas fazem parte de uma\r\n"
				+ "sociedade que se espalham pela terra, ignorando\r\n"
				+ "barreiras pol�ticas. Todos os druidas s�o nominalmente\r\n"
				+ "membros de uma sociedade dru�dica, apesar de alguns\r\n"
				+ "indiv�duos serem t�o isolados que eles nunca chegaram a\r\n"
				+ "ver membros de alta patente da sociedade ou\r\n"
				+ "participaram de encontros dru�dicos. Os druidas\r\n"
				+ "consideram-se irm�os e irm�s. Como criaturas na\r\n"
				+ "natureza, no entanto, os druidas, as vezes, competem, ou\r\n"
				+ "mesmo ca�am uns aos outros.\r\n"
				+ "Em uma escala local, os druidas s�o organizados em\r\n"
				+ "c�rculos que partilham de certas perspectivas de\r\n"
				+ "natureza, equil�brio e modos de um druida.\r\n\n");
	}
	
	public void circuloTerra() {
		System.out.println("C�RCULO DA TERRA\r\n\n"
				+ "O C�rculo da Terra � constitu�do por m�sticos e s�bios que\r\n"
				+ "salvaguardam conhecimento e ritos antigos atrav�s de\r\n"
				+ "uma vasta tradi��o oral. Esses druidas se encontram em\r\n"
				+ "c�rculos sagrados de �rvores ou mon�litos para sussurrar\r\n"
				+ "segredos primordiais em Dru�dico. Os membros mais\r\n"
				+ "s�bios do c�rculo presidem como os sacerdotes-dirigentes\r\n"
				+ "de comunidades que creem na Cren�a Antiga, e servem\r\n"
				+ "como conselheiros para os governantes desses povos.\r\n"
				+ "Como membro desse c�rculo, sua magia � influenciada\r\n"
				+ "pela terra onde voc� � iniciado nos ritos misteriosos do\r\n"
				+ "c�rculo.\r\n\n"
				+ "TRUQUE ADICIONAL\r\n\n"
				+ "Quando voc� escolhe esse c�rculo no 2� n�vel, voc� aprende\r\n"
				+ "um truque de druida adicional, � sua escolha.\r\n\n"
				+ "RECUPERA��O NATURAL\r\n\n"
				+ "A partir do 2� n�vel, voc� pode recuperar parte da sua\r\n"
				+ "energia m�gica parando para fazer uma medita��o e\r\n"
				+ "comunh�o com a natureza. Durante um descanso curto,\r\n"
				+ "voc� escolhe espa�os de magia gastos para recuperar. O\r\n"
				+ "espa�o de magia pode ter um n�vel combinado igual ou\r\n"
				+ "menor que metade do seu n�vel de druida (arredondado\r\n"
				+ "para baixo) e, nenhum dos espa�os pode ser de uma\r\n"
				+ "magia de 6� n�vel ou superior. Voc� n�o pode usar essa\r\n"
				+ "caracter�stica novamente at� terminar um descanso\r\n"
				+ "longo.\r\n"
				+ "Por exemplo, quando voc� for um druida de 4� n�vel,\r\n"
				+ "voc� pode recuperar at� dois n�veis em espa�os de magia.\r\n"
				+ "Voc� pode recuperar, tanto uma magia de 2� n�vel, quanto\r\n"
				+ "duas magias de 1� n�vel.");
	}
	
	public void circuloTerraN3() {
		System.out.println("MAGIAS DE C�RCULO\r\n\n"
				+ "Sua conex�o m�stica com a terra infunde voc� com a\r\n"
				+ "habilidade de conjurar certas magias. No 3�, 5�, 7� e 9�\r\n"
				+ "n�vel, voc� ganha acesso a magias de c�rculo ligadas ao\r\n"
				+ "terreno em que voc� se tornou druida. Escolha o terreno �\r\n"
				+ "�rtico, costa, deserto, floresta, montanha, p�ntano,\r\n"
				+ "plan�cie ou subterr�neo � e consulte a lista de magias\r\n"
				+ "associada.\r\n"
				+ "Uma vez que voc� tenha acesso a uma magia de\r\n"
				+ "c�rculo, voc� sempre poder� prepar�-la e ela n�o conta no\r\n"
				+ "n�mero de magias que voc� pode preparar a cada dia. Se\r\n"
				+ "voc� tiver acesso a uma magia que n�o aparece na lista de\r\n"
				+ "magias de druida, a magia, no entanto, ser� uma magia\r\n"
				+ "de druida para voc�.\r\n\n"
				+ "�RTICO\r\n\n"
				+ "N�vel de Druida Magias de C�rculo\r\n"
				+ "3� imobilizar pessoa, crescer espinho\r\n"
				+ "5� nevasca, lentid�o\r\n"
				+ "7� movimenta��o livre, tempestade de gelo\r\n"
				+ "9� comunh�o com a natureza, cone de frio\r\n\n"
				+ "COSTA\r\n\n"
				+ "N�vel de Druida Magias\r\n"
				+ "3� passo nebuloso, reflexos\r\n"
				+ "5� andar na �gua, respirar �gua\r\n"
				+ "7� movimenta��o livre, controlar �gua\r\n"
				+ "9� vid�ncia, conjurar elemental\r\n\n"
				+ "DESERTO\r\n\n"
				+ "N�vel de Druida Magias\r\n"
				+ "3� nublar, sil�ncio\r\n"
				+ "5� criar alimentos, prote��o contra energia\r\n"
				+ "7� praga, terreno alucin�geno\r\n"
				+ "9� muralha de pedra, praga de insetos\r\n\n"
				+ "FLORESTA\r\n\n"
				+ "N�vel de Druida Magias\r\n"
				+ "3� patas de aranha, pele de �rvore\r\n"
				+ "5� convocar rel�mpagos, crescer plantas\r\n"
				+ "7� adivinha��o, movimenta��o livre\r\n"
				+ "9� comunh�o com a natureza, passo de �rvore\r\n\n"
				+ "MONTANHA\r\n\n"
				+ "N�vel de Druida Magias\r\n"
				+ "3� crescer espinho, patas de aranha\r\n"
				+ "5� mesclar-se �s rochas, rel�mpago\r\n"
				+ "7� moldar rochas, pele de pedra\r\n"
				+ "9� criar passagem, muralha de pedra\r\n\n"
				+ "P�NTANO\r\n\n"
				+ "N�vel de Druida Magias\r\n"
				+ "3� escurid�o, flecha �cida\r\n"
				+ "5� andar na �gua, n�voa f�tida\r\n"
				+ "7� localizar criatura, movimenta��o livre\r\n"
				+ "9� vid�ncia, praga de insetos\r\n\n"
				+ "PLAN�CIE\r\n\n"
				+ "N�vel de Druida Magias\r\n"
				+ "3� invisibilidade, passos sem pegadas\r\n"
				+ "5� luz do dia, velocidade\r\n"
				+ "7� adivinha��o, movimenta��o livre\r\n"
				+ "9� praga de insetos, sonho\r\n\n"
				+ "SUBTERR�NEO\r\n\n"
				+ "N�vel de Druida Magias\r\n"
				+ "3� patas de aranha, teia\r\n"
				+ "5� forma gasosa, n�voa f�tida\r\n"
				+ "7� invisibilidade maior, moldar rochas\r\n"
				+ "9� praga de insetos, n�voa mortal\r\n\n");
	}
	
	public void circuloTerraN6() {
		System.out.println("CAMINHO DA FLORESTA\r\n\n"
				+ "A partir do 6� n�vel, mover-se atrav�s de terreno dif�cil\r\n"
				+ "n�o-m�gico n�o te custar� nenhum movimento extra.\r\n"
				+ "Voc� tamb�m pode passar atrav�s de plantas n�o-m�gicas\r\n"
				+ "sem ser atrasado por elas e sem sofrer dano delas se elas\r\n"
				+ "tiverem espinhos, espinhas ou perigos similares.\r\n"
				+ "Al�m disso, voc� tem vantagem em testes de\r\n"
				+ "resist�ncia contra plantas criadas magicamente ou\r\n"
				+ "manipuladas para impedir movimenta��o, como as\r\n"
				+ "criadas pela magia constri��o.\r\n\n");
	}
	
	public void circuloTerraN10() {
		System.out.println("PROTE��O NATURAL\r\n"
				+ "Quando voc� atingir o 10� n�vel, voc� n�o pode ser\r\n"
				+ "enfeiti�ado ou amedrontado por elementais ou fadas e\r\n"
				+ "voc� se torna imune a venenos e doen�as.\r\n");
	}
	
	public void circuloTerraN14() {
		System.out.println("SANTU�RIO NATURAL\r\n\n"
				+ "A partir do 14� n�vel, as criaturas do mundo natural\r\n"
				+ "sentem sua liga��o com a natureza e hesitar�o em atacar\r\n"
				+ "voc�. Quando uma besta ou plantar atacar voc�, essa\r\n"
				+ "criatura dever� fazer um teste de resist�ncia de\r\n"
				+ "Sabedoria contra uma CD igual a das suas magias de\r\n"
				+ "druida. Em uma falha, a criatura deve escolher um alvo\r\n"
				+ "diferente ou o ataque erra automaticamente. Em um\r\n"
				+ "sucesso, a criatura se torna imune a esse efeito por 24\r\n"
				+ "horas.\r\n"
				+ "A criatura est� ciente deste efeito antes de resolver\r\n"
				+ "atacar voc�.\r\n\n");
	}
	
//Circulo da lua
	public void circuloLua() {
		System.out.println("C�RCULO DA LUA\r\n\n"
				+ "Os druidas do C�rculo da Lua s�o ferrenhos guardi�es na\r\n"
				+ "natureza. Sua ordem se reuni nas noites de lua cheia\r\n"
				+ "para partilhar not�cias e trocar informa��es. Eles\r\n"
				+ "assombram as partes mais profundas das florestas, onde\r\n"
				+ "eles podia ir por semanas a fio antes de cruzar o caminho\r\n"
				+ "de outro humanoide e, muito menos outro druida.\r\n"
				+ "T�o mut�vel quanto a lua, um druida desse c�rculo\r\n"
				+ "poderia espreitar como um grande felino, voar sobre a\r\n"
				+ "copa das �rvores como uma �guia no dia seguinte e\r\n"
				+ "mergulhar pela vegeta��o rasteira como um urso para\r\n"
				+ "expulsar um monstro invasor. A selvageria est� no\r\n"
				+ "sangue do druida.\r\n\n"
				+ "FORMA SELVAGEM DE COMBATE\r\n\n"
				+ "Quando voc� escolhe esse c�rculo, no 2� n�vel, voc� recebe\r\n"
				+ "a habilidade de usar sua Forma Selvagem no seu turno\r\n"
				+ "com uma a��o b�nus, ao inv�s de com uma a��o.\r\n"
				+ "Al�m disso, enquanto voc� estiver transformando pela\r\n"
				+ "sua Forma Selvagem, voc� pode usar uma a��o b�nus\r\n"
				+ "para gastar uma espa�o de magia e ganhar 1d8 pontos de\r\n"
				+ "vida por n�vel do espa�o de magia gasto.\r\n\n"
				+ "FORMAS DE C�RCULO\r\n\n"
				+ "Os ritos do seu c�rculo garantem a voc� a habilidade de se\r\n"
				+ "transformar em formas animais mais poderosas. A partir\r\n"
				+ "do 2� n�vel, voc� pode usar sua Forma Selvagem para se\r\n"
				+ "transformar em uma besta com n�vel de desafio at� 1\r\n"
				+ "(voc� ignora a coluna ND Max da tabela Formas de Besta,\r\n"
				+ "mas ainda deve acatar as limita��es descritas l�).\r\n"
				+ "A partir do 6� n�vel, voc� pode se transformar em uma\r\n"
				+ "besta com n�vel de desafio t�o alto quanto seu n�vel de\r\n"
				+ "druida dividido por 3, arredondado para baixo.\r\n\n");
	}
	
	public void circuloLuaN6() {
		System.out.println("ATAQUE PRIMORDIAL\r\n\n"
				+ "A partir do 6� n�vel, seus ataques na forma de besta\r\n"
				+ "contam como m�gicos com os prop�sitos de ultrapassar\r\n"
				+ "resist�ncia e imunidade a ataques e danos n�o-m�gicos.\r\n\n");
	}
	
	public void circuloLuaN10() {
		System.out.println("FORMA SELVAGEM DE ELEMENTAL\r\n\n"
				+ "No 10� n�vel, voc� pode gastar dois usos da sua Forma\r\n"
				+ "Selvagem, ao mesmo tempo, para se transformar em um\r\n"
				+ "elemental da �gua, elemental do ar, elemental do fogo ou\r\n"
				+ "elemental da terra.\r\n\n");
	}
	
	public void circuloLunaN14() {
		System.out.println("MIL FORMAS\r\n\n"
				+ "No 14� n�vel, voc� aprende a usar magia para alterar sua\r\n"
				+ "forma f�sica de formas mais sutis. Voc� pode conjurar a\r\n"
				+ "magia alterar-se � vontade.\r\n\n");
	}
}
