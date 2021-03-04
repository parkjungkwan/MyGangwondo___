package com.example.demo.hal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;

@Entity  @Getter

public class Hall {
	@Id @Column(name = "hall_no") private int hallNo;
    @Column(name = "hall_name") private String hallName;
    @Column(name = "hall_location") private String hallLocation;
    @Column(name = "hall_time") private String hallTime;
    @Column(name = "hall_closed") private String hallClosed;
    @Column(name = "hall_pnumber") private String hallPnumber;
    @Column(name = "hall_info")private String hallInfo;
    @Column(name = "hall_image")private String hallImage;
	
	


}
