package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Charlatao extends Classes{

	private List<String> tracoCharlatao = Arrays.asList("Eu me apaixono e desapaixono facilmente, e estou sempre em busca de alguém.",
			"Eu tenho uma piada para cada ocasião, especialmente ocasiões sem que o humor é inapropriado.",
			"Bajulação é meu truque predileto para conseguir o que eu quero.",
			"Eu sou um jogador nato que não consegue resistir a se arriscar por uma possível recompensa.",
			"Eu minto sobre quase tudo, mesmo quando não existe qualquer boa razão.",
			"Sarcasmo e insultos são minhas armas prediletas.",
			"Eu tenho vários símbolos sagrados comigo, e invoco a divindade que seja mais útil em cada dado momento.",
			"Eu furto qualquer coisa que eu vejo que possa ter algum valor.");
	
	private List<String> idealCharlatao = Arrays.asList("Independência. Sou um espirito livre - ninguém me diz o que fazer. (Caótico)",
			"Justiça. Eu nunca roubo de pessoas que não podem perder algumas moedas. (Leal)",
			"caridade. Eu distribuo o dinheiro que adquiro com as pessoas que realmente precisam. (Bom)",
			"Criatividade. Eu nunca faço a mesma trapaça duas vezes. (Caótico)",
			"Amizade. Bens materiais vem e vão. Os laços de amizade duram pra sempre. (Bom)",
			"Aspiração. Eu estou determinado a fazer algo por mim mesmo. (Qualquer)");
	
	private List<String> vinculoCharlatao = Arrays.asList("Eu exotorqui a pessoa errada e devo trabalhar para que esse indivíduo nunca mais cruze meu caminho ou a das pessoas com quem me importo.",
			"Eu devo tudo ao meu mentor - uma pessoa terrível que, provavelmente, está apodrecendo na cadeia em algum lugar.",
			"Em algum lugar por ai, eu tenho um filho que não me conhece. Eu estou tornando o mundo melhor para ele.",
			"Eu vim de uma familia nobre e, um dia, irei reivindicar minhas terras e título daqueles que o roubaram de mim.",
			"Uma pessoa poderosa matou alguém que eu amava. Algum dia, em breve, terei minha vingança.",
			"Eu enganei e arruinei a vida de uma pessoa que não merecia. Eu busco reparar meus erros, mas talvez nunca seja capaz de me perdoar.");
	
	private List<String> defeitoCharlatao = Arrays.asList("Não resisto um rostinho bonito.",
			"Estou sempre com dividas. Eu gasto meus lucros ilícitos com luxurias decadentes mais rápido do que os ganho...",
			"Estou convencido que ninguém pode me enganar da forma que eu engano os outros.",
			"Eu sou ganancioso demais pra meu próprio bem. Eu não consigo resistir a me arriscar se tiver dinheiro envolvido.",
			"Eu não resisto a enganar pessoas que são mais poderosas que eu.",
			"Eu odeio admitir e vou me odiar por isso, mas, eu vou correr e salvar minha própria oele se as coisas engrossarem.");

	
	public String getCharlatao() {
		String descricao = "CHARLATÃO\r\n"
				+ "Você sempre teve jeito com as pessoas. Você sabe o que os\r\n"
				+ "deixa extasiados, você pode destrinchar os desejos em\r\n"
				+ "seus corações após alguns minutos de conversa e, com\r\n"
				+ "algumas perguntas capciosas, você pode lê-los como se\r\n"
				+ "eles fossem livros infantis. É um talento útil e que você\r\n"
				+ "está perfeitamente disposto a usar em sua vantagem.\r\n"
				+ "Você sabe o que as pessoas querem e você as entrega\r\n"
				+ "ou, pelo menos, promete que irá entregar. O bom senso\r\n"
				+ "deveria manter as pessoas longe de coisas que parecem\r\n"
				+ "muito boas pra serem verdade, mas o bom senso parece\r\n"
				+ "desaparecer quando você está por perto. A garrafa de\r\n"
				+ "liquido cor de rosa irá, sem dúvida, curar essa brotoeja\r\n"
				+ "horrenda, essa pomada – nada mais é que um pouco de\r\n"
				+ "banha com uma pitada de sal de prata – pode restaurar a\r\n"
				+ "juventude e vigor e existe uma ponte na cidade que\r\n"
				+ "acabar de ficar a venda. Essas maravilhas soam\r\n"
				+ "improváveis, mas você as faz soar como barganhas reais.\r\n"
				+ "Proficiência em Perícias: Enganação, Prestidigitação\r\n"
				+ "Proficiência em Ferramentas: Kit de disfarce, kit de\r\n"
				+ "falsificação\r\n"
				+ "Equipamento: Um conjunto de roupas finas, um kit de\r\n"
				+ "disfarce, ferramentas de trapaça, à sua escolha (dez\r\n"
				+ "garrafas tampadas preenchidas com líquidos coloridos,\r\n"
				+ "um conjunto de dados viciados, um baralho de cartas\r\n"
				+ "marcadas ou um anel de sinete de um duque\r\n"
				+ "imaginário), e uma algibeira contendo 15po";
		return descricao;
	}
	
	public void setCharlatao() {
		getFicha().setAntecedente("Charlatão");
		List<String> profPericias = Arrays.asList("Enganação", "Prestidigitação");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Kit de falsificação");
		List<String> equipamentos = Arrays.asList("Conjunto de roupas finas", "Kit de disfarce", "Ferramentas de trapaça", "Algibeira 15po");
		getFicha().setEquipamentos(equipamentos);
//		getFicha().setEquipamentos(getEquips().setEquipsCharlatao());
	}

	public List<String> getTracoCharlatao() {
		return tracoCharlatao;
	}

	public List<String> getIdealCharlatao() {
		return idealCharlatao;
	}

	public List<String> getVinculoCharlatao() {
		return vinculoCharlatao;
	}

	public List<String> getDefeitoCharlatao() {
		return defeitoCharlatao;
	}
	
}
