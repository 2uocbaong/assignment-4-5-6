import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Reader> readers;
    private List<Book> books;

    public Library() {
        readers = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printAllReaders() {

        System.out.println("===== READERS =====");

        for (Reader r : readers) {
            System.out.println(r.getInfo());
        }
    }

    public double calculateTotalLateFee(int daysLate) {

        double total = 0;

        for (Reader r : readers) {
            total += r.calculateLateFee(daysLate);
        }

        return total;
    }

    public Reader findReaderByName(String keyword) {

        keyword = keyword.toLowerCase();

        for (Reader r : readers) {

            if (r.getFullName()
                    .toLowerCase()
                    .contains(keyword)) {

                return r;
            }
        }

        return null;
    }

    public void printSeniorReaders() {

        System.out.println("===== SENIOR READERS =====");

        for (Reader r : readers) {

            if (r instanceof SeniorReader) {

                SeniorReader sr =
                        (SeniorReader) r;

                System.out.println(
                        sr.getInfo()
                                + " | Card: "
                                + sr.getSeniorCardNumber()
                );
            }
        }
    }
}