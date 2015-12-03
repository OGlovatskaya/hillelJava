package HomeWork10.Game;

/**
 * Created by user on 01.12.2015.
 */
public abstract class Character implements Damage {
    private Weapon weapon;
    private int cuttingDamage;
    private int crushingDamage;
    private int piercingDamage;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public void setCuttingDamage(int cuttingDamage) {
        this.cuttingDamage = cuttingDamage;
    }

    @Override
    public void setCrushingDamage(int crushingDamage) {
        this.crushingDamage = crushingDamage;
    }

    @Override
    public void setPiercingDamage(int piercingDamage) {
        this.piercingDamage = piercingDamage;
    }

    @Override
    public int getCuttingDamage() {
        return this.cuttingDamage;
    }

    @Override
    public int getCrushingDamage() {
        return this.crushingDamage;
    }

    @Override
    public int getPiercingDamage() {
        return this.piercingDamage;
    }

    public int totalDamage(){
        int cut = this.getCuttingDamage() + this.weapon.getCuttingDamage();
        int crush = this.getCrushingDamage() + this.weapon.getCrushingDamage();
        int pierce = this.getPiercingDamage() + this.weapon.getPiercingDamage();

        int[] ints = {cut, crush, pierce};
        int max = 0;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] > max){
                max = ints[i];
            }
        }

        int totalDamage;
        if (cut < max && cut > 0){
            totalDamage = max + cut / 2;
        } else
        if (crush < max && crush > 0){
            totalDamage = max + crush / 2;
        } else
        if (pierce < max && pierce > 0){
            totalDamage = max + pierce / 2;
        }else {
            totalDamage = max;
        }
        return totalDamage;
    }

    abstract String display();
}
