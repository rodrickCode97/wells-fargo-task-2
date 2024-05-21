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
