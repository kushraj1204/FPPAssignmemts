package Program1;

import java.util.Arrays;

/**
 * @author kush
 */
public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public MyPersonList() {
        this.currentArray = new Person[INITIAL_LENGTH];
        this.numOfElements = 0;
    }

    public void add(Person person) {
        if (person == null) return;
        if (numOfElements == currentArray.length) {
            resize();
        }
        currentArray[numOfElements] = person;
        numOfElements = numOfElements + 1;

    }

    public Person get(int i) {
        if (i < 0 || i >= numOfElements) {
            return null;
        }
        return currentArray[i];
    }

    private void resize() {
        System.out.println("Resizing person arraylist");
        int len = currentArray.length;
        int newLen = 2 * len;
        Person[] newArray = new Person[newLen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean isEmpty() {
        return (numOfElements == 0);
    }

    public boolean find(String lastName) {
        if (lastName == null) return false;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].getLastName().equals(lastName))
                return true;
        }
        return false;
    }

    public void insert(Person person, int pos) {
        if (person == null) return;
        if (pos > numOfElements || pos < 0) return;
        if (numOfElements == currentArray.length)
            resize();
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = person;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
        ++numOfElements;
    }

    public boolean remove(Person person) {
        if (numOfElements == 0) return false;
        if (person == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].equals(person)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements - 1; i++) {
            sb.append("{ Name: "+currentArray[i].getFirstName() + " " + currentArray[i].getLastName()
                    + ", Age:" + currentArray[i].getAge()+" },");
        }
        sb.append("{ Name: "+currentArray[numOfElements - 1].getFirstName() + " " + currentArray[numOfElements - 1].getLastName()
                + ", Age:" + currentArray[numOfElements - 1].getAge()+" }");
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        return numOfElements;
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(currentArray, numOfElements);
        return temp;
    }

    public static void main(String[] args) {
        MyPersonList l = new MyPersonList();
        l.add(new Person("Rimal","Kush",29));
        l.add(new Person("Pokhrel","Yogendra",30));
        l.add(new Person("Shrestha","Anoj",38));
        System.out.println(l.toString());
        System.out.println(l.find("Rimal"));


    }
}
