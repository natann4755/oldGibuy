package t1dog;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("amstaf",8,"bibi");
        Dog d2 = new Dog("booldog",4,"dodo");
        Dog d3 = new Dog("",8,"tziri");

        System.out.println(d1.getNameid());
        System.out.println(d2.getNameid());
        System.out.println(d3.getNameid());
    }
}
