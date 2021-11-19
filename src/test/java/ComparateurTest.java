import junit.framework.TestCase;

public class ComparateurTest extends TestCase {


    public void testNbAnimal() throws AnimalDansMauvaisSecteurException {
        Zoo zoo = new Zoo();
       Secteur sec=new Secteur(TypeAnimal.CHAT);
        Secteur sec1=new Secteur(TypeAnimal.CHIEN);
       zoo.ajouterSecteur(TypeAnimal.CHAT);
       Animal anim=new Animal("MIMI",TypeAnimal.CHAT) ;
        Animal anim1=new Animal("kiki",TypeAnimal.CHAT );
        Animal anim2=new Animal("chat",TypeAnimal.CHIEN);
       sec.ajouterAnimal(anim);
       sec1.ajouterAnimal(anim2);
       sec.ajouterAnimal(anim1);

       Comparateur c = new Comparateur();
       int d=c.compare(sec,sec1);
       System.out.println("voici le test"+d);
       
    }
}