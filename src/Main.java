// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Programmer programmer = new Programmer("NURTILEK","NETU","TANSPOLA");
        System.out.println(programmer);
    programmer.learn();
    programmer.walk();
    programmer.eat();
    programmer.coding();
        System.out.println("-----------------------"+"\n");
        Dancer dancer = new Dancer("NNN","NET NECHEGO  NEVOZMOJNOGO","CHORNYI DVOR");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("------------------------"+"\n");
    Singer singer = new Singer("BCHK","BALSHOY CHUYSKIY KANAL","SOBETSKIY");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
    singer.singing();
    singer.playGitare();
    }
}