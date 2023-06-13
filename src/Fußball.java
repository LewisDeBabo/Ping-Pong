import GLOOP.*;
public class Fußball extends Ball{
    public Fußball(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        bewegung = new GLVektor(0.4,0,0);
    }

}