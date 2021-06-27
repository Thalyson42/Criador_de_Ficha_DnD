package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Orfao extends Classes{


	private List<String> tracoOrfao = Arrays.asList("Eu escondo peda�os de comida e bugigangas em meus bolsos.",
			"Eu pergunto um monte e coisas.",
			"Eu gosto de me espremer em locais pequenos onde ningu�m possa me alcan�ar.",
			"Eu durmo encostado em um muro ou �rvore, abra�ado com todas as minhas posses.",
			"Eu como feito um porco e tenho maus modos.",
			"Eu acho que todos que s�o gentis comigo tem segundas inten��es.",
			"Eu n�o gosto de tomar banho.",
			"Eu digo na cara o que as outras pessoas insinuam ou escondem.");
	
	private List<String> idealOrfao = Arrays.asList("Respeito. Todas as pessoas, ricas ou pobres, merecem respeito. (Bom)",
			"Comunidade. N�s temos que tomar conta uns dos outros, porque ningu�m mais o far�. (Leal)",
			"Mudan�a. Os baixos se erguer�o e os altos ir�o tombar. A mudan�a � a natureza das coisas. (Ca�tico)",
			"Retribui��o. Os ricos precisam ver como a vida e morte � nas sarjetas. (Mau)",
			"Povo. Eu ajudo as pessoas que me ajudam � � isso que nos mantem vivos. (Neutro)",
			"Aspira��o. Eu vou provar que sou merecedor de uma vida melhor. (Qualquer)");
	
	private List<String> vinculoOrfao = Arrays.asList("Minha cidade ou vila � meu lar, e eu vou lutar para defend�-lo.",
			"Eu patrocino um orfanato para que outros n�o passem pelo que fui for�ado a passar.",
			"Eu devo minha sobreviv�ncia a outros �rf�o que me ensinou a vida nas ruas.",
			"Eu tenho uma d�vida que nunca poderei pagar com uma pessoa que teve pena de mim.",
			"Eu sai da minha vida de pobreza roubando uma pessoa importante, eu sou procurado por isso.",
			"Ningu�m deveria ter suportar as dificuldades pelas quais passei.");
	
	private List<String> defeitoOrfao = Arrays.asList("Se eu estiver em desvantagem, eu vou fugir de uma briga.",
			"Ouro parece ser muito dinheiro pra mim, e eu faria praticamente qualquer coisa por mais dele.",
			"Eu nunca vou confiar em ningu�m plenamente, al�m de mim mesmo.",
			"Eu prefiro matar algu�m enquanto dorme que uma luta justa",
			"N�o � roubo se eu preciso mais que outra pessoa.",
			"As pessoas que n�o podem se virar sozinhas, tem o que merecem.");
	
	public String getOrfao() {
		String descricao = "�RF�O\r\n"
				+ "Voc� cresceu nas ruas, sozinho, �rf�o e pobre. Voc� n�o\r\n"
				+ "tinha ningu�m para cuidar de voc� ou te alimentar,\r\n"
				+ "ent�o, aprendeu a se virar sozinho. Voc� lutou ferozmente\r\n"
				+ "por comida e se manteve constantemente atendo a outras\r\n"
				+ "almas desesperadas que pudessem te roubar. Voc�\r\n"
				+ "dormiu em telhados e becos, exposto aos elementos e\r\n"
				+ "suportou doen�as sem ajuda da medicina ou um lugar\r\n"
				+ "para se recuperar. Voc� sobreviveu a despeito de tudo e,\r\n"
				+ "conseguiu isso atrav�s de astucia, for�a, agilidade ou uma\r\n"
				+ "combina��o de cada.\r\n"
				+ "Voc� come�a sua carreira de aventureiro com dinheiro\r\n"
				+ "o suficiente para viver modestamente, mas em seguran�a,\r\n"
				+ "por pelo menos dez dias. Como voc� conseguiu esse\r\n"
				+ "dinheiro? O que aconteceu para que voc� conseguisse se\r\n"
				+ "libertar das circunstancias desesperadoras e embarcasse\r\n"
				+ "em uma vida melhor?\r\n"
				+ "Profici�ncia em Per�cias: Furtividade, Prestidigita��o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de disfarce,\r\n"
				+ "ferramentas de ladr�o\r\n"
				+ "Equipamento: Uma faca pequena, um mapa da cidade\r\n"
				+ "em que voc� cresceu, um rato de estima��o, um\r\n"
				+ "pequeno objeto para lembrar dos seus pais, um\r\n"
				+ "conjunto de roupas comuns e uma algibeira contendo\r\n"
				+ "10 po\r\n";
		return descricao;
	}
	
	public void setOrfao() {
		getFicha().setAntecedente("�rf�o");
		List<String> profPericias = Arrays.asList("Furtividade", "Prestidigita��o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladr�o");
		List<String> equipamentos = Arrays.asList("Faca pequena", "Mapa da cidade que voc� cresceu", "Rato de estima��o", "Pequeno objeto para lembrar dos seus pais", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoOrfao() {
		return tracoOrfao;
	}

	public List<String> getIdealOrfao() {
		return idealOrfao;
	}

	public List<String> getVinculoOrfao() {
		return vinculoOrfao;
	}

	public List<String> getDefeitoOrfao() {
		return defeitoOrfao;
	}
	
}
