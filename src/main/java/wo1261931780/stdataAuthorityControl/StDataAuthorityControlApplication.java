package wo1261931780.stdataAuthorityControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StDataAuthorityControlApplication {
	// 根据当前用户的角色，只能查看数据权限范围的数据需求。
	// 列表实现方案有两种，一是在开发初期就做好判断赛选，但如果这个需求是中途加的，或不希望每个接口都加一遍，就可以方案二加拦截器的方式。
	// 在mybatis执行sql前修改语句，限定where范围。
	//
	// 当然拦截器生效后是全局性的，如何保证只对需要的接口进行拦截和转化，就可以应用注解进行识别
	public static void main(String[] args) {
		SpringApplication.run(StDataAuthorityControlApplication.class, args);
	}

}
