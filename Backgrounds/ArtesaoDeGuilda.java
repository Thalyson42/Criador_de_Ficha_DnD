package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class ArtesaoDeGuilda extends Classes{

	private List<String> tracoArtesao = Arrays.asList("Eu acredito que tudo que valha a pena fazer, vale a pena ser feito direito. Eu n�o posso evitar - Eu sou perfeccionista.",
			 "Eu sou um esnobe que olha de cima a baixo aqueles que n�o sabem apreciar artes requintadas.",
			 "Eu sempre quero aprender como as coisas funcionam e o que deixa as pessoas motivadas.",
			 "Eu sou cheio de aforismos espituosos e tenho um proverbio para cada ocasi�o",
			 "Eu sou grosso com as pessoas que n�o tem o mesmo comprometimento que eu com o trabalho duro e honesto.",
			 "Eu gosto de falar longamente sobre minha profiss�o.",
			 "Eu n�o gasto meu dinheiro facilmente e vou barganhar incansavelmente para conseguir o melhor acordo poss�vel.",
			 "Eu sou bem conhecido pelo meu trabalho e quero ter certeza que todos o apreciam. Eu sempre fico surpreso quando conhe�o pessoas que n�o ouviram falar de mim.");

	private List<String> idealArtesao = Arrays.asList("Comunidade. � dever de todo cidad�o civilizado fortalecer os elos da comunidade e a seguran�a da civiliza��o. (Leal)",
			"Generosidade. Meus talentos me foram dados para que eu pudesse us�-los para beneficiar o mundo. (Bom)",
			"Liberade. Todo deveriam ser livres para perseguir seus pr�prios meios de vida. (Ca�tico)",
			"Gan�ncia. Eu s� estou aqui pelo dinheiro. (Mau)",
			"Povo. Eu sou cometido com o povo com quem me importo, n�o com ideias. (Neutro)",
			"Aspira��o. Eu trabalho duro para ser o melhor no meu of�cio. (Qualquer)");
	
	private List<String> vinculoArtesao = Arrays.asList("A oficina onde aprendi meu neg�cio � o local mais importante do mundo pra mim.",
			"Eu criei um trabalho incr�vel para algu�m, mas descobri que ele n�o era merecedor de receb�-lo. Ainda estou � procurar de algu�m que seja merecedor.",
			"Eu tenho uma grande d�vida para com minha guilda por fazer de mim a pessoa que eu sou hoje.",
			"Eu busco riqueza para conseguir o amor de algu�m.",
			"Um dia eu voltarei para a minha guilda e provarei que sou o maior artes�o dentre eles.",
			"Eu irei me vingar das for�as malignas que destru�ram meu local de neg�cios e arruinaram meu estilo de vida.");

	private List<String> defeitoArtesao = Arrays.asList("Eu farei de tudo para p�r minhas m�os em algo raro ou inestim�vel.",
			"Eu rapidamente presumo que algu�m est� tentando me trapacear",
			"Ningu�m nunca poder� saber que eu, certa vez, roubei dinheiro dos cofres da guilda.",
			"Eu nunca estou satisfeito com o que eu tenho - eu sempre quero mais.",
			"Eu mataria para adquirir um t�tulo de nobreza.",
			"Eu sou terrivelmente invejoso com qualquer um que possa ofuscar meu oficio. Todo lugar que eu vou, estou cercado de rivais.");

	public String getArtesaoDaGuilda() {
		String descricao = "ARTES�O DE GUILDA\r\n"
				+ "Voc� � membro de uma guilda de artes�os, perito em um\r\n"
				+ "campo especifico e intimamente associado a outros\r\n"
				+ "artes�os. Voc� � uma parte bem estabelecida do mundo\r\n"
				+ "mercantil, livre, gra�as aos seus talentos e riqueza, das\r\n"
				+ "restri��es de uma ordem social feudal. Voc� aprendeu\r\n"
				+ "suas per�cias como aprendiz de um mestre artes�o, com o\r\n"
				+ "patroc�nio da sua guilda, at� se tornar um mestre por\r\n"
				+ "seus pr�prios m�ritos.\r\n"
				+ "Profici�ncia em Per�cias: Intui��o, Persuas�o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artes�o\r\n"
				+ "Idiomas: Uma, � sua escolha\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artes�o\r\n"
				+ "(� sua escolha), uma carta de apresenta��o da sua\r\n"
				+ "guilda, um conjunto de roupas de viajante e uma\r\n"
				+ "algibeira com 15 poARTES�O DE GUILDA\r\n"
				+ "Voc� � membro de uma guilda de artes�os, perito em um\r\n"
				+ "campo especifico e intimamente associado a outros\r\n"
				+ "artes�os. Voc� � uma parte bem estabelecida do mundo\r\n"
				+ "mercantil, livre, gra�as aos seus talentos e riqueza, das\r\n"
				+ "restri��es de uma ordem social feudal. Voc� aprendeu\r\n"
				+ "suas per�cias como aprendiz de um mestre artes�o, com o\r\n"
				+ "patroc�nio da sua guilda, at� se tornar um mestre por\r\n"
				+ "seus pr�prios m�ritos.\r\n"
				+ "Profici�ncia em Per�cias: Intui��o, Persuas�o\r\n"
				+ "Profici�ncia em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artes�o\r\n"
				+ "Idiomas: Uma, � sua escolha\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artes�o\r\n"
				+ "(� sua escolha), uma carta de apresenta��o da sua\r\n"
				+ "guilda, um conjunto de roupas de viajante e uma\r\n"
				+ "algibeira com 15 po";
		return descricao;
	}
	
	public void setArtesaoDeGuilda() {
		getFicha().setAntecedente("Artes�o de guilda");
		List<String> profPericias = Arrays.asList("Intui��o", "Persuas�o");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
//		getFicha().setIdiomas(this.idiomas.setIdioma(getFicha().getIdiomas(), getFicha().getAntecedente()));
//		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("Carta de apresenta��o da sua guilda", "Conjunto de roupas de viajante", "Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoArtesao() {
		return tracoArtesao;
	}

	public List<String> getIdealArtesao() {
		return idealArtesao;
	}

	public List<String> getVinculoArtesao() {
		return vinculoArtesao;
	}

	public List<String> getDefeitoArtesao() {
		return defeitoArtesao;
	}
	
}
