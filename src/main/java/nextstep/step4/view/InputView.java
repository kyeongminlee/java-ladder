package nextstep.step4.view;

import nextstep.step4.domain.Results;
import nextstep.step4.domain.Users;

import java.util.Scanner;

public class InputView {


    private static Scanner scanner = new Scanner(System.in);

    private static final String INPUT_USER = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_RESULT = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String INPUT_HEIGHT = "최대 사다리 높이는 몇 개인가요?";

    private static final int HEIGHT_LIMIT = 2;

    public Users getUsers() {
        System.out.println(INPUT_USER);
        return Users.initUsers(scanner.nextLine());
    }

    public Results getResults() {
        System.out.println(INPUT_RESULT);
        return Results.initResults(scanner.nextLine());
    }

    public int getHeight() {
        System.out.println(INPUT_HEIGHT);
        int height = Integer.parseInt(scanner.nextLine());
        validateHeight(height);
        return height;
    }

    private void validateHeight(int height) {
        if(height < HEIGHT_LIMIT) {
            throw new IllegalArgumentException("높이는 2 이상이어야 합니다.");
        }
    }
}
