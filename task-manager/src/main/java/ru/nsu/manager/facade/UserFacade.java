package ru.nsu.manager.facade;

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

public interface UserFacade {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    ConfirmationResponse confirmation(ConfirmationRequest request);

    RecoveryInitializationResponse recoveryInitialization(RecoveryInitializationRequest request);

    RecoveryCompletionResponse recoveryCompletion(RecoveryCompletionRequest request);



    ChangeEmailResponse changeEmail(ChangeEmailRequest request);

    ChangePasswordResponse changePassword(ChangePasswordRequest request);

}
