package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Soldado extends Classes{

	private List<String> tracoSoldado = Arrays.asList("Eu sou sempre polido e respeitoso.",
			"Eu sou assombrado pelas memórias da guerra. Não consigo tirar aquelas imagens da minha cabeça.",
			"Eu perdi muitos amigos, e sou muito devagar para fazer novos.",
			"Eu tenho muitas histórias de inspiração e cautela da época de minha experiência militar que são relevantes em todas as situações de combate.",
			"Eu não consigo encarar um cão infernal sem vacilar",
			"Eu gosto de ser forte e de quebrar coisas.",
			"Eu tenho um senso de humor grosseiro.",
			"Eu enfrento os problemas de frente. Uma solução direta é o melhor caminho para o sucesso.");
	
	private List<String> idealSoldado = Arrays.asList("Bem Maior. Nosso destino é dar nossas vidas em defesa de terceiros. (Bom)",
			"Responsabilidade. Eu faço o que tenho que fazer e obedeço apenas a autoridade. (Leal)",
			"Independência. Quando pessoas seguem ordens cegas elas apoiam um tipo de tirania. (Caótico)",
			"Força. A vida é como uma guerra, o mais forte vence. (Mau)",
			"Viva e Deixa Viver. Ideais não valem a pena se você matar, ou for à guerra por eles. (Neutro)",
			"Aspiração. Minha cidade, nação ou meu povo, são tudo o que importa para mim. (Qualquer)");
	
	private List<String> vinculoSoldado = Arrays.asList("Eu ainda daria a minha vida pelas pessoas com quem servi.\r\n",
			"Alguém salvou minha vida no campo de batalha. Desde aquele dia eu nunca deixo nenhum amigo para trás.",
			"Minha honra é minha vida.",
			"Eu nunca esquecerei a destruidora derrota que minha companhia sofreu ou os inimigos que a causaram.",
			"Aqueles que lutam ao meu lado são aqueles por quem vale a pena morrer.",
			"Eu luto por aqueles que não podem lutar por si mesmos.");
	
	private List<String> defeitoSoldado = Arrays.asList("O inimigo monstruoso que enfrentei em uma batalha ainda me deixa tremendo de medo.",
			"Eu tenho pouco respeito por aqueles que não se provam bons combatentes.",
			"Eu cometi um terrível erro em batalha, o que custou muitas vidas – eu farei de tudo para manter esse erro em segredo.",
			"Meu ódio por meus inimigos é cego e irracional.",
			"Eu obedeço a lei, mesmo se a lei trouxer a angústia.",
			"Eu prefiro comer minha armadura a admitir que estou errado.");
	
	public String getSoldado() {
		String descricao = "SOLDADO\r\n"
				+ "A guerra esteve na sua vida desde que você se recorda.\r\n"
				+ "Você foi treinado desde jovem, estudou o uso das armas e\r\n"
				+ "armaduras, aprendeu técnicas básicas de sobrevivência,\r\n"
				+ "incluindo como permanecer vivo no campo de batalha.\r\n"
				+ "Você pode ter feito parte de uma armada nacional, ou\r\n"
				+ "uma companhia de mercenários, talvez até mesmo uma\r\n"
				+ "milícia local, que cresceu proeminentemente durante uma\r\n"
				+ "guerra recente.\r\n"
				+ "Quando você escolher esse antecedente, converse com\r\n"
				+ "seu Mestre para determinar de qual organização militar\r\n"
				+ "você fez parte, quão longe você progrediu na hierarquia e\r\n"
				+ "que tipos de experiência você teve na sua carreira militar?\r\n"
				+ "Foi um exército de guarda, uma patrulha de cidade ou a\r\n"
				+ "milícia de uma pequena vila? Ou talvez você tenha\r\n"
				+ "participado da defesa pessoal de um nobre, ou mercador,\r\n"
				+ "ou de um cartel de mercenários.\r\n"
				+ "Proficiência em Perícias: Atletismo, Intimidação\r\n"
				+ "Proficiência em Ferramentas: Um tipo de kit de jogo,\r\n"
				+ "veículo (terrestre)\r\n"
				+ "Equipamento: Uma insígnia de patente, um fetiche\r\n"
				+ "obtido de um inimigo caído (uma adaga, lâmina\r\n"
				+ "partida ou tira de estandarte), um conjunto de dados\r\n"
				+ "de osso ou baralho, um conjunto de roupas comuns e\r\n"
				+ "uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setSoldado()  {
		getFicha().setAntecedente("Soldado");
		List<String> profPericias = Arrays.asList("Atletismo", "Intimidação");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("Insígnia de patente", "Fetiche obtido de um inimigo caído", "Conjuto de dados de osso ou baralho", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoSoldado() {
		return tracoSoldado;
	}

	public List<String> getIdealSoldado() {
		return idealSoldado;
	}

	public List<String> getVinculoSoldado() {
		return vinculoSoldado;
	}

	public List<String> getDefeitoSoldado() {
		return defeitoSoldado;
	}
	
}
