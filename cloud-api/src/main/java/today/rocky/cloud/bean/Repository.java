package today.rocky.cloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 18:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repository implements Serializable {

    private static final long serialVersionUID = -9091211710013738258L;
    private Long id;
    private Long productId;
    private Long total;
    private Integer used;
    private Integer residue;
}
