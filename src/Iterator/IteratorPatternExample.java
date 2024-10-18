package Iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        Iterator iterator = nameCollection.getIterator();

        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
