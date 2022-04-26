package ma.emsi.patientsmvc.sec.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppRole {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long roleId;
    @Column(unique = true)
    private String roleName;
    private String description;
}