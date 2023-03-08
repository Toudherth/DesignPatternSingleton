package designpattern;

public class Application {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //Singleton s = Singleton.getInstance();
            //s.Traiter("T"+i);

            // ici pour thread
            System.out.println("ici pour le thread------");
            ThreadedTask t= new ThreadedTask("T"+i);
            t.start();
        }
    }


}
