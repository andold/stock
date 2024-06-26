// Generated from C:\src\eclipse-workspace\stock\src\main\resources\grammar\Stock.g4 by ANTLR 4.10.1
package kr.andold.stock.antlr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.stock.service.ParserService;

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
	 * Enter a parse tree produced by {@link StockParser#krxPriceCompany}.
	 * @param ctx the parse tree
	 */
	void enterKrxPriceCompany(StockParser.KrxPriceCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#krxPriceCompany}.
	 * @param ctx the parse tree
	 */
	void exitKrxPriceCompany(StockParser.KrxPriceCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#krxItemInfoCompany}.
	 * @param ctx the parse tree
	 */
	void enterKrxItemInfoCompany(StockParser.KrxItemInfoCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#krxItemInfoCompany}.
	 * @param ctx the parse tree
	 */
	void exitKrxItemInfoCompany(StockParser.KrxItemInfoCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#krxBasicInfoCompany}.
	 * @param ctx the parse tree
	 */
	void enterKrxBasicInfoCompany(StockParser.KrxBasicInfoCompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#krxBasicInfoCompany}.
	 * @param ctx the parse tree
	 */
	void exitKrxBasicInfoCompany(StockParser.KrxBasicInfoCompanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StockParser#companyAllPrice}.
	 * @param ctx the parse tree
	 */
	void enterCompanyAllPrice(StockParser.CompanyAllPriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StockParser#companyAllPrice}.
	 * @param ctx the parse tree
	 */
	void exitCompanyAllPrice(StockParser.CompanyAllPriceContext ctx);
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