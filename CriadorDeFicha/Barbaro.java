package CriadorDeFicha;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Barbaro extends Classes{
	private final List<String> pericias = Arrays.asList("Adestrar Animais", "Atletismo", "Intimidação", "Natureza", "Percepção", "Sobrevivência");
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
				+ "machado. Ele gargalha à medida que avança em direção\r\n"
				+ "do gigante do gelo que ousou caçar os alces que o seu povo\r\n"
				+ "arrebanhava.\r\n"
				+ "Uma meio-orc rosna para o último que ousou desafiar\r\n"
				+ "sua autoridade sobre a tribo selvagem, pronta para\r\n"
				+ "quebrar seu pescoço com suas mãos nuas da mesma\r\n"
				+ "forma que ela fez com os outros seis rivais anteriores.\r\n"
				+ "Espumando pela boca, um anão bate com seu elmo na\r\n"
				+ "cara de um inimigo drow, depois dirige seu cotovelo\r\n"
				+ "armadurado na direção do estomago de outro.\r\n"
				+ "Esses bárbaros, diferentes da forma que conseguem,\r\n"
				+ "são definidos por sua fúria: desenfreada, inextinguível e\r\n"
				+ "irracional fúria. Mais que uma mera emoção, sua raiva é\r\n"
				+ "a ferocidade de um predador acuado, o assalto implacável\r\n"
				+ "de uma tempestade, a turbulência agitada do mar.\r\n"
				+ "Para alguns, suas fúrias emerge da comunhão com\r\n"
				+ "ferozes espíritos animais. Outras provem de um\r\n"
				+ "reservatório turvo de raiva de um mundo cheio de dor.\r\n"
				+ "Para cada bárbaro, a fúria é um poder que preenche não\r\n"
				+ "apenas o frenesi de batalha, mas também reflexos,\r\n"
				+ "resiliência e proezas de força incríveis.\r\n"
				+ "\n";
		return descricao;
	}
	
	public String barbaroTabela() {
		String tabelaBarbaro = "O Bárbaro\r\n"
				+ "Nível	Bônus de Proficiência	Características		Fúrias	Dano de Fúria\r\n"
				+ "1°			  +2		  Fúria, Defesa semArmadura	  2 		+2\r\n"
				+ "2° +2 Ataque Descuidado,\r\n"
				+ "Sentido de Perigo\r\n"
				+ "2 +2\r\n"
				+ "3° +2 Caminho Primitivo 3 +2\r\n"
				+ "4° +2 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "3 +2\r\n"
				+ "5° +3 Ataque Extra,\r\n"
				+ "Movimento Rápido\r\n"
				+ "3 +2\r\n"
				+ "6° +3 Característica de Caminho\r\n"
				+ "Primitivo\r\n"
				+ "4 +2\r\n"
				+ "7° +3 Instinto Selvagem 4 +2\r\n"
				+ "8° +3 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "4 +2\r\n"
				+ "9° +4 Crítico Brutal (+1 dado) 4 +3\r\n"
				+ "10° +4 Característica de Caminho\r\n"
				+ "Primitivo\r\n"
				+ "4 +3\r\n"
				+ "11° +4 Fúria Implacável 4 +3\r\n"
				+ "12° +4 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "5 +3\r\n"
				+ "13° +5 Crítico Brutal (+2 dados) 5 +3\r\n"
				+ "14° +5 Característica de Caminho\r\n"
				+ "Primitivo\r\n"
				+ "5 +3\r\n"
				+ "15° +5 Fúria Persistente 5 +3\r\n"
				+ "16° +5 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "5 +4\r\n"
				+ "17° +6 Crítico Brutal (+3 dados) 6 +4\r\n"
				+ "18° +6 Força Indomável 6 +4\r\n"
				+ "19° +6 Incremento no Valor de\r\n"
				+ "Habilidade\r\n"
				+ "6 +4\r\n"
				+ "20° +6 Campeão Primitivo Ilimitado +4\r\n";
		return tabelaBarbaro;
	}
	
	public String barbaroCaracteristicasClasse() {
		String caracteristicas = "PONTOS DE VIDA\r\n"
				+ "\n"
				+ "Dado de Vida: 1d12 por nível de bárbaro\r\n"
				+ "Pontos de Vida no 1° Nível: 12 + seu modificador de\r\n"
				+ "Constituição\r\n"
				+ "Pontos de Vida nos Níveis Seguintes: 1d12 (ou 7) +\r\n"
				+ "seu modificador de Constituição por nível de bárbaro\r\n"
				+ "após o 1°\r\n"
				+ "\n"
				+ "PROFICIÊNCIAS\r\n"
				+ "\n"
				+ "Armaduras: Armaduras leves, armaduras médias e\r\n"
				+ "escudos\r\n"
				+ "Armas: Armas simples, armas marciais\r\n"
				+ "Ferramentas: Nenhuma\r\n"
				+ "Testes de Resistência: Força, Constituição\r\n"
				+ "Perícias: Escolha duas dentre Adestrar Animais,\r\n"
				+ "Atletismo, Intimidação, Natureza, Percepção e\r\n"
				+ "Sobrevivência\r\n"
				+ "\n"
				+ "EQUIPAMENTO\r\n"
				+ "\n"
				+ "Você começa com o seguinte equipamento, além do\r\n"
				+ "equipamento concedido pelo seu antecedente:\r\n"
				+ "- (a) um machado grande ou (b) qualquer arma marcial\r\n"
				+ "corpo-a-corpo\r\n"
				+ "- (a) dois machados de mão ou (b) qualquer arma\r\n"
				+ "simples\r\n"
				+ "- Um pacote de aventureiro e quatro azagaias\r\n";
		return caracteristicas;
	}
	
	public void setBarbaro() {
		setNome("Barbaro");
		getFicha().setClasse(getNome());
		getFicha().setBonus_proficiencia(2);
		List<String> profiRes = Arrays.asList("Força", "Constituição");
		getProficiencia().SetResistencia(profiRes);
		
		List<String> proficiencia_equips = Arrays.asList("Armaduras leves", "Armaduras médias", "Escudos", "Armas simples", "Armas marciais");
		getProficiencia().SetProfEquips(proficiencia_equips);
			
//		System.out.println("--Equipamentos--");
//		System.out.println("Você começa com os seguintes equipamentos, além dos equipamentos"
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
			System.out.println("Escolha entre (1) dois machados de mão ou (2) qualquer arma simples.");
			
			equip2Menu = entrada.nextInt();
			switch(equip2Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("Tem certeza que deseja escolher os dois machados de mão? (Y/N)");
					
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
				+ "Em batalha, você luta com uma ferocidade primitiva. No\r\n"
				+ "seu turno, você pode entrar em fúria com uma ação\r\n"
				+ "bônus.\r\n"
				+ "Enquanto estiver em fúria, você recebe os seguintes\r\n"
				+ "benefícios se você não estiver vestindo uma armadura\r\n"
				+ "pesada:\r\n"
				+ "- Você tem vantagem em testes de Força e testes de\r\n"
				+ "resistência de Força.\r\n"
				+ "- Quando você desferir um ataque com arma corpo-acorpo usando Força, você recebe um bônus nas jogadas\r\n"
				+ "de dano que aumenta à medida que você adquire\r\n"
				+ "níveis de bárbaro, como mostrado na coluna Dano de\r\n"
				+ "Fúria na tabela O Bárbaro.\r\n"
				+ "- Você possui resistência contra dano de concussão,\r\n"
				+ "cortante e perfurante.\r\n"
				+ "Se você for capaz de conjurar magias, você não poderá\r\n"
				+ "conjurá-las ou se concentrar nelas enquanto estiver em\r\n"
				+ "fúria.\r\n"
				+ "Sua fúria dura por 1 minuto. Ela termina\r\n"
				+ "prematuramente se você cair inconsciente ou se seu turno\r\n"
				+ "acabar e você não tiver atacado nenhuma criatura hostil\r\n"
				+ "desde seu último turno ou não tiver sofrido dano nesse\r\n"
				+ "período. Você também pode terminar sua fúria no seu\r\n"
				+ "turno com uma ação bônus.\r\n"
				+ "Quando você tiver usado a quantidade de fúrias\r\n"
				+ "mostrada para o seu nível de bárbaro na coluna Fúrias da\r\n"
				+ "tabela O Bárbaro, você precisará terminar um descanso\r\n"
				+ "longo antes de poder entrar em fúria novamente.\r\n");
	}
	
	public void setbarFuria() {
		getFicha().setClassefeats("FÚRIA\r\n\n"
				+ "Em batalha, você luta com uma ferocidade primitiva. No\r\n"
				+ "seu turno, você pode entrar em fúria com uma ação\r\n"
				+ "bônus.\r\n"
				+ "Enquanto estiver em fúria, você recebe os seguintes\r\n"
				+ "benefícios se você não estiver vestindo uma armadura\r\n"
				+ "pesada:\r\n"
				+ "- Você tem vantagem em testes de Força e testes de\r\n"
				+ "resistência de Força.\r\n"
				+ "- Quando você desferir um ataque com arma corpo-acorpo usando Força, você recebe um bônus nas jogadas\r\n"
				+ "de dano que aumenta à medida que você adquire\r\n"
				+ "níveis de bárbaro, como mostrado na coluna Dano de\r\n"
				+ "Fúria na tabela O Bárbaro.\r\n"
				+ "- Você possui resistência contra dano de concussão,\r\n"
				+ "cortante e perfurante.\r\n"
				+ "Se você for capaz de conjurar magias, você não poderá\r\n"
				+ "conjurá-las ou se concentrar nelas enquanto estiver em\r\n"
				+ "fúria.\r\n"
				+ "Sua fúria dura por 1 minuto. Ela termina\r\n"
				+ "prematuramente se você cair inconsciente ou se seu turno\r\n"
				+ "acabar e você não tiver atacado nenhuma criatura hostil\r\n"
				+ "desde seu último turno ou não tiver sofrido dano nesse\r\n"
				+ "período. Você também pode terminar sua fúria no seu\r\n"
				+ "turno com uma ação bônus.\r\n"
				+ "Quando você tiver usado a quantidade de fúrias\r\n"
				+ "mostrada para o seu nível de bárbaro na coluna Fúrias da\r\n"
				+ "tabela O Bárbaro, você precisará terminar um descanso\r\n"
				+ "longo antes de poder entrar em fúria novamente.\r\n");
	}
	
	public void barDefesaSemArmadura() {
		System.out.println("DEFESA SEM ARMADURA\r\n\n"
				+ "Quando você não estiver vestindo qualquer armadura,\r\n"
				+ "sua Classe de Armadura será 10 + seu modificador de\r\n"
				+ "Destreza + seu modificador de Constituição. Você pode\r\n"
				+ "usar um escudo e continuar a receber esse benefício.\r\n");
	}
	
	public void setbarDefesaSemArmadura() {
		getFicha().setClassefeats("DEFESA SEM ARMADURA\r\n"
				+ "Quando você não estiver vestindo qualquer armadura,\r\n"
				+ "sua Classe de Armadura será 10 + seu modificador de\r\n"
				+ "Destreza + seu modificador de Constituição. Você pode\r\n"
				+ "usar um escudo e continuar a receber esse benefício.");
	}

