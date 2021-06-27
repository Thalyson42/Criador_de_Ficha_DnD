package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Orfao extends Classes{


	private List<String> tracoOrfao = Arrays.asList("Eu escondo pedaços de comida e bugigangas em meus bolsos.",
			"Eu pergunto um monte e coisas.",
			"Eu gosto de me espremer em locais pequenos onde ninguém possa me alcançar.",
			"Eu durmo encostado em um muro ou árvore, abraçado com todas as minhas posses.",
			"Eu como feito um porco e tenho maus modos.",
			"Eu acho que todos que são gentis comigo tem segundas intenções.",
			"Eu não gosto de tomar banho.",
			"Eu digo na cara o que as outras pessoas insinuam ou escondem.");
	
	private List<String> idealOrfao = Arrays.asList("Respeito. Todas as pessoas, ricas ou pobres, merecem respeito. (Bom)",
			"Comunidade. Nós temos que tomar conta uns dos outros, porque ninguém mais o fará. (Leal)",
			"Mudança. Os baixos se erguerão e os altos irão tombar. A mudança é a natureza das coisas. (Caótico)",
			"Retribuição. Os ricos precisam ver como a vida e morte é nas sarjetas. (Mau)",
			"Povo. Eu ajudo as pessoas que me ajudam – é isso que nos mantem vivos. (Neutro)",
			"Aspiração. Eu vou provar que sou merecedor de uma vida melhor. (Qualquer)");
	
	private List<String> vinculoOrfao = Arrays.asList("Minha cidade ou vila é meu lar, e eu vou lutar para defendê-lo.",
			"Eu patrocino um orfanato para que outros não passem pelo que fui forçado a passar.",
			"Eu devo minha sobrevivência a outros órfão que me ensinou a vida nas ruas.",
			"Eu tenho uma dívida que nunca poderei pagar com uma pessoa que teve pena de mim.",
			"Eu sai da minha vida de pobreza roubando uma pessoa importante, eu sou procurado por isso.",
			"Ninguém deveria ter suportar as dificuldades pelas quais passei.");
	
	private List<String> defeitoOrfao = Arrays.asList("Se eu estiver em desvantagem, eu vou fugir de uma briga.",
			"Ouro parece ser muito dinheiro pra mim, e eu faria praticamente qualquer coisa por mais dele.",
			"Eu nunca vou confiar em ninguém plenamente, além de mim mesmo.",
			"Eu prefiro matar alguém enquanto dorme que uma luta justa",
			"Não é roubo se eu preciso mais que outra pessoa.",
			"As pessoas que não podem se virar sozinhas, tem o que merecem.");
	
	public String getOrfao() {
		String descricao = "ÓRFÃO\r\n"
				+ "Você cresceu nas ruas, sozinho, órfão e pobre. Você não\r\n"
				+ "tinha ninguém para cuidar de você ou te alimentar,\r\n"
				+ "então, aprendeu a se virar sozinho. Você lutou ferozmente\r\n"
				+ "por comida e se manteve constantemente atendo a outras\r\n"
				+ "almas desesperadas que pudessem te roubar. Você\r\n"
				+ "dormiu em telhados e becos, exposto aos elementos e\r\n"
				+ "suportou doenças sem ajuda da medicina ou um lugar\r\n"
				+ "para se recuperar. Você sobreviveu a despeito de tudo e,\r\n"
				+ "conseguiu isso através de astucia, força, agilidade ou uma\r\n"
				+ "combinação de cada.\r\n"
				+ "Você começa sua carreira de aventureiro com dinheiro\r\n"
				+ "o suficiente para viver modestamente, mas em segurança,\r\n"
				+ "por pelo menos dez dias. Como você conseguiu esse\r\n"
				+ "dinheiro? O que aconteceu para que você conseguisse se\r\n"
				+ "libertar das circunstancias desesperadoras e embarcasse\r\n"
				+ "em uma vida melhor?\r\n"
				+ "Proficiência em Perícias: Furtividade, Prestidigitação\r\n"
				+ "Proficiência em Ferramentas: Kit de disfarce,\r\n"
				+ "ferramentas de ladrão\r\n"
				+ "Equipamento: Uma faca pequena, um mapa da cidade\r\n"
				+ "em que você cresceu, um rato de estimação, um\r\n"
				+ "pequeno objeto para lembrar dos seus pais, um\r\n"
				+ "conjunto de roupas comuns e uma algibeira contendo\r\n"
				+ "10 po\r\n";
		return descricao;
	}
	
	public void setOrfao() {
		getFicha().setAntecedente("Órfão");
		List<String> profPericias = Arrays.asList("Furtividade", "Prestidigitação");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
		getFicha().setProfi_ferramentas_peri("Ferramentas de ladrão");
		List<String> equipamentos = Arrays.asList("Faca pequena", "Mapa da cidade que você cresceu", "Rato de estimação", "Pequeno objeto para lembrar dos seus pais", "Conjunto de roupas comuns", "Algibeira 10po");
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
