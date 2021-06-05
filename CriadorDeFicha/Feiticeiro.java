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
				+ "humana estica suas m�os e libera o fogo\r\n"
				+ "drac�nico que queima em suas veias. A\r\n"
				+ "medida que um inferno consome seus\r\n"
				+ "oponentes, asas de couro surgem nas suas\r\n"
				+ "costas e ela ergue\r\n"
				+ "-se no ar.\r\n"
				+ "Os longos cabelos balan�am com a conjura��o\r\n"
				+ "do vento, um meio elfo abre seus bra�os totalmente\r\n"
				+ "e joga a cabe�a para tr�s. Erguendo\r\n"
				+ "-o\r\n"
				+ "momentaneamente do ch�o, uma onda de magia\r\n"
				+ "surge sobre ele, por meio dele e, fora dele, uma\r\n"
				+ "poderosa explos�o de rel�mpago.\r\n"
				+ "Esgueirando\r\n"
				+ "-se atr�s de uma estalagmite, uma\r\n"
				+ "halfling aponta seu dedo em um troglodita em investida.\r\n"
				+ "Uma explos�o de chamas � liberada atrav�s do seu dedo e\r\n"
				+ "atinge a criatura. Ela toma cobertura atr�s da forma��o\r\n"
				+ "rochosa com um sorriso, sem saber que sua magia\r\n"
				+ "selvagem deixou sua pele com um brilho azulado.\r\n"
				+ "Os feiticeiros carregam um patrim�nio m�gico\r\n"
				+ "conferido a eles por uma linhagem ex�tica, alguma\r\n"
				+ "influ�ncia de outro mundo ou exposi��o a for�as c�smicas\r\n"
				+ "desconhecidas. N�o � poss�vel estudar feiti�aria como se\r\n"
				+ "aprende um idioma, assim como n�o se aprende a viver\r\n"
				+ "uma vida lend�ria. Ningu�m escolhe a feiti�aria: os\r\n"
				+ "poderes escolhem o feiticeiro. MAGIA BRUTA\r\n"
				+ "A magia � parte de todo feiticeiro, inundando corpo,\r\n"
				+ "mente e espirito com um poder latente que espera para\r\n"
				+ "ser dominado. Alguns feiticeiro carregam magia que\r\n"
				+ "emerge de uma antiga linhagem infundida com a magia\r\n"
				+ "dos drag�es. Outros carregam uma magia bruta,\r\n"
				+ "incontrol�vel dentro de si, uma tormenta ca�tica que se\r\n"
				+ "manifesta de formas inexplic�veis.\r\n"
				+ "A apar�ncia dos poderes de feiti�aria s�o vastamente\r\n"
				+ "imprevis�veis. Algumas linhagens drac�nicas produzem\r\n"
				+ "apenas um feiticeiro por gera��o, por�m, em outras linhas\r\n"
				+ "de descend�ncia, todos os indiv�duos ser�o feiticeiros. A\r\n"
				+ "maior parte do tempo, os talentos de feiti�aria aparecem\r\n"
				+ "aparentemente ao acaso. Alguns feiticeiros n�o\r\n"
				+ "conseguem determinar a origem do seu poder, enquanto\r\n"
				+ "outros o relacionam com estranhos eventos de suas vidas.\r\n"
				+ "O toque de um corruptor, a b\r\n"
				+ "�n��o de uma dr�ade no\r\n"
				+ "nascimento de um beb� ou experimentar a �gua de uma\r\n"
				+ "fonte misteriosa podem conceder o dom da feiti�aria.\r\n"
				+ "Tamb�m � poss�vel adquirir esse dom de uma divindade\r\n"
				+ "da magia, da exposi��o as for�as elementais dos Planos\r\n"
				+ "Interiores ou do caos alucinante do Limbo ou ao\r\n"
				+ "vislumbrar o funcionamento interno da realidade.\r\n"
				+ "Os feiticeiros n�o veem serventia em grim�rios ou\r\n"
				+ "antigos tomos de conhecimento m�stico buscados pelos\r\n"
				+ "magos, nem buscam um patrono para conceder\r\n"
				+ "-lhes suas\r\n"
				+ "magias, como um bruxo faz. Ao aprender a explorar e\r\n"
				+ "canalizar sua pr�pria magia inata, eles descobrem novas\r\n"
				+ "e incr�veis formas de liberar esse poder. PODERES INEXPLIC�VEIS\r\n"
				+ "Os feiticeiros s�o raros no mundo e � incomum encontrar\r\n"
				+ "um feiticeiro que n�o esteja envolvido na vida de\r\n"
				+ "aventuras de alguma forma. Pessoas com poder m�gico\r\n"
				+ "fluindo em suas veias descobrem cedo que o poder n�o\r\n"
				+ "gosta de ficar quieto. A magia de um feiticeiro gosta de\r\n"
				+ "ser exercida e tem uma tend�ncia de fluir de maneiras\r\n"
				+ "imprevis�veis se n�o for chamada.\r\n"
				+ "Muitas vezes, os feiticeiros\r\n"
				+ " tem motiva��es obscuras ou\r\n"
				+ " quixotescas que os leva a aventuras.\r\n"
				+ " Alguns buscam uma maior compreens�o da\r\n"
				+ "for�a m�gica que os infunde ou a resposta do mist�rio de\r\n"
				+ "sua origem. Outros, esperam encontrar uma forma de se\r\n"
				+ "livrar dele ou de liberar seu potencial m�ximo.\r\n"
				+ "Independente dos seus objetivos, os feiticeiros s�o t�o\r\n"
				+ "uteis para um grupo de aventureiros quanto os magos,\r\n"
				+ "compensando a falta de variedade de conhecimento\r\n"
				+ "m�gico com uma enorme flexibilidade no uso das magias\r\n"
				+ "que eles conhecem.\r\n\n");
	}
	
	public void construcaoRapida() {
		System.out.println("CONSTRU��O R�PIDA\r\n\n"
				+ "Voc� pode construir um feiticeiro rapidamente seguindo\r\n"
				+ "essas sugest�es. Primeiro, coloque seu valor de habilidade\r\n"
				+ "mais alto em Carisma, seguido de Constitui��o. Segundo,\r\n"
				+ "escolha o antecedente eremita. Terceiro, escolha os\r\n"
				+ "truques luz, prestidigita��o, raio de gelo e toque chocante,\r\n"
				+ "al�m das seguintes magias de 1� n�vel: escudo arcano e\r\n"
				+ "misseis m�gicos.\r\n\n");
	}
	
	public void caracteristicasClasse() {
		System.out.println("CARACTER�STICAS DE CLASSE\r\n\n"
				+ "Como um feiticeiro, voc� adquire as seguintes\r\n"
				+ "caracter�sticas de classe.\r\n\n"
				+ "PONTOS DE VIDA\r\n\n"
				+ "Dado de Vida: 1d6 por n�vel de feiticeiro\r\n"
				+ "Pontos de Vida no 1� N�vel: 6 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d6 (ou 4) + seu\r\n"
				+ "modificador de Constitui��o por n�vel de feiticeiro ap�s\r\n"
				+ "o 1�\r\n\n"
				+ "PROFICI�NCIAS\r\n\n"
				+ "Armaduras: Nenhuma\r\n"
				+ "Armas: Adagas, dardos, fundas, bord�es e bestas leves\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resist�ncia: Constitui��o, Carisma\r\n"
				+ "Per�cias: Escolha duas dentre Arcanismo, Engana��o,\r\n"
				+ "Intui��o, Intimida��o, Persuas�o e Religi�o\r\n\n"
				+ "EQUIPAMENTO\r\n\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
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
		List<String> profEquips = Arrays.asList("Adagas", "Dardos", "Fundos", "Bord�es", "Bestas Leves");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Constitui��o", "Carisma");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Arcanismo", "Engana��o", "Intui��o", "Intimida��o", "Persuas�o", "Religi�o");
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
		getEquips().setPacotes("Pacote de Explorador", "Pacote de Aventureiro");
	}
	
	public void FeatsPadrao() {
		System.out.println("CONJURA��O\r\n\n"
				+ "Um evento do seu passado ou na vida de um parente ou\r\n"
				+ "ancestral, deixou uma marca indel�vel em voc�,\r\n"
				+ "infundindo voc� com magia arcana. A fonte desse poder,\r\n"
				+ "independente da sua origem, flui em suas magias. Veja o\r\n"
				+ "cap�tulo 10 para as regras gerais de conjura��o e o\r\n"
				+ "cap�tulo 11 para a lista de magias de feiticeiro.\r\n\n"
				+ "TRUQUES\r\n\n"
				+ "Voc� conhece quatro truques, � sua escolha, da lista de\r\n"
				+ "magias de feiticeiro. Voc� aprende truques de feiticeiro\r\n"
				+ "adicionais, � sua escolha, em n�veis mais altos, como\r\n"
				+ "mostrado na coluna Truques Conhecidos da tabela O\r\n"
				+ "Feiticeiro.\r\n\n"
				+ "ESPA�OS DE MAGIA\r\n\n"
				+ "A tabela O Feiticeiro mostra quantos espa�os de magia de\r\n"
				+ "1� n�vel e superiores voc� possui dispon�veis para\r\n"
				+ "conjura��o. Para conjurar uma dessas magias, voc� deve\r\n"
				+ "gastar uma espa�o de magia do n�vel da magia ou\r\n"
				+ "superior. Voc� recobra todos os espa�os de magia gastos\r\n"
				+ "quando voc� completa um descanso longo.\r\n"
				+ "Por exemplo, se voc� quiser conjurar a magia de 1�\r\n"
				+ "n�vel m�os flamejantes e voc� tiver um espa�o de magia\r\n"
				+ "de 1� n�vel e um de 2� n�vel dispon�veis, voc� poder�\r\n"
				+ "conjurar m�os flamejantes usando qualquer dos dois\r\n"
				+ "espa�os.\r\n\n"
				+ "MAGIAS CONHECIDAS DE 1� N�VEL E SUPERIORES\r\n\n"
				+ "Voc� conhece duas magias de 1� n�vel, � sua escolha, da\r\n"
				+ "lista de magias de feiticeiro.\r\n"
				+ "A coluna Magias Conhecidas na tabela O Feiticeiro\r\n"
				+ "mostra quando voc� aprende mais magias de feiticeiro, �\r\n"
				+ "sua escolha. Cada uma dessas magias deve ser de um\r\n"
				+ "n�vel a que voc� tenha acesso, como mostrado na tabela.\r\n"
				+ "Por exemplo, quando voc� alcan�a o 3� n�vel da classe,\r\n"
				+ "voc� pode aprender uma nova magia de 1� ou 2� n�vel.\r\n"
				+ "Al�m disso, quando voc� adquire um n�vel nessa\r\n"
				+ "classe, voc� pode escolher uma magia de feiticeiro que\r\n"
				+ "voc� conhe�a e substitu�-la por outra magia da lista de\r\n"
				+ "magias de feiticeiro, que tamb�m deve ser de um n�vel ao\r\n"
				+ "qual voc� tenha espa�os de magia.\r\n\n"
				+ "HABILIDADE DE CONJURA��O\r\n\n"
				+ "Carisma � a sua habilidade de conjura��o para suas\r\n"
				+ "magias de feiticeiro, j� que o poder da sua magia depende\r\n"
				+ "da sua capacidade de projetar sua vontade no mundo. Use\r\n"
				+ "seu Carisma sempre que alguma magia se referir � sua\r\n"
				+ "habilidade de conjurar magias. Al�m disso, voc� usa o seu\r\n"
				+ "modificador de Carisma para definir a CD dos testes de\r\n"
				+ "resist�ncia para as magias de feiticeiro que voc� conjura e\r\n"
				+ "quando voc� realiza uma jogada de ataque com uma\r\n"
				+ "magia.\r\n"
				+ "CD para suas magias = 8 + b�nus de profici�ncia +\r\n"
				+ "seu modificador de Carisma\r\n"
				+ "Modificador de ataque de magia = seu b�nus de profici�ncia +\r\n"
				+ "seu modificador de Carisma\r\n\n"
				+ "FOCO DE CONJURA��O\r\n\n"
				+ "Voc� pode usar um foco arcano (encontrado no cap�tulo 5)\r\n"
				+ "como foco de conjura��o das suas magias de feiticeiro.\r\n\n"
				+ "ORIGEM DE FEITI�ARIA\r\n\n"
				+ "Escolha uma origem de feiti�aria, que descreve a fonte do\r\n"
				+ "seu poder m�gico inato: Linhagem Drac�nica ou Magia\r\n"
				+ "Selvagem, ambos detalhados no final da descri��o da\r\n"
				+ "classe.\r\n"
				+ "Sua escolha lhe confere caracter�sticas quando voc� a\r\n"
				+ "escolhe, no 1� n�vel e novamente no 6�, 14� e 18� n�vel.\r\n\n");
	}
	
	public void featsNivel2() {
		System.out.println("FONTE DE MAGIA\r\n\n"
				+ "No 2� n�vel, voc� alcan�a uma profunda fonte de magia\r\n"
				+ "dentro de voc�. Essa fonte � representada pelos pontos de\r\n"
				+ "feiti�aria, que permitem que voc� crie uma variedade de\r\n"
				+ "efeitos m�gicos.\r\n\n"
				+ "PONTOS DE FEITI�ARIA\r\n\n"
				+ "Voc� tem 2 pontos de feiti�aria e ganha mais a medida\r\n"
				+ "que alcan�a n�veis elevados, como mostrado na coluna\r\n"
				+ "Pontos de Feiti�aria da tabela O Feiticeiro. Voc� nunca\r\n"
				+ "poder� ter mais pontos de feiti�aria que os mostrados na\r\n"
				+ "tabela para o seu n�vel. Voc� recupera todos os pontos de\r\n"
				+ "feiti�aria gastos quando termina um descanso longo.\r\n\n"
				+ "CONJURA��O FLEX�VEL\r\n\n"
				+ "Voc� pode usar seus pontos de feiti�aria para ganhar\r\n"
				+ "novos espa�os de magia ou sacrificar espa�os de magia\r\n"
				+ "para ganhar pontos de magia adicionais. Voc� aprende\r\n"
				+ "novas formas de usar seus pontos de feiti�aria quando\r\n"
				+ "alcan�a n�veis elevados. Os espa�os de magia criados\r\n"
				+ "desaparecem ao final de um descanso longo.\r\n"
				+ "Criando Espa�os de Magia. Voc� pode transformar\r\n"
				+ "pontos de feti�aria dispon�veis em um espa�o de magia,\r\n"
				+ "com uma a��o b�nus, no seu turno. A tabela Criando\r\n"
				+ "Espa�os de Magia mostra o custo para criar um espa�o de\r\n"
				+ "magia de determinado n�vel. Voc� n�o pode criar espa�os\r\n"
				+ "de magia acima do 5� n�vel.\r\n\n"
				+ "CRIANDO ESPA�OS DE MAGIA\r\n\n"
				+ "N�vel de Espa�o de Magia Custo de Pontos de Feiti�aria\r\n"
				+ "1� 2\r\n"
				+ "2� 3\r\n"
				+ "3� 5\r\n"
				+ "4� 6\r\n"
				+ "5� 7\r\n"
				+ "Convertendo um Espa�o de Magia em Pontos de\r\n"
				+ "Feiti�aria. Com uma a��o b�nus, no seu turno, voc� pode\r\n"
				+ "gastar um espa�o de magia dispon�vel e ganhar uma\r\n"
				+ "quantidade de pontos de feiti�aria igual ao n�vel do\r\n"
				+ "espa�o.\r\n\n");
	}
	
	public void featsNivel3() {
		System.out.println("METAM�GICA\r\n\n"
				+ "No 3� n�vel, voc� adquire a habilidade de distorcer suas\r\n"
				+ "magias para se adequarem �s suas necessidades. Voc�\r\n"
				+ "ganha duas das seguintes op��es de Metam�gica, � sua\r\n"
				+ "escolha. Voc� adquire outra no 10� e 17� n�vel.\r\n"
				+ "Voc� pode usar apenas uma op��o de Metam�gica em\r\n"
				+ "uma magia quando a conjura, a n�o ser que esteja\r\n"
				+ "descrito o contr�rio.\r\n\n"
				+ "MAGIA ACELERADA\r\n\n"
				+ "Quando voc� conjurar uma magia que tenha um tempo de\r\n"
				+ "conjura��o de 1 a��o, voc� pode gastar 2 pontos de\r\n"
				+ "feiti�aria para mudar o tempo de conjura��o para 1 a��o\r\n"
				+ "b�nus para essa magia.\r\n\n"
				+ "MAGIA AUMENTADA\r\n\n"
				+ "Quando voc� conjura uma magia que obriga uma criatura\r\n"
				+ "a realizar um teste de resist�ncia contra o seu efeito, voc�\r\n"
				+ "pode gastar 3 pontos de feiti�aria para dar desvantagem a\r\n"
				+ "um alvo da magia no primeiro teste de resist�ncia feito\r\n"
				+ "contra ela.\r\n\n"
				+ "MAGIA CUIDADOSA\r\n\n"
				+ "Quando voc� conjurar uma magia que obriga outras\r\n"
				+ "criaturas a realizarem um teste de resist�ncia, voc� pode\r\n"
				+ "proteger algumas dessas criaturas da for�a total da\r\n"
				+ "magia. Para tanto, voc� gasta 1 ponto de feiti�aria e\r\n"
				+ "escolhe um n�mero dessas criaturas at� o seu modificador\r\n"
				+ "de Carisma (m�nimo de uma criatura). Uma criatura\r\n"
				+ "escolhida passa automaticamente no teste de resist�ncia\r\n"
				+ "contra a magia.\r\n\n"
				+ "MAGIA DISTANTE\r\n\n"
				+ "Quando voc� conjurar uma magia que tenha dist�ncia de\r\n"
				+ "1,5 metro ou maior, voc� pode gastar 1 ponto de feiti�aria\r\n"
				+ "para dobrar o alcance da magia.\r\n"
				+ "Quando voc� conjura uma magia com alcance de\r\n"
				+ "toque, voc� pode gastar 1 ponto de feiti�aria para mudar o\r\n"
				+ "alcance da magia para 9 metros.\r\n\n"
				+ "MAGIA DUPLICADA\r\n\n"
				+ "Quando voc� conjurar uma magia que seja incapaz de ter\r\n"
				+ "mais de uma criatura como alvo no n�vel atual dela e n�o\r\n"
				+ "possua alcance pessoal, voc� pode gastar um n�mero de\r\n"
				+ "pontos de feiti�aria igual ao n�vel da magia para ter uma\r\n"
				+ "segunda criatura, no alcance da magia, como alvo (1\r\n"
				+ "ponto de feiti�aria se a magia for um truque).\r\n\n"
				+ "MAGIA ESTENDIDA\r\n\n"
				+ "Quando voc� conjurar uma magia que tenha dura��o de 1\r\n"
				+ "minuto ou maior, voc� pode gastar 1 ponto de feiti�aria\r\n"
				+ "para dobrar sua dura��o, at� uma dura��o m�xima de 24\r\n"
				+ "horas.\r\n\n"
				+ "MAGIA POTENCIALIZADA\r\n\n"
				+ "Quando voc� rola o dano de uma magia, voc� pode gastar\r\n"
				+ "1 ponto de feiti�aria para jogar novamente um n�mero de\r\n"
				+ "dados de dano, at� seu modificador de Carisma (m�nimo\r\n"
				+ "de um). Voc� deve usar a nova rolagem.\r\n"
				+ "Voc� pode usar Magia Potencializada mesmo que voc�\r\n"
				+ "j� tenha usado uma op��o diferente de Metam�gica\r\n"
				+ "durante a conjura��o da magia.\r\n\n"
				+ "MAGIA SUTIL\r\n\n"
				+ "Quando voc� conjurar uma magia, voc� pode gastar 1\r\n"
				+ "ponto de feiti�aria para faz�-lo sem qualquer componente\r\n"
				+ "som�tico ou verbal.\r\n\n");
	}
	
	public void incrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16�\r\n"
				+ "e 19� n�vel, voc� pode aumentar um valor de habilidade, �\r\n"
				+ "sua escolha, em 2 ou voc� pode aumentar dois valores de\r\n"
				+ "habilidade, � sua escolha, em 1. Como padr�o, voc� n�o\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "caracter�stica.\r\n\n");
	}
	
	public void featsNivel20() {
		System.out.println("RESTAURA��O M�STICA\r\n\n"
				+ "No 20� n�vel, voc� recupera 4 pontos de feiti�aria gastos\r\n"
				+ "sempre que voc� terminar um descanso curto.\r\n\n");
	}
	
