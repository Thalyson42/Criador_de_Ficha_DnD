package CriadorDeFicha;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Barbaro extends Classes{
	private final List<String> pericias = Arrays.asList("Adestrar Animais", "Atletismo", "Intimida��o", "Natureza", "Percep��o", "Sobreviv�ncia");
	private final int max_quantidade_pericias = 2;
	
	public List<String> getPericiasList() {
		return this.pericias;
	}
	
	public int getMaxQuantidadePericias() {
		return this.max_quantidade_pericias;
	}
	
	public String barbaroDescricao() {
		String descricao = "BARBARO\r\n\n"
				+ "Um humano alto membro de alguma tribo caminha em\r\n"
				+ "meio a uma nevasca, coberto por peles e empunhando seu\r\n"
				+ "machado. Ele gargalha � medida que avan�a em dire��o\r\n"
				+ "do gigante do gelo que ousou ca�ar os alces que o seu povo\r\n"
				+ "arrebanhava.\r\n"
				+ "Uma meio-orc rosna para o �ltimo que ousou desafiar\r\n"
				+ "sua autoridade sobre a tribo selvagem, pronta para\r\n"
				+ "quebrar seu pesco�o com suas m�os nuas da mesma\r\n"
				+ "forma que ela fez com os outros seis rivais anteriores.\r\n"
				+ "Espumando pela boca, um an�o bate com seu elmo na\r\n"
				+ "cara de um inimigo drow, depois dirige seu cotovelo\r\n"
				+ "armadurado na dire��o do estomago de outro.\r\n"
				+ "Esses b�rbaros, diferentes da forma que conseguem,\r\n"
				+ "s�o definidos por sua f�ria: desenfreada, inextingu�vel e\r\n"
				+ "irracional f�ria. Mais que uma mera emo��o, sua raiva �\r\n"
				+ "a ferocidade de um predador acuado, o assalto implac�vel\r\n"
				+ "de uma tempestade, a turbul�ncia agitada do mar.\r\n"
				+ "Para alguns, suas f�rias emerge da comunh�o com\r\n"
				+ "ferozes esp�ritos animais. Outras provem de um\r\n"
				+ "reservat�rio turvo de raiva de um mundo cheio de dor.\r\n"
				+ "Para cada b�rbaro, a f�ria � um poder que preenche n�o\r\n"
				+ "apenas o frenesi de batalha, mas tamb�m reflexos,\r\n"
				+ "resili�ncia e proezas de for�a incr�veis.\r\n"
				+ "\n";
		return descricao;
	}
	
	public String barbaroTabela() {
		String tabelaBarbaro = "O B�rbaro\r\n"
				+ "N�vel	B�nus de Profici�ncia	Caracter�sticas		F�rias	Dano de F�ria\r\n"
				+ "1�			  +2		  F�ria, Defesa semArmadura	  2 		+2\r\n"
				+ "2� +2 Ataque Descuidado,\r\n"
				+ "Sentido de Perigo\r\n"
				+ "2 +2\r\n"
				+ "3� +2 Caminho Primitivo 3 +2\r\n"
				+ "4� +2 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "3 +2\r\n"
				+ "5� +3 Ataque Extra,\r\n"
				+ "Movimento R�pido\r\n"
				+ "3 +2\r\n"
				+ "6� +3 Caracter�stica de Caminho\r\n"
				+ "Primitivo\r\n"
				+ "4 +2\r\n"
				+ "7� +3 Instinto Selvagem 4 +2\r\n"
				+ "8� +3 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "4 +2\r\n"
				+ "9� +4 Cr�tico Brutal (+1 dado) 4 +3\r\n"
				+ "10� +4 Caracter�stica de Caminho\r\n"
				+ "Primitivo\r\n"
				+ "4 +3\r\n"
				+ "11� +4 F�ria Implac�vel 4 +3\r\n"
				+ "12� +4 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "5 +3\r\n"
				+ "13� +5 Cr�tico Brutal (+2 dados) 5 +3\r\n"
				+ "14� +5 Caracter�stica de Caminho\r\n"
				+ "Primitivo\r\n"
				+ "5 +3\r\n"
				+ "15� +5 F�ria Persistente 5 +3\r\n"
				+ "16� +5 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "5 +4\r\n"
				+ "17� +6 Cr�tico Brutal (+3 dados) 6 +4\r\n"
				+ "18� +6 For�a Indom�vel 6 +4\r\n"
				+ "19� +6 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "6 +4\r\n"
				+ "20� +6 Campe�o Primitivo Ilimitado +4\r\n";
		return tabelaBarbaro;
	}
	
	public String barbaroCaracteristicasClasse() {
		String caracteristicas = "PONTOS DE VIDA\r\n"
				+ "\n"
				+ "Dado de Vida: 1d12 por n�vel de b�rbaro\r\n"
				+ "Pontos de Vida no 1� N�vel: 12 + seu modificador de\r\n"
				+ "Constitui��o\r\n"
				+ "Pontos de Vida nos N�veis Seguintes: 1d12 (ou 7) +\r\n"
				+ "seu modificador de Constitui��o por n�vel de b�rbaro\r\n"
				+ "ap�s o 1�\r\n"
				+ "\n"
				+ "PROFICI�NCIAS\r\n"
				+ "\n"
				+ "Armaduras: Armaduras leves, armaduras m�dias e\r\n"
				+ "escudos\r\n"
				+ "Armas: Armas simples, armas marciais\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resist�ncia: For�a, Constitui��o\r\n"
				+ "Per�cias: Escolha duas dentre Adestrar Animais,\r\n"
				+ "Atletismo, Intimida��o, Natureza, Percep��o e\r\n"
				+ "Sobreviv�ncia\r\n"
				+ "\n"
				+ "EQUIPAMENTO\r\n"
				+ "\n"
				+ "Voc� come�a com o seguinte equipamento, al�m do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) um machado grande ou (b) qualquer arma marcial\r\n"
				+ "corpo-a-corpo\r\n"
				+ "- (a) dois machados de m�o ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "- Um pacote de aventureiro e quatro azagaias\r\n";
		return caracteristicas;
	}
	
	public void setBarbaro() {
		setNome("Barbaro");
		getFicha().setClasse(getNome());
		getFicha().setBonus_proficiencia(2);
		List<String> profiRes = Arrays.asList("For�a", "Constitui��o");
		getProficiencia().SetResistencia(profiRes);
		
		List<String> proficiencia_equips = Arrays.asList("Armaduras leves", "Armaduras m�dias", "Escudos", "Armas simples", "Armas marciais");
		getProficiencia().SetProfEquips(proficiencia_equips);
			
//		System.out.println("--Equipamentos--");
//		System.out.println("Voc� come�a com os seguintes equipamentos, al�m dos equipamentos"
//				+ "concedidos pelo seu antecedente:");
//		
//		getEquips().iniciaAllarmas();
//		equips1();
//		equips2();
		
		for(int i = 0; i < getEquips().getArmas_simples_CAC().size(); i++) {
			if(Objects.equals(new String("Azagaia"), getEquips().getArmas_simples_CAC().get(i))) {
				getFicha().setEquipamentos(getEquips().getArmas_simples_CAC().get(i) +" (4)");
			}
		}
		setbarFuria();
		setbarDefesaSemArmadura();
		
	}

//	public void setEquips(Equipamentos equips) {
//		this.equips = equips;
//	}
	
	public void equips1() {
		Scanner entrada = new Scanner(System.in);
		boolean equip1Loop = false;
		while(equip1Loop == false) {
			int equip1Menu;
			System.out.println("Escolha entre (1) um machado grande ou (2) qualquer arma marcial corpo-a-corpo.");
			
			equip1Menu = entrada.nextInt();
			switch(equip1Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("Tem certeza que deseja escolher Machado Grande? (Y/N)");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						for(int i = 0; i < getEquips().getArmas_marciais_CAC().size(); i++) {
							if(Objects.equals(new String("Machado Grande"), getEquips().getArmas_marciais_CAC().get(i))) {
								getFicha().setEquipamentos(getEquips().getArmas_marciais_CAC().get(i));
							}
						}
						decisaoLoop = true;
						equip1Loop = true;
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
					
				}
				
			break;
			
			case 2:
				getFicha().setEquipamentos(getEquips().setArmaCACMarcial());
			break;
			}
		}
	}
	
	public void equips2() {
		Scanner entrada = new Scanner(System.in);
		boolean equip2Loop = false;
		while(equip2Loop == false) {
			int equip2Menu;
			System.out.println("Escolha entre (1) dois machados de m�o ou (2) qualquer arma simples.");
			
			equip2Menu = entrada.nextInt();
			switch(equip2Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("Tem certeza que deseja escolher os dois machados de m�o? (Y/N)");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						for(int i = 0; i < getEquips().getArmas_simples_CAC().size(); i++) {
							if(Objects.equals(new String("Machadinha"), getEquips().getArmas_simples_CAC().get(i))) {
								getFicha().setEquipamentos(getEquips().getArmas_simples_CAC().get(i) +" (2)");
							}
						}
						decisaoLoop = true;
						equip2Loop = true;
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
					
				}
				
			break;
			
			case 2:
				char decisaocase2;
				boolean decisao2Loop = false;
				boolean case2Loop = false;
				int escolha;
				while(case2Loop == false) {
					
					do {
						System.out.println("Escolha uma das armas:");
					
						System.out.println("Nome     Dano     Propriedades");
						for(int i = 0; i < getEquips().getArmas_simples_CAC().size(); i++) {
							System.out.println((i+1) +" - " +getEquips().getArmas_simples_CAC().get(i) +" | " +getEquips().getAS_CAC_dano().get(i) +" | " +getEquips().getAS_CAC_propriedades().get(i));
						}
						
						for(int i = 0; i < getEquips().getArmas_simples_distancia().size(); i++) {
							System.out.printf((i+getEquips().getArmas_simples_CAC().size()+1) +" - " +getEquips().getArmas_simples_distancia().get(i) +" | " +getEquips().getAS_D_dano().get(i) +" | " +getEquips().getAS_D_propriedades().get(i));
						}
						
						while(!entrada.hasNextInt()) {
							System.out.println("Por favor digite um numero!");
							entrada.next();
						}
						
						escolha = entrada.nextInt();
					}while(escolha <= 0 || escolha > (getEquips().getArmas_simples_CAC().size()+getEquips().getArmas_simples_distancia().size()-1));
					
					while(decisao2Loop == false) {
						if(escolha <= getEquips().getArmas_simples_CAC().size()) {
							System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getEquips().getArmas_simples_CAC().get(escolha-1));
							
							decisaocase2 = entrada.next().charAt(0);
							if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
								getFicha().setEquipamentos(getEquips().getArmas_simples_CAC().get(escolha-1));
								case2Loop = true;
								decisao2Loop = true;
								equip2Loop = true;
							}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
								decisao2Loop = true;
							}
							
						}else {
							System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", getEquips().getArmas_simples_CAC().get(escolha-1));
							
							decisaocase2 = entrada.next().charAt(0);
							if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
								getFicha().setEquipamentos(getEquips().getArmas_simples_distancia().get(escolha-getEquips().getArmas_simples_CAC().size()-1));
								decisao2Loop = true;
								equip2Loop = true;
							}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
								decisao2Loop = true;
							}
						}
					}
					
				}
			break;
			}
		}
	}
	
