package io.nearbyou.service;

import java.io.File;

public interface MediaService {

    String uploadMedia(File file);

    File getFile(String uri);


}
