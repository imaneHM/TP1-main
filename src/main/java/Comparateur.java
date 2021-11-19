import java.util.Comparator;
import java.lang.Integer;
public class Comparateur implements Comparator<Secteur> {

    public int compare(Secteur a,Secteur b){
        int d;
        d=Integer.compare(a.z,b.z);
        return d;

    }


}
