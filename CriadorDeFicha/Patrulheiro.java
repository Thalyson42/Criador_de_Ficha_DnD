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
				+ "De aparência áspera e\r\n"
				+ "selvagem, um humano\r\n"
				+ "espreita sozinho através das\r\n"
				+ "sombras das árvores, caçando\r\n"
				+ "os orcs que ele sabe estarem\r\n"
				+ "planejando um assalto a uma\r\n"
				+ "fazenda próxima. Segurando\r\n"
				+ "uma espada curta em cada mão,\r\n"
				+ "ele se transforma em um vendaval\r\n"
				+ "de aço, talando um inimigo após o outro.\r\n"
				+ "Após se evadir de um cone de ar congelante,\r\n"
				+ "uma elfa encontra\r\n"
				+ "-se de pé e saca seu arco das costas,\r\n"
				+ "disparando uma flecha no dragão branco. Ignorando a\r\n"
				+ "onda de medo que emana do dragão, assim como ignorou\r\n"
				+ "o frio do seu sopro, ela envia uma flecha após a outro\r\n"
				+ "tentando encontrar as brechas entre as espessas escamas\r\n"
				+ "do dragão.\r\n"
				+ "Erguendo sua mão para o alto, um meio\r\n"
				+ "-elfo assobia\r\n"
				+ "para o falcão que o circunda acima, chamando o pássaro\r\n"
				+ "de volta para o seu lado. Sussurrando instruções em\r\n"
				+ "Élfico, ele aponta para o urso\r\n"
				+ "-coruja que ele estava\r\n"
				+ "rastreando e envia o falcão para distrair a criatura\r\n"
				+ "enquanto ele prepara seu arco.\r\n"
				+ "Longe do alvoroço das cidades e vilas, passando das\r\n"
				+ "divisas que abrigam a fazendas mais longínquas dos\r\n"
				+ "horrores do ermo, entre as árvores densas de florestas\r\n"
				+ "sem trilhas e através das vastas planícies vazias, os\r\n"
				+ "patrulheiros mantem sua vigília interminável. ";
		
		return descricao;
	}
	
	public String patrulheiroCaracteristicas() {
		String caracteristicas = "CARACTERÍSTICAS DE CLASSE\r\n"
				+ "Como um patrulheiro, você adquire as seguintes\r\n"
				+ "características de classe.\r\n"
				+ "PONTOS DE VIDA\r\n"
				+ "Dado de Vida: 1d10 por nível de patrulheiro\r\n"
				+ "Pontos de Vida no 1° Nível: 10 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d10 (ou 6) +\r\n"
				+ "seu modificador de Constituição por nível de\r\n"
				+ "patrulheiro após o 1°\r\n"
				+ "PROFICIÊNCIAS\r\n"
				+ "Armaduras: Armaduras leves, armaduras médias,\r\n"
				+ "escudos\r\n"
				+ "Armas: Armas simples, armas marciais\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resistência: Força, Destreza\r\n"
				+ "Perícias: Escolha três dentre Acrobacia, Adestrar\r\n"
				+ "Animais, Atletismo, Furtividade, Intuição,\r\n"
				+ "Investigação, Natureza, Percepção e Sobrevivência\n"
				+ "EQUIPAMENTO\r\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) camisão de malha ou (b) armadura de couro\r\n"
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
		List<String> profEquips = Arrays.asList("Armaduras leve", "Armaduras Médias", "Escudos", "Armas Simples", "Armas Marciais");
//		this.proficiencia.setFicha(ficha);
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Força", "Destreza");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Adestrar Animais", "Atletismo", "Furtividade", "Intuição", "Investigação", "Natureza", "Percepção", "Sobrevivência");
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
//				System.out.println("Escolha uma opção:");
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
//				System.out.println("Escolha uma opção:");
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
				+ "A partir do 1° nível, você tem experiência significativa\r\n"
				+ "estudando, rastreando, caçando e, até mesmo, falando\r\n"
				+ "com certos tipos de inimigos.\r\n"
				+ "Escolha um tipo de inimigo favorito: bestas, fadas,\r\n"
				+ "humanoide, monstruosidades ou mortos-vivos. Você\r\n"
				+ "recebe um bônus de +2 nas jogadas de dano com ataques\r\n"
				+ "com arma contra criaturas do tipo escolhido. Além disso,\r\n"
				+ "você tem vantagem em testes de Sabedoria\r\n"
				+ "(Sobrevivência) para rastrear seus inimigos favoritos,\r\n"
				+ "assim como em testes de Inteligência para lembrar\r\n"
				+ "informações sobre eles.\r\n"
				+ "Quando você adquire essa característica, você também\r\n"
				+ "aprende um idioma, à sua escolha, que seja falado pelos\r\n"
				+ "seus inimigos favoritos, se eles falarem algum.\r\n");
	}
	
	public void setExploradorNatural() {
		getFicha().setClassefeats("--EXPLORADOR NATURAL--\r\n"
				+ "Você é um mestre na navegação pelo mundo natural e\r\n"
				+ "você reage de forma rápida e decisiva quando é atacado.\r\n"
				+ "Isso fornece a você os seguintes benefícios:\r\n"
				+ "- Você ignora terreno difícil.\r\n"
				+ "- Você tem vantagem em rolagens de iniciativa.\r\n"
				+ "- No seu primeiro turno de combate, você tem vantagem\r\n"
				+ "nas jogadas de ataque contra criaturas que ainda não\r\n"
				+ "tenham agido.\r\n"
				+ "Além disso, você é perito em navegar pelo ambiente\r\n"
				+ "selvagem. Você ganha os seguintes benefícios quando\r\n"
				+ "estiver viajando por uma hora ou mais:\r\n"
				+ "- Terreno difícil não atrasa a viagem do seu grupo.\r\n"
				+ "- Seu grupo não pode se perder, exceto por meios\r\n"
				+ "mágicos.\r\n"
				+ "- Mesmo quando você está engajado em outra atividade\r\n"
				+ "além de viajar (como forragear, navegar ou rastrear),\r\n"
				+ "você permanece alerta ao perigo.\r\n"
				+ "- Se você estiver viajando sozinho, você pode se mover\r\n"
				+ "furtividamente com um ritmo de viagem normal.\r\n"
				+ "- Quando você forrageia, você encontra o dobro de\r\n"
				+ "comida que normalmente encontraria.\r\n"
				+ "- Enquanto estiver rastreando outras criaturas, você\r\n"
				+ "também descobre o número exato delas, seus\r\n"
				+ "tamanhos e há quanto tempo elas passaram pela área.\r\n");
	}
}
