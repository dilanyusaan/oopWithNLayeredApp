
    package oopWithNLayeredApp.core.logging;

    public class MailLogger extends Logger {

        @Override
        public void log(String data) {
            System.out.println("Mail gönderildi : " + data);

        }

    }

