package top.cfphone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author zx
 * @Date 2020/9/7 11:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PhoneInfo {
    private Integer id;
    private String image;
    private String model;
    private String price;
    private String pingPai;
    private String isOrNot;
    private String allModel;
    private String isCount;
    private String priceA;
    private String priceB;
    private String priceC;
    private String priceD;
    private String priceE;
    private String priceF;
    private String text;
}
