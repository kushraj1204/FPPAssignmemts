package Program3;

/**
 * @author kush
 */
public class Driver {
    public static void main(String[] args) {
        Figure[] figures={new UpwardHat(),new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};
        for (Figure f:figures){
            f.getFigure();
        }
        System.out.print("\n");
        for (Figure f:figures){
            System.out.print(f.getClass().getSimpleName()+": ");
            f.getFigure();
            System.out.print("\n");
        }

    }
}
