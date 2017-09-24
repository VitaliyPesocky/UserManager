DROP SEQUENCE IF EXISTS users_global_sequence;
DROP TABLE IF EXISTS users;

CREATE SEQUENCE users_global_sequence START 1000;
CREATE TABLE users (
  id          INTEGER PRIMARY KEY DEFAULT nextval('users_global_sequence'),
  name        VARCHAR NOT NULL,
  age         INTEGER,
  createdDate TIMESTAMP           DEFAULT now(),
  isAdmin     BOOLEAN             DEFAULT TRUE
)