//Barbaro feats
	public void barFuria() {
		System.out.println("FURIA\r\n"
				+ "\n"
				+ "Em batalha, voc� luta com uma ferocidade primitiva. No\r\n"
				+ "seu turno, voc� pode entrar em f�ria com uma a��o\r\n"
				+ "b�nus.\r\n"
				+ "Enquanto estiver em f�ria, voc� recebe os seguintes\r\n"
				+ "benef�cios se voc� n�o estiver vestindo uma armadura\r\n"
				+ "pesada:\r\n"
				+ "- Voc� tem vantagem em testes de For�a e testes de\r\n"
				+ "resist�ncia de For�a.\r\n"
				+ "- Quando voc� desferir um ataque com arma corpo-acorpo usando For�a, voc� recebe um b�nus nas jogadas\r\n"
				+ "de dano que aumenta � medida que voc� adquire\r\n"
				+ "n�veis de b�rbaro, como mostrado na coluna Dano de\r\n"
				+ "F�ria na tabela O B�rbaro.\r\n"
				+ "- Voc� possui resist�ncia contra dano de concuss�o,\r\n"
				+ "cortante e perfurante.\r\n"
				+ "Se voc� for capaz de conjurar magias, voc� n�o poder�\r\n"
				+ "conjur�-las ou se concentrar nelas enquanto estiver em\r\n"
				+ "f�ria.\r\n"
				+ "Sua f�ria dura por 1 minuto. Ela termina\r\n"
				+ "prematuramente se voc� cair inconsciente ou se seu turno\r\n"
				+ "acabar e voc� n�o tiver atacado nenhuma criatura hostil\r\n"
				+ "desde seu �ltimo turno ou n�o tiver sofrido dano nesse\r\n"
				+ "per�odo. Voc� tamb�m pode terminar sua f�ria no seu\r\n"
				+ "turno com uma a��o b�nus.\r\n"
				+ "Quando voc� tiver usado a quantidade de f�rias\r\n"
				+ "mostrada para o seu n�vel de b�rbaro na coluna F�rias da\r\n"
				+ "tabela O B�rbaro, voc� precisar� terminar um descanso\r\n"
				+ "longo antes de poder entrar em f�ria novamente.\r\n");
	}
	
	public void setbarFuria() {
		getFicha().setClassefeats("F�RIA\r\n\n"
				+ "Em batalha, voc� luta com uma ferocidade primitiva. No\r\n"
				+ "seu turno, voc� pode entrar em f�ria com uma a��o\r\n"
				+ "b�nus.\r\n"
				+ "Enquanto estiver em f�ria, voc� recebe os seguintes\r\n"
				+ "benef�cios se voc� n�o estiver vestindo uma armadura\r\n"
				+ "pesada:\r\n"
				+ "- Voc� tem vantagem em testes de For�a e testes de\r\n"
				+ "resist�ncia de For�a.\r\n"
				+ "- Quando voc� desferir um ataque com arma corpo-acorpo usando For�a, voc� recebe um b�nus nas jogadas\r\n"
				+ "de dano que aumenta � medida que voc� adquire\r\n"
				+ "n�veis de b�rbaro, como mostrado na coluna Dano de\r\n"
				+ "F�ria na tabela O B�rbaro.\r\n"
				+ "- Voc� possui resist�ncia contra dano de concuss�o,\r\n"
				+ "cortante e perfurante.\r\n"
				+ "Se voc� for capaz de conjurar magias, voc� n�o poder�\r\n"
				+ "conjur�-las ou se concentrar nelas enquanto estiver em\r\n"
				+ "f�ria.\r\n"
				+ "Sua f�ria dura por 1 minuto. Ela termina\r\n"
				+ "prematuramente se voc� cair inconsciente ou se seu turno\r\n"
				+ "acabar e voc� n�o tiver atacado nenhuma criatura hostil\r\n"
				+ "desde seu �ltimo turno ou n�o tiver sofrido dano nesse\r\n"
				+ "per�odo. Voc� tamb�m pode terminar sua f�ria no seu\r\n"
				+ "turno com uma a��o b�nus.\r\n"
				+ "Quando voc� tiver usado a quantidade de f�rias\r\n"
				+ "mostrada para o seu n�vel de b�rbaro na coluna F�rias da\r\n"
				+ "tabela O B�rbaro, voc� precisar� terminar um descanso\r\n"
				+ "longo antes de poder entrar em f�ria novamente.\r\n");
	}
	
	public void barDefesaSemArmadura() {
		System.out.println("DEFESA SEM ARMADURA\r\n\n"
				+ "Quando voc� n�o estiver vestindo qualquer armadura,\r\n"
				+ "sua Classe de Armadura ser� 10 + seu modificador de\r\n"
				+ "Destreza + seu modificador de Constitui��o. Voc� pode\r\n"
				+ "usar um escudo e continuar a receber esse benef�cio.\r\n");
	}
	
	public void setbarDefesaSemArmadura() {
		getFicha().setClassefeats("DEFESA SEM ARMADURA\r\n"
				+ "Quando voc� n�o estiver vestindo qualquer armadura,\r\n"
				+ "sua Classe de Armadura ser� 10 + seu modificador de\r\n"
				+ "Destreza + seu modificador de Constitui��o. Voc� pode\r\n"
				+ "usar um escudo e continuar a receber esse benef�cio.");
	}

