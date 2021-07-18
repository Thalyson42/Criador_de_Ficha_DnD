package CriadorDeFicha;

import Backgrounds.Antecedentes;
import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;

public abstract class Classes {
	private static String nome;
	private static FichaDoPersonagem ficha;
	private static Proficiencia proficiencia;
	private static Equipamentos equips;
	private static Magias magias;
	private static Idiomas idiomas;
	private static AtribuirHabilidades atribuirHabilidades = new AtribuirHabilidades();
	private static Antecedentes antecedentes;
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Classes.nome = nome;
	}
	public static void setAtribuirHabilidades(AtribuirHabilidades atribuirHabilidades) {
		Classes.atribuirHabilidades = atribuirHabilidades;
	}
	public static FichaDoPersonagem getFicha() {
		return ficha;
	}
	public static void salvarFicha(FichaDoPersonagem ficha) {
		Classes.ficha = ficha;
	}
	public static Proficiencia getProficiencia() {
		return proficiencia;
	}
	public static void setProficiencia(Proficiencia proficiencia) {
		Classes.proficiencia = proficiencia;
	}
	public static Equipamentos getEquips() {
		return equips;
	}
	public static void setEquips(Equipamentos equips) {
		Classes.equips = equips;
	}
	public static Magias getMagias() {
		return magias;
	}
	public static void setMagias(Magias magias) {
		Classes.magias = magias;
	}
	public static Idiomas getIdiomas() {
		return idiomas;
	}
	public static void setIdiomas(Idiomas idiomas) {
		Classes.idiomas = idiomas;
	}
	public static AtribuirHabilidades getAtribuirHabilidades() {
		return atribuirHabilidades;
	}
	
	public static Antecedentes getAntecedentes() {
		return antecedentes;
	}
	public static void setAntecedens(Antecedentes antecedentes) {
		Classes.antecedentes = antecedentes;
	}
	
}
