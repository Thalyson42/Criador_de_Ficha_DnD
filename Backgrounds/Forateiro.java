package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Forateiro extends Classes{

	private List<String> tracoForasteiro = Arrays.asList("Eu fui guiado por uma sede de viagens que me levou a abandonas meu lar.",
			"Eu cuido dos meus amigos como se eles fossem filhotes rec�m-nascidos.\r\n",
			"Certa vez, eu corri quarenta quil�metros sem parar alertar meu cl� da aproxima��o de uma horda orc. Eu faria de novo se fosse necess�rio.",
			"Eu tenho uma li��o pra cada situa��o, aprendida observando a natureza.",
			"Eu n�o vejo lugar para o povo rico e educado. Dinheiro e modos n�o v�o salv�-lo de um urso-coruja faminto.",
			"Estou sempre pegando coisas, distraidamente brincando com elas e, �s vezes, quebrando-as.",
			"Eu me sinto muito mais confort�vel entre animais que entre pessoas.",
			"Eu fui, de fato, criado por lobos.");
	
	private List<String> idealForasteiro = Arrays.asList("Mudan�a. A vida � como as esta��es, em constante mudan�a, e n�s devemos mudar com ela. (Ca�tico)",
			"Bem maior. � responsabilidade de todos trazer a maior felicidade para toda a tribo. (Bom)",
			"Honra. Se eu me desonrar, eu desonrarei todo o meu cl�. (Leal)",
			"For�a. O mais forte deve governar. (Mau)",
			"Natureza. O mundo natural � mais importante que todas as constru��es da civiliza��o. (Neutro)",
			"Gloria. Eu devo adquirir gloria em batalha, para mim e para meu cl�. (Qualquer)");
	
	private List<String> vinculoForasteiro = Arrays.asList("Minha fam�lia, cl� ou tribo � a coisa mais importante na minha vida, mesmo quando eles est�o longe.\r\n",
			"Uma ofensa a natureza intocada do meu lar � uma ofensa a mim.",
			"Eu trarei uma f�ria terr�vel aos malfeitores que destru�ram minha terra natal.",
			"Eu sou o �ltimo da minha tribo e cabe a mim garantir que seus nomes fa�am parte das lendas.",
			"Eu sofro de vis�es terr�veis de um desastre vindouro, e farei qualquer coisa para impedi-lo.",
			"� meu dever prover filhos para sustentar minha tribo.");
	
	private List<String> defeitoForasteiro = Arrays.asList("Sou muito apaixonado por cerveja, vinho e outras bebidas.",
			"N�o existe lugar para precau��o em uma vida vivida ao m�ximo.",
			"Eu lembro de cada insulto que sofri e nutro um ressentimento silencioso contra qualquer um que j� tenha me insultado.",
			"Eu tenho dificuldade em confiar em membros de outras ra�as, tribos ou sociedades.",
			"A viol�ncia � minha resposta para quase todos os obst�culos.",
			"N�o espere que eu salve aqueles que n�o conseguem se virar sozinhos. � a lei da natureza que os fortes prosperem e os fracos pere�am.");
	
	
	public String getForasteiro() {
		String descricao = "FORASTEIRO\r\n"
				+ "Voc� cresceu em uma �rea selvagem, longe da civiliza��o\r\n"
				+ "e dos confortos da cidade e tecnologia. Voc� testemunhou\r\n"
				+ "a migra��o de manadas maiores que florestas, sobreviveu\r\n"
				+ "� climas mais extremos que qualquer citadino poderia\r\n"
				+ "compreender e � adepto da solid�o de ser a �nica criatura\r\n"
				+ "pensante em quil�metros, em qualquer dire��o. O\r\n"
				+ "isolamento est� no seu sangue, quer voc� seja um\r\n"
				+ "n�made, um explorador, um recluso, um forrageador ou\r\n"
				+ "mesmo um saqueador. Mesmo em lugares que voc� n�o\r\n"
				+ "conhe�a as caracter�sticas especificas do terreno, voc�\r\n"
				+ "vai conseguir se virar."
				+ "Profici�ncia em Per�cias: Atletismo, Sobreviv�ncia\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de\r\n"
				+ "instrumento musical\r\n"
				+ "Idiomas: Um � sua escolha\r\n"
				+ "Equipamento: Um bord�o, uma armadilha de ca�a, um\r\n"
				+ "fetiche de um animal que voc� matou, um conjunto de\r\n"
				+ "roupas de viajante e uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setForasteiro() {
		getFicha().setAntecedente("Forasteiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Sobreviv�ncia");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
		List<String> equipamentos = Arrays.asList("Bord�o", "Armadilha de ca�a", "Fetiche de um animal que voc� matou", "Conjunto de roupas de viajante", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoForasteiro() {
		return tracoForasteiro;
	}

	public List<String> getIdealForasteiro() {
		return idealForasteiro;
	}

	public List<String> getVinculoForasteiro() {
		return vinculoForasteiro;
	}

	public List<String> getDefeitoForasteiro() {
		return defeitoForasteiro;
	}
	
}
