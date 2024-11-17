package entitie;

import com.example.billingservice.Model.Customer;
import com.example.billingservice.Model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity @NoArgsConstructor @AllArgsConstructor
@Builder
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billDate;
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItemList =new ArrayList();
    @Transient
    private Customer customer;
    @Transient
    private Product product ;

}
