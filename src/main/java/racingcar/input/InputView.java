package racingcar.input;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public List<String> readCarNames() {
        String input = Console.readLine();
        checkEmpty(input);
        String[] names = input.split(",");
        validateCarNames(names);
        return new ArrayList<>(Arrays.asList(names));
    }

    private void checkEmpty(String input) {
        if (input.equals("")) {
            throw new IllegalArgumentException("[ERROR] 입력값이 필요합니다.");
        }
    }

    private void validateCarNames(String[] names) {
        for (String name : names) {
            validateCarNameSize(name);
        }
    }

    private void validateCarNameSize(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름은 5글자 이하만 가능합니다.");
        }
    }

    public int readNumberOfAttempt() {
        String input = Console.readLine();
        return Integer.parseInt(input);
    }

}
