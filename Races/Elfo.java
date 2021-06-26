package Races;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Elfo extends Classes{

	public String elfoDescricao() {
		String elfo = "Elfo\r\n\n"
				+ "Com a sua gra�a sobrenatural e seus tra�os finos, os elfos\r\n"
				+ "parecem assustadoramente belos para os humanos e os\r\n"
				+ "membros de muitas outras ra�as. Em m�dia, eles s�o\r\n"
				+ "ligeiramente mais baixos do que os humanos, variando de\r\n"
				+ "pouco menos de 1,50 metro at� pouco mais de 1,80 metro\r\n"
				+ "de altura. Eles s�o mais delgados que os humanos,\r\n"
				+ "pesando entre 50 kg a 72 kg apenas. Os machos e as\r\n"
				+ "f�meas s�o quase da mesma altura, mas os machos s�o\r\n"
				+ "um pouco mais pesados do que as f�meas.\r\n"
				+ "A colora��o da pele dos elfos varia da mesma maneira\r\n"
				+ "que os humanos, e tamb�m incluem peles em tons de\r\n"
				+ "cobre, bronze, at� o branco-azulado, os cabelos podem ser\r\n"
				+ "de tons verdes ou azuis, e os olhos podem ser como\r\n"
				+ "piscinas douradas ou prateadas. Elfos n�o possuem pelos\r\n"
				+ "faciais e poucos pelos no corpo. Eles preferem roupas\r\n"
				+ "elegantes em cores brilhantes, e gostam de joias simples,\r\n"
				+ "mas belas.\r\n\n"
				+ "TRA�OS RACIAIS DOS ELFOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Embora os elfos atinjam a maturidade f�sica\r\n"
				+ "com praticamente a mesma idade dos humanos, a\r\n"
				+ "compreens�o �lfica da idade adulta vai al�m da\r\n"
				+ "maturidade f�sica, abrangendo sua experi�ncia sobre o\r\n"
				+ "mundo. Um elfo tipicamente assume a idade adulta e um\r\n"
				+ "nome adulto com cerca de 100 anos de idade e pode viver\r\n"
				+ "750 anos.\r\n"
				+ "Tend�ncia. Elfos amam a liberdade, a diversidade e a\r\n"
				+ "express�o pessoal, ent�o eles inclinam-se forte e\r\n"
				+ "suavemente para aspectos do caos. Eles valorizam e\r\n"
				+ "protegem a liberdade dos outros como a sua pr�pria, e s�o\r\n"
				+ "geralmente mais bondosos que o contr�rio. Os drow s�o\r\n"
				+ "exce��o. Seu ex�lio no Subterr�neo fez deles perversos e\r\n"
				+ "perigosos. Drow s�o geralmente mais maus que o\r\n"
				+ "contr�rio.\r\n"
				+ "Tamanho. Elfos medem entre 1,50 a 1,80 metro de\r\n"
				+ "altura e possuem constitui��o delgada. Seu tamanho �\r\n"
				+ "M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Vis�o no Escuro. Acostumado �s florestas\r\n"
				+ "crepusculares e ao c�u noturno, voc� possui uma vis�o\r\n"
				+ "superior em condi��es de escurid�o e na penumbra. Voc�\r\n"
				+ "pode enxergar na penumbra a at� 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Voc� n�o pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\r\n"
				+ "Sentidos Agu�ados. Voc� tem profici�ncia na per�cia\r\n"
				+ "Percep��o.\r\n"
				+ "Ancestral Fe�rico. Voc� tem vantagem nos testes de\r\n"
				+ "resist�ncia para resistir a ser enfeiti�ado e magias n�o\r\n"
				+ "podem coloc�-lo para dormir.\r\n"
				+ "Transe. Elfos n�o precisam dormir. Ao inv�s disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal medita��o � \"transe\".) Enquanto\r\n"
				+ "medita, um elfo � capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade s�o exerc�cios mentais que se tornam\r\n"
				+ "reflexos atrav�s de anos de pr�tica. Depois de descansar\r\n"
				+ "dessa forma, voc� ganha os mesmos benef�cios que um\r\n"
				+ "humano depois de 8 horas de sono.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
				+ "�lfico. O �lfico � um idioma fluido, com entona��es sutis e\r\n"
				+ "gram�tica complexa. A literatura �lfica � rica e diversa, e\r\n"
				+ "suas can��es e poemas s�o famosos entre outras ra�as.\r\n"
				+ "Muitos bardos aprendem essa l�ngua para que possam\r\n"
				+ "adicionar can��es �lficas ao seu repert�rio.\r\n"
				+ "Sub-ra�a. Antigas divis�es entre os povos �lficos\r\n"
				+ "resultaram em tr�s sub-ra�as principais: os altos elfos, os\r\n"
				+ "elfos da floresta, e os elfos negros, que s�o comumente\r\n"
				+ "chamados de drow. Escolha uma dessas sub-ra�as. Em\r\n"
				+ "alguns mundos, essas sub-ra�as s�o ainda mais divididas\r\n"
				+ "(como os elfos do sol e elfos da lua nos Reinos Esquecidos),\r\n"
				+ "ent�o se voc� desejar, voc� pode escolher uma sub-ra�a\r\n"
				+ "ainda mais espec�fica.\r\n";
		return elfo;
	}
	
	public void setRacaElfo() {
		getFicha().setRaca("Elfo");
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nAcostumado �s florestas\r\n"
				+ "crepusculares e ao c�u noturno, voc� possui uma vis�o\r\n"
				+ "superior em condi��es de escurid�o e na penumbra. Voc�\r\n"
				+ "pode enxergar na penumbra a at� 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Voc� n�o pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\n\n");
		getFicha().setTracosraciais("Sentidos Agu�ados.\n\nVoc� tem profici�ncia na per�cia\r\n"
				+ "Percep��o.\n\n");
		getFicha().setTracosraciais("Ancestral Fe�rico.\n\nVoc� tem vantagem nos testes de\r\n"
				+ "resist�ncia para resistir a ser enfeiti�ado e magias n�o\r\n"
				+ "podem coloc�-lo para dormir.\r\n\n");
		getFicha().setTracosraciais("Transe.\n\nElfos n�o precisam dormir. Ao inv�s disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal medita��o � \"transe\".) Enquanto\r\n"
				+ "medita, um elfo � capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade s�o exerc�cios mentais que se tornam\r\n"
				+ "reflexos atrav�s de anos de pr�tica. Depois de descansar\r\n"
				+ "dessa forma, voc� ganha os mesmos benef�cios que um\r\n"
				+ "humano depois de 8 horas de sono.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("�lfico");
	}
	
	public String getAltoElfo() {
		String altoElfo = "ALTO ELFO\r\n\n"
				+ "Como alto elfo, voc� possui uma mente afiada e um\r\n"
				+ "dom�nio da magia b�sico. Em muitos dos mundos de\r\n"
				+ "D&D, existem dois tipos de altos elfos. Um tipo (que\r\n"
				+ "inclui os elfos cinzentos e elfos do vale de Greyhawk, os\r\n"
				+ "Silvanesti de Dragonlance, e os elfos do sol dos\r\n"
				+ "Reinos Esquecidos) s�o arrogantes e reclusos,\r\n"
				+ "acreditando serem superiores aos n�o elfos e at�\r\n"
				+ "mesmo a outros elfos. O outro tipo (como os altos\r\n"
				+ "elfos de Greyhawk, os Qualinesti de Dragonlance\r\n"
				+ "e os elfos da lua dos Reinos Esquecidos) s�o\r\n"
				+ "mais comuns e amig�veis, e muitas vezes\r\n"
				+ "encontrados entre humanos e outras ra�as.\r\n"
				+ "Os elfos do sol de Faer�n (tamb�m chamado de elfos\r\n"
				+ "dourados ou elfos do amanhecer) t�m pele bronzeada e\r\n"
				+ "cabelos cor de cobre, negros ou louro dourado. Seus\r\n"
				+ "olhos s�o dourados, prateados ou negros. Os elfos da\r\n"
				+ "lua (tamb�m chamados de elfos de prata ou elfos\r\n"
				+ "cinzentos) s�o muito mais p�lidos, com pele de\r\n"
				+ "alabastro por vezes tingida de azul. Normalmente, eles\r\n"
				+ "t�m cabelos de um branco prateado, negros ou azuis,\r\n"
				+ "diversos tons de loiro, castanho e vermelho n�o s�o\r\n"
				+ "incomuns. Seus olhos s�o azuis ou verdes com manchas\r\n"
				+ "douradas.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Intelig�ncia aumenta em 1.\r\n"
				+ "Treinamento �lfico com Armas. Voc� possui\r\n"
				+ "profici�ncia com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "Truque. Voc� conhece um truque, � sua escolha, da\r\n"
				+ "lista de truques do mago. Intelig�ncia � a habilidade\r\n"
				+ "usado para conjurar este truque.\r\n"
				+ "Idioma Adicional. Voc� pode falar, ler e escrever um\r\n"
				+ "idioma adicional � sua escolha.\r\n\n";
		return altoElfo;
	}
	
	public void setAltoElfo() {
		getFicha().setInteligencia(1);
		List<String> proficiencias_equips = Arrays.asList("Espadas longas", "Espadas curtas", "Arcos longos", "Arcos curtos");
		getFicha().setProfi_equips(proficiencias_equips);
	}
	
	public String getElfoDaFloresta() {
		String elfoDaFloresta = "ELFO DA FLORESTA\r\n\n"
				+ "Como um elfo da floresta, voc� possui sentidos e intui��o\r\n"
				+ "agu�ados, seus p�s �geis guiam-no r�pida e furtivamente\r\n"
				+ "atrav�s de suas florestas nativas. Essa categoria inclui os\r\n"
				+ "elfos selvagens (grugach) de Greyhawk e os Kagonesti de\r\n"
				+ "Dragonlance, bem como as ra�as chamadas de elfos da\r\n"
				+ "floresta em Greyhawk e nos Reinos Esquecidos. Em\r\n"
				+ "Faer�n, os elfos da floresta (tamb�m chamados de elfos\r\n"
				+ "selvagens, elfos verdes ou elfos do bosque) s�o reclusos e\r\n"
				+ "desconfiados dos n�o elfos.\r\n"
				+ "A pele dos elfos da floresta tende a ser de matiz\r\n"
				+ "cobreada, algumas vezes com tra�os esverdeados. Seu\r\n"
				+ "cabelo geralmente � castanho ou negro, mas\r\n"
				+ "ocasionalmente podem ser loiros ou cor de cobre. Seus\r\n"
				+ "olhos s�o verdes, castanhos ou cor de avel�.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Treinamento �lfico com Armas. Voc� possui\r\n"
				+ "profici�ncia com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "P�s Ligeiros. Seu deslocamento base de caminhada\r\n"
				+ "aumenta para 10,5 metros.\r\n"
				+ "M�scara da Natureza. Voc� pode tentar se esconder\r\n"
				+ "mesmo quando voc� est� apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, n�voa ou outro\r\n"
				+ "fen�meno natural.\r\n\n";
				
				return elfoDaFloresta;
	}
	
	public void setElfoDaFloresta() {
		getFicha().setSabedoria(1);
		List<String> proficiencias_equips = Arrays.asList("Espadas longas", "Espadas curtas", "Arcos longos", "Arcos curtos");
		getFicha().setProfi_equips(proficiencias_equips);
		getFicha().setDeslocamento("10,5");
		getFicha().setTracosraciais("M�scara da Natureza.\n\nVoc� pode tentar se esconder\r\n"
				+ "mesmo quando voc� est� apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, n�voa ou outro\r\n"
				+ "fen�meno natural.\n");
	}
	
	public String getElfoNegro() {
		String elfoNegro ="ELFO NEGRO(DROW)\r\n\n"
				+ "Descendentes de uma antiga sub-ra�a de elfos de pele\r\n"
				+ "negra, os drow foram banidos da superf�cie do mundo por\r\n"
				+ "seguirem a deusa Lolth pelo caminho do mal e corrup��o.\r\n"
				+ "Agora, eles constru�ram sua pr�pria civiliza��o nas\r\n"
				+ "profundezas do Subterr�neo, moldados pelo Caminho de\r\n"
				+ "Lolth. Tamb�m conhecidos como elfos negros, os drow\r\n"
				+ "possuem pele negra similar a obsidiana polida e cabelos\r\n"
				+ "brancos opacos ou amarelo p�lido. Normalmente eles\r\n"
				+ "possuem olhos muito p�lidos (t�o p�lidos que s�o\r\n"
				+ "confundidos com olhos brancos) com tons de lil�s, prata,\r\n"
				+ "rosa, vermelho e azul. Eles costumam ser menores e mais\r\n"
				+ "magros que a maioria dos elfos.\r\n"
				+ "Aventureiros drow s�o raros e a ra�a n�o existe em\r\n"
				+ "todo o mundo. Verifique com seu Mestre se a ra�a drow\r\n"
				+ "est� dispon�vel como personagem de jogador.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Vis�o no Escuro Superior. Sua vis�o no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\r\n"
				+ "Sensibilidade � Luz Solar. Voc� possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percep��o) relacionados a vis�o quando voc�, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que voc� est� tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n"
				+ "Magia Drow. Voc� possui o truque globos de luz.\r\n"
				+ "Quando voc� alcan�a o 3� n�vel, voc� pode conjurar a\r\n"
				+ "magia fogo das fadas. Quando voc� alcan�a o 5� n�vel,\r\n"
				+ "voc� pode conjurar escurid�o. Voc� precisa terminar um\r\n"
				+ "descanso longo para poder conjurar as magias desse tra�o\r\n"
				+ "novamente. Carisma � sua habilidade chave para\r\n"
				+ "conjurar essas magias.\r\n"
				+ "Treinamento Drow com Armas. Voc� possui\r\n"
				+ "profici�ncia com rapieiras, espadas curtas e bestas de m�o.\r\n\n";
		return elfoNegro;
	}
	
	public void setElfoNegro() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Vis�o no Escuro Superior.\n\nSua vis�o no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\n\n");
		getFicha().setTracosraciais("Sensibilidade � Luz Solar.\n\nVoc� possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percep��o) relacionados a vis�o quando voc�, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que voc� est� tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n\n");
		List<String> proficiencias_equips = Arrays.asList("Rapieiras", "Espadas curtas", "Bestas de m�o");
		getFicha().setProfi_equips(proficiencias_equips);
	}
	
}
