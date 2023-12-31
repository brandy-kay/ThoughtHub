package com.brandyodhiambo.ThoughtHub.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;


@Data
public class PhotoRequest {

	@NotBlank
	@Size(min = 3)
	private String title;

	@NotBlank
	@Size(min = 10)
	private String url;

	@NotBlank
	@Size(min = 10)
	private String thumbnailUrl;

	@NotNull
	private Long albumId;
}