//origens de feiti�aria
	public void origensFeiticaria() {
		System.out.println("ORIGENS DE FEITI�ARIA\r\n\n"
				+ "Diferentes feiticeiros possuem diferentes origens para sua\r\n"
				+ "magia inata. Apesar de muitas varia��es existirem, a\r\n"
				+ "maioria dessas origens caem em duas categorias: uma\r\n"
				+ "linhagem drac�nica e magia selvagem.\r\n\n");
	}
	
//linhagem draconica
	public void linhagemDraco() {
		System.out.println("LINHAGEM DRAC�NICA\r\n\n"
				+ "Sua magia inata vem de magia drac�nica que foi\r\n"
				+ "misturada ao seu sangue ou ao sangue dos seus\r\n"
				+ "ancestrais. Geralmente, os feiticeiros com essa origem\r\n"
				+ "tra�am sua descend�ncia de poderosos feiticeiros da\r\n"
				+ "antiguidade que fizeram uma barganha com um drag�o\r\n"
				+ "ou que tenham um drag�o como parente. Algumas dessas\r\n"
				+ "linhagens est�o bem definidas no mundo, mas a maioria �\r\n"
				+ "obscura. Qualquer feiticeiro pode ser o primeiro de uma\r\n"
				+ "nova linhagem, como resultado de um pacto ou de outra\r\n"
				+ "circunst�ncia excepcional.\r\n\n"
				+ "ANCESTRAL DRAC�NICO\r\n\n"
				+ "No 1� n�vel, voc� escolhe um tipo de drag�o como seu\r\n"
				+ "ancestral. O tipo de dano associado a cada drag�o ser�\r\n"
				+ "usado por caracter�sticas que voc� ganhar�\r\n"
				+ "posteriormente.\r\n\n"
				+ "ANCESTRAL DRAC�NICO\r\n\n"
				+ "Drag�o Tipo de Dano\r\n"
				+ "Azul El�trico\r\n"
				+ "Branco Frio\r\n"
				+ "Bronze El�trico\r\n"
				+ "Cobre Acido\r\n"
				+ "Lat�o Fogo\r\n"
				+ "Negro Acido\r\n"
				+ "Ouro Fogo\r\n"
				+ "Prata Frio\r\n"
				+ "Verde Veneno\r\n"
				+ "Vermelho Fogo\r\n"
				+ "Voc� pode falar, ler e escrever em Drac�nico. Al�m\r\n"
				+ "disso, sempre que voc� fizer um teste de Carisma quando\r\n"
				+ "estiver interagindo com drag�es, seu b�nus de\r\n"
				+ "profici�ncia ser� dobrado se ele se aplicar a esse teste.\r\n\n"
				+ "RESILI�NCIA DRAC�NICA\r\n\n"
				+ "A medida que a magia flui pelo seu corpo, ela faz com que\r\n"
				+ "os tra�os f�sicos do seu ancestral drac�nico surjam. No 1�\r\n"
				+ "n�vel, seu m�ximo de pontos de vida aumenta em 1 e\r\n"
				+ "aumenta em mais 1 sempre que voc� ganhar um n�vel na\r\n"
				+ "classe.\r\n"
				+ "Al�m disso, partes da sua pele s�o cobertas com\r\n"
				+ "min�sculas escamas lustrosas de drag�o. Quando voc�\r\n"
				+ "n�o estiver utilizando armadura, sua CA ser� igual a 13 +\r\n"
				+ "seu modificador de Destreza.\r\n\n");
	}
	
	public void linhagemDracoN6() {
		System.out.println("AFINIDADE ELEMENTAL\r\n\n"
				+ "A partir do 6� n�vel, quando voc� conjurar uma magia que\r\n"
				+ "cause dano do tipo associado ao seu ancestral drac�nico,\r\n"
				+ "adicione seu modificador de Carisma ao dano. Ao mesmo\r\n"
				+ "tempo, voc� pode gastar 1 ponto de feiti�aria para ganhar\r\n"
				+ "resist�ncia a esse tipo de dano por 1 hora. O b�nus de\r\n"
				+ "dano se aplica a uma �nica rolagem de dano da magia,\r\n"
				+ "n�o � diversas rolagens.\r\n\n");
	}
	
	public void linhagemDracoN14() {
		System.out.println("ASAS DE DRAG�O\r\n\n"
				+ "No 14� n�vel, voc� adquire a habilidade de brotar um par\r\n"
				+ "de asas de drag�o das suas costas, ganhando\r\n"
				+ "deslocamento de voo igual ao seu deslocamento atual.\r\n"
				+ "Voc� pode criar essas asas com uma a��o b�nus, no seu\r\n"
				+ "turno. Elas duram at� que voc� as dissipe, com uma a��o\r\n"
				+ "b�nus no seu turno.\r\n"
				+ "Voc� n�o pode manifestar suas asas quando estiver\r\n"
				+ "vestindo uma armadura, a n�o ser que a armadura seja\r\n"
				+ "feita para acomod�-las, e roupas que n�o forem feitas\r\n"
				+ "para se acomodar �s suas asas devem ser destru�das\r\n"
				+ "quando voc� manifest�-las.\r\n\n");
	}
	
	public void linhagemDracoN18() {
		System.out.println("PRESEN�A DRAC�NICA\r\n\n"
				+ "A partir do 18� n�vel, voc� pode canalizar a assustadora\r\n"
				+ "presen�a do seu ancestral drac�nico, fazendo com que\r\n"
				+ "aqueles que o rodeiam fiquem impressionados ou\r\n"
				+ "amedrontados. Com uma a��o, voc� pode gastar 5 pontos\r\n"
				+ "de feiti�aria para recorrer a esse poder e exalar uma aura\r\n"
				+ "de admira��o ou medo (� sua escolha) a uma dist�ncia de\r\n"
				+ "18 metros. Por 1 minuto ou at� voc� perder sua\r\n"
				+ "concentra��o (como se voc� tivesse conjurado uma magia\r\n"
				+ "de concentra��o), cada criatura hostil que come�ar seu\r\n"
				+ "turno nessa aura, deve ser bem sucedido num teste de\r\n"
				+ "resist�ncia de Sabedoria ou ficar� enfeiti�ada (se voc�\r\n"
				+ "escolheu admira��o) ou amedrontada (se voc� escolheu\r\n"
				+ "medo) at� a aura terminar. Uma criatura que seja bem\r\n"
				+ "sucedida no teste de resist�ncia ficar� imune a sua aura\r\n"
				+ "por 24 horas.\r\n\n");
	}
	
