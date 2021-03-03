package com.example.demo.brd.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Hall {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hall_num") private int hallNum;
    @Column(name = "hall_name") private String hallName;
    @Column(name = "hall_location") private String hallLocation;
    @Column(name = "hall_time") private String hallTime;
    @Column(name = "hall_closed") private String hallClosed;
    @Column(name = "hall_pnumber") private String hallPnumber;
    @Column(name = "hall_info")private String hallInfo;
    @Column(name = "hall_image")private String hallImage;
}
