package me.qinchao.web.service;

import org.lokra.seaweedfs.core.file.FileHandleStatus;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by sulvto on 9/30/18.
 */
public interface FileSystemService {
    public static final String DEFAULT_COLLECTION = "default";

    FileHandleStatus saveFile(MultipartFile file) throws IOException;

    FileHandleStatus saveFile(MultipartFile file, String collection) throws IOException;
}
