import GLOOP.*;
public class Tennisball extends Ball{
    public Tennisball(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        bewegung = new GLVektor(0.1,0,0);
    }

}
