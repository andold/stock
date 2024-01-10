// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Stock.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StockParser}.
 */
public interface StockListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StockParser#stockDocument}.
	 * @param ctx the parse tree
	 */
	void enterStockDocument(StockParser.StockDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#stockDocument}.
	 * @param ctx the parse tree
	 */
	void exitStockDocument(StockParser.StockDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#krxBasicInfoEtf}.
	 * @param ctx the parse tree
	 */
	void enterKrxBasicInfoEtf(StockParser.KrxBasicInfoEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#krxBasicInfoEtf}.
	 * @param ctx the parse tree
	 */
	void exitKrxBasicInfoEtf(StockParser.KrxBasicInfoEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#krxBasicInfoCompany}.
	 * @param ctx the parse tree
	 */
	void enterKrxBasicInfoCompany(StockParser.KrxBasicInfoCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#krxBasicInfoCompany}.
	 * @param ctx the parse tree
	 */
	void exitKrxBasicInfoCompany(StockParser.KrxBasicInfoCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#etfAllPrice}.
	 * @param ctx the parse tree
	 */
	void enterEtfAllPrice(StockParser.EtfAllPriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#etfAllPrice}.
	 * @param ctx the parse tree
	 */
	void exitEtfAllPrice(StockParser.EtfAllPriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#companyAllPrice}.
	 * @param ctx the parse tree
	 */
	void enterCompanyAllPrice(StockParser.CompanyAllPriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#companyAllPrice}.
	 * @param ctx the parse tree
	 */
	void exitCompanyAllPrice(StockParser.CompanyAllPriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlPriceKrx}.
	 * @param ctx the parse tree
	 */
	void enterCrawlPriceKrx(StockParser.CrawlPriceKrxContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlPriceKrx}.
	 * @param ctx the parse tree
	 */
	void exitCrawlPriceKrx(StockParser.CrawlPriceKrxContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlItemEtf}.
	 * @param ctx the parse tree
	 */
	void enterCrawlItemEtf(StockParser.CrawlItemEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlItemEtf}.
	 * @param ctx the parse tree
	 */
	void exitCrawlItemEtf(StockParser.CrawlItemEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlPriceEtf}.
	 * @param ctx the parse tree
	 */
	void enterCrawlPriceEtf(StockParser.CrawlPriceEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlPriceEtf}.
	 * @param ctx the parse tree
	 */
	void exitCrawlPriceEtf(StockParser.CrawlPriceEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlPriceCompany}.
	 * @param ctx the parse tree
	 */
	void enterCrawlPriceCompany(StockParser.CrawlPriceCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlPriceCompany}.
	 * @param ctx the parse tree
	 */
	void exitCrawlPriceCompany(StockParser.CrawlPriceCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlItemDetailCompanyThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlItemDetailCompanyThread(StockParser.CrawlItemDetailCompanyThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlItemDetailCompanyThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlItemDetailCompanyThread(StockParser.CrawlItemDetailCompanyThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlItemDividendTopCompany}.
	 * @param ctx the parse tree
	 */
	void enterCrawlItemDividendTopCompany(StockParser.CrawlItemDividendTopCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlItemDividendTopCompany}.
	 * @param ctx the parse tree
	 */
	void exitCrawlItemDividendTopCompany(StockParser.CrawlItemDividendTopCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlEtfDetailThread(StockParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlEtfDetailThread(StockParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlDividendHistoryEtfThread(StockParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlDividendHistoryEtfThread(StockParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlDividendHistoryCompanyThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlDividendHistoryCompanyThread(StockParser.CrawlDividendHistoryCompanyThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlDividendHistoryCompanyThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlDividendHistoryCompanyThread(StockParser.CrawlDividendHistoryCompanyThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(StockParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(StockParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(StockParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(StockParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(StockParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(StockParser.EofContext ctx);
}