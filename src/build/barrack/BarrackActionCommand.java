package build.barrack;
import unit.UnitServiceFunction;

import java.util.Scanner;

public class BarrackActionCommand extends BarrackSystemPreferencesFactory {

    UnitServiceFunction unitServiceFunction = new UnitServiceFunction();

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
        unitServiceFunction.setOprands(this.unit_code);
        unitServiceFunction.run();
    }


}
