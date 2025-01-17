/*
 * This file is generated by jOOQ.
 */
package com.marakobz.lab4.jooq.tables.records;


import com.marakobz.lab4.jooq.tables.HitChecks;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HitChecksRecord extends UpdatableRecordImpl<HitChecksRecord> implements Record8<Integer, Integer, Double, Double, Double, OffsetDateTime, Long, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.hit_checks.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.hit_checks.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.hit_checks.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.hit_checks.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.hit_checks.x</code>.
     */
    public void setX(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.hit_checks.x</code>.
     */
    public Double getX() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.hit_checks.y</code>.
     */
    public void setY(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.hit_checks.y</code>.
     */
    public Double getY() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.hit_checks.r</code>.
     */
    public void setR(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.hit_checks.r</code>.
     */
    public Double getR() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.hit_checks.calling_date</code>.
     */
    public void setCallingDate(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.hit_checks.calling_date</code>.
     */
    public OffsetDateTime getCallingDate() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>public.hit_checks.execution_time</code>.
     */
    public void setExecutionTime(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.hit_checks.execution_time</code>.
     */
    public Long getExecutionTime() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>public.hit_checks.hit_status</code>.
     */
    public void setHitStatus(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.hit_checks.hit_status</code>.
     */
    public Boolean getHitStatus() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Double, Double, Double, OffsetDateTime, Long, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Double, Double, Double, OffsetDateTime, Long, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return HitChecks.HIT_CHECKS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return HitChecks.HIT_CHECKS.USER_ID;
    }

    @Override
    public Field<Double> field3() {
        return HitChecks.HIT_CHECKS.X;
    }

    @Override
    public Field<Double> field4() {
        return HitChecks.HIT_CHECKS.Y;
    }

    @Override
    public Field<Double> field5() {
        return HitChecks.HIT_CHECKS.R;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return HitChecks.HIT_CHECKS.CALLING_DATE;
    }

    @Override
    public Field<Long> field7() {
        return HitChecks.HIT_CHECKS.EXECUTION_TIME;
    }

    @Override
    public Field<Boolean> field8() {
        return HitChecks.HIT_CHECKS.HIT_STATUS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUserId();
    }

    @Override
    public Double component3() {
        return getX();
    }

    @Override
    public Double component4() {
        return getY();
    }

    @Override
    public Double component5() {
        return getR();
    }

    @Override
    public OffsetDateTime component6() {
        return getCallingDate();
    }

    @Override
    public Long component7() {
        return getExecutionTime();
    }

    @Override
    public Boolean component8() {
        return getHitStatus();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUserId();
    }

    @Override
    public Double value3() {
        return getX();
    }

    @Override
    public Double value4() {
        return getY();
    }

    @Override
    public Double value5() {
        return getR();
    }

    @Override
    public OffsetDateTime value6() {
        return getCallingDate();
    }

    @Override
    public Long value7() {
        return getExecutionTime();
    }

    @Override
    public Boolean value8() {
        return getHitStatus();
    }

    @Override
    public HitChecksRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HitChecksRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public HitChecksRecord value3(Double value) {
        setX(value);
        return this;
    }

    @Override
    public HitChecksRecord value4(Double value) {
        setY(value);
        return this;
    }

    @Override
    public HitChecksRecord value5(Double value) {
        setR(value);
        return this;
    }

    @Override
    public HitChecksRecord value6(OffsetDateTime value) {
        setCallingDate(value);
        return this;
    }

    @Override
    public HitChecksRecord value7(Long value) {
        setExecutionTime(value);
        return this;
    }

    @Override
    public HitChecksRecord value8(Boolean value) {
        setHitStatus(value);
        return this;
    }

    @Override
    public HitChecksRecord values(Integer value1, Integer value2, Double value3, Double value4, Double value5, OffsetDateTime value6, Long value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HitChecksRecord
     */
    public HitChecksRecord() {
        super(HitChecks.HIT_CHECKS);
    }

    /**
     * Create a detached, initialised HitChecksRecord
     */
    public HitChecksRecord(Integer id, Integer userId, Double x, Double y, Double r, OffsetDateTime callingDate, Long executionTime, Boolean hitStatus) {
        super(HitChecks.HIT_CHECKS);

        setId(id);
        setUserId(userId);
        setX(x);
        setY(y);
        setR(r);
        setCallingDate(callingDate);
        setExecutionTime(executionTime);
        setHitStatus(hitStatus);
    }
}
