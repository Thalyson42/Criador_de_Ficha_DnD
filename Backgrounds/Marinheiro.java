package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Marinheiro extends Classes{

	private List<String> tracoMarinheiro = Arrays.asList("Meus amigos sabem que podem contar comigo pro que der e vier.",
			"Eu trabalho duro para que possa me divertir muito quando o trabalho estiver pronto.",
			"Eu gosto de navegar para novos portos e fazer novas amizades acompanhado de uma jarra de cerveja.",
			"Eu modifico alguns fatos para o bem de uma boa história.",
			"Pra mim, uma briga de taverna é uma ótima forma de conhecer uma nova cidade.",
			"Eu nunca deixo passar uma aposta amigável.",
			"Meu vocabulário é tão sujo quanto o covil de um otyugh.",
			"Eu gosto de trabalhos bem feitos, especialmente se eu puder convencer alguém a fazê-los.");
	
	private List<String> idealMarinheiro = Arrays.asList("Respeito. A coisa que mantem um navio unido é o respeito mútuo entre o capitão e a tripulação. (Bem)",
			"Justiça. Todos nós fazemos o trabalho, portanto, todos partilhamos os espólios. (Leal)",
			"Liberdade. O mar é liberdade – a liberdade de ir aonde quiser. (Caótico)",
			"Domínio. Eu sou um predador e os outros navios no mar são minhas presas. (Mau)",
			"Povo. Eu sou apegado aos meus companheiros de tripulação, não a ideais. (Neutro)",
			"Aspiração. Algum dia eu serei dono do meu próprio navio e traçarei meu próprio destino. (Qualquer)");
	
	private List<String> vinculoMarinheiro = Arrays.asList("Eu sou leal ao meu capitão, primeiramente, o resto vem em segundo.",
			"O navio é o mais importante – tripulantes e capitães vem e vão.",
			"Eu sempre me lembrarei do meu primeiro navio.",
			"Em uma cidade portuária, eu tenho uma amante que quase me roubou do mar.",
			"Eu fui enganado na divisão dos espólios e eu quero o que me é devido.",
			"Cruéis piratas mataram meu capitão e companheiros de tripulação, saquearam nosso navio e me deixaram para morrer. A vingança será minha.");
	
	private List<String> defeitoMarinheiro = Arrays.asList("Eu sigo ordens, mesmo que eu ache que estão erradas.",
			"Eu direi qualquer coisa para evitar trabalho extra.",
			"Certa vez, alguém duvidou da minha coragem, eu nunca recuo, não importa o quão perigosa seja a situação.",
			"Quando começo a beber, é difícil pra mim parar.",
			"Eu não resisto a uma sacolinha de moedas dando sopa ou outras bugigangas que encontro.",
			"Meu orgulho provavelmente levará a minha destruição");
	
	public String getMarinheiro() {
		String descricao = "MARINHEIRO\r\n"
				+ "Você navegou em um navio pelo mar por anos. Nesse\r\n"
				+ "período, você enfrentou poderosas tormentas, monstros\r\n"
				+ "das profundezas e aqueles que queriam afundar o seu\r\n"
				+ "ganha-pão para as profundezas insondáveis. Seu primeiro\r\n"
				+ "amor é a distante linha do horizonte, mas chegou a hora\r\n"
				+ "de você por suas mãos em algo novo.\r\n"
				+ "Converse sobre a natureza do navio que você navegou\r\n"
				+ "anteriormente com seu Mestre. Era um navio mercante,\r\n"
				+ "uma embarcação naval, um navio de exploração ou um\r\n"
				+ "navio pirata? O quão famoso (ou infame) ele é? Ele era\r\n"
				+ "muito viajado? Ele continua navegando, ou está\r\n"
				+ "desaparecido e, provavelmente, perdido com seus\r\n"
				+ "tripulantes?\r\n"
				+ "Quais eram seus deveres a bordo – contramestre,\r\n"
				+ "capitão, navegador, cozinheiro ou outra posição? Quem\r\n"
				+ "eram o capitão e primeiro marinheiro? Você deixou o\r\n"
				+ "navio de bem com seus companheiros ou fugiu?\r\n"
				+ "Proficiência em Perícias: Atletismo, Percepção\r\n"
				+ "Proficiência em Ferramentas: Ferramentas de\r\n"
				+ "navegador, veículo (aquático)\r\n"
				+ "Equipamento: Uma malagueta (clava), 15 metros de\r\n"
				+ "corda de seda, uma amuleto da sorte como um pé de\r\n"
				+ "coelho ou uma pequena pedra com um furo no centro\r\n"
				+ "(ou você pode rolar uma bugiganga da tabela\r\n"
				+ "Bugigangas no capítulo 5), um conjunto de trajes\r\n"
				+ "comuns e uma algibeira contendo 10 po";
		return descricao;
	}
	
	public void setMarinheiro() {
		getFicha().setAntecedente("Marinheiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Percepção");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Ferramentas de navegador");
		getFicha().setProfi_ferramentas_peri("Veículos (aquático)");
		List<String> equipamentos = Arrays.asList("Malagueta (clava)", "15M de corda de seda", "Amuleto da sorte", "Conjunto de trajes comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoMarinheiro() {
		return tracoMarinheiro;
	}

	public List<String> getIdealMarinheiro() {
		return idealMarinheiro;
	}

	public List<String> getVinculoMarinheiro() {
		return vinculoMarinheiro;
	}

	public List<String> getDefeitoMarinheiro() {
		return defeitoMarinheiro;
	}
	
}
