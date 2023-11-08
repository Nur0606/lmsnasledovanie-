public class Singer extends Person  {
    private String bandName;

    public Singer() {
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    @Override
    public void learn() {
        super.learn();
        System.out.println(" пениие!");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" вакал!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" плоф!");
    }

    public  void singing(){
        System.out.println("Я паю: ");
    }
    public  void playGitare(){
        System.out.println("Я играю на гитаре: ");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
