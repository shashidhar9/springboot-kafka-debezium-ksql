package com.mycompany.researchservice.rest.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
public class CreateReviewDto {

    @ApiModelProperty(example = "1")
    @Positive
    private Long researcherId;

    @ApiModelProperty(position = 1, example = "1")
    @Positive
    private Long articleId;

    @ApiModelProperty(position = 2, example = "Ln 56: replace the 'a' by 'an'")
    @NotBlank
    private String comment;

}
