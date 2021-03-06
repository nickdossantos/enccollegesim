package com.endicott.edu.datalayer;

import java.io.File;
import java.util.logging.Logger;

/**
 * Created by abrocken on 7/20/2017. 
 */
public class DaoUtils {
    private String REST_SERVICE_URL = "http://localhost:8080/College_sim3_war_exploded/finances";
    private static Logger logger = Logger.getLogger("DaoUtils");

    static public String getFilePathPrefix(String runId) {
        return getCollegeStorageDirectory() + File.separator + runId;
    }

    static private String getCollegeStorageDirectory() {
        String collegeDir = System.getenv("SystemDrive")+ File.separator +"collegesim";
        new File(collegeDir).mkdirs();
        return collegeDir;
    }
}
