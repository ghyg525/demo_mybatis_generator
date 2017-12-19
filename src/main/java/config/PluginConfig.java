package config;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * 插件配置
 * 自定义生成文件名称等
 * 此配置生效需要在pom中插件依赖中添加此项目依赖
 * @author YangJie 
 * @createTime 2017年12月18日 下午5:43:09
 */
public class PluginConfig extends PluginAdapter {

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
    	
    		// 把默认生成接口 xxxMapper.java 改名为xxxDao.java
        String old = introspectedTable.getMyBatis3JavaMapperType();
        old = old.replace("Mapper", "Dao");
        introspectedTable.setMyBatis3JavaMapperType(old);

        // 下面为自定义方法名
        old = introspectedTable.getSelectByPrimaryKeyStatementId();
        old = old.replace("PrimaryKey", "Id");
        introspectedTable.setSelectByPrimaryKeyStatementId(old);

        old = introspectedTable.getUpdateByPrimaryKeyStatementId();
        old = old.replace("PrimaryKey", "Id");
        introspectedTable.setUpdateByPrimaryKeyStatementId(old);

        old = introspectedTable.getDeleteByPrimaryKeyStatementId();
        old = old.replace("PrimaryKey", "Id");
        introspectedTable.setDeleteByPrimaryKeyStatementId(old);
        
        old = introspectedTable.getSelectAllStatementId();
        old = old.replace("PrimaryKey", "Id");
        introspectedTable.setSelectAllStatementId(old);
        
        old = introspectedTable.getUpdateByPrimaryKeySelectiveStatementId();
        old = old.replace("PrimaryKey", "Id");
        introspectedTable.setUpdateByPrimaryKeySelectiveStatementId(old);
        
    }

	public boolean validate(List<String> arg0) {
		return true;
	}

}
