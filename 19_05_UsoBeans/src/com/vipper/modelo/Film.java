package com.vipper.modelo;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Film implements Serializable{

	private static final long serialVersionUID = 1L;
	
		private int film_id;
		    private String title;
		    private String description;
		    private int release_year;
		    private int language_id;
		    private int original_language_id;
		    private int rental_duration;
		    private double rental_rate;
		    private int length;
		    private double replacement_cost;
		    private String rating;
		    private LocalDate last_update;

		    @Override
		    public String toString() {
		        return "Film{" + "film_id=" + film_id + ", title=" + title + ", description=" + description + ", release_year=" + release_year + ", language_id=" + language_id + ", original_language_id=" + original_language_id + ", rental_duration=" + rental_duration + ", rental_rate=" + rental_rate + ", length=" + length + ", replacement_cost=" + replacement_cost + ", rating=" + rating + ", last_update=" + last_update + '}'+"</br>";
		    }


		    public Film() {  //lo necesitaremos para cuando utilizaremos el BEAN,porque éste equivale a un constructor vacio
		    }

		    public Film(int film_id, String title, String description, int release_year, int language_id, int original_language_id, int rental_duration, double rental_rate, int length, double replacement_cost, String rating, LocalDate last_update) {
		        this.film_id = film_id;
		        this.title = title;
		        this.description = description;
		        this.release_year = release_year;
		        this.language_id = language_id;
		        this.original_language_id = original_language_id;
		        this.rental_duration = rental_duration;
		        this.rental_rate = rental_rate;
		        this.length = length;
		        this.replacement_cost = replacement_cost;
		        this.rating = rating;
		        this.last_update = last_update;
		    }


		    public double getReplacement_cost() {
		        return replacement_cost;
		    }

		    public void setReplacement_cost(double replacement_cost) {
		        this.replacement_cost = replacement_cost;
		    }

		    public int getFilm_id() {
		        return film_id;
		    }

		    public void setFilm_id(int film_id) {
		        this.film_id = film_id;
		    }

		    public String getTitle() {
		        return title;
		    }

		    public void setTitle(String title) {
		        this.title = title;
		    }

		    public String getDescription() {
		        return description;
		    }

		    public void setDescription(String description) {
		        this.description = description;
		    }

		    public int getRelease_year() {
		        return release_year;
		    }

		    public void setRelease_year(int release_year) {
		        this.release_year = release_year;
		    }

		    public int getLanguage_id() {
		        return language_id;
		    }

		    public void setLanguage_id(int language_id) {
		        this.language_id = language_id;
		    }

		    public int getOriginal_language_id() {
		        return original_language_id;
		    }

		    public void setOriginal_language_id(int original_language_id) {
		        this.original_language_id = original_language_id;
		    }

		    public int getRental_duration() {
		        return rental_duration;
		    }

		    public void setRental_duration(int rental_duration) {
		        this.rental_duration = rental_duration;
		    }

		    public double getRental_rate() {
		        return rental_rate;
		    }

		    public void setRental_rate(double rental_rate) {
		        this.rental_rate = rental_rate;
		    }

		    public int getLength() {
		        return length;
		    }

		    public void setLength(int length) {
		        this.length = length;
		    }

		    public LocalDate getLast_update() {
		        return last_update;
		    }

		    public void setLast_update(LocalDate last_update) {
		        this.last_update = last_update;
		    }

		    public String getRating() {
		        return rating;
		    }

		    public void setRating(String rating) {
		        this.rating = rating;
		    }

		    @Override
		    public int hashCode() {
		        int hash = 3;
		        return hash;
		    }

		    @Override
		    public boolean equals(Object obj) {
		        if (this == obj) {
		            return true;
		        }
		        if (obj == null) {
		            return false;
		        }
		        if (getClass() != obj.getClass()) {
		            return false;
		        }
		        final Film other = (Film) obj;
		        if (!Objects.equals(this.rating, other.rating)) {
		            return false;
		        }
		        return true;
		    }
		
		
	}


