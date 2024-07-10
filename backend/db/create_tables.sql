CREATE TABLE IF NOT EXISTS s368310.app_users (
    id SERIAL,
    name VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS s368310.hit_checks (
    id SERIAL,
    user_id integer NOT NULL,
    x DOUBLE PRECISION NOT NULL,
    y DOUBLE PRECISION NOT NULL,
    r DOUBLE PRECISION NOT NULL,
    calling_date TIMESTAMP WITH TIME ZONE NOT NULL,
    execution_time BIGINT NOT NULL,
    hit_status BOOLEAN NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
            REFERENCES s368310.app_users(id)
);

CREATE TABLE IF NOT EXISTS s368310.restricted_refresh_tokens (
    id SERIAL,
    token VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS s368310.audited_methods (
    id SERIAL,
    user_id integer,
    method_signature VARCHAR,
    calling_date TIMESTAMP
);