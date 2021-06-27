package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Soldado extends Classes{

	private List<String> tracoSoldado = Arrays.asList("Eu sou sempre polido e respeitoso.",
			"Eu sou assombrado pelas mem�rias da guerra. N�o consigo tirar aquelas imagens da minha cabe�a.",
			"Eu perdi muitos amigos, e sou muito devagar para fazer novos.",
			"Eu tenho muitas hist�rias de inspira��o e cautela da �poca de minha experi�ncia militar que s�o relevantes em todas as situa��es de combate.",
			"Eu n�o consigo encarar um c�o infernal sem vacilar",
			"Eu gosto de ser forte e de quebrar coisas.",
			"Eu tenho um senso de humor grosseiro.",
			"Eu enfrento os problemas de frente. Uma solu��o direta � o melhor caminho para o sucesso.");
	
	private List<String> idealSoldado = Arrays.asList("Bem Maior. Nosso destino � dar nossas vidas em defesa de terceiros. (Bom)",
			"Responsabilidade. Eu fa�o o que tenho que fazer e obede�o apenas a autoridade. (Leal)",
			"Independ�ncia. Quando pessoas seguem ordens cegas elas apoiam um tipo de tirania. (Ca�tico)",
			"For�a. A vida � como uma guerra, o mais forte vence. (Mau)",
			"Viva e Deixa Viver. Ideais n�o valem a pena se voc� matar, ou for � guerra por eles. (Neutro)",
			"Aspira��o. Minha cidade, na��o ou meu povo, s�o tudo o que importa para mim. (Qualquer)");
	
	private List<String> vinculoSoldado = Arrays.asList("Eu ainda daria a minha vida pelas pessoas com quem servi.\r\n",
			"Algu�m salvou minha vida no campo de batalha. Desde aquele dia eu nunca deixo nenhum amigo para tr�s.",
			"Minha honra � minha vida.",
			"Eu nunca esquecerei a destruidora derrota que minha companhia sofreu ou os inimigos que a causaram.",
			"Aqueles que lutam ao meu lado s�o aqueles por quem vale a pena morrer.",
			"Eu luto por aqueles que n�o podem lutar por si mesmos.");
	
	private List<String> defeitoSoldado = Arrays.asList("O inimigo monstruoso que enfrentei em uma batalha ainda me deixa tremendo de medo.",
			"Eu tenho pouco respeito por aqueles que n�o se provam bons combatentes.",
			"Eu cometi um terr�vel erro em batalha, o que custou muitas vidas � eu farei de tudo para manter esse erro em segredo.",
			"Meu �dio por meus inimigos � cego e irracional.",
			"Eu obede�o a lei, mesmo se a lei trouxer a ang�stia.",
			"Eu prefiro comer minha armadura a admitir que estou errado.");
	
	public String getSoldado() {
		String descricao = "SOLDADO\r\n"
				+ "A guerra esteve na sua vida desde que voc� se recorda.\r\n"
				+ "Voc� foi treinado desde jovem, estudou o uso das armas e\r\n"
				+ "armaduras, aprendeu t�cnicas b�sicas de sobreviv�ncia,\r\n"
				+ "incluindo como permanecer vivo no campo de batalha.\r\n"
				+ "Voc� pode ter feito parte de uma armada nacional, ou\r\n"
				+ "uma companhia de mercen�rios, talvez at� mesmo uma\r\n"
				+ "mil�cia local, que cresceu proeminentemente durante uma\r\n"
				+ "guerra recente.\r\n"
				+ "Quando voc� escolher esse antecedente, converse com\r\n"
				+ "seu Mestre para determinar de qual organiza��o militar\r\n"
				+ "voc� fez parte, qu�o longe voc� progrediu na hierarquia e\r\n"
				+ "que tipos de experi�ncia voc� teve na sua carreira militar?\r\n"
				+ "Foi um ex�rcito de guarda, uma patrulha de cidade ou a\r\n"
				+ "mil�cia de uma pequena vila? Ou talvez voc� tenha\r\n"
				+ "participado da defesa pessoal de um nobre, ou mercador,\r\n"
				+ "ou de um cartel de mercen�rios.\r\n"
				+ "Profici�ncia em Per�cias: Atletismo, Intimida��o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de kit de jogo,\r\n"
				+ "ve�culo (terrestre)\r\n"
				+ "Equipamento: Uma ins�gnia de patente, um fetiche\r\n"
				+ "obtido de um inimigo ca�do (uma adaga, l�mina\r\n"
				+ "partida ou tira de estandarte), um conjunto de dados\r\n"
				+ "de osso ou baralho, um conjunto de roupas comuns e\r\n"
				+ "uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setSoldado()  {
		getFicha().setAntecedente("Soldado");
		List<String> profPericias = Arrays.asList("Atletismo", "Intimida��o");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("Ins�gnia de patente", "Fetiche obtido de um inimigo ca�do", "Conjuto de dados de osso ou baralho", "Conjunto de roupas comuns", "Algibeira 10po");
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
