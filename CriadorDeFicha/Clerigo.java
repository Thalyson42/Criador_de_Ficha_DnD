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
		System.out.println("CL�RIGO\r\n\n"
				+ "Os bra�os e olhos erguem-se na dire��o do sol e com uma\r\n"
				+ "prece em seus l�bios, um elfo come�a a brilhar com luz\r\n"
				+ "pr�pria, que irradia para curar seus surrados\r\n"
				+ "companheiros em batalha.\r\n"
				+ "Com um c�ntico de batalha, um an�o golpeia com seu\r\n"
				+ "machado por todos os lados, abrindo caminho em meio �s\r\n"
				+ "linhas de orcs posicionadas contra ele, louvando os deuses\r\n"
				+ "por cada inimigo derrubado.\r\n"
				+ "Invocando maldi��es contra as for�as de mortos-vivos,\r\n"
				+ "um humano levanta seu s�mbolo sagrado enquanto a luz\r\n"
				+ "divina brilha ao seu redor, banindo as criaturas que h�\r\n"
				+ "um momento atr�s se amontoavam sobre seus\r\n"
				+ "companheiros.\r\n"
				+ "Cl�rigos s�o intermediadores entre o mundo mortal e o\r\n"
				+ "distante plano dos deuses. T�o variados quanto os deuses\r\n"
				+ "que servem, cl�rigos se esfor�am para ser a pr�pria m�o\r\n"
				+ "de seus deuses. N�o � apenas um sacerdote comum, mas\r\n"
				+ "algu�m investido de poder divino.\r\n\n"
				+ "CURANDEIROS E COMBATENTES\r\n\n"
				+ "Magia divina, como o nome sugere, � o poder dos deuses\r\n"
				+ "fluindo deles para o mundo mortal. Cl�rigos s�o os\r\n"
				+ "condutores desse poder, manifestando-o atrav�s de efeitos\r\n"
				+ "milagrosos. Os deuses n�o conferem esse poder a\r\n"
				+ "qualquer um que o queira, mas apenas �queles escolhidos\r\n"
				+ "para cumprir o chamado.\r\n"
				+ "Fazer uso do poder divino n�o envolve estudo ou\r\n"
				+ "treinamento. Um cl�rigo pode aprender ritos antigos e\r\n"
				+ "preces espec�ficas, mas a habilidade de usar magias\r\n"
				+ "divinas depende de devo��o e de uma intui��o poderosa\r\n"
				+ "sobre os desejos da divindade.\r\n"
				+ "Cl�rigos combinam o poder m�gico de curar e inspirar\r\n"
				+ "seus aliados com magias que ferem e debilitam seus\r\n"
				+ "inimigos. Eles podem causar medo e pavor, espalhar\r\n"
				+ "pragas ou venenos, e at� lan�ar fogo divino para consumir\r\n"
				+ "seus inimigos. Para aqueles malfeitores que merecem\r\n"
				+ "uma ma�a na t�mpora, o cl�rigo se utiliza de seu\r\n"
				+ "treinamento de combate para enfrentar seus inimigos\r\n"
				+ "corpo-a-corpo, auxiliado pelo poder divino.\r\n\n"
				+ "AGENTES DIVINOS\r\n\n"
				+ "Nem todo ac�lito ou servo em um templo ou santu�rio �\r\n"
				+ "necessariamente um cl�rigo. Alguns sacerdotes s�o\r\n"
				+ "chamados para uma vida simples de servid�o,\r\n"
				+ "propagando a vontade de seu deus atrav�s de preces e\r\n"
				+ "sacrif�cio, e n�o atrav�s de magia ou poderio militar. Em\r\n"
				+ "algumas cidades, o sacerd�cio equivale a um escrit�rio\r\n"
				+ "pol�tico, visto como um degrau s�lido para alcan�ar\r\n"
				+ "patamares superiores de autoridade e n�o envolvendo\r\n"
				+ "qualquer comunh�o com a divindade. Cl�rigos\r\n"
				+ "verdadeiros s�o raros nas estruturas hier�rquicas.\r\n"
				+ "Quando um cl�rigo inicia uma vida como aventureiro,\r\n"
				+ "geralmente � porque seu deus exigiu assim. Perseguir os\r\n"
				+ "objetivos de um deus geralmente envolve enfrentar\r\n"
				+ "perigos al�m dos limites da civiliza��o, destruindo o mal\r\n"
				+ "ou buscando rel�quias sagradas em tumbas antigas.\r\n"
				+ "Muitos cl�rigos s�o ainda requisitados para defender os\r\n"
				+ "adoradores de seu deus, o que pode significar combater\r\n"
				+ "ogros em f�ria, negociar a paz entre na��es ou selar um\r\n"
				+ "portal que permitiria que um corruptor entrasse no Plano\r\n"
				+ "Material.\r\n"
				+ "A maioria dos cl�rigos aventureiros mant�m conex�es\r\n"
				+ "com templos e ordens de sua religi�o. Um templo pode\r\n"
				+ "pedir a ajuda de um cl�rigo ou um sumo-sacerdote pode\r\n"
				+ "ter poder suficiente para exigir seus servi�os.\r\n\n");
	}
	
	public void clerigoConstrucaorapida() {
		System.out.println("CONSTRU��O R�PIDA\r\n\n"
				+ "Voc� pode fazer um cl�rigo rapidamente ao seguir estas\r\n"
				+ "sugest�es. Primeiro, Sabedoria deve ser sua habilidade\r\n"
				+ "mais alta, seguido de For�a ou Constitui��o. Segundo,\r\n"
				+ "escolha o antecedente Ac�lito.\r\n\n");
	}
	
	public void clerigoCaracteristicasClasse() {
		System.out.println("PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d8 por n�vel de cl�rigo\r\n"
				+ "Pontos de Vida no 1� N�vel: 8 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d8 (ou 5) + seu\r\n"
				+ "modificador de Constitui��o por n�vel de cl�rigo ap�s o\r\n"
				+ "1�\r\n\n"
				+ "PROFICI�NCIAS\r\n\n"
				+ "Armaduras: Armaduras leves, armaduras m�dias,\r\n"
				+ "escudos\r\n"
				+ "Armas: Todas as armas simples\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resist�ncia: Sabedoria, Carisma\r\n"
				+ "Per�cias: Escolha duas dentre Hist�ria, Intui��o,\r\n"
				+ "Medicina, Persuas�o e Religi�o\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) uma ma�a ou (b) um martelo de guerra (se for\r\n"
				+ "proficiente)\r\n"
				+ "- (a) brunea, (b) armadura de couro ou (c) cota de malha\r\n"
				+ "(se for proficiente)\r\n"
				+ "- (a) um besta leve e 20 virotes ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "- (a) um pacote de sacerdote ou (b) um pacote de\r\n"
				+ "aventureiro\r\n"
				+ "- Um escudo e um s�mbolo sagrado\r\n\n");
	}
	
	public void setClerigo() {
		getFicha().setClasse("Clerigo");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Armaduras leves", "Armaduras m�dias", "Escudos");
//		getProficiencia().setFicha(ficha);
		getProficiencia().SetProfEquips(profEquips);
		getProficiencia().SetProfEquips(getEquips().getArmas_simples_CAC());
		getProficiencia().SetProfEquips(getEquips().getArmas_simples_distancia());
		List<String> profResist = Arrays.asList("Sabedoria", "Carisma");
		getProficiencia().SetResistencia(profResist);
		List<String> profPericias = Arrays.asList("Hist�ria", "Intui��o", "Medicina", "Persuas�o", "Religi�o");
		getProficiencia().setPericias(profPericias, 2);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
		equips4();
		getFicha().setEquipamentos("Escudo");
		getFicha().setEquipamentos("S�mbolo sagrado");
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
//Cl�rigo feats padrao
	public void clerigoFeatsPadrao() {
		System.out.println("CONJURA��O\r\n\n"
				+ "Como um canalizador de poder divino, voc� pode conjurar\r\n"
				+ "magias de cl�rigo. Veja o cap�tulo 10 para as regras gerais\r\n"
				+ "de conjura��o e o cap�tulo 11 para a lista de magias de\r\n"
				+ "cl�rigo.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Voc� conhece tr�s truques, � sua escolha, da lista de\r\n"
				+ "magias de cl�rigo. Voc� aprende truques de cl�rigo\r\n"
				+ "adicionais, � sua escolha, em n�veis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Cl�rigo.\r\n\n"
				+ "PREPARANDO E CONJURANDO MAGIAS\r\n\n"
				+ "A tabela O Cl�rigo mostra quantos espa�os de magia voc�\r\n"
				+ "t�m para conjurar suas magias de 1� n�vel e superiores.\r\n"
				+ "Para conjurar uma dessas magias, voc� precisa gastar um\r\n"
				+ "espa�o do n�vel da magia ou superior. Voc� recupera todos\r\n"
				+ "os espa�os gastos quando termina um descanso longo.\r\n"
				+ "Voc� prepara a lista de magias dispon�veis\r\n"
				+ "selecionando-as da lista de magias de cl�rigo. Voc�\r\n"
				+ "seleciona um n�mero de magias igual ao seu modificador\r\n"
				+ "de Sabedoria + seu n�vel de cl�rigo (m�nimo de uma\r\n"
				+ "magia). Essas magias devem ser de n�veis que voc�\r\n"
				+ "possua espa�os de magia.\r\n"
				+ "Por exemplo, se voc� � um cl�rigo de 3� n�vel, voc�\r\n"
				+ "possui quatro espa�os de magia de 1� n�vel e dois de 2�\r\n"
				+ "n�vel. Com Sabedoria 16, sua lista de magias preparadas\r\n"
				+ "pode incluir 6 magias, combinando as de 1� e 2� n�vel em\r\n"
				+ "qualquer ordem. Se voc� preparar a magia de 1� n�vel\r\n"
				+ "curar ferimentos, voc� pode conjur�-la com um espa�o de\r\n"
				+ "magia de 1� ou de 2� n�vel. Ao conjurar a magia, voc� n�o\r\n"
				+ "a retira de sua lista de magias preparadas, podendo\r\n"
				+ "conjur�-la de novo se tiver espa�os de magia dispon�veis.\r\n\n"
				+ "Voc� pode modificar a sua lista de magias preparadas\r\n"
				+ "quando termina um descanso longo. Preparar uma nova\r\n"
				+ "lista de magias de cl�rigo requer tempo gasto em preces e\r\n"
				+ "medita��o: no m�nimo 1 minuto por n�vel de magia para\r\n"
				+ "cada magia preparada.\r\n\n"
				+ "HABILIDADE DE CONJURA��O\r\n\n"
				+ "Sabedoria � a sua habilidade para voc� conjurar suas\r\n"
				+ "magias de cl�rigo. O poder de suas magias vem da\r\n"
				+ "devo��o que voc� tem ao seu deus. Voc� usa sua\r\n"
				+ "Sabedoria sempre que alguma magia se referir a sua\r\n"
				+ "habilidade de conjurar magias. Al�m disso, voc� usa o seu\r\n"
				+ "modificador de Sabedoria para definir a CD dos testes de\r\n"
				+ "resist�ncia para as magias de cl�rigo que voc� conjura e\r\n"
				+ "quando voc� realiza uma jogada de ataque com uma\r\n"
				+ "magia.\r\n"
				+ "CD para suas magias = 8 + b�nus de profici�ncia +\r\n"
				+ "seu modificador de Sabedoria\r\n"
				+ "Modificador de ataque de magia = seu b�nus de profici�ncia +\r\n"
				+ "seu modificador de Sabedoria\r\n\n"
				+ "CONJURA��O DE RITUAL\r\n\n"
				+ "Voc� pode conjurar qualquer magia de cl�rigo que voc�\r\n"
				+ "conhe�a como um ritual se ela possuir o descritor ritual.\r\n\n"
				+ "FOCO DE CONJURA��O\r\n\n"
				+ "Voc� pode usar um s�mbolo sagrado (encontrado no\r\n"
				+ "cap�tulo 5) como foco de conjura��o das suas magias de\r\n"
				+ "cl�rigo.\r\n\n"
				+ "DOM�NIO DIVINO\r\n\n"
				+ "Escolha um dom�nio relacionado � sua divindade:\r\n"
				+ "Conhecimento, Engana��o, Guerra, Luz, Natureza,\r\n"
				+ "Tempestade ou Vida. Cada dom�nio � detalhado ao final\r\n"
				+ "da descri��o da classe e, cada um, fornece exemplos dos\r\n"
				+ "deuses associados a eles. Essa escolha, realizada no 1�\r\n"
				+ "n�vel, concede magias de dom�nio e outras caracter�sticas.\r\n"
				+ "Ela tamb�m concede a voc� outras formas de utilizar seu\r\n"
				+ "Canalizar Divindade quando voc� ganh�-lo no 2� n�vel,\r\n"
				+ "bem como outros benef�cios no 6�, 8� e 17� n�veis.\r\n\n"
				+ "MAGIAS DE DOM�NIO\r\n\n"
				+ "Cada dom�nio tem uma lista de magias � as magias de\r\n"
				+ "dom�nio � que voc� adquire nos n�veis especificados pelo\r\n"
				+ "seu dom�nio. Quando voc� ganha uma magia de dom�nio,\r\n"
				+ "voc� sempre a tem preparada, e essa magia n�o conta no\r\n"
				+ "n�mero de magias que voc� pode preparar a cada dia.\r\n"
				+ "Se voc� tem uma magia de dom�nio que n�o aparece\r\n"
				+ "na lista de magias de cl�rigo, mesmo assim ela � uma\r\n"
				+ "magia de cl�rigo para voc�.\r\n\n");
	}
	
//Cl�rigo feats nivel 2
	public void clerigoFeatsNivel2() {
		System.out.println("CANALIZAR DIVINDADE\r\n\n"
				+ "No 2� n�vel, voc� se torna capaz de canalizar energia\r\n"
				+ "diretamente de sua divindade, utilizando-a como\r\n"
				+ "combust�vel para efeitos m�gicos. Voc� come�a com dois\r\n"
				+ "efeitos: Expulsar Mortos-vivos e um efeito determinado\r\n"
				+ "pelo seu dom�nio. Alguns dom�nios conferem efeitos\r\n"
				+ "adicionais conforme voc� avan�a de n�vel, como consta na\r\n"
				+ "descri��o de cada dom�nio.\r\n"
				+ "Quando voc� usar seu Canalizar Divindade, voc�\r\n"
				+ "escolhe qual efeito quer criar. Voc� precisa terminar um\r\n"
				+ "descanso curto ou longo para usar a caracter�stica de\r\n"
				+ "novo.\r\n"
				+ "Alguns efeitos requerem teste de resist�ncia. Quando\r\n"
				+ "voc� usar um desses efeitos, a CD � igual a das suas\r\n"
				+ "magias de cl�rigo.\r\n"
				+ "A partir do 6� n�vel, voc� pode Canalizar Divindade\r\n"
				+ "duas vezes entre descansos e a partir do 18� n�vel, tr�s\r\n"
				+ "vezes. Voc� recupera os usos dessa caracter�stica quando\r\n"
				+ "termina um descanso curto ou longo.\r\n\n"
				+ "CANALIZAR DIVINDADE: EXPULSAR MORTOS-VIVOS\r\n\n"
				+ "Usando uma a��o, voc� levanta seu s�mbolo sagrado e\r\n"
				+ "murmura uma prece repreendendo os mortos-vivos. Cada\r\n"
				+ "morto-vivo que puder ver ou ouvir voc� em um raio de 9\r\n"
				+ "metros a partir de voc�, deve fazer um teste de resist�ncia\r\n"
				+ "de Sabedoria. Se falhar, a criatura est� expulsa por 1\r\n"
				+ "minuto ou at� sofrer algum dano.\r\n"
				+ "Uma criatura expulsa deve usar seu turno para fugir\r\n"
				+ "da melhor forma poss�vel e de forma alguma pode\r\n"
				+ "aproximar-se a mais de 9 metros de voc� por vontade\r\n"
				+ "pr�pria. Ela tamb�m n�o pode usar rea��es. Como uma\r\n"
				+ "a��o, a criatura pode apenas realizar uma Disparada ou\r\n"
				+ "tentar escapar de um efeito que a impe�a de se mover.\r\n"
				+ "Se n�o h� lugar para ir, a criatura pode usar a a��o\r\n"
				+ "Esquivar.\r\n\n");
	}
	
//Cl�rigo incremento no valor de habilidade
	public void clerigoIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16�\r\n"
				+ "e 19� n�vel, voc� pode aumentar um valor de habilidade, �\r\n"
				+ "sua escolha, em 2 ou voc� pode aumentar dois valores de\r\n"
				+ "habilidade, � sua escolha, em 1. Como padr�o, voc� n�o\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "caracter�stica.\r\n\n");
	}

