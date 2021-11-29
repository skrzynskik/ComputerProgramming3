public class Writer {
    private String name;
    private String surname;
    private int age;
    private boolean isAlive;

    Writer(String name, String surname, int age , boolean isAlive){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isAlive = isAlive;
    }
    public static void die(){}
    public void writeBook(){}
}