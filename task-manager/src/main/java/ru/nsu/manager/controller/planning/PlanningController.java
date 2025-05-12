package ru.nsu.manager.controller.planning;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.manager.facade.TaskFacade;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PlanningController {

    private final TaskFacade taskFacade;

}
