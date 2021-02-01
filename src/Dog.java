public class Dog extends Animal{
    private final String name;
    static int count;
    Dog(String name){
        super();
        this.name = name;
        count++;
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        int limit = 500;
        if(distance > limit){
            System.out.println("Собака "+name+" не выполнила задание, потому что собаки не могут пробежать больше "+limit+" м");
        } else {
            System.out.println("Собака "+name+" пробежала "+distance+" м");
        }
    }

    @Override
    public void swimming(int distance) {
        super.swimming(distance);
        int limit = 10;
        if(distance > limit){
            System.out.println("Собака "+name+" не выполнила задание, потому что собаки не могут проплыть больше "+limit+" м");
        } else {
            System.out.println("Собака "+name+" проплыла "+distance+" м");
        }
    }
}
