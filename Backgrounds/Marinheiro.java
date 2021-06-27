package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Marinheiro extends Classes{

	private List<String> tracoMarinheiro = Arrays.asList("Meus amigos sabem que podem contar comigo pro que der e vier.",
			"Eu trabalho duro para que possa me divertir muito quando o trabalho estiver pronto.",
			"Eu gosto de navegar para novos portos e fazer novas amizades acompanhado de uma jarra de cerveja.",
			"Eu modifico alguns fatos para o bem de uma boa hist�ria.",
			"Pra mim, uma briga de taverna � uma �tima forma de conhecer uma nova cidade.",
			"Eu nunca deixo passar uma aposta amig�vel.",
			"Meu vocabul�rio � t�o sujo quanto o covil de um otyugh.",
			"Eu gosto de trabalhos bem feitos, especialmente se eu puder convencer algu�m a faz�-los.");
	
	private List<String> idealMarinheiro = Arrays.asList("Respeito. A coisa que mantem um navio unido � o respeito m�tuo entre o capit�o e a tripula��o. (Bem)",
			"Justi�a. Todos n�s fazemos o trabalho, portanto, todos partilhamos os esp�lios. (Leal)",
			"Liberdade. O mar � liberdade � a liberdade de ir aonde quiser. (Ca�tico)",
			"Dom�nio. Eu sou um predador e os outros navios no mar s�o minhas presas. (Mau)",
			"Povo. Eu sou apegado aos meus companheiros de tripula��o, n�o a ideais. (Neutro)",
			"Aspira��o. Algum dia eu serei dono do meu pr�prio navio e tra�arei meu pr�prio destino. (Qualquer)");
	
	private List<String> vinculoMarinheiro = Arrays.asList("Eu sou leal ao meu capit�o, primeiramente, o resto vem em segundo.",
			"O navio � o mais importante � tripulantes e capit�es vem e v�o.",
			"Eu sempre me lembrarei do meu primeiro navio.",
			"Em uma cidade portu�ria, eu tenho uma amante que quase me roubou do mar.",
			"Eu fui enganado na divis�o dos esp�lios e eu quero o que me � devido.",
			"Cru�is piratas mataram meu capit�o e companheiros de tripula��o, saquearam nosso navio e me deixaram para morrer. A vingan�a ser� minha.");
	
	private List<String> defeitoMarinheiro = Arrays.asList("Eu sigo ordens, mesmo que eu ache que est�o erradas.",
			"Eu direi qualquer coisa para evitar trabalho extra.",
			"Certa vez, algu�m duvidou da minha coragem, eu nunca recuo, n�o importa o qu�o perigosa seja a situa��o.",
			"Quando come�o a beber, � dif�cil pra mim parar.",
			"Eu n�o resisto a uma sacolinha de moedas dando sopa ou outras bugigangas que encontro.",
			"Meu orgulho provavelmente levar� a minha destrui��o");
	
	public String getMarinheiro() {
		String descricao = "MARINHEIRO\r\n"
				+ "Voc� navegou em um navio pelo mar por anos. Nesse\r\n"
				+ "per�odo, voc� enfrentou poderosas tormentas, monstros\r\n"
				+ "das profundezas e aqueles que queriam afundar o seu\r\n"
				+ "ganha-p�o para as profundezas insond�veis. Seu primeiro\r\n"
				+ "amor � a distante linha do horizonte, mas chegou a hora\r\n"
				+ "de voc� por suas m�os em algo novo.\r\n"
				+ "Converse sobre a natureza do navio que voc� navegou\r\n"
				+ "anteriormente com seu Mestre. Era um navio mercante,\r\n"
				+ "uma embarca��o naval, um navio de explora��o ou um\r\n"
				+ "navio pirata? O qu�o famoso (ou infame) ele �? Ele era\r\n"
				+ "muito viajado? Ele continua navegando, ou est�\r\n"
				+ "desaparecido e, provavelmente, perdido com seus\r\n"
				+ "tripulantes?\r\n"
				+ "Quais eram seus deveres a bordo � contramestre,\r\n"
				+ "capit�o, navegador, cozinheiro ou outra posi��o? Quem\r\n"
				+ "eram o capit�o e primeiro marinheiro? Voc� deixou o\r\n"
				+ "navio de bem com seus companheiros ou fugiu?\r\n"
				+ "Profici�ncia em Per�cias: Atletismo, Percep��o\r\n"
				+ "Profici�ncia em Ferramentas: Ferramentas de\r\n"
				+ "navegador, ve�culo (aqu�tico)\r\n"
				+ "Equipamento: Uma malagueta (clava), 15 metros de\r\n"
				+ "corda de seda, uma amuleto da sorte como um p� de\r\n"
				+ "coelho ou uma pequena pedra com um furo no centro\r\n"
				+ "(ou voc� pode rolar uma bugiganga da tabela\r\n"
				+ "Bugigangas no cap�tulo 5), um conjunto de trajes\r\n"
				+ "comuns e uma algibeira contendo 10 po";
		return descricao;
	}
	
	public void setMarinheiro() {
		getFicha().setAntecedente("Marinheiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Percep��o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Ferramentas de navegador");
		getFicha().setProfi_ferramentas_peri("Ve�culos (aqu�tico)");
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
