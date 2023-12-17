// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Stock.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.StockParserService;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StockParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StockVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StockParser#stockDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStockDocument(StockParser.StockDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlEtfDetailThread(StockParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#extractAllEtfFromNaver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractAllEtfFromNaver(StockParser.ExtractAllEtfFromNaverContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlDividendHistoryEtfThread(StockParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#extractItemDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractItemDetails(StockParser.ExtractItemDetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#extractItemDetailsCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractItemDetailsCompany(StockParser.ExtractItemDetailsCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#extractItemDetailsEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractItemDetailsEtf(StockParser.ExtractItemDetailsEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#extractlDividendHistory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractlDividendHistory(StockParser.ExtractlDividendHistoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#extractTextStockPrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractTextStockPrice(StockParser.ExtractTextStockPriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#naverStockItemDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverStockItemDetails(StockParser.NaverStockItemDetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfComMonthlyDividendEtf(StockParser.SearchEtfComMonthlyDividendEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtfItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfComMonthlyDividendEtfItem(StockParser.SearchEtfComMonthlyDividendEtfItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendEtfItemDividend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfComMonthlyDividendEtfItemDividend(StockParser.SearchEtfComMonthlyDividendEtfItemDividendContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfComMonthlyDividend(StockParser.SearchEtfComMonthlyDividendContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividendItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfComMonthlyDividendItem(StockParser.SearchEtfComMonthlyDividendItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfComMonthlyDividends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfComMonthlyDividends(StockParser.SearchEtfComMonthlyDividendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#naverStockDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverStockDetail(StockParser.NaverStockDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#naverStockDetailCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverStockDetailCompany(StockParser.NaverStockDetailCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#naverStockDetailEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverStockDetailEtf(StockParser.NaverStockDetailEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfCom(StockParser.SearchEtfComContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#searchEtfComItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchEtfComItem(StockParser.SearchEtfComItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#seibroDividend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroDividend(StockParser.SeibroDividendContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#seibroDividendItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroDividendItem(StockParser.SeibroDividendItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#naverStock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverStock(StockParser.NaverStockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#naverStockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverStockItem(StockParser.NaverStockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(StockParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(StockParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(StockParser.EofContext ctx);
}