//Nivel 5
	public void nivel5() {
		System.out.println("DESTRUIR MORTOS-VIVOS\r\n\n"
				+ "A partir do 5� n�vel, quando um morto-vivo falhar no teste\r\n"
				+ "de resist�ncia contra a sua caracter�stica Expulsar\r\n"
				+ "Mortos-vivos, ele � instantaneamente destru�do se o N�vel\r\n"
				+ "de Desafio dele for menor ou igual ao valor da tabela\r\n"
				+ "Destruir Mortos-vivos, de acordo com seu n�vel de cl�rigo.\r\n"
				+ "DESTRUIR MORTOS-VIVOS\r\n"
				+ "N�vel de\r\n"
				+ "Cl�rigo\r\n"
				+ "Destr�i Mortos-Vivos de ND\r\n"
				+ "5� 1/2 ou menor\r\n"
				+ "8� 1 ou menor\r\n"
				+ "11� 2 ou menor\r\n"
				+ "14� 3 ou menor\r\n"
				+ "17� 4 ou menor\r\n\n");
	}
	
//Nivel 10
	public void nivel10() {
		System.out.println("INTERVEN��O DIVINA\r\n"
				+ "A partir do 10� n�vel, voc� pode rogar � sua divindade\r\n"
				+ "para que auxilie voc� em uma �rdua tarefa.\r\n"
				+ "Implorar pelo aux�lio requer uma a��o. Voc� precisa\r\n"
				+ "descrever o que busca e realizar uma rolagem de dado de\r\n"
				+ "percentagem. Se o resultado for menor ou igual ao seu\r\n"
				+ "n�vel de cl�rigo, sua divindade interv�m. O Mestre\r\n"
				+ "escolhe a natureza da interven��o. O efeito de qualquer\r\n"
				+ "magia de cl�rigo ou magia de dom�nio � apropriado como\r\n"
				+ "resultado.\r\n"
				+ "Se sua divindade intervir, voc� fica impedido de usar\r\n"
				+ "essa caracter�stica de novo por 7 dias. Do contr�rio, voc�\r\n"
				+ "pode us�-la de novo ap�s terminar um descanso longo.\r\n"
				+ "No 20� n�vel, seus pedidos de interven��o funcionam\r\n"
				+ "automaticamente, sem necessidade de rolagem de dados.\r\n");
	}
	
