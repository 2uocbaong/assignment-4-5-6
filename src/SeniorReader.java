public class SeniorReader extends Reader {

    private String seniorCardNumber;

    public SeniorReader(String id,
                        String name,
                        String email,
                        String seniorCardNumber) {

        super(id, name, email);
        this.seniorCardNumber = seniorCardNumber;
    }

    public String getSeniorCardNumber() {
        return seniorCardNumber;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return 0.0;
    }

    @Override
    public int getMaxBorrowLimit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + " [NCT - MIEN PHAT]";
    }
}