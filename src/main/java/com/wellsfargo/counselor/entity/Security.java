package com.wellsfargo.counselor.entity;
@Entity
@Table(name="security")
public class Security {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Columm( nullable = false)
private String name;

@Columm(nullable = false)
private String catergory 

@Columm(nullable = false)
private Intger purchasePrice 

@Columm (nullable = false)
private Date purchaseDate 

@Columm (nullable = false)
private Integer quantity

@ManyToOne(fetch = fetchType.LAZY)
@JoinColumn(name="portfolio_id")
private Portfolio portfolio
}

// constructors

public Security(String name, String catergory, Integer purchasePrice, Date purchaseDate, Integer quantity){
    this.name = name;
    this.catergory = catergory;
    this.purchaseDate = purchaseDate;
    this.purchasePrice = purchasePrice;
    this.quantity = quantity;
}

public Lng getId(){
    return id;
}

// Getters 
public String getName(){ return name;}
public void setName(String name){ this.name = name;}

public String getCatergory(){ return catergory; }
public void setCatergory(String catergory){ this.catergory = catergory}

public Integer getPurchasePrice(){ return purchasePrice}
public void setPurchasePrice(Integer purchasePrice){
    this.purchasePrice = purchasePrice;
}

public Date getPurchaseDate(){return purchaseDate}
public void setPurchaseDate(Date purchaseDate){
    this.purchaseDate = purchaseDate;
}

public Integer getQuantity(){ return quantity}
public void setQuantity(Integer qauntity){
    this.qautity = quantity
}

// Setters