//Barbaro feats nivel 2
	public void barFeatsNivel2() {
		System.out.println("ATAQUE DESCUIDADO\r\n\n"
				+ "A partir do 2° nível, você pode desistir de toda\r\n"
				+ "preocupação com sua defesa para atacar com um\r\n"
				+ "desespero feroz. Quando você fizer o seu primeiro ataque\r\n"
				+ "no turno, você pode decidir atacar descuidadamente.\r\n"
				+ "Fazer isso lhe concede vantagem nas jogadas de ataque\r\n"
				+ "com armas corpo-a-corpo usando Força durante seu turno,\r\n"
				+ "porém, as jogadas de ataques feitas contra você possuem\r\n"
				+ "vantagem até o início do seu próximo turno.\r\n\n"
				+ "SENTIDO DE PERIGO\r\n\n"
				+ "No 2° nível, você adquire um sentido sobrenatural de\r\n"
				+ "quando as coisas próximas não estão como deveriam,\r\n"
				+ "concedendo a você uma chance maior quando estiver\r\n"
				+ "evitando perigos.\r\n"
				+ "Você possui vantagem em testes de resistência de\r\n"
				+ "Destreza contra efeitos que você possa ver, como\r\n"
				+ "armadilhas e magias. Para receber esse benefício você não\r\n"
				+ "pode estar cego, surdo ou incapacitado.\r\n\n");
	}
	
