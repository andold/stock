// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Seibro.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeibroParser}.
 */
public interface SeibroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeibroParser#stockDocument}.
	 * @param ctx the parse tree
	 */
	void enterStockDocument(SeibroParser.StockDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#stockDocument}.
	 * @param ctx the parse tree
	 */
	void exitStockDocument(SeibroParser.StockDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#naverPriceCurrentEtf}.
	 * @param ctx the parse tree
	 */
	void enterNaverPriceCurrentEtf(SeibroParser.NaverPriceCurrentEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#naverPriceCurrentEtf}.
	 * @param ctx the parse tree
	 */
	void exitNaverPriceCurrentEtf(SeibroParser.NaverPriceCurrentEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#seibroPriceCurrentCompany}.
	 * @param ctx the parse tree
	 */
	void enterSeibroPriceCurrentCompany(SeibroParser.SeibroPriceCurrentCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#seibroPriceCurrentCompany}.
	 * @param ctx the parse tree
	 */
	void exitSeibroPriceCurrentCompany(SeibroParser.SeibroPriceCurrentCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#seibroPriceCompany}.
	 * @param ctx the parse tree
	 */
	void enterSeibroPriceCompany(SeibroParser.SeibroPriceCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#seibroPriceCompany}.
	 * @param ctx the parse tree
	 */
	void exitSeibroPriceCompany(SeibroParser.SeibroPriceCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#seibroItemInfoCompany}.
	 * @param ctx the parse tree
	 */
	void enterSeibroItemInfoCompany(SeibroParser.SeibroItemInfoCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#seibroItemInfoCompany}.
	 * @param ctx the parse tree
	 */
	void exitSeibroItemInfoCompany(SeibroParser.SeibroItemInfoCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#crawlPriceCompany}.
	 * @param ctx the parse tree
	 */
	void enterCrawlPriceCompany(SeibroParser.CrawlPriceCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#crawlPriceCompany}.
	 * @param ctx the parse tree
	 */
	void exitCrawlPriceCompany(SeibroParser.CrawlPriceCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#crawlItemDetailCompanyThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlItemDetailCompanyThread(SeibroParser.CrawlItemDetailCompanyThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#crawlItemDetailCompanyThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlItemDetailCompanyThread(SeibroParser.CrawlItemDetailCompanyThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#crawlItemDividendTopCompany}.
	 * @param ctx the parse tree
	 */
	void enterCrawlItemDividendTopCompany(SeibroParser.CrawlItemDividendTopCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#crawlItemDividendTopCompany}.
	 * @param ctx the parse tree
	 */
	void exitCrawlItemDividendTopCompany(SeibroParser.CrawlItemDividendTopCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#crawlDividendHistoryCompanyThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlDividendHistoryCompanyThread(SeibroParser.CrawlDividendHistoryCompanyThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#crawlDividendHistoryCompanyThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlDividendHistoryCompanyThread(SeibroParser.CrawlDividendHistoryCompanyThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(SeibroParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(SeibroParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SeibroParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SeibroParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(SeibroParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(SeibroParser.EofContext ctx);
}