import java.util.Scanner;


/*calcuulator for amount of chicken needed in thaw cabinet on thursday night
to get through friday and saturday*/
public class chickenCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //declare variables
     int fSales, sSales, tSales, nugCat, filCat;
     double filUse = 0.18, nugUse= 0.35, spcUse=0.12, stpUse=0.1, grlFilUse= 0.05, grlNugUse=0.05;
        Scanner scan = new Scanner(System.in);   
        System.out.println("Enter Friday Sales --> "  );
        fSales = scan.nextInt();
        System.out.println("Enter Saturday Sales --> ");
        sSales = scan.nextInt();
        System.out.println("How many cases for nugget catering? --> ");
        nugCat = scan.nextInt();
        System.out.println("How many cases for filet Catering? --> ");
        filCat = scan.nextInt();
        tSales = fSales + sSales;
        System.out.println("Filet - "+ (((tSales/1000) * filUse) + filCat));
        System.out.println("Nugget - "+ (((tSales/1000) * nugUse) + nugCat));
        System.out.println("Spicy - "+ (tSales/1000) * spcUse);
        System.out.println("Strips - "+ (tSales/1000) * stpUse);
        System.out.println("Grilled Filet - "+ (((tSales/1000) * grlFilUse) + 1.5));
        System.out.println("Grilled Nugget - "+ (tSales/1000) * grlNugUse);


    }
}