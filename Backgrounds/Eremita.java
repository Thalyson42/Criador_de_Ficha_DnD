package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Eremita extends Classes{

	private List<String> tracoEremita = Arrays.asList("Eu fiquei tanto tempo isolado que raramente falo, preferindo gestos e grunhidos ocasionais.",
			"Eu sou absurdamente sereno, mesmo em face do desespero.",
			"O l�der da minha comunidade tem algo s�bio a dizer sobre cada t�pico, eu estou ansioso para partilhar dessa sabedoria.",
			"Eu sinto uma empatia tremenda por todos que sofrem.",
			"Eu estou alheio a etiqueta e expectativas sociais.",
			"Eu relaciono tudo que acontece comigo a um grande plano c�smico.",
			"Eu, muitas vezes, me perco em meus pensamentos e contempla��o me tornando alheio ao meu redor.",
			"Eu estou trabalhando em uma grande teoria filos�fica e adoro partilhar minhas ideias.");
	
	private List<String> idealEremita = Arrays.asList("Bem Maior. Meus dons devem ser partilhados com todos, n�o usados em benef�cio pr�prio (Bom)",
			"L�gica. Emo��es n�o podem obscurecer meus sentidos do que � certo e verdade, ou meu pensamento l�gico. (Leal)",
			"Pensamento Livre. Questionamentos e curiosidade s�o os pilares do progresso. (Ca�tico)",
			"Poder. Isolamento e contempla��o s�o caminhos para poderes m�sticos e m�gicos. (Mau)",
			"Viva e Deixe Viver. Se intrometer nos assuntos dos outros s� traz problemas. (Neutro)",
			"Autoconhecimento. Se voc� conhece a si mesmo, n�o a mais nada para saber. (Qualquer)");
	
	private List<String> vinculoEremita = Arrays.asList("Nada � mais importante que os outros membros do eremit�rio, ordem ou associa��o.",
			"Eu entrei em reclus�o para me esconder daqueles que ainda devem estar me ca�ando. Algum dia irei confront�los.",
			"Eu ainda busco o esclarecimento que eu perseguia durante meu isolamento e continuo a me iludir.",
			"Eu entrei em reclus�o porque eu amava algu�m que eu n�o podia ter.",
			"Se minha descoberta vir � tona, ela poder� trazer destrui��o ao mundo.",
			"Meu isolamento me deu grande discernimento sobre um grande mal que apenas eu posso destruir.");
	
	private List<String> defeitoEremita = Arrays.asList("Agora que voltei ao mundo, eu desfruto de seus prazeres um pouco demais.",
			"Eu escondo nas sombras, pensamentos sanguin�rios que meu isolamento e medita��o n�o conseguiram apagar.",
			"Eu sou dogm�tico em meus pensamentos e filosofia.",
			"Eu deixo meu desejo de vencer discuss�es ofuscar amizades e harmonia.",
			"Eu me arrisco muito para descobrir um pouco de conhecimento perdido.\r\n",
			"Eu gosto de guardar segredos e n�o os partilho com ningu�m.");
	
	public String getEremita() {
		String descricao = "EREMITA\r\n"
				+ "Voc� viveu em reclus�o � ou em uma comunidade isolada\r\n"
				+ "como um monast�rio ou completamente sozinho � por um\r\n"
				+ "per�odo importante da sua vida. No tempo em que passou\r\n"
				+ "longe do clamor da sociedade, voc� encontrou quietude,\r\n"
				+ "solid�o e, talvez, algumas das respostas que procurava.\r\n"
				+ "Profici�ncia em Per�cias: Medicina, Religi�o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de herbalismo\r\n"
				+ "Idiomas: Um � sua escolha\r\n"
				+ "Equipamento: Um estojo de pergaminho cheio de notas\r\n"
				+ "dos seus estudos e ora��es, um cobertor de inverno,\r\n"
				+ "um conjunto de roupas comuns, um kit de herbalismo\r\n"
				+ "e 5 po.\r\n";
		return descricao;
	}
	
	public void setEremita() {
		getFicha().setAntecedente("Eremita");
		List<String> profPericias = Arrays.asList("Medicina", "Religi�o");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de herbalismo");
		List<String> equipamentos = Arrays.asList("Estojo de pergaminho cheio de notas dos seus estudos e ora��es", "Cobertor de inverno", "Conjunto de roupas comuns", "Kit de herbalismo", "5po");
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
