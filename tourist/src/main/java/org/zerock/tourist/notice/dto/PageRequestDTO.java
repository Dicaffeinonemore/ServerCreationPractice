package org.zerock.tourist.notice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.util.Arrays;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {
    // 페이지 수
    @Builder.Default

    private int page = 1;
    // 한 페이지에 출력할 데이터의 수
    @Builder.Default

    private int size = 10;
    private String link;


    // 검색할 키워드
    private String keyword;

    private String[] types;

    private boolean finished;

    private LocalDate from;

    private LocalDate to;


    // LIMIT에서 사용할 값을 설정하는 메소드
    public int getSkip() {
        return (page - 1) * 10;
    }

    public String getLink() {
        if (link == null) {
            StringBuilder builder = new StringBuilder();
            builder.append("page=" + this.page);
            builder.append("&size=" + this.size);


            if (keyword != null) {
                try {
                    builder.append("&keyword=" + URLEncoder.encode(keyword, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }


            link = builder.toString();
        }
        return link;
    }


}
