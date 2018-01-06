package io.nearbyou.service;

import org.springframework.web.multipart.MultipartFile;

public interface MediaService {

    String save(MultipartFile file);

    byte[] loadById(String id);

}
