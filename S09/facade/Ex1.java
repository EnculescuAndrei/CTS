package ro.ase.acs.facade;

class HomeTheaterFacade {
    private Amplifer amp;
    private Turner turner;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;

    HomeTheaterFacade(Amplifer amp, Turner turner, DvdPlayer dvd, Projector projector, TheaterLights lights){
        this.amp= amp;
        this.turner=turner;
        this.dvd=dvd;
        this.projector= projector;
        this.lights=lights;
    }

    void watchMovie(String movie){
        System.out.println("Get ready for a mocie...");
        lights.dim(10);
        projector.on();
        projector.setInput(dvd);
        projector.wideScreen();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    void endMovie(){
        System.out.println("Shutting down the movie...");
        lights.on();
        amp.off();
        projector.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}


public class Ex1 {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifer(),new Turner(),new DvdPlayer(),new Projector(),new TheaterLights());
        homeTheater.watchMovie("Riders of the Lost Ark");
        homeTheater.endMovie();
    }
}

class Amplifer{
    Amplifer(){

    }
    void on(){
        System.out.println("amp on");
    }

    void setDvd(DvdPlayer dvd){
        System.out.println("Movie: "+ dvd);
    }

    void setSurroundSound(){
        System.out.println("set sound");
    }

    void setVolume(int volume){
        System.out.println("volume"+ volume);
    }
    void off(){
        System.out.println("set amp off");
    }
}

class Turner{

}
class DvdPlayer{
    void on(){
        System.out.println("playing dvd");
    }
    void play(String movie){
        System.out.println("playing movie: "+movie);
    }
    void stop(){
        System.out.println("stopping movie");
    }
    void eject(){
        System.out.println("eject movie");
    }
    void off(){
        System.out.println("movie off");
    }
}
class Projector{
    void on(){
        System.out.println("start projector");
    }
    void setInput(DvdPlayer dvd){
        System.out.println("Dvd: "+ dvd);
    }
    void wideScreen(){
        System.out.println("set wide screen");
    }
    void off(){
        System.out.println("turn projector off");
    }
}
class TheaterLights{
    void dim(int power){
        System.out.println("dim lights with power: "+ power);
    }
    void on(){
        System.out.println("turn lights on");
    }
}
