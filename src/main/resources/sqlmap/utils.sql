-- isinCode 필드 UPDATE
UPDATE stock_dividend_history SET isin_code = stock_item.isin_code FROM stock_item WHERE stock_item.code = stock_dividend_history.code;

-- isinCode 필드 추가
ALTER TABLE stock_item ADD isin_code VARCHAR(1024) NOT NULL DEFAULT '';
ALTER TABLE stock_dividend_history ADD isin_code VARCHAR(1024) NOT NULL DEFAULT '';
ALTER TABLE stock_price ADD isin_code VARCHAR(1024) NOT NULL DEFAULT '';

-- A로 시작하는 code 지우기
DELETE from stock_item				WHERE code LIKE 'A%' AND isin_code <> '';

-- KR로 시작하는 code 지우기
DELETE from stock_item				WHERE code > 'KR' AND code < 'KS';
DELETE from stock_dividend_history	WHERE code > 'KR' AND code < 'KS';
DELETE from stock_price				WHERE code > 'KR' AND code < 'KS';

-- 상장폐지일 수집하면서 수집되는 것 지우기
DELETE from stock_item				WHERE ipo_open IS NULL AND ipo_close IS NOT NULL;

