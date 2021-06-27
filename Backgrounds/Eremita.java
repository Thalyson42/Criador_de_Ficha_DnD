package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Eremita extends Classes{

	private List<String> tracoEremita = Arrays.asList("Eu fiquei tanto tempo isolado que raramente falo, preferindo gestos e grunhidos ocasionais.",
			"Eu sou absurdamente sereno, mesmo em face do desespero.",
			"O líder da minha comunidade tem algo sábio a dizer sobre cada tópico, eu estou ansioso para partilhar dessa sabedoria.",
			"Eu sinto uma empatia tremenda por todos que sofrem.",
			"Eu estou alheio a etiqueta e expectativas sociais.",
			"Eu relaciono tudo que acontece comigo a um grande plano cósmico.",
			"Eu, muitas vezes, me perco em meus pensamentos e contemplação me tornando alheio ao meu redor.",
			"Eu estou trabalhando em uma grande teoria filosófica e adoro partilhar minhas ideias.");
	
	private List<String> idealEremita = Arrays.asList("Bem Maior. Meus dons devem ser partilhados com todos, não usados em benefício próprio (Bom)",
			"Lógica. Emoções não podem obscurecer meus sentidos do que é certo e verdade, ou meu pensamento lógico. (Leal)",
			"Pensamento Livre. Questionamentos e curiosidade são os pilares do progresso. (Caótico)",
			"Poder. Isolamento e contemplação são caminhos para poderes místicos e mágicos. (Mau)",
			"Viva e Deixe Viver. Se intrometer nos assuntos dos outros só traz problemas. (Neutro)",
			"Autoconhecimento. Se você conhece a si mesmo, não a mais nada para saber. (Qualquer)");
	
	private List<String> vinculoEremita = Arrays.asList("Nada é mais importante que os outros membros do eremitério, ordem ou associação.",
			"Eu entrei em reclusão para me esconder daqueles que ainda devem estar me caçando. Algum dia irei confrontálos.",
			"Eu ainda busco o esclarecimento que eu perseguia durante meu isolamento e continuo a me iludir.",
			"Eu entrei em reclusão porque eu amava alguém que eu não podia ter.",
			"Se minha descoberta vir à tona, ela poderá trazer destruição ao mundo.",
			"Meu isolamento me deu grande discernimento sobre um grande mal que apenas eu posso destruir.");
	
	private List<String> defeitoEremita = Arrays.asList("Agora que voltei ao mundo, eu desfruto de seus prazeres um pouco demais.",
			"Eu escondo nas sombras, pensamentos sanguinários que meu isolamento e meditação não conseguiram apagar.",
			"Eu sou dogmático em meus pensamentos e filosofia.",
			"Eu deixo meu desejo de vencer discussões ofuscar amizades e harmonia.",
			"Eu me arrisco muito para descobrir um pouco de conhecimento perdido.\r\n",
			"Eu gosto de guardar segredos e não os partilho com ninguém.");
	
	public String getEremita() {
		String descricao = "EREMITA\r\n"
				+ "Você viveu em reclusão – ou em uma comunidade isolada\r\n"
				+ "como um monastério ou completamente sozinho – por um\r\n"
				+ "período importante da sua vida. No tempo em que passou\r\n"
				+ "longe do clamor da sociedade, você encontrou quietude,\r\n"
				+ "solidão e, talvez, algumas das respostas que procurava.\r\n"
				+ "Proficiência em Perícias: Medicina, Religião\r\n"
				+ "Proficiência em Ferramentas: Kit de herbalismo\r\n"
				+ "Idiomas: Um à sua escolha\r\n"
				+ "Equipamento: Um estojo de pergaminho cheio de notas\r\n"
				+ "dos seus estudos e orações, um cobertor de inverno,\r\n"
				+ "um conjunto de roupas comuns, um kit de herbalismo\r\n"
				+ "e 5 po.\r\n";
		return descricao;
	}
	
	public void setEremita() {
		getFicha().setAntecedente("Eremita");
		List<String> profPericias = Arrays.asList("Medicina", "Religião");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de herbalismo");
		List<String> equipamentos = Arrays.asList("Estojo de pergaminho cheio de notas dos seus estudos e orações", "Cobertor de inverno", "Conjunto de roupas comuns", "Kit de herbalismo", "5po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoEremita() {
		return tracoEremita;
	}

	public List<String> getIdealEremita() {
		return idealEremita;
	}

	public List<String> getVinculoEremita() {
		return vinculoEremita;
	}

	public List<String> getDefeitoEremita() {
		return defeitoEremita;
	}
	
}
