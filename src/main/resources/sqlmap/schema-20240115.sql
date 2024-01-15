drop sequence if exists HIBERNATE_SEQUENCES;
create sequence HIBERNATE_SEQUENCES start with 1024 increment by 1;

// 주식 종목
drop table stock_item if exists;
create table stock_item (
id			integer AUTO_INCREMENT(1024, 1) not null,

code		varchar(1024) not null DEFAULT '',
symbol		varchar(1024),
priority	integer,
field_type	varchar(1024),
dividend_cycle			varchar(1024),
price_earnings_ratio	float,
volume_of_listed_shares	integer,
category	varchar(1024),
ipo_date	timestamp,

created		timestamp not null DEFAULT CURRENT_TIMESTAMP,
updated		timestamp not null DEFAULT CURRENT_TIMESTAMP,
primary key (id));

// 배당 이력
drop table stock_dividend_history if exists;
create table stock_dividend_history (
id			integer AUTO_INCREMENT(1024, 1) not null,

code		varchar(1024) not null DEFAULT '',
base		timestamp not null DEFAULT CURRENT_TIMESTAMP,
pay			timestamp,
dividend	integer,

price_base		timestamp,
price_closing	integer,

created		timestamp not null DEFAULT CURRENT_TIMESTAMP,
updated		timestamp not null DEFAULT CURRENT_TIMESTAMP,
primary key (id));

// 주가 일별 시세
drop table stock_price if exists;
create table stock_price (
id			integer AUTO_INCREMENT(1024, 1) not null,

code		varchar(1024) not null DEFAULT '',
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