//Barbaro feats nivel 2
	public void barFeatsNivel2() {
		System.out.println("ATAQUE DESCUIDADO\r\n\n"
				+ "A partir do 2� n�vel, voc� pode desistir de toda\r\n"
				+ "preocupa��o com sua defesa para atacar com um\r\n"
				+ "desespero feroz. Quando voc� fizer o seu primeiro ataque\r\n"
				+ "no turno, voc� pode decidir atacar descuidadamente.\r\n"
				+ "Fazer isso lhe concede vantagem nas jogadas de ataque\r\n"
				+ "com armas corpo-a-corpo usando For�a durante seu turno,\r\n"
				+ "por�m, as jogadas de ataques feitas contra voc� possuem\r\n"
				+ "vantagem at� o in�cio do seu pr�ximo turno.\r\n\n"
				+ "SENTIDO DE PERIGO\r\n\n"
				+ "No 2� n�vel, voc� adquire um sentido sobrenatural de\r\n"
				+ "quando as coisas pr�ximas n�o est�o como deveriam,\r\n"
				+ "concedendo a voc� uma chance maior quando estiver\r\n"
				+ "evitando perigos.\r\n"
				+ "Voc� possui vantagem em testes de resist�ncia de\r\n"
				+ "Destreza contra efeitos que voc� possa ver, como\r\n"
				+ "armadilhas e magias. Para receber esse benef�cio voc� n�o\r\n"
				+ "pode estar cego, surdo ou incapacitado.\r\n\n");
	}
	
