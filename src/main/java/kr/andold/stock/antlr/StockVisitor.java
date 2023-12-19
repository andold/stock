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
	 * Visit a parse tree produced by {@link StockParser#crawlPriceCompay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlPriceCompay(StockParser.CrawlPriceCompayContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlCompanyDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlCompanyDetails(StockParser.CrawlCompanyDetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StockParser#crawlCompanyTopDividend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrawlCompanyTopDividend(StockParser.CrawlCompanyTopDividendContext ctx);
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