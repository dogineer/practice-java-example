package unit;

abstract class UnitSystemPreferencesFactory {
    int unit_code;

    public void setOprands(int unit_num){
        this.unit_code = unit_num;
    }

    public abstract void getData();

    public void run(){
        getData();
    }
}
