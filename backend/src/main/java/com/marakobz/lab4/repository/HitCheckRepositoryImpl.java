package com.marakobz.lab4.repository;

import com.marakobz.lab4.jooq.Tables;
import com.marakobz.lab4.domain.HitCheck;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HitCheckRepositoryImpl implements HitCheckRepository {

    private final DSLContext dsl;
    private final HitChecksRecordAdapter hitChecksRecordAdapter;

    @Autowired
    public HitCheckRepositoryImpl(DSLContext context, HitChecksRecordAdapter hitChecksRecordAdapter) {
        this.dsl = context;
        this.hitChecksRecordAdapter = hitChecksRecordAdapter;
    }

    @Override
    public List<HitCheck> findAllByUserId(Integer userId) {
        return dsl.selectFrom(Tables.HIT_CHECKS)
                .where(Tables.HIT_CHECKS.USER_ID.eq(userId))
                .fetch(hitChecksRecordAdapter);
    }

    @Override
    public List<HitCheck> findAllByUserIdAndRadius(Integer userId, Double radius) {
        return dsl.selectFrom(Tables.HIT_CHECKS)
                .where(Tables.HIT_CHECKS.USER_ID.eq(userId).and(Tables.HIT_CHECKS.R.eq(radius)))
                .fetch(hitChecksRecordAdapter);
    }

    @Override
    public Integer save(HitCheck hitCheck) {
        return dsl.insertInto(Tables.HIT_CHECKS)
                .set(hitChecksRecordAdapter.unmap(hitCheck))
                .returning(Tables.HIT_CHECKS.ID)
                .fetchOptional()
                .orElseThrow(() -> new DataAccessException("Error inserting hit check"))
                .get(Tables.HIT_CHECKS.ID);
    }

    @Override
    public void deleteAllByUserId(Integer userId) {
        dsl.delete(Tables.HIT_CHECKS)
                .where(Tables.HIT_CHECKS.USER_ID.eq(userId))
                .execute();
    }
}
