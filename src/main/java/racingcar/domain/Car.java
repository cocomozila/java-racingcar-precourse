package racingcar.domain;

public class Car implements Comparable<Car> {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(MoveStatus moveStatus) {
        this.position += moveStatus.getMove();
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public int compareTo(Car o) {
        return o.getPosition() - position;
    }
}
