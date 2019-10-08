
### Shiro 配置
Filter Chain定义说明：
1. 一个URL可以配置多个Filter，使用逗号分隔
2. 当设置多个过滤器时，全部验证通过，才视为通过
3. 部分过滤器可指定参数，如perms，roles

Shiro内置的FilterChain

| Filter Name | Class |
|   ---   | ---   |
| anon	| org.apache.shiro.web.filter.authc.AnonymousFilter |
| authc	| org.apache.shiro.web.filter.authc.FormAuthenticationFilter |
| authcBasic	| org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter |
| perms	| org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter |
| port	| org.apache.shiro.web.filter.authz.PortFilter |
| rest	| org.apache.shiro.web.filter.authz.HttpMethodPermissionFilter |
| roles	| org.apache.shiro.web.filter.authz.RolesAuthorizationFilter |
| ssl	| org.apache.shiro.web.filter.authz.SslFilter |
| user	| org.apache.shiro.web.filter.authc.UserFilter |

- anon: 所有url都可以匿名访问
- authc: 需要认证才能进行访问
- user: 配置记住我或认证通过可以访问