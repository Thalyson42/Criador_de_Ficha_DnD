package Races;

import CriadorDeFicha.Classes;

public class Humano extends Classes{

	public String humanoDescricao() {
		String humano = "HUMANOS\r\n\n"
				+ "Os humanos s�o os mais adapt�veis, flex�veis e\r\n"
				+ "ambiciosos entre todas as ra�as comuns. Eles t�m amplos\r\n"
				+ "e distintos gostos, moralidades e h�bitos nas muitas\r\n"
				+ "diferentes regi�es onde eles se instalaram. Quando se\r\n"
				+ "estabelecem em um lugar, eles permanecem: eles\r\n"
				+ "constroem cidades que duram por eras, e grandes reinos\r\n"
				+ "que podem persistir por longos s�culos. Um �nico humano\r\n"
				+ "pode ter uma vida relativamente curta, mas uma na��o\r\n"
				+ "ou cultura humana preserva tradi��es com origens muito\r\n"
				+ "al�m do alcance da mem�ria de qualquer um dos\r\n"
				+ "humanos. Eles vivem plenamente o presente � tornandoos bem adaptados a uma vida de aventuras � mas\r\n"
				+ "tamb�m planejam o futuro, esfor�ando-se para deixar um\r\n"
				+ "legado duradouro. Individualmente e como grupo, os\r\n"
				+ "humanos s�o oportunistas adapt�veis, e permanecem\r\n"
				+ "alerta �s din�micas mudan�as pol�ticas e sociais.\r\n\n"
				+ "TRA�OS RACIAIS DOS HUMANOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Todos os seus\r\n"
				+ "valores de habilidade aumentam em 1.\r\n"
				+ "Idade. Os humanos chegam � idade adulta no final da\r\n"
				+ "adolesc�ncia e vivem menos de um s�culo.\r\n"
				+ "Tend�ncia. Os humanos n�o possuem inclina��o a\r\n"
				+ "nenhuma tend�ncia em especial. Os melhores e os piores\r\n"
				+ "s�o encontrados entre eles.\r\n"
				+ "Tamanho. Os humanos variam muito em altura e\r\n"
				+ "peso, podem ter quase 1,50 metro ou mais de 1,80 metro.\r\n"
				+ "Independentemente da sua posi��o entre esses valores, o\r\n"
				+ "seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
				+ "outro idioma adicional, � sua escolha. Os humanos\r\n"
				+ "normalmente aprendem os idiomas dos povos que\r\n"
				+ "convivem, incluindo dialetos obscuros. Eles gostam de\r\n"
				+ "rechear seu discurso com palavras emprestadas de outras\r\n"
				+ "l�nguas: xingamentos orcs, express�es musicais �lficas,\r\n"
				+ "frases militares an�s e outros.\r\n";
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
