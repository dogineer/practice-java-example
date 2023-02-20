package build.barrack;

import java.util.List;

public class Service{
    int unit_code;

    unit.Service unitService = new unit.Service();

    public void setOprands(int num){
        this.unit_code = num;
    }

    public void produce(){
        unitService.setOprands(this.unit_code);
    }
}