//Barbaro feats nivel 3
	public void barFeatsNivel3() {
		System.out.println("CAMINHO PRIMITIVO\r\n\n"
				+ "No 3° nível, você escolhe um caminho que molda a\r\n\n"
				+ "natureza da sua fúria. Escolha o Caminho do Furioso ou o\r\n\n"
				+ "Caminho do Guerreiro Totêmico, ambos detalhados no\r\n\n"
				+ "final da descrição de classe. Sua escolha lhe concederá\r\n\n"
				+ "características no 3° nível e novamente no 6°, 10° e 14° níveis.\r\n\n");
	}

//Barbaro incremento no valor de habilidade
	public void barIncrementoHabilidade() {
		System.out.println("INCREMENTO NO VALOR DE HABILIDADE\r\n\n"
				+ "Quando você atinge o 4° nível e novamente no 8°, 12°, 16°\r\n"
				+ "e 19° nível, você pode aumentar um valor de habilidade, à\r\n"
				+ "sua escolha, em 2 ou você pode aumentar dois valores de\r\n"
				+ "habilidade, à sua escolha em 1. Como padrão, você não\r\n"
				+ "pode elevar um valor de habilidade acima de 20 com essa\r\n"
				+ "característica.\r\n\n");
	}
	
//Barbaro feats nivel 5
	public void barFeatsNivel5() {
		System.out.println("ATAQUE EXTRA\r\n\n"
				+ "A partir do 5° nível, você pode atacar duas vezes, ao invés\r\n"
				+ "de uma, sempre que você realizar a ação de Ataque no seu turno.\r\n\n"
				+ "MOVIMENTO RÁPIDO\r\n\n"
				+ "Começando no 5° nível, seu deslocamento aumenta em 3\r\n"
				+ "metros enquanto você não estiver vestindo uma armadura pesada.\r\n\n");
	}
	
