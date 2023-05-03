public class Slizerin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lusForPower;

    public Slizerin(String name, int powerMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lusForPower) {
        super(name, powerMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lusForPower = lusForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLusForPower() {
        return lusForPower;
    }

    public void setLusForPower(int lusForPower) {
        this.lusForPower = lusForPower;
    }

    @Override
    public String toString() {
        return "Slizerin{" + super.toString()+
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lusForPower=" + lusForPower +
                '}';
    }
}
