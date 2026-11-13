public class WhatsAppNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}
