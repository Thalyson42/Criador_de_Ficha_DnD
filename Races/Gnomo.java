package Races;

import CriadorDeFicha.Classes;

public class Gnomo extends Classes{

	public String gnomoDescricao() {
		String gnomo = "GNOMO\r\n\n"
				+ "A energia e entusiasmo dos gnomos pela vida brilha em\r\n"
				+ "cada pedacinho do seu pequeno corpo. Um gnomo padr�o\r\n"
				+ "tem aproximadamente 90 cent�metros de altura e pesa\r\n"
				+ "entre 20 e 23 kg. Seus rostos morenos ou bronzeados s�o\r\n"
				+ "geralmente adornados com largos sorrisos (apesar dos\r\n"
				+ "seus prodigiosos narizes) e seus olhos brilhantes vibram\r\n"
				+ "de emo��o. Seus cabelos claros tendem a ser espichados,\r\n"
				+ "como se expressassem o insaci�vel interesse dos gnomos\r\n"
				+ "em tudo a sua volta.\r\n"
				+ "A personalidade de um gnomo � muito maior que sua\r\n"
				+ "apar�ncia. A barba de um gnomo macho, em contraste\r\n"
				+ "com seu cabelo bagun�ado, mantem se perfeitamente\r\n"
				+ "aparada, mas as vezes, tem um bigode estiloso e pontas\r\n"
				+ "curiosas. Apesar da roupa de um gnomo geralmente\r\n"
				+ "possuir tons modestos de terra, ele ostenta bordados,\r\n"
				+ "estampas ou joias reluzentes.\r\n\n"
				+ "TRA�OS RACIAIS DOS GNOMOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Intelig�ncia aumenta em 2.\r\n"
				+ "Idade. Gnomos amadurecem a mesma propor��o que\r\n"
				+ "os humanos e, a maioria, atinge a idade adulta por volta\r\n"
				+ "dos 40 anos. Eles podem viver entre 350 e 500 anos.\r\n"
				+ "Tend�ncia. Os gnomos geralmente s�o bons. Os que\r\n"
				+ "tendem para a ordem s�o s�bios, engenheiros,\r\n"
				+ "pesquisadores, escol�sticos, investigadores ou inventores.\r\n"
				+ "Os que tendem ao caos s�o menestr�is, engenhoqueiros,\r\n"
				+ "andarilhos ou joalheiros caprichosos. Gnomos s�o bons de\r\n"
				+ "cora��o e, at� mesmo os trapaceiros entre eles tendem a\r\n"
				+ "ser mais brincalh�es que perversos.\r\n"
				+ "Tamanho. Os gnomos tem entre 0,90 e 1,20 metro e\r\n"
				+ "seu peso m�dio � de 20 kg. Seu tamanho � Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 7,5 metros.\r\n"
				+ "Vis�o no Escuro. Acostumado � vida subterr�nea,\r\n"
				+ "voc� tem uma vis�o superior no escuro e na penumbra.\r\n"
				+ "Voc� enxerga na penumbra a at� 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Voc�\r\n"
				+ "n�o pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Esperteza Gn�mica. Voc� possui vantagem em todos\r\n"
				+ "os testes de resist�ncia de Intelig�ncia, Sabedoria e\r\n"
				+ "Carisma contra magia.\r\n"
				+ "Idiomas. Voc� sabe falar, ler e escrever Comum e\r\n"
				+ "Gn�mico. A linguagem Gn�mica, que usa o alfabeto An�o,\r\n"
				+ "� conhecida por suas t�cnicas de disserta��o e por seus\r\n"
				+ "cat�logos de conhecimento sobre o mundo natural.\r\n"
				+ "Sub-ra�as. Duas sub-ra�as de gnomos s�o\r\n"
				+ "encontradas ao redor dos mundos de D&D: os gnomos da\r\n"
				+ "floresta e os gnomos das rochas. Escolha uma dessas subra�as.\r\n";
		return gnomo;
	}
	
	public void setGnomo() {
		getFicha().setInteligencia(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nAcostumado � vida subterr�nea,\r\n"
				+ "voc� tem uma vis�o superior no escuro e na penumbra.\r\n"
				+ "Voc� enxerga na penumbra a at� 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Voc�\r\n"
				+ "n�o pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTracosraciais("Esperteza Gn�mica.\n\nVoc� possui vantagem em todos\r\n"
				+ "os testes de resist�ncia de Intelig�ncia, Sabedoria e\r\n"
				+ "Carisma contra magia.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Gn�mico");
	}
	
	public String getGnomoDaFloresta() {
		String gnomoDaFloresta = "GNOMO DA FLORESTA\r\n\n"
				+ "Como um gnomo da floresta, voc� possui um traquejo\r\n"
				+ "natural com ilus�es e velocidade e furtividade naturais.\r\n"
				+ "Nos mundos de D&D, gnomos da floresta s�o raros e\r\n"
				+ "reservados. Eles vivem em comunidades escondidas em\r\n"
				+ "florestas silvestres, usando suas ilus�es e truques para se\r\n"
				+ "esconderem das amea�as ou para mascarar sua fuga\r\n"
				+ "antes de serem detectados. Gnomos da floresta tendem a\r\n"
				+ "ser amig�veis com outros povos da floresta espirituosos e\r\n"
				+ "eles tem nos elfos e fadas bondosas como seus mais\r\n"
				+ "importantes aliados. Eles gnomos tamb�m fazem amizade\r\n"
				+ "com pequenos animais silvestres e contam com eles para\r\n"
				+ "obter informa��es sobre amea�as que estejam\r\n"
				+ "perambulando por suas terras.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 1.\r\n"
				+ "Ilusionista Nato. Voc� conhece o truque ilus�o\r\n"
				+ "menor. Intelig�ncia � a sua habilidade usada para\r\n"
				+ "conjur�-la.\r\n"
				+ "Falar com Bestas Pequenas. Atrav�s de sons e\r\n"
				+ "gestos, voc� pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estima��o.\r\n\n";
		return gnomoDaFloresta;
	}
	
