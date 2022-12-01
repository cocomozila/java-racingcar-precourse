package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class RacingAward {

    public List<String> getAwardsResults(List<Car> cars) {
        Queue<Car> queue = new PriorityQueue<>();
        queue.addAll(cars);
        return getWinners(queue);
    }

    private List<String> getWinners(Queue<Car> cars) {
        List<String> winners = new ArrayList<>();
        addWinner(cars, winners);
        return winners;
    }

    private void addWinner(Queue<Car> cars, List<String> winners) {
        int max = 0;
        do {
            Car car = cars.poll();
            if (car.getPosition() >= max) {
                winners.add(car.getName());
                max = car.getPosition();
                continue;
            }
            return;
        } while (!cars.isEmpty());
    }
}
