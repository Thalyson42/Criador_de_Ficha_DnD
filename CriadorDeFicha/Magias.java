package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;

public class Magias {
	private FichaDoPersonagem ficha;
	private ArrayList<String> truques = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV1 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV2 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV3 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV4 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV5 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV6 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV7 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV8 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV9 = new ArrayList<String>();
	private ArrayList<String> descricao_truques = new ArrayList<String>();
	private ArrayList<String> descricao_magias = new ArrayList<String>();
	
	public void setFicha(FichaDoPersonagem ficha) {
		this.ficha = ficha;
	}
	
	public FichaDoPersonagem getFicha() {
		return ficha;
	}
	
	public void setAllTruques() {
		List<String> AllTruques = Arrays.asList("Amizade", "Ataque Certeiro", "Bord�o M�stico", "Chama Sagrada", "Chicote de Espinhos", "Consertar", "Criar Chamas", "Druidismo", "Espirro �cido", "Estabilizar", "Globos de Luz", "Ilus�o Menor", "Luz", "M�os M�gicas", "Mensagem", "Orienta��o", "Prestidigita��o", "Prote��o contra L�minas", "Raio de Fogo", "Raio de Gelo", "Rajada de Veneno", "Rajada M�stica", "Resist�ncia", "Taumaturgia", "Toque Arrepiante", "Toque Chocante", "Zombaria Viciosa");
		this.truques.addAll(AllTruques);
		List<String> descricao_truques = Arrays.asList(/*Amizade*/ "Pela dura��o, voc� ter� vantagem em todos os testes de\r\n"
				+ "Carisma direcionados a uma criatura, � sua escolha, que\r\n"
				+ "n�o seja hostil a voc�. Quando a magia acabar, a criatura\r\n"
				+ "perceber� que voc� usou maia para influenciar o humor\r\n"
				+ "dela, e ficar� hostil a voc�. Uma criatura propensa a\r\n"
				+ "viol�ncia ir� atacar voc�. Outra criatura pode buscar\r\n"
				+ "outras formas de retalia��o (a crit�rio do Mestre),\r\n"
				+ "dependendo da natureza da sua intera��o com ela.\r\n",
				/*Ataque Certeiro*/"Voc� estende sua m�o e aponta o dedo para um alvo no\r\n"
				+ "alcance. Sua magia garante a voc� uma breve intui��o\r\n"
				+ "sobre as defesas do alvo. No seu pr�ximo turno, voc� ter�\r\n"
				+ "vantagem na primeira jogada de ataque contra o alvo,\r\n"
				+ "considerando que essa magia n�o tenha acabado.\n",
				/*Bord�o M�stico*/"A madeira de uma clava ou bord�o, que voc� esteja\r\n"
				+ "segurando, � imbu�da com o poder da natureza. Pela\r\n"
				+ "dura��o, voc� pode usar sua habilidade de conjura��o ao\r\n"
				+ "inv�s da sua For�a para as jogadas de ataque e dano\r\n"
				+ "corpo-a-corpo usando essa arma, e o dado de dano da\r\n"
				+ "arma se torna um d8. A arma tamb�m se torna m�gica, se\r\n"
				+ "ela j� n�o for. A magia acaba se voc� conjura-la\r\n"
				+ "novamente ou se voc� soltar a arma.\n",
				/*Chama Sagrada*/"Radia��o similar a uma chama desce sobre uma criatura\r\n"
				+ "que voc� possa ver, dentro do alcance. O alvo deve ser\r\n"
				+ "bem sucedido num teste de resist�ncia de Destreza ou\r\n"
				+ "sofrer� 1d8 de dano radiante. O alvo n�o recebe qualquer\r\n"
				+ "benef�cio de cobertura contra esse teste de resist�ncia.\r\n"
				+ "O dano da magia aumenta em 1d8 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d8), 11� n�vel (3d8) e 17� n�vel (4d8).\n",
				/*Chicote de Espinhos*/"Voc� cria um longo chicote de vinhas coberto por espinhos\r\n"
				+ "que chicoteia, ao seu comando, em dire��o de uma\r\n"
				+ "criatura dentro do alcance. Realize um ataque corpo-acorpo com magia contra o alvo. Se o ataque atingir, a\r\n"
				+ "criatura sofrer� 1d6 de dano perfurante e, se a criatura\r\n"
				+ "for Grande ou menor, voc� a puxa at� 3 metros para perto\r\n"
				+ "de voc�.\r\n"
				+ "O dano dessa magia aumenta em 1d6 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d6), 11� n�vel (3d6) e 17� n�vel (4d6).",
				/*Consertar*/"Essa magia repara um �nica quebra ou fissura em um\r\n"
				+ "objeto que voc� tocar, como um elo quebrado de uma\r\n"
				+ "corrente, duas metades de uma chave partida, um manto\r\n"
				+ "rasgado ou o vazamento em um odre. Contanto que a\r\n"
				+ "quebra ou fissura n�o tenha mais de 30 cent�metros em\r\n"
				+ "qualquer dimens�o, voc� pode remenda-la, n�o deixando\r\n"
				+ "qualquer vest�gio do dano anterior.\r\n"
				+ "Essa magia pode reparar fisicamente um item m�gico\r\n"
				+ "ou constructo, mas a magia n�o ir� restaurar a magia em\r\n"
				+ "tais objetos.\r\n",
				/*Criar Chamas*/"Uma chama tremulante aparece na sua m�o. A chama\r\n"
				+ "permanece ai pela dura��o e n�o machuca nem voc� nem\r\n"
				+ "seu equipamento. A chama emite luz plena num raio de 3\r\n"
				+ "metros e penumbra por 3 metros adicionais. A magia\r\n"
				+ "acaba se voc� dissipa-la usando uma a��o ou se conjura-la\r\n"
				+ "novamente.\r\n"
				+ "Voc� pode, tamb�m, atacar com a chama, no entanto,\r\n"
				+ "fazer isso acaba com a magia. Quando voc� conjura essa\r\n"
				+ "magia ou com uma a��o em um turno posterior, voc� pode\r\n"
				+ "arremessar a chama numa criatura a at� 9 metros de\r\n"
				+ "voc�. Fa�a um ataque � dist�ncia com magia. Se atingir, o\r\n"
				+ "alvo sofre 1d8 de dano de fogo.\r\n"
				+ "O dano dessa magia aumenta em 1d8 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d8), 11� n�vel (3d8) e 17� n�vel (4d8).\n",
				/*Druidismo*/"Sussurrando para os esp�ritos da natureza, voc� cria um\r\n"
				+ "dos seguintes efeitos, dentro do alcance:\r\n"
				+ "- Voc� cria um efeito sensorial min�sculo e inofensivo\r\n"
				+ "que prev� como ser� o clima na sua localiza��o pelas\r\n"
				+ "pr�ximas 24 horas. O efeito deve se manifestar como\r\n"
				+ "um globo dourado para c�u claro, uma nuvem para\r\n"
				+ "chuva, flocos de neve para nevasca e assim por diante.\r\n"
				+ "Esse efeito persiste por 1 rodada.\r\n"
				+ "- Voc� faz uma flor florescer, uma semente brotar ou um\r\n"
				+ "folha amadurecer, instantaneamente.\r\n"
				+ "- Voc� cria um efeito sensorial inofensivo instant�neo,\r\n"
				+ "como folhas caindo, um sopro de vento, o som de um\r\n"
				+ "pequeno animal ou o suave odor de um repolho. O\r\n"
				+ "efeito deve caber num cubo de 1,5 metro.\r\n"
				+ "- Voc�, instantaneamente, acennde ou apaga uma vela,\r\n"
				+ "tocha ou fogueira pequena.\r\n",
				/*Espirro �cido*/"Voc� arremessa uma bolha de �cido. Escolha uma\r\n"
				+ "criatura dentro do alcance, ou escolha duas criaturas\r\n"
				+ "dentro do alcance que estejam a 1,5 metro uma da outra.\r\n"
				+ "Um alvo deve ser bem sucedido num teste de resist�ncia\r\n"
				+ "de Destreza ou sofrer� 1d6 de dano �cido.\r\n"
				+ "O dano dessa magia aumenta em 1d6 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d6), 11� n�vel (3d6) e 17� n�vel (4d6).\n",
				/*Estabilizar*/"Voc� toca uma criatura viva que esteja com 0 pontos de\r\n"
				+ "vida. A criatura � estabilizada. Essa magia n�o afeta\r\n"
				+ "mortos-vivos ou constructos.\r\n",
				/*Globos de Luz*/"Voc� cria at� quatro luzes do tamanho de tochas dentro\r\n"
				+ "do alcance, fazendo-as parecerem tochas, lanternas ou\r\n"
				+ "esferas luminosas que flutuam no ar pela dura��o. Voc�\r\n"
				+ "tamb�m pode combinar as quatro luzes em uma forma\r\n"
				+ "luminosa, vagamente humanoide, de tamanho M�dio.\r\n"
				+ "Qualquer que seja a forma que voc� escolher, cada luz\r\n"
				+ "produz penumbra num raio de 3 metros.\r\n"
				+ "Com uma a��o b�nus, no seu turno, voc� pode mover\r\n"
				+ "as luzes, at� 18 metros, para um novo local dentro do\r\n"
				+ "alcance. Uma luz deve estar a, pelo menos, 6 metros de\r\n"
				+ "outra luz criada por essa magia e uma luz some se\r\n"
				+ "exceder o alcance da magia.\n",
				/*Ilus�o Menor*/"Voc� cria um som ou uma imagem de um objeto, dentro\r\n"
				+ "do alcance, que permanece pela dura��o. A ilus�o tamb�m\r\n"
				+ "termina se voc� dissipa-la usando uma a��o ou conjurar\r\n"
				+ "essa magia novamente.\r\n"
				+ "Se voc� criar um som, seu volume pode variar entre\r\n"
				+ "um sussurro at� um grito. Pode ser a sua voz, a voz de\r\n"
				+ "outrem, o rugido de um le�o, batidas de tambor ou\r\n"
				+ "qualquer outro som que voc� quiser. O som permanece no\r\n"
				+ "mesmo volume durante toda dura��o ou voc� pode fazer\r\n"
				+ "sons distintos em momentos diferentes, antes da magia\r\n"
				+ "acabar.\r\n"
				+ "Se voc� criar uma imagem de um objeto � como uma\r\n"
				+ "cadeira, pegadas de lama ou um pequeno ba� � ela n�o\r\n"
				+ "pode ter mais de 1,5 metro c�bico. A imagem n�o pode\r\n"
				+ "produzir som, luz, cheiro ou qualquer outro efeito\r\n"
				+ "sensorial. Intera��o f�sica com a imagem revelar� que ela\r\n"
				+ "� uma ilus�o, j� que as coisas podem atravessa-la.\r\n"
				+ "Se uma criatura usar sua a��o para examinar a\r\n"
				+ "imagem, ela pode determinar que ela � uma ilus�o se\r\n"
				+ "obtiver sucesso num teste de Intelig�ncia (Investiga��o)\r\n"
				+ "contra a CD da magia. Se uma criatura discernir a ilus�o\r\n"
				+ "como sendo isso, a ilus�o se tornar� suave para a\r\n"
				+ "criatura.\n",
				/*Luz*/"Voc� toca um objeto que n�o tenha mais 3 metros em\r\n"
				+ "qualquer dimens�o. At� a magia acabar, o objeto emite\r\n"
				+ "luz plena num raio de 6 metros e penumbra por 6 metros\r\n"
				+ "adicionais. Cobrir o objeto completamente com alguma\r\n"
				+ "coisa opaca bloquear� a luz. A magia termina se voc�\r\n"
				+ "conjura-la novamente ou dissipa-la com uma a��o.\r\n"
				+ "Se voc� tentar afetar um objeto segurado ou vestido\r\n"
				+ "por uma criatura hostil, a criatura deve ser bem sucedida\r\n"
				+ "num teste de Destreza para evitar a magia.\r\n",
				/*M�os M�gicas*/"Uma m�o espectral flutuante aparece num ponto, � sua\r\n"
				+ "escolha, dentro do alcance. A m�o permanece pela\r\n"
				+ "dura��o ou at� voc� dissipa-la com uma a��o. A m�o some\r\n"
				+ "se estiver a mais de 9 metros de voc� ou se voc� conjurar\r\n"
				+ "essa magia novamente.\r\n"
				+ "Voc� pode usar sua a��o para controlar a m�o. Voc�\r\n"
				+ "pode usar a m�o para manipular um objeto, abrir uma\r\n"
				+ "porta ou recipiente destrancado, guardar ou pegar um\r\n"
				+ "item de um recipiente aberto ou derramar o conte�do de\r\n"
				+ "um frasco. Voc� pode mover a m�o at� 9 metros a cada\r\n"
				+ "vez que a usa.\r\n"
				+ "A m�o n�o pode atacar, ativar itens m�gicos ou\r\n"
				+ "carregar mais de 5 quilos.\r\n",
				/*Mensagem*/"Voc� aponta seu dedo para uma criatura dentro do\r\n"
				+ "alcance e sussurra uma mensagem. O alvo (e apenas ele)\r\n"
				+ "ouvi a mensagem e pode responder com um sussurro que\r\n"
				+ "apenas voc� pode ouvir.\r\n"
				+ "Voc� pode conjurar essa magia atrav�s de objetos\r\n"
				+ "s�lidos se voc� tiver familiaridade com o alvo. Sil�ncio\r\n"
				+ "m�gico, 30 cent�metros de rocha, 2,5 cent�metros de metal\r\n"
				+ "comum, uma fina camada de chumbo, ou 90 cent�metros\r\n"
				+ "de madeira ou terra bloqueiam a magia. A magia n�o\r\n"
				+ "precisa seguir uma linha reta e pode viajar livremente,\r\n"
				+ "dobrando esquinas ou atrav�s de aberturas.\n",
				/*Orienta��o*/"Voc� toca uma criatura volunt�ria. Uma vez, antes da\r\n"
				+ "magia acabar, o alvo pode rolar um d4 e adicionar o\r\n"
				+ "n�mero rolado a um teste de habilidade a escolha dele.\r\n"
				+ "Ele pode rolar o dado antes ou depois de realizar o teste\r\n"
				+ "de habilidade. Ap�s isso, a magia termina.\r\n",
				/*Prestidigita��o*/"Essa magia � um truque m�gico simples que conjuradores\r\n"
				+ "iniciantes usam para praticar. Voc� cria um dos seguintes\r\n"
				+ "efeitos m�gicos dentro do alcance:\r\n"
				+ "- Voc� cria, instantaneamente, um efeito sensorial\r\n"
				+ "inofensivo, como uma chuva de fa�scas, um sopro de\r\n"
				+ "vento, notas musicais suaves ou um odor estranho.\r\n"
				+ "- Voc�, instantaneamente, acende ou apaga uma vela,\r\n"
				+ "uma tocha ou uma pequena fogueira.\r\n"
				+ "- Voc�, instantaneamente, limpa ou suja um objeto de\r\n"
				+ "at� 1 metro c�bico.\r\n"
				+ "- Voc� esfria, esquenta ou melhora o sabor de at� 1\r\n"
				+ "metro cubico de mat�ria inorg�nica por 1 hora.\r\n"
				+ "- Voc� faz uma cor, uma pequena marca ou um s�mbolo\r\n"
				+ "aparecer em um objeto ou superf�cie por 1 hora.\r\n"
				+ "- Voc� cria uma bugiganga n�o-m�gica ou uma imagem\r\n"
				+ "ilus�ria que caiba na sua m�o e que dura at� o final do\r\n"
				+ "seu pr�ximo turno.\r\n"
				+ "Se voc� conjurar essa magia diversas vezes, voc� pode\r\n"
				+ "ter at� tr�s dos seus efeitos n�o-instant�neos ativos, ao\r\n"
				+ "mesmo tempo, e voc� pode dissipar um desses efeitos com\r\n"
				+ "uma a��o.\n",
				/*Prote��o contra L�minas*/"Voc� estende suas m�os e desenha um s�mbolo de\r\n"
				+ "prote��o no ar. At� o final do seu pr�ximo turno, voc� ter�\r\n"
				+ "resist�ncia contra dano de concuss�o, cortante e\r\n"
				+ "perfurante causado por ataques com armas.\n",
				/*Raio de Fogo*/"Voc� arremessa um cisco de fogo em uma criatura ou\r\n"
				+ "objeto dentro do alcance. Fa�a um ataque � dist�ncia com\r\n"
				+ "magia contra o alvo. Se atingir, o alvo sofre 1d10 de dano\r\n"
				+ "de fogo. Um objeto inflam�vel atingido por essa magia,\r\n"
				+ "incendeia se n�o estiver sendo vestido ou carregado.\r\n"
				+ "O dano dessa magia aumenta em 1d10 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d10), 11� n�vel (3d10) e 17� n�vel\r\n"
				+ "(4d10).\r\n",
				/*Raio de Gelo*/"Um raio frigido de luz azul clara parte em dire��o de uma\r\n"
				+ "criatura, dentro do alcance. Realize um ataque �\r\n"
				+ "dist�ncia com magia contra o alvo. Se atingir, ele sofre\r\n"
				+ "1d8 de dano de frio e seu deslocamento � reduzido em 3\r\n"
				+ "metros at� o come�o do seu pr�ximo turno.\r\n"
				+ "O dano da magia aumenta em 1d8 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d8), 11� n�vel (3d8) e 17� n�vel (4d8).\n",
				/*Rajada de Veneno*/"Voc� ergue sua m�o em dire��o de uma criatura que voc�\r\n"
				+ "possa ver, dentro do alcance e projeta um sopro de g�s\r\n"
				+ "t�xico da sua palma. A criatura deve ser bem sucedida\r\n"
				+ "num teste de resist�ncia de Constitui��o ou sofrer� 1d12\r\n"
				+ "de dano de veneno.\r\n"
				+ "O dano dessa magia aumenta em 1d12 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d12), 11� n�vel (3d12) e 17� n�vel\r\n"
				+ "(4d12).\n",
				/*Rajada M�stica*/"Um feixe de energia crepitante vai em dire��o a uma\r\n"
				+ "criatura dentro do alcance. Realize uma jogada de ataque\r\n"
				+ "� dist�ncia com magia contra o alvo. Se atingir, o alvo\r\n"
				+ "sofre 1d10 de dano de energia.\r\n"
				+ "A magia cria mais de um feixe quando voc� alcan�a\r\n"
				+ "n�veis elevados: dois feixes no 5� n�vel, tr�s feixes no 11�\r\n"
				+ "n�vel e quatro feixes no 17� n�vel. Voc� pode direcionar os\r\n"
				+ "feixes para o mesmo alvo ou para alvos diferentes. Realize\r\n"
				+ "jogadas de ataque separadas para cada feixe.\n",
				/*Resist�ncia*/"Voc� toca uma criatura volunt�ria. Uma vez, antes da\r\n"
				+ "magia acabar, o alvo pode rolar um d4 e adicionar o valor\r\n"
				+ "jogado a um teste de resist�ncia de sua escolha. Ele pode\r\n"
				+ "rolar o dado antes ou depois de realizar o teste de\r\n"
				+ "resist�ncia. Ent�o, a magia termina.\r\n",
				/*Taumaturgia*/"Voc� manifesta pequenas maravilhas, um sinal de poder\r\n"
				+ "sobrenatural, dentro do alcance. Voc� cria um dos\r\n"
				+ "seguintes efeitos m�gicos dentro do alcance:\r\n"
				+ "- Sua voz ressoa com o triplo do volume normal por 1\r\n"
				+ "minuto.\r\n"
				+ "- Voc� provoca tremores inofensivos no solo por 1\r\n"
				+ "minuto.\r\n"
				+ "- Voc� cria, instantaneamente, um som que se origina\r\n"
				+ "de um ponto, � sua escolha, dentro do alcance, como o\r\n"
				+ "barulho de um trov�o, o gralhar de um corvo ou\r\n"
				+ "sussurros sinistros.\r\n"
				+ "- Voc�, instantaneamente, faz uma porta ou janela\r\n"
				+ "destrancada se abrir ou se fechar.\r\n"
				+ "- Voc� altera a apar�ncia dos seus olhos por 1 minuto.\r\n"
				+ "Se voc� conjurar essa magia diversas vezes, voc� pode\r\n"
				+ "ter at� tr�s dos efeitos de 1 minuto ativos por vez, e voc�\r\n"
				+ "pode dissipar um desses efeitos com uma a��o.\r\n",
				/*Toque Arrepiante*/"Voc� cria uma m�o esquel�tica fantasmag�rica no espa�o\r\n"
				+ "de uma criatura, dentro do alcance. Realize um ataque �\r\n"
				+ "dist�ncia com magia contra a criatura para afeta-la com o\r\n"
				+ "frio sepulcral. Se atingir, a criatura sofre 1d8 de dano\r\n"
				+ "necr�tico e n�o poder� recuperar pontos de vida at� o\r\n"
				+ "in�cio do seu pr�ximo turno. At� l�, a m�o ficar� presa ao\r\n"
				+ "alvo.\r\n"
				+ "Se voc� atingir um alvo morto-vivo, ele ter�\r\n"
				+ "desvantagem nas jogadas de ataque contra voc� at� o\r\n"
				+ "final do seu pr�ximo turno.\r\n"
				+ "O dano dessa magia aumenta em 1d8 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d8), 11� n�vel (3d8) e 17� n�vel (4d8).\n",
				/*Toque Chocante*/"Eletricidade surge da sua m�o para transmitir um choque\r\n"
				+ "em uma criatura que voc� tentar tocar. Fa�a um ataque\r\n"
				+ "corpo-a-corpo com magia contra o alvo. Voc� tem\r\n"
				+ "vantagem na jogada de ataque se o alvo estiver vestindo\r\n"
				+ "qualquer armadura de metal. Se atingir, o alvo sofre 1d8\r\n"
				+ "de dano el�trico e n�o pode usar rea��es at� o in�cio do\r\n"
				+ "pr�ximo turno dele.\r\n"
				+ "O dano da magia aumenta em 1d8 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d8), 11� n�vel (3d8) e 17� n�vel (4d8).\r\n",
				/*Zombaria Viciosa*/"Voc� libera uma s�rie de insultos atados com\r\n"
				+ "encantamentos sutis numa criatura que voc� possa ver,\r\n"
				+ "dentro do alcance. Se o alvo puder ouvir voc� (apesar de\r\n"
				+ "n�o precisar compreende-lo), ele deve ser bem sucedido\r\n"
				+ "num teste de resist�ncia de Sabedoria ou sofrer� 1d4 de\r\n"
				+ "dano ps�quico e ter� desvantagem na pr�xima jogada de\r\n"
				+ "ataque que ele fizer antes do final do pr�ximo turno dele.\r\n"
				+ "O dano dessa magia aumenta em 1d4 quando voc�\r\n"
				+ "alcan�a o 5� n�vel (2d4), 11� n�vel (3d4) e 17� n�vel (4d4).\r\n");
		this.descricao_truques.addAll(descricao_truques);
	}
	
