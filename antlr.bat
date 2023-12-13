@ECHO OFF

REM 2018-05-28	andold	%cd% environment variable use
REM @since	2018-02-12	andold	base dir move to 
@ECHO ON
TIME /T

java -jar %CD%\src\main\resources\bin\antlr-4.10.1-complete.jar -encoding UTF8 -package kr.andold.stock.antlr -visitor -o %CD%\src\main\java\kr\andold\stock\antlr %CD%\src\main\resources\grammar\Stock.g4
