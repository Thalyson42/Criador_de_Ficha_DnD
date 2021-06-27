package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Charlatao extends Classes{

	private List<String> tracoCharlatao = Arrays.asList("Eu me apaixono e desapaixono facilmente, e estou sempre em busca de algu�m.",
			"Eu tenho uma piada para cada ocasi�o, especialmente ocasi�es sem que o humor � inapropriado.",
			"Bajula��o � meu truque predileto para conseguir o que eu quero.",
			"Eu sou um jogador nato que n�o consegue resistir a se arriscar por uma poss�vel recompensa.",
			"Eu minto sobre quase tudo, mesmo quando n�o existe qualquer boa raz�o.",
			"Sarcasmo e insultos s�o minhas armas prediletas.",
			"Eu tenho v�rios s�mbolos sagrados comigo, e invoco a divindade que seja mais �til em cada dado momento.",
			"Eu furto qualquer coisa que eu vejo que possa ter algum valor.");
	
	private List<String> idealCharlatao = Arrays.asList("Independ�ncia. Sou um espirito livre - ningu�m me diz o que fazer. (Ca�tico)",
			"Justi�a. Eu nunca roubo de pessoas que n�o podem perder algumas moedas. (Leal)",
			"caridade. Eu distribuo o dinheiro que adquiro com as pessoas que realmente precisam. (Bom)",
			"Criatividade. Eu nunca fa�o a mesma trapa�a duas vezes. (Ca�tico)",
			"Amizade. Bens materiais vem e v�o. Os la�os de amizade duram pra sempre. (Bom)",
			"Aspira��o. Eu estou determinado a fazer algo por mim mesmo. (Qualquer)");
	
	private List<String> vinculoCharlatao = Arrays.asList("Eu exotorqui a pessoa errada e devo trabalhar para que esse indiv�duo nunca mais cruze meu caminho ou a das pessoas com quem me importo.",
			"Eu devo tudo ao meu mentor - uma pessoa terr�vel que, provavelmente, est� apodrecendo na cadeia em algum lugar.",
			"Em algum lugar por ai, eu tenho um filho que n�o me conhece. Eu estou tornando o mundo melhor para ele.",
			"Eu vim de uma familia nobre e, um dia, irei reivindicar minhas terras e t�tulo daqueles que o roubaram de mim.",
			"Uma pessoa poderosa matou algu�m que eu amava. Algum dia, em breve, terei minha vingan�a.",
			"Eu enganei e arruinei a vida de uma pessoa que n�o merecia. Eu busco reparar meus erros, mas talvez nunca seja capaz de me perdoar.");
	
	private List<String> defeitoCharlatao = Arrays.asList("N�o resisto um rostinho bonito.",
			"Estou sempre com dividas. Eu gasto meus lucros il�citos com luxurias decadentes mais r�pido do que os ganho...",
			"Estou convencido que ningu�m pode me enganar da forma que eu engano os outros.",
			"Eu sou ganancioso demais pra meu pr�prio bem. Eu n�o consigo resistir a me arriscar se tiver dinheiro envolvido.",
			"Eu n�o resisto a enganar pessoas que s�o mais poderosas que eu.",
			"Eu odeio admitir e vou me odiar por isso, mas, eu vou correr e salvar minha pr�pria oele se as coisas engrossarem.");

	
	public String getCharlatao() {
		String descricao = "CHARLAT�O\r\n"
				+ "Voc� sempre teve jeito com as pessoas. Voc� sabe o que os\r\n"
				+ "deixa extasiados, voc� pode destrinchar os desejos em\r\n"
				+ "seus cora��es ap�s alguns minutos de conversa e, com\r\n"
				+ "algumas perguntas capciosas, voc� pode l�-los como se\r\n"
				+ "eles fossem livros infantis. � um talento �til e que voc�\r\n"
				+ "est� perfeitamente disposto a usar em sua vantagem.\r\n"
				+ "Voc� sabe o que as pessoas querem e voc� as entrega\r\n"
				+ "ou, pelo menos, promete que ir� entregar. O bom senso\r\n"
				+ "deveria manter as pessoas longe de coisas que parecem\r\n"
				+ "muito boas pra serem verdade, mas o bom senso parece\r\n"
				+ "desaparecer quando voc� est� por perto. A garrafa de\r\n"
				+ "liquido cor de rosa ir�, sem d�vida, curar essa brotoeja\r\n"
				+ "horrenda, essa pomada � nada mais � que um pouco de\r\n"
				+ "banha com uma pitada de sal de prata � pode restaurar a\r\n"
				+ "juventude e vigor e existe uma ponte na cidade que\r\n"
				+ "acabar de ficar a venda. Essas maravilhas soam\r\n"
				+ "improv�veis, mas voc� as faz soar como barganhas reais.\r\n"
				+ "Profici�ncia em Per�cias: Engana��o, Prestidigita��o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de disfarce, kit de\r\n"
				+ "falsifica��o\r\n"
				+ "Equipamento: Um conjunto de roupas finas, um kit de\r\n"
				+ "disfarce, ferramentas de trapa�a, � sua escolha (dez\r\n"
				+ "garrafas tampadas preenchidas com l�quidos coloridos,\r\n"
				+ "um conjunto de dados viciados, um baralho de cartas\r\n"
				+ "marcadas ou um anel de sinete de um duque\r\n"
				+ "imagin�rio), e uma algibeira contendo 15po";
		return descricao;
	}
	
	public void setCharlatao() {
		getFicha().setAntecedente("Charlat�o");
		List<String> profPericias = Arrays.asList("Engana��o", "Prestidigita��o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Kit de falsifica��o");
		List<String> equipamentos = Arrays.asList("Conjunto de roupas finas", "Kit de disfarce", "Ferramentas de trapa�a", "Algibeira 15po");
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
