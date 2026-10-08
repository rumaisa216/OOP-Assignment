class Engine {
    int horsepower;

    Engine(int hp) {
        this.horsepower = hp;
    }
}

class Car implements Cloneable {
    Engine engine;

    Car(int hp) {
        this.engine = new Engine(hp);
    }

    // Default Object.clone() performs a Shallow Copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void showDetails() {
        System.out.println("HP: " + engine.horsepower + " | Memory Address: " + System.identityHashCode(engine));
    }
}