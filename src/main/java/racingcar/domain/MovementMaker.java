package racingcar.domain;

public class MovementMaker {

    private RacingNumberGenerator racingNumberGenerator;
    private final int CRITERION_FOR_MOVING_FORWARD = 4;

    public MovementMaker(RacingNumberGenerator racingNumberGenerator) {
        this.racingNumberGenerator = racingNumberGenerator;
    }

    public MoveStatus getMovement() {
        if (racingNumberGenerator.generate() >= CRITERION_FOR_MOVING_FORWARD) {
            return MoveStatus.ADVANCE;
        }
        return MoveStatus.NOTHING;
    }
}
