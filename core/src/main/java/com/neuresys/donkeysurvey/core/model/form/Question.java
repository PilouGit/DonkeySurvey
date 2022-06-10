package com.neuresys.donkeysurvey.core.model.form;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Question {

	protected String uniqueCode;
	protected String name;
	protected TypedQuestion typedQuestion;
}
