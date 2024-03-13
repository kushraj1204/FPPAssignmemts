package Program3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author kush
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Marketing> list = new ArrayList<>();
        Marketing m1 = new Marketing("John Dexter", "Shampoo", 10000.46);
        Marketing m2 = new Marketing("Eve Torres", "Television", 999.30);
        Marketing m3 = new Marketing("Nina Maxwell", "Laptop", 76543.30);
        Marketing m4 = new Marketing("Daniel Craig", "Car", 4565432.90);
        //Adding of elements
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        //size() usage
        System.out.println("Size:" + list.size());

        //toString overridden call from list
        System.out.println(list);

        //remove() usage
        list.remove(m2);
        System.out.println("Size:" + list.size());

        //sorting by salesAmount using Comparator Interface
        list.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return Double.compare(o1.getSalesAmount(), o2.getSalesAmount());
            }
        });
        System.out.println(list);

        //filtering objects with sales more than 1000
        List<Marketing> moreThan1000 = listMoreThan1000(list);

        //sorting by employeeName using Comparator Interface
        moreThan1000.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        System.out.println(moreThan1000);

    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> moreThan1000 = new ArrayList<>();
        for (Marketing marketing : list) {
            if (Double.compare(marketing.getSalesAmount(), 1000) > 0) {
                moreThan1000.add(marketing);
            }
        }
        return moreThan1000;
    }
}
