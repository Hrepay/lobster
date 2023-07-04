package vacationproject.robster.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Members")
@NoArgsConstructor
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mId")
    private Long mId;

    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "color")
    private String color;

    @Builder
    public Member(Long groupId, Long userId, String color) {
        this.groupId = groupId;
        this.userId = userId;
        this.color = color;
    }
}
