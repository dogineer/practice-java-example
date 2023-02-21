package unit;

import unit.human.NamedObject;

public class UnitServiceFunction extends UnitSystemPreferencesFactory{

    @Override
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
