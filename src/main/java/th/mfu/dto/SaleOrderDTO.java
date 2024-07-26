package th.mfu.dto;

import java.util.List;



import th.mfu.domain.Customer;
import th.mfu.domain.Product;

public class SaleOrderDTO {
 
    private Long id;
    private String notes;
    
  
    private Customer customer;


    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
