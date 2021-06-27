package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Acolito extends Classes{

	private List<String> tracoAcolito = Arrays.asList("Eu idolatro um herói particular da minha fé, e constantemente me refiro a seus feitos e exemplos.",
			"Eu consigo encontrar semelhanças mesmo entre os inimigos mais violentos, com empatia e sempre trabalhando pela paz.",
			"Eu vejo presságio em cada evento e ação. Os deuses estão falando conosco, nós apenas temos de ouvi-los.",
			"Nada pode abalar minha atitude otimista.",
			"Eu cito (corretamente ou não) textos sagrados e provérbios em quase qualquer situação.",
			"Eu sou tolerante (ou intolerante) a qualquer outra fé, e respeito (ou condeno) a adoração a outros deuses",
			"Eu aprecio comida requintada, bebidas e a elite entre o alto escalão de meu templo. Uma vida dura me irrita.",
			"Eu passei tanto tempo no templo que possuo pouca prática em lidar com as pessoas mundo a fora.");

	private List<String> idealAcolito = Arrays.asList("Tradição. As tradições de adoração e sacrifício devem ser preservadas e perpetradas. (Leal)",
			"Caridade. Eu sempre tento ajudar aqueles em necessidade, não importando o custo pessoal. (Bom)",
			"Mudança. Nós devemos ajudar a conduzir as mudanças que os deuses estão constantemente trabalhando para o mundo. (Caótico)",
			"Poder. Eu espero que um dia eu consiga chegar ao topo na hierarquia da minha religião. (Leal)",
			"Fé. Eu acredito que minha divindade guia minhas ações. Eu tenho fé que, se eu trabalhar duro, coisas boas acontecerão. (Leal)",
			"Aspiração. Eu busco ser digno de graça do meu deus ao corresponder minhas ações aos seus ensinamentos. (Qualquer)");

	private List<String> vinculoAcolito = Arrays.asList("Eu morreria para recuperar um relíquia ancestral de minha fé, perdida há muito tempo.",
			"Eu ainda terei minha vingança contra o trmpo corrupto que me acusou de heresia.",
			"Eu devo minha vida ao sacerdote que me acolheu quando meus pais morreram.",
			"Tudo o que faço, faço pelo povo.",
			"Eu farei qualquer coisa para proteger o templo que sirvo.",
			"Eu busco guardar um texto sagrado que meus inimigos dizem ser herético e tentam destruí-lo.");
	
	private List<String> defeitoAcolito = Arrays.asList("Eu julgo os outros severamente, e a mim mesmo mais ainda.",
			"Eu deposito muita confiança naqueles que detêm o poder na hierarquia de meu templo.",
			"Minha devoção muitas vezes me cega perante aqueles que professam a fé do meu deus.",
			"Meu pensamento é inflexível.",
			"Eu suspeito de estranhos e sempre espero o pior deles.",
			"Depois de escolher um objetivo, eu fico obcecado em cumpri-lo, até mesmo em detrimento de qualquer outra coisa em minha vida.");

	
	public String getacolitoDescricao() {
		String descricao ="ACÓLITO\r\n\n"
				+ "Você viveu a serviço de um templo de algum deus\r\n"
				+ "especifico ou de um panteão de deuses. Você age como um\r\n"
				+ "intermediário entre o reino divino e o reino dos mortais,\r\n"
				+ "realizando rituais e ofertando sacrifícios para conduzir\r\n"
				+ "cada vez mais pessoas a adorarem a divindade. Você não\r\n"
				+ "é necessariamente um clérigo – realizar ritos sagrados\r\n"
				+ "não é a mesma coisa que canalizar poder divino.\r\n"
				+ "Escolha um deus, um panteão de deuses ou outro ser\r\n"
				+ "quase divino entre aqueles descritos no apêndice B ou\r\n"
				+ "outro especificado pelo seu Mestre para detalhar a\r\n"
				+ "natureza do seu serviço religioso. Você foi um serviçal\r\n"
				+ "menor no templo, criado desde a infância para auxiliar os\r\n"
				+ "sacerdotes em ritos sagrados? Ou você foi um alto\r\n"
				+ "sacerdote que repentinamente sentiu o chamado para\r\n"
				+ "servir seu deus de uma maneira diferente? Talvez você foi\r\n"
				+ "o líder de um pequeno culto não associado a templo\r\n"
				+ "algum, ou mesmo uma seita secreta que servia a uma\r\n"
				+ "entidade demoníaca que agora você nega.\r\n"
				+ "Proficiência em Perícias: Intuição, Religião\r\n"
				+ "Idiomas: Dois à sua escolha\r\n"
				+ "Equipamento: Um símbolo sagrado (um presente dado\r\n"
				+ "quando você entrou no templo), um livro de preces ou\r\n"
				+ "uma conta de orações, 5 varetas de incenso,\r\n"
				+ "vestimentas, um conjunto de roupas comuns e uma\r\n"
				+ "algibeira contendo 15 po\r\n\n";
		
		return descricao;
	}
	
	public void setAcolito() {
		getFicha().setAntecedente("Acólito");
		List<String> profPericias = Arrays.asList("Intuição", "Religião");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("Símbolo sagrado", "Livro de preces", "Varetas de incenso (5)", "Vestimentas", "Conjunto de roupas comuns");
		getFicha().setTesouro("Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoAcolito() {
		return tracoAcolito;
	}

	public List<String> getIdealAcolito() {
		return idealAcolito;
	}

	public List<String> getVinculoAcolito() {
		return vinculoAcolito;
	}

	public List<String> getDefeitoAcolito() {
		return defeitoAcolito;
	}
	
	
}
