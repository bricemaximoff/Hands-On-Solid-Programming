public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        NotificationService emailService = new NotificationService(emailNotifier);
        emailService.sendNotification("Halo lewat Email!");

        Notifier waNotifier = new WhatsAppNotifier();
        NotificationService waService = new NotificationService(waNotifier);
        waService.sendNotification("Halo lewat WhatsApp!");
    }
}
