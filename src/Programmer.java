public class Programmer extends  Person {
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    } private String companyName;

    public Programmer() {
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    @Override
    public void learn() {
        super.learn();
        System.out.println(" програмиста!");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" програмирование!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" торт!");
    }
    public void coding(){
        System.out.println("Я кодирую: ");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + super.toString();
    }
}