//Barbaro feats nivel 7
	public void barFeatsNivel7() {
		System.out.println("INSTINTO SELVAGEM\r\n\n"
				+ "No 7° nível, seu instinto está tão apurado que você recebe\r\n"
				+ "vantagem nas jogadas de iniciativa.\r\n"
				+ "Além disso, se você estiver surpreso no começo de um\r\n"
				+ "combate e não estiver incapacitado, você pode agir\r\n"
				+ "normalmente no seu primeiro turno, mas apenas se você\r\n"
				+ "entrar em fúria antes de realizar qualquer outra coisa neste turno.\r\n\n");
	}
	
//Barbaro feats nivel 9
	public void barFeatsNivel9() {
		System.out.println("CRÍTICO BRUTAL\r\n\n"
				+ "A partir do 9° nível, você pode rolar um dado de dano de\r\n"
				+ "arma adicional quando estiver determinando o dano extra\r\n"
				+ "de um acerto crítico com uma arma corpo-a-corpo.\r\n"
				+ "Isso aumenta para dois dados adicionais no 13° nível e\r\n"
				+ "três dados adicionais no 17° nível.\r\n\n");
	}
	
//Barbaro feats nivel 11
	public void barFeatsNivel11() {
		System.out.println("FÚRIA IMPLACÁVEL\r\n\n"
				+ "A partir do 11° nível, sua fúria pode manter você lutando\r\n"
				+ "independente da gravidade dos seus ferimentos. Se você\r\n"
				+ "cair para 0 pontos de vida enquanto estiver em fúria e\r\n"
				+ "não morrer, você pode realizar um teste de resistência de\r\n"
				+ "Constituição CD 10. Se você for bem sucedido, você volta\r\n"
				+ "para 1 ponto de vida ao invés disso.\r\n"
				+ "Cada vez que você utilizar essa característica após a\r\n"
				+ "primeira, a CD aumenta em 5. Assim que você terminar\r\n"
				+ "um descanso curto ou longo a CD volta para 10.\r\n\n");
	}
	
//Barbaro feats nivel 15
	public void barFeatsNivel15() {
		System.out.println("FÚRIA PERSISTENTE\r\n\n"
				+ "A partir do 15° nível, sua fúria é tão brutal que ela só\r\n"
				+ "termina prematuramente se você cair inconsciente ou se\r\n"
				+ "você decidir terminá-la.\r\n\n");
	}
	