//Dominios divinos
	public void dominiosdivinos() {
		System.out.println("DOM�NIOS DIVINOS\r\n\n"
				+ "Em um pante�o, cada divindade tem influ�ncia sobre\r\n"
				+ "certos aspectos da vida mortal e da civiliza��o, chamados\r\n"
				+ "de dom�nios divinos. Juntando-se os dom�nios sobre os\r\n"
				+ "quais uma divindade tem influ�ncia, t�m-se um conjunto\r\n"
				+ "denominado portf�lio da divindade. Por exemplo, o\r\n"
				+ "portf�lio do deus grego Apolo inclui os dom�nios do\r\n"
				+ "Conhecimento, da Luz e da Vida. Como um cl�rigo, voc�\r\n"
				+ "escolhe um aspecto de sua divindade para enfatizar,\r\n"
				+ "ganhando os poderes relativos �quele dom�nio.\r\n"
				+ "Essa escolha pode ainda corresponder a um grupo\r\n"
				+ "dedicado �quele deus. Apolo, por exemplo, pode ser\r\n"
				+ "venerado em uma regi�o como Phoebus (�radiante�)\r\n"
				+ "Apolo, enfatizando sua associa��o sobre o dom�nio da Luz,\r\n"
				+ "e em outro local como Apolo Acesius (�curandeiro�),\r\n"
				+ "enfatizando seu dom�nio sobre a Vida. Da mesma forma, o\r\n"
				+ "dom�nio que voc� escolher poderia simplesmente\r\n"
				+ "representar uma prefer�ncia pessoal, o aspecto da\r\n"
				+ "divindade que mais agrada voc�.\r\n"
				+ "A descri��o de cada dom�nio inclui exemplos de\r\n"
				+ "divindades que t�m influ�ncia sobre eles. Est�o inclu�dos\r\n"
				+ "deuses dos mundos dos Reinos Esquecidos, Greyhawk,\r\n"
				+ "Dragonlance e de Eberron, al�m dos antigos pante�es\r\n"
				+ "Celta, Eg�pcio, Grego e N�rdico.\r\n\n");
	}