//Barbaro feats nivel 3
	public void barFeatsNivel3() {
		System.out.println("CAMINHO PRIMITIVO\r\n\n"
				+ "No 3� n�vel, voc� escolhe um caminho que molda a\r\n\n"
				+ "natureza da sua f�ria. Escolha o Caminho do Furioso ou o\r\n\n"
				+ "Caminho do Guerreiro Tot�mico, ambos detalhados no\r\n\n"
				+ "final da descri��o de classe. Sua escolha lhe conceder�\r\n\n"
				+ "caracter�sticas no 3� n�vel e novamente no 6�, 10� e 14� n�veis.\r\n\n");
	}

//Barbaro incremento no valor de habilidade
	public void barIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando voc� atinge o 4� n�vel e novamente no 8�, 12�, 16�\r\n"
				+ "e 19� n�vel, voc� pode aumentar um valor de habilidade, �\r\n"
				+ "sua escolha, em 2 ou voc� pode aumentar dois valores de\r\n"
				+ "habilidade, � sua escolha em 1. Como padr�o, voc� n�o\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "caracter�stica.\r\n\n");
	}
	
//Barbaro feats nivel 5
	public void barFeatsNivel5() {
		System.out.println("ATAQUE EXTRA\r\n\n"
				+ "A partir do 5� n�vel, voc� pode atacar duas vezes, ao inv�s\r\n"
				+ "de uma, sempre que voc� realizar a a��o de Ataque no seu turno.\r\n\n"
				+ "MOVIMENTO R�PIDO\r\n\n"
				+ "Come�ando no 5� n�vel, seu deslocamento aumenta em 3\r\n"
				+ "metros enquanto voc� n�o estiver vestindo uma armadura pesada.\r\n\n");
	}
	
