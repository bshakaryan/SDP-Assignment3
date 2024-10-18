package Iterator;

public class NameCollection implements Collection {
    private String[] names = {"Alice", "Bob", "Charlie", "Diana"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Concrete Iterator class
    private class NameIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