//dominio do conhecimento
	public void dominiodoCon() {
		System.out.println("DOM�NIO DO CONHECIMENTO\r\n\n"
				+ "Os deuses do conhecimento � como Oghma, Boccob,\r\n"
				+ "Gilean, Aureon e Thoth � valorizam o estudo e\r\n"
				+ "compreens�o acima de tudo. Alguns ensinam que o\r\n"
				+ "conhecimento deve ser coletado e partilhado em\r\n"
				+ "bibliotecas e universidades ou promovem o conhecimento\r\n"
				+ "pr�tico do artesanato e da inven��o. Algumas divindades\r\n"
				+ "escondem conhecimentos e os mantem em segredo para si\r\n"
				+ "mesmos. E outros prometem a seus seguidores que eles\r\n"
				+ "ganhar�o poderes tremendos se desvendarem os segredos\r\n"
				+ "do multiverso. Os seguidores desses deuses estudam\r\n"
				+ "conhecimento exot�rico, coletam tomos antigos, escavam\r\n"
				+ "locais secretos da terra e aprendem tudo que podem.\r\n"
				+ "Alguns deuses do conhecimento que promovem a pr�tica\r\n"
				+ "de of�cios e cria��o incluem deuses da forja como Gond,\r\n"
				+ "Reorx, Onatar, Moradin, Hefesto e Goibhniu.\r\n\n"
				+ "MAGIAS DO DOM�NIO DO CONHECIMENTO\r\n\n"
				+ "N�vel de Cl�rigo Magias\r\n"
				+ "1� comando, identifica��o\r\n"
				+ "3� aug�rio, sugest�o\r\n"
				+ "5� dificultar detec��o, falar com os mortos\r\n"
				+ "7� olho arcano, confus�o\r\n"
				+ "9� conhecimento lend�rio, vid�ncia\r\n\n"
				+ "B�N��OS DO CONHECIMENTO\r\n\n"
				+ "No 1� n�vel, voc� aprende dois idiomas, � sua escolha.\r\n"
				+ "Voc� tamb�m se torna proficiente em duas per�cias, � sua\r\n"
				+ "escolha, dentre as seguintes: Arcanismo, Hist�ria,\r\n"
				+ "Natureza ou Religi�o.\r\n"
				+ "Seu b�nus de profici�ncia � dobrado em qualquer teste\r\n"
				+ "de habilidade que voc� fizer usando qualquer dessas\r\n"
				+ "per�cias.\r\n\n");
	}
	
//Dominio do conhecimento nivel 2
	public void dominiodoConN2() {
		System.out.println("CANALIZAR DIVINDADE: CONHECIMENTO DAS ERAS\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar seu Canalizar\r\n"
				+ "Divindade para beber da fonte divina do conhecimento.\r\n"
				+ "Com uma a��o, voc� escolhe uma per�cia ou ferramenta.\r\n"
				+ "Por 10 minutos, voc� ter� profici�ncia com a per�cia ou\r\n"
				+ "ferramenta escolhida.\r\n\n");
	}
	
//dominio do conhecimento nivel 6
	public void dominiodoConN6() {
		System.out.println("CANALIZAR DIVINDADE: LER PENSAMENTOS\r\n\n"
				+ "No 6� n�vel, voc� pode usar seu Canalizar Divindade para\r\n"
				+ "ler a mente de uma criatura. Voc� pode, ent�o, usar seu\r\n"
				+ "acesso a mente da criatura para comand�-la.\r\n"
				+ "Com uma a��o, escolha uma criatura que voc� possa\r\n"
				+ "ver que esteja a at� 18 metros de voc�. Essa criatura deve\r\n"
				+ "realizar um teste de resist�ncia de Sabedoria, se for bem\r\n"
				+ "sucedida nesse teste, voc� n�o poder� usar essa\r\n"
				+ "caracter�stica contra ela novamente at� terminar um\r\n"
				+ "descanso longo.\r\n"
				+ "Se a criatura falhar no teste, voc� pode ler seus\r\n"
				+ "pensamentos superficiais (aqueles mais atuais, que\r\n"
				+ "refletem suas emo��es e no que voc� est� pensando\r\n"
				+ "constantemente) quando estiver a at� 18 metros de voc�.\r\n"
				+ "Esse efeito dura por 1 minuto.\r\n"
				+ "Durante esse tempo, voc� pode usar sua a��o para\r\n"
				+ "terminar esse efeito e conjurar a magia sugest�o na\r\n"
				+ "criatura sem gastar um espa�o de magia. O alvo falha\r\n"
				+ "automaticamente no teste de resist�ncia contra essa\r\n"
				+ "magia.\r\n\n");
	}
	
//dominio do conhecimento nivel 8
	public void dominiodoConN8() {
		System.out.println("CONJURA��O PODEROSA\r\n\n"
				+ "A partir do 8� n�vel, voc� adiciona seu modificador de\r\n"
				+ "Sabedoria no dano causado por qualquer truque de\r\n"
				+ "cl�rigo.\r\n\n");
	}
	
//dominio do conhecimento nivel 17
	public void dominiodoConN17() {
		System.out.println("VIS�ES DO PASSADO\r\n\n"
				+ "A partir do 17� n�vel, voc� pode convocar vis�es do\r\n"
				+ "passado relacionadas a um objeto que voc� esteja\r\n"
				+ "segurando ou sobre o ambiente ao seu redor. Voc� gasta\r\n"
				+ "pelo menos 1 minuto meditando e rezando, ent�o, recebe\r\n"
				+ "on�ricos vislumbres turvos dos eventos recentes. Voc�\r\n"
				+ "pode meditar dessa maneira por um n�mero de minutos\r\n"
				+ "igual ao seu valor de Sabedoria e deve manter a\r\n"
				+ "concentra��o durante esse tempo, como se voc� estivesse\r\n"
				+ "conjurando uma magia.\r\n"
				+ "Quando voc� usa essa caracter�stica, voc� n�o pode\r\n"
				+ "us�-la novamente at� terminar um descanso curto ou\r\n"
				+ "longo.\r\n\n"
				+ "Leitura de Objeto. Ao segurar um objeto enquanto\r\n"
				+ "medita, voc� pode ter vis�es do dono anterior do objeto.\r\n"
				+ "Depois de meditar por 1 minuto, voc� descobre como o\r\n"
				+ "antigo dono adquiriu e perdeu o objeto, assim como o\r\n"
				+ "evento recente mais significativo envolvendo o objeto e\r\n"
				+ "seu dono. Se o objeto foi portado por outra criatura num\r\n"
				+ "passado recente (dentro de um n�mero de dias igual ao\r\n"
				+ "seu valor de Sabedoria), voc� pode gastar 1 minuto\r\n"
				+ "adicional, por cada dono, para descobrir as mesmas\r\n"
				+ "informa��es sobre essa criatura.\r\n\n"
				+ "Leitura Local. � medida que voc� medita, voc� tem\r\n"
				+ "vis�es dos eventos recentes nas suas vizinhan�as\r\n"
				+ "pr�ximas (uma sala, rua, t�nel, clareira, ou similar, de\r\n"
				+ "at� 15 metros c�bicos), voltando um n�mero de dias igual\r\n"
				+ "ao seu valor de Sabedoria. Para cada minuto que voc�\r\n"
				+ "meditar, voc� descobre sobre um evento significativo, a\r\n"
				+ "partir dos mais recentes. Eventos significativos,\r\n"
				+ "normalmente envolvem emo��es fortes, como batalhas e\r\n"
				+ "trai��es, casamentos e assassinatos, nascimentos e\r\n"
				+ "funerais. No entanto, tamb�m podem incluir eventos mais\r\n"
				+ "mundanos, que podem ser, no entanto, relevantes na sua\r\n"
				+ "situa��o atual.\r\n\n");
	}
	
