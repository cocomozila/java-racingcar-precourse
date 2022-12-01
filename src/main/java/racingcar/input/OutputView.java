package racingcar.input;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {

    public void displayInputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void displayInputAttempt() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void displayExecutionResult() {
        System.out.println("\n실행 결과");
    }

    public void displayRacing(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName()+ " : " + displayDistance(car));
        }
        System.out.println();
    }

    private String displayDistance(Car car) {
        StringBuilder distance = new StringBuilder();
        for (int index = 0; index < car.getPosition(); index++) {
            distance.append("-");
        }
        return distance.toString();
    }

    public void displayWinnerList(List<String> winners) {
        String message = "최종 우승자 : ";
        message = makeWinner(winners, message);
        System.out.println(message);
    }

    private String makeWinner(List<String> winners, String message) {
        StringBuilder messageBuilder = new StringBuilder(message);
        for (int index = 0; index < winners.size(); index++) {
            messageBuilder.append(winners.get(index));
            if (index < winners.size() - 1) {
                messageBuilder.append(", ");
            }
        }
        return messageBuilder.toString();
    }

    public void displayError(IllegalArgumentException error) {
        System.out.println(error.getMessage());
    }
}
