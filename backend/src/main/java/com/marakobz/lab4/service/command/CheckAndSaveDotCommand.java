package com.marakobz.lab4.service.command;

import com.marakobz.lab4.controller.dto.HitCheckDTO;
import lombok.Value;

@Value
public class CheckAndSaveDotCommand {
    HitCheckDTO hitCheck;
    Integer userId;
}
