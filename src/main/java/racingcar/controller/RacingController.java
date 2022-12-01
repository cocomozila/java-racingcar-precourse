package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.RacingManager;
import racingcar.input.InputView;
import racingcar.input.OutputView;

import java.util.List;

public class RacingController {

    private RacingManager racingManager;
    private InputView inputView;
    private OutputView outputView;

    public RacingController() {
        this.racingManager = new RacingManager();
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        createCar();
        startRacing();
        finishRacing();
    }

    private void createCar() {
        outputView.displayInputCarName();
        do {
            try {
                racingManager.CreateCars(inputView.readCarNames());
                break;
            } catch (IllegalArgumentException error) {
                outputView.displayError(error);
            }
        } while (true);
    }

    private void startRacing() {
        outputView.displayInputAttempt();
        do {
            try {
                roundProgress(inputView.readNumberOfAttempt());
                break;
            } catch (IllegalArgumentException error) {
                outputView.displayError(error);
            }
        } while (true);
    }

    private void roundProgress(int numberOfAttempt) {
        outputView.displayExecutionResult();
        for (int round = 0; round < numberOfAttempt; round++) {
            racingManager.racingProgress();
            List<Car> cars = racingManager.getCars();
            outputView.displayRacing(cars);
        }
    }

    private void finishRacing() {
        List<String> winners = racingManager.getAwardResult();
        outputView.displayWinnerList(winners);
    }
}
