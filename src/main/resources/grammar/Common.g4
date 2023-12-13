/**
 * 공통 문법
 */
grammar Common;

fragment AM:	'오전' | 'AM' | 'am';
fragment DIGIT:	[0-9];
fragment PM:	'오후' | 'PM' | 'pm';
fragment SIGN:	'+' | '-';
fragment WEEKDAY:	'월' | '화' | '수' | '목' | '금' | '토' | '일';
fragment ACCOUNT_NUMBER:	'계좌번호';
fragment TRANSFERABLE_AMOUNT:	'이체가능금액';
fragment SUM:	'합계';
fragment CREDIT_CARD:	'신용카드';
fragment KEYWORD__:	'KEYWORD';

BLANK:		[ \u000B\f\r\u00A0]	-> skip;
BLANK_LINE:	{getCharPositionInLine() == 0}? [ \u000B\f\r\u00A0]* NEWLINE	-> skip;

TAB:		[\t];
NEWLINE:	[\r]? [\n];

KEYWORD:	KEYWORD__ | ACCOUNT_NUMBER | TRANSFERABLE_AMOUNT | SUM | CREDIT_CARD;

DATE
	:	DIGIT? DIGIT? DIGIT DIGIT '-' DIGIT? DIGIT '-' DIGIT? DIGIT  (' '? '(' WEEKDAY ')')?
	|	DIGIT? DIGIT? DIGIT DIGIT '.' DIGIT? DIGIT '.' DIGIT? DIGIT  (' '? '(' WEEKDAY ')')?
	|	DIGIT DIGIT DIGIT DIGIT '/' DIGIT DIGIT '/' DIGIT DIGIT  (' '? '(' WEEKDAY ')')?
	|	DIGIT? DIGIT? DIGIT DIGIT '년 ' DIGIT? DIGIT '월 ' DIGIT? DIGIT '일' (' '? '(' WEEKDAY ')')?
	;
TIME
	:	(AM | PM)? DIGIT? DIGIT ':' DIGIT DIGIT (':' DIGIT DIGIT)?
	|	(AM | PM)? DIGIT? DIGIT '시 ' DIGIT? DIGIT '분' (DIGIT? DIGIT '초')?
	;
NUMBER
	:	SIGN? DIGIT? DIGIT? DIGIT (',' DIGIT DIGIT DIGIT)* ('.' DIGIT*)?
	|	SIGN? DIGIT DIGIT DIGIT DIGIT+ ('.' DIGIT*)?
	;

STRING:		["] ~["]* ["];
WORD:		~[ \u000B\f\r\u00A0\t\n]+;

word:	WORD | KEYWORD | NUMBER | TIME | DATE | STRING;
line:	(word | TAB)+ NEWLINE;
eof:	(word | TAB | NEWLINE)+;
