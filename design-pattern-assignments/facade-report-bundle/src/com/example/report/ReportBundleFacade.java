package com.example.report;

import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {

    private final JsonWriter jw;
    private final Zipper z;
    private final AuditLog log;

    public ReportBundleFacade() {
        jw = new JsonWriter();
        z = new Zipper();
        log = new AuditLog();

    }

    public Path export(Map<String, Object> data, Path outDir, String baseName) {

        Objects.requireNonNull(data, "data is null!");
        Objects.requireNonNull(outDir, "outDir ");
        Objects.requireNonNull(baseName, "name is null!");

        Path json = jw.write(data, outDir, baseName);
        Path zipPath = outDir.resolve(baseName + ".zip");
        Path zip = z.zip(json, zipPath);
        log.log("exported " + zip);

        return zip;

    }

    // 1. JSOn file - from given data - returns json path,
    // 2. Zipper - compress file to zip - return zip path
    // 3. AuditLog - records,
    // 4. return -path of zipFile,

}
