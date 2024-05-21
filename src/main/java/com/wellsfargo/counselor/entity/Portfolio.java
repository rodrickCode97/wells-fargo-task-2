package com.wellsfargo.counselor.entity;
@Entity
@Table(name="portfolio")
public class Portfolio {
    @Id
    GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = fetchType.LAZY) 
    @JoinColumn(name="client_id")
    private Client client

    @Column(nullable = false)
    private Date creationDate;

    @OneToMany(mappedBy="portfolio", cascade = cascadeType.ALL)
    private list<security> securities;

    protected Portfolio(){

    }
    public Portfolio(creationDate){
        this.creationDate = creationDate
    }

    public Long getId() {
        return id; 
    }
    public String getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }
}
