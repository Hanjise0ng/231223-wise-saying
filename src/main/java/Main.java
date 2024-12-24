import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();

    }
}

class App {
    public void run() {
        ArrayList<WiseSaying> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int lastNo = 1;
        while(true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                break;

            } else if (command.equals("등록")) {
                System.out.print("명언 : ");
                String sentence = sc.nextLine();

                System.out.print("작가 : ");
                String author = sc.nextLine();
                WiseSaying w = new WiseSaying(lastNo, sentence, author);
                list.add(w);
                System.out.println( lastNo + "번 명언이 등록되었습니다.");
                lastNo++;

            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------------------");

                for (WiseSaying l : list) {
                    System.out.println(l.idx + " / " + l.author + " / " + l.sentence);
                }

            } else {
                System.out.println("잘못된 입력입니다.");

            }
        }

    }
}

class WiseSaying {
    int idx;
    String sentence;
    String author;

    WiseSaying(int idx, String sentence, String author) {
        this.idx = idx;
        this.sentence = sentence;
        this.author = author;
    }

}