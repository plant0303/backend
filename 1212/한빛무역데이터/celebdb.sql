USE celebdb;

CREATE TABLE Team(
	team_id INT auto_increment primary key,
    team_name VARCHAR(50) NOT NULL,
    city VARCHAR(50),
    created_at TIMESTAMP DEFAULT current_timestamp
);

CREATE TABLE Player(
	player_id INT auto_increment primary key,
    player_name VARCHAR(50) NOT NULL,
    position VARCHAR(20),
    age INT,
    team_id INT,
    foreign key (team_id) references TEAM(team_id) ON delete cascade
);

-- 팀 데이터 삽입
INSERT INTO Team (team_name, city) VALUES
('Lions', 'Seoul'),
('Tigers', 'Busan'),
('Bears', 'Incheon');

-- 선수 데이터 삽입 (참조 키 포함)
INSERT INTO Player (player_name, position, age, team_id) VALUES
('Kim Minsoo', 'Pitcher', 25, 1), -- Lions 팀 (team_id = 1)
('Lee Joon', 'Catcher', 28, 1),  -- Lions 팀
('Park Sungwoo', 'Batter', 30, 2), -- Tigers 팀 (team_id = 2)
('Choi Hyunwoo', 'Pitcher', 24, 3); -- Bears 팀 (team_id = 3)