import java.util.ArrayList;
import java.util.List;

public class Secteur  {

	private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	private TypeAnimal typeAnimauxDansSecteur;
	int z;
	
	public Secteur(TypeAnimal typeAnimauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}

	public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException{
		if (animal.getTypeAnimal() != typeAnimauxDansSecteur){
			throw new AnimalDansMauvaisSecteurException();
		}
		animauxDansSecteur.add(animal);
	}
	
	public int getNombreAnimaux(){

		z= animauxDansSecteur.size();
		return z;
	}
	
	public TypeAnimal obtenirType(){
		return typeAnimauxDansSecteur;
	}
}
