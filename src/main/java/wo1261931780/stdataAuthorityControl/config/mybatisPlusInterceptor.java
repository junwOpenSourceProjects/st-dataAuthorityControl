package wo1261931780.stdataAuthorityControl.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean; /**
 * Created by Intellij IDEA.
 * Project:st-dataAuthorityControl
 * Package:wo1261931780.stdataAuthorityControl.config
 *
 * @author liujiajun_junw
 * @Date 2024-05-22-32  星期五
 * @Description 将拦截器加到MyBatis-Plus插件中
 */
@Bean
public MybatisPlusInterceptor mybatisPlusInterceptor() {
	MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
	// 添加数据权限插件
	MyDataPermissionInterceptor dataPermissionInterceptor = new MyDataPermissionInterceptor();
	// 添加自定义的数据权限处理器
	dataPermissionInterceptor.setDataPermissionHandler(new MyDataPermissionHandler());
	interceptor.addInnerInterceptor(dataPermissionInterceptor);
	interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
	return interceptor;
}
