USE celebdb;
CREATE TABLE snl_show(
	ID int NOT NULL primary key auto_increment,
    SEASON int NOT NULL,
    EPISODE int NOT NULL,
    BROADCASTDATE date,
    host varchar(32) NOT NULL
);

INSERT INTO snl_show (SEASON, EPISODE, BROADCASTDATE, host) VALUE 
(8, 8, '2020-09-12', '유재석'),
(8, 9, '2020-09-19', '차승원'),
(8, 10, '2020-09-26', '이수현'),
(9, 1, '2021-09-04', '이병헌'),
(9, 2, '2021-09-11', '하지원'),
(9, 3, '2021-09-18', '제시'),
(9, 4, '2021-09-25', '조정석'),
(9, 5, '2021-10-02', '조여정'),
(9, 6, '2021-10-09', '옥주현');


SELECT * FROm snl_show;