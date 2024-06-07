// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\SeibroEtf.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeibroEtfParser}.
 */
public interface SeibroEtfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#seibroEtfDocument}.
	 * @param ctx the parse tree
	 */
	void enterSeibroEtfDocument(SeibroEtfParser.SeibroEtfDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#seibroEtfDocument}.
	 * @param ctx the parse tree
	 */
	void exitSeibroEtfDocument(SeibroEtfParser.SeibroEtfDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#seibroPriceCurrentEtf}.
	 * @param ctx the parse tree
	 */
	void enterSeibroPriceCurrentEtf(SeibroEtfParser.SeibroPriceCurrentEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#seibroPriceCurrentEtf}.
	 * @param ctx the parse tree
	 */
	void exitSeibroPriceCurrentEtf(SeibroEtfParser.SeibroPriceCurrentEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#naverPriceCurrentEtf}.
	 * @param ctx the parse tree
	 */
	void enterNaverPriceCurrentEtf(SeibroEtfParser.NaverPriceCurrentEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#naverPriceCurrentEtf}.
	 * @param ctx the parse tree
	 */
	void exitNaverPriceCurrentEtf(SeibroEtfParser.NaverPriceCurrentEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#seibroPriceEtf}.
	 * @param ctx the parse tree
	 */
	void enterSeibroPriceEtf(SeibroEtfParser.SeibroPriceEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#seibroPriceEtf}.
	 * @param ctx the parse tree
	 */
	void exitSeibroPriceEtf(SeibroEtfParser.SeibroPriceEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#seibroItemInfoEtf}.
	 * @param ctx the parse tree
	 */
	void enterSeibroItemInfoEtf(SeibroEtfParser.SeibroItemInfoEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#seibroItemInfoEtf}.
	 * @param ctx the parse tree
	 */
	void exitSeibroItemInfoEtf(SeibroEtfParser.SeibroItemInfoEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#crawlItemEtf}.
	 * @param ctx the parse tree
	 */
	void enterCrawlItemEtf(SeibroEtfParser.CrawlItemEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#crawlItemEtf}.
	 * @param ctx the parse tree
	 */
	void exitCrawlItemEtf(SeibroEtfParser.CrawlItemEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#crawlPriceEtf}.
	 * @param ctx the parse tree
	 */
	void enterCrawlPriceEtf(SeibroEtfParser.CrawlPriceEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#crawlPriceEtf}.
	 * @param ctx the parse tree
	 */
	void exitCrawlPriceEtf(SeibroEtfParser.CrawlPriceEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlEtfDetailThread(SeibroEtfParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlEtfDetailThread(SeibroEtfParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 */
	void enterCrawlDividendHistoryEtfThread(SeibroEtfParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 */
	void exitCrawlDividendHistoryEtfThread(SeibroEtfParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(SeibroEtfParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(SeibroEtfParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SeibroEtfParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SeibroEtfParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeibroEtfParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(SeibroEtfParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeibroEtfParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(SeibroEtfParser.EofContext ctx);
}