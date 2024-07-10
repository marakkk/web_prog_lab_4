package com.marakobz.lab4.service;

import com.marakobz.lab4.repository.HitCheckRepository;
import com.marakobz.lab4.audited.Audited;
import com.marakobz.lab4.controller.dto.HitCheckDTO;
import com.marakobz.lab4.domain.HitCheck;
import com.marakobz.lab4.service.command.CheckAndSaveDotCommand;
import com.marakobz.lab4.service.command.GetDotsForUserCommand;
import com.marakobz.lab4.service.converter.HitCheckConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HitCheckServiceImpl implements HitCheckService {

    private final HitCheckRepository hitCheckRepository;
    private final AreaChecker areaChecker;

    private final HitCheckConverter hitCheckConverter;

    @Autowired
    public HitCheckServiceImpl(AreaChecker areaChecker, HitCheckRepository hitCheckRepository,
                               HitCheckConverter hitCheckConverter) {
        this.areaChecker = areaChecker;
        this.hitCheckRepository = hitCheckRepository;
        this.hitCheckConverter = hitCheckConverter;
    }

    @Audited
    @Override
    public List<HitCheckDTO> getDotsForUser(GetDotsForUserCommand getDotsForUserCommand) {
        List<HitCheck> hitChecks;
        if (getDotsForUserCommand.getRadius() == null) {
            hitChecks = hitCheckRepository.findAllByUserId(getDotsForUserCommand.getUserId());
        } else {
            hitChecks = hitCheckRepository.findAllByUserIdAndRadius(getDotsForUserCommand.getUserId(),
                    getDotsForUserCommand.getRadius());
        }

        return hitChecks.stream().map(hitCheckConverter::unmap).collect(Collectors.toList());
    }

    @Override
    public void checkAndSaveHitCheck(CheckAndSaveDotCommand checkAndSaveDotCommand) {
        HitCheck hitCheck = hitCheckConverter.map(
                checkAndSaveDotCommand.getHitCheck());

        hitCheck.setUserId(checkAndSaveDotCommand.getUserId());
        hitCheck.setCallingDate(Instant.now());
        hitCheck.setHitStatus(areaChecker.checkIfInArea(hitCheck));
        hitCheck.setExecutionTime((long) Instant.now().getNano() - hitCheck.getCallingDate().getNano());

        hitCheckRepository.save(hitCheck);
    }

    @Override
    public void deleteAllHitChecksByUser(Integer userId) {
        hitCheckRepository.deleteAllByUserId(userId);
    }

}
