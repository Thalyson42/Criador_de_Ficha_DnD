package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Proficiencia extends Classes{
//	private FichaDoPersonagem ficha;
//	private Equipamentos equips;
//	
//	public void setFicha(FichaDoPersonagem ficha) {
//		this.ficha = ficha;
//	}
//	
//	public FichaDoPersonagem getFicha() {
//		return this.ficha;
//	}
	
	public void setPericias(List<String> p, int contador) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> pericias = new ArrayList<String>();
		pericias.addAll(verificarPericia(p));
		
		while(contador != 0) {
			int opcao;
			do {
				System.out.printf("Escolha %d dessas pericias:\n", contador);
				for(int i = 0; i < pericias.size(); i++) {
					System.out.println(i +" - " +pericias.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite uma op��o valida!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > pericias.size()-1);
					
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				char decisao;
				System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", pericias.get(opcao));
						
				decisao = entrada.next().charAt(0);
				if(decisao == 'Y' || decisao == 'y') {
					aplicandoPericia(pericias.get(opcao));
					pericias.remove(opcao);
					contador--;
					decisaoLoop = true;
							
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}	
		}
		
	}
	
	public void setPericias(int contador) {
		List<String> p = Arrays.asList("Acrobacia", "Adestrar Animais", "Arcanismo", "Atletismo", "Engana��o", "Hist�ria", "Intui��o", "Intimida��o", "Investiga��o", "Medicina", "Natereza", "Percep��o", "Atua��o", "Persuas�o", "Religi�o", "Prestidigita��o", "Furtividade", "Sobreviv�ncia");
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> pericias = new ArrayList<String>();
		pericias.addAll(verificarPericia(p));
		
		while(contador != 0) {
			int opcao;
			do {
				System.out.printf("Escolha %d dessas pericias:\n", contador);
				for(int i = 0; i < pericias.size(); i++) {
					System.out.println(i +" - " +pericias.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite uma op��o valida!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > pericias.size()-1);
					
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				char decisao;
				System.out.printf("Tem certeza que deseja escolher %s? (Y/N)\n", pericias.get(opcao));
						
				decisao = entrada.next().charAt(0);
				if(decisao == 'Y' || decisao == 'y') {
					aplicandoPericia(pericias.get(opcao));
					pericias.remove(opcao);
					contador--;
					decisaoLoop = true;
							
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}	
		}
		
	}
	
	public void setPericias(List<String> p) {
		ArrayList<String> pericias = new ArrayList<String>();
		pericias.addAll(verificarPericia(p));
		for(int i = 0; i < pericias.size(); i++) {
			aplicandoPericia(pericias.get(i));
		}
	}
	
	public ArrayList<String> verificarPericia(List<String> pericias) {
		ArrayList<String> p = new ArrayList<String>();
		
		for(int i = 0; i < pericias.size(); i++) {
			switch(pericias.get(i)) {
			case "Acrobacia":
				if(getFicha().isTem_acrobacia() == false) p.add(pericias.get(i));
				break;
				
			case "Adestrar Animais":
				if(getFicha().isTem_adestrar_animais() == false) p.add(pericias.get(i));
				break;
				
			case "Arcanismo":
				if(getFicha().isTem_arcanismo() == false) p.add(pericias.get(i));
				break;
				
			case "Atletismo":
				if(getFicha().isTem_atletismo() == false) p.add(pericias.get(i));
				break;
				
			case "Engana��o":
				if(getFicha().isTem_enganacao() == false) p.add(pericias.get(i));
				break;
				
			case "Hist�ria":
				if(getFicha().isTem_historia() == false) p.add(pericias.get(i));
				break;
				
			case "Intui��o":
				if(getFicha().isTem_intuicao() == false) p.add(pericias.get(i));
				break;
				
			case "Intimida��o":
				if(getFicha().isTem_intimidacao() == false) p.add(pericias.get(i));
				break;
				
			case "Investiga��o":
				if(getFicha().isTem_investigacao() == false) p.add(pericias.get(i));
				break;
				
			case "Medicina":
				if(getFicha().isTem_medicina() == false) p.add(pericias.get(i));
				break;
				
			case "Natureza":
				if(getFicha().isTem_natureza() == false) p.add(pericias.get(i));
				break;
				
			case "Percep��o":
				if(getFicha().isTem_percepcao() == false) p.add(pericias.get(i));
				break;
				
			case "Atua��o":
				if(getFicha().isTem_atuacao() == false) p.add(pericias.get(i));
				break;
				
			case "Persuas�o":
				if(getFicha().isTem_percepcao() == false) p.add(pericias.get(i));
				break;
				
			case "Religi�o":
				if(getFicha().isTem_religiao() == false) p.add(pericias.get(i));
				break;
				
			case "Prestidigita��o":
				if(getFicha().isTem_prestidigitacao() == false) p.add(pericias.get(i));
				break;
				
			case "Furtividade":
				if(getFicha().isTem_furtividade() == false) p.add(pericias.get(i));
				break;
				
			case "Sobreviv�ncia":
				if(getFicha().isTem_sobrevivencia() == false) p.add(pericias.get(i));
				break;
			}
		}
		return p;
	}
	
	public void aplicandoPericia(String pericias) {
		switch(pericias) {
		case "Acrobacia":
			getFicha().setTem_acrobacia();
		break;
		
		case "Adestrar Animais":
			getFicha().setTem_adestrar_animais();
		break;
		
		case "Arcanismo":
			getFicha().setTem_arcanismo();
		break;
		
		case "Atletismo":
			getFicha().setTem_atletismo();
		break;
		
		case "Engana��o":
			getFicha().setTem_enganacao();
		break;
		
		case "Hist�ria":
			getFicha().setTem_historia();
		break;
		
		case "Intui��o":
			getFicha().setTem_intuicao();
		break;
		
		case "Intimida��o":
			getFicha().setTem_intimidacao();
		break;
		
		case "Investiga��o":
			getFicha().setTem_investigacao();
		break;
		
		case "Medicina":
			getFicha().setTem_medicina();
		break;
		
		case "Natureza":
			getFicha().setTem_natureza();
		break;
		
		case "Percep��o":
			getFicha().setTem_percepcao();
		break;
		
		case "Atua��o":
			getFicha().setTem_atuacao();
		break;
		
		case "Persuas�o":
			getFicha().setTem_percepcao();
		break;
		
		case "Religi�o":
			getFicha().setTem_religiao();
		break;
		
		case "Prestidigita��o":
			getFicha().setTem_prestidigitacao();
		break;
		
		case "Furtividade":
			getFicha().setTem_furtividade();
		break;
		
		case "Sobreviv�ncia":
			getFicha().setTem_sobrevivencia();
		break;
		}
	}
	
	public void SetProfEquips(List<String> profiEquips) {
		ArrayList<String> proficiencia_equips = new ArrayList<String>();
		proficiencia_equips.addAll(profiEquips);
		ArrayList<String> identify = new ArrayList<String>();
		
		//corrigir
		for(int i = 0; i < proficiencia_equips.size(); i++) {
			boolean tem = false;
			for(int c = 0; c < getFicha().getProfi_equips().size(); c++) {
				if(Objects.equals(proficiencia_equips.get(i), getFicha().getProfi_equips().get(c))) tem = true;
			}
			if(tem == false) identify.add(proficiencia_equips.get(i));
		}
		
		getFicha().setProfi_equips(identify);
	}
	
	public void SetResistencia(List<String> resistencia) {
		for(int i = 0; i < resistencia.size(); i++) {
			switch(resistencia.get(i)) {
			case "For�a":
				getFicha().setTem_resForca();
			break;
			
			case "Destreza":
				getFicha().setTem_resDestreza();
			break;
			
			case "Constitui��o":
				getFicha().setTem_resConstituicao();
			break;
			
			case "Intelig�ncia":
				getFicha().setTem_resInteligencia();
			break;
			
			case "Sabedoria":
				getFicha().setTem_resSabedoria();
			break;
			
			case "Carisma":
				getFicha().setTem_resCarisma();
			break;
			}
		}
	}
	//usage?
//	public void setAllProficienciaArmaduras(List<String> listaArmaduras) {
//		ArrayList<String> armaduras = new ArrayList<String>();
//		for(int i = 0; i < listaArmaduras.size(); i++) {
//			armaduras.addAll(this.equips.getArmadura(listaArmaduras.get(i)));
//		}
//		this.ficha.setProfi_equips(armaduras);
//	}
//	
	public void setProficienciaEscudos() {
		getFicha().setProfi_equips(""+getEquips());
	}
	
}
