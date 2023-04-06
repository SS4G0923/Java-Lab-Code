package Lab6.tsk1;

public class Music {
    public static void tune(Instrument i){
        i.play();
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        Brass brass = new Brass();
        Music.tune(wind);
        Music.tune(brass);
    }

}
