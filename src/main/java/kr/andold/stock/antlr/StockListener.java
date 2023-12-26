// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Stock.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.StockParserService;

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
	 * Enter a parse tree produced by {@link StockParser#crawlPriceCompay}.
	 * @param ctx the parse tree
	 */
	void enterCrawlPriceCompay(StockParser.CrawlPriceCompayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlPriceCompay}.
	 * @param ctx the parse tree
	 */
	void exitCrawlPriceCompay(StockParser.CrawlPriceCompayContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlCompanyDetails}.
	 * @param ctx the parse tree
	 */
	void enterCrawlCompanyDetails(StockParser.CrawlCompanyDetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlCompanyDetails}.
	 * @param ctx the parse tree
	 */
	void exitCrawlCompanyDetails(StockParser.CrawlCompanyDetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#crawlCompanyTopDividend}.
	 * @param ctx the parse tree
	 */
	void enterCrawlCompanyTopDividend(StockParser.CrawlCompanyTopDividendContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlCompanyTopDividend}.
	 * @param ctx the parse tree
	 */
	void exitCrawlCompanyTopDividend(StockParser.CrawlCompanyTopDividendContext ctx);
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
	 * Enter a parse tree produced by {@link StockParser#extractAllEtfFromNaver}.
	 * @param ctx the parse tree
	 */
	void enterExtractAllEtfFromNaver(StockParser.ExtractAllEtfFromNaverContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#extractAllEtfFromNaver}.
	 * @param ctx the parse tree
	 */
	void exitExtractAllEtfFromNaver(StockParser.ExtractAllEtfFromNaverContext ctx);
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
	 * Enter a parse tree produced by {@link StockParser#crawlEtfDividendHistoryThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlEtfDividendHistoryThread(StockParser.CrawlEtfDividendHistoryThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#crawlEtfDividendHistoryThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlEtfDividendHistoryThread(StockParser.CrawlEtfDividendHistoryThreadContext ctx);
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