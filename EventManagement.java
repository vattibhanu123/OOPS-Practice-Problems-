// Problem Statement:
// Create a system to manage events and attendees.

// Classes:
// Base Class: Event (attributes like eventName and date)
// Subclasses: Conference, Workshop, Webinar (with specific features)
// Methods:
// A method to calculate total participants and event duration.
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


class Event{
    private String eventName;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    public Event(String eventName,LocalDate date,LocalTime startTime,LocalTime endTime){
        this.eventName=eventName;
        this.date=date;
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public String getEventName(){
        return eventName;
    }
    public LocalDate getDate(){
        return date;
    }
    public long calculateDuration() {
        return ChronoUnit.HOURS.between(startTime, endTime);
    }
    
    public int calculateTotalParticipants(){
        return 0;
    }
    public void displayEventDetails(){
        System.out.println("Event Name: "+eventName);
        System.out.println("Date: "+date);
        System.out.println("Duration: " + calculateDuration() + " hours");

    }

}
class Conference extends Event{
    private int maxParticipants;
    public Conference(String eventName,LocalDate date,LocalTime startTime,LocalTime endTime,int maxParticipants){
        super(eventName,date,startTime,endTime);
        this.maxParticipants=maxParticipants;
    }
    public int getMaxParticipants(){
        return maxParticipants;
    }
    public int calculateTotalParticipants(){
        return maxParticipants;
    }
    public void displayEventDetails(){
        System.out.println("Event Type: Conference");
        super.displayEventDetails();
        System.out.println("Maximum total participants : "+calculateTotalParticipants());
        System.out.println();
    } 
}
class Workshop extends Event{
    private int maxParticipants;
    public Workshop(String eventName,LocalDate date,LocalTime startTime,LocalTime endTime,int maxParticipants){
        super(eventName,date,startTime,endTime);
        this.maxParticipants=maxParticipants;
    }
    public int getMaxParticipants(){
        return maxParticipants;
    }
    public int calculateTotalParticipants(){
        return maxParticipants;
    }
    public void displayEventDetails(){
        System.out.println("Event Type: Workshop");
        super.displayEventDetails();
        System.out.println("Maximum total participants : "+calculateTotalParticipants());
        System.out.println();

    }

}
class Webinar extends Event{
    private int maxParticipants;
    public Webinar(String eventName,LocalDate date,LocalTime startTime,LocalTime endTime,int maxParticipants){
        super(eventName,date,startTime,endTime);
        this.maxParticipants=maxParticipants;
    }
    public int getMaxParticipants(){
        return maxParticipants;
    }
    public int calculateTotalParticipants(){
        return maxParticipants;
    }
    public void displayEventDetails(){
        System.out.println("Event Type: Webinar");
        super.displayEventDetails();
        System.out.println("Maximum total participants : "+calculateTotalParticipants());
        System.out.println();

    }

}
public class EventManagement{
    public static void main(String[] args) {
        Conference conf=new Conference("javaConference",LocalDate.of(2024,9,24),LocalTime.of(7,0),LocalTime.of(15,0),300);

        Workshop wshp=new Workshop("JDBC",LocalDate.of(2024,9,04),LocalTime.of(9,0),LocalTime.of(15,0),250);
        Webinar web=new Webinar("Evs Webinar",LocalDate.of(2024,9,20),LocalTime.of(10,0),LocalTime.of(15,0),400);
        conf.displayEventDetails();
        wshp.displayEventDetails();
        web.displayEventDetails();
        int totalPersonsAttend=conf.calculateTotalParticipants()+wshp.calculateTotalParticipants()+web.calculateTotalParticipants();

        
        System.out.println("Total persons attend : "+totalPersonsAttend);


    }

}