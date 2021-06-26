package Races;

import CriadorDeFicha.Classes;

public class Humano extends Classes{

	public String humanoDescricao() {
		String humano = "HUMANOS\r\n\n"
				+ "Os humanos são os mais adaptáveis, flexíveis e\r\n"
				+ "ambiciosos entre todas as raças comuns. Eles têm amplos\r\n"
				+ "e distintos gostos, moralidades e hábitos nas muitas\r\n"
				+ "diferentes regiões onde eles se instalaram. Quando se\r\n"
				+ "estabelecem em um lugar, eles permanecem: eles\r\n"
				+ "constroem cidades que duram por eras, e grandes reinos\r\n"
				+ "que podem persistir por longos séculos. Um único humano\r\n"
				+ "pode ter uma vida relativamente curta, mas uma nação\r\n"
				+ "ou cultura humana preserva tradições com origens muito\r\n"
				+ "além do alcance da memória de qualquer um dos\r\n"
				+ "humanos. Eles vivem plenamente o presente – tornandoos bem adaptados a uma vida de aventuras – mas\r\n"
				+ "também planejam o futuro, esforçando-se para deixar um\r\n"
				+ "legado duradouro. Individualmente e como grupo, os\r\n"
				+ "humanos são oportunistas adaptáveis, e permanecem\r\n"
				+ "alerta às dinâmicas mudanças políticas e sociais.\r\n\n"
				+ "TRAÇOS RACIAIS DOS HUMANOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Todos os seus\r\n"
				+ "valores de habilidade aumentam em 1.\r\n"
				+ "Idade. Os humanos chegam à idade adulta no final da\r\n"
				+ "adolescência e vivem menos de um século.\r\n"
				+ "Tendência. Os humanos não possuem inclinação a\r\n"
				+ "nenhuma tendência em especial. Os melhores e os piores\r\n"
				+ "são encontrados entre eles.\r\n"
				+ "Tamanho. Os humanos variam muito em altura e\r\n"
				+ "peso, podem ter quase 1,50 metro ou mais de 1,80 metro.\r\n"
				+ "Independentemente da sua posição entre esses valores, o\r\n"
				+ "seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
				+ "outro idioma adicional, à sua escolha. Os humanos\r\n"
				+ "normalmente aprendem os idiomas dos povos que\r\n"
				+ "convivem, incluindo dialetos obscuros. Eles gostam de\r\n"
				+ "rechear seu discurso com palavras emprestadas de outras\r\n"
				+ "línguas: xingamentos orcs, expressões musicais élficas,\r\n"
				+ "frases militares anãs e outros.\r\n";
		return humano;
	}
	
	public void setHumano() {
		getFicha().setForca(1);
		getFicha().setDestreza(1);
		getFicha().setConstituicao(1);
		getFicha().setInteligencia(1);
		getFicha().setSabedoria(1);
		getFicha().setCarisma(1);
		getFicha().setDeslocamento("9");
		getFicha().setIdiomas("Comum");
	}
	
}
