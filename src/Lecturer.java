public class Lecturer extends Reader {

    public Lecturer(String readerId, String fullName, String email) {
        super(readerId, fullName, email);
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1000;
    }

    @Override
    public String getInfo() {
        return "[GV] " + getReaderId()
                + " | " + getFullName()
                + " | Email: " + getEmail()
                + " | Han muon: " + getMaxBorrowLimit() + " cuon";
    }
}