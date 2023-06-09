import GLOOP.GLVektor;

public class Tennisball extends Ball{
    public Tennisball(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
    }
    public void werfen1(GLVektor pI){
        bewegung.addiere(pI);
    }
}
