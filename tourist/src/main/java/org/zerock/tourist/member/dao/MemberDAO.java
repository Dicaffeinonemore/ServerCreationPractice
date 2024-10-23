package org.zerock.tourist.member.dao;

import lombok.Cleanup;
import org.zerock.tourist.member.domain.MemberVO;
import org.zerock.tourist.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {

    public List<MemberVO> memberVOList() throws Exception{
        String sql = "SELECT * FROM member";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet rs = pstmt.executeQuery();
        List<MemberVO> memberList = new ArrayList<>();
        while(rs.next()){
            MemberVO member = MemberVO.builder()
                    .member_id(rs.getString("member_id"))
                    .member_pw(rs.getString("member_pw"))
                    .name(rs.getString("name"))
                    .phone(rs.getString("phone"))
                    .email1(rs.getString("email1"))
                    .email2(rs.getString("email2"))
                    .gender(rs.getString("gender"))
                    .agree(rs.getBoolean("agree"))
                    .create_date(rs.getDate("create_date"))
                    .build();
            memberList.add(member);
        }
        return memberList;
    }
    public void insertMember(MemberVO member) throws Exception{
        String sql = "INSERT INTO member(member_id ,member_pw, name, phone, email1, email2, gender, agree)" +
                "VALUES (?,?,?,?,?,?,?,?)";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, member.getMember_id());
        pstmt.setString(2, member.getMember_pw());
        pstmt.setString(3, member.getName());
        pstmt.setString(4, member.getPhone());
        pstmt.setString(5, member.getEmail1());
        pstmt.setString(6, member.getEmail2());
        pstmt.setString(7, member.getGender());
        pstmt.setBoolean(8, member.isAgree());
        pstmt.executeUpdate();

    }
    public MemberVO selectMember(String member_id, String member_pw) throws Exception{
        String sql = "SELECT member_id,member_pw FROM member WHERE member_id=? AND member_pw=?";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,member_id);
        pstmt.setString(2,member_pw);
        @Cleanup ResultSet rs = pstmt.executeQuery();
        rs.next();
            MemberVO member = MemberVO.builder()
                    .member_id(rs.getString("member_id"))
                    .member_pw(rs.getString("member_pw"))
                    .name(rs.getString("name"))
                    .phone(rs.getString("phone"))
                    .email1(rs.getString("email1"))
                    .email2(rs.getString("email2"))
                    .gender(rs.getString("gender"))
                    .agree(rs.getBoolean("agree"))

                    .build();
            return member;
    }

}
