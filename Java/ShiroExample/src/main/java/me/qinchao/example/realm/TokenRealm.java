package me.qinchao.example.realm;

import me.qinchao.example.token.ApiToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by sulvto on 2/12/19.
 */
public class TokenRealm extends AuthorizingRealm {

    public TokenRealm() {
        super();
        setName("ApiRealm");
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof TokenRealm;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        ApiToken token = (ApiToken) authenticationToken;
        return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Object availablePrincipal = super.getAvailablePrincipal(principalCollection);

        return null;
    }
}
