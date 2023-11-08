public class Dancer  extends  Person{
    private String groupName;

    public Dancer() {
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    @Override
    public void walk() {
        super.walk();
        System.out.println(" тансора!");
    }


    @Override
    public void learn() {
        super.learn();
        System.out.println(" тансора!");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println(" шашлык!");
    }

    public void dancing(){
        System.out.println("Я тансую: ");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
