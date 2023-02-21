package unit;

import unit.human.NamedObject;

public class UnitSystemPreferencesFactory {
    int unit_code;

    public void setOprands(int unit_num){
        this.unit_code = unit_num;
        getData();
    }

    public void getData(){
        System.out.println(".. run getData");
        ServiceName data = NamedObject.unitData(this.unit_code);

        String name = data.name;
        int attack  = data.attack;
        int defense = data.defense;

        System.out.print("현재 선택된 유닛 : ");
        System.out.println(name + "/" + attack + "/" + defense);
    }
}
