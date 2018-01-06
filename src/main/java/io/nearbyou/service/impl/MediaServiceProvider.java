package io.nearbyou.service.impl;

import com.mongodb.gridfs.GridFSDBFile;
import io.nearbyou.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MediaServiceProvider implements MediaService {

    private final GridFsTemplate gridFsTemplate;

    @Autowired
    public MediaServiceProvider(GridFsTemplate gridFsTemplate) {
        this.gridFsTemplate = gridFsTemplate;
    }

    @Override
    public String save(MultipartFile file) {
        String name = file.getOriginalFilename();
        String id = null;
        try {
            id = gridFsTemplate.store(file.getInputStream(), name, file.getContentType()).getId().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public byte[] loadById(String id) {
        GridFSDBFile gridFsdbFile = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(id)));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            gridFsdbFile.writeTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return os.toByteArray();
    }

}
