package ru.nsu.manager.controller.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.manager.data.constants.Parameters;
import ru.nsu.manager.data.constants.Path;
import ru.nsu.manager.data.request.user.LoginRequest;
import ru.nsu.manager.data.request.user.RecoveryInitializationRequest;
import ru.nsu.manager.data.request.user.RegisterRequest;
import ru.nsu.manager.data.response.user.ConfirmationResponse;
import ru.nsu.manager.data.response.user.LoginResponse;
import ru.nsu.manager.data.response.user.RecoveryCompletionResponse;
import ru.nsu.manager.data.response.user.RecoveryInitializationResponse;
import ru.nsu.manager.data.response.user.RegisterResponse;
import ru.nsu.manager.facade.UserFacade;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserFacade userFacade;

    @PutMapping(value = Path.AUTH_REGISTER_ENDPOINT)
    public RegisterResponse register(@RequestBody RegisterRequest request) {
        log.info("register <- request: {}", request);

        return userFacade.register(request);
    }

    @GetMapping(value = Path.AUTH_CONFIRMATION_ENDPOINT)
    public ConfirmationResponse confirmation(@RequestParam(Parameters.PRINCIPAL_PARAM) String principal) {
        log.info("confirmation <- principal: {}", principal);

        return null;
    }

    @PostMapping(value = Path.AUTH_LOGIN_ENDPOINT)
    public LoginResponse login(@RequestBody LoginRequest request) {
        log.info("login <- request: {}", request);

        return userFacade.login(request);
    }

    @PostMapping(value = Path.AUTH_RECOVERY_INITIALIZATION_ENDPOINT)
    public RecoveryInitializationResponse recoveryInitialization(@RequestBody RecoveryInitializationRequest request) {
        log.info("recoveryInitialization <- request: {}", request);

        return userFacade.recoveryInitialization(request);
    }

    @GetMapping(value = Path.AUTH_RECOVERY_COMPLETION_ENDPOINT)
    public RecoveryCompletionResponse recoveryCompletion(@RequestParam(Parameters.PRINCIPAL_PARAM) String principal) {
        log.info("recoveryCompletion <- principal: {}", principal);

        return null;
    }

}
