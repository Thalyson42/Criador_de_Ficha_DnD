package Races;

import CriadorDeFicha.Classes;

public class Halfling extends Classes{

	public String halflingDescricao() {
		String halfling = "Halfling\r\n\n"
				+ "Os pequeninos halflings sobrevivem em um mundo cheio\r\n"
				+ "de criaturas maiores ao evitar serem notados, ou evitando\r\n"
				+ "o combate direto. Com uns 90 cent�metros de altura, eles\r\n"
				+ "parecem inofensivos e assim conseguiram sobreviver por\r\n"
				+ "s�culos �s sombras dos imp�rios e � margem de guerras e\r\n"
				+ "conflitos pol�ticos. Eles normalmente s�o robustos,\r\n"
				+ "pesando entre 20 kg e 22,5 kg.\r\n"
				+ "A pele dos halflings varia do bronzeado ao p�lido com\r\n"
				+ "um tom corado, e seu cabelo � geralmente castanho ou\r\n"
				+ "castanho claro e ondulado. Eles t�m olhos castanhos ou\r\n"
				+ "amendoados. Halflings do sexo masculino muitas vezes\r\n"
				+ "ostentam costeletas longas, mas barbas s�o raras entre\r\n"
				+ "eles e bigodes s�o quase inexistentes. Eles gostam de usar\r\n"
				+ "roupas simples, confort�veis e pr�ticas, preferindo as\r\n"
				+ "cores claras.\r\n"
				+ "A praticidade dos halflings se estende para al�m de\r\n"
				+ "suas roupas. Eles se preocupam com as necessidades\r\n"
				+ "b�sicas e os prazeres simples, e n�o s�o inclinados �\r\n"
				+ "ostenta��o. Mesmo o mais rico dos halflings mant�m seus\r\n"
				+ "tesouros trancados em um por�o, em vez de expostos �\r\n"
				+ "vista de todos. Eles possuem um talento especial para\r\n"
				+ "encontrar a solu��o mais simples para um problema e\r\n"
				+ "t�m pouca paci�ncia para indecis�es.\r\n\n"
				+ "TRA�OS RACIAIS DOS HALFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Um halfling atinge a idade adulta aos 20 anos\r\n"
				+ "e pode chegar a 150 anos.\r\n"
				+ "Tend�ncia. A maioria dos halflings � leal e boa. Via\r\n"
				+ "de regra, eles possuem um bom cora��o e s�o am�veis,\r\n"
				+ "odeiam ver o sofrimento dos outros e n�o toleram a\r\n"
				+ "opress�o. Eles tamb�m s�o muito ordeiros e tradicionais,\r\n"
				+ "fortemente apegados � sua comunidade e ao conforto de\r\n"
				+ "suas antigas tradi��es.\r\n"
				+ "Tamanho. Halflings medem cerca de 0,90 metro de\r\n"
				+ "altura e pesam aproximadamente 20 kg. Seu tamanho �\r\n"
				+ "Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 7,5 metros.\r\n"
				+ "Sortudo. Quando voc� obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resist�ncia, voc� pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\r\n"
				+ "Bravura. Voc� tem vantagem em testes de resist�ncia\r\n"
				+ "contra ficar amedrontado.\r\n"
				+ "Agilidade Halfling. Voc� pode mover-se atrav�s do\r\n"
				+ "espa�o de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
				+ "Halfling. A linguagem Halfling n�o � secreta, mas os\r\n"
				+ "halflings s�o relutantes em compartilh�-la com os outros.\r\n"
				+ "Eles escrevem muito pouco, por isso eles n�o possuem\r\n"
				+ "uma literatura rica. No entanto, sua tradi��o oral � muito\r\n"
				+ "forte. Quase todos os halflings falam o idioma Comum\r\n"
				+ "para conversar com as pessoas das terras que habitam, ou\r\n"
				+ "atrav�s das quais eles estejam viajando.\r\n"
				+ "Sub-ra�a. Os dois tipos principais de halflings, P�sLeves e Robustos, s�o mais como fam�lias bem pr�ximas\r\n"
				+ "do que verdadeiras sub-ra�as. Escolha uma destas subra�as.";
		return halfling;
	}
	
	public void setHalfling() {
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Sortudo.\n\nQuando voc� obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resist�ncia, voc� pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\n\n");
		getFicha().setTracosraciais("Bravura.\n\nVoc� tem vantagem em testes de resist�ncia\r\n"
				+ "contra ficar amedrontado.\n\n");
		getFicha().setTracosraciais("Agilidade Halfling.\n\nVoc� pode mover-se atrav�s do\r\n"
				+ "espa�o de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Halfling");
	}
	
	public String getPesLeves() {
		String pesLeves = "P�S LEVES\r\n\n"
				+ "Como um halfling p�s-leves, voc� pode esconder-se\r\n"
				+ "facilmente, mesmo usando apenas outras pessoas como\r\n"
				+ "cobertura. Voc� geralmente � af�vel e se d� muito bem\r\n"
				+ "com os outros. Nos Reinos Esquecidos, os halflings p�sleves espalharam-se at� os lugares mais distantes e s�o a\r\n"
				+ "variedade mais comum.\r\n"
				+ "P�s-leves s�o mais propensos � vontade de viajar do\r\n"
				+ "que os outros halflings, e muitas vezes vivem ao lado de\r\n"
				+ "outras ra�as ou levam uma vida n�made. No mundo de\r\n"
				+ "Greyhawk, estes halflings s�o chamados p�s-peludos ou\r\n"
				+ "companheiros altos.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Furtividade Natural. Voc� pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no m�nimo um tamanho maior que o seu.\r\n\n";
		return pesLeves;
	}
	
	public void setPesLeves() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Furtividade Natural.\n\nVoc� pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no m�nimo um tamanho maior que o seu.\n\n");
	}
	
	public String getRobusto() {
		String robusto ="ROBUSTO\r\n\n"
				+ "Um halfling robustos � mais resistente do que a m�dia de\r\n"
				+ "sua ra�a e possui certa resist�ncia aos venenos. Alguns\r\n"
				+ "dizem que os robustos t�m sangue dos an�es. Nos Reinos\r\n"
				+ "Esquecidos, esses halflings s�o chamados de austeros, e\r\n"
				+ "s�o mais comuns no sul.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constitui��o aumenta em 1.\r\n"
				+ "Resili�ncia dos Robustos. Voc� tem vantagem em\r\n"
				+ "testes de resist�ncia contra veneno e tem resist�ncia\r\n"
				+ "contra dano de veneno.\n\n";
		return robusto;
	}
	
	public void setRobusto() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Resili�ncia dos Robustos.\n\nVoc� tem vantagem em\r\n"
				+ "testes de resist�ncia contra veneno e tem resist�ncia\r\n"
				+ "contra dano de veneno.\n\n");
	}
	
}
