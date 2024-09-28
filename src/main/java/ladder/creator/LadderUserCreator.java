package ladder.creator;

import ladder.GreaterThanOne;
import ladder.Position;
import ladder.Row;

public class LadderUserCreator implements LadderCreator {
    private final Row[] rows;

    public LadderUserCreator(GreaterThanOne numberOfRow, GreaterThanOne numberOfPerson) {
        rows = new Row[numberOfRow.getNumber()];
        for (int i = 0; i < numberOfRow.getNumber(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }
    @Override
    public void drawLine(Position row, Position col) {
        rows[row.getPosition()].drawLine(col);
    }
    @Override
    public Row[] getRows() {
    return rows;
    }
}
