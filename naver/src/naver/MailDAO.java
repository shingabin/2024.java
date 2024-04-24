package naver;

import kr.ac.kopo.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MailDAO {
    ConnectionFactory DBConn = new ConnectionFactory();

    public int insertMail(MailDTO dto) {

        int result = 0;

        Connection conn = new ConnectionFactory().getConnection();
        PreparedStatement pstmt = null;
        String sql;

        try {
            sql = "SELECT NVL(MAX(MAIL_ID), 0) + 1 FROM NAVERMAIL";

            pstmt = conn.prepareStatement(sql);

            //max int 값 리턴한다.
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            int mailId = rs.getInt(1);

            sql = "insert into naverMail (mail_id, sendId, receiveId, title, contents, read, del_yn) ";
            sql += "values (?,?,?,?,?,'N','N')";

            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, mailId);
            pstmt.setString(2, dto.getSendId());
            pstmt.setString(3, dto.getReceiveId());
            pstmt.setString(4, dto.getTitle());
            pstmt.setString(5, dto.getContents());

            result = pstmt.executeUpdate();

            pstmt.close();


        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return result;
    }

    public int updateDelMail(int mailId) {

        int result = 0;

        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        String sql;

        try {
            sql = "update naverMail set del_yn='Y' ";
            sql += "where mail_id=?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, mailId);

            result = pstmt.executeUpdate();

            pstmt.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return result;
    }

    public int updateDelCancelMail(MailDTO dto) {

        int result = 0;

        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        String sql;

        try {
            sql = "update naverMail set del_yn='N' ";
            sql += "where mail_id=?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, dto.getMailId());

            result = pstmt.executeUpdate();

            pstmt.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return result;
    }

    //3.delete

    public int deleteDate(int id) {

        int result = 0;

        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        String sql;

        try {
            sql = "delete naverMail where mail_id=? ";

            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return result;

    }

    //4.selectAll

    public List<MailDTO> getList(String id, String type, String delYn) {

        List<MailDTO> lists = new ArrayList<MailDTO>();
        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql;

        try {
            sql = "select mail_id, sendId, receiveId, title, contents, read, del_yn, send_Date ";
            sql += " from naverMail";
            sql += " where " + type + "ID=? and del_yn='" + delYn + "'";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, id);

            rs = pstmt.executeQuery();

            while (rs.next()) {

                MailDTO dto = new MailDTO();

                dto.setMailId(rs.getInt("mail_id"));
                dto.setSendId(rs.getString("sendId"));
                dto.setReceiveId(rs.getString("receiveId"));
                dto.setTitle(rs.getString("title"));
                dto.setContents(rs.getString("contents"));
                dto.setRead(rs.getString("read"));
                dto.setDelYn(rs.getString("del_yn"));
                dto.setSendDate(rs.getDate("send_Date"));

                lists.add(dto);
            }

            rs.close();
            pstmt.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return lists;

    }


    public MailDTO getMail(int mailId) {

        MailDTO dto = new MailDTO();

        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql;

        try {
            sql = "select mail_id, sendId, receiveId, title, contents, read, del_yn, send_Date ";
            sql += " from naverMail";
            sql += " where mail_id=?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, mailId);

            rs = pstmt.executeQuery();

            if (rs.next()) {

                dto.setMailId(rs.getInt("mail_id"));
                dto.setSendId(rs.getString("sendId"));
                dto.setReceiveId(rs.getString("receiveId"));
                dto.setTitle(rs.getString("title"));
                dto.setContents(rs.getString("contents"));
                dto.setRead(rs.getString("read"));
                dto.setDelYn(rs.getString("del_yn"));
                dto.setSendDate(rs.getDate("send_Date"));

            }

            //mail read update
            sql = "update naverMail set read='Y' ";
            sql += "where mail_id=?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, mailId);

            pstmt.executeUpdate();

            rs.close();
            pstmt.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return dto;
    }

    public int recoverDelMail(int mailId) {

        int result = 0;

        Connection conn = DBConn.getConnection();
        PreparedStatement pstmt = null;
        String sql;

        try {
            sql = "update naverMail set del_yn='N' ";
            sql += "where mail_id=?";

            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, mailId);

            result = pstmt.executeUpdate();

            pstmt.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return result;
    } 
}