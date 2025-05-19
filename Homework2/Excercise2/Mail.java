package Homework2.Excercise2;

import java.time.LocalDateTime;

public class Mail {
    private String senderAddress;
    private String subject;
    private String message;
    private LocalDateTime datetime;
    private boolean isRead;

    public Mail(String senderAddress, String subject, String message, LocalDateTime datetime, boolean isRead) {
        this.senderAddress = senderAddress;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.isRead = isRead;
    }



    public void markAsRead(){
        this.isRead = true;
    }

    public void print(){
        System.out.println(subject + " from " + senderAddress + " on " + datetime + ": " + message);
    }


    public String getHeader(){
        String readMark = isRead ? "READ" : "UNREAD";
        return readMark + " | " + subject + " | " + senderAddress + " | " + datetime;
    }



    public String getAddress() {
        return senderAddress;
    }

    public void setAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        this.isRead = read;
    }
}
