-- KR로 시작하는 code 지우기
DELETE from stock_item				WHERE code > 'KR' AND code < 'KS';
DELETE from stock_dividend_history	WHERE code > 'KR' AND code < 'KS';
DELETE from stock_price				WHERE code > 'KR' AND code < 'KS';

-- 상장폐지일 수집하면서 수집되는 것 지우기
DELETE from stock_item				WHERE ipo_open IS NULL AND ipo_close IS NOT NULL;

