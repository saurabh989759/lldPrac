package SystemDesign.BookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;

@Getter
@Setter
@Entity(name = "movies")
public class Movie extends BaseModel {
    private String movie ;
    private double rating;
}