//dominio da engana��o
	public void dominioEn() {
		System.out.println("DOM�NIO DA ENGANA��O\r\n\n"
				+ "Deuses da engana��o � como Tymora, Beshaba,\r\n"
				+ "Olidammara, o Viajante, Garl Glittergold e Loki � s�o\r\n"
				+ "causadores de travessuras e instigadores que se mantem\r\n"
				+ "como um desafio constante para a aceita��o das ordens\r\n"
				+ "tanto de mortais quanto dos deuses. Eles s�o patronos dos\r\n"
				+ "ladr�es, trapaceiros, apostadores, rebeldes e libertadores.\r\n"
				+ "Seus cl�rigos s�o uma for�a intrometida no mundo,\r\n"
				+ "ferindo orgulhos, zombando de tiranos, roubando dos\r\n"
				+ "ricos, libertando cativos e desrespeitando tradi��es\r\n"
				+ "vazias. Eles preferem subterf�gio, trapa�as, engana��o e\r\n"
				+ "rouba no lugar do confronto direto.\r\n"
				+ "MAGIAS DO DOM�NIO DA ENGANA��O\r\n\n"
				+ "N�vel de Cl�rigo Magias\r\n\n"
				+ "1� enfeiti�ar pessoa, disfar�ar-se\r\n"
				+ "3� reflexos, passos sem pegadas\r\n"
				+ "5� piscar, dissipar magia\r\n"
				+ "7� porta dimensional, metamorfose\r\n"
				+ "9� dominar pessoa, modificar mem�ria\r\n"
				+ "B�N��O DO TRAPACEIRO\r\n\n"
				+ "A partir do momento em que voc� escolhe esse dom�nio,\r\n"
				+ "no 1� n�vel, voc� pode usar sua a��o para tocar uma\r\n"
				+ "criatura volunt�ria al�m de voc� mesmo para conceder\r\n"
				+ "vantagem em testes de Destreza (Furtividade). Essa\r\n"
				+ "b�n��o dura por 1 hora ou at� voc� usar essa\r\n"
				+ "caracter�stica novamente.\r\n\n");
	}
	
//dominio da engana��o nivel 2
	public void dominioEnN2() {
		System.out.println("CANALIZAR DIVINDADE: INVOCAR DUPLICIDADE\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar seu Canalizar\r\n"
				+ "Divindade para criar uma duplicada ilus�ria de si mesmo.\r\n"
				+ "Com uma a��o, voc� cria uma ilus�o perfeita de si\r\n"
				+ "mesmo que dura por 1 minuto ou at� voc� perder sua\r\n"
				+ "concentra��o (como se voc� estivesse se concentrando em\r\n"
				+ "uma magia). A ilus�o aparece em um espa�o desocupado\r\n"
				+ "que voc� possa ver a at� 9 metros de voc�. Com uma a��o\r\n"
				+ "b�nus, no seu turno, voc� pode mover a ilus�o at� 9\r\n"
				+ "metros para um espa�o que voc� possa ver, mas ela deve\r\n"
				+ "permanecer a at� 36 metros de voc�.\r\n"
				+ "Pela dura��o, voc� pode conjurar magias como se voc�\r\n"
				+ "estivesse no espa�o ocupado pela ilus�o, mas voc� deve\r\n"
				+ "usar seus pr�prios sentidos. Al�m disso, quando ambos\r\n"
				+ "voc� e sua ilus�o estiverem a 1,5 metro de uma criatura\r\n"
				+ "que possa ver a ilus�o, voc� tem vantagem nas jogadas de\r\n"
				+ "ataque contra essa criatura, devido a distra��o causada\r\n"
				+ "no alvo pela ilus�o.\r\n\n");
	}
	
//dominio da engana��o nivel 6
	public void dominioEnN6() {
		System.out.println("CANALIZAR DIVINDADE: MANTO DE SOMBRAS\r\n\n"
				+ "No 6� n�vel, voc� pode usar seu Canalizar Divindade para\r\n"
				+ "desaparecer.\r\n"
				+ "Com uma a��o, voc� se torna invis�vel at� o final do\r\n"
				+ "seu pr�ximo turno. Voc� se torna vis�vel se atacar ou\r\n"
				+ "conjurar uma magia.\r\n\n");
	}
	
//dominio da engana��o nivel 8
	public void dominioEnN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8� n�vel, voc� ganha a habilidade de imbuir seus\r\n"
				+ "ataques com arma com veneno � uma d�diva da sua\r\n"
				+ "divindade. Uma vez em cada um de seus turnos, quando\r\n"
				+ "voc� acertar uma criatura com um ataque com arma, voc�\r\n"
				+ "pode fazer o ataque causar 1d8 de dano de veneno extra\r\n"
				+ "ao alvo. Quando alcan�ar o 14� n�vel, o dano extra\r\n"
				+ "aumenta para 2d8.\r\n\n");
	}
	
//dominio da engana��o nivel 17
	public void dominioEnN17() {
		System.out.println("DUPLICIDADE APRIMORADA\r\n\n"
				+ "A partir do 17� n�vel, voc� pode criar at� quatro\r\n"
				+ "duplicatas de voc�, ao inv�s de uma, quando usar Invocar\r\n"
				+ "Duplicidade. Com uma a��o b�nus, no seu turno, voc�\r\n"
				+ "pode mover quantas duplicadas quiser at� 9 metros, at�\r\n"
				+ "no m�ximo de 36 metros de dist�ncia.\r\n\n");
	}
	
//dominio da guerra
	public void dominioGuerra() {
		System.out.println("DOM�NIO DA GUERRA\r\n\n"
				+ "A guerra tem muitas manifesta��es. Ela pode tornar\r\n"
				+ "pessoas comuns em her�is. Ela pode ser desesperadora e\r\n"
				+ "horripilante, com atos de crueldade e covardia\r\n"
				+ "obscurecendo momentos de bravura e coragem. Em ambos\r\n"
				+ "os casos, os deuses da guerra zelam pelos guerreiros e os\r\n"
				+ "recompensa pelos seus grandes feitos. Os cl�rigos de tais\r\n"
				+ "deuses se sobressaem em batalha, inspirando os outros a\r\n"
				+ "lutar o bom combate ou oferecendo atos de viol�ncia como\r\n"
				+ "suas ora��es. Entre os deuses da guerra est�o inclusos\r\n"
				+ "campe�es da honra e bravura (como Torm, Heironeous e\r\n"
				+ "Kir-Jolith) assim como deuses da destrui��o e pilhagem\r\n"
				+ "(como Erythnul, a F�ria, Gruumsh e Ares) e deuses da\r\n"
				+ "conquista e domina��o (como Bane, Hextor e Maglubiyet).\r\n"
				+ "Outros deuses da guerra (como Tempus, Nike e Nuada)\r\n"
				+ "tomam uma postura mais neutra, promovendo a guerra\r\n"
				+ "em todas as suas manifesta��es e apoiando os guerreiros\r\n"
				+ "em qualquer circunst�ncia.\r\n\n"
				+ "MAGIAS DO DOM�NIO DA GUERRA\r\n\n"
				+ "N�vel de Cl�rigo Magias\r\n"
				+ "1� aux�lio divino, escudo da f�\r\n"
				+ "3� arma m�gica, arma espiritual\r\n"
				+ "5� manto do cruzado, esp�ritos guardi�es\r\n"
				+ "7� movimenta��o livre, pele de pedra\r\n"
				+ "9� coluna de chamas, imobilizar monstro\r\n\n"
				+ "PROFICI�NCIA ADICIONAL\r\n\n"
				+ "No 1� n�vel, voc� adquire profici�ncia em armas marciais\r\n"
				+ "e em armaduras pesadas.\r\n\n"
				+ "SACERDOTE DA GUERRA\r\n\n"
				+ "A partir do 1� n�vel, seu deus envia rajadas de inspira��o\r\n"
				+ "a voc� quando voc� est� engajado em combate. Quando\r\n"
				+ "voc� usa a a��o de Ataque, voc� pode realizar um ataque\r\n"
				+ "com arma, com uma a��o b�nus.\r\n"
				+ "Voc� pode usar essa caracter�stica um n�mero de\r\n"
				+ "vezes igual ao seu modificador de Sabedoria (m�nimo uma\r\n"
				+ "vez). Voc� recupera todos os usos gastos ap�s terminar\r\n"
				+ "um descanso longo.\r\n\n");
	}
	
	public void dominioGuerraN2() {
		System.out.println("CANALIZAR DIVINDADE: ATAQUE DIRIGIDO\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar seu Canalizar\r\n"
				+ "Divindade para golpear com precis�o sobrenatural.\r\n"
				+ "Quando voc� realiza uma jogada de ataque, voc� pode\r\n"
				+ "usar seu Canalizar Divindade para recebe +10 de b�nus\r\n"
				+ "na jogada. Voc� realiza essa escolha depois de ver a\r\n"
				+ "rolagem, mas antes do Mestre dizer se o ataque atingiu\r\n"
				+ "ou errou.\r\n\n");
	}
	
	public void dominioGuerraN6() {
		System.out.println("CANALIZAR DIVINDADE: B�N��O DO DEUS DA GUERRA\r\n\n"
				+ "No 6� n�vel, quando uma criatura a at� 9 metros de voc�\r\n"
				+ "realizar uma jogada de ataque, voc� pode usar sua rea��o\r\n"
				+ "para conceder a criatura +10 de b�nus nessa jogada,\r\n"
				+ "usando seu Canalizar Divindade. Voc� realiza essa\r\n"
				+ "escolha depois de ver a rolagem, mas antes do Mestre\r\n"
				+ "dizer se o ataque atingiu ou errou.\r\n\n");
	}
	
	public void dominioGuerraN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8� n�vel, voc� ganha a habilidade de imbuir seus\r\n"
				+ "ataques com energia divina. Uma vez em cada um de seus\r\n"
				+ "turnos, quando voc� acertar uma criatura com um ataque\r\n"
				+ "com arma, voc� pode fazer o ataque causar 1d8 de dano\r\n"
				+ "extra de mesmo tipo do dano da arma ao alvo. Quando\r\n"
				+ "alcan�ar o 14� n�vel, o dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioGuerraN17() {
		System.out.println("AVATAR DA BATALHA\r\n\n"
				+ "A partir do 17� n�vel, voc� ganha resist�ncia a dano de\r\n"
				+ "concuss�o, cortante e perfurante de ataques n�o-m�gicos\r\n\n");
	}
	