//Magia selvagem
	public void magiaSelvagem() {
		System.out.println("MAGIA SELVAGEM\r\n\n"
				+ "Sua magia inata vem das for�as selvagens do caos que\r\n"
				+ "constituem a base da ordem da cria��o. Voc� deve ter\r\n"
				+ "sido exposto a algum tipo de magia bruta, talvez de um\r\n"
				+ "portal planar que levava ao Limbo, a Planos Elementais\r\n"
				+ "ou ao misterioso Reino Distante. Talvez voc� tenha sido\r\n"
				+ "aben�oado por uma poderosa criatura fe�rica ou marcado\r\n"
				+ "por um corruptor. Ou sua magia pode ser uma\r\n"
				+ "casualidade do seu nascimento, sem qualquer raz�o\r\n"
				+ "aparente. No entanto, ela existe, essa magia ca�tica\r\n"
				+ "fervilha dentro de voc�, esperando por qualquer brecha.\r\n\n"
				+ "SURTO DE MAGIA SELVAGEM\r\n\n"
				+ "A partir do momento que voc� escolhe essa origem, no 1�\r\n"
				+ "n�vel, sua conjura��o pode liberar surtos de magia\r\n"
				+ "selvagem. Imediatamente ap�s voc� conjurar uma magia\r\n"
				+ "de feiticeiro de 1� n�vel ou superior, o Mestre pode\r\n"
				+ "solicitar que voc� role um d20. Se voc� rolar um 1, role na\r\n"
				+ "tabela Surto de Magia Selvagem para criar um efeito\r\n"
				+ "m�gico aleat�rio. Um surto s� pode ocorrer uma vez por\r\n"
				+ "turno. Se o efeito de um surto for uma magia, ela � muito\r\n"
				+ "selvagem para ser afetada por Metamagia. Se ela\r\n"
				+ "normalmente exige concentra��o, nesse caso n�o ser�\r\n"
				+ "necess�rio; a magia permanece por sua dura��o total.\r\n\n"
				+ "MAR�S DE CAOS\r\n\n"
				+ "A partir do 1� n�vel, voc� pode manipular as for�as do\r\n"
				+ "acaso e do caos para ganhar vantagem em uma jogada de\r\n"
				+ "ataque, teste de habilidade ou teste de resist�ncia.\r\n"
				+ "Quando o fizer, voc� deve finalizar um descanso longo\r\n"
				+ "antes de poder usar essa caracter�stica novamente.\r\n"
				+ "A qualquer momento, antes de recuperar o uso dessa\r\n"
				+ "caracter�stica, o Mestre pode rolar na tabela Surto de\r\n"
				+ "Magia Selvagem, imediatamente ap�s voc� conjurar uma\r\n"
				+ "magia de feiticeiro de 1� n�vel ou superior. Ap�s isso, voc�\r\n"
				+ "recupera o uso dessa caracter�stica.\r\n\n");
	}
	
	public void magiaSelvagemN6() {
		System.out.println("DOBRAR A SORTE\r\n\n"
				+ "A partir do 6� n�vel, voc� adquire a habilidade de mudar o\r\n"
				+ "destino usando sua magia selvagem. Quando outra\r\n"
				+ "criatura que voc� possa ver realizar uma jogada de\r\n"
				+ "ataque, um teste de habilidade ou um teste de resist�ncia,\r\n"
				+ "voc� pode usar sua rea��o para gastar 2 pontos de\r\n"
				+ "feiti�aria para rolar 1d4 e aplicar o n�mero rolado como\r\n"
				+ "um b�nus ou uma penalidade (� sua escolha) na jogada da\r\n"
				+ "criatura. Voc� pode fazer isso depois da criatura fazer a\r\n"
				+ "jogada, mas antes do efeito ocorrer.\r\n\n");
	}
	
	public void magiaSelvagemN14() {
		System.out.println("CAOS CONTROLADO\r\n\n"
				+ "No 14� n�vel, voc� ganha um controle modico sobre seus\r\n"
				+ "surtos de magia selvagem. Sempre que voc� rolar a tabela\r\n"
				+ "Surto de Magia Selvagem, voc� pode rolar duas vezes e\r\n"
				+ "usar qualquer resultado.\r\n\n");
	}
	
	public void magiaSelvagemN18() {
		System.out.println("BOMBARDEIO DE MAGIA\r\n\n"
				+ "A partir do 18� n�vel, a energia nociva das suas magias se\r\n"
				+ "intensifica. Quando voc� rolar o dano de uma magia e\r\n"
				+ "rolar o maior dano poss�vel em qualquer dado, escolha um\r\n"
				+ "desses dados, role ele novamente e adicione o valor rolado\r\n"
				+ "ao dano. Voc� pode usar essa caracter�stica apenas uma\r\n"
				+ "vez por rodada.\r\n\n");
	}
}
