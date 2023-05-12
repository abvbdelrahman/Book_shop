import java.util.Scanner;

public class Main {
  static   Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        boolean y=true;
        while (y){
System.out.println("----------------main-----------------");
System.out.println("Enter 1 for user\nEnter 2 for Adminstrator\nEnter 3 for exiting");
int choise =in.nextInt();
if (choise==1){User.display();}
else  if (choise==2)
{boolean q=true;
    while (q) {
        System.out.println("----Main----");
        System.out.println("1_to display all books");
        System.out.println("2_add book");
        System.out.println("3_delete book");
        System.out.println("4_search book");
        System.out.println("5_update");
        System.out.println("6_exit");

        System.out.println("----Enter your choise----");
    int choose=in.nextInt();
    switch (choose)
    {
        case 1:Admin.display();break;
        case 2:Admin.addbook();break;
        case 3:System.out.println("Enter the name of the book");
        String n=in.next();
        Book b=Admin.searchbookbyname(n);
        Admin.deletebook(b);break;
        case 4:
            System.out.println("Enter name of the book");
            Admin.searchbookbyname(in.next());break;
        case 5:
            try {


            System.out.println("Enter name of the book you wanna update ,new name and new price");
            String o=in.next();
            String ne=in.next();
            double pric=in.nextDouble();
            Admin.update(o,ne,pric);}
            catch (Exception e){System.out.println();}break;
            case 6:q=false;break;
        default:System.out.println("Enter number between 1 ,5 ");break;
    }

    }

}
else if (choise==3)System.out.println("Enter 1 or 2 only");

    }}
}