//Barbaro feats nivel 18
	public void barFeatsNivel18() {
		System.out.println("FORÇA INDOMÁVEL\r\n\n"
				+ "A partir do 18° nível, se o total de um teste de Força seu\r\n"
				+ "for menor que o seu valor de Força, você pode usar esse\r\n"
				+ "valor no lugar do resultado.\r\n\n");
	}
	
//Barbaro feats nivel 19
	public void barFeatsNivel20() {
		System.out.println("CAMPEÃO PRIMITIVO\r\n\n"
				+ "No 20° nível, você incorpora os poderes da natureza. Seus\r\n"
				+ "valores de Força e Constituição aumentam em 4. Seu\r\n"
				+ "máximo para esses valores agora é 24.\r\n\n");
	}
	
//barbaro Caminhos
	public void barbaroCaminhos() {
		System.out.println("CAMINHO PRIMITIVO\r\n\n"
				+ "A fúria queima no coração de cada bárbaro, uma\r\n"
				+ "queimação que leva-os a grandeza. Bárbaros diferentes,\r\n"
				+ "no entanto, atribuem suas fúrias a fontes diferentes. Para\r\n"
				+ "alguns, é um reservatório interno onde a dor, aflição e\r\n"
				+ "raiva são forjados numa fúria dura como aço. Outros\r\n"
				+ "veem-na como uma bênção espiritual, uma dadiva de um\r\n"
				+ "totem animal.\r\n\n");
	}

//Barbaro caminho do furioso
	public void barCamFurioso() {
		System.out.println("CAMINHO DO FURIOSO\r\n\n"
				+ "Para alguns bárbaros, a fúria é um meio para um fim –\r\n"
				+ "esse fim é a violência. O Caminho do Furioso é um\r\n"
				+ "caminho de fúria livre, entumecido em sangue. A medida\r\n"
				+ "que você entra na fúria de um furioso, você vibra no caos\r\n"
				+ "da batalha, despreocupado com a sua própria saúde ou\r\n"
				+ "bem-estar.\r\n\n");
	}

//Barbaro caminho do furioso nivel 3
	public void barCamFuriosoN3() {
		System.out.println("FRENESI\r\n\n"
				+ "Começando no momento que você escolhe esse caminho no\r\n"
				+ "3° nível, você pode entrar num frenesi quando estiver em\r\n"
				+ "fúria. Se você desejar, pela duração da sua fúria, você\r\n"
				+ "pode realizar um único ataque corpo-a-corpo com arma,\r\n"
				+ "com uma ação bônus, em cada um de seus turnos após\r\n"
				+ "esse. Quando sua fúria acabar, você sofrerá um nível de exaustão (como descrito no apêndice A)\r\n\n");
	}
	
//Barbaro caminho do furioso nivel 6
	public void barCamFuriosoN6() {
		System.out.println("FÚRIA INCONSCIENTE\r\n\n"
				+ "A partir do 6° nível, você não pode ser enfeitiçado ou\r\n"
				+ "amedrontado enquanto estiver em fúria. Se você estava\r\n"
				+ "enfeitiçado ou amedrontado quando entrou em fúria, o\r\n"
				+ "efeito é suspenso pela duração da fúria.\r\n\n");
	}
	
//Barbaro caminho do furioso nivel 10
	public void barCamFuriosoN10() {
		System.out.println("PRESENÇA INTIMIDANTE\r\n\n"
				+ "A partir do 10° nível, você pode usar sua ação para\r\n"
				+ "amedrontar alguém com sua presença intimidante.\r\n"
				+ "Quando o fizer, escolha uma criatura que você possa ver a\r\n"
				+ "9 metros. Se a criatura puder ver ou ouvir você, ela deve\r\n"
				+ "ser bem sucedida num teste de resistência de Sabedoria\r\n"
				+ "(CD igual a 8 + seu bônus de proficiência + seu\r\n"
				+ "modificador de Carisma) ou ficara com medo de você até o\r\n"
				+ "fim do seu próximo turno. Nos turnos seguintes, você\r\n"
				+ "pode usar sua ação para estender a duração desse efeito\r\n"
				+ "na criatura amedrontada até o início do seu próximo\r\n"
				+ "turno. Esse efeito termina se a criatura terminar seu\r\n"
				+ "turno fora da sua linha de visão ao a mais de 18 metros de você.\r\n"
				+ "Se a criatura for bem sucedida no teste de resistência,\r\n"
				+ "você não poderá usar essa característica nessa criatura novamente por 24 horas.\r\n\n");
	}
	
