package Races;

import CriadorDeFicha.Classes;

public class Anao extends Classes {

	public String anaoDescricao() {
		String anao = "ANÃO\r\n\n"
				+ "Audazes e resistentes, os anões são\r\n"
				+ "conhecidos como hábeis guerreiros,\r\n"
				+ "mineradores e trabalhadores em pedra e\r\n"
				+ "metal. Embora tenham menos de 1,50 metro\r\n"
				+ "de altura, os anões são tão largos e\r\n"
				+ "compactos que podem pesar tanto quanto\r\n"
				+ "um humano 60 centímetros mais alto. Sua\r\n"
				+ "coragem e resistência compete facilmente\r\n"
				+ "com qualquer povo mais alto. A pele dos\r\n"
				+ "anões varia do marrom escuro a um matiz\r\n"
				+ "mais pálido, tingido de vermelho, mas os tons mais\r\n"
				+ "comuns são o castanho claro ou bronzeado, como certos\r\n"
				+ "tons terrosos. O cabelo é longo, mas de estilo simples,\r\n"
				+ "geralmente negro, cinzento ou castanho, embora anões\r\n"
				+ "mais pálidos frequentemente possuem cabelos ruivos.\r\n"
				+ "Anões machos valorizam altamente suas barbas e\r\n"
				+ "preparam-nas com cuidado.\r\n\n"
				+ "TRAÇOS RACIAIS DOS ANÕES\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de Constituição aumenta em 2.\r\n"
				+ "Idade. Anões tornam-se maduros na mesma proporção que os humanos, mas são considerados jovens até atingirem a idade de 50 anos. Em média, eles vivem 350 anos.\r\n"
				+ "Tendência. A maioria dos anões é leal, pois acreditam firmemente nos benefícios de uma sociedade bem organizada. Eles tendem para o bem, com um forte senso de\r\n"
				+ "honestidade e uma crença de que todos merecem compartilhar os benefícios de uma ordem social justa.\r\n"
				+ "Tamanho. Anões estão entre 1,20 e 1,50 metro de altura e pesam cerca de 75 kg. Seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada é de 7,5 metros. Seu deslocamento não é reduzido quando estiver usando armadura pesada.\r\n"
				+ "Visão no Escuro. Acostumado à vida subterrânea, você tem uma visão superior no escuro e na penumbra. Você enxerga na penumbra a até 18 metros como se fosse luz plena,\r\n"
				+ "e no escuro como se fosse na penumbra. Você não pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resiliência Anã. Você possui vantagem em testes de resistência contra venenos e resistência contra dano de veneno.\r\n"
				+ "Treinamento Anão em Combate. Você tem proficiência com machados de batalha, machadinhas, martelos leves e martelos de guerra.\r\n"
				+ "Proficiência com Ferramentas. Você tem proficiência em uma ferramenta de artesão à sua escolha entre: ferramentas de ferreiro, suprimentos de cervejeiro ou ferramentas de pedreiro.\r\n"
				+ "Especialização em Rochas. Sempre que você realizar um teste de Inteligência (História) relacionado à origem de um trabalho em pedra, você é considerado proficiente na perícia\r\n"
				+ "História e adiciona o dobro do seu bônus de proficiência ao teste, ao invés do seu bônus de proficiência normal.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e Anão. O idioma Anão é repleto de consoantes duras e sons guturais, e essa característica influencia, como um sotaque, qualquer\r\n"
				+ "outro idioma que o anão falar.\r\n"
				+ "Sub-raça. Existem duas sub-raças principais de anões nos mundos de D&D: anões da colina e anões da montanha. Você deve escolher uma dessas sub-raças./r/n";
		return anao;
	}
	
	public void setRacaAnao() {
		getFicha().setRaca("Anão");
		getFicha().setConstituicao(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Visão no Escuro.\n\nAcostumado à vida subterrânea,\r\n"
				+ "você tem uma visão superior no escuro e na penumbra.\r\n"
				+ "Você enxerga na penumbra a até 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Você\r\n"
				+ "não pode discernir cores no escuro, apenas tons de cinza.\r\n");
		getFicha().setTracosraciais("Resiliência Anã.\n\nVocê possui vantagem em testes de\r\n"
				+ "resistência contra venenos e resistência contra dano de\r\n"
				+ "veneno.\n\n");
		getFicha().setTracosraciais("Especialização em Rochas.\n\nSempre que você\r\n"
				+ "realizar um teste de Inteligência (História) relacionado à\r\n"
				+ "origem de um trabalho em pedra, você é considerado\r\n"
				+ "proficiente na perícia História e adiciona o dobro do seu\r\n"
				+ "bônus de proficiência ao teste, ao invés do seu bônus de\r\n"
				+ "proficiência normal.\n\n");
		getFicha().setProfi_equips("Machados de batalha");
		getFicha().setProfi_equips("Machadinhas");
		getFicha().setProfi_equips("Martelos leves");
		getFicha().setProfi_equips("Martelos de guerra");
		getFicha().setProfi_ferramentas_peri("Ferramenta de artesão");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Anão");
	}
	
	public String anaoSRcolina() {
		String anaoSRcolina = "ANÃO DA COLINA\r\n"
				+ "\n"
				+ "Como um anão da colina, você tem sentidos aguçados,\r\n"
				+ "maior intuição e notável resiliência. Os anões dourados de\r\n"
				+ "Faerûn, que vivem em seu poderoso reino ao sul do\r\n"
				+ "continente, são anões da colina, assim como os exilados\r\n"
				+ "Neidar e os depreciáveis Klar de Krynn, no cenário de\r\n"
				+ "Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Tenacidade Anã. Seu máximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o anão da colina sobe um\r\n"
				+ "nível, ele recebe 1 ponto de vida adicional.\r\n";
		return anaoSRcolina;
	}
	
	public void setanaoSRcolina() {
		getFicha().setSabedoria(1);
		getFicha().setPontos_vida(1);
		getFicha().setTracosraciais("Tenacidade Anã.\n\nSeu máximo de pontos de vida\r\n"
				+ "aumentam em 1, e cada vez que o anão da colina sobe um\r\n"
				+ "nível, ele recebe 1 ponto de vida adicional.");
	}
	
	public String anaoSRmontanha() {
		String anaoSRmontanha = "--ANÃO DA MONTANHA--\n\n"
				+ "Como um anão da montanha, você é forte e resistente,\r\n"
				+ "acostumados a uma vida difícil em terrenos difíceis. Você,\r\n"
				+ "provavelmente tem a descendência daqueles mais altos\r\n"
				+ "(para um anão) e tende a possuir uma coloração mais\r\n"
				+ "clara. Os anões do escudo do norte de Faerûn, bem como o\r\n"
				+ "clã governante Hylar e os clãs nobres Daewar de\r\n"
				+ "Dragonlance, são anões da montanha.\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de Força aumenta em 2.\r\n"
				+ "Treinamento Anão com Armaduras. Você adquire proficiência em armaduras leves e médias.\r\n\n";
		return anaoSRmontanha;
	}
	
	public void setanaoSRmontanha() {
		getFicha().setForca(2);
		getFicha().setProfi_equips("Armaduras leves");
		getFicha().setProfi_equips("Armaduras médias");
	}

	
}
