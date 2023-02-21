import build.barrack.BarrackActionCommand;

public class Main {
    public static void main(String[] args) {
        BarrackActionCommand barrackActionCommand = new BarrackActionCommand();

        System.out.println("------------------------------------");
//        System.out.println("현재 커멘드 인구수 : ");
        System.out.println("배럭이 준비되었습니다. \n아래 유닛을 보고 대기열에 포함시켜주세요.");
//        System.out.println("대기열은 5개 입니다.");
//        System.out.println("대기열 추가를 멈출려면 '0'을 입력해주새요.");
        System.out.println("------------------------------------");
        System.out.println("No |    유닛     |   인구수   | 생산 시간");
        System.out.println("------------------------------------");
        System.out.println("1.      마린          (1)        1");
        System.out.println("2.      매딕          (2)        3");
        System.out.println("3.      파뱃          (3)        5");
        System.out.println("------------------------------------");

        barrackActionCommand.run();
    }
}