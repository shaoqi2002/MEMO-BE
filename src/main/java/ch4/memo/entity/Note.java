package ch4.memo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Note {
    private int id;
    private java.time.LocalDateTime time;
    private String content;
}