	//Alterar futuramente
	public void truquesBardo() {
		List<String> truquesBardo = Arrays.asList("Amizade", "Ataque Certeiro", "Consertar", "Globos de Luz", "Ilus�o Menor", "Luz", "M�os M�gicas", "Mensagem", "Prestidigita��o", "Prote��o contra L�minas", "Zombaria Viciosa");
		setTruques(truquesBardo, 2);
	}
	
	public void truquesBruxo() {
		List<String> truquesBruxo = Arrays.asList("Amizade", "Ataque Certeiro", "Ilus�o Menor", "M�os M�gicas", "Prestidigita��o", "Prote��o contra L�minas", "Rajada de Veneno", "Rajada M�stica", "Toque Arrepiante");
		setTruques(truquesBruxo, 2);
	}
	
	public void truquesClerigo() {
		List<String> truquesClerigo = Arrays.asList("Chama Sagrada", "Consertar", "Estabilidade", "Luz", "Orienta��o", "Resist�ncia", "Taumaturgia");
		setTruques(truquesClerigo, 3);
	}
	
	public void truquesDruida() {
		List<String> truquesDruida = Arrays.asList("Bord�o M�stico", "Chicote de Espinhos", "Consertar", "Criar Chamas", "Druidismo", "Orienta��o", "Rajada de Veneno", "Resist�ncia");
		setTruques(truquesDruida, 2);
	}
	
