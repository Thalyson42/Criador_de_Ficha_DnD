package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class HeroiDoPovo extends Classes{

	private List<String> tracoHeroi = Arrays.asList("Eu julgo as pessoas por suas a��es, n�o por suas palavras.",
			"Se algu�m est� em apuros, eu estou sempre pronto para ajudar.",
			"Quando eu fixo minha mente em algo, eu sigo esse caminho, n�o importa o que fique no caminho.",
			"Eu possuo um forte senso de justi�a e sempre tento encontrar a solu��o mais equilibrada para as discuss�es.",
			"Eu confio em minhas habilidades e farei o que for necess�rio para que os outros confiem tamb�m.",
			"Pensar � para os outros, eu prefiro agir.",
			"Eu abuso de palavras longas na tentativa de soar inteligente.",
			"Eu me entedio f�cil. Para onde devo ir para me encontrar com meu destino?");
	
	private List<String> idealHeroi = Arrays.asList("Respeito. As pessoas merecem ser tratadas com dignidade e respeito. (Bom)",
			"Justi�a. Ningu�m merece tratamento diferenciado perante a lei, muito menos estar acima dela. (Leal)",
			"Liberdade. N�o pode haver permiss�o para tiranos oprimirem o povo. (Ca�tico)",
			"For�a. Se eu ficar forte, eu posso pegar tudo o que eu quiser � o que eu desejar. (Mal)",
			"Sinceridade. N�o h� nada de bom em fingir ser algo que n�o sou. (Neutro)",
			"Destino. Nada, nem ningu�m, pode me manter longe do meu chamado. (Qualquer)");
	
	private List<String> vinculoHeroi = Arrays.asList("Eu tenho fam�lia, embora n�o fa�a a m�nima ideia de onde eles est�o, espero encontr�-los um dia.",
			"Eu trabalho a terra, eu amo a terra e eu vou defender a terra.",
			"Um nobre orgulhoso me deu uma bela surra, e eu vou ter minha vingan�a em qualquer valent�o que encontrar.",
			"Minhas ferramentas s�o s�mbolo de minha vida passada, eu as carregarei para nunca me esquecer de minhas origens.",
			"Eu devo proteger aqueles que n�o podem se defender.",
			"Gostaria que meu amor viesse comigo para seguir meu destino.");
	
	private List<String> defeitoHeroi = Arrays.asList("O tirano que comanda minha terra n�o vai parar at� ver meu cad�ver.",
			"Eu estou convencido sobre o significado do meu destino, e cego aos riscos e falhas.",
			"As pessoas que me conhecem desde crian�a sabem de um vergonhoso segredo meu, eu n�o poderei voltar para casa nunca.",
			"Eu tenho uma fraqueza pelos v�cios da cidade, especialmente a bebedeira.",
			"Secretamente, eu acredito que as coisas estariam melhores se algum tirano comandasse a regi�o.",
			"Eu tenho dificuldades em confiar em meus aliados.");
	
	public String getHeroiDoPovo() {
		String descricao = "HER�I DO POVO\r\n"
				+ "Voc� veio de uma parcela humilde da sociedade, mas est�\r\n"
				+ "destinado a muito mais. O povo de sua vila j� o reconhece\r\n"
				+ "como campe�o, e seu destino o conduz a batalhas contra\r\n"
				+ "tiranos e monstros que amea�am o povo aonde quer que\r\n"
				+ "voc� v�.\r\n"
				+ "Profici�ncia em Per�cias: Adestrar Animais,\r\n"
				+ "Sobreviv�ncia\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artes�o, ve�culos (terrestre)\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artes�o\r\n"
				+ "(� sua escolha), uma p�, um pote de ferro, um conjunto\r\n"
				+ "de roupas comuns e uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setHeroiDoPovo() {
		getFicha().setAntecedente("Her�i do povo");
		List<String> profPericias = Arrays.asList("Adestrar Animais", "Sobreviv�ncia");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
		getFicha().setProfi_ferramentas_peri("Ve�culos (terrestre)");
//		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("P�", "Pote de ferro", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoHeroi() {
		return tracoHeroi;
	}

	public List<String> getIdealHeroi() {
		return idealHeroi;
	}

	public List<String> getVinculoHeroi() {
		return vinculoHeroi;
	}

	public List<String> getDefeitoHeroi() {
		return defeitoHeroi;
	}
	
}
