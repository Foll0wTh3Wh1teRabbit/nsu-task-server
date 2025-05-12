package ru.nsu.manager.facade;

import ru.nsu.common.annotation.Facade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ru.nsu.manager.data.request.user.ChangeEmailRequest;
import ru.nsu.manager.data.request.user.ChangePasswordRequest;
import ru.nsu.manager.data.request.user.ConfirmationRequest;
import ru.nsu.manager.data.request.user.LoginRequest;
import ru.nsu.manager.data.request.user.RecoveryCompletionRequest;
import ru.nsu.manager.data.request.user.RecoveryInitializationRequest;
import ru.nsu.manager.data.request.user.RegisterRequest;
import ru.nsu.manager.data.response.user.ChangeEmailResponse;
import ru.nsu.manager.data.response.user.ChangePasswordResponse;
import ru.nsu.manager.data.response.user.ConfirmationResponse;
import ru.nsu.manager.data.response.user.LoginResponse;
import ru.nsu.manager.data.response.user.RecoveryCompletionResponse;
import ru.nsu.manager.data.response.user.RecoveryInitializationResponse;
import ru.nsu.manager.data.response.user.RegisterResponse;
import ru.nsu.manager.service.user.AuthService;
import ru.nsu.manager.service.user.ProfileService;

@Slf4j
@Facade
@RequiredArgsConstructor
public class UserFacadeImpl implements UserFacade {

    private final AuthService authService;

    private final ProfileService profileService;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        return null;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }

    @Override
    public ConfirmationResponse confirmation(ConfirmationRequest request) {
        return null;
    }

    @Override
    public RecoveryInitializationResponse recoveryInitialization(RecoveryInitializationRequest request) {
        return null;
    }

    @Override
    public RecoveryCompletionResponse recoveryCompletion(RecoveryCompletionRequest request) {
        return null;
    }

    @Override
    public ChangeEmailResponse changeEmail(ChangeEmailRequest request) {
        return null;
    }

    @Override
    public ChangePasswordResponse changePassword(ChangePasswordRequest request) {
        return null;
    }

}
