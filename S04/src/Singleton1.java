class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Singleton is doing something");
    }
}

class Main{
    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        instance.doSomething();
    }
}