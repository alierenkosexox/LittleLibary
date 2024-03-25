
// Ali Eren KÖSE 25/03/2024 04:20

import java.util.TreeSet;
import java.util.Comparator;

public class Main {

    public static void chain() {
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
    }

    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();

        book.add(new Book("Mustafa Kemal ATATÜRK", "Nutuk", 1927, 658));
        book.add(new Book("Fyodor Dostoyevski", "Suç ve Ceza", 1866, 1255));
        book.add(new Book("Victor Hugo", "Sefiller", 1862, 1724));
        book.add(new Book("Lev Tolstoy", "İnsan Ne ile Yaşar?", 1885, 112));
        book.add(new Book("Reşat Nuri Gültekin", "Acımak", 1928, 150));

        for (Book i : book.reversed()) {
            System.out.println(i.getName() + " " + i.getPage() + " " + i.getAuthor() + " " + i.getYear());
        }
            chain();

            TreeSet<Book> book2 = new TreeSet<>(new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {

                    return o1.getPage() - o2.getPage();
                }
            });

            book2.add(new Book("Mustafa Kemal ATATÜRK", "Nutuk", 1927, 658));
            book2.add(new Book("Fyodor Dostoyevski", "Suç ve Ceza", 1866, 1255));
            book2.add(new Book("Victor Hugo", "Sefiller", 1862, 1724));
            book2.add(new Book("Lev Tolstoy", "İnsan Ne ile Yaşar?", 1885, 112));
            book2.add(new Book("Reşat Nuri Gültekin", "Acımak", 1928, 150));

            for (Book i : book2.reversed()) {
                System.out.println(i.getName() + " " + i.getPage() + " " + i.getAuthor() + " " + i.getYear());
            }
        }

    }


