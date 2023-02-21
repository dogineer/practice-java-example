package build.barrack;

abstract class BarrackSystemPreferencesFactory {


    int unit_code;

    public void setOprands(int num){
        this.unit_code = num;
    }

    public abstract void getUnitCode();
    public abstract void produce();

    public void run(){
        getUnitCode();
        produce();
    }
}
