package ru.nsu.manager.data.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Path {

    public final String ACTUATOR = "/actuator/**";


    public final String AUTH = "/auth";

    public final String AUTH_REGISTER_ENDPOINT = AUTH + "/register";

    public final String AUTH_CONFIRMATION_ENDPOINT = AUTH + "/confirmation";

    public final String AUTH_LOGIN_ENDPOINT = AUTH + "/login";

    public final String AUTH_RECOVERY_INITIALIZATION_ENDPOINT = AUTH + "/recovery/initialization";

    public final String AUTH_RECOVERY_COMPLETION_ENDPOINT = AUTH + "/recovery/completion";


    public final String PROFILE = "/profile";

    public final String PROFILE_INFO_ENDPOINT = PROFILE + "/info";

    public final String PROFILE_CHANGE_EMAIL_ENDPOINT = PROFILE + "/change/email";

    public final String PROFILE_CHANGE_PASSWORD_ENDPOINT = PROFILE + "/change/password";


    public final String PROJECT = "/project";

    public final String PROJECT_FETCH_ENDPOINT = PROJECT + "/fetch";

    public final String PROJECT_CREATE_ENDPOINT = PROJECT + "/create";

    public final String PROJECT_UPDATE_ENDPOINT = PROJECT + "/update";

    public final String PROJECT_DELETE_ENDPOINT = PROJECT + "/delete";


    public final String TASK = "/task";

    public final String TASK_CREATE_ENDPOINT = TASK + "/create";

    public final String TASK_UPDATE_ENDPOINT = TASK + "/update";

    public final String TASK_DELETE_ENDPOINT = TASK + "/delete";


    public final String PLANNING = "/planning";



}
