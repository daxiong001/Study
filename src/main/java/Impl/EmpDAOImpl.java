package Impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;




import java.sql.ResultSet;

import vo.Emp;
import dao.IEmpDAO;

public class EmpDAOImpl implements IEmpDAO {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	public EmpDAOImpl(Connection conn){
		this.conn=conn;
	}

	@Override
	public boolean doCreate(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		boolean flag=false;
		String sql="insert into emp values(?,?,?,?,?)";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, emp.getEmpno());
		this.pstmt.setString(2, emp.getEname());
		this.pstmt.setString(3, emp.getJob());
		this.pstmt.setDate(4,new java.sql.Date(emp.getHireDate().getTime()));
		this.pstmt.setFloat(5, emp.getSal());
		if (this.pstmt.executeUpdate()>0) {
			flag=true;
		}
		conn.close();
		return flag;
	}

	@Override
	public List<Emp> finAll(String keyWord) throws Exception {
		// TODO Auto-generated method stub
		List<Emp> all=new ArrayList<Emp>(null);
		String sql="select * from emp where ename like ? or job like ?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, "%"+keyWord+"%");
		this.pstmt.setString(2, "%"+keyWord+"%");
		ResultSet rs = this.pstmt.executeQuery();
		Emp emp = null;
		while (rs.next()) {
			emp=new Emp();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHireDate(rs.getDate(4));
			emp.setSal(rs.getFloat(5));
			all.add(emp);
		}
		this.pstmt.close();
		
		return all;
	}

	@Override
	public Emp findByid(int empno) throws Exception {
		// TODO Auto-generated method stub
		Emp emp=null;
		String sql = "select * from emp where empno= ?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, empno);
		ResultSet rs = this.pstmt.executeQuery();
		if (rs.next()) {
			emp = new Emp();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHireDate(rs.getDate(4));
			emp.setSal(rs.getFloat(5));
		}
		this.pstmt.close();
		return emp;
	}

}
