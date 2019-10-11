package com.imooc.security.core.properties;

import lombok.Data;

/**
 * 与Browser相关的配置类
 *
 * @author Walker_Don
 * @version V1.0
 * @ClassName BrowserProperties
 * @date 2019年10月10日 下午 3:56
 */
@Data
public class BrowserProperties {
    //默认的登陆页面
    private String loginPage = "/imooc-signIn.html";
    private LoginType loginType = LoginType.JSON;
}
