package unit.human;

public class Data {
    public static unit.Data unitData(int code){
        int unit_code   = 0;
        int attack      = 0;
        int defense     = 0;
        String name     = null;

        switch (code){
            case 1:
                unit_code = 1;
                attack    = 1;
                defense   = 1;
                name   = "마린";
                break;

            case 2:
                unit_code = 2;
                defense   = 1;
                name   = "메딕";
                break;

            default:
                System.out.println("선택된 유닛이 없습니다.");
                break;
        }

        return new unit.Data(unit_code, attack, defense, name);
    }
}