	public void truquesFeiticeiro() {
		List<String> truquesFeiticeiro = Arrays.asList("Amizade", "Ataque Certeiro", "Consertar", "Espirro �cido", "Globos de Luz", "Ilus�o Menor", "Luz", "M�os M�gicas", "Mensagem", "Prestidigita��o", "Prote��o contra L�minas", "Raio de Fogo", "Raio de Gelo", "Rajada de Veneno", "Toque Arrepiante", "Toque Chocante");
		setTruques(truquesFeiticeiro, 4);
	}
	
	public void truquesMago() {
		List<String> truquesMago = Arrays.asList("Amizade", "Ataque Certeiro", "Consertar", "Espirro �cido", "Globos de Luz", "Ilus�o Menor", "Luz", "M�os M�gicas", "Mensagem", "Prestidigita��o", "Prote��o contra L�minas", "Raio de Fogo", "Raio de Gelo", "Rajada de Veneno", "Toque Arrepiante", "Toque Chocante");
		setTruques(truquesMago, 3);
	}
	

	public void setTruques(List<String> truque, int c) {
		setAllTruques();
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> listaTruques = new ArrayList<String>();
		listaTruques.addAll(truque);
		ArrayList<String> truquesEscolhidos = new ArrayList<String>();
		
		int opcao;
		int count = c;
		while(count != 0) {
			System.out.println("Escolha " +count +" truques:");
			for(int i = 0; i < listaTruques.size(); i++) {
				System.out.println(i +" - " +listaTruques.get(i));
			}
			
			do {
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > listaTruques.size());
			
			char decisao;
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				for(int i = 0; i < truques.size(); i++) {
					if(Objects.equals(listaTruques.get(opcao), this.truques.get(i))) {
						System.out.println(this.descricao_truques.get(i));
					}
				}
				System.out.println("Deseja adicionar " +listaTruques.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				if(decisao == 'Y' || decisao == 'y') {
					truquesEscolhidos.add(listaTruques.get(opcao));
					listaTruques.remove(opcao);
					count--;
					decisaoLoop = true;
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}

		}
		this.ficha.setTruques(truquesEscolhidos);
	}
	
	public void getTruques() {
		
	}
	
	public void setAllMagiasLV1() {
		List<String> listaMagiasLV1 = Arrays.asList("Alarme", "�rea Escorregadia", "Armadura Arcana", "Armadura de Agathys", "Amizade Animal", "Aux�lio Divino", "B�n��o", "Bom Fruto", "Bra�os de Hadar", "Bruxaria", "Comando", "Compreender Idiomas", "Constri��o", "Convocar Familiar", "Criar ou Destruir �gua", "Curar Ferimentos", "Destrui��o Col�rica", "Destrui��o Lancinante", "Destrui��o Trovejante", "Detectar Magia", "Detectar o Bem e Mal", "Detectar Veneno e Doen�a", "Disfar�ar-se", "Duelo Compelido", "Enfeiti�ar Pessoa", "Escrita Ilus�ria", "Escudo Arcano", "Escudo da F�", "Falar com Animais", "Fogo das Fadas", "Golpe Constritor", "Hero�smo", "Identifica��o", "Imagem Silenciosa", "Infringir Ferimentos", "Leque Crom�tico", "M�os Flamejantes", "Marca do Ca�ador", "M�sseis M�gicos", "N�voa Obscurecente", "Onda Trovejante", "Orbe Crom�tica", "Queda Suave", "Palavra Curativa", "Passos Longos", "Perdi��o", "Prote��o contra o Bem e Mal", "Purificar Alimentos", "Queda Suave", "Raio Adoecente", "Raio de Bruxa", "Raio Guiador", "Recuo Acelerado", "Repreens�o Infernal", "Riso Hist�rico de Tasha", "Salto", "Santu�rio", "Saraivada de Espinhos", "Servo Invis�vel", "Sono", "Sussurros Dissonantes", "Vitalidade Falsa");
		this.nome_magiaLV1.addAll(listaMagiasLV1);
	}
	
	public void setMagiasBardoLV1() {
		List<String> listaMagiasBardoLV1 = Arrays.asList("Amizade Animal", "Compreender Idiomas", "Curar Ferimentos", "Detectar Magia", "Disfar�ar-se", "Enfeiti�ar Pessoa", "Escrita Ilus�ria", "Falar com Animais", "Fogo das Fadas", "Hero�smo", "Identifica��o", "Identifica��o", "Imagem Silenciosa", "Onda Trovejante", "Queda Suave", "Palavra Curativa", "Passos Longos", "Perdi��o", "Riso Hist�rico de Tasha", "Servo Invis�vel", "Sono", "Sussurros Dissonantes");
		setMagiasLV1(listaMagiasBardoLV1, 4);
	}
	
	public void setMagiasBruxoLV1() {
		List<String> listaMagiasBruxoLV1 = Arrays.asList("Armadura de Agathys", "Bra�os de Hadar", "Bruxaria", "Compreender Idiomas", "Enfeiti�ar Pessoa", "Escrita Ilus�ria", "Prote��o contra o Bem e Mal", "Raio de Bruxa", "Recuo Acelerado", "Repreens�o Infernal", "Servo Invis�vel");
		setMagiasLV1(listaMagiasBruxoLV1, 2);
	}
	
	public void setMagiasClerigoLV1() {
		List<String> listaMagiasClerigoLV1 = Arrays.asList("B�n��o", "Comando", "Criar ou Destruir �gua", "Curar Ferimentos", "Detectar Magia", "Detectar o Bem e Mal", "Detectar Veneno e Doen�a", "Escudo da F�", "Infringir Ferimentos", "Palavra Curativa", "Perdi��o", "Prote��o contra o Bem e Mal", "Purificar Alimentos", "Raio Guiador", "Santu�rio");
		setMagiasLV1(listaMagiasClerigoLV1, 2);
	}
	
	public void setMagiasDruidaLV1() {
		List<String> listaMagiasDruidaLV1 = Arrays.asList("Amizade Animal", "Bom Fruto", "Constri��o", "Criar ou Destruir �gua", "Curar Ferimentos", "Detectar Magia", "Detectar Magia", "Detectar Veneno e Doen�a", "Enfeiti�ar Pessoa", "Falar com Animais", "Fogo das Fadas", "N�voa Obscurecente", "Onda Trovejante", "Palavra Curativa", "Passos Longos", "Purificar Alimentos", "Salto");
		setMagiasLV1(listaMagiasDruidaLV1, 2);
	}
	
	public void setMagiasFeiticeiroLV1() {
		List<String> listaMagiasFeiticeiroLV1 = Arrays.asList("Armadura Arcana", "Compreender Idiomas", "Detectar Magia", "Disfar�a-se", "Enfeiti�ar Pessoa", "Escudo Arcano", "Imagem Silenciosa", "Leque Cr�matico", "M�os M�gicas", "N�voa Obscurecente", "Onda Trovejante", "Orbe Crom�tica", "Queda suave", "Raio de Bruxa", "Recuo Acelerado", "Sono", "Salto", "Vitalidade Falsa");
		setMagiasLV1(listaMagiasFeiticeiroLV1, 2);
	}
	
	public void setMagiasMagoLV1() {
		List<String> listaMagiasMagoLV1 = Arrays.asList("Alarme", "�rea Escorregadia", "Armadura Arcana", "Compreender Idiomas", "Convocar Familiar", "Detectar Magia", "Disco Flutuante de Tenser", "Disfar�ar-se", "Enfeiti�ar Pessoa", "Escrita Ilus�ria", "Escudo Arcano", "Identifica��o", "Imagem Silenciosa", "Leque Crom�tico", "M�os Flamejantes", "M�sseis M�gicos", "N�voa Obscurecente", "Onda Trovejante", "Orb Crom�tica", "Passos Longos", "Prote��o contra o Bem e Mal", "Queda Suave", "Raio Adoecente", "Raio de Bruxa", "Rec�o Acelerado", "Riso Hist�rico de Tasha", "Salto", "Servo Invis�vel", "Sono", "Vitalidade Falsa");
		setMagiasLV1(listaMagiasMagoLV1, 6);
	}
	
	public void setMagiasPaladinoLV1() {
		List<String> listaMagiasPaladinoLV1 = Arrays.asList("Aux�lio Divino", "B�n��o", "Comando", "Curar Ferimentos", "Destrui��o Col�rica", "Destrui��o Lancinante", "Destrui��o Trovejante", "Detectar o Bem e Mal", "Dectetar Magia", "Detectar Veneno e Doen�a", "Duelo Compelido", "Escudo da F�", "Hero�smo", "Prote��o contra o Bem e Mal", "Purificar Alimentos");
		setMagiasLV1(listaMagiasPaladinoLV1, 2);
	}
	
	public void setMagiasPatrulheiro() {
		List<String> listaMagiasPatrulheiroLV1 = Arrays.asList("Alarme", "Amizade Animal", "Bom Fruto", "Curar Ferimentos", "Detectar Magia", "Detectar Veneno e Doen�a", "Falar com Animais", "Golpe Constritor", "Marca do Ca�ador", "N�voa Obscurecente", "Passos Longos", "Salto", "Saraivada de Espinhos");
		setMagiasLV1(listaMagiasPatrulheiroLV1, 2);
	}
	
	public void setMagiasLV1(List<String> magias, int c) {
		setAllMagiasLV1();
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> listaMagiasLV1 = new ArrayList<String>();
		listaMagiasLV1.addAll(magias);
		ArrayList<String> magiasLV1Escolhidas = new ArrayList<String>();
		
		int opcao;
		int count = c;
		while(count != 0) {
			System.out.println("Escolha " +count +" truques:");
			for(int i = 0; i < listaMagiasLV1.size(); i++) {
				System.out.println(i +" - " +listaMagiasLV1.get(i));
			}
			
			do {
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > listaMagiasLV1.size());
			
			char decisao;
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				for(int i = 0; i < nome_magiaLV1.size(); i++) {
					if(Objects.equals(listaMagiasLV1.get(opcao), this.nome_magiaLV1.get(i))) {
						System.out.println(this.descricao_magias.get(i));
					}
				}
				System.out.println("Deseja adicionar " +listaMagiasLV1.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				if(decisao == 'Y' || decisao == 'y') {
					magiasLV1Escolhidas.add(listaMagiasLV1.get(opcao));
					listaMagiasLV1.remove(opcao);
					count--;
					decisaoLoop = true;
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}

		}
		this.ficha.setMagiasLV1(magiasLV1Escolhidas);
	}
	
	public void setAllMagiasLV2() {
		List<String> listaMagiasLV2 = Arrays.asList("Acalmar Emo��es", "Aprimorar Habilidade", "Arrombar", "Boca Encantada", "Cativar", "Cegueira/Surdez", "Coroa da Loucura", "Esquentar Metal", "Despeda�ar", "For�a Fantasmag�rica", "Detectar Pensamentos", "Imobilizar Pessoas", "Invisibilidade", "Localizar Objeto", "Mensageiro Animal", "Nuvem de Adagas", "Restaura��o Menor", "Sil�ncio", "Sugest�o", "Ver o Invis�vel", "Zona da Verdade");
		this.nome_magiaLV2.addAll(listaMagiasLV2);
	}
	
	public void setMagiasBardoLV2() {
		List<String> listaMagiasBardoLV2 = Arrays.asList("Acalmar Emo��es", "Aprimorar Habilidade", "Arrombar", "Boca Encantada", "Cativar", "Cegueira/Surdez", "Coroa da Loucura", "Esquentar Metal", "Despeda�ar", "For�a Fantasmag�rica", "Detectar Pensamentos", "Imobilizar Pessoas", "Invisibilidade", "Localizar Objeto", "Mensageiro Animal", "Nuvem de Adagas", "Restaura��o Menor", "Sil�ncio", "Sugest�o", "Ver o Invis�vel", "Zona da Verdade");
		
	}
	
	public void setMagiasBruxoLV2() {
		List<String> listaMagiasBardoLV2 = Arrays.asList("Cativar", "Coroa da Loucura", "Despeda�ar", "Escurid�o", "Imobilizar Pessoa", "Nuvem de Adagas", "Passo Nebuloso", "Patas de Aranha", "Raio do Enfraquecimento", "Reflexos", "Sugest�o");
		
	}
	
	public void setMagiasClerigoLV2() {
		List<String> listaMagiasBardoLV2 = Arrays.asList("Acalmar", "Ajuda", "Aprimorar Habilidade", "Arma Esperitual", "Aug�rio", "Cegueira/Surdez", "Chama Continua", "Encontrar Armadilhas", "Imobilizar Pessoa", "Localizar Objeto", "Ora��o", "Curativa", "Prote��o contra Veneno", "Repouso Tranquilo", "Restaura��o Menor", "Sil�ncio", "V�nculo Protetor", "Zona da Verdade");
	}
	
	public void setMagiaDruidaLV2() {
		List<String> listaMagiaDruidaLV2 = Arrays.asList("Aprimorar Habilidade", "Crescer Espinhos", "Encontrar Armadilhas", "Esfera Flamejante", "Esquentar Metal", "Imobilizar Pessoa", "L�mina Flamejante", "Localizar Animais ou Plantas", "Localizar Objeto", "Lufada de Vento", "Mensageiro Animal", "Passos sem Pegadas", "Pele de �rvore", "Prote��o contra Veneno", "Raio Lunar", "Restaura��o Menor", "Sentido Bestial", "Vis�o no Escuro");
	}
	
	//Tiefling Inicio /Verificar para mudan�as
	public void setLegadoInfernal() {
		setAllTruques();
		if(this.ficha.getNivel() >= 1) {
			if(verifyTruque("Taumaturgia") == false) this.ficha.setTruques("Taumaturgia");
		}else if(this.ficha.getNivel() >= 3) {
			if(verifyMagia("Repreens�o Infernal", 1) == false) this.ficha.setMagiasLV2("Repreens�o infernal");
		}else if(this.ficha.getNivel() >= 5) {
			if(verifyMagia("Repreens�o Infernal", 2) == false) this.ficha.setMagiasLV2("Escurid�o");
		}
	}
	
	public boolean verifyTruque(String truque) {
		for(int i = 0; i > this.ficha.getTruques().size(); i++) {
			if(Objects.equals(truque, this.ficha.getTruques().get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean verifyMagia(String magia, int nivel) {
		switch(nivel) {
		case 1:
			for(int i = 0; i > this.ficha.getMagiasLV1().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV1().get(i))) {
					return true;
				}
			}
		break;
		
		case 2:
			for(int i = 0; i > this.ficha.getMagiasLV2().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV2().get(i))) {
					return true;
				}
			}
		break;
		
		case 3:
			for(int i = 0; i > this.ficha.getMagiasLV3().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV3().get(i))) {
					return true;
				}
			}
		break;
		
		case 4:
			for(int i = 0; i > this.ficha.getMagiasLV4().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV4().get(i))) {
					return true;
				}
			}
		break;
		
		case 5:
			for(int i = 0; i > this.ficha.getMagiasLV5().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV5().get(i))) {
					return true;
				}
			}
		break;
		
		case 6:
			for(int i = 0; i > this.ficha.getMagiasLV6().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV6().get(i))) {
					return true;
				}
			}
		break;
		
		case 7:
			for(int i = 0; i > this.ficha.getMagiasLV7().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV7().get(i))) {
					return true;
				}
			}
		break;
		
		case 8:
			for(int i = 0; i > this.ficha.getMagiasLV8().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV8().get(i))) {
					return true;
				}
			}
		break;
		
		case 9:
			for(int i = 0; i > this.ficha.getMagiasLV9().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV9().get(i))) {
					return true;
				}
			}
		break;
		}
		return false;
	}
	//Tiefling Fim
}
