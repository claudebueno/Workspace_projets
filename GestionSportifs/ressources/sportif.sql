/* Création de la base */

CREATE TYPE sexe AS ENUM ('homme','femme');

CREATE TYPE adresse AS (
	numero smallint,
	voie character varying(255),
	codepostal int,
	ville character varying(255)
);

CREATE TABLE tp1.utilisateurs (
	id SERIAL NOT NULL,
	nom character varying(255),
	prenom character varying(255),
	adresse adresse,
	sexe sexe,
	CONSTRAINT utilisateurs_pkey PRIMARY KEY (id)
);

CREATE TABLE tp1.administrateurs(
	login character varying(255),
	password character varying(255)
) INHERITS (tp1.utilisateurs);

CREATE TABLE tp1.sportifs (
	sports character varying(255)
) INHERITS (tp1.utilisateurs);

/* Tests */

CREATE TYPE sport_type AS (
	id int,
	nom character varying(255)
)

CREATE TABLE tp1.sportifs (
	sports character varying(255)[8]
) INHERITS (tp1.utilisateurs);

CREATE TABLE tp1.sportifs (
	sports REF sport_type
) INHERITS (tp1.utilisateurs);