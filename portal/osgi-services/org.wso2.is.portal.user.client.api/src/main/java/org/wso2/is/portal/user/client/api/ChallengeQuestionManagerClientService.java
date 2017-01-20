package org.wso2.is.portal.user.client.api;

import org.wso2.carbon.identity.recovery.model.ChallengeQuestion;
import org.wso2.is.portal.user.client.api.exception.UserPortalUIException;

import java.util.List;

/**
 * Service with operations related to challenge question management.
 */
public interface ChallengeQuestionManagerClientService {

    List<ChallengeQuestion> getChallengeQuestionList() throws UserPortalUIException;

    List<ChallengeQuestion> getAllChallengeQuestionsForUser(String userUniqueId)
            throws UserPortalUIException;
}
