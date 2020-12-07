package nextstep.ladder.controller;

import nextstep.ladder.domain.*;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.ResultView;

import java.util.List;

public class LadderController {

    public void start() {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        InputUsers inputUsers = new InputUsers(inputView.inputParticipants());
        Users users = Users.createUsers(inputUsers);

        Height height = new Height(Integer.parseInt(inputView.inputHeight()));

        resultView.printResultMention();
        resultView.printUsers(users);
        Ladder ladder = Ladder.initLadder(users, height);
        drawLadders(resultView, ladder);
    }

    private void drawLadders(ResultView resultView, Ladder ladder) {
        ladder.getLines()
                .forEach(line -> drawLine(resultView, line.getPoints()));
    }

    private void drawLine(ResultView resultView, List<Point> points) {
        resultView.enterLine();
        points.forEach(point -> checkDirection(resultView, point));
    }

    private void checkDirection(ResultView resultView, Point point) {
        if(point.getDirection() == Direction.RIGHT) {
            resultView.drawRight();
        }

        if(point.getDirection() == Direction.LEFT) {
            resultView.drawLeft();
        }

        if(point.getDirection() == Direction.FORWARD) {
            resultView.drawForward();
        }
    }

}
