import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();

    }
}

class App {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int idx = 1;
        while(true) {
            System.out.print("명령) ");
            String options = sc.nextLine();

            if (options.equals("종료")) {
                break;
            }
            else if (options.equals("등록")) {
                System.out.print("명언 : ");
                String wise = sc.nextLine();

                System.out.print("작가 : ");
                String name = sc.nextLine();

                System.out.println( idx++ + "번 명언이 등록되었습니다.");
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
