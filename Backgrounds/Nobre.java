package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Nobre extends Classes{

	private List<String> tracoNobre = Arrays.asList("Minha bajula��o eloquente faz com que todos com quem eu converse se sintam a pessoa mais maravilhosa e importante do mundo.",
			"As pessoas comuns me amam por minha bondade e generosidade.",
			"Ningu�m pode duvidar, olhando para o meu porte real, que estou acima das massas plebeias.",
			"Eu tenho grande cuidado de sempre estar no meu melhor e seguir as �ltimas modas.",
			"Eu n�o gosto de sujar minhas m�os, e eu n�o vou ser pego em acomoda��es inadequadas.",
			"Apesar da minha origem nobre, eu n�o estou acima dos outros. O sangue � um s�.",
			"Meu apoio, uma vez perdido, n�o volta.",
			"Se voc� me ferir, eu irei esmag�-lo, arruinar seu nome, e salgar seus campos.");
	
	private List<String> idealNobre = Arrays.asList("Respeito. O respeito a mim � devido por causa da minha posi��o, mas todas as pessoas, independentemente da posi��o merecem ser tratados com dignidade. (Bom)",
			"Responsabilidade. � o meu dever respeitar a autoridade daqueles acima de mim, assim como aqueles abaixo de mim devem me respeitar. (Leal)",
			"Independ�ncia. Devo provar que posso me cuidar sem os mimos da minha fam�lia. (Ca�tico)",
			"Poder. Se eu puder alcan�ar mais poder, ningu�m vai me dizer o que fazer. (Mau)",
			"Fam�lia. O sangue corre mais grosso que a �gua. (Qualquer)",
			"Obriga��o Nobre. � o meu dever proteger e cuidar das pessoas abaixo de mim. (Bom)");
	
	private List<String> vinculoNobre = Arrays.asList("Eu vou encarar qualquer desafio para ganhar a aprova��o da minha fam�lia.",
			"A alian�a da minha casa com outra fam�lia nobre deve ser mantida a todo custo.",
			"Nada � mais importante do que os outros membros da minha fam�lia.",
			"Eu sou apaixonado pela herdeira de uma fam�lia que a minha fam�lia despreza.",
			"Minha lealdade ao meu soberano � inabal�vel.",
			"As pessoas comuns devem me ver como um her�i do povo");
	
	private List<String> defeitoNobre = Arrays.asList("Eu secretamente acredito que todos est�o abaixo de mim.",
			"Eu escondo um segredo verdadeiramente escandaloso que poderia arruinar minha fam�lia para sempre.",
			"Muitas vezes eu ou�o insultos e amea�as veladas em cada palavra dirigida a mim, e me irrito muito r�pido.",
			"Eu tenho um desejo insaci�vel por prazeres carnais.",
			"Na verdade, o mundo gira ao meu redor.",
			"Pelas minhas palavras e a��es, muitas vezes, envergonho minha fam�lia.");
	
	public String getNobre() {
		String descricao = "NOBRE\r\n"
				+ "Voc� entende de riqueza, poder e privil�gios. Voc� carrega\r\n"
				+ "um t�tulo de nobreza, sua fam�lia possui terras, coleta\r\n"
				+ "impostos e exerce uma influ�ncia pol�tica significativa.\r\n"
				+ "Voc� pode ser um aristocrata mimado pouco familiarizado\r\n"
				+ "com o trabalho ou com o desconforto, um ex-comerciante\r\n"
				+ "elevado � nobreza ou um malandro deserdado com um\r\n"
				+ "sentido desproporcional de direitos. Ou pode ser um dono\r\n"
				+ "de terra honesto e trabalhador que se preocupa com as\r\n"
				+ "pessoas que vivem e trabalham em sua terra, sutilmente\r\n"
				+ "ciente da sua responsabilidade para com eles.\r\n"
				+ "Converse com seu Mestre para chegar a um t�tulo\r\n"
				+ "adequado e determinar a quantidade de autoridade esse\r\n"
				+ "t�tulo carrega. Um t�tulo de nobreza n�o fica com voc� � �\r\n"
				+ "conectado a uma fam�lia inteira, e qualquer t�tulo que\r\n"
				+ "voc� possuir passar� para seus filhos. Voc� n�o precisa\r\n"
				+ "determinar seu t�tulo de nobreza sozinho, voc� tamb�m\r\n"
				+ "deve conversar com seu Mestre para descrever sua\r\n"
				+ "fam�lia e a influ�ncia dela sobre voc�.\r\n"
				+ "Sua fam�lia � antiga e estabelecida ou s� recentemente\r\n"
				+ "voc� foi agraciado com seu t�tulo? Qual a influ�ncia que\r\n"
				+ "sua fam�lia exerce e sobre qual �rea? Que tipo de\r\n"
				+ "reputa��o sua fam�lia tem entre os outros aristocratas da\r\n"
				+ "regi�o? Como as pessoas comuns consideram sua fam�lia?\r\n"
				+ "Qual � sua posi��o na fam�lia? Um herdeiro ou chefe\r\n"
				+ "da fam�lia? Voc� j� herdou o t�tulo? Como voc� se sente\r\n"
				+ "sobre essa responsabilidade? Voc� est� t�o abaixo da\r\n"
				+ "linha de heran�a que ningu�m se importa com o que voc�\r\n"
				+ "faz, contanto que n�o envergonhe a fam�lia? Como � que o\r\n"
				+ "chefe da fam�lia se sente sobre a sua carreira de\r\n"
				+ "aventuras? Voc� est� de bem com a fam�lia ou anda\r\n"
				+ "afastado dela?\r\n"
				+ "Sua fam�lia tem um bras�o de armas? Uma ins�gnia\r\n"
				+ "que voc� pode usar em um anel de sinete? Cores\r\n"
				+ "espec�ficas que voc� usa o tempo todo? Um animal que\r\n"
				+ "voc� considera como um s�mbolo de sua linhagem ou um\r\n"
				+ "membro espiritual da fam�lia?\r\n"
				+ "Esses detalhes ajudam a estabelecer sua fam�lia e seu\r\n"
				+ "t�tulo como caracter�sticas do mundo de campanha.\r\n"
				+ "Profici�ncia em Per�cias: Hist�ria, Persuas�o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de kit de jogos\r\n"
				+ "Idiomas: Um � sua escolha\r\n"
				+ "Equipamento: Um conjunto de trajes finos, um anel de\r\n"
				+ "sinete, um pergaminho de linhagem e uma algibeira\r\n"
				+ "contendo 25 po.\r\n";
		
		return descricao;
	}
	
	public void setNobre() {
		getFicha().setAntecedente("Nobre");
		List<String> profPericias = Arrays.asList("Hist�ria", "Persuas�o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de jogos");
		List<String> equipamentos = Arrays.asList("Conjunto de trajes finos", "Anel de sinete", "Pergaminho de linhagem", "Algibeira 25po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoNobre() {
		return tracoNobre;
	}

	public List<String> getIdealNobre() {
		return idealNobre;
	}

	public List<String> getVinculoNobre() {
		return vinculoNobre;
	}

	public List<String> getDefeitoNobre() {
		return defeitoNobre;
	}
	
}
