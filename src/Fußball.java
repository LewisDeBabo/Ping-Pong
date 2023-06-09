import GLOOP.GLVektor;

public class Fußball extends Ball{
    public Fußball(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
    }
    public void werfen2(GLVektor pI){
        bewegung.addiere(pI);
    }
}