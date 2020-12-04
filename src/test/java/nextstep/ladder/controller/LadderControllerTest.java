package nextstep.ladder.controller;

import nextstep.ladder.domain.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class LadderControllerTest {

    LadderController controller;

    @Test
    @DisplayName("참가자 리스트 생성 기능")
    void initUsers() {
        String names = "java,study,game";
        InputUsers inputUsers = new InputUsers(names);
        controller = new LadderController();

        List<User> userList = new ArrayList<>();
        for(String name : names.split(",")) {
            userList.add(new User(name));
        }

        Users users = controller.initUsers(inputUsers);
        assertThat(users).isEqualTo(new Users(userList));
    }

    @Test
    @DisplayName("사다리 생성 기능")
    void initLadder() {
        Users users = new Users(Arrays.asList(new User("java"), new User("study")));
        Height height = new Height(3);
        controller = new LadderController();
        Ladder ladder = controller.initLadder(users, height);

        Assertions.assertThat(ladder.getLines().size()).isEqualTo(3);
    }

}
