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
	 * Enter a parse tree produced by {@link StockParser#extractItemDetails}.
	 * @param ctx the parse tree
	 */
	void enterExtractItemDetails(StockParser.ExtractItemDetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#extractItemDetails}.
	 * @param ctx the parse tree
	 */
	void exitExtractItemDetails(StockParser.ExtractItemDetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#extractItemDetailsCompany}.
	 * @param ctx the parse tree
	 */
	void enterExtractItemDetailsCompany(StockParser.ExtractItemDetailsCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#extractItemDetailsCompany}.
	 * @param ctx the parse tree
	 */
	void exitExtractItemDetailsCompany(StockParser.ExtractItemDetailsCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#extractItemDetailsEtf}.
	 * @param ctx the parse tree
	 */
	void enterExtractItemDetailsEtf(StockParser.ExtractItemDetailsEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#extractItemDetailsEtf}.
	 * @param ctx the parse tree
	 */
	void exitExtractItemDetailsEtf(StockParser.ExtractItemDetailsEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#extractlDividendHistory}.
	 * @param ctx the parse tree
	 */
	void enterExtractlDividendHistory(StockParser.ExtractlDividendHistoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#extractlDividendHistory}.
	 * @param ctx the parse tree
	 */
	void exitExtractlDividendHistory(StockParser.ExtractlDividendHistoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#extractTextStockPrice}.
	 * @param ctx the parse tree
	 */
	void enterExtractTextStockPrice(StockParser.ExtractTextStockPriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#extractTextStockPrice}.
	 * @param ctx the parse tree
	 */
	void exitExtractTextStockPrice(StockParser.ExtractTextStockPriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#naverStockItemDetails}.
	 * @param ctx the parse tree
	 */
	void enterNaverStockItemDetails(StockParser.NaverStockItemDetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#naverStockItemDetails}.
	 * @param ctx the parse tree
	 */
	void exitNaverStockItemDetails(StockParser.NaverStockItemDetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtf}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfComMonthlyDividendEtf(StockParser.SearchEtfComMonthlyDividendEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtf}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfComMonthlyDividendEtf(StockParser.SearchEtfComMonthlyDividendEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtfItem}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfComMonthlyDividendEtfItem(StockParser.SearchEtfComMonthlyDividendEtfItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtfItem}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfComMonthlyDividendEtfItem(StockParser.SearchEtfComMonthlyDividendEtfItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtfItemDividend}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfComMonthlyDividendEtfItemDividend(StockParser.SearchEtfComMonthlyDividendEtfItemDividendContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtfItemDividend}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfComMonthlyDividendEtfItemDividend(StockParser.SearchEtfComMonthlyDividendEtfItemDividendContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfComMonthlyDividend}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfComMonthlyDividend(StockParser.SearchEtfComMonthlyDividendContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividend}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfComMonthlyDividend(StockParser.SearchEtfComMonthlyDividendContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendItem}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfComMonthlyDividendItem(StockParser.SearchEtfComMonthlyDividendItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendItem}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfComMonthlyDividendItem(StockParser.SearchEtfComMonthlyDividendItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfComMonthlyDividends}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfComMonthlyDividends(StockParser.SearchEtfComMonthlyDividendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividends}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfComMonthlyDividends(StockParser.SearchEtfComMonthlyDividendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#naverStockDetail}.
	 * @param ctx the parse tree
	 */
	void enterNaverStockDetail(StockParser.NaverStockDetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#naverStockDetail}.
	 * @param ctx the parse tree
	 */
	void exitNaverStockDetail(StockParser.NaverStockDetailContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#naverStockDetailCompany}.
	 * @param ctx the parse tree
	 */
	void enterNaverStockDetailCompany(StockParser.NaverStockDetailCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#naverStockDetailCompany}.
	 * @param ctx the parse tree
	 */
	void exitNaverStockDetailCompany(StockParser.NaverStockDetailCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#naverStockDetailEtf}.
	 * @param ctx the parse tree
	 */
	void enterNaverStockDetailEtf(StockParser.NaverStockDetailEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#naverStockDetailEtf}.
	 * @param ctx the parse tree
	 */
	void exitNaverStockDetailEtf(StockParser.NaverStockDetailEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfCom}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfCom(StockParser.SearchEtfComContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfCom}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfCom(StockParser.SearchEtfComContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#searchEtfComItem}.
	 * @param ctx the parse tree
	 */
	void enterSearchEtfComItem(StockParser.SearchEtfComItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#searchEtfComItem}.
	 * @param ctx the parse tree
	 */
	void exitSearchEtfComItem(StockParser.SearchEtfComItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#seibroDividend}.
	 * @param ctx the parse tree
	 */
	void enterSeibroDividend(StockParser.SeibroDividendContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#seibroDividend}.
	 * @param ctx the parse tree
	 */
	void exitSeibroDividend(StockParser.SeibroDividendContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#seibroDividendItem}.
	 * @param ctx the parse tree
	 */
	void enterSeibroDividendItem(StockParser.SeibroDividendItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#seibroDividendItem}.
	 * @param ctx the parse tree
	 */
	void exitSeibroDividendItem(StockParser.SeibroDividendItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#naverStock}.
	 * @param ctx the parse tree
	 */
	void enterNaverStock(StockParser.NaverStockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#naverStock}.
	 * @param ctx the parse tree
	 */
	void exitNaverStock(StockParser.NaverStockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#naverStockItem}.
	 * @param ctx the parse tree
	 */
	void enterNaverStockItem(StockParser.NaverStockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#naverStockItem}.
	 * @param ctx the parse tree
	 */
	void exitNaverStockItem(StockParser.NaverStockItemContext ctx);
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