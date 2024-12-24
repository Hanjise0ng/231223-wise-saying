import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();

    }
}

class App {
    ArrayList<WiseSaying> list = new ArrayList<>();
    int lastId = 0;
    String content = "";
    String author = "";

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                break;

            } else if (command.equals("등록")) {
                System.out.print("명언 : ");
                content = sc.nextLine();

                System.out.print("작가 : ");
                author = sc.nextLine();

                add(++lastId, content, author);

            }else if(command.equals("삭제")) {
                // System.out.println("%d번 명언이 삭제되었습니다.".formatted(list[i].idx));
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------------------");

                for (WiseSaying l : list) {
                    System.out.println(" %d / %s / %s".formatted(l.id, l.author, l.content));
                }

            } else {
                System.out.println("잘못된 입력입니다.");

            }
        }

    }

    public void add(int lastId, String content, String author) {
        list.add(new WiseSaying(lastId, content, author));
        System.out.println("%d번 명언이 등록되었습니다.".formatted(lastId));
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