package com.spring.tutoriasEDU.Enmarca;
import com.spring.tutoriasEDU.Actividad.Actividad;
import com.spring.tutoriasEDU.planes.Plan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Enmarca {

	@Id
	private long id;
	
	private String fecha;
	
	
	
	@ManyToOne
	@JoinColumn(name="plan")
	private Plan plan;
	
	@ManyToOne
	@JoinColumn(name="actividad")
	private Actividad actividad;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	@Override
	public String toString() {
		return "Enmarca [id=" + id + ", fecha=" + fecha + ", plan=" + plan + ", actividad=" + actividad + ", getId()="
				+ getId() + ", getFecha()=" + getFecha() + ", getPlan()=" + getPlan() + ", getActividad()="
				+ getActividad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
}
