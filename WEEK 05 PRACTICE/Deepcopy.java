class Engine {
    int horsepower;

    Engine(int hp) {
        this.horsepower = hp;
    }

    // Deep copy helper for Engine class
    Engine(Engine other) {
        this.horsepower = other.horsepower;
    }
}

class Car implements Cloneable {
    Engine engine;

    Car(int hp) {
        this.engine = new Engine(hp);
    }

    // Custom clone method for DEEP COPY
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        // Manually creating a new Engine object so references are separate
        cloned.engine = new Engine(this.engine);
        return cloned;
    }

    void showDetails() {
        System.out.println("HP: " + engine.horsepower + " | Memory Address: " + System.identityHashCode(engine));
    }
}