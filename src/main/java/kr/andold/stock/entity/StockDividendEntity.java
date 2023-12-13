package kr.andold.stock.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@Table(name = "stock_dividend")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
public class StockDividendEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	// 종목코드
	@Column(name = "code")
	private String code;

	@Column(name = "currentPrice")
	private Integer currentPrice;

	@Column(name = "baseMonth")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date baseMonth;

	@Column(name = "dividend")
	private Integer dividend;

	@Column(name = "priceEarningsRatio")
	private Float priceEarningsRatio;

	@Column(name = "dividendPayoutRatio")
	private Float dividendPayoutRatio;

	@Column(name = "roe")
	private Float roe;

	@Column(name = "per")
	private Float per;

	@Column(name = "pbr")
	private Float pbr;

	@Column(name = "dividend1YAgo")
	private Integer dividend1YAgo;

	@Column(name = "dividend2YAgo")
	private Integer dividend2YAgo;

	@Column(name = "dividend3YAgo")
	private Integer dividend3YAgo;

	@Column(name = "created")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Column(name = "updated")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;

}
