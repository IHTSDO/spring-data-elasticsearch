package org.springframework.data.elasticsearch.core;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class SearchAfterPageRequest extends PageRequest {

	private final Object[] searchAfter;

	public SearchAfterPageRequest(Object[] searchAfter, int size, Sort sort) {
		super(0, size, sort);
		this.searchAfter = searchAfter;
	}

	public static SearchAfterPageRequest of(Object[] searchAfter, int size, Sort sort) {
		return new SearchAfterPageRequest(searchAfter, size, sort);
	}

	public Object[] getSearchAfter() { return this.searchAfter; }
}
