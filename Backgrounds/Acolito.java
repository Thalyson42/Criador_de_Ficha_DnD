package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Acolito extends Classes{

	private List<String> tracoAcolito = Arrays.asList("Eu idolatro um her�i particular da minha f�, e constantemente me refiro a seus feitos e exemplos.",
			"Eu consigo encontrar semelhan�as mesmo entre os inimigos mais violentos, com empatia e sempre trabalhando pela paz.",
			"Eu vejo press�gio em cada evento e a��o. Os deuses est�o falando conosco, n�s apenas temos de ouvi-los.",
			"Nada pode abalar minha atitude otimista.",
			"Eu cito (corretamente ou n�o) textos sagrados e prov�rbios em quase qualquer situa��o.",
			"Eu sou tolerante (ou intolerante) a qualquer outra f�, e respeito (ou condeno) a adora��o a outros deuses",
			"Eu aprecio comida requintada, bebidas e a elite entre o alto escal�o de meu templo. Uma vida dura me irrita.",
			"Eu passei tanto tempo no templo que possuo pouca pr�tica em lidar com as pessoas mundo a fora.");

	private List<String> idealAcolito = Arrays.asList("Tradi��o. As tradi��es de adora��o e sacrif�cio devem ser preservadas e perpetradas. (Leal)",
			"Caridade. Eu sempre tento ajudar aqueles em necessidade, n�o importando o custo pessoal. (Bom)",
			"Mudan�a. N�s devemos ajudar a conduzir as mudan�as que os deuses est�o constantemente trabalhando para o mundo. (Ca�tico)",
			"Poder. Eu espero que um dia eu consiga chegar ao topo na hierarquia da minha religi�o. (Leal)",
			"F�. Eu acredito que minha divindade guia minhas a��es. Eu tenho f� que, se eu trabalhar duro, coisas boas acontecer�o. (Leal)",
			"Aspira��o. Eu busco ser digno de gra�a do meu deus ao corresponder minhas a��es aos seus ensinamentos. (Qualquer)");

	private List<String> vinculoAcolito = Arrays.asList("Eu morreria para recuperar um rel�quia ancestral de minha f�, perdida h� muito tempo.",
			"Eu ainda terei minha vingan�a contra o trmpo corrupto que me acusou de heresia.",
			"Eu devo minha vida ao sacerdote que me acolheu quando meus pais morreram.",
			"Tudo o que fa�o, fa�o pelo povo.",
			"Eu farei qualquer coisa para proteger o templo que sirvo.",
			"Eu busco guardar um texto sagrado que meus inimigos dizem ser her�tico e tentam destru�-lo.");
	
	private List<String> defeitoAcolito = Arrays.asList("Eu julgo os outros severamente, e a mim mesmo mais ainda.",
			"Eu deposito muita confian�a naqueles que det�m o poder na hierarquia de meu templo.",
			"Minha devo��o muitas vezes me cega perante aqueles que professam a f� do meu deus.",
			"Meu pensamento � inflex�vel.",
			"Eu suspeito de estranhos e sempre espero o pior deles.",
			"Depois de escolher um objetivo, eu fico obcecado em cumpri-lo, at� mesmo em detrimento de qualquer outra coisa em minha vida.");

	
	public String getacolitoDescricao() {
		String descricao ="AC�LITO\r\n\n"
				+ "Voc� viveu a servi�o de um templo de algum deus\r\n"
				+ "especifico ou de um pante�o de deuses. Voc� age como um\r\n"
				+ "intermedi�rio entre o reino divino e o reino dos mortais,\r\n"
				+ "realizando rituais e ofertando sacrif�cios para conduzir\r\n"
				+ "cada vez mais pessoas a adorarem a divindade. Voc� n�o\r\n"
				+ "� necessariamente um cl�rigo � realizar ritos sagrados\r\n"
				+ "n�o � a mesma coisa que canalizar poder divino.\r\n"
				+ "Escolha um deus, um pante�o de deuses ou outro ser\r\n"
				+ "quase divino entre aqueles descritos no ap�ndice B ou\r\n"
				+ "outro especificado pelo seu Mestre para detalhar a\r\n"
				+ "natureza do seu servi�o religioso. Voc� foi um servi�al\r\n"
				+ "menor no templo, criado desde a inf�ncia para auxiliar os\r\n"
				+ "sacerdotes em ritos sagrados? Ou voc� foi um alto\r\n"
				+ "sacerdote que repentinamente sentiu o chamado para\r\n"
				+ "servir seu deus de uma maneira diferente? Talvez voc� foi\r\n"
				+ "o l�der de um pequeno culto n�o associado a templo\r\n"
				+ "algum, ou mesmo uma seita secreta que servia a uma\r\n"
				+ "entidade demon�aca que agora voc� nega.\r\n"
				+ "Profici�ncia em Per�cias: Intui��o, Religi�o\r\n"
				+ "Idiomas: Dois � sua escolha\r\n"
				+ "Equipamento: Um s�mbolo sagrado (um presente dado\r\n"
				+ "quando voc� entrou no templo), um livro de preces ou\r\n"
				+ "uma conta de ora��es, 5 varetas de incenso,\r\n"
				+ "vestimentas, um conjunto de roupas comuns e uma\r\n"
				+ "algibeira contendo 15 po\r\n\n";
		
		return descricao;
	}
	
	public void setAcolito() {
		getFicha().setAntecedente("Ac�lito");
		List<String> profPericias = Arrays.asList("Intui��o", "Religi�o");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("S�mbolo sagrado", "Livro de preces", "Varetas de incenso (5)", "Vestimentas", "Conjunto de roupas comuns");
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
