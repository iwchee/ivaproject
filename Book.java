import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Book.java
@Entity
public class Book {
    private String title;
    private String author;
    @Id
    private Long id;

    public Book(String title) {
        this.title = title;
    }

    public Book() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    // other fields, getters, setters
}

