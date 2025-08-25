public class Demo10 {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ReportService rs = new ReportService(logger);
        rs.generate();
    }
}
