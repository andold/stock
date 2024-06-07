// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\SeibroEtf.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SeibroEtfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SeibroEtfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#seibroEtfDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroEtfDocument(SeibroEtfParser.SeibroEtfDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#seibroPriceCurrentEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroPriceCurrentEtf(SeibroEtfParser.SeibroPriceCurrentEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#naverPriceCurrentEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaverPriceCurrentEtf(SeibroEtfParser.NaverPriceCurrentEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#seibroPriceEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroPriceEtf(SeibroEtfParser.SeibroPriceEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#seibroItemInfoEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeibroItemInfoEtf(SeibroEtfParser.SeibroItemInfoEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#crawlItemEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlItemEtf(SeibroEtfParser.CrawlItemEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#crawlPriceEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceEtf(SeibroEtfParser.CrawlPriceEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#crawlEtfDetailThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlEtfDetailThread(SeibroEtfParser.CrawlEtfDetailThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#crawlDividendHistoryEtfThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlDividendHistoryEtfThread(SeibroEtfParser.CrawlDividendHistoryEtfThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(SeibroEtfParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SeibroEtfParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeibroEtfParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(SeibroEtfParser.EofContext ctx);
}