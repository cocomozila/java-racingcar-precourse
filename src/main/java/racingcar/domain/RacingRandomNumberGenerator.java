package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingRandomNumberGenerator implements RacingNumberGenerator {

    private final int RANDOM_PICK_MIN_NUMBER = 0;
    private final int RANDOM_PICK_MAX_NUMBER = 9;

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(RANDOM_PICK_MIN_NUMBER, RANDOM_PICK_MAX_NUMBER);
    }
}
