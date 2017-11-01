// Define a grammar called Hello
grammar Hello;
r      : num
	| r '+' r
	| r '*' r
	| r '/' r
	| r '-' r;
num    : '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';
WS     : [ \t\r\n]+ -> skip ;
