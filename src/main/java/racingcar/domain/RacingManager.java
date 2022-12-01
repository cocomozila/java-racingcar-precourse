package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingManager {

    private MovementMaker movementMaker;
    private RacingAward racingAward;
    private List<Car> cars;

    public RacingManager() {
        this.movementMaker = new MovementMaker(new RacingRandomNumberGenerator());
        this.racingAward = new RacingAward();
    }

    public void CreateCars(List<String> names) {
        List<Car> list = new ArrayList<>();
        for (String name : names) {
            list.add(new Car(name));
        }
        this.cars = list;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void racingProgress() {
        roundProgress(this.cars);
    }

    private void roundProgress(List<Car> cars) {
        for (Car car : cars) {
            car.move(movementMaker.getMovement());
        }
    }
}
