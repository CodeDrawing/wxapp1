package top.cfphone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author zx
 * @Date 2020/9/16 15:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommitInfo {
    String name;
    String number;
    String price;
    String phone;
    String address;
}