//Barbaro feats nivel 7
	public void barFeatsNivel7() {
		System.out.println("INSTINTO SELVAGEM\r\n\n"
				+ "No 7� n�vel, seu instinto est� t�o apurado que voc� recebe\r\n"
				+ "vantagem nas jogadas de iniciativa.\r\n"
				+ "Al�m disso, se voc� estiver surpreso no come�o de um\r\n"
				+ "combate e n�o estiver incapacitado, voc� pode agir\r\n"
				+ "normalmente no seu primeiro turno, mas apenas se voc�\r\n"
				+ "entrar em f�ria antes de realizar qualquer outra coisa neste turno.\r\n\n");
	}
	
//Barbaro feats nivel 9
	public void barFeatsNivel9() {
		System.out.println("CR�TICO BRUTAL\r\n\n"
				+ "A partir do 9� n�vel, voc� pode rolar um dado de dano de\r\n"
				+ "arma adicional quando estiver determinando o dano extra\r\n"
				+ "de um acerto cr�tico com uma arma corpo-a-corpo.\r\n"
				+ "Isso aumenta para dois dados adicionais no 13� n�vel e\r\n"
				+ "tr�s dados adicionais no 17� n�vel.\r\n\n");
	}
	
//Barbaro feats nivel 11
	public void barFeatsNivel11() {
		System.out.println("F�RIA IMPLAC�VEL\r\n\n"
				+ "A partir do 11� n�vel, sua f�ria pode manter voc� lutando\r\n"
				+ "independente da gravidade dos seus ferimentos. Se voc�\r\n"
				+ "cair para 0 pontos de vida enquanto estiver em f�ria e\r\n"
				+ "n�o morrer, voc� pode realizar um teste de resist�ncia de\r\n"
				+ "Constitui��o CD 10. Se voc� for bem sucedido, voc� volta\r\n"
				+ "para 1 ponto de vida ao inv�s disso.\r\n"
				+ "Cada vez que voc� utilizar essa caracter�stica ap�s a\r\n"
				+ "primeira, a CD aumenta em 5. Assim que voc� terminar\r\n"
				+ "um descanso curto ou longo a CD volta para 10.\r\n\n");
	}
	
//Barbaro feats nivel 15
	public void barFeatsNivel15() {
		System.out.println("F�RIA PERSISTENTE\r\n\n"
				+ "A partir do 15� n�vel, sua f�ria � t�o brutal que ela s�\r\n"
				+ "termina prematuramente se voc� cair inconsciente ou se\r\n"
				+ "voc� decidir termin�-la.\r\n\n");
	}
	
