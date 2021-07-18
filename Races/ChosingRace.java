package Races;

public interface ChosingRace {
	
	Anao anao = new Anao();
	Draconato draconato = new Draconato();
	Elfo elfo = new Elfo();
	Gnomo gnomo = new Gnomo();
	Halfling halfling = new Halfling();
	Humano humano = new Humano();
	MeioElfo meioElfo = new MeioElfo();
	MeioOrc meioOrc = new MeioOrc();
	Tiefling tiefling = new Tiefling();

	static void setRaca(int raca, int subraca) {
		switch(raca) {
		case 0:
			anao.setRacaAnao();
			if(subraca == 0) {
				anao.setanaoSRcolina();
			}else {
				anao.setanaoSRmontanha();
			}
		break;
		
		case 1:
			elfo.setRacaElfo();
			if(subraca == 0) {
				elfo.setAltoElfo();
			}else if(subraca == 1) {
				elfo.setElfoDaFloresta();
			}else {
				elfo.setElfoNegro();
			}
		break;
		
		case 2:
			halfling.setHalfling();
			if(subraca == 0) {
				halfling.setPesLeves();
			}else {
				halfling.setRobusto();
			}
		break;
		
		case 3:
			draconato.setDraconato();
		break;

		case 4:
			humano.setHumano();
		break;
		
		case 5:
			gnomo.setGnomo();
			if(subraca == 0) {
				gnomo.setGnomoDaFloresta();
			}else {
				gnomo.setGnomoDasRochas();
			}
		break;
		
		case 6:
			meioElfo.setMeio_elfo();
		break;
		
		case 7:
			meioOrc.setMeio_orc();
		break;
		
		case 8:
			tiefling.setTiefling();
		break;
		}
	}
	
	static void setRaca(String raca) {
		switch(raca) {
	
		case "Draconato":
			draconato.setDraconato();
		break;

		case "Humano":
			humano.setHumano();
		break;
				
		case "Meio_elfo":
			meioElfo.setMeio_elfo();
		break;
		
		case "Meio_orc":
			meioOrc.setMeio_orc();
		break;
		
		case "Tiefling":
			tiefling.setTiefling();
		break;
		}
	}
	
	static String getDescricaoRaca(int i) {
		switch(i) {
		case 0:
			return anao.anaoDescricao();
			
		case 1:
			return elfo.elfoDescricao();
		
		case 2:
			return halfling.halflingDescricao();
		
		case 3:
			return humano.humanoDescricao();
			
		case 4:
			return draconato.draconatoDescricao();
			
		case 5:
			return gnomo.gnomoDescricao();
			
		case 6:
			return meioElfo.meio_elfoDescricao();
			
		case 7:
			return meioOrc.meio_orcDescricao();
		
		case 8:
			return tiefling.tieflingDescricao();
		}
		
		return null;
	}
	
	static String getDescricaoSubRaca(String raca, int subraca) {
		switch(raca) {
		case "Anao":
			if(subraca == 0) {
				return anao.anaoSRcolina();
			}
			return anao.anaoSRmontanha();
			
		case "Elfo":
			if(subraca == 0) {
				return elfo.getAltoElfo();
			}else if(subraca == 1) {
				return elfo.getElfoDaFloresta();
			}
			return elfo.getElfoNegro();
			
		case "Halfling":
			if(subraca == 0) {
				return halfling.getPesLeves();
			}
			return halfling.getRobusto();
			
		case "Gnomo":
			if(subraca == 0) {
				return gnomo.getGnomoDaFloresta();
			}
			return gnomo.getGnomoDasRochas();
		}
		return null;
	}
	
}
