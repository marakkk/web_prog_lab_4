package com.marakobz.lab4.repository;


import com.marakobz.lab4.domain.HitCheck;

import java.util.List;

public interface HitCheckRepository {

    List<HitCheck> findAllByUserId(Integer userId);
    List<HitCheck> findAllByUserIdAndRadius(Integer userId, Double radius);
    Integer save(HitCheck hitCheck);
    void deleteAllByUserId(Integer userId);

}
