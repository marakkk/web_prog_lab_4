package com.marakobz.lab4.repository;

import com.marakobz.lab4.jooq.Tables;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RefreshTokenRepositoryImpl implements RefreshTokenRepository {

    private final DSLContext dsl;

    @Autowired
    public RefreshTokenRepositoryImpl(DSLContext dsl) {
        this.dsl = dsl;
    }

    @Override
    public boolean existByToken(String token) {
        return dsl.fetchExists(
                dsl.selectFrom(Tables.RESTRICTED_REFRESH_TOKENS)
                        .where(Tables.RESTRICTED_REFRESH_TOKENS.TOKEN.eq(token)));
    }

    @Override
    public Integer save(String token) {
        return dsl.insertInto(Tables.RESTRICTED_REFRESH_TOKENS)
                .set(Tables.RESTRICTED_REFRESH_TOKENS.TOKEN, token)
                .returning(Tables.RESTRICTED_REFRESH_TOKENS.ID)
                .fetchOptional()
                .orElseThrow(() -> new DataAccessException("Error inserting refresh token"))
                .get(Tables.RESTRICTED_REFRESH_TOKENS.ID);
    }
}