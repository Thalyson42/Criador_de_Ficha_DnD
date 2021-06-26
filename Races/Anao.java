package Races;

import CriadorDeFicha.Classes;

public class Anao extends Classes {

	public String anaoDescricao() {
		String anao = "AN�O\r\n\n"
				+ "Audazes e resistentes, os an�es s�o\r\n"
				+ "conhecidos como h�beis guerreiros,\r\n"
				+ "mineradores e trabalhadores em pedra e\r\n"
				+ "metal. Embora tenham menos de 1,50 metro\r\n"
				+ "de altura, os an�es s�o t�o largos e\r\n"
				+ "compactos que podem pesar tanto quanto\r\n"
				+ "um humano 60 cent�metros mais alto. Sua\r\n"
				+ "coragem e resist�ncia compete facilmente\r\n"
				+ "com qualquer povo mais alto. A pele dos\r\n"
				+ "an�es varia do marrom escuro a um matiz\r\n"
				+ "mais p�lido, tingido de vermelho, mas os tons mais\r\n"
				+ "comuns s�o o castanho claro ou bronzeado, como certos\r\n"
				+ "tons terrosos. O cabelo � longo, mas de estilo simples,\r\n"
				+ "geralmente negro, cinzento ou castanho, embora an�es\r\n"
				+ "mais p�lidos frequentemente possuem cabelos ruivos.\r\n"
				+ "An�es machos valorizam altamente suas barbas e\r\n"
				+ "preparam-nas com cuidado.\r\n\n"
				+ "TRA�OS RACIAIS DOS AN�ES\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de Constitui��o aumenta em 2.\r\n"
				+ "Idade. An�es tornam-se maduros na mesma propor��o que os humanos, mas s�o considerados jovens at� atingirem a idade de 50 anos. Em m�dia, eles vivem 350 anos.\r\n"
				+ "Tend�ncia. A maioria dos an�es � leal, pois acreditam firmemente nos benef�cios de uma sociedade bem organizada. Eles tendem para o bem, com um forte senso de\r\n"
				+ "honestidade e uma cren�a de que todos merecem compartilhar os benef�cios de uma ordem social justa.\r\n"
				+ "Tamanho. An�es est�o entre 1,20 e 1,50 metro de altura e pesam cerca de 75 kg. Seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada � de 7,5 metros. Seu deslocamento n�o � reduzido quando estiver usando armadura pesada.\r\n"
				+ "Vis�o no Escuro. Acostumado � vida subterr�nea, voc� tem uma vis�o superior no escuro e na penumbra. Voc� enxerga na penumbra a at� 18 metros como se fosse luz plena,\r\n"
				+ "e no escuro como se fosse na penumbra. Voc� n�o pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resili�ncia An�. Voc� possui vantagem em testes de resist�ncia contra venenos e resist�ncia contra dano de veneno.\r\n"
				+ "Treinamento An�o em Combate. Voc� tem profici�ncia com machados de batalha, machadinhas, martelos leves e martelos de guerra.\r\n"
				+ "Profici�ncia com Ferramentas. Voc� tem profici�ncia em uma ferramenta de artes�o � sua escolha entre: ferramentas de ferreiro, suprimentos de cervejeiro ou ferramentas de pedreiro.\r\n"
				+ "Especializa��o em Rochas. Sempre que voc� realizar um teste de Intelig�ncia (Hist�ria) relacionado � origem de um trabalho em pedra, voc� � considerado proficiente na per�cia\r\n"
				+ "Hist�ria e adiciona o dobro do seu b�nus de profici�ncia ao teste, ao inv�s do seu b�nus de profici�ncia normal.\r\n"
				+ "Idiomas. Voc� pode falar, ler e escrever Comum e An�o. O idioma An�o � repleto de consoantes duras e sons guturais, e essa caracter�stica influencia, como um sotaque, qualquer\r\n"
				+ "outro idioma que o an�o falar.\r\n"
				+ "Sub-ra�a. Existem duas sub-ra�as principais de an�es nos mundos de D&D: an�es da colina e an�es da montanha. Voc� deve escolher uma dessas sub-ra�as./r/n";
		return anao;
	}
	
