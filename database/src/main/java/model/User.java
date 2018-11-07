package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "user", schema = "smay_db")
public class User extends BaseEntity<Long> {

    private String username;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private Set<TheNew> setNews = new HashSet<>();

}
