package org.zerock.w2.dto;

import java.time.LocalDateTime;
import java.util.List;

public class BoardReadDTO {

    private Long bno;
    private String title;
    private String writer;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

    private List<String> fileNames;
}