//Barbaro feats nivel 18
	public void barFeatsNivel18() {
		System.out.println("FOR�A INDOM�VEL\r\n\n"
				+ "A partir do 18� n�vel, se o total de um teste de For�a seu\r\n"
				+ "for menor que o seu valor de For�a, voc� pode usar esse\r\n"
				+ "valor no lugar do resultado.\r\n\n");
	}
	
//Barbaro feats nivel 19
	public void barFeatsNivel20() {
		System.out.println("CAMPE�O PRIMITIVO\r\n\n"
				+ "No 20� n�vel, voc� incorpora os poderes da natureza. Seus\r\n"
				+ "valores de For�a e Constitui��o aumentam em 4. Seu\r\n"
				+ "m�ximo para esses valores agora � 24.\r\n\n");
	}
	
//barbaro Caminhos
	public void barbaroCaminhos() {
		System.out.println("CAMINHO PRIMITIVO\r\n\n"
				+ "A f�ria queima no cora��o de cada b�rbaro, uma\r\n"
				+ "queima��o que leva-os a grandeza. B�rbaros diferentes,\r\n"
				+ "no entanto, atribuem suas f�rias a fontes diferentes. Para\r\n"
				+ "alguns, � um reservat�rio interno onde a dor, afli��o e\r\n"
				+ "raiva s�o forjados numa f�ria dura como a�o. Outros\r\n"
				+ "veem-na como uma b�n��o espiritual, uma dadiva de um\r\n"
				+ "totem animal.\r\n\n");
	}

//Barbaro caminho do furioso
	public void barCamFurioso() {
		System.out.println("CAMINHO DO FURIOSO\r\n\n"
				+ "Para alguns b�rbaros, a f�ria � um meio para um fim �\r\n"
				+ "esse fim � a viol�ncia. O Caminho do Furioso � um\r\n"
				+ "caminho de f�ria livre, entumecido em sangue. A medida\r\n"
				+ "que voc� entra na f�ria de um furioso, voc� vibra no caos\r\n"
				+ "da batalha, despreocupado com a sua pr�pria sa�de ou\r\n"
				+ "bem-estar.\r\n\n");
	}

//Barbaro caminho do furioso nivel 3
	public void barCamFuriosoN3() {
		System.out.println("FRENESI\r\n\n"
				+ "Come�ando no momento que voc� escolhe esse caminho no\r\n"
				+ "3� n�vel, voc� pode entrar num frenesi quando estiver em\r\n"
				+ "f�ria. Se voc� desejar, pela dura��o da sua f�ria, voc�\r\n"
				+ "pode realizar um �nico ataque corpo-a-corpo com arma,\r\n"
				+ "com uma a��o b�nus, em cada um de seus turnos ap�s\r\n"
				+ "esse. Quando sua f�ria acabar, voc� sofrer� um n�vel de exaust�o (como descrito no ap�ndice A)\r\n\n");
	}
	
//Barbaro caminho do furioso nivel 6
	public void barCamFuriosoN6() {
		System.out.println("F�RIA INCONSCIENTE\r\n\n"
				+ "A partir do 6� n�vel, voc� n�o pode ser enfeiti�ado ou\r\n"
				+ "amedrontado enquanto estiver em f�ria. Se voc� estava\r\n"
				+ "enfeiti�ado ou amedrontado quando entrou em f�ria, o\r\n"
				+ "efeito � suspenso pela dura��o da f�ria.\r\n\n");
	}
	
//Barbaro caminho do furioso nivel 10
	public void barCamFuriosoN10() {
		System.out.println("PRESEN�A INTIMIDANTE\r\n\n"
				+ "A partir do 10� n�vel, voc� pode usar sua a��o para\r\n"
				+ "amedrontar algu�m com sua presen�a intimidante.\r\n"
				+ "Quando o fizer, escolha uma criatura que voc� possa ver a\r\n"
				+ "9 metros. Se a criatura puder ver ou ouvir voc�, ela deve\r\n"
				+ "ser bem sucedida num teste de resist�ncia de Sabedoria\r\n"
				+ "(CD igual a 8 + seu b�nus de profici�ncia + seu\r\n"
				+ "modificador de Carisma) ou ficara com medo de voc� at� o\r\n"
				+ "fim do seu pr�ximo turno. Nos turnos seguintes, voc�\r\n"
				+ "pode usar sua a��o para estender a dura��o desse efeito\r\n"
				+ "na criatura amedrontada at� o in�cio do seu pr�ximo\r\n"
				+ "turno. Esse efeito termina se a criatura terminar seu\r\n"
				+ "turno fora da sua linha de vis�o ao a mais de 18 metros de voc�.\r\n"
				+ "Se a criatura for bem sucedida no teste de resist�ncia,\r\n"
				+ "voc� n�o poder� usar essa caracter�stica nessa criatura novamente por 24 horas.\r\n\n");
	}
	
