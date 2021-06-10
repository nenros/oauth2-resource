package pl.bmarkowski.traintable.train;

import com.vladmihalcea.hibernate.type.array.DecimalArrayType;
import lombok.Getter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "train")
@Entity
@Getter
@TypeDefs({
        @TypeDef(name = "decimal-array", typeClass = DecimalArrayType.class)
})
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UUIDGenerator")
    private UUID id;

    private String name;

    private String destination;

    private Double speed;

    @Type(type = "decimal-array")
    @Column(
            columnDefinition = "decimal[2]"
    )
    private double[] coordinates;
}