//Barbaro caminho do furioso nivel 14
	public void barCamFuriosoN14() {
		System.out.println("RETALIAÇÃO\r\n\n"
				+ "A partir do 14° nível, quando você sofrer dano de uma\r\n"
				+ "criatura que esteja a até 1,5 metro de você, você pode usar\r\n"
				+ "sua reação para realizar um ataque corpo-a-corpo com\r\n"
				+ "arma contra essa criatura.\r\n\n");
	}
	
//Barbaro caminho do guerreiro totêmico
	public void barCamGT() {
		System.out.println("CAMINHO DO GUERREIRO TOTÊMICO\r\n\n"
				+ "O Caminho do Guerreiro Totêmico é uma jornada\r\n"
				+ "espiritual, à partir do momento que o bárbaro aceita um\r\n"
				+ "espirito animal como seu guia, protetor e inspiração. Em\r\n"
				+ "batalha, seu espirito totêmico preenche você com força\r\n"
				+ "sobrenatural, adicionando combustível mágico a sua fúria bárbara.\r\n"
				+ "A maioria das tribos bárbaras consideram que um\r\n"
				+ "animal totêmico possui parentesco a um clã em\r\n"
				+ "particular. Em tais casos, é incomum a um indivíduo\r\n"
				+ "possuir mais de um espirito animal totêmico, apesar de existirem exceções.\r\n\n");
	}
	
//Barbaro caminho do guerreiro totêmico nivel 3
	public void barCamGTN3() {
		System.out.println("CONSELHEIRO ESPIRITUAL\r\n\n"
				+ "Seu caminho é buscar a sintonia com o mundo natural,\r\n"
				+ "concedendo a você uma afinidade com as bestas. A partir\r\n"
				+ "do 3° nível, quando você toma esse caminho, você recebe a\r\n"
				+ "habilidade de conjurar as magias sentido bestial e falar\r\n"
				+ "com animais, mas apenas na forma de rituais, como\r\n"
				+ "descrito no capítulo 10.\r\n\n"
				+ "TOTEM ESPIRITUAL\r\n\n"
				+ "A partir do 3° nível, quando você adota esse caminho,\r\n"
				+ "você escolhe um totem espiritual e ganha suas\r\n"
				+ "características. Você deve fazer ou adquirir um objeto\r\n"
				+ "físico como totem – um amuleto ou adorno similar – que\r\n"
				+ "incorpora o pelo ou penas, garras, dente ou ossos do\r\n"
				+ "animal totêmico. Se você quiser, você também adquire\r\n"
				+ "pequenos atributos físicos que o assemelham ao seu totem\r\n"
				+ "espiritual. Por exemplo, se você tiver o totem espiritual do\r\n"
				+ "urso, você seria incomumente peludo e de pele grossa, ou\r\n"
				+ "se o seu totem for a águia, seu olhos teriam um brilho\r\n"
				+ "amarelado.\r\n"
				+ "Seu totem animal deve ser um animal relacionado aos\r\n"
				+ "listados aqui, mas pode ser um mais apropriado a sua\r\n"
				+ "terra natal. Por exemplo, você poderia escolher falcão ou\r\n"
				+ "abutre ao invés de águia.\r\n"
				+ "Águia. Quando estiver em fúria e não estiver vestindo\r\n"
				+ "uma armadura pesada, as outras criaturas terão\r\n"
				+ "desvantagem nas jogadas de ataque de oportunidade\r\n"
				+ "contra você e você pode usar a ação de Disparada como\r\n"
				+ "uma ação bônus no seu turno. O espirito da águia torna\r\n"
				+ "você um predador que pode vagar pelo meio da briga com\r\n"
				+ "facilidade.\r\n"
				+ "Lobo. Quando estiver em fúria, seus amigos tem\r\n"
				+ "vantagem nas jogadas de ataque corpo-a-corpo realizadas\r\n"
				+ "contra qualquer criatura a 1,5 metro de você que seja\r\n"
				+ "hostil a você. O espirito do lobo transforma você em um\r\n"
				+ "líder de caça.\r\n"
				+ "Urso. Quando em fúria, você adquire resistência a\r\n"
				+ "todos os tipos de dano, exceto dano psíquico. O espirito do\r\n"
				+ "urso torna você vigoroso o suficiente para permanecer de\r\n"
				+ "pé diante de qualquer castigo.\r\n\n");
	}
	
