package Models;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class orderModel {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTiTY)

    private Long id;
    private String nameC;
    private String code;
    private String size;
    private String milk;
    private double nameCm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.name = nameC;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public double getNameCm() {
        return nameCm;
    }

    public void setnameCm(double nameCm) {
        this.nameCm = nameCm;
    }
}