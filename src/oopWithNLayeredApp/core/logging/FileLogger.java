package oopWithNLayeredApp.core.logging;

public class FileLogger extends Logger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı : " + data);

    }

}