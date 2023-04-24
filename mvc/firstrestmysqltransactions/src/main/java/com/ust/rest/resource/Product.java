//import org.springframework.stereotype.Repository;

//package com.ust.rest.resource;
//
//import java.math.BigDecimal;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import lombok.Getter;
//import lombok.Setter;
//
//
//@Entity // persistent api will know that this class's object need to be persisted
//@Getter @Setter
//public class Product {
//
//	@Id //to set as the primary key
//	@GeneratedValue(strategy= GenerationType.AUTO) 
//	//GenerationType is the strategy which the jpa should follow to generate the primary key values
//	
//	//GenerationType.AUTO -> is the default generation type,when strategy is not specified the jpa uses auto strategy
//	//when the underlying database is mysql, GenerationType.AUTO means the jpa will create a hibernate sequence in the database for generation of primary keys
//	
//	
//	//GenerationType.IDENTITY-> for this strategy to work first we have to create a table in mysql and explicitly specify the autoincrement(AI)column as  checked for the primary key column
//	//and in application.properties file spring.jpa.hibernate.ddl-auto this should not be set.if it is set it should have value as update.
//	@Getter @Setter private long productId;
//	@Getter @Setter private String name;
//	@Getter @Setter private String description;
//	@Getter @Setter private BigDecimal price;
//	@Getter @Setter private int qty;
//	
//	
//	
//	/*
//	  public int getQty()
//	   { return qty; } 
//	   public void setQty(int qty)
//	    { this.qty =
//	  qty; }
//	   public long getProductId() { return productId; } public void
//	  setProductId(long productId) { this.productId = productId; } public String
//	  getName() { return name; } public void setName(String name) { this.name =
//	  name; } public String getDescription() { return description; } public void
//	  setDescription(String description) { this.description = description; } public
//	  BigDecimal getPrice() { return price; } public void setPrice(BigDecimal
//	  price) { this.price = price; }
//	 */
//	
//	
//}

package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Product {

//@GeneratedValue(strategy=GenerationType.AUTO)
//generationtype is strategy which the jpa shld follow to generate primary key values
//the strategy value default is auto
//geneationtype auto means the jpa will create will create a hiberate sequence 
//for geneartion of primary keys
//	AUTO is the default generation type or strategy. when the underlined database is mysql 
//	GenerationType.AUTO means
//	the jpa will create a hibernate sequence in the database for generation of primary keys
//when we add Spring.jpa.show-sql=true
//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
	
	
	
//generation.identity for this strategy to work 1st we have to create a table in mysql and
	//explicitly specify the auto increment(ai) col for the pk(primary key col) and application file
	//##Spring.jpa.hibernate.ddl-auto=update 
	//this shld not be set if its set it shld have value as update
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="productid")//means db ill veraa name and here ver name anee
private long productId;
	
private String name;
private String description;
private BigDecimal price;
private int qty;

public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
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
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}





}








