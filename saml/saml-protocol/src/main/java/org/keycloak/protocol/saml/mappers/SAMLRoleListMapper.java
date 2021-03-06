package org.keycloak.protocol.saml.mappers;

import org.keycloak.models.ClientSessionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.ProtocolMapperModel;
import org.keycloak.models.UserSessionModel;
import org.picketlink.identity.federation.saml.v2.assertion.AttributeStatementType;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface SAMLRoleListMapper {

    void mapRoles(AttributeStatementType roleAttributeStatement, ProtocolMapperModel mappingModel, KeycloakSession session,
                                     UserSessionModel userSession, ClientSessionModel clientSession);
}
