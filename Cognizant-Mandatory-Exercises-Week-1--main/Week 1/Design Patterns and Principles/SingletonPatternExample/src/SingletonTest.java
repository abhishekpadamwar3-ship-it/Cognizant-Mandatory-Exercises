public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");
        Logger logger2 = Logger.getInstance();
        logger2.log("Processing data");

        if (logger1 == logger2) {
            System.out.println("logger1 and logger2 reference the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
        System.out.println("logger1 hashCode: " + logger1.hashCode());
        System.out.println("logger2 hashCode: " + logger2.hashCode());
    }
}
