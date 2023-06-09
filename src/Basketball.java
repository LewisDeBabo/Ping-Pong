import GLOOP.GLVektor;

public class Basketball extends Ball{
    public Basketball(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
    }
    public void werfen3(GLVektor pI){
        bewegung.addiere(pI);
    }
}
