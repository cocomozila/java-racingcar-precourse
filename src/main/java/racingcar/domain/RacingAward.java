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
}
