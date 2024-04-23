package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class PrnEmpSalaryHW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޿��� �Է��Ͻÿ� : ");
		String sal = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			String sql = "select m2.job_title, avg(m1.salary) as avgsal "
					+" from employees m1 join jobs m2 on m1.job_id = m2.job_id "
					+" where m1.salary >= to_number(?) "
					+"	group by m2.job_title "
					+" order by avgsal desc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sal);
			
			int cnt = pstmt.executeUpdate();
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String job_title = rs.getString("JOB_title");
				String avgsal = rs.getString("avgsal");
				System.out.println("[" + job_title + "] " + avgsal); 
			}
			System.out.println("�� [" + cnt + "]���� �˻��Ǿ����ϴ�");
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
}