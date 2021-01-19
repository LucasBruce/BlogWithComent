package com.programming.techie.springngblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.Instant;

import javax.persistence.Column;

@Entity
@Table
public class Post {
      
	  @Id
	  @GeneratedValue(strategy = IDENTITY)
	  private Long id;
	  
	  @NotBlank
	  @Column
	  private String title;
	  
	  @Lob
	  @Column
	  @NotEmpty
	  private String content;
	  
	  @Column
	  private Instant createdOn;
	  
	  @Column
	  private Instant updatedOn;
	  
	  @Column
	  @NotBlank
	  private String username;
	  
	  public Long getId() { return id; }
	  
	  public void getId(Long id) { this.id = id; }
	  
	  public String getTitle() { return title; }
	  
	  public void setTitle(String title) { this.title = title; }
}
