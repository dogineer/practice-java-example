package build.barrack;

import unit.UnitSystemPreferencesFactory;

import java.util.Scanner;

public class BarrackActionCommand extends BarrackSystemPreferencesFactory {

    @Override
    public void getUnitCode(){
        System.out.println(".. run getUnitCode");
        Scanner input = new Scanner(System.in);
        System.out.print(" 입력 : ");
        unit_code = input.nextInt();
    }

    @Override
    public void produce(){
        System.out.println(".. run produce");
        unitService.setOprands(this.unit_code);
    }


}
