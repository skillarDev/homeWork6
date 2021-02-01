public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog = new Dog("Шарик");
        Dog dog2 = new Dog("Рэкс");
        Dog dog3 = new Dog("Бобик");
        cat.run(180);
        cat.swimming(5);
        cat2.run(210);
        dog.run(300);
        dog.swimming(10);
        dog2.run(600);
        dog2.swimming(11);
        System.out.println("Создано животных: "+Animal.count);
        System.out.println("Создано котов: "+ Cat.count);
        System.out.println("Создано собак: "+ Dog.count);

    }
}
