package Interview;

public class Singleton {

    static Singleton singleton=new Singleton();

    private  Singleton(){

    }

    public  Singleton getInstance(){
        return singleton;
    }
}
