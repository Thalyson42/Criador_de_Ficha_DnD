package Races;

import CriadorDeFicha.Classes;

public class Halfling extends Classes{

	public String halflingDescricao() {
		String halfling = "Halfling\r\n\n"
				+ "Os pequeninos halflings sobrevivem em um mundo cheio\r\n"
				+ "de criaturas maiores ao evitar serem notados, ou evitando\r\n"
				+ "o combate direto. Com uns 90 centímetros de altura, eles\r\n"
				+ "parecem inofensivos e assim conseguiram sobreviver por\r\n"
				+ "séculos às sombras dos impérios e à margem de guerras e\r\n"
				+ "conflitos políticos. Eles normalmente são robustos,\r\n"
				+ "pesando entre 20 kg e 22,5 kg.\r\n"
				+ "A pele dos halflings varia do bronzeado ao pálido com\r\n"
				+ "um tom corado, e seu cabelo é geralmente castanho ou\r\n"
				+ "castanho claro e ondulado. Eles têm olhos castanhos ou\r\n"
				+ "amendoados. Halflings do sexo masculino muitas vezes\r\n"
				+ "ostentam costeletas longas, mas barbas são raras entre\r\n"
				+ "eles e bigodes são quase inexistentes. Eles gostam de usar\r\n"
				+ "roupas simples, confortáveis e práticas, preferindo as\r\n"
				+ "cores claras.\r\n"
				+ "A praticidade dos halflings se estende para além de\r\n"
				+ "suas roupas. Eles se preocupam com as necessidades\r\n"
				+ "básicas e os prazeres simples, e não são inclinados à\r\n"
				+ "ostentação. Mesmo o mais rico dos halflings mantém seus\r\n"
				+ "tesouros trancados em um porão, em vez de expostos à\r\n"
				+ "vista de todos. Eles possuem um talento especial para\r\n"
				+ "encontrar a solução mais simples para um problema e\r\n"
				+ "têm pouca paciência para indecisões.\r\n\n"
				+ "TRAÇOS RACIAIS DOS HALFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Um halfling atinge a idade adulta aos 20 anos\r\n"
				+ "e pode chegar a 150 anos.\r\n"
				+ "Tendência. A maioria dos halflings é leal e boa. Via\r\n"
				+ "de regra, eles possuem um bom coração e são amáveis,\r\n"
				+ "odeiam ver o sofrimento dos outros e não toleram a\r\n"
				+ "opressão. Eles também são muito ordeiros e tradicionais,\r\n"
				+ "fortemente apegados à sua comunidade e ao conforto de\r\n"
				+ "suas antigas tradições.\r\n"
				+ "Tamanho. Halflings medem cerca de 0,90 metro de\r\n"
				+ "altura e pesam aproximadamente 20 kg. Seu tamanho é\r\n"
				+ "Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 7,5 metros.\r\n"
				+ "Sortudo. Quando você obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resistência, você pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\r\n"
				+ "Bravura. Você tem vantagem em testes de resistência\r\n"
				+ "contra ficar amedrontado.\r\n"
				+ "Agilidade Halfling. Você pode mover-se através do\r\n"
				+ "espaço de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
				+ "Halfling. A linguagem Halfling não é secreta, mas os\r\n"
				+ "halflings são relutantes em compartilhá-la com os outros.\r\n"
				+ "Eles escrevem muito pouco, por isso eles não possuem\r\n"
				+ "uma literatura rica. No entanto, sua tradição oral é muito\r\n"
				+ "forte. Quase todos os halflings falam o idioma Comum\r\n"
				+ "para conversar com as pessoas das terras que habitam, ou\r\n"
				+ "através das quais eles estejam viajando.\r\n"
				+ "Sub-raça. Os dois tipos principais de halflings, PésLeves e Robustos, são mais como famílias bem próximas\r\n"
				+ "do que verdadeiras sub-raças. Escolha uma destas subraças.";
		return halfling;
	}
	
	public void setHalfling() {
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Sortudo.\n\nQuando você obtiver um 1 natural em uma\r\n"
				+ "jogada de ataque, teste de habilidade ou teste de\r\n"
				+ "resistência, você pode jogar de novo o dado e deve utilizar\r\n"
				+ "o novo resultado.\n\n");
		getFicha().setTracosraciais("Bravura.\n\nVocê tem vantagem em testes de resistência\r\n"
				+ "contra ficar amedrontado.\n\n");
		getFicha().setTracosraciais("Agilidade Halfling.\n\nVocê pode mover-se através do\r\n"
				+ "espaço de qualquer criatura que for de um tamanho maior\r\n"
				+ "que o seu.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Halfling");
	}
	
	public String getPesLeves() {
		String pesLeves = "PÉS LEVES\r\n\n"
				+ "Como um halfling pés-leves, você pode esconder-se\r\n"
				+ "facilmente, mesmo usando apenas outras pessoas como\r\n"
				+ "cobertura. Você geralmente é afável e se dá muito bem\r\n"
				+ "com os outros. Nos Reinos Esquecidos, os halflings pésleves espalharam-se até os lugares mais distantes e são a\r\n"
				+ "variedade mais comum.\r\n"
				+ "Pés-leves são mais propensos à vontade de viajar do\r\n"
				+ "que os outros halflings, e muitas vezes vivem ao lado de\r\n"
				+ "outras raças ou levam uma vida nômade. No mundo de\r\n"
				+ "Greyhawk, estes halflings são chamados pés-peludos ou\r\n"
				+ "companheiros altos.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Furtividade Natural. Você pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no mínimo um tamanho maior que o seu.\r\n\n";
		return pesLeves;
	}
	
	public void setPesLeves() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Furtividade Natural.\n\nVocê pode tentar se esconder\r\n"
				+ "mesmo quando possuir apenas a cobertura de uma\r\n"
				+ "criatura que for no mínimo um tamanho maior que o seu.\n\n");
	}
	
	public String getRobusto() {
		String robusto ="ROBUSTO\r\n\n"
				+ "Um halfling robustos é mais resistente do que a média de\r\n"
				+ "sua raça e possui certa resistência aos venenos. Alguns\r\n"
				+ "dizem que os robustos têm sangue dos anões. Nos Reinos\r\n"
				+ "Esquecidos, esses halflings são chamados de austeros, e\r\n"
				+ "são mais comuns no sul.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constituição aumenta em 1.\r\n"
				+ "Resiliência dos Robustos. Você tem vantagem em\r\n"
				+ "testes de resistência contra veneno e tem resistência\r\n"
				+ "contra dano de veneno.\n\n";
		return robusto;
	}
	
	public void setRobusto() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Resiliência dos Robustos.\n\nVocê tem vantagem em\r\n"
				+ "testes de resistência contra veneno e tem resistência\r\n"
				+ "contra dano de veneno.\n\n");
	}
	
}
