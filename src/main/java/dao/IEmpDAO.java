package dao;

import java.util.List;

import vo.Emp;

/*
 * 定义dao接口方法时要将数据库的更新及查询操作分开执行
 * 数据库更新操作：操作以do方式开头
 * 数据库查询操作 ：操作以find或get方式开头
 */
public interface IEmpDAO {
	public boolean doCreate(Emp emp)throws Exception;
	public List<Emp> finAll(String keyWord)throws Exception;
	public Emp findByid(int empno)throws Exception;

}
