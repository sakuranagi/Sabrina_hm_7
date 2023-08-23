public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.setHealPoints(10);
        Hero[] heroes = {new Magic(), medic, new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }

    }
}