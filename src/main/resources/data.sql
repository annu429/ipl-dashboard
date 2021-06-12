drop table if exists MATCH;	

CREATE TABLE MATCH(id int primary key, city varchar(30),date DATE, player_of_Match varchar(30), venue varchar(100), team1 varchar(30), team2 varchar(30), toss_winner varchar(30), toss_decision varchar(30), match_winner varchar(30), result varchar(30),result_margin varchar(30), umpire1 varchar(30), umpire2 varchar(30)) ;