	public void setGnomoDaFloresta() {
		getFicha().setDestreza(1);
		//Ilusionista Nato. Voc� conhece o truque ilus�o menor. Intelig�ncia � a sua habilidade usada para conjur�-la.
		getFicha().setTracosraciais("Falar com Bestas Pequenas.\n\nAtrav�s de sons e\r\n"
				+ "gestos, voc� pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estima��o.\n\n");
	}
	
	public String getGnomoDasRochas() {
		String gnomoDasRochas = "GNOMO DAS ROCHAS\r\n\n"
				+ "Como um gnomo das rochas, voc� possui uma\r\n"
				+ "inventividade e resist�ncia naturais acima dos outros\r\n"
				+ "gnomos. A maioria dos gnomos nos mundos de D&D s�o\r\n"
				+ "gnomos das rochas, incluindo os gnomos engenhoqueiros\r\n"
				+ "do cen�rio de Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constitui��o aumenta em 1.\r\n"
				+ "Conhecimento de Art�fice. Toda vez que voc� fizer\r\n"
				+ "um teste de Intelig�ncia (Hist�ria) relacionado a itens\r\n"
				+ "m�gicos, objetos alqu�micos ou mecanismos tecnol�gicos,\r\n"
				+ "voc� pode adicionar o dobro do seu b�nus de profici�ncia,\r\n"
				+ "ao inv�s de qualquer b�nus de profici�ncia que voc�\r\n"
				+ "normalmente use.\r\n"
				+ "Engenhoqueiro: Voc� possui profici�ncia com\r\n"
				+ "ferramentas de artes�o (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, voc� pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Mi�do (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar ap�s 24 horas (a\r\n"
				+ "n�o ser que voc� gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando voc� usa sua a��o\r\n"
				+ "para desmantel�-lo; nesse momento, voc� pode recuperar\r\n"
				+ "o material usado para cri�-lo. Voc� pode ter at� tr�s\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando voc� criar um mecanismo, escolha uma das\r\n"
				+ "seguintes op��es:\r\n"
				+ "Brinquedo Mec�nico. Esse brinquedo � um animal,\r\n"
				+ "monstro ou pessoa mec�nica, como um sapo, rato,\r\n"
				+ "p�ssaro, drag�o ou soldado. Quando colocado no ch�o,\r\n"
				+ "o brinquedo se move 1,5 metro pelo ch�o em cada um\r\n"
				+ "dos seus turnos em uma dire��o aleat�ria. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n"
				+ "Isqueiro Mec�nico. O mecanismo produz uma\r\n"
				+ "miniatura de chama, que voc� pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua a��o.\r\n"
				+ "Caixa de M�sica. Quando aberta, essa caixa de\r\n"
				+ "m�sica toca uma can��o a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcan�a\r\n"
				+ "o fim da m�sica ou quando � fechada.\r\n\n";
		return gnomoDasRochas;
	}
	
	public void setGnomoDasRochas() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Conhecimento de Art�fice.\n\nToda vez que voc� fizer\r\n"
				+ "um teste de Intelig�ncia (Hist�ria) relacionado a itens\r\n"
				+ "m�gicos, objetos alqu�micos ou mecanismos tecnol�gicos,\r\n"
				+ "voc� pode adicionar o dobro do seu b�nus de profici�ncia,\r\n"
				+ "ao inv�s de qualquer b�nus de profici�ncia que voc�\r\n"
				+ "normalmente use.\n\n");
		getFicha().setTracosraciais("Engenhoqueiro.\n\nVoc� possui profici�ncia com\r\n"
				+ "ferramentas de artes�o (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, voc� pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Mi�do (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar ap�s 24 horas (a\r\n"
				+ "n�o ser que voc� gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando voc� usa sua a��o\r\n"
				+ "para desmantel�-lo; nesse momento, voc� pode recuperar\r\n"
				+ "o material usado para cri�-lo. Voc� pode ter at� tr�s\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando voc� criar um mecanismo, escolha uma das\r\n"
				+ "seguintes op��es:\r\n\n"
				+ "Brinquedo Mec�nico.\nEsse brinquedo � um animal,\r\n"
				+ "monstro ou pessoa mec�nica, como um sapo, rato,\r\n"
				+ "p�ssaro, drag�o ou soldado. Quando colocado no ch�o,\r\n"
				+ "o brinquedo se move 1,5 metro pelo ch�o em cada um\r\n"
				+ "dos seus turnos em uma dire��o aleat�ria. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n\n"
				+ "Isqueiro Mec�nico.\nO mecanismo produz uma\r\n"
				+ "miniatura de chama, que voc� pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua a��o.\r\n\n"
				+ "Caixa de M�sica.\nQuando aberta, essa caixa de\r\n"
				+ "m�sica toca uma can��o a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcan�a\r\n"
				+ "o fim da m�sica ou quando � fechada.\n\n");
	}
	
}