//dominio da luz
	public void dominioLuz() {
		System.out.println("DOM�NIO DA LUZ\r\n\n"
				+ "Deuses da luz � como Helm, Lathander, Pholtus,\r\n"
				+ "Branchala, a Chama Prateada, Belenus, Apolo e ReHorakhty � promovem os ideias do renascimento e\r\n"
				+ "renova��o, verdade, vigil�ncia e beleza, muitas vezes\r\n"
				+ "usando o s�mbolo do sol. Alguns desses deuses s�o\r\n"
				+ "retratados como o pr�prio sol ou como um cocheiro que\r\n"
				+ "carrega o sol atrav�s do c�u. Outros s�o sentinelas\r\n"
				+ "incans�veis cujos olhos penetram cada sombra e veem\r\n"
				+ "atrav�s de cada engana��o. Alguns s�o divindades da\r\n"
				+ "beleza e arte que ensinam que a arte � o ve�culo para o\r\n"
				+ "aprimoramento da alma. Cl�rigos de um deus da luz s�o\r\n"
				+ "almas esclarecidas infundidas com radia��o e o poder\r\n"
				+ "divino da vis�o do discernimento, conhecidos por afastar\r\n"
				+ "as mentiras e incineras a escurid�o.\r\n\n"
				+ "MAGIAS DO DOM�NIO DA LUZ\r\n\n"
				+ "N�vel de Cl�rigo Magias\r\n"
				+ "1� m�os flamejantes, fogo das fadas\r\n"
				+ "3� esfera flamejante, raio ardente\r\n"
				+ "5� luz do dia, bola de fogo\r\n"
				+ "7� guardi�o da f�, muralha de fogo\r\n"
				+ "9� coluna de chamas, vid�ncia\r\n\n"
				+ "TRUQUE ADICIONAL\r\n\n"
				+ "Quando voc� escolhe esse dom�nio no 1� n�vel, voc� ganha\r\n"
				+ "o truque luz se voc� ainda n�o o conhecia.\r\n\n"
				+ "LABAREDA PROTETORA\r\n\n"
				+ "Tamb�m a partir do 1� n�vel, voc� pode interpor luz\r\n"
				+ "divina entre voc� e uma criatura atacante. Quando voc�\r\n"
				+ "for atacado por uma criatura a at� 9 metros de voc� que\r\n"
				+ "voc� pode ver, voc� pode usar sua rea��o para impor\r\n"
				+ "desvantagem na jogada de ataque, causando labaredas de\r\n"
				+ "luz na frente do atacante antes dele atingir ou errar. Um\r\n"
				+ "atacante que n�o puder ser cegado � imune a essa\r\n"
				+ "caracter�stica.\r\n"
				+ "Voc� pode usar essa caracter�stica um n�mero de\r\n"
				+ "vezes igual ao seu modificador de Sabedoria (m�nimo uma\r\n"
				+ "vez). Voc� recupera todos os usos gastos ap�s terminar\r\n"
				+ "um descanso longo.\r\n\n");
	}
	
	public void dominioLuzN2() {
		System.out.println("CANALIZAR DIVINDADE: RADIA��O DO AMANHECER\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar seu Canalizar\r\n"
				+ "Divindade para criar uma explos�o de luz solar, banindo\r\n"
				+ "a escurid�o e causando dano radiante aos inimigos.\r\n"
				+ "Com uma a��o, voc� ergue seu s�mbolo sagrado e\r\n"
				+ "qualquer escurid�o m�gica num raio de 9 metros de voc�\r\n"
				+ "� dissipada. Al�m disso, cada criatura hostil a at� 9\r\n"
				+ "metros deve realizar um teste de resist�ncia de\r\n"
				+ "Constitui��o. Uma criatura sofre dano radiante igual a\r\n"
				+ "2d10 + seu n�vel de cl�rigo se falhar no teste e metade\r\n"
				+ "desse dano caso seja bem sucedida. Uma criatura que\r\n"
				+ "tenha cobertura total contra voc� n�o � afetada.\r\n\n");
	}
	
	public void dominioLuzN6() {
		System.out.println("LABAREDA APRIMORADA\r\n\n"
				+ "No 6� n�vel, voc� tamb�m pode utilizar sua caracter�stica\r\n"
				+ "Labareda Protetora quando uma criatura que voc� possa\r\n"
				+ "ver a at� 9 metros atacar outra criatura diferente de voc�.\r\n\n");
	}
	
	public void dominioLuzN8() {
		System.out.println("CONJURA��O PODEROSA\r\n\n"
				+ "A partir do 8� n�vel, voc� adiciona seu modificador de\r\n"
				+ "Sabedoria no dano causado por qualquer truque de\r\n"
				+ "cl�rigo.\r\n\n");
	}
	
	public void dominioLuzN17() {
		System.out.println("COROA DE LUZ\r\n\n"
				+ "A partir do 17� n�vel, voc� pode usar sua a��o para ativar\r\n"
				+ "uma aura de luz solar que dura por 1 minuto ou at� voc�\r\n"
				+ "dissip�-la usando outra a��o. Voc� emite luz plena num\r\n"
				+ "raio de 18 metros e penumbra a at� 9 metros al�m disso.\r\n"
				+ "Os seus inimigos na �rea de luz plena tem desvantagem\r\n"
				+ "nos testes de resist�ncia contra suas magias que causam\r\n"
				+ "dano de fogo ou dano radiante.\r\n\n");
	}
	
