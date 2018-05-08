package org.ipfsbox.library.entity;

public class Version {
    /**
     * Version : 0.4.14
     * Commit :
     * Repo : 6
     * System : amd64/darwin
     * Golang : go1.10
     */

    private String Version;
    private String Commit;
    private String Repo;
    private String System;
    private String Golang;

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getCommit() {
        return Commit;
    }

    public void setCommit(String Commit) {
        this.Commit = Commit;
    }

    public String getRepo() {
        return Repo;
    }

    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    public String getSystem() {
        return System;
    }

    public void setSystem(String System) {
        this.System = System;
    }

    public String getGolang() {
        return Golang;
    }

    public void setGolang(String Golang) {
        this.Golang = Golang;
    }
}
