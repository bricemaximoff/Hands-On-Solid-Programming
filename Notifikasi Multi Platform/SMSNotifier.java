public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}
