package com.example.demo.cmm.util;
import static java.util.stream.Collectors.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;




@Service("dummy")
public class DummyGenerator extends Proxy{
	/*********************************
	 * Student Dummy Data Generator 
	 * *******************************
	 */
	/**
	 * 1970 ~ 2000 ������ ������ ������ �̱� 
	 * 
	 * ������ �ش� ������ 4�� ���� ���� 0�� ���� �ǹ��Ѵ�. 
	 * && ���� 100���� ���� ���� 0�� ���� ���⿡�� �����ϳ�, 
	 * || 400���� ���� ���� 0�� ���� �������� ���Եȴ�. 
	 * �� ���� ������ ������ ����̴�.
	 * */
	public String makeBirthday() {
		int year = random.apply(1970, 2000);
		int month = random.apply(1, 13);
		int date = 0;
		switch(month) {
		case 2: date = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 
				random.apply(1, 30) : random.apply(1, 29) ; break;
		case 4: case  6: case  9: case  11: date = random.apply(1, 31);	break;
		default: date = random.apply(1, 32); break;
		}
		return year+"-"+month+"-"+date;
	}
	public String makeRegdate() {
		int year = random.apply(2019, 2020);
		int month = random.apply(1, 13);
		int date = 0;
		switch(month) {
		case 2: date = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 
				random.apply(1, 30) : random.apply(1, 29) ; break;
		case 4: case  6: case  9: case  11: date = random.apply(1, 31);	break;
		default: date = random.apply(1, 32); break;
		}
		return year+"-"+month+"-"+date;
	}
	public String makeExamdate() {
		return "2020-11-30";
	}
	/*
	 * ���� ���� �����ϱ�
	 * "M" - male, "F" - female
	 * */
	public String makeGender() {
		List<String> arr = Arrays.asList("M","F");
		Collections.shuffle(arr);
		return arr.get(0);
	}
	/*
	 * ���� �����ID �����ϱ�
	 * a-z 0-9
	 * */
	public String makeUserid() {
		List<String> ls = Arrays.asList(
				"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split(""));
		Collections.shuffle(ls);
		return ls.get(0)+ls.get(1)+ls.get(2)+ls.get(3);
	}
	/*
	 * ���� ��ȭ��ȣ �����ϱ�
	 * 
	 * */
	public String makePhoneNumber() {
		return "010-"+random.apply(1000, 10000)+"-"+random.apply(1000, 10000); 
	}
	
	/*
	 * ���� �̸� �����ϱ�
	 * 
	 * */
	public String makeUsername() {
		List<String> fname = Arrays.asList("��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "Ȳ", "��",
		        "��", "��", "��", "ȫ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ä", "��", "õ", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ǥ", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "Ź", "��", "��", "��", "��", "��", "��", "��", "��");
	    List<String> name1 = Arrays.asList("��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "��", "��", "��", "â", "ä", "õ", "ö", "��", "��", "��", "ġ", "Ž", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "ȣ", "ȫ", "ȭ", "ȯ", "ȸ", "ȿ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ȥ", "Ȳ", "��", "��", "��", "��",
	        "��", "��", "��", "Ź", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "��", "��", "��", "��", "��", "Ÿ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��");
	    List<String> name2 = Arrays.asList("��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", 
	    		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", 
	    		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	    		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", 
	    		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	    		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "â", "ä", "õ", "ö", "��", "��", "��", 
	    		"ġ", "Ž", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ȣ", "ȫ", "ȭ", "ȯ", "ȸ", "ȿ", "��", "��",
	    		"��", "��", "��", "��", "��", "��", "��", "ȥ", "Ȳ", "��", "��", "��", "��", "��", "��", "��", "Ź", "��", "��", "��",
	    		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	    		"��", "Ÿ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
	    		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��");
	    Collections.shuffle(fname);
	    Collections.shuffle(name1);
	    Collections.shuffle(name2);
	    String[] a = name1.stream()
	    		.flatMap( i -> name2.stream().map(j -> new String[] {i, j}))
	    		.collect(Collectors.toList())
	    		.get(0);
	    return fname.get(0)+a[0]+a[1];
	}
	public String makeSubject() {
		List<String> ls = Arrays.asList("Java","Spring","Python","jQuery","eGovframe");
		 Collections.shuffle(ls);
		 return ls.get(0);
	}
	public int makeSubNum() {
		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		 Collections.shuffle(ls);
		 return ls.get(0);
	}
	
	public String makeEmail() {
		List<String> ls = Arrays.asList("@test.com","@gmail.com","@naver.com");
		Collections.shuffle(ls);
		return makeUserid()+ls.get(0);
	}
	

	
	/*********************************
	 * Grade Dummy Data Generator 
	 * *******************************
	 */
	public List<Integer> makeScore(){
		return Stream.generate(Math::random)
				.limit(1)
				.map(i -> (int)(i * 100)).collect(Collectors.toList());
	}
	
	
}
