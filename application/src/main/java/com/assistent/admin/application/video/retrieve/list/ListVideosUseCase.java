package com.assistent.admin.application.video.retrieve.list;

import com.assistent.admin.application.UseCase;
import com.assistent.admin.domain.pagination.Pagination;
import com.assistent.admin.domain.video.VideoSearchQuery;

public abstract class ListVideosUseCase
        extends UseCase<VideoSearchQuery, Pagination<VideoListOutput>> {
}
