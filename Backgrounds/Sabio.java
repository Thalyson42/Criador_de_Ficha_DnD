package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Sabio extends Classes{

	private List<String> tracoSabio = Arrays.asList("Eu uso palavras polissil�bicas para endossar minha impress�o de grande erudi��o.",
			"Eu j� li todos os livros das grandes bibliotecas � ou gosto de me vangloriar e dizer que li.",
			"Eu costumo ajudar os outros que n�o s�o t�o inteligentes quanto eu, e pacientemente explico tudo quantas vezes forem necess�rias.",
			"Nada para mim � melhor que um bom mist�rio.",
			"Eu voluntariamente escuto cada lado, e seus argumentos, antes de tomar uma decis�o final.",
			"Eu...falo...lentamente...ao...conversar...com idiotas...que tentam...se comparar...comigo.",
			"E sou horr�vel e estranho em situa��es sociais",
			"Estou convencido de que todos tentam roubar os meus segredos de mim");
	
	private List<String> idealSabio = Arrays.asList("Conhecimento. O caminho para o poder e o auto aperfei�oamento � atrav�s do conhecimento. (Neutro)",
			"Beleza. O que � belo nos mostra o que est� al�m disso perto do que � verdadeiro. (Bom)",
			"Logica. Emo��es n�o devem nublar seu pensamento l�gico. (Leal)",
			"Sem Limites. Nada pode apaziguar a possibilidade infinita de toda a exist�ncia. (Ca�tico)",
			"Poder. Conhecimento � o caminho para o poder e a domina��o. (Mau)",
			"Auto Aperfei�oamento. O objetivo de uma vida de estudos � a melhoria de si mesmo. (Qualquer)");
	
	private List<String> vinculoSabio = Arrays.asList("� meu dever proteger meus estudantes.",
			"Eu guardo um texto ancestral que cont�m terr�veis segredos que n�o podem cair em m�os erradas.",
			"Eu trabalho para preservar uma biblioteca, universidade, arquivo de escribas ou monast�rio.",
			"O trabalho a da minha vida � uma s�rie de tomos relatando um campo de conhecimento espec�fico.",
			"Eu venho procurando a minha vida inteira pela resposta de certa quest�o.",
			"Eu vendi minha alma por conhecimento. Espero realizar grandes feitos para ganh�-la de volta.");
	
	private List<String> defeitoSabio = Arrays.asList("Eu me distraio facilmente com a promessa de informa��o.",
			"Muitas pessoas gritam e correm quando veem um corruptor. Eu paro e tomo notas de sua anatomia.",
			"Desvendar um mist�rio ancestral pode muito bem valer o pre�o e uma civiliza��o.",
			"E prefiro solu��es �bvias a complicadas.",
			"Eu falo sem antes pensar em minhas palavras, invariavelmente insultando outros.",
			"Eu n�o consigo guardar um segredo para salvar minha vida. Ou a vida de qualquer outra pessoa.");
	
	public String getSabio() {
		String descricao = "S�BIO\r\n"
				+ "Voc� ficou anos aprendendo sobre o conhecimento do\r\n"
				+ "multiverso. Voc� decorou manuscritos, estudou\r\n"
				+ "pergaminhos e escutou os grandes especialistas nos temas\r\n"
				+ "que o interessam. Seus esfor�os fizeram de voc� um\r\n"
				+ "mestre no seu campo de estudo.\r\n"
				+ "Profici�ncia em Per�cias: Arcanismo, Hist�ria\r\n"
				+ "Idiomas: Dois � sua escolha\r\n"
				+ "Equipamento: Um vidro de tinta escura, uma pena, uma\r\n"
				+ "faca pequena, uma carta de um falecido colega\r\n"
				+ "perguntando a voc� algo que voc� nunca ter� a chance\r\n"
				+ "de responder, um conjunto de roupas comuns e uma\r\n"
				+ "algibeira contendo 10 po\r\n";
		return descricao;
	}
	
	public void setSabio() {
		getFicha().setAntecedente("S�bio");
		List<String> profPericias = Arrays.asList("Arcanismo", "Hist�ria");
		getProficiencia().setPericias(profPericias);
		List<String> equipamentos = Arrays.asList("Vidro de tinta escura", "Pena", "Faca pequena", "Carta de um falecido colega perguntando a voc� algo que voc� nunca ter� a chance de responder", "Conjunto de roupas comuns", "Algibeira 10po");
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
