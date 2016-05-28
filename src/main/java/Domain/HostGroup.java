package Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class HostGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer hostGroupId;
    String name;
    String comment;
}
