package ejercicioStream08;

public class GatosService {
	GatosRepository gatosRepository=new GatosRepository();
	
	public boolean addOneThousandCats() {
		GatoOM gatoOM=new GatoOM();
		int thousand = 1000;
		do {
			gatosRepository.add(gatoOM.getRandomCat());
		}while(gatosRepository.size()<thousand);
		return true;
	}
	
	public ? findCatsByRace(){
		
	}
	public ? findMostNumerousRace(){
		
	}
}
