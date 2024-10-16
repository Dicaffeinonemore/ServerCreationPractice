package org.zerock.springex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {
    // 페이지 수
    @Builder.Default
    @Min(value = 1)
    @Positive
    private int page = 1;
    // 한 페이지에 출력할 데이터의 수
    @Builder.Default
    @Min(value = 10)
    @Max(value = 100)
    @Positive
    private int size = 10;
    private String link;
    // LIMIT에서 사용할 값을 설정하는 메소드
    public int getSkip(){
        return (page-1) * 10;
    }
    public String getLink(){
        if(link == null){
            StringBuilder builder = new StringBuilder();
            builder.append("page=" + this.page);
            builder.append("&size=" + this.size);
            link = builder.toString();
        }
        return link;
    }
}
