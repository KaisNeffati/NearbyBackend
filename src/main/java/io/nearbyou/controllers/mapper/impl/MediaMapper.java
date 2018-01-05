package io.nearbyou.controllers.mapper.impl;

import io.nearbyou.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class MediaMapper {
    private final MediaService mediaService;

    @Autowired
    public MediaMapper(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    public String makeUri(File file) {
        return mediaService.uploadMedia(file);
    }

    public File getFile(String uri) {
        return mediaService.getFile(uri);
    }

    public List<String> makeUriList(List<File> files) {
        return files.stream().map(this::makeUri).collect(Collectors.toList());
    }

    public List<File> getFilesList(List<String> uriList) {
        return uriList.stream().map(this::getFile).collect(Collectors.toList());
    }
}
