package racingcar.controller;

import racingcar.domain.RacingManager;
import racingcar.input.InputView;
import racingcar.input.OutputView;

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
}
