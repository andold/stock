--
-- postgresql
--
--drop sequence if exists HIBERNATE_SEQUENCES;
--create sequence HIBERNATE_SEQUENCES start with 1024 increment by 1;
drop table stock_item;
drop table stock_dividend_history;
drop table stock_price;


-- 주식 종목
CREATE TABLE stock_item (
id			serial not null,

code		varchar(1024) not null DEFAULT '',
isin_code	varchar(1024) not null DEFAULT '',
symbol		varchar(1024),
priority	integer,
field_type	varchar(1024),
dividend_cycle			varchar(1024),
price_earnings_ratio	float,
volume_of_listed_shares	integer,
category	varchar(1024),
ipo_open	timestamp,
ipo_close	timestamp,

created		timestamp not null DEFAULT CURRENT_TIMESTAMP,
updated		timestamp not null DEFAULT CURRENT_TIMESTAMP,
primary key (id));
ALTER SEQUENCE stock_item_id_seq RESTART WITH 1024;


-- 배당 이력
CREATE TABLE stock_dividend_history (
id			serial not null,

code		varchar(1024) not null DEFAULT '',
isin_code	varchar(1024) not null DEFAULT '',
base		timestamp not null DEFAULT CURRENT_TIMESTAMP,
pay			timestamp,
dividend	integer,

price_base		timestamp,
price_closing	integer,

created		timestamp not null DEFAULT CURRENT_TIMESTAMP,
updated		timestamp not null DEFAULT CURRENT_TIMESTAMP,
primary key (id));
ALTER SEQUENCE stock_dividend_history_id_seq RESTART WITH 1024;


-- 주가 일별 시세
CREATE TABLE stock_price (
id			serial not null,

code		varchar(1024) not null DEFAULT '',
isin_code	varchar(1024) not null DEFAULT '',
base		timestamp not null DEFAULT CURRENT_TIMESTAMP,
closing		integer,
market		integer,
high		integer,
low			integer,
volume		integer,

flag		integer,

created		timestamp not null DEFAULT CURRENT_TIMESTAMP,
updated		timestamp not null DEFAULT CURRENT_TIMESTAMP,
primary key (id));
ALTER SEQUENCE stock_price_id_seq RESTART WITH 1024;
CREATE INDEX index_base_code_flag ON stock_price(base, code, flag);

