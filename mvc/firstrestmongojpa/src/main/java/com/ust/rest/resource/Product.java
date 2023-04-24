package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

	@Id
	private String _id;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	
	
	
}
	
	
	
	/*
	  public int getQty()
	   { return qty; } 
	   public void setQty(int qty)
	    { this.qty =
	  qty; }
	   public long getProductId() { return productId; } public void
	  setProductId(long productId) { this.productId = productId; } public String
	  getName() { return name; } public void setName(String name) { this.name =
	  name; } public String getDescription() { return description; } public void
	  setDescription(String description) { this.description = description; } public
	  BigDecimal getPrice() { return price; } public void setPrice(BigDecimal
	  price) { this.price = price; }
	 */
	
	