//dominio da natureza
	public void dominioNatureza() {
		System.out.println("DOM�NIO DA NATUREZA\r\n\n"
				+ "Os deuses da natureza s�o t�o variados como a pr�pria\r\n"
				+ "natureza do mundo, desde deuses inescrut�veis de\r\n"
				+ "profundas florestas (como Silvanus, Obad-Hai, Chislev,\r\n"
				+ "Balinor e P�) at� divindades amig�veis associadas a\r\n"
				+ "alguma fonte ou bosque em particular (como Eldath).\r\n"
				+ "Druidas reverenciam a natureza como um todo e podem\r\n"
				+ "vir a servir essas divindades, praticando ritos misteriosos\r\n"
				+ "e recitando ora��es a muito esquecidas em sua pr�pria\r\n"
				+ "l�ngua secreta. Por�m, muitos desses deuses tamb�m\r\n"
				+ "possuem cl�rigos, campe�es que tem um papel mais ativo\r\n"
				+ "em promover os interesses particulares de um deus da\r\n"
				+ "natureza. Esses cl�rigos devem ca�ar monstruosidades\r\n"
				+ "malignas que usurpam dos bosques, aben�oar a colheita\r\n"
				+ "dos fieis ou murchar a cultura dos que irritarem seus\r\n"
				+ "deuses.\r\n\n"
				+ "MAGIAS DO DOM�NIO DA NATUREZA\r\n\n"
				+ "N�vel de Cl�rigo Magias\r\n"
				+ "1� amizade animal, falar com animais\r\n"
				+ "3� pele de �rvore, crescer espinhos\r\n"
				+ "5� ampliar plantas, muralha de vento\r\n"
				+ "7� dominar besta, vinha esmagadora\r\n"
				+ "9� praga de insetos, caminhar em �rvores\r\n\n"
				+ "AC�LITO DA NATUREZA\r\n\n"
				+ "No 1� n�vel, voc� aprende um truque de druida, � sua\r\n"
				+ "escolha. Voc� tamb�m ganha profici�ncia em uma das\r\n"
				+ "seguintes per�cias, � sua escolha: Adestrar Animais,\r\n"
				+ "Natureza ou Sobreviv�ncia.\r\n\n"
				+ "PROFICI�NCIA ADICIONAL\r\n\n"
				+ "Tamb�m a partir do 1� n�vel, voc� adquire profici�ncia\r\n"
				+ "com armaduras pesadas.\r\n\n");
	}
	
	public void dominioNaturezaN2() {
		System.out.println("CANALIZAR DIVINDADE: ENFEITI�AR ANIMAIS E PLANTAS\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar seu Canalizar\r\n"
				+ "Divindade para enfeiti�ar animais e plantas.\r\n"
				+ "Com uma a��o, voc� ergue seu s�mbolo sagrado e\r\n"
				+ "invoca o nome do seu deus. Cada besta ou criatura-planta\r\n"
				+ "que puder ver voc� num raio de 9 metros, deve realizar\r\n"
				+ "um teste de resist�ncia de Sabedoria. Se a criatura falhar,\r\n"
				+ "ela estar� enfeiti�ada por voc� durante 1 minuto ou at�\r\n"
				+ "sofrer dano. Enquanto estiver enfeiti�ada por voc�, ela\r\n"
				+ "ser� amistosa a voc� a as criaturas que voc� designar.\r\n\n");
	}
	
	public void dominioNaturezaN6() {
		System.out.println("AMORTECER ELEMENTOS\r\n\n"
				+ "No 6� n�vel, quando voc� ou uma criatura a at� 9 metros\r\n"
				+ "de voc� sofrer dano de �cido, frio, fogo, el�trico ou trov�o,\r\n"
				+ "voc� pode usar sua rea��o para conceder resist�ncia a\r\n"
				+ "criatura contra aquele tipo de dano.\r\n\n");
	}
	
	public void dominioNaturezaN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8� n�vel, voc� ganha a habilidade de imbuir seus\r\n"
				+ "ataques com energia divina. Uma vez em cada um de seus\r\n"
				+ "turnos, quando voc� acertar uma criatura com um ataque\r\n"
				+ "com arma, voc� pode fazer o atque causar 1d8 de dano de\r\n"
				+ "frio, fogo ou el�trico (� sua escolha) extra ao alvo. Quando\r\n"
				+ "alcan�ar o 14� n�vel, o dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioNaturezaN17() {
		System.out.println("SENHOR DA NATUREZA\r\n\n"
				+ "A partir do 17� n�vel, voc� ganha a habilidade de\r\n"
				+ "comandar animais e criaturas-planta. Enquanto a\r\n"
				+ "criatura estiver enfeiti�ada pela sua caracter�stica\r\n"
				+ "Enfeiti�ar Animais e Plantas, voc� pode usar uma a��o\r\n"
				+ "b�nus no seu turno para dizer verbalmente o que cada\r\n"
				+ "uma dessas criaturas devem fazer no pr�ximo turno\r\n"
				+ "delas.\r\n\n");
	}
	
