package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class ArtesaoDeGuilda extends Classes{

	private List<String> tracoArtesao = Arrays.asList("Eu acredito que tudo que valha a pena fazer, vale a pena ser feito direito. Eu não posso evitar - Eu sou perfeccionista.",
			 "Eu sou um esnobe que olha de cima a baixo aqueles que não sabem apreciar artes requintadas.",
			 "Eu sempre quero aprender como as coisas funcionam e o que deixa as pessoas motivadas.",
			 "Eu sou cheio de aforismos espituosos e tenho um proverbio para cada ocasião",
			 "Eu sou grosso com as pessoas que não tem o mesmo comprometimento que eu com o trabalho duro e honesto.",
			 "Eu gosto de falar longamente sobre minha profissão.",
			 "Eu não gasto meu dinheiro facilmente e vou barganhar incansavelmente para conseguir o melhor acordo possível.",
			 "Eu sou bem conhecido pelo meu trabalho e quero ter certeza que todos o apreciam. Eu sempre fico surpreso quando conheço pessoas que não ouviram falar de mim.");

	private List<String> idealArtesao = Arrays.asList("Comunidade. É dever de todo cidadão civilizado fortalecer os elos da comunidade e a segurança da civilização. (Leal)",
			"Generosidade. Meus talentos me foram dados para que eu pudesse usá-los para beneficiar o mundo. (Bom)",
			"Liberade. Todo deveriam ser livres para perseguir seus próprios meios de vida. (Caótico)",
			"Ganância. Eu só estou aqui pelo dinheiro. (Mau)",
			"Povo. Eu sou cometido com o povo com quem me importo, não com ideias. (Neutro)",
			"Aspiração. Eu trabalho duro para ser o melhor no meu ofício. (Qualquer)");
	
	private List<String> vinculoArtesao = Arrays.asList("A oficina onde aprendi meu negócio é o local mais importante do mundo pra mim.",
			"Eu criei um trabalho incrível para alguém, mas descobri que ele não era merecedor de recebê-lo. Ainda estou à procurar de alguém que seja merecedor.",
			"Eu tenho uma grande dívida para com minha guilda por fazer de mim a pessoa que eu sou hoje.",
			"Eu busco riqueza para conseguir o amor de alguém.",
			"Um dia eu voltarei para a minha guilda e provarei que sou o maior artesão dentre eles.",
			"Eu irei me vingar das forças malignas que destruíram meu local de negócios e arruinaram meu estilo de vida.");

	private List<String> defeitoArtesao = Arrays.asList("Eu farei de tudo para pôr minhas mãos em algo raro ou inestimável.",
			"Eu rapidamente presumo que alguém está tentando me trapacear",
			"Ninguém nunca poderá saber que eu, certa vez, roubei dinheiro dos cofres da guilda.",
			"Eu nunca estou satisfeito com o que eu tenho - eu sempre quero mais.",
			"Eu mataria para adquirir um título de nobreza.",
			"Eu sou terrivelmente invejoso com qualquer um que possa ofuscar meu oficio. Todo lugar que eu vou, estou cercado de rivais.");

	public String getArtesaoDaGuilda() {
		String descricao = "ARTESÃO DE GUILDA\r\n"
				+ "Você é membro de uma guilda de artesãos, perito em um\r\n"
				+ "campo especifico e intimamente associado a outros\r\n"
				+ "artesãos. Você é uma parte bem estabelecida do mundo\r\n"
				+ "mercantil, livre, graças aos seus talentos e riqueza, das\r\n"
				+ "restrições de uma ordem social feudal. Você aprendeu\r\n"
				+ "suas perícias como aprendiz de um mestre artesão, com o\r\n"
				+ "patrocínio da sua guilda, até se tornar um mestre por\r\n"
				+ "seus próprios méritos.\r\n"
				+ "Proficiência em Perícias: Intuição, Persuasão\r\n"
				+ "Proficiência em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artesão\r\n"
				+ "Idiomas: Uma, à sua escolha\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artesão\r\n"
				+ "(à sua escolha), uma carta de apresentação da sua\r\n"
				+ "guilda, um conjunto de roupas de viajante e uma\r\n"
				+ "algibeira com 15 poARTESÃO DE GUILDA\r\n"
				+ "Você é membro de uma guilda de artesãos, perito em um\r\n"
				+ "campo especifico e intimamente associado a outros\r\n"
				+ "artesãos. Você é uma parte bem estabelecida do mundo\r\n"
				+ "mercantil, livre, graças aos seus talentos e riqueza, das\r\n"
				+ "restrições de uma ordem social feudal. Você aprendeu\r\n"
				+ "suas perícias como aprendiz de um mestre artesão, com o\r\n"
				+ "patrocínio da sua guilda, até se tornar um mestre por\r\n"
				+ "seus próprios méritos.\r\n"
				+ "Proficiência em Perícias: Intuição, Persuasão\r\n"
				+ "Proficiência em Ferramentas: Um tipo de ferramenta\r\n"
				+ "de artesão\r\n"
				+ "Idiomas: Uma, à sua escolha\r\n"
				+ "Equipamento: Um conjunto de ferramentas de artesão\r\n"
				+ "(à sua escolha), uma carta de apresentação da sua\r\n"
				+ "guilda, um conjunto de roupas de viajante e uma\r\n"
				+ "algibeira com 15 po";
		return descricao;
	}
	
	public void setArtesaoDeGuilda() {
		getFicha().setAntecedente("Artesão de guilda");
		List<String> profPericias = Arrays.asList("Intuição", "Persuasão");
		getProficiencia().setPericias(profPericias);
//		getFicha().setProfi_ferramentas_peri(getEquips().setFerramentaArtesao());
//		getFicha().setIdiomas(this.idiomas.setIdioma(getFicha().getIdiomas(), getFicha().getAntecedente()));
//		getFicha().setEquipamentos(getEquips().setFerramentaArtesao());
		List<String> equipamentos = Arrays.asList("Carta de apresentação da sua guilda", "Conjunto de roupas de viajante", "Algibeira 15 po");
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
