package ru.saltanov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.saltanov.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
