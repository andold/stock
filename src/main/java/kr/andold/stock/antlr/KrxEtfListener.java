// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\KrxEtf.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KrxEtfParser}.
 */
public interface KrxEtfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#krxEtfDocument}.
	 * @param ctx the parse tree
	 */
	void enterKrxEtfDocument(KrxEtfParser.KrxEtfDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#krxEtfDocument}.
	 * @param ctx the parse tree
	 */
	void exitKrxEtfDocument(KrxEtfParser.KrxEtfDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#krxPriceEtf}.
	 * @param ctx the parse tree
	 */
	void enterKrxPriceEtf(KrxEtfParser.KrxPriceEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#krxPriceEtf}.
	 * @param ctx the parse tree
	 */
	void exitKrxPriceEtf(KrxEtfParser.KrxPriceEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#krxItemInfoEtf}.
	 * @param ctx the parse tree
	 */
	void enterKrxItemInfoEtf(KrxEtfParser.KrxItemInfoEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#krxItemInfoEtf}.
	 * @param ctx the parse tree
	 */
	void exitKrxItemInfoEtf(KrxEtfParser.KrxItemInfoEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#krxBasicInfoEtf}.
	 * @param ctx the parse tree
	 */
	void enterKrxBasicInfoEtf(KrxEtfParser.KrxBasicInfoEtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#krxBasicInfoEtf}.
	 * @param ctx the parse tree
	 */
	void exitKrxBasicInfoEtf(KrxEtfParser.KrxBasicInfoEtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#etfAllPrice}.
	 * @param ctx the parse tree
	 */
	void enterEtfAllPrice(KrxEtfParser.EtfAllPriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#etfAllPrice}.
	 * @param ctx the parse tree
	 */
	void exitEtfAllPrice(KrxEtfParser.EtfAllPriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#crawlPriceKrx}.
	 * @param ctx the parse tree
	 */
	void enterCrawlPriceKrx(KrxEtfParser.CrawlPriceKrxContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#crawlPriceKrx}.
	 * @param ctx the parse tree
	 */
	void exitCrawlPriceKrx(KrxEtfParser.CrawlPriceKrxContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(KrxEtfParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(KrxEtfParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(KrxEtfParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(KrxEtfParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrxEtfParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(KrxEtfParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrxEtfParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(KrxEtfParser.EofContext ctx);
}