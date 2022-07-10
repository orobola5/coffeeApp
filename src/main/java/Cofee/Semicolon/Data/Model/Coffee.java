package Cofee.Semicolon.Data.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coffee {
    @Id
    private String id;
    private String name;
    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
        }

        @javax.persistence.Id
        public String getId() {

        return id;
        }
    }
