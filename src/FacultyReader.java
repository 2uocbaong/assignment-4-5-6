public class FacultyReader extends Reader {

    public FacultyReader(String id,
                         String name,
                         String email) {
        super(id, name, email);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 5000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }

    @Override
    public String getInfo() {
        return "[GV] "
                + super.getInfo()
                + " | Limit: "
                + getMaxBorrowLimit();
    }
}