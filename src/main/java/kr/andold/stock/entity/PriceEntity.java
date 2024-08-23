package kr.andold.stock.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@Table(name = "stock_price")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PriceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String code;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date base;

	private Integer closing;	//	종가
	private Integer market;		//	시가
	private Integer high;		//	고가
	private Integer low;		//	저가
	private Integer volume;		//	거래량
	
	/*
	 	bit 0 ~ 3: reserved
		bit 5: 32, week 주대표
		bit 6: 64, month 월대표
		bit 7: 128, year 연대표
		bit 8: 256, 특정일, 배당일 등
	 */
	private Integer flag;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;

}
