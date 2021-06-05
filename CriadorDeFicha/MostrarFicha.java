package CriadorDeFicha;

import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;

public class MostrarFicha {
	private FichaDoPersonagem ficha;

	public void setFicha(FichaDoPersonagem ficha) {
		this.ficha = ficha;
	}
	
	public void mostrarFicha() {
		System.out.println("-------Ficha D&D 5�-------");
		System.out.println("Nome do personagem: " +ficha.getNome_personagem());
		System.out.println("Classe: " +ficha.getClasse() +"  Nivel: " +ficha.getNivel());
		System.out.println("Antecedente: " +ficha.getAntecedente());
		System.out.println("Ra�a: " +ficha.getRaca());
		System.out.println("Pontos de vida: " +ficha.getPontos_vida());
		System.out.println("Classe de armadura: " +ficha.getClasseDeArmadura());
		
		System.out.println("\n---Atributos---");
		System.out.println("For�a: " +ficha.getForca() +" | " +ficha.getForca_mod());
		System.out.println("Destreza: " +ficha.getDestreza() +" | " +ficha.getDestreza_mod());
		System.out.println("Constitui��o: " +ficha.getConstituicao() +" | " +ficha.getConstituicao_mod());
		System.out.println("Intelig�ncia: " +ficha.getInteligencia() +" | " +ficha.getInteligencia_mod());
		System.out.println("Sabedoria: " +ficha.getSabedoria() +" | " +ficha.getSabedoria_mod());
		System.out.println("Carisma: " +ficha.getCarisma() +" | " +ficha.getCarisma_mod());
		
		System.out.println("\n---Teste de resist�ncia---");
		System.out.println("For�a: " +ficha.getTeste_forca() +" | " +ficha.getTem_resForca());
		System.out.println("Destreza: " +ficha.getTeste_destreza() +" | " +ficha.getTem_resDestreza());
		System.out.println("Constitui��o: " +ficha.getTeste_constituicao() +" | " +ficha.getTem_resConstituicao());
		System.out.println("Intelig�ncia: " +ficha.getTeste_inteligencia() +" | " +ficha.getTem_resInteligencia());
		System.out.println("Sabedoria: " +ficha.getTeste_sabedoria() +" | " +ficha.getTem_resSabedoria());
		System.out.println("Carisma: " +ficha.getTeste_carisma() +" | " +ficha.getTem_resCarisma());
		
		System.out.println("\n---Per�cias---");
		System.out.println("Acrobacia: " +ficha.getAcrobacia() +" | " +ficha.isTem_acrobacia());
		System.out.println("Adestrar Animais: " +ficha.getAdestrar_animais() +" | " +ficha.isTem_adestrar_animais());
		System.out.println("Arcanismo: " +ficha.getArcanismo() +" | " +ficha.isTem_arcanismo());
		System.out.println("Atletismo: " +ficha.getAtletismo() +" | " +ficha.isTem_atletismo());
		System.out.println("Engana��o: " +ficha.getEnganacao() +" | " +ficha.isTem_acrobacia());
		System.out.println("Hist�ria: " +ficha.getHistoria() +" | " +ficha.isTem_historia());
		System.out.println("Intui��o: " +ficha.getIntuicao() +" | " +ficha.isTem_intuicao());
		System.out.println("Intimida��o: " +ficha.getIntimidacao() +" | " +ficha.isTem_intimidacao());
		System.out.println("Investiga��o: " +ficha.getInvestigacao() +" | " +ficha.isTem_investigacao());
		System.out.println("Medicina: " +ficha.getMedicina() +" | " +ficha.isTem_medicina());
		System.out.println("Natureza: " +ficha.getNatureza() +" | " +ficha.isTem_natureza());
		System.out.println("Percep��o: " +ficha.getPercepcao() +" | " +ficha.isTem_percepcao());
		System.out.println("Atua��o: " +ficha.getAtuacao() +" | " +ficha.isTem_atuacao());
		System.out.println("Persuas�o: " +ficha.getPersuasao() +" | " +ficha.isTem_persuasao());
		System.out.println("Religi�o: " +ficha.getReligiao() +" | " +ficha.isTem_religiao());
		System.out.println("Prestidigita��o: " +ficha.getPrestidigitacao() +" | " +ficha.isTem_prestidigitacao());
		System.out.println("Furtividade: " +ficha.getFurtividade() +" | " +ficha.isTem_furtividade());
		System.out.println("Sobreviv�ncia: " +ficha.getSobrevivencia() +" | " +ficha.isTem_sobrevivencia());
		
		System.out.println("\n---Caracteristicas antecedente---");
		System.out.println("\nTra�os de personalidade--");
		for(int i = 0; i < ficha.getTracos_personalidade().size(); i++) {
			System.out.println(ficha.getTracos_personalidade().get(i));
		}
		System.out.println("\nIdeal--");
		System.out.println(ficha.getIdeal());
		System.out.println("\nV�nculo--");
		System.out.println(ficha.getVinculo());
		System.out.println("\nDefeito--");
		System.out.println(ficha.getDefeito());
		
		System.out.println("\n---Caracteristicas e tra�os---");
		System.out.println("Feats classe--\n");
		for(int i = 0; i < ficha.getClassefeats().size(); i++) {
			System.out.println(ficha.getClassefeats().get(i));
		}
		System.out.println("Tra�os raciais--\n");
		for(int i = 0; i < ficha.getTracosraciais().size(); i++) {
			System.out.println(ficha.getTracosraciais().get(i));
		}
		
		System.out.println("\n---Outras profici�ncias e Idiomas---");
		System.out.println("\nEquipamentos--\n");
		for(int i = 0; i < ficha.getProfi_equips().size(); i++) {
			System.out.println(ficha.getProfi_equips().get(i));
		}
		System.out.println("\nIdiomas--\n");
		for(int i = 0; i < ficha.getIdiomas().size(); i++) {
			System.out.println(ficha.getIdiomas().get(i));
		}
		
		System.out.println("\n--Inventario--\n");
		for(int i = 0; i < ficha.getEquipamentos().size(); i++) {
			System.out.println(ficha.getEquipamentos().get(i));
		}
	}
}
