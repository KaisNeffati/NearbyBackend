package io.nearbyou.controllers.mapper.impl;

import io.nearbyou.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MediaMapper {
    private final MediaService mediaService;

    @Autowired
    public MediaMapper(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    public String save(MultipartFile file) {
        return mediaService.save(file);
    }

    public byte[] getFile(String id) {
        return mediaService.loadById(id);
    }

    public List<String> saveList(List<MultipartFile> files) {
        return files.stream().map(this::save).collect(Collectors.toList());
    }

    public List<byte[]> getFilesList(List<String> idList) {
        return idList.stream().map(this::getFile).collect(Collectors.toList());
    }
}
