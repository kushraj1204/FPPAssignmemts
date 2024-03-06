
/**
 * @author kush
 */
public class MyTable {

    private static final int INDEX_START = 97;
    private static final int INDEX_END = 122;

    public MyTable() {
    }

    private Entry[] entries = new Entry[26];


    public void add(char key, String value) {
        Entry entry = new Entry(key, value);
        int asciiValue = (int) key;
        if (asciiValue < INDEX_START || asciiValue > INDEX_END) {
            System.out.println("Invalid key");
        } else {
            Entry preEntry = entries[asciiValue - INDEX_START];
            if (preEntry != null) {
                System.out.println("Replacing " + preEntry.getValue() + " by " + entry.getValue());
            }
            entries[asciiValue - INDEX_START] = entry;
        }
    }

    public String get(char key) {
        int asciiValue = (int) key;
        if (asciiValue < INDEX_START || asciiValue > INDEX_END) {
            return null;
        }
        Entry entry = entries[asciiValue - INDEX_START];
        return entry != null ? entry.getValue() : null;
    }

    private class Entry {
        private char key;
        private String value;

        public Entry(char key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return key + "->" + value;
        }
    }

    @Override
    public String toString() {
        StringBuilder strBld = new StringBuilder();
        for (Entry e : entries) {
            if (e != null)
                strBld.append(e.toString()).append("\n");
        }
        return strBld.toString();
    }
}
