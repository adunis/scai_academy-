import main.java.corso.hibernateHelloWorld.service.StudentService;

public final class App {

    public static void main(String[] args) {

        StudentService application = new StudentService();

        int saved1 = application.saveStudent("Lucio", "Porpora", "Qualcosa");
        int saved2 = application.saveStudent("Lucio", "Porpora", "Qualcosa");
        int saved3 = application.saveStudent("Lucio", "Porpora", "Qualcosa");

    }

}