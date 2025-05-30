package Homework2.Exercise3;

import java.util.ArrayList;

public class Inbox {

    private ArrayList<Mail> inbox = new ArrayList<>();

    public void addMail(Mail mail) {
        inbox.add(mail);
    }

    public void printEmailHeaders() {
        for (int i = 0; i < inbox.size(); i++) {
            System.out.println(i + ": " + inbox.get(i).getHeader());

        }
    }

    public void open(int index) {
        if (index < 0 || index >= inbox.size()) {
            System.out.println("Invalid index");
            return;
        }
        Mail mail = inbox.get(index);
        mail.markAsRead();
        mail.print();
    }

    public int countUnread() {
        int count = 0;
        for (int i = 0; i < inbox.size(); i++) {
            Mail mail = inbox.get(i);
            if (!mail.isRead()) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Mail> getInbox() {
        return inbox;
    }

    public void setInbox(ArrayList<Mail> inbox) {
        this.inbox = inbox;
    }

    public Inbox(ArrayList<Mail> inbox) {
        this.inbox = inbox;
    }
}
