package SystemDesign.BookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "theatres")
public class Theatre extends BaseModel{

    private String name;
    private String address ;

}
