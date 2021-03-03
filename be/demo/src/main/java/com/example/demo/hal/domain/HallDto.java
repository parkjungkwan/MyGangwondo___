package com.example.demo.hal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Component @Data
public class HallDto {
	private int hallNum;
	private String hallName;
	private String hallLocation;
	private String hallTime;
	private String hallClosed;
	private String hallPnumber;
	private String hallInfo;
	private String hallImage;

}
