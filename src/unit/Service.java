package unit;

public class Service{
    int unit_code;

    public void setOprands(int unit_num){
        this.unit_code = unit_num;
        getUnit();
    }

    public void getUnit(){
        Data data = unit.human.Data.unitData(this.unit_code);

        String name = data.name;
        int attack  = data.attack;
        int defense = data.defense;

        System.out.print("현재 선택된 유닛 : ");
        System.out.println(name + "/" + attack + "/" + defense);
    }
}
