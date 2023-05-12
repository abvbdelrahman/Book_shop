import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Book
{
   static Scanner in=new Scanner(System.in);
static ArrayList<Book> booklist =new ArrayList<Book>();

    public Admin() {
    }

    public Admin(String name, double price) {
        super(name, price);
    }

    public static void addbook()
    {
        try {


        System.out.println("Enter the number of books that you wanna add\n");
        int countbook=in.nextInt();

        if (countbook<0||countbook>5){System.out.println("please,Enter postive number");}
        else
        {
            for (int i=0;i<countbook;i++){
                System.out.println("Enter data of the book number "+(i+1));
            Book b1=new Book();
            System.out.println("Enter the name of the book"+(i+1));
            b1.setName(in.next());
                System.out.println("Enter the price of the book"+(i+1));
                b1.setPrice(in.nextDouble());
                booklist.add(b1);


            }
        }

    }
    catch (Exception e){System.out.println("please, enter number between 1,5");}
    }
    public static void display()
    {
        if (booklist.isEmpty()){System.out.println("There is no data");}
        else {
        for (Book b2:booklist)
        {
            System.out.println("The name= "+b2.getName()+"\n The price= "+b2.getPrice());
        }
        }
    }
    public static boolean deletebook(Book b3)
    {
        if (!booklist.isEmpty()){booklist.remove(b3);return true;}
        else return false;
    }
    public static Book searchbookbyname(String name)
    {
        int count=0;

        for (Book b4:booklist)
        {
            if (b4.getName().equals(name)){System.out.println("the name is "+name+" the price is "+b4.getPrice());
            count++;return b4;}


        }
        if (count==0)System.out.println("not found");
        return null;

    }
    public static void update(String oldname,String newname,double price)
    {
        Book b=Admin.searchbookbyname(oldname);
        b.setName(newname);
        b.setPrice(price);
    }
}
