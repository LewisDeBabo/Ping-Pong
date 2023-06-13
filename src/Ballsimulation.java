import GLOOP.*;
public class Ballsimulation{
    private GLKamera kamera;
    GLLicht licht;
    GLHimmel himmel;
    GLBoden boden;
    private GLTastatur tastatur;

    private Ball ball;
    private Tennisball tennis;
    private Fußball fuß;
    private Basketball basket;
    private Baseball base;

    private Hindernis[] hindernis;

    public Ballsimulation(){
        kamera = new GLSchwenkkamera(800,500);
        kamera.setzePosition(0,500,2000);
        licht  = new GLLicht();       
        boden  = new GLBoden("src/Boden.jpg");
        himmel = new GLHimmel("src/Himmel.jpg");
        tastatur = new GLTastatur();

        hindernis = new Hindernis[2];
        hindernis[0] = new Hindernis(1000,200,0, 50,400,1300);
        hindernis[1] = new Hindernis(-1000,200,0, 50,400,1300);

        ball = new Ball (0,200,0, 20);
        ball.werfen(new GLVektor(1,0,0));
        ball.Texturaendern("src/ball.jpg");

        tennis = new Tennisball (0,160,0, 20);
        tennis.werfen(new GLVektor(1,0,0));
        tennis.Texturaendern("src/tennisball.jpg");

        fuß = new Fußball (0,240,0, 20);
        fuß.werfen(new GLVektor(1,0,0));
        fuß.Texturaendern("src/fußball.jpg");

        basket = new Basketball (0,120,0, 20);
        basket.werfen(new GLVektor(1,0,0));
        basket.Texturaendern("src/basketball.jpg");

        base = new Baseball (0,80,0, 20);
        base.werfen(new GLVektor(1,0,0));
        base.Texturaendern("src/baseball.jpg");


        if basket

        fuehreAus();
    }

    public void fuehreAus(){
        while (!tastatur.esc()){

            ball.bewegeDich();
            for (int j=0; j<2; j++)
                ball.bearbeiteHindernis(hindernis[j]);
            tennis.bewegeDich();
            for (int j=0; j<2; j++)
                tennis.bearbeiteHindernis(hindernis[j]);
            basket.bewegeDich();
            for (int j=0; j<2; j++)
                basket.bearbeiteHindernis(hindernis[j]);
            fuß.bewegeDich();
            for (int j=0; j<2; j++)
                fuß.bearbeiteHindernis(hindernis[j]);
            base.bewegeDich();
            for (int j=0; j<2; j++)
                base.bearbeiteHindernis(hindernis[j]);

            Sys.warte();
        }
        Sys.beenden();
    }
    
}
