package Program2;

public class Professor extends DeptEmployee {
    private int noOfPublications;

    public Professor(String name, double salary, int year, int month, int day,int noOfPublications) {
        super(name, salary, year, month, day);
        this.noOfPublications=noOfPublications;

    }


    public int getNoOfPublications() {
        return noOfPublications;
    }

    public void setNoOfPublications(int noOfPublications) {
        this.noOfPublications = noOfPublications;
    }
}
