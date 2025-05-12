package ru.nsu.manager.controller.task;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.manager.facade.TaskFacade;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskFacade taskFacade;

}
