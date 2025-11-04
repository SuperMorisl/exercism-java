import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        LocalDateTime datetime = LocalDateTime.parse(appointmentDateDescription, parser);
        return datetime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());

    }
    

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        
        String datePart = appointmentDate.format(dateFormatter);
        String timePart = appointmentDate.format(timeFormatter);
        
        return "You have an appointment on " + datePart + ", at " + timePart + ".";
        
            }

    public LocalDate getAnniversaryDate() {
        int ajd = LocalDate.now().getYear();
        return LocalDate.of(ajd,9,15);
        
            
    }
}
