package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.domain.result.RacingGameResult;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RacingGameTest {
    @Test
    void 경기_진행결과_DB가_정상적으로_만들어졌는지_테스트() {
        List<Car> cars = Arrays.asList(new Car("red"), new Car("blue"), new Car("green"));
        RacingGamePlayers players = new RacingGamePlayers(cars);
        GameCount gameCount = new GameCount(7);
        RacingGameResult racingGameResult = new RacingGame(players, gameCount).start();

        assertEquals(racingGameResult.getGameResultHistory().size(), gameCount.getGameCount());
    }
}