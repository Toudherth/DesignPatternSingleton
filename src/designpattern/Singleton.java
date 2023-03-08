package designpattern;

public class Singleton {
    private static final Singleton singleton;

    private int compteur;
    static {
        singleton= new Singleton();
    }

    private Singleton(){
        System.out.println("Instanciation de Singleton");
    }

    public static Singleton getInstance(){
        return singleton;
    }

    public synchronized void Traiter(String taskName){
        System.out.println("... Traitement de la tache "+taskName);

        for(int i =1; i<= 5; i++){
            ++compteur;
            System.out.println(".."+compteur);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Fin de traitement de la tache "+taskName+" compteur = "+compteur);
    }
}
