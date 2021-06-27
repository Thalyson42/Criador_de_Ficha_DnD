package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class HeroiDoPovo extends Classes{

	private List<String> tracoHeroi = Arrays.asList("Eu julgo as pessoas por suas ações, não por suas palavras.",
			"Se alguém está em apuros, eu estou sempre pronto para ajudar.",
			"Quando eu fixo minha mente em algo, eu sigo esse caminho, não importa o que fique no caminho.",
			"Eu possuo um forte senso de justiça e sempre tento encontrar a solução mais equilibrada para as discussões.",
			"Eu confio em minhas habilidades e farei o que for necessário para que os outros confiem também.",
			"Pensar é para os outros, eu prefiro agir.",
			"Eu abuso de palavras longas na tentativa de soar inteligente.",
			"Eu me entedio fácil. Para onde devo ir para me encontrar com meu destino?");
	
	private List<String> idealHeroi = Arrays.asList("Respeito. As pessoas merecem ser tratadas com dignidade e respeito. (Bom)",
			"Justiça. Ninguém merece tratamento diferenciado perante a lei, muito menos estar acima dela. (Leal)",
			"Liberdade. Não pode haver permissão para tiranos oprimirem o povo. (Caótico)",
			"Força. Se eu ficar forte, eu posso pegar tudo o que eu quiser – o que eu desejar. (Mal)",
			"Sinceridade. Não há nada de bom em fingir ser algo que não sou. (Neutro)",
			"Destino. Nada, nem ninguém, pode me manter longe do meu chamado. (Qualquer)");
	
	private List<String> vinculoHeroi = Arrays.asList("Eu tenho família, embora não faça a mínima ideia de onde eles estão, espero encontrá-los um dia.",
			"Eu trabalho a terra, eu amo a terra e eu vou defender a terra.",
			"Um nobre orgulhoso me deu uma bela surra, e eu vou ter minha vingança em qualquer valentão que encontrar.",
			"Minhas ferramentas são símbolo de minha vida passada, eu as carregarei para nunca me esquecer de minhas origens.",
			"Eu devo proteger aqueles que não podem se defender.",
			"Gostaria que meu amor viesse comigo para seguir meu destino.");
	
	private List<String> defeitoHeroi = Arrays.asList("O tirano que comanda minha terra não vai parar até ver meu cadáver.",
			"Eu estou convencido sobre o significado do meu destino, e cego aos riscos e falhas.",
			"As pessoas que me conhecem desde criança sabem de um vergonhoso segredo meu, eu não poderei voltar para casa nunca.",
			"Eu tenho uma fraqueza pelos vícios da cidade, especialmente a bebedeira.",
			"Secretamente, eu acredito que as coisas estariam melhores se algum tirano comandasse a região.",
			"Eu tenho dificuldades em confiar em meus aliados.");
	
	public String getHeroiDoPovo() {
		String descricao = "HERÓI DO POVO\r\n"
				+ "Você veio de uma parcela humilde da sociedade, mas está\r\n"
				+ "destinado a muito mais. O povo de sua vila já o reconhece\r\n"
				+ "como campeão, e seu destino o conduz a batalhas contra\r\n"
				+ "tiranos e monstros que ameaçam o povo aonde quer que\r\n"
				+ "você vá.\r\n"
				+ "Proficiência em Perícias: Adestrar Animais,\r\n"
				+ "Sobrevivência\r\n"
				+ "Proficiência em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artesão, veículos (terrestre)\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artesão\r\n"
				+ "(à sua escolha), uma pá, um pote de ferro, um conjunto\r\n"
				+ "de roupas comuns e uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setHeroiDoPovo() {
		getFicha().setAntecedente("Herói do povo");
		List<String> profPericias = Arrays.asList("Adestrar Animais", "Sobrevivência");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
		getFicha().setProfi_ferramentas_peri("Veículos (terrestre)");
//		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("Pá", "Pote de ferro", "Conjunto de roupas comuns", "Algibeira 10po");
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
