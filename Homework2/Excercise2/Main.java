package Homework2.Excercise2;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mail> mails = new ArrayList<>();
        Inbox inbox = new Inbox(mails);
        // Aktuelles Datum als Startpunkt
        LocalDateTime date = LocalDateTime.now().withHour(10).withMinute(0); // Heute um 10:00 Uhr

        // Mail 1 (heute)
        Mail mail1 = new Mail(
                "support@company.com",
                "System-Update",
                "Das geplante System-Update wurde erfolgreich durchgeführt.",
                date,
                false
        );

        // Mail 2 (morgen)
        Mail mail2 = new Mail(
                "hr@company.com",
                "Bewerbungsgespräch",
                "Ihr Bewerbungsgespräch findet wie geplant statt. Bitte kommen Sie pünktlich.",
                date.plusDays(1).withHour(14).withMinute(30), // Morgen um 14:30 Uhr
                false
        );

        // Mail 3 (übermorgen)
        Mail mail3 = new Mail(
                "noreply@newsletter.com",
                "Newsletter Mai",
                "Hier ist Ihr monatlicher Newsletter mit den neuesten Updates.",
                date.plusDays(2).withHour(9).withMinute(15), // Übermorgen um 09:15 Uhr
                false
        );

        // Mail 4 (3 Tage nach heute)
        Mail mail4 = new Mail(
                "project@team.org",
                "Projektabschluss",
                "Das Projekt wurde erfolgreich abgeschlossen. Danke für Ihre Mitarbeit!",
                date.plusDays(3).withHour(16).withMinute(0), // In 3 Tagen um 16:00 Uhr
                false
        );

        // Mail 5 (4 Tage nach heute)
        Mail mail5 = new Mail(
                "events@community.de",
                "Einladung: Workshop",
                "Sie sind herzlich zu unserem Workshop eingeladen. Wir freuen uns auf Sie!",
                date.plusDays(4).withHour(11).withMinute(45), // In 4 Tagen um 11:45 Uhr
                false
        );
        inbox.addMail(mail1);
        inbox.addMail(mail2);
        inbox.addMail(mail3);
        inbox.addMail(mail4);
        inbox.addMail(mail5);
        mail1.setRead(true);
        inbox.printEmailHeaders();
        System.out.print("You have " + inbox.countUnread() + " unread emails.");

    }
}
