import java.util.*;

public class LibraryBookSearch 
{
    static boolean bookSearch(String book, String[] books)
    {
        for (int i = 0; i < books.length; i++)
        {
            if (books[i].equalsIgnoreCase(book))
                return true;

        }
        return false;
    }

    public static void main(String[] args) 
    {
        String[] books = {"Man's Search for Meaning", "Meditations", "The Righteous Mind", "The Psychology of Money", "Atomic Habits", "So Good They Can't Ignore You"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a book name : ");
        String book = sc.nextLine();

        if (bookSearch(book, books))
            System.out.println("Book Is Available.");
        else
            System.out.println("Book is not Available.");
    }
}
