import GLOOP.*;
public class Basketball extends Ball{
    private Hindernis hindernis[];
    public Basketball(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        bewegung = new GLVektor(-0.2,-0.5,0);
    }

    public void touchground(){

    }

    public void touchwall(){

    }
}
