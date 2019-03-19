package cc.ryanc.halo.model.params;

import cc.ryanc.halo.model.dto.base.InputConverter;
import cc.ryanc.halo.model.entity.Option;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Optiona param.
 *
 * @author johnniang
 * @date 3/20/19
 */
@Data
public class OptionParam implements InputConverter<Option> {

    @NotBlank(message = "Option key must not be blank")
    @Size(max = 100, message = "Length of option key must not be more than {max}")
    private String optionKey;


    @Size(max = 1023, message = "Length of option value must not be more than {max}")
    private String optionValue;
}
