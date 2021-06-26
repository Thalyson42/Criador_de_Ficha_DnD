package Races;

import CriadorDeFicha.Classes;

public class MeioOrc extends Classes{

	public String meio_orcDescricao() {
		String meio_orc = "MEIO ORC\r\n\n"
				+ "A pigmenta��o acinzentada dos meio-orcs, suas testas\r\n"
				+ "avantajadas, mand�bulas salientes, dentes proeminentes\r\n"
				+ "e corpos grandes torna sua heran�a orc not�vel para todos\r\n"
				+ "os observadores. Meio-orcs tem entre 1,80 metro e 2,10\r\n"
				+ "metros e, normalmente pesam entre 90 kg e 125 kg.\r\n"
				+ "Orcs ostentam cicatrizes de batalha como pe�as de\r\n"
				+ "orgulho e consideram cicatrizes ornamentais como coisas\r\n"
				+ "bonitas. Outras cicatrizes, no entanto, marcam um orc ou\r\n"
				+ "meio-orc como um ex-escravo ou um exilado desonrado.\r\n"
				+ "Qualquer meio-orc que tenha vivido entre ou pr�ximo dos\r\n"
				+ "orcs ter� cicatrizes, independentemente de serem marcas\r\n"
				+ "de humilha��o ou de orgulho, recontando suas fa�anhas e\r\n"
				+ "ferimentos do passado. At� mesmo um meio-orc que viva\r\n"
				+ "entre os humanos dever� mostrar essas cicatrizes\r\n"
				+ "orgulhosamente ou escond�-las com vergonha.\r\n\n"
				+ "TRA�OS RACIAIS DOS MEIO ORCS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "For�a aumenta em 2 e seu valor de Constitui��o\r\n"
				+ "aumenta em 1.\r\n"
				+ "Idade. Os meio-orcs amadurecem um pouco antes\r\n"
				+ "dos humanos, atingindo a idade adulta aos 14 anos.\r\n"
				+ "Eles envelhecem notavelmente mais r�pido e, raramente,\r\n"
				+ "vivem mais de 75 anos.\r\n"
				+ "Tend�ncia. Meio-orcs tem uma tend�ncia inata ao\r\n"
				+ "caos devido aos seus parentes orcs e n�o s�o fortemente\r\n"
				+ "inclinados ao bem. Meio-orcs que cresceram entre orcs e\r\n"
				+ "desejam viver e est�o dispostos a passar sua vida entre\r\n"
				+ "eles, tendem a ser malignos.\r\n"
				+ "Tamanho. Meio-orcs s�o de certa forma maiores e\r\n"
				+ "mais largos que os humanos, medindo entre 1,80 metro e\r\n"
				+ "2,10 metros. Seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Vis�o no Escuro. Gra�as ao seu sangue orc, voc� tem\r\n"
				+ "uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Amea�ador. Voc� adquire profici�ncia na per�cia\r\n"
				+ "Intimida��o.\r\n"
				+ "Resist�ncia Implac�vel. Quando voc� � reduzido a\r\n"
				+ "0 pontos de vida mas n�o � completamente morto, voc�\r\n"
				+ "pode voltar para 1 ponto de vida. Voc� n�o pode usar essa\r\n"
				+ "caracter�stica novamente at� completar um descanso\r\n"
				+ "longo.\r\n"
				+ "Ataques Selvagens. Quando voc� atinge um ataque\r\n"
				+ "cr�tico com uma arma corpo-a-corpo, voc� pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicion�-lo ao\r\n"
				+ "dano extra causado pelo acerto cr�tico.\r\n"
				+ "Idiomas. Voc� sabe falar, ler e escrever Comum, Orc.\r\n"
				+ "O Orc � um idioma r�spido, possuindo uma linguagem de\r\n"
				+ "consoantes duras. Ele n�o possui alfabeto pr�prio, mas\r\n"
				+ "usa o alfabeto An�o.\r\n";
		return meio_orc;
	}
	
	public void setMeio_orc() {
		getFicha().setForca(2);
		getFicha().setConstituicao(1);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nGra�as ao seu sangue orc, voc� tem\r\n"
				+ "uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTem_intimidacao();
		getFicha().setTracosraciais("Resist�ncia Implac�vel.\n\nQuando voc� � reduzido a\r\n"
				+ "0 pontos de vida mas n�o � completamente morto, voc�\r\n"
				+ "pode voltar para 1 ponto de vida. Voc� n�o pode usar essa\r\n"
				+ "caracter�stica novamente at� completar um descanso longo.\n\n");
		getFicha().setTracosraciais("Ataques Selvagens.\n\nQuando voc� atinge um ataque\r\n"
				+ "cr�tico com uma arma corpo-a-corpo, voc� pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicion�-lo ao\r\n"
				+ "dano extra causado pelo acerto cr�tico.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Orc");
	}
	
}
