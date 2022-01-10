package com.classpath.customerservicemicroservice.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	private String message;
	private long phone;
	private Status status;
	private int customerId;

	public Ticket() {
		super();
	}

	public Ticket(int id, String email, String message, long phone, Status status, int customerId) {
		super();
		this.id = id;
		this.email = email;
		this.message = message;
		this.phone = phone;
		this.status = status;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", email=" + email + ", message=" + message + ", phone=" + phone + ", status="
				+ status + ", customerId=" + customerId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, email, id, message, phone, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return customerId == other.customerId && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(message, other.message) && phone == other.phone && status == other.status;
	}

}
