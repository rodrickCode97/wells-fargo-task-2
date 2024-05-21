package com.wellsfargo.counselor.entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;



@Entity
@Table(name="client")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @ManyToOne(fetch = fetchType.LAZY)
    @JoinColumn(name="advisor_id", nullable=false)
    private Advisor advisor

    @OneToMany(mappedBy="client", cascade = cascadeType.ALL)
    private list<portfolio> portfolios;



    protected  Client(){

    }

    public Client(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }



    public Long getId() {
        return id;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firatName;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address ) {
        this.address = address;
    }

    public String getPhone() { return phone; }
    publuc void setPhone(String phone){
        this.phone = phone
    }

}

