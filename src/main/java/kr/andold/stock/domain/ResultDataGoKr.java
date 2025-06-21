package kr.andold.stock.domain;

import java.util.List;

import kr.andold.stock.service.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDataGoKr<T> {
	// 종목기본정보조회
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultItemDetail {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.ItemDetailDomain> response;
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ItemDetailDomain {
		private String basDt;
		private String crno;
		private String dpsgCanDt;
		private String dpsgRegDt;
		private String isinCd;
		private String isinCdNm;
		private String issuFrmtClsfNm;
		private Integer issuStckCnt;
		private String itmsShrtnCd;
		private String lstgAbolDt;
		private String lstgDt;
		private String scrsItmsKcd;
		private String scrsItmsKcdNm;
		private String stckIssuCmpyNm;
		private String stckParPrc;

		public String toString() {
			return Utility.toStringJson(this);
		}
	}

	// 종목 정보
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultItem {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.ItemDomain> response;
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ItemDomain {
		private String basDt;
		private String srtnCd;
		private String isinCd;
		private String mrktCtg;
		private String itmsNm;
		private String crno;
		private String corpNm;
		
		public String toString() {
			return Utility.toStringJson(this);
		}
	}

	// 배당정보조회
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultDividend {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.DividendDomain> response;
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DividendDomain {
		private String basDt;
		private String cashDvdnPayDt;
		private String cashGrdnDvdnRt;
		private String crno;
		private String dvdnBasDt;
		private String isinCd;
		private String isinCdNm;
		private String scrsItmsKcd;
		private String scrsItmsKcdNm;
		private String stckDvdnRcd;

		private String stckDvdnRcdNm;
		private String stckGenrCashDvdnRt;
		private Float stckGenrDvdnAmt;
		private String stckGenrDvdnRt;
		private String stckGrdnDvdnAmt;
		private String stckGrdnDvdnRt;
		private String stckHndvDt;
		private String stckIssuCmpyNm;
		private String stckParPrc;
		private String stckStacMd;
		private String trsnmDptyDcd;
		private String trsnmDptyDcdNm;
		
		public String toString() {
			return Utility.toStringJson(this);
		}
	}

	// 주식시세
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultPriceCompany {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.PriceCompanyDomain> response;
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PriceCompanyDomain {
		private String basDt;
		private String srtnCd;
		private String isinCd;
		private String itmsNm;
		private String mrktCtg;
		private Integer clpr;
		private String vs;
		private String fltRt;
		private Integer mkp;
		private Integer hipr;
		private Integer lopr;
		private Integer trqu;
		private String trPrc;
		private String lstgStCnt;
		private String mrktTotAmt;
		
		public String toString() {
			return Utility.toStringJson(this);
		}
	}

	// ETF시세
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultPriceEtf {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.PriceEtfDomain> response;
	}

	// ETF시세
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PriceEtfDomain {
		private String basDt;
		private String srtnCd;
		private String isinCd;
		private String itmsNm;
		private Integer clpr;
		private String vs;
		private String fltRt;
		private String nav;
		private Integer mkp;
		private Integer hipr;
		private Integer lopr;
		private Integer trqu;
		private String trPrc;
		private String mrktTotAmt;
		private String nPptTotAmt;
		private String stLstgCnt;
		private String bssIdxIdxNm;
		private String bssIdxClpr;	
		
		public String toString() {
			return Utility.toStringJson(this);
		}
	}
	// 파생상품지수시세
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class DeriveProductIndexDomain {
		private String basDt;
		private String idxNm;
		private String clpr;
		private String vs;
		private String fltRt;
		private String mkp;
		private String hipr;
		private String lopr;
		private String trqu;
		private String trPrc;
		
		public String toString() {
			return Utility.toStringJson(this);
		}
	}
	// 주가지수시세
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PriceStockIndexDomain {
		private String basDt;
		private String idxNm;
		private String idxCsf;
		private String epyItmsCnt;
		private String clpr;
		private String vs;
		private String fltRt;
		private String mkp;
		private String hipr;
		private String lopr;
		private String trqu;
		private String trPrc;
		private String lstgMrktTotAmt;
		private String lsYrEdVsFltRg;
		private String lsYrEdVsFltRt;
		private String yrWRcrdHgst;
		private String yrWRcrdHgstDt;
		private String yrWRcrdLwst;
		private String yrWRcrdLwstDt;
		private String basPntm;
		private String basIdx;
		
		public String toString() {
			return Utility.toStringJson(this);
		}
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PriceStockDomain {
		private String basDt;
		private String srtnCd;
		private String isinCd;
		private String itmsNm;
		private String mrktCtg;
		private String clpr;
		private String vs;
		private String fltRt;
		private String mkp;
		private String hipr;
		private String lopr;
		private String trqu;
		private String trPrc;
		private String lstgStCnt;
		private String mrktTotAmt;
		
		public String toString() {
			return Utility.toStringJson(this);
		}
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ItemsDomain<T> {
		private List<T> item;
		public String toString() {
			return Utility.toStringJson(this);
		}
		public void log() {
			for (int cx = 0, sizex = item.size(); cx < sizex; cx++) {
				log.info("{}/{} {}", cx, sizex, item.get(cx));
			}
		}
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class HeaderDomain {
		private String resultCode;
		private String resultMsg;
	}
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class BodyDomain<T> {
		private Integer numOfRows;
		private Integer pageNo;
		private Integer totalCount;
		private ItemsDomain<T> items;
	}

	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResponseDomain<T> {
		private HeaderDomain header;
		private BodyDomain<T> body;
	}

	private ResponseDomain<T> response;

}
