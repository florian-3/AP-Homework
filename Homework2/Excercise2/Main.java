package Homework2.Excercise2;

public class Main {

    Inbox inbox = new Inbox();
    Mail mail1 = new Mail("Project Update", "The project deadline has been extended to Friday", "The project deadline has been extended to Friday");
    Mail mail2 = new Mail("Birthday Party", "You're invited to Sarah's birthday this Saturday", "You're invited to Sarah's birthday this Saturday");
    Mail mail3 = new Mail("System Maintenance", "The server will be down for maintenance tonight", "The server will be down for maintenance tonight");
    Mail mail4 = new Mail("New Policy", "Please review the new company policies attached", "Please review the new company policies attached");
    Mail mail5 = new Mail("Vacation Approved", "Your vacation request for July has been approved", "Your vacation request for July has been approved");

    inbox.addMail(mail1);
    inbox.addMail(mail2);
    inbox.addMail(mail3);
    mail1.setRead(true);
    inbox.countUnread();
    inbox.displeyMailsHeader();

}
