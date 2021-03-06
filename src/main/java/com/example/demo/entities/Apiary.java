package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Apiary")
public class Apiary {
	@Id
	public String id;
	public float latitude;
	public float longitude;
	public String name;
	public String description;
	public String codePostal;
	public Date createdAt;
	public String urlPhoto;
	public String username; 
	public User user;
	public List<Hive> hives;
	
	
	
	public Apiary() {
		super();
	}
	
	public Apiary(String id, float latitude, float longitude, String name, String description, String codePostal,
			Date createdAt, String urlPhoto, String username, User user, List<Hive> hives) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
		this.description = description;
		this.codePostal = codePostal;
		this.createdAt = createdAt;
		this.urlPhoto = urlPhoto;
		this.username = username;
		this.user = user;
		this.hives = hives;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getUrlPhoto() {
		return urlPhoto;
	}
	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Hive> getHives() {
		return hives;
	}
	public void setHives(List<Hive> hives) {
		this.hives = hives;
	}

	@Override
	public String toString() {
		return "Apiary [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", name=" + name
				+ ", description=" + description + ", codePostal=" + codePostal + ", createdAt=" + createdAt
				+ ", urlPhoto=" + urlPhoto + ", username=" + username + ", user=" + user + ", hives=" + hives + "]";
	}
	
}
