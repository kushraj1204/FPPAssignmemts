/**
 * @author kush
 */
public class Main {
    public static void main(String[] args) {
        MyTable table=new MyTable();
        table.add('a',"Andrew");
        table.add('b',"Ben");
        table.add('w',"Willie");

        System.out.println(table.get('w'));
        System.out.println(table.get('B'));

        System.out.println(table.toString());
    }
}