//Barbaro caminho do gerreiro totêmico nivel 6
	public void barCamGTN6() {
		System.out.println("ASPECTO DA BESTA\r\n\n"
				+ "No 6° nível, você adquire um benefício místico baseado no\r\n"
				+ "totem que você escolheu. Você pode escolher o mesmo\r\n"
				+ "animal que selecionou no 3° nível ou um diferente.\r\n"
				+ "Águia. Você ganha a visão aguçada de uma águia.\r\n"
				+ "Você pode ver a até 1,6 km sem dificuldade, sendo capaz\r\n"
				+ "de discernir até os menores detalhes quando estiver\r\n"
				+ "olhando para algo a menos de 30 metros de você. Além\r\n"
				+ "disso, penumbra não impõem desvantagem nos seus\r\n"
				+ "testes de Sabedoria (Percepção).\r\n"
				+ "Lobo. Você ganha a sensibilidade predatória de um\r\n"
				+ "lobo. Você pode rastrear outras criaturas quando estiver\r\n"
				+ "viajando a passo rápido e você pode se mover\r\n"
				+ "furtivamente quando estiver viajando a passo normal\r\n"
				+ "(veja o capítulo 8 para as regras de passo de viagem).\r\n"
				+ "Urso. Você ganha a força de um urso. Sua capacidade\r\n"
				+ "de carga (incluindo carga máxima e capacidade de erguer)\r\n"
				+ "é dobrada e você tem vantagem em testes de Força\r\n"
				+ "realizados para empurrar, puxar, erguer ou quebrar\r\n"
				+ "objetos.\r\n\n");
	}
	
//Barbaro caminho do gerreiro totêmico nivel 10
	public void barCamGTN10() {
		System.out.println("ANDARILHO ESPIRITUAL\r\n\n"
				+ "No 10° nível, você pode conjurar a magia comunhão com a\r\n"
				+ "natureza, mas apenas como um ritual. Quando o fizer,\r\n"
				+ "uma versão espiritual de um dos animais que você\r\n"
				+ "escolheu como Totem Espiritual ou Aspecto da Besta\r\n"
				+ "aparece para você para transmitir a informação que você\r\n"
				+ "busca.\r\n\n");
	}
	
//Barbaro caminho do guerreiro totêmico nivel 14
	public void barCamGTN14() {
		System.out.println("SINTONIA TOTÊMICA\r\n\n"
				+ "No 14° nível, você ganha um benefício magico baseado em\r\n"
				+ "um totem animal, à sua escolha. Você pode escolher o\r\n"
				+ "mesmo animal que selecionou anteriormente ou um\r\n"
				+ "diferente.\r\n"
				+ "Águia. Quando estiver em fúria, você adquire um\r\n"
				+ "deslocamento de voo igual ao seu deslocamento de\r\n"
				+ "caminhada. Esse benefício funciona apenas em pequenos\r\n"
				+ "explosões: você cai se terminar seu turno no ar e não tiver\r\n"
				+ "nada em que possa se agarrar.\r\n"
				+ "Lobo. Quando estiver em fúria, você pode usar uma\r\n"
				+ "ação bônus no seu turno para derrubar uma criatura\r\n"
				+ "Grande ou menor no chão quando você atingi-la com um\r\n"
				+ "ataque corpo-a-corpo com arma.\r\n"
				+ "Urso. Quando estiver em fúria, qualquer criatura a\r\n"
				+ "até 1,5 metro de você que for hostil a você terá\r\n"
				+ "desvantagem nas jogadas de ataque contra outros alvos\r\n"
				+ "além de você ou outro personagem com essa\r\n"
				+ "característica. Um inimigo é imune a esse efeito se ele\r\n"
				+ "não puder ver ou ouvir você ou caso ele não possa ser\r\n"
				+ "amedrontado.\r\n\n");
	}
	
}
