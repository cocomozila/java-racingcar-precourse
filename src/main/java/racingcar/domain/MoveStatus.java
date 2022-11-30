package racingcar.domain;

public enum MoveStatus {

    ADVANCE(1),
    NOTHING(0);

    private final int move;

    MoveStatus(int move) {
        this.move = move;
    }

    public int getMove() {
        return this.move;
    }
}
