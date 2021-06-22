package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Patrulheiro extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Patrulheiro";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
	public String patrulheiroDescricao() {
		String descricao = "PATRULHEIRO\r\n"
				+ "De apar�ncia �spera e\r\n"
				+ "selvagem, um humano\r\n"
				+ "espreita sozinho atrav�s das\r\n"
				+ "sombras das �rvores, ca�ando\r\n"
				+ "os orcs que ele sabe estarem\r\n"
				+ "planejando um assalto a uma\r\n"
				+ "fazenda pr�xima. Segurando\r\n"
				+ "uma espada curta em cada m�o,\r\n"
				+ "ele se transforma em um vendaval\r\n"
				+ "de a�o, talando um inimigo ap�s o outro.\r\n"
				+ "Ap�s se evadir de um cone de ar congelante,\r\n"
				+ "uma elfa encontra\r\n"
				+ "-se de p� e saca seu arco das costas,\r\n"
				+ "disparando uma flecha no drag�o branco. Ignorando a\r\n"
				+ "onda de medo que emana do drag�o, assim como ignorou\r\n"
				+ "o frio do seu sopro, ela envia uma flecha ap�s a outro\r\n"
				+ "tentando encontrar as brechas entre as espessas escamas\r\n"
				+ "do drag�o.\r\n"
				+ "Erguendo sua m�o para o alto, um meio\r\n"
				+ "-elfo assobia\r\n"
				+ "para o falc�o que o circunda acima, chamando o p�ssaro\r\n"
				+ "de volta para o seu lado. Sussurrando instru��es em\r\n"
				+ "�lfico, ele aponta para o urso\r\n"
				+ "-coruja que ele estava\r\n"
				+ "rastreando e envia o falc�o para distrair a criatura\r\n"
				+ "enquanto ele prepara seu arco.\r\n"
				+ "Longe do alvoro�o das cidades e vilas, passando das\r\n"
				+ "divisas que abrigam a fazendas mais long�nquas dos\r\n"
				+ "horrores do ermo, entre as �rvores densas de florestas\r\n"
				+ "sem trilhas e atrav�s das vastas plan�cies vazias, os\r\n"
				+ "patrulheiros mantem sua vig�lia intermin�vel. ";
		
		return descricao;
	}
	
	public String patrulheiroCaracteristicas() {
		String caracteristicas = "CARACTER�STICAS DE CLASSE\r\n"
				+ "Como um patrulheiro, voc� adquire as seguintes\r\n"
				+ "caracter�sticas de classe.\r\n"
				+ "PONTOS DE VIDA\r\n"
				+ "Dado de Vida: 1d10 por n�vel de patrulheiro\r\n"
				+ "Pontos de Vida no 1� N�vel: 10 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d10 (ou 6) +\r\n"
				+ "seu modificador de Constitui��o por n�vel de\r\n"
				+ "patrulheiro ap�s o 1�\r\n"
				+ "PROFICI�NCIAS\r\n"
				+ "Armaduras: Armaduras leves, armaduras m�dias,\r\n"
				+ "escudos\r\n"
				+ "Armas: Armas simples, armas marciais\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resist�ncia: For�a, Destreza\r\n"
				+ "Per�cias: Escolha tr�s dentre Acrobacia, Adestrar\r\n"
				+ "Animais, Atletismo, Furtividade, Intui��o,\r\n"
				+ "Investiga��o, Natureza, Percep��o e Sobreviv�ncia\n"
				+ "EQUIPAMENTO\r\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) camis�o de malha ou (b) armadura de couro\r\n"
				+ "- (a) duas espadas curtas ou (b) duas armas simples\r\n"
				+ "corpo-a-corpo\r\n"
				+ "- (a) um pacote de explorador ou (b) um pacote de\r\n"
				+ "aventureiro\r\n"
				+ "- Um arco longo e uma aljava com 20 flechas";
		
		return caracteristicas;
	}
	
	public void setPatrulheiro() {
		getFicha().setClasse("Patrulheiro");
		getFicha().setBonus_proficiencia(2);
		List<String> profEquips = Arrays.asList("Armaduras leve", "Armaduras M�dias", "Escudos", "Armas Simples", "Armas Marciais");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("For�a", "Destreza");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Adestrar Animais", "Atletismo", "Furtividade", "Intui��o", "Investiga��o", "Natureza", "Percep��o", "Sobreviv�ncia");
		getProficiencia().setPericias(profPericias, 3);
//		equips1();
//		equips2();
//		equips3();
	}
	
	public int pontosVidaLV1(int modConstituicao) {
		return 10+modConstituicao;
	}
	
	public int pontosVidaNiveisSeguintesRoll(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		for(int c = 0; c < niveis; c++) {
			soma += modConstituicao+(random.nextInt((10 - 1) + 1) + 1);	
		}
		return soma;
	}
	
	public int pontosVidaNiveisSeguintes(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		
		for(int i = 0; i < niveis; i++) {
			soma += modConstituicao+6;
		}
		
		return soma;
	}
	
	public int CDMagia(int proficiencia, int ModCarisma) {
		return 8+proficiencia+ModCarisma;
	}
	
	public int ModificadorAtaqueMagia(int proficiencia, int ModCarisma) {
		return proficiencia+ModCarisma;
	}
	
