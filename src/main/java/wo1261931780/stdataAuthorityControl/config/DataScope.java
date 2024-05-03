package wo1261931780.stdataAuthorityControl.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Intellij IDEA.
 * Project:st-dataAuthorityControl
 * Package:wo1261931780.stdataAuthorityControl.config
 *
 * @author liujiajun_junw
 * @Date 2024-05-22-23  星期五
 * @Description
 */
@AllArgsConstructor
@Getter
public enum DataScope {
	// Scope 数据权限范围 ：ALL（全部）、DEPT（部门）、MYSELF（自己）
	ALL("ALL"),
	DEPT("DEPT"),
	MYSELF("MYSELF");
	private String name;
}
