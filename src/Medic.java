public class Medic extends Hero{
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
    public void increaseExperience(){
        this.setHealPoints((int) (this.healPoints * 1.1));
        System.out.println(this.healPoints + " :сила лечения Medic увеличелась на 10% ");

    }

    @Override
    public void applySuperAbility() {
        increaseExperience();
        System.out.println("Medic применил суперспособность лечения");

    }

}