//	public void equips1() {
//		Scanner entrada = new Scanner(System.in);
//		List<String> equip1 = Arrays.asList("Brunea", "Armadura de couro");
//		boolean menuLoop = false;
//		int menu = 0;
//		while(menuLoop == false) {
//			do {
//				System.out.println("Escolha uma op��o:");
//				
//				for(int i = 0; i < equip1.size(); i++) {
//					System.out.println((i+1)+ " - " +equip1.get(i));
//				}
//				
//				while(!entrada.hasNextInt()) {
//					System.out.println("Digite um numero!");
//					entrada.next();
//				}
//				
//				menu = entrada.nextInt();
//			}while(menu <= 0 || menu > 2);
//			menuLoop = confirmarDecisao(equip1.get(menu));
//		}
//		
//		switch(menu) {
//		case 1:
//			getFicha().setEquipamentos("Brunea");
//		break;
//		
//		case 2:
//			getFicha().setEquipamentos("Armadura de Couro");
//		break;
//		}
//	}
//	
//	public void equips2() {
//		Scanner entrada = new Scanner(System.in);
//		List<String> equip1 = Arrays.asList("Duas espadas curtas", "Duas armas simples corpo-a-corpo");
//		boolean menuLoop = false;
//		int menu = 0;
//		while(menuLoop == false) {
//			do {
//				System.out.println("Escolha uma op��o:");
//				
//				for(int i = 0; i < equip1.size(); i++) {
//					System.out.println((i+1)+ " - " +equip1.get(i));
//				}
//				
//				while(!entrada.hasNextInt()) {
//					System.out.println("Digite um numero!");
//					entrada.next();
//				}
//				
//				menu = entrada.nextInt();
//			}while(menu <= 0 || menu > 2);
//			menuLoop = confirmarDecisao(equip1.get(menu));
//		}
//		
//		switch(menu) {
//		case 1:
//			getFicha().setEquipamentos("Espada curta (2)");
//		break;
//		
//		case 2:
//			getFicha().setEquipamentos(getEquips().setArmaCACSimples(2));
//		break;
//		}
//	}
//	
//	public void equips3() {
//		getFicha().setEquipamentos(getEquips().setPacotes("Pacote de Explorador", "Pacote de Aventureiro"));
//	}

	public boolean confirmarDecisao(String opcao) {
		Scanner entrada = new Scanner(System.in);
		
		char decisao;
		do {
			System.out.println("\nTem certeza que deseja " +opcao +"? (Y/N)");
			
			decisao = entrada.next().charAt(0);
		}while((Objects.equals(decisao, 'Y') || Objects.equals(decisao, 'y')  || Objects.equals(decisao, 'N') || Objects.equals(decisao, 'n')) == false);
		
		if(decisao == 'Y' || decisao == 'y') {
			return true;
		}
		return false;
	}
	
	public void setInimigoFavorito() {
		getFicha().setClassefeats("--INIMIGO FAVORITO--\r\n"
				+ "A partir do 1� n�vel, voc� tem experi�ncia significativa\r\n"
				+ "estudando, rastreando, ca�ando e, at� mesmo, falando\r\n"
				+ "com certos tipos de inimigos.\r\n"
				+ "Escolha um tipo de inimigo favorito: bestas, fadas,\r\n"
				+ "humanoide, monstruosidades ou mortos-vivos. Voc�\r\n"
				+ "recebe um b�nus de +2 nas jogadas de dano com ataques\r\n"
				+ "com arma contra criaturas do tipo escolhido. Al�m disso,\r\n"
				+ "voc� tem vantagem em testes de Sabedoria\r\n"
				+ "(Sobreviv�ncia) para rastrear seus inimigos favoritos,\r\n"
				+ "assim como em testes de Intelig�ncia para lembrar\r\n"
				+ "informa��es sobre eles.\r\n"
				+ "Quando voc� adquire essa caracter�stica, voc� tamb�m\r\n"
				+ "aprende um idioma, � sua escolha, que seja falado pelos\r\n"
				+ "seus inimigos favoritos, se eles falarem algum.\r\n");
	}
	
	public void setExploradorNatural() {
		getFicha().setClassefeats("--EXPLORADOR NATURAL--\r\n"
				+ "Voc� � um mestre na navega��o pelo mundo natural e\r\n"
				+ "voc� reage de forma r�pida e decisiva quando � atacado.\r\n"
				+ "Isso fornece a voc� os seguintes benef�cios:\r\n"
				+ "- Voc� ignora terreno dif�cil.\r\n"
				+ "- Voc� tem vantagem em rolagens de iniciativa.\r\n"
				+ "- No seu primeiro turno de combate, voc� tem vantagem\r\n"
				+ "nas jogadas de ataque contra criaturas que ainda n�o\r\n"
				+ "tenham agido.\r\n"
				+ "Al�m disso, voc� � perito em navegar pelo ambiente\r\n"
				+ "selvagem. Voc� ganha os seguintes benef�cios quando\r\n"
				+ "estiver viajando por uma hora ou mais:\r\n"
				+ "- Terreno dif�cil n�o atrasa a viagem do seu grupo.\r\n"
				+ "- Seu grupo n�o pode se perder, exceto por meios\r\n"
				+ "m�gicos.\r\n"
				+ "- Mesmo quando voc� est� engajado em outra atividade\r\n"
				+ "al�m de viajar (como forragear, navegar ou rastrear),\r\n"
				+ "voc� permanece alerta ao perigo.\r\n"
				+ "- Se voc� estiver viajando sozinho, voc� pode se mover\r\n"
				+ "furtividamente com um ritmo de viagem normal.\r\n"
				+ "- Quando voc� forrageia, voc� encontra o dobro de\r\n"
				+ "comida que normalmente encontraria.\r\n"
				+ "- Enquanto estiver rastreando outras criaturas, voc�\r\n"
				+ "tamb�m descobre o n�mero exato delas, seus\r\n"
				+ "tamanhos e h� quanto tempo elas passaram pela �rea.\r\n");
	}
}