	public void setRacaAnao() {
		getFicha().setRaca("An�o");
		getFicha().setConstituicao(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nAcostumado � vida subterr�nea,\r\n"
				+ "voc� tem uma vis�o superior no escuro e na penumbra.\r\n"
				+ "Voc� enxerga na penumbra a at� 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Voc�\r\n"
				+ "n�o pode discernir cores no escuro, apenas tons de cinza.\r\n");
		getFicha().setTracosraciais("Resili�ncia An�.\n\nVoc� possui vantagem em testes de\r\n"
				+ "resist�ncia contra venenos e resist�ncia contra dano de\r\n"
				+ "veneno.\n\n");
		getFicha().setTracosraciais("Especializa��o em Rochas.\n\nSempre que voc�\r\n"
				+ "realizar um teste de Intelig�ncia (Hist�ria) relacionado �\r\n"
				+ "origem de um trabalho em pedra, voc� � considerado\r\n"
				+ "proficiente na per�cia Hist�ria e adiciona o dobro do seu\r\n"
				+ "b�nus de profici�ncia ao teste, ao inv�s do seu b�nus de\r\n"
				+ "profici�ncia normal.\n\n");
		getFicha().setProfi_equips("Machados de batalha");
		getFicha().setProfi_equips("Machadinhas");
		getFicha().setProfi_equips("Martelos leves");
		getFicha().setProfi_equips("Martelos de guerra");
		getFicha().setProfi_ferramentas_peri("Ferramenta de artes�o");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("An�o");
	}
	
	public String anaoSRcolina() {
		String anaoSRcolina = "AN�O DA COLINA\r\n"
				+ "\n"
				+ "Como um an�o da colina, voc� tem sentidos agu�ados,\r\n"
				+ "maior intui��o e not�vel resili�ncia. Os an�es dourados de\r\n"
				+ "Faer�n, que vivem em seu poderoso reino ao sul do\r\n"
				+ "continente, s�o an�es da colina, assim como os exilados\r\n"
				+ "Neidar e os depreci�veis Klar de Krynn, no cen�rio de\r\n"
				+ "Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Tenacidade An�. Seu m�ximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o an�o da colina sobe um\r\n"
				+ "n�vel, ele recebe 1 ponto de vida adicional.\r\n";
		return anaoSRcolina;
	}
	
	public void setanaoSRcolina() {
		getFicha().setSabedoria(1);
		getFicha().setPontos_vida(1);
		getFicha().setTracosraciais("Tenacidade An�.\n\nSeu m�ximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o an�o da colina sobe um\r\n"
				+ "n�vel, ele recebe 1 ponto de vida adicional.");
	}
	
	public String anaoSRmontanha() {
		String anaoSRmontanha = "--AN�O DA MONTANHA--\n\n"
				+ "Como um an�o da montanha, voc� � forte e resistente,\r\n"
				+ "acostumados a uma vida dif�cil em terrenos dif�ceis. Voc�,\r\n"
				+ "provavelmente tem a descend�ncia daqueles mais altos\r\n"
				+ "(para um an�o) e tende a possuir uma colora��o mais\r\n"
				+ "clara. Os an�es do escudo do norte de Faer�n, bem como o\r\n"
				+ "cl� governante Hylar e os cl�s nobres Daewar de\r\n"
				+ "Dragonlance, s�o an�es da montanha.\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de For�a aumenta em 2.\r\n"
				+ "Treinamento An�o com Armaduras. Voc� adquire profici�ncia em armaduras leves e m�dias.\r\n\n";
		return anaoSRmontanha;
	}
	
	public void setanaoSRmontanha() {
		getFicha().setForca(2);
		getFicha().setProfi_equips("Armaduras leves");
		getFicha().setProfi_equips("Armaduras m�dias");
	}

	
}
