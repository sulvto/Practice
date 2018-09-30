package me.qinchao.web.service.impl;

import me.qinchao.web.service.FileSystemService;
import org.lokra.seaweedfs.core.FileTemplate;
import org.lokra.seaweedfs.core.file.FileHandleStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by sulvto on 9/30/18.
 */
@Service
public class FileSystemServiceImpl implements FileSystemService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileSystemServiceImpl.class);

    FileTemplate fileTemplate;

    @Autowired
    public FileSystemServiceImpl(FileTemplate fileTemplate) {
        this.fileTemplate = fileTemplate;
    }

    private void setCollection(String collection) {
        fileTemplate.setCollection(collection);
    }

    @Override
    public FileHandleStatus saveFile(MultipartFile file) throws IOException {
        return saveFile(file, DEFAULT_COLLECTION);
    }

    @Override
    public FileHandleStatus saveFile(MultipartFile file, String collection) throws IOException {
        setCollection(DEFAULT_COLLECTION);
        FileHandleStatus fileHandleStatus = fileTemplate.saveFileByStream(file.getName(), file.getInputStream());
        String fileUrl = fileTemplate.getFileUrl(fileHandleStatus.getFileId());
        LOGGER.debug("saved image. {}", fileUrl);
        return fileHandleStatus;
    }
}
