public class Cat extends Animal{
    private final String name;
    static int count;

    Cat(String name){
        super(name);
        this.name = name;
        count++;
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        String name = this.name;
        int limit = 200;
        if(distance > limit){
            System.out.println("Кот "+name+" не выполнил задание, потому что коты не могут пробежать больше "+limit+" м");
        } else {
            System.out.println("Кот "+name+" пробежал "+distance+" м");
        }
    }

    @Override
    public void swimming(int distance) {
        super.swimming(distance);
        System.out.println("Кот "+name+" не выполнил задание, потому что коты не умеют плавать");
    }
}
