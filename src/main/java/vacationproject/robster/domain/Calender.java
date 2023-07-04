package vacationproject.robster.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Calenders")
@NoArgsConstructor
@Getter
@Entity
public class Calender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cId")
    private Long cId;

    @Column(name = "day_start")
    private String day_start;

    @Column(name = "day_end")
    private String day_end;

    @Column(name = "contents")
    private String contents;

    @Column(name = "calender_owner")
    private String calenderOwner;

    @Builder
    public Calender(String day_start, String day_end, String contents, String calenderOwner) {
        this.day_start = day_start;
        this.day_end = day_end;
        this.contents = contents;
        this.calenderOwner = calenderOwner;
    }
}

