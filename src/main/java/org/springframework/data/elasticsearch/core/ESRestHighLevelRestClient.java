package org.springframework.data.elasticsearch.core;

import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.*;
import org.springframework.data.elasticsearch.client.util.RequestConverters;

import java.io.IOException;
import java.util.Collections;

public class ESRestHighLevelRestClient extends RestHighLevelClient {

	public ESRestHighLevelRestClient(RestClientBuilder restClientBuilder) {
		super(restClientBuilder, Collections.emptyList());
	}

	public final BulkResponse bulkOnSingleIndex(BulkRequest bulkRequest, RequestOptions options) throws IOException {
		return super.performRequestAndParseEntity(bulkRequest, RequestConverters::bulk, options, BulkResponse::fromXContent, Collections.emptySet());
	}
}
