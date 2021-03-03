package com.example.demo.cmm.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.brd.domain.ReviewDto;

import lombok.RequiredArgsConstructor;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// @Component @RequiredArgsConstructor

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.time.Duration;

public class CrawlerBySele extends Proxy {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// private final Vector<ReviewDto> artBag;
	public Vector<ReviewDto> crawling(String url2) {
		String url = "https://tickets.interpark.com/goods/20009147";
		logger.info(" URL : " + url);
		ArrayList<ReviewDto> artBag = new ArrayList<>();
		try {
			Document rawData = Jsoup.connect(url).timeout(10 * 1000).get();
			Elements titles = rawData.getElementsByClass("bbsTitle");
			Elements contents = rawData.select("b[class=bbsText]");
			ReviewDto article = null;
			logger.info(" titles.size() " + titles.size());
			for (int i = 0; i < titles.size(); i++) {
				logger.info(" for 내부 ");
				article = new ReviewDto();
				article.setReviewTitle(titles.get(i).text());
				article.setReviewContent(contents.get(i).text());
				logger.info("리뷰 번호" + i + "번: " + article.toString());
				artBag.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws InterruptedException {
    	WebDriver driver = null;
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bitcamp\\____\\781__SpringBoot\\workspace\\be\\demo\\src\\main\\resources\\static\\chromedriver.exe");
    	driver = new ChromeDriver();
        driver.get("https://movie.naver.com/movie/point/af/list.nhn");
        List<WebElement> elements = driver.findElements(By.cssSelector(".title > a"));
        System.out.println("Number of elements:" +elements.size());
        for (int i=0; i<elements.size();i++){
          System.out.println("text:" + elements.get(i).getText());
        }

    }
}
