package pbo_polymorphism;

public class TestRelation {
    public static void main(String[] args) {
        Line ch = new Line(5, 10, 10, 20);
        System.out.println(ch.getLength());
        System.out.println(ch.isGreater(ch, ch));
        System.out.println(ch.isLess(ch, ch));
        System.out.println(ch.isEqual(ch, ch));
    }
}
