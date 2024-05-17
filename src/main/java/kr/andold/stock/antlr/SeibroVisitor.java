// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Seibro.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SeibroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SeibroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SeibroParser#stockDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStockDocument(SeibroParser.StockDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#seibroPriceCurrentEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroPriceCurrentEtf(SeibroParser.SeibroPriceCurrentEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#naverPriceCurrentEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverPriceCurrentEtf(SeibroParser.NaverPriceCurrentEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#seibroPriceCurrentCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroPriceCurrentCompany(SeibroParser.SeibroPriceCurrentCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#seibroPriceCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroPriceCompany(SeibroParser.SeibroPriceCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#seibroPriceEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroPriceEtf(SeibroParser.SeibroPriceEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#seibroItemInfoCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroItemInfoCompany(SeibroParser.SeibroItemInfoCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#seibroItemInfoEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroItemInfoEtf(SeibroParser.SeibroItemInfoEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlItemEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlItemEtf(SeibroParser.CrawlItemEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlPriceEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceEtf(SeibroParser.CrawlPriceEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlPriceCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceCompany(SeibroParser.CrawlPriceCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlItemDetailCompanyThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlItemDetailCompanyThread(SeibroParser.CrawlItemDetailCompanyThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlItemDividendTopCompany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlItemDividendTopCompany(SeibroParser.CrawlItemDividendTopCompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlEtfDetailThread(SeibroParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlDividendHistoryEtfThread(SeibroParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#crawlDividendHistoryCompanyThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlDividendHistoryCompanyThread(SeibroParser.CrawlDividendHistoryCompanyThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(SeibroParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SeibroParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(SeibroParser.EofContext ctx);
}