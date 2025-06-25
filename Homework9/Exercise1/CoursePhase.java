package Homework9.Exercise1;

public enum CoursePhase {
    NOT_STARTED("Course not stared yet"),
    ONGOING("Course is in progress"),
    FINISHED("Course has ended");
    private final String message;

    // Konstruktor
    CoursePhase(String message) {
        this.message = message;
    }

    // Methode zum Abrufen der Nachricht
    public String getMessage() {
        return message;
    }

    // Hauptmethode zum Testen
    public static void main(String[] args) {
        for (CoursePhase phase : CoursePhase.values()) {
            System.out.println(phase + ": " + phase.getMessage());
        }
    }
}
