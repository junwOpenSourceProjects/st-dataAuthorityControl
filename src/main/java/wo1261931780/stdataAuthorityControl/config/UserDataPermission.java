package wo1261931780.stdataAuthorityControl.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Intellij IDEA.
 * Project:st-dataAuthorityControl
 * Package:wo1261931780.stdataAuthorityControl.config
 *
 * @author liujiajun_junw
 * @Date 2024-05-16-41  星期五
 * @Description
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserDataPermission {
	// 自定义注解，用于标识需要用户权限的接口
}
