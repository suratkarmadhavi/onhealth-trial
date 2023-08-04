package com.oneHealth.DoctorSchedule.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Entity class representing DoctorSchedule information.
 * This class is mapped to a database table to store schedule details of doctors.
 * 
 * Note: Make sure to import the required annotations from the appropriate packages.
 * 
 * @author Madhavi
 * @version 1.0
 */
@Entity
public class DoctorSchedule {

    @Id
    private Long slotId; // Primary key field for the DoctorSchedule table

    // ID of the doctor associated with this schedule
    private Long doctorId;

    // Date for the schedule
    private Date date;

    // Start time for the schedule
    private String startTime;

    // End time for the schedule
    private String endTime;

    // Type of availability (e.g., available, unavailable, busy, etc.)
    private String typeAvailability;

    // Address for the availability (optional, can be used to specify the location)
    private String addressAvailability;
    
    private String shift;

    public DoctorSchedule() {
        super();
    }

    // Parameterized constructor to initialize DoctorSchedule object with values
    public DoctorSchedule(Long slotId, Long doctorId, Date date, String startTime, String endTime,
            String typeAvailability, String addressAvailability, String shift) {
        super();
        this.slotId = slotId;
        this.doctorId = doctorId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.typeAvailability = typeAvailability;
        this.addressAvailability = addressAvailability;
        this.shift = shift;
    }

    // Getter method for slotId
    public Long getSlotId() {
        return slotId;
    }

    // Setter method for slotId
    public void setSlotId(Long slotId) {
        this.slotId = slotId;
    }

    // Getter method for doctorId
    public Long getDoctorId() {
        return doctorId;
    }

    // Setter method for doctorId
    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    // Getter method for date
    public Date getDate() {
        return date;
    }

    // Setter method for date
    public void setDate(Date date) {
        this.date = date;
    }

    // Getter method for startTime
    public String getStartTime() {
        return startTime;
    }

    // Setter method for startTime
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    // Getter method for endTime
    public String getEndTime() {
        return endTime;
    }

    // Setter method for endTime
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    // Getter method for typeAvailability
    public String getTypeAvailability() {
        return typeAvailability;
    }

    // Setter method for typeAvailability
    public void setTypeAvailability(String typeAvailability) {
        this.typeAvailability = typeAvailability;
    }

    // Getter method for addressAvailability
    public String getAddressAvailability() {
        return addressAvailability;
    }

    // Setter method for addressAvailability
    public void setAddressAvailability(String addressAvailability) {
        this.addressAvailability = addressAvailability;
    }

    public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return "DoctorSchedule [slotId=" + slotId + ", doctorId=" + doctorId + ", date=" + date + ", startTime="
				+ startTime + ", endTime=" + endTime + ", typeAvailability=" + typeAvailability
				+ ", addressAvailability=" + addressAvailability + ", shift=" + shift + "]";
	}

}
