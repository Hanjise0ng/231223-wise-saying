import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    Scanner sc = new Scanner(System.in);
    Map<Integer, WiseSaying> sayings = new HashMap<>();
    

    public void run() {
        System.out.println("== 명언 앱 ==");

        Loop1:while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            
            boolean isDeleteOrUpdate = command.startsWith("삭제") || command.startsWith("수정");
            
            if (isDeleteOrUpdate) {
                System.out.println("삭제 수정 처리");
                continue;
            }

            switch (command) {
                case "등록":
                    //
                    break;
                case "목록":
                    //
                    break;
                case "종료":
                    //
                    break Loop1;
                default:
                    System.out.println("알 수 없는 명령어입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}

class WiseSaying {
    int id;
    String content;
    String author;

    WiseSaying(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

}