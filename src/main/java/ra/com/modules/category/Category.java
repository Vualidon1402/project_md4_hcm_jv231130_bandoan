package ra.com.modules.category;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Boolean isDeleted;
//    @OneToMany(mappedBy = "category") // bn nghịch đao
//    private List<Product> products;
}

