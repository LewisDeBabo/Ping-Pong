import GLOOP.*;
public class Baseball extends Tennisball{
    public Baseball(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        bewegung = new GLVektor(0.6,0,0);
    }

}