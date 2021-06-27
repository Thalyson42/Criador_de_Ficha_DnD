package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Forateiro extends Classes{

	private List<String> tracoForasteiro = Arrays.asList("Eu fui guiado por uma sede de viagens que me levou a abandonas meu lar.",
			"Eu cuido dos meus amigos como se eles fossem filhotes recém-nascidos.\r\n",
			"Certa vez, eu corri quarenta quilômetros sem parar alertar meu clã da aproximação de uma horda orc. Eu faria de novo se fosse necessário.",
			"Eu tenho uma lição pra cada situação, aprendida observando a natureza.",
			"Eu não vejo lugar para o povo rico e educado. Dinheiro e modos não vão salvá-lo de um urso-coruja faminto.",
			"Estou sempre pegando coisas, distraidamente brincando com elas e, às vezes, quebrando-as.",
			"Eu me sinto muito mais confortável entre animais que entre pessoas.",
			"Eu fui, de fato, criado por lobos.");
	
	private List<String> idealForasteiro = Arrays.asList("Mudança. A vida é como as estações, em constante mudança, e nós devemos mudar com ela. (Caótico)",
			"Bem maior. É responsabilidade de todos trazer a maior felicidade para toda a tribo. (Bom)",
			"Honra. Se eu me desonrar, eu desonrarei todo o meu clã. (Leal)",
			"Força. O mais forte deve governar. (Mau)",
			"Natureza. O mundo natural é mais importante que todas as construções da civilização. (Neutro)",
			"Gloria. Eu devo adquirir gloria em batalha, para mim e para meu clã. (Qualquer)");
	
	private List<String> vinculoForasteiro = Arrays.asList("Minha família, clã ou tribo é a coisa mais importante na minha vida, mesmo quando eles estão longe.\r\n",
			"Uma ofensa a natureza intocada do meu lar é uma ofensa a mim.",
			"Eu trarei uma fúria terrível aos malfeitores que destruíram minha terra natal.",
			"Eu sou o último da minha tribo e cabe a mim garantir que seus nomes façam parte das lendas.",
			"Eu sofro de visões terríveis de um desastre vindouro, e farei qualquer coisa para impedi-lo.",
			"É meu dever prover filhos para sustentar minha tribo.");
	
	private List<String> defeitoForasteiro = Arrays.asList("Sou muito apaixonado por cerveja, vinho e outras bebidas.",
			"Não existe lugar para precaução em uma vida vivida ao máximo.",
			"Eu lembro de cada insulto que sofri e nutro um ressentimento silencioso contra qualquer um que já tenha me insultado.",
			"Eu tenho dificuldade em confiar em membros de outras raças, tribos ou sociedades.",
			"A violência é minha resposta para quase todos os obstáculos.",
			"Não espere que eu salve aqueles que não conseguem se virar sozinhos. É a lei da natureza que os fortes prosperem e os fracos pereçam.");
	
	
	public String getForasteiro() {
		String descricao = "FORASTEIRO\r\n"
				+ "Você cresceu em uma área selvagem, longe da civilização\r\n"
				+ "e dos confortos da cidade e tecnologia. Você testemunhou\r\n"
				+ "a migração de manadas maiores que florestas, sobreviveu\r\n"
				+ "à climas mais extremos que qualquer citadino poderia\r\n"
				+ "compreender e é adepto da solidão de ser a única criatura\r\n"
				+ "pensante em quilômetros, em qualquer direção. O\r\n"
				+ "isolamento está no seu sangue, quer você seja um\r\n"
				+ "nômade, um explorador, um recluso, um forrageador ou\r\n"
				+ "mesmo um saqueador. Mesmo em lugares que você não\r\n"
				+ "conheça as características especificas do terreno, você\r\n"
				+ "vai conseguir se virar."
				+ "Proficiência em Perícias: Atletismo, Sobrevivência\r\n"
				+ "Proficiência em Ferramentas: Um tipo de\r\n"
				+ "instrumento musical\r\n"
				+ "Idiomas: Um à sua escolha\r\n"
				+ "Equipamento: Um bordão, uma armadilha de caça, um\r\n"
				+ "fetiche de um animal que você matou, um conjunto de\r\n"
				+ "roupas de viajante e uma algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setForasteiro() {
		getFicha().setAntecedente("Forasteiro");
		List<String> profPericias = Arrays.asList("Atletismo", "Sobrevivência");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
		List<String> equipamentos = Arrays.asList("Bordão", "Armadilha de caça", "Fetiche de um animal que você matou", "Conjunto de roupas de viajante", "Algibeira 10po");
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
