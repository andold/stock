// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\KrxEtf.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KrxEtfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KrxEtfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#krxEtfDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrxEtfDocument(KrxEtfParser.KrxEtfDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#krxPriceEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrxPriceEtf(KrxEtfParser.KrxPriceEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#krxItemInfoEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrxItemInfoEtf(KrxEtfParser.KrxItemInfoEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#krxBasicInfoEtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrxBasicInfoEtf(KrxEtfParser.KrxBasicInfoEtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#etfAllPrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtfAllPrice(KrxEtfParser.EtfAllPriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#crawlPriceKrx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceKrx(KrxEtfParser.CrawlPriceKrxContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(KrxEtfParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(KrxEtfParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KrxEtfParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(KrxEtfParser.EofContext ctx);
}