//Barbaro caminho do furioso nivel 14
	public void barCamFuriosoN14() {
		System.out.println("RETALIA��O\r\n\n"
				+ "A partir do 14� n�vel, quando voc� sofrer dano de uma\r\n"
				+ "criatura que esteja a at� 1,5 metro de voc�, voc� pode usar\r\n"
				+ "sua rea��o para realizar um ataque corpo-a-corpo com\r\n"
				+ "arma contra essa criatura.\r\n\n");
	}
	
//Barbaro caminho do guerreiro tot�mico
	public void barCamGT() {
		System.out.println("CAMINHO DO GUERREIRO TOT�MICO\r\n\n"
				+ "O Caminho do Guerreiro Tot�mico � uma jornada\r\n"
				+ "espiritual, � partir do momento que o b�rbaro aceita um\r\n"
				+ "espirito animal como seu guia, protetor e inspira��o. Em\r\n"
				+ "batalha, seu espirito tot�mico preenche voc� com for�a\r\n"
				+ "sobrenatural, adicionando combust�vel m�gico a sua f�ria b�rbara.\r\n"
				+ "A maioria das tribos b�rbaras consideram que um\r\n"
				+ "animal tot�mico possui parentesco a um cl� em\r\n"
				+ "particular. Em tais casos, � incomum a um indiv�duo\r\n"
				+ "possuir mais de um espirito animal tot�mico, apesar de existirem exce��es.\r\n\n");
	}
	
//Barbaro caminho do guerreiro tot�mico nivel 3
	public void barCamGTN3() {
		System.out.println("CONSELHEIRO ESPIRITUAL\r\n\n"
				+ "Seu caminho � buscar a sintonia com o mundo natural,\r\n"
				+ "concedendo a voc� uma afinidade com as bestas. A partir\r\n"
				+ "do 3� n�vel, quando voc� toma esse caminho, voc� recebe a\r\n"
				+ "habilidade de conjurar as magias sentido bestial e falar\r\n"
				+ "com animais, mas apenas na forma de rituais, como\r\n"
				+ "descrito no cap�tulo 10.\r\n\n"
				+ "TOTEM ESPIRITUAL\r\n\n"
				+ "A partir do 3� n�vel, quando voc� adota esse caminho,\r\n"
				+ "voc� escolhe um totem espiritual e ganha suas\r\n"
				+ "caracter�sticas. Voc� deve fazer ou adquirir um objeto\r\n"
				+ "f�sico como totem � um amuleto ou adorno similar � que\r\n"
				+ "incorpora o pelo ou penas, garras, dente ou ossos do\r\n"
				+ "animal tot�mico. Se voc� quiser, voc� tamb�m adquire\r\n"
				+ "pequenos atributos f�sicos que o assemelham ao seu totem\r\n"
				+ "espiritual. Por exemplo, se voc� tiver o totem espiritual do\r\n"
				+ "urso, voc� seria incomumente peludo e de pele grossa, ou\r\n"
				+ "se o seu totem for a �guia, seu olhos teriam um brilho\r\n"
				+ "amarelado.\r\n"
				+ "Seu totem animal deve ser um animal relacionado aos\r\n"
				+ "listados aqui, mas pode ser um mais apropriado a sua\r\n"
				+ "terra natal. Por exemplo, voc� poderia escolher falc�o ou\r\n"
				+ "abutre ao inv�s de �guia.\r\n"
				+ "�guia. Quando estiver em f�ria e n�o estiver vestindo\r\n"
				+ "uma armadura pesada, as outras criaturas ter�o\r\n"
				+ "desvantagem nas jogadas de ataque de oportunidade\r\n"
				+ "contra voc� e voc� pode usar a a��o de Disparada como\r\n"
				+ "uma a��o b�nus no seu turno. O espirito da �guia torna\r\n"
				+ "voc� um predador que pode vagar pelo meio da briga com\r\n"
				+ "facilidade.\r\n"
				+ "Lobo. Quando estiver em f�ria, seus amigos tem\r\n"
				+ "vantagem nas jogadas de ataque corpo-a-corpo realizadas\r\n"
				+ "contra qualquer criatura a 1,5 metro de voc� que seja\r\n"
				+ "hostil a voc�. O espirito do lobo transforma voc� em um\r\n"
				+ "l�der de ca�a.\r\n"
				+ "Urso. Quando em f�ria, voc� adquire resist�ncia a\r\n"
				+ "todos os tipos de dano, exceto dano ps�quico. O espirito do\r\n"
				+ "urso torna voc� vigoroso o suficiente para permanecer de\r\n"
				+ "p� diante de qualquer castigo.\r\n\n");
	}
	
