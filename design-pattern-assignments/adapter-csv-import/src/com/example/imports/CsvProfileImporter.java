
package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    NaiveCsvReader naiveCsvReader;
    ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader naviecvs, ProfileService profileService) {
        this.naiveCsvReader = naviecvs;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csv) {

        List<String[]> profiles = naiveCsvReader.read(csv);
        int validRows = 0;

        for (String[] profile : profiles) {

            if (profile[0].equals("id")) {
                continue;
            }

            String id = profile[0];
            String email = profile[1];
            String displayName = profile[2];

            // validate
            if (profile[0] == null || profile[0].trim().isEmpty()) {
                System.out.println("Invalid id skipping row!");
                continue;
            }
            if (profile[1] == null || profile[1].trim().isEmpty() || !profile[1].contains("@")) {
                System.out.println("Invalid email-skkiped!");
                continue;
            }
            if (profile[2] == null || profile[2].trim().isEmpty()) {
                System.out.println("Invalid displayName -skkiped row");
                continue;
            }
            
            validRows++;
            profileService.createProfile(id, email, displayName);
        }

        return validRows;

    }

}
