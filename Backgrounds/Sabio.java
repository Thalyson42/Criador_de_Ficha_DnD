package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Sabio extends Classes{

	private List<String> tracoSabio = Arrays.asList("Eu uso palavras polissilábicas para endossar minha impressão de grande erudição.",
			"Eu já li todos os livros das grandes bibliotecas – ou gosto de me vangloriar e dizer que li.",
			"Eu costumo ajudar os outros que não são tão inteligentes quanto eu, e pacientemente explico tudo quantas vezes forem necessárias.",
			"Nada para mim é melhor que um bom mistério.",
			"Eu voluntariamente escuto cada lado, e seus argumentos, antes de tomar uma decisão final.",
			"Eu...falo...lentamente...ao...conversar...com idiotas...que tentam...se comparar...comigo.",
			"E sou horrível e estranho em situações sociais",
			"Estou convencido de que todos tentam roubar os meus segredos de mim");
	
	private List<String> idealSabio = Arrays.asList("Conhecimento. O caminho para o poder e o auto aperfeiçoamento é através do conhecimento. (Neutro)",
			"Beleza. O que é belo nos mostra o que está além disso perto do que é verdadeiro. (Bom)",
			"Logica. Emoções não devem nublar seu pensamento lógico. (Leal)",
			"Sem Limites. Nada pode apaziguar a possibilidade infinita de toda a existência. (Caótico)",
			"Poder. Conhecimento é o caminho para o poder e a dominação. (Mau)",
			"Auto Aperfeiçoamento. O objetivo de uma vida de estudos é a melhoria de si mesmo. (Qualquer)");
	
	private List<String> vinculoSabio = Arrays.asList("É meu dever proteger meus estudantes.",
			"Eu guardo um texto ancestral que contém terríveis segredos que não podem cair em mãos erradas.",
			"Eu trabalho para preservar uma biblioteca, universidade, arquivo de escribas ou monastério.",
			"O trabalho a da minha vida é uma série de tomos relatando um campo de conhecimento específico.",
			"Eu venho procurando a minha vida inteira pela resposta de certa questão.",
			"Eu vendi minha alma por conhecimento. Espero realizar grandes feitos para ganhá-la de volta.");
	
	private List<String> defeitoSabio = Arrays.asList("Eu me distraio facilmente com a promessa de informação.",
			"Muitas pessoas gritam e correm quando veem um corruptor. Eu paro e tomo notas de sua anatomia.",
			"Desvendar um mistério ancestral pode muito bem valer o preço e uma civilização.",
			"E prefiro soluções óbvias a complicadas.",
			"Eu falo sem antes pensar em minhas palavras, invariavelmente insultando outros.",
			"Eu não consigo guardar um segredo para salvar minha vida. Ou a vida de qualquer outra pessoa.");
	
	public String getSabio() {
		String descricao = "SÁBIO\r\n"
				+ "Você ficou anos aprendendo sobre o conhecimento do\r\n"
				+ "multiverso. Você decorou manuscritos, estudou\r\n"
				+ "pergaminhos e escutou os grandes especialistas nos temas\r\n"
				+ "que o interessam. Seus esforços fizeram de você um\r\n"
				+ "mestre no seu campo de estudo.\r\n"
				+ "Proficiência em Perícias: Arcanismo, História\r\n"
				+ "Idiomas: Dois à sua escolha\r\n"
				+ "Equipamento: Um vidro de tinta escura, uma pena, uma\r\n"
				+ "faca pequena, uma carta de um falecido colega\r\n"
				+ "perguntando a você algo que você nunca terá a chance\r\n"
				+ "de responder, um conjunto de roupas comuns e uma\r\n"
				+ "algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setSabio() {
		getFicha().setAntecedente("Sábio");
		List<String> profPericias = Arrays.asList("Arcanismo", "História");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("Vidro de tinta escura", "Pena", "Faca pequena", "Carta de um falecido colega perguntando a você algo que você nunca terá a chance de responder", "Conjunto de roupas comuns", "Algibeira 10po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoSabio() {
		return tracoSabio;
	}

	public List<String> getIdealSabio() {
		return idealSabio;
	}

	public List<String> getVinculoSabio() {
		return vinculoSabio;
	}

	public List<String> getDefeitoSabio() {
		return defeitoSabio;
	}
	
}
