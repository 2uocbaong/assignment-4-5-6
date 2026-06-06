public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Reader s1 =
                new StudentReader(
                        "SV01",
                        "Nguyen Van A",
                        "a@gmail.com");

        Reader f1 =
                new FacultyReader(
                        "GV01",
                        "Tran Thi B",
                        "b@uni.edu");

        Reader senior1 =
                new SeniorReader(
                        "SR01",
                        "Le Van C",
                        "c@gmail.com",
                        "CC2024001");

        library.addReader(s1);
        library.addReader(f1);
        library.addReader(senior1);

        library.printAllReaders();

        System.out.println();

        System.out.println(
                "Tong phi phat 7 ngay = "
                        + library.calculateTotalLateFee(7)
                        + " VND");

        System.out.println();

        Reader found =
                library.findReaderByName("van");

        if (found != null) {
            System.out.println(
                    "Tim thay: "
                            + found.getInfo());
        }

        System.out.println();

        library.printSeniorReaders();

        System.out.println();

        Reader[] readers = {
                s1,
                f1,
                senior1
        };

        System.out.println(
                "===== POLYMORPHISM TEST =====");

        for (Reader r : readers) {

            System.out.println(
                    r.getFullName()
                            + " | Fee="
                            + r.calculateLateFee(7)
                            + " | Limit="
                            + r.getMaxBorrowLimit());
        }
    }
}