package SystemDesign.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "screen")
public class Screen extends BaseModel {

    @OneToMany
    @JoinColumn(name = "screenId")
    private List<Seat>seats ;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features ;

    @ManyToOne
    private Theatre theatre ;
}