//Barbaro caminho do gerreiro tot�mico nivel 6
	public void barCamGTN6() {
		System.out.println("ASPECTO DA BESTA\r\n\n"
				+ "No 6� n�vel, voc� adquire um benef�cio m�stico baseado no\r\n"
				+ "totem que voc� escolheu. Voc� pode escolher o mesmo\r\n"
				+ "animal que selecionou no 3� n�vel ou um diferente.\r\n"
				+ "�guia. Voc� ganha a vis�o agu�ada de uma �guia.\r\n"
				+ "Voc� pode ver a at� 1,6 km sem dificuldade, sendo capaz\r\n"
				+ "de discernir at� os menores detalhes quando estiver\r\n"
				+ "olhando para algo a menos de 30 metros de voc�. Al�m\r\n"
				+ "disso, penumbra n�o imp�em desvantagem nos seus\r\n"
				+ "testes de Sabedoria (Percep��o).\r\n"
				+ "Lobo. Voc� ganha a sensibilidade predat�ria de um\r\n"
				+ "lobo. Voc� pode rastrear outras criaturas quando estiver\r\n"
				+ "viajando a passo r�pido e voc� pode se mover\r\n"
				+ "furtivamente quando estiver viajando a passo normal\r\n"
				+ "(veja o cap�tulo 8 para as regras de passo de viagem).\r\n"
				+ "Urso. Voc� ganha a for�a de um urso. Sua capacidade\r\n"
				+ "de carga (incluindo carga m�xima e capacidade de erguer)\r\n"
				+ "� dobrada e voc� tem vantagem em testes de For�a\r\n"
				+ "realizados para empurrar, puxar, erguer ou quebrar\r\n"
				+ "objetos.\r\n\n");
	}
	
//Barbaro caminho do gerreiro tot�mico nivel 10
	public void barCamGTN10() {
		System.out.println("ANDARILHO ESPIRITUAL\r\n\n"
				+ "No 10� n�vel, voc� pode conjurar a magia comunh�o com a\r\n"
				+ "natureza, mas apenas como um ritual. Quando o fizer,\r\n"
				+ "uma vers�o espiritual de um dos animais que voc�\r\n"
				+ "escolheu como Totem Espiritual ou Aspecto da Besta\r\n"
				+ "aparece para voc� para transmitir a informa��o que voc�\r\n"
				+ "busca.\r\n\n");
	}
	
//Barbaro caminho do guerreiro tot�mico nivel 14
	public void barCamGTN14() {
		System.out.println("SINTONIA TOT�MICA\r\n\n"
				+ "No 14� n�vel, voc� ganha um benef�cio magico baseado em\r\n"
				+ "um totem animal, � sua escolha. Voc� pode escolher o\r\n"
				+ "mesmo animal que selecionou anteriormente ou um\r\n"
				+ "diferente.\r\n"
				+ "�guia. Quando estiver em f�ria, voc� adquire um\r\n"
				+ "deslocamento de voo igual ao seu deslocamento de\r\n"
				+ "caminhada. Esse benef�cio funciona apenas em pequenos\r\n"
				+ "explos�es: voc� cai se terminar seu turno no ar e n�o tiver\r\n"
				+ "nada em que possa se agarrar.\r\n"
				+ "Lobo. Quando estiver em f�ria, voc� pode usar uma\r\n"
				+ "a��o b�nus no seu turno para derrubar uma criatura\r\n"
				+ "Grande ou menor no ch�o quando voc� atingi-la com um\r\n"
				+ "ataque corpo-a-corpo com arma.\r\n"
				+ "Urso. Quando estiver em f�ria, qualquer criatura a\r\n"
				+ "at� 1,5 metro de voc� que for hostil a voc� ter�\r\n"
				+ "desvantagem nas jogadas de ataque contra outros alvos\r\n"
				+ "al�m de voc� ou outro personagem com essa\r\n"
				+ "caracter�stica. Um inimigo � imune a esse efeito se ele\r\n"
				+ "n�o puder ver ou ouvir voc� ou caso ele n�o possa ser\r\n"
				+ "amedrontado.\r\n\n");
	}
	
}
