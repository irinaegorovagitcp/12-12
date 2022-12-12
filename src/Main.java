public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {4, 6, 9});
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.getAverageSale());
    }
}
