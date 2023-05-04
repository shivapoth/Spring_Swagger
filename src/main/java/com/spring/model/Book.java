package com.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOOK_SWAGGER")
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -270862254496502480L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;

	private String bookName;

	private double price;

}
