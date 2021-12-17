package co2103.hw2.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="Event")
@Table(name="event")
public class Event {
	@Id
	@GeneratedValue
	private int eventID;
	private String eventDescription;
	private LocalDate eventDate;
	

	@ManyToMany
	@JoinColumn(name = "venueName")
	private Venue venue;
	
	public Event(int eventID, String eventDescription, LocalDate eventDate) {
		super();
		this.eventID = eventID;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
	}
	/**
	 * @return the eventID
	 */
	public int getEventID() {
		return eventID;
	}
	/**
	 * @param eventID the eventID to set
	 */
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	/**
	 * @return the eventDescription
	 */
	public String getEventDescription() {
		return eventDescription;
	}
	/**
	 * @param eventDescription the eventDescription to set
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	/**
	 * @return the eventDate
	 */
	public LocalDate getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	
	
	
}
