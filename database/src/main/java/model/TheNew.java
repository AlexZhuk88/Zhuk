package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(exclude = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "news", schema = "smay_db")
public class TheNew extends BaseEntity<Long> {

    private String newsname;

    private LocalDate date;

    private LocalTime time;

    private String discription;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User user;

}
