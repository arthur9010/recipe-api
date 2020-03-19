package br.com.arthur.recipeapi.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import lombok.Data;


@Entity(name="tb_recipe")
@Data
public class Recipe {
	@Id
	@Column(name="id_recipe")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="title_recipe")
	private String title;
	
	@Column(name="content_recipe")
	private String content;
	
//	  @ManyToOne
//	  private Category category;

	

}