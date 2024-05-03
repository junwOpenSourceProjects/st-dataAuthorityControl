package wo1261931780.stdataAuthorityControl.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List; /**
 * Created by Intellij IDEA.
 * Project:st-dataAuthorityControl
 * Package:wo1261931780.stdataAuthorityControl.config
 *
 * @author liujiajun_junw
 * @Date 2024-05-22-20  星期五
 * @Description 如果你项目之前是依赖包依赖，或有公司内部统一拦截设置好，也可以往MybatisPlusInterceptor进行插入，避免影响原有项目配置
 */
// @Bean
// public MyDataPermissionInterceptor myInterceptor(MybatisPlusInterceptor mybatisPlusInterceptor) {
// 	MyDataPermissionInterceptor sql = new MyDataPermissionInterceptor();
// 	sql.setDataPermissionHandler(new MyDataPermissionHandler());
// 	List<InnerInterceptor> list = new ArrayList<>();
// 	// 添加数据权限插件
// 	list.add(sql);
// 	// 分页插件
// 	mybatisPlusInterceptor.setInterceptors(list);
// 	list.add(new PaginationInnerInterceptor(DbType.MYSQL));
// 	return sql;
// }
