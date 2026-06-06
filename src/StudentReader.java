public class StudentReader extends Reader {

    public StudentReader(String id,
                         String name,
                         String email) {
        super(id, name, email);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
    }

    @Override
    public String getInfo() {
        return "[SV] "
                + super.getInfo()
                + " | Limit: "
                + getMaxBorrowLimit();
    }
}