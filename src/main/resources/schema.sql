DROP TABLE IF EXISTS days_of_week;
CREATE TABLE days_of_week (name varchar(150) NOT NULL);
DROP TABLE IF EXISTS importances_of_todo;
CREATE TABLE importances_of_todo (name varchar(150) NOT NULL, level smallint NOT NULL);