package unit;

public class ServiceName {
    int unit_code   = 0;
    int attack      = 0;
    int defense     = 0;
    String name     = null;

    public ServiceName(int unit_code, int attack, int defense, String name) {
        this.unit_code = unit_code;
        this.attack    = attack;
        this.defense   = defense;
        this.name      = name;
    }
}
