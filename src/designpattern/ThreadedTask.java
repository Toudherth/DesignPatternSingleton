package designpattern;

public class ThreadedTask extends Thread{
    private String taskName;

    public ThreadedTask(String taskName){
        this.taskName= taskName;
    }
    public void run(){
        Singleton singleton = Singleton.getInstance();
        singleton.Traiter(taskName);
    }
}
