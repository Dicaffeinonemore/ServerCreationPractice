package org.zerock.tourist.notice.dao;

import lombok.Cleanup;
import org.zerock.tourist.notice.domain.NoticeVO;
import org.zerock.tourist.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NoticeDAO {
    public List<NoticeVO> selectNoticeList() throws Exception {
        String sql = "SELECT * FROM notice";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet rs = pstmt.executeQuery();
        List<NoticeVO> noticeVOList = new ArrayList<NoticeVO>();
        while(rs.next()){
            NoticeVO notice = NoticeVO.builder()
                    .tno(rs.getInt("tno"))
                    .title(rs.getString("title"))
                    .content(rs.getString("contents"))
                    .view(rs.getInt("view"))
                    .createDate(rs.getTimestamp("createDate").toLocalDateTime())
                    .build();
            noticeVOList.add(notice);
        }
        return noticeVOList;
    }
}
