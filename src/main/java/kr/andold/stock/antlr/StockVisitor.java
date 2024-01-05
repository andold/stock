// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Stock.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

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
	 * Visit a parse tree produced by {@link StockParser#crawlPriceKrx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceKrx(StockParser.CrawlPriceKrxContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlItemEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlItemEtf(StockParser.CrawlItemEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlPriceEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceEtf(StockParser.CrawlPriceEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlPriceCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceCompany(StockParser.CrawlPriceCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlItemDetailCompanyThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlItemDetailCompanyThread(StockParser.CrawlItemDetailCompanyThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlItemDividendTopCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlItemDividendTopCompany(StockParser.CrawlItemDividendTopCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlEtfDetailThread(StockParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlDividendHistoryEtfThread(StockParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlDividendHistoryCompanyThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlDividendHistoryCompanyThread(StockParser.CrawlDividendHistoryCompanyThreadContext ctx);
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