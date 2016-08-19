CREATE TABLE poke_type
(
  type_id serial NOT NULL,
  type_name character varying(255),
  CONSTRAINT poke_type_pkey PRIMARY KEY (type_id)
);

CREATE TABLE pokemon
(
  poke_id serial NOT NULL,
  height double precision NOT NULL,
  poke_name character varying(255),
  weight double precision NOT NULL,
  type_id integer,
  CONSTRAINT pokemon_pkey PRIMARY KEY (poke_id)
);