package ru.nsu.manager.controller.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.manager.data.constants.Path;
import ru.nsu.manager.data.request.user.ChangeEmailRequest;
import ru.nsu.manager.data.request.user.ChangePasswordRequest;
import ru.nsu.manager.data.response.user.ChangeEmailResponse;
import ru.nsu.manager.data.response.user.ChangePasswordResponse;
import ru.nsu.manager.data.response.user.ProfileInfoResponse;
import ru.nsu.manager.facade.UserFacade;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProfileController {

    private final UserFacade userFacade;

    @GetMapping(value = Path.PROFILE_INFO_ENDPOINT)
    public ProfileInfoResponse fetchProfileInfo() {
        log.info("fetchProfileInfo <- ");

        return null;
    }

    @PatchMapping(value = Path.PROFILE_CHANGE_EMAIL_ENDPOINT)
    public ChangeEmailResponse changeEmail(@RequestBody ChangeEmailRequest request) {
        log.info("changeEmail <- request: {}", request);

        return userFacade.changeEmail(request);
    }

    @PatchMapping(value = Path.PROFILE_CHANGE_PASSWORD_ENDPOINT)
    public ChangePasswordResponse changePassword(@RequestBody ChangePasswordRequest request) {
        log.info("changePassword <- request: {}", request);

        return userFacade.changePassword(request);
    }

}