//dominio da tempestade
	public void dominioTempestade() {
		System.out.println("DOM�NIO DA TEMPESTADE\r\n\n"
				+ "Deuses cujo portf�lio contenha o dom�nio da Tempestade\r\n"
				+ "� como Talos, Umberlee, Kord, Zeboim, o Devorador, Zeus\r\n"
				+ "e Thor � governam tormentas, mares e c�us. Est�o\r\n"
				+ "inclusos deuses dos rel�mpagos e trov�es, deuses dos\r\n"
				+ "terremotos, alguns deuses do fogo e certos deuses da\r\n"
				+ "viol�ncia, for�a f�sica e coragem. Em alguns pante�es, um\r\n"
				+ "deus com esse dom�nio comanda os outros deuses e �\r\n"
				+ "conhecido pela justi�a r�pida levada atrav�s de\r\n"
				+ "rel�mpagos. Nos pante�es de povos mar�timos e\r\n"
				+ "navegantes, deuses com esse dom�nio s�o divindades do\r\n"
				+ "oceano e patrono dos marinheiros. Deuses da tempestade\r\n"
				+ "enviam seus cl�rigos para inspirar pavor no povo comum,\r\n"
				+ "tanto para mant�-los no caminho da justi�a e coragem\r\n"
				+ "quanto para oferecer sacrif�cios de propicia��o para\r\n"
				+ "afastar a ira divina.\r\n\n"
				+ "MAGIAS DO DOM�NIO DA TEMPESTADE\r\n\n"
				+ "N�vel de Cl�rigo Magias\r\n"
				+ "1� n�voa obscurecente, onda trovejante\r\n"
				+ "3� lufada de vento, despeda�ar\r\n"
				+ "5� convocar rel�mpagos, nevasca\r\n"
				+ "7� controlar a �gua, tempestade de gelo\r\n"
				+ "9� onda destrutiva, praga de insetos\r\n\n"
				+ "PROFICI�NCIA ADICIONAL\r\n\n"
				+ "A partir do 1� n�vel, voc� adquire profici�ncia em armas\r\n"
				+ "marciais e armaduras pesadas.\r\n\n"
				+ "IRA DA TORMENTA\r\n\n"
				+ "Tamb�m a partir do 1� n�vel, voc� pode repreender\r\n"
				+ "ataques violentamente. Quando uma criatura a 1,5 metro\r\n"
				+ "de voc� que voc� possa ver, atingir voc� com um ataque,\r\n"
				+ "voc� pode usar sua rea��o para for�ar a criatura a\r\n"
				+ "realizar um teste de resist�ncia de Destreza. A criatura\r\n"
				+ "sofre 2d8 de dano el�trico ou de trov�o (� sua escolha)\r\n"
				+ "caso falhe no teste, e metade desse dano caso seja bem\r\n"
				+ "sucedido.\r\n"
				+ "Voc� pode usar essa caracter�stica um n�mero de\r\n"
				+ "vezes igual ao seu modificador de Sabedoria (m�nimo uma\r\n"
				+ "vez). Voc� recupera todos os usos gastos ap�s terminar\r\n"
				+ "um descanso longo.\r\n\n");
	}
	
	public void dominioTempestadeN2() {
		System.out.println("CANALIZAR DIVINDADE: IRA DESTRUIDORA\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar seu Canalizar\r\n"
				+ "Divindade para empunhar o poder da tormenta com\r\n"
				+ "ferocidade desmedida.\r\n"
				+ "Quando voc� rolar dano el�trico ou trovejante, voc�\r\n"
				+ "pode usar seu Canalizar Divindade para causar o m�ximo\r\n"
				+ "de dano, ao inv�s de rol�-lo.\r\n\n");
	}
	
	public void dominioTempestadeN6() {
		System.out.println("GOLPE DE REL�MPAGO\r\n\n"
				+ "No 6� n�vel, quando voc� causa dano el�trico a uma\r\n"
				+ "criatura Grande ou menor, voc� tamb�m pode empurr�-la\r\n"
				+ "para at� 3 metros de dist�ncia de voc�.\r\n\n");
	}
	
	public void dominioTempestadeN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8� n�vel, voc� ganha a habilidade de imbuir seus\r\n"
				+ "ataques com energia divina. Uma vez em cada um de seus\r\n"
				+ "turnos, quando voc� acertar uma criatura com um ataque\r\n"
				+ "com arma, voc� pode fazer o ataque causar 1d8 de dano\r\n"
				+ "trovejante extra ao alvo. Quando alcan�ar o 14� n�vel, o\r\n"
				+ "dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioTempestadeN17() {
		System.out.println("FILHO DA TORMENTA\r\n"
				+ "A partir do 17� n�vel, voc� adquire deslocamento de voo\r\n"
				+ "igual a seu deslocamento de caminhada contanto que voc�\r\n"
				+ "n�o esteja no subterr�neo ou em local fechado.\r\n\n");
	}
	
//dominio da vida
	public void dominioVida() {
		System.out.println("DOM�NIO DA VIDA\r\n\n"
				+ "O dom�nio da vida foca na v�vida energia positiva � uma\r\n"
				+ "das for�as fundamentais do universo � que sustenta toda\r\n"
				+ "a vida. Os deuses da vida promovem a vitalidade e a"
				+ "sa�de, curando os doentes e feridos, cuidando dos\r\n"
				+ "necessitados, al�m de afastar as for�as da morte e hordas\r\n"
				+ "de mortos-vivos. Quase toda divindade n�o maligna pode\r\n"
				+ "alegar influ�ncia sobre esse dom�nio. Em particular\r\n"
				+ "divindades da agricultura (como Chauntea, Arawai e\r\n"
				+ "Demeter), do sol (como Lathander, Pelor e Re-Horakhty),\r\n"
				+ "da cura ou resist�ncia (como Ilmater, Mishakal, Apolo e\r\n"
				+ "Diancecht), e do lar e comunidade (como Hestia, Hathor e\r\n"
				+ "Boldrei).\r\n\n"
				+ "MAGIAS DO DOM�NIO DA VIDA\r\n\n"
				+ "N�vel de Cl�rigo Magias\r\n"
				+ "1� b�n��o, curar ferimentos\r\n"
				+ "3� restaura��o menor, arma espiritual\r\n"
				+ "5� sinal de esperan�a, revivificar\r\n"
				+ "7� prote��o contra a morte, guardi�o da f�\r\n"
				+ "9� curar ferimentos em massa, reviver os mortos\r\n\n"
				+ "PROFICI�NCIA ADICIONAL\r\n\n"
				+ "Quando voc� escolhe este dom�nio no 1� n�vel, voc� ganha\r\n"
				+ "profici�ncia com armaduras pesadas.\r\n\n"
				+ "DISC�PULO DA VIDA\r\n\n"
				+ "Tamb�m no 1� n�vel, suas magias de cura s�o mais\r\n"
				+ "efetivas. Sempre que voc� conjurar uma magia de cura\r\n"
				+ "para recuperar pontos de vida, o alvo daquela magia\r\n"
				+ "recupera pontos de vida adicionais iguais a 2 + n�vel da\r\n"
				+ "magia.\r\n\n");
	}
	
	public void dominioVidaN2() {
		System.out.println("CANALIZAR DIVINDADE: PRESERVAR A VIDA\r\n\n"
				+ "A partir do 2� n�vel, voc� pode usar seu Canalizar\r\n"
				+ "Divindade para curar os feridos.\r\n"
				+ "Como uma a��o, voc� usa seu s�mbolo sagrado para\r\n"
				+ "invocar energia que pode recuperar um total de 5 vezes\r\n"
				+ "seu n�vel de cl�rigo em pontos de vida. Voc� escolhe\r\n"
				+ "quaisquer criaturas a at� 9 metros de voc� e divide esses\r\n"
				+ "pontos entre elas. Essa caracter�stica s� pode curar as\r\n"
				+ "criaturas a at� metade de seu m�ximo de pontos de vida.\r\n"
				+ "Voc� n�o pode usar essa caracter�stica em um morto-vivo\r\n"
				+ "ou constructo.\r\n\n");
	}
	
	public void dominioVidaN6() {
		System.out.println("CURANDEIRO ABEN�OADO\r\n\n"
				+ "A partir do 6� n�vel, as magias que voc� conjurar para\r\n"
				+ "curar os outros tamb�m curam voc�. Quando conjurar\r\n"
				+ "uma magia de cura em outra criatura, voc� tamb�m\r\n"
				+ "recupera pontos de vida, em um total de 2 + n�vel da\r\n"
				+ "magia.\r\n\n");
	}
	
	public void dominioVidaN8() {
		System.out.println("GOLPE DIVINO\r\n\n"
				+ "No 8� n�vel, voc� ganha a habilidade de imbuir seus\r\n"
				+ "ataques com poder divino. Uma vez em cada um de seus\r\n"
				+ "turnos, quando voc� acertar uma criatura com um ataque\r\n"
				+ "com arma, voc� pode fazer o ataque causar 1d8 de dano\r\n"
				+ "radiante extra ao alvo. Quando alcan�ar o 14� n�vel, o\r\n"
				+ "dano extra aumenta para 2d8.\r\n\n");
	}
	
	public void dominioVidaN17() {
		System.out.println("CURA SUPREMA\r\n\n"
				+ "A partir do 17� n�vel, quando voc� jogaria normalmente\r\n"
				+ "um ou mais dados para recuperar pontos de vida com\r\n"
				+ "uma magia, voc� usa o maior resultado poss�vel nos\r\n"
				+ "dados. Por exemplo, ao inv�s de recuperar 2d6 pontos de\r\n"
				+ "vida, voc� recupera 12.\r\n\n");